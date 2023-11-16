public class switch1{
public static void main(String[]args){
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good job!");
        break;
    case 'C':
        System.out.println("Satisfactory");
        break;
    default:
        System.out.println("Needs improvement");
}}}
