package lab_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Привет", "Как дела?", "Привет как дела?");
        System.out.println(searchString(list,"Привет"));
    }
    public static List<String> searchString(List<String> list, String string){
        return list.stream()
                .filter(s -> s.contains(string))
                .collect(Collectors.toList());
    }
}
