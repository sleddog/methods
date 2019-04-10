from scipy.stats import norm
from math import *
from flask import Flask
from flask import jsonify
application = Flask(__name__)


@application.route('/')
def home():
    return "This is the homepage for some finance related services"
    
@application.route('/bsm/otype=<otype>&S=<S>&K=<K>&tm=<tm>&r=<r>&d=<d>&sig=<sig>')
def bsm(otype,S,K,tm,r,d,sig):
    S,K,tm,r,d,sig = float(S),float(K),float(tm),float(r),float(d),float(sig)
    d1 = (log(float(S)/K)+((r-d)+sig*sig/2.)*tm)/(sig*sqrt(tm))
    d2 = d1-sig*sqrt(tm)
    if otype=='c':
        o_pay = S*exp(-d*tm)*norm.cdf(d1)-K*exp(-r*tm)*norm.cdf(d2)
    elif otype == 'p':
        o_pay = K*exp(-r*tm)*norm.cdf(-d2)-S*exp(-d*tm)*norm.cdf(-d1)
    else:
        return "Not a valid option type"
    return jsonify(CallPutFlag=otype, Price=S, Strike=K, time=tm, interest_rate=r, dividend_yield=d, volatility=sig, Option_Price=o_pay)

if __name__ == "__main__":
    application.run(host="0.0.0.0", port=8080)
