import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("text one two");
        arrayList.add("three text four");
        arrayList.add("five six seven");
        System.out.println(getElementsByWord(arrayList, "text"));
    }
    public static ArrayList <String> getElementsByWord(ArrayList <String> arrayList, String word) {
       return (ArrayList<String>) arrayList.stream().filter(a -> a.toLowerCase().contains(word.toLowerCase())).collect(Collectors.toList());
    }
}
