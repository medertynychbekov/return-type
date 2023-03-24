import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String text = "My name is Meder";

        System.out.println(text);
//                      text + " Tynychbekov"
        String newText = text.concat(" Tynychbekov");

        System.out.println(text + " Tynychbekov");
        System.out.println(newText);

    }


}