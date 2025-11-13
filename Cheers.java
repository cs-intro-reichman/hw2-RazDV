//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        String shout = args[0];
                int repeat = Integer.parseInt(args[1]);
                String AnA = "A";
                String anCauser = "AEFHILMNORSX";

                for (int i = 0; i < shout.length(); i++) {
                        char iChar = shout.charAt(i);
                        if (anCauser.indexOf(iChar) != -1)
                        AnA = "an";
                        else 
                        AnA = "a ";
                        System.out.println("Give me " + AnA + " " + iChar + ": " + iChar + "!");
                }
                
                System.out.println("What does that spell?");

                for (int i = 0; i < repeat; i++) {
                        System.out.println(shout + "!!!");
                }
        }
}
