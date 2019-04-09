import json

print('Loading function')


def lambda_handler(event, context):
    if 'queryStringParameters' not in event:
        return response("400", "No parameters provided. Please provide a maximum number and at least one rule")

    params = event['queryStringParameters']

    if 'max' in params.keys():
        max = params.pop('max')
    else:
        return response("400", "No maximum value provided")

    output = ""

    for i in range(1, int(max) + 1):
        temp = ""
        for divisor, result in params.items():
            if i % int(divisor) == 0:
                temp += result
        if temp == "":
            temp += str(i)
        output += temp + "\n"

    return response("200", output)

def response(status_code, body):
    resp = {"statusCode": status_code,
            "body": body}