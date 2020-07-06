package by.halatsevich.locale.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleMain {
    public static void main(String[] args) {
        System.out.println("1 - en\n2 - fr\nany - default");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "GB";
                language = "en";
                break;
            case '2':
                country = "CA";
                language = "fr";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle bundle = ResourceBundle.getBundle("text", current);
        String str1 = bundle.getString("str1");
        String str2 = bundle.getString("str2");
        System.out.println(str1);
        System.out.println(str2);
    }
}
