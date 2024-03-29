package net.danh.rpgdore.Manager;

import java.text.DecimalFormat;

public class Number {
    private static final String[] suffix = new String[]{"", "K", "M", "B", "T", "Q"};
    private static final int MAX_LENGTH = 4;

    public static String format(double number) {
        String r = new DecimalFormat("##0E0").format(number);
        r = r.replaceAll("E[0-9]", suffix[Character.getNumericValue(r.charAt(r.length() - 1)) / 3]);
        while (r.length() > MAX_LENGTH || r.matches("[0-9]+\\.[a-z]")) {
            r = r.substring(0, r.length() - 2) + r.substring(r.length() - 1);
        }
        return r;
    }
}
