package imiona_imiona2_duze_litery;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Daniel", "Magdalena", "Krzysztof", "Iga", "Iza", "Stanisław");

        List<String> imiona1 = imiona.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        imiona1.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);
    }
}
