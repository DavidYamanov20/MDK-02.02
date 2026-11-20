public class Capitalizator {
    public String capitalize(String str) {
        // Защита от null и пустых строк, чтобы не получить ошибку
        if (str == null || str.isEmpty()) {
            return str;
        }
        String firstChar = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1);
        return firstChar + restOfString;
    }
}
