import json

print('Loading function')


def lambda_handler(event, context):
    OUTPUT_TARGET = "body"

    if 'queryStringParameters' not in event:
        return {OUTPUT_TARGET: "No parameters provided. Please provide a maximum number and at least one rule"}

    params = event['queryStringParameters']

    if 'max' in params.keys():
        max = params.pop('max')
    else:
        return {OUTPUT_TARGET: "No maximum value provided"}

    output = ""

    for i in range(1, int(max) + 1):
        temp = ""
        for divisor, result in params.items():
            if i % int(divisor) == 0:
                temp += result
        if temp == "":
            temp += str(i)
        output += temp + "\n"

    return {OUTPUT_TARGET: output}