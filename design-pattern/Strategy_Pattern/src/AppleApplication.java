import model.Apple;
import model.Color;
import predicate.AppleFancyFormatter;
import predicate.AppleFormatter;
import predicate.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.List;

public class AppleApplication {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(Color.GREEN, 100));
        appleList.add(new Apple(Color.RED, 160));

        prettyPrintApple(appleList, new AppleFancyFormatter());
        prettyPrintApple(appleList, new AppleSimpleFormatter());
    }

    private static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple: inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
