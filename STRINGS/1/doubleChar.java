// Given a string, return a string where for every char in the original, there are two chars.


// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"

public String doubleChar(String str) {
  StringBuilder s = new StringBuilder(str.length()*2);
  for(int i=0;i<str.length();i++){
    char ch = str.charAt(i);
    s.append(ch).append(ch);
  }
  
  return s.toString();
}
