package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    private final String str;

    public ReversedSequence(String str) {

        int i = str.length() - 1;
        StringBuilder reverseStr = new StringBuilder();
        while (i >= 0) {
            reverseStr.append(str.charAt(i));
            i--;
        }
        this.str = reverseStr.toString();
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return str.subSequence(start, end);
    }

    @Override
    public String toString() {
        return str;
    }
}
// END
