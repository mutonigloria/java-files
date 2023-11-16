public class doloop2{
public static void main(String[]args){
int j = 0;
do {
    System.out.println("This is an infinite loop.");
    j++;
    if (j == 3) {
        break;
    }
} while (true);}}