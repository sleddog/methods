exports.handler = function(event, context, callback) {
    console.log('Received event:', JSON.stringify(event, null, 2));
    if (event.a === undefined || event.b === undefined || event.op === undefined) {
        callback("400 Invalid Input");
    }

    var answer = {};
    answer.operand1 = Number(event.a);
    answer.operand2 = Number(event.b);
    answer.operator = event.op;

    if (isNaN(event.a) || isNaN(event.b)) {
        callback("400 Invalid Operand");
    }

    switch(event.op)
    {
        case "+":
        case "addition":
            answer.c = answer.operand1 + answer.operand2;
            break;
        case "-":
        case "subtraction":
            answer.c = answer.a - answer.b;
            break;
        case "*":
        case "multiplication":
            answer.c = answer.operand1 * answer.operand2;
            break;
        default:
            callback("400 Invalid Operator");
            break;
    }
    callback(null, answer);
};
