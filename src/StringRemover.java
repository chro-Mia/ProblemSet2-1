import java.util.Scanner;
public class StringRemover
{
    public static void main (String[] args){

        int pointer;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string1 = input.nextLine();
        System.out.println("Enter a shorter string to remove from the first string: ");
        String string2 = input.nextLine();

        //"error" checking loop
        //blah blah blah shut up, mr kraut wants me to use indexOf()
        while(string1.indexOf(string2) == -1){
            System.out.println("That substring wasn't found in the first string!" +
                    "\nEnter a shorter string to remove from the first string: ");
            string2 = input.nextLine();
        }

        /*
        step 1: print the substring containing the characters from index 0 to the index of the first instance of string2
        step 2: set the pointer to the index of the character after the first instance of string2
        step 3: set string1 to a substring from the pointer to the end of the string
        step 4: if no string2 is found within string1, print the rest of string1 and exit the loop
        step 5: repeat
        */
        while(true){

            System.out.print(string1.substring(0, string1.indexOf(string2)));
            pointer = string1.indexOf(string2) + string2.length();
            string1 = string1.substring(pointer);

            if(string1.indexOf(string2) == -1){
                System.out.print(string1);
                break;
            }
        }
    }
}
