package Sheet1;

public class StringEssence {
  public static void main(String[] args) {
    String ActualString = "Uaae caen doy ita";
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    StringBuilder NoVowelString = new StringBuilder();
    for(char c : ActualString.toCharArray()){
      if(!isVowel(c, vowels)){
        NoVowelString.append(c);
      }
    }
    System.out.println(NoVowelString.toString());
  }

  private static boolean isVowel(char c, char[] vowels){
    for(char v : vowels){
      if(Character.toLowerCase(v) == Character.toLowerCase(c)){
        return true;
      }
    }
    return false;
  }
}
