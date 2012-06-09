package br.com.facdombosco.progc.framework.utils;

/**
 *
 * @author msantos
 */
public class StringUtils {
    public static boolean isNullOrEmpty(String value) {
        return value.equals(null) || value.isEmpty();
    }

    public static String convertToDoubleForm(String value) {
        return value.replace('.', ',');
    }

    public static String convertToDoubleDatabase(String value) {
        return value.replace(',', '.');
    }

    public static boolean isNumeric(String text) {
        try {
            Double numero = Double.parseDouble(text.trim());
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }

}
