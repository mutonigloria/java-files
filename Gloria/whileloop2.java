public class whileloop2{
public static void main(String[]args){
int j = 0;
while (true) {
    System.out.println("This is an infinite loop.");
    j++;
    if (j == 3) {
        break;
    }
}}}