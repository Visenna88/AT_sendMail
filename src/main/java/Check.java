import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Check {

    public static void main(String[] args) {
        int length = 8;
        String digits = "0123456789";
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + digits;
        Random rnd = new Random();
        List<String> result = new ArrayList<>();
        Consumer<String> appendChar = s ->
                result.add("" + s.charAt(rnd.nextInt(s.length())));
        appendChar.accept(digits);
        while (result.size() < length)
            appendChar.accept(all);
        Collections.shuffle(result, rnd);
        String topic = String.join("", result);
        System.out.println(topic);

        int length2 = 40;
        String digits2 = "0123456789";
        String all2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + digits2;
        Random rnd2 = new Random();
        List<String> result2 = new ArrayList<>();
        Consumer<String> appendChar2 = s ->
                result2.add("" + s.charAt(rnd2.nextInt(s.length())));
        appendChar.accept(digits2);
        while (result2.size() < length2)
            appendChar2.accept(all2);
        Collections.shuffle(result2, rnd2);
        String text = String.join("", result2);
        System.out.println(text);

         List<String> textCheck = new ArrayList<>(Arrays.asList(text));
         System.out.println(textCheck.contains(text));



    }
}
