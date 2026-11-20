public class FindRepeats {
    public int numberOfRepeats(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        int count = 0;
        while (text.contains(substring)) {
            count++;
            int index = text.indexOf(substring);
            int newStartIndex = index + substring.length();
            text = text.substring(newStartIndex);
        }
        return count;
    }
}
