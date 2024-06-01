public class ReverseWordInAString {
  public String reverseWords(String s) {
    char[] str = s.toCharArray();
    char[] res = new char[s.length() + 1];
    int i = s.length() - 1;
    int j;
    int k = 0;
    while (i >= 0) {
        while (i >= 0 && str[i] == ' ')
            i--;
        if (i < 0)
            break;
        j = i;
        while (i >= 0 && str[i] != ' ')
            i--;
        for (int x = i + 1; x <= j; x++) {
            res[k++] = str[x];
        }
        res[k++] = ' ';
    }
    return new String(res, 0, k - 1);
}
}
