import datetime

def hello_world(input):
    #return "hello world" + input
    now = datetime.datetime.now()
    data = {
        'hello': input,
        'now': str(now)
    }
    return data
