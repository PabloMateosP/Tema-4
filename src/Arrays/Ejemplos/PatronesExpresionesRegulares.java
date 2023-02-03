package Arrays.Ejemplos;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatronesExpresionesRegulares {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("Pa.*");
        Matcher m = p.matcher("Pa0a");
        System.out.println(m.matches());

        System.out.println(Arrays.toString("Hola me llamo Pablo".split("")));
        System.out.println("Pa".matches("^Pa"));
    }
}
