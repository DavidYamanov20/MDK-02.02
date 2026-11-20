public class CleanInput {
    public String fixString(String str) {
        if (str == null || str.trim().isBlank()) {
            return "Вы ничего не ввели!";
        }
        String trimmed = str.trim();
        return trimmed;
    }
}
