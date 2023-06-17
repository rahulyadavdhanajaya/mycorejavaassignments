package Week1;

public class Argument {
    public static void main(String[] args) {
        //PROGRAM FINDS WHETHER THERE IS A COMMAND LINE AGRGUMENT OR NOT AND SEPERATES BY COMMA
        if (args.length ==0)
        {
            System.out.println("mumbai");
        }
        else {
            for(int i = 1; i < args.length; ++i) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(" " );

        }
    }
    }
}}
