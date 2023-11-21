class break2 {
    public static void main(String[] args) {
   
        // the for loop is labeled as first   
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
             
                // the break statement breaks the first for loop
                if ( i == 2)
                    break first;
            }
        }
    }
}
Run Code
Output:

i = 1; j = 1
i = 1; j = 2
i = 2; j = 1
In the above example, the labeled break statement is used to terminate the loop labeled as first. That is,

first:
for(int i = 1; i < 5; i++) {...}
Here, if we change the statement break first; to break second; the program will behave differently. In this case, for loop labeled as second will be terminated. For example,

class LabeledBreak {
    public static void main(String[] args) {
      
        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {

                System.out.println("i = " + i + "; j = " +j);
       
                // the break statement terminates the loop labeled as second   
                if ( i == 2)
                    break second;
            }
        }
    }
}