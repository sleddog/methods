public class Game{
    //the solution (meat) of the problem
    public void fizz(int n){
        //start from the bottom
        int currNum = 1;
        //go to n
        for(currNum = 1; currNum <= n; currNum++){
            System.out.println(out(currNum));
        }
        //give it some space
        System.out.println();
    }

    //line by line answer
    protected String out(int currNum){
        String out = "";

            out = out.concat(three(currNum));
            
            out = out.concat(five(currNum));  
            
            out = out.concat(seven(currNum));
            
            if(out.isEmpty()){
                out = String.valueOf(currNum);
            }

            //answer
            return out;
    }

    //divisible by 3
    private String three(int num){
        if(num%3 == 0){
            return "Fizz";
        }
        return "";
    }

    //divisible by 5
    private String five(int num){
        if(num%5 == 0){
            return "Buzz";
        }
        return "";
    }
    
    //divisible by 7
    private String seven(int num){
        if(num%7 == 0){
            return "Bazz";
        }
        return "";
    }
}