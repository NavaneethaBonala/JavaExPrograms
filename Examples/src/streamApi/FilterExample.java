package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample 
{
    public static void main(String[] args) 
    {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi");

        // Use the filter method to keep only fruits that start with the letter 'A'
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Filtered Fruits: " + filteredFruits);
    }
}

