import java.util.Arrays;
import java.util.List;

import q1.Converter;

public class Executer {

    private static List<String> q1Test = Arrays.asList("speech", "wolf", "party", "computer");

    public static void main(String[] args) {

        ///////////////////////////////////
        //Question1
        Converter q1Converter = new Converter();
        System.out.println("///////////////////Question1 START///////////////////");
        q1Test.stream().forEach(testData -> System.out.println(q1Converter.toPluralForm(testData)));
        System.out.println("///////////////////Question1 END///////////////////");
    }
}
