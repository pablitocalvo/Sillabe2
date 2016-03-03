package org.example.sillabe2;

/**
 * Created by paolo on 03/03/16.
 */
import java.util.Random;

/**
 * Created by paolo on 03/03/16.
 */
public class Fonemi {
    static final String[] VOCALI = {"a", "e", "i", "o", "u"};
    static final String[] FONEMI_B = {"ba", "be", "bi", "bo", "bu"};
    static final String[] FONEMI_C = {"ci", "ce",};
    static final String[] FONEMI_CH = {"ca", "che", "chi", "co", "cu"};
    static final String[] FONEMI_D = {"da", "de", "di", "do", "du"};
    static final String[] FONEMI_F = {"fa", "fe", "fi", "do", "fu"};
    static final String[] FONEMI_G = {"ge", "gi"};
    static final String[] FONEMI_GH = {"ga", "ghe", "ghi", "go", "gu"};
    static final String[] FONEMI_L = {"la", "le", "li", "lo", "lu"};
    static final String[] FONEMI_M = {"ma", "me", "mi", "mo", "mu"};
    static final String[] FONEMI_N = {"na", "ne", "ni", "no", "nu"};
    static final String[] FONEMI_P = {"pa", "pe", "pi", "po", "pu"};
    static final String[] FONEMI_R = {"ra", "re", "ri", "ro", "ru"};
    static final String[] FONEMI_S = {"sa", "se", "si", "so", "su"};
    static final String[] FONEMI_T = {"ta", "te", "ti", "to", "tu"};
    static final String[] FONEMI_V = {"va", "ve", "vi", "vo", "vu"};
    static final String[] FONEMI_Z = {"za", "ze", "zi", "zo", "zu"};



    protected static final String[] FONEMI_ALL = unisciTutto();


    private static String[] unisciTutto() {
        String[] ris = new String[0];
        ris = unisci(ris, VOCALI);
        ris = unisci(ris, FONEMI_B);
        ris = unisci(ris, FONEMI_C);
        ris = unisci(ris, FONEMI_CH);
        ris = unisci(ris, FONEMI_D);

        return ris;
    }

    public static String[] unisci(String[] a, String[] b) {
        int length = a.length + b.length;
        String[] result = new String[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static String fonemaCasuale(String[] da) {
        Random r = new Random();
        int i = r.nextInt(da.length - 1);
        return da[i];
    }

    public static String fonemaCasuale() {
        return fonemaCasuale(FONEMI_ALL);
    }


}