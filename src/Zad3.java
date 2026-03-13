public class Zad3 {
    public void rleCompression(String word) {
        char letter;
        int howManyLetters;
        char[] lettersArray = word.toCharArray();
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < lettersArray.length; i++) {
            howManyLetters = 1;
            letter = lettersArray[i];

            while (i+1 < lettersArray.length) {
                if(lettersArray[i] == lettersArray[i+1]) {
                    howManyLetters++;
                    i++;
                } else {
                    break;
                }
            }

            stringBuilder.append(howManyLetters);
            stringBuilder.append(letter);
            result = stringBuilder.toString();

        }

        System.out.println(result);
    }

    void main(String[] args) {
        String word = "wwwggopp";
        rleCompression(word);

        String word2 = "aabbcdeasdadaaaaaaaasssssssdddd";
        rleCompression(word2);
    }
}