public class doloop1{
public static void main(String[]args){
String text = "Hello, World!";
int index = 0;

do {
    System.out.println(text.charAt(index));
    index++;
} while (index < text.length());}}