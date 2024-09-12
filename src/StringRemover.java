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

        //blah blah blah shut up, mr kraut wants me to use indexOf()
        while(string1.indexOf(string2) > -1){

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
