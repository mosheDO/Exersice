public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuffer spinedSentence = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            String reverseWord = words[i];
            if (words[i].length() >= 5) {
                reverseWord = reverseWord(words[i]);
            }
            spinedSentence.append(reverseWord);
            int lastWord = words.length - 1;
            if (i != lastWord) {
                spinedSentence.append(" ");
            }
        }

        return spinedSentence.toString();
    }

    private String reverseWord(String word) {
        StringBuilder wordForSpin = new StringBuilder(word);
        return wordForSpin.reverse().toString();
    }
}