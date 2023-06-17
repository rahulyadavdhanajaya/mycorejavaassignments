package Week1;

public class Assignment7 {
    public static void main(String[] args) {
        char ch='M';
        if (Character.isLowerCase(ch))
        {
            System.out.println(ch+"->"+Character.toUpperCase(ch));}
            else {
            System.out.println(ch+"->"+Character.toLowerCase(ch));
        }
    }
}
