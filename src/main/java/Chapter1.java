import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class Chapter1 {

    //todo:P01
    public  Map<Character,Integer> CountingDublicateCharacters(String text){

        Map<Character,Integer> count=new Hashtable<>();

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);

            count.compute(ch,(k,v)->(v==null)? 1:++v);

        }

        return count;
    }

    //todo:P03
    public  String reversingLetters(String word){

        String text1=flip(word.substring(0,word.length()/2+1));
        String text2=flip(word.substring(word.length()/2+1));

        return text2+text1;

    }
    private  String flip(String word){
        String aux="";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            aux = aux + ch;
        }
        return aux;
    }
    private String reversingLettersAndWords(String text){
        String[] words=text.split(" ");

        String aux="";
        for(int i=0;i< words.length;i++){
            aux=aux+reversingLetters(words[i])+" ";
        }
        return aux.substring(0,aux.length()-1);
    }

    //todo:P04
    public   boolean onlyDigits(String text){
        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i))==false){
                return false;
            }
        }
        return true;
    }

    //todo:P05
    public  void vowelsAndConsonants(String text){
        String vowels="aeiouAEIOU";
        int nrVowels=0;
        int nrCons=0;

        for(int i=0;i<text.length();i++){
            String ch="";
            ch+=text.charAt(i);
            if(vowels.contains(ch)){
                nrVowels++;
            }else if(vowels.contains(ch) && Character.isAlphabetic(text.charAt(i))==true){
                nrCons++;
            }
        }
        System.out.println("The number of vowels is "+nrVowels);
        System.out.println("The number of consonants is "+nrCons);
    }

    //todo:P06
    public  int occurrencesOfACertainCharacter(char ch, String text){

        int occurrences=0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)==ch){
                occurrences++;
            }
        }
        return occurrences;
    }

    //todo:P07
    public   void convert(String text){

        int text1=Integer.parseInt(text);
        float text2=Float.parseFloat(text);
        long text3=Long.parseLong(text);
        double text4=Double.parseDouble(text);


    }

    //todo:P08
    public  String removingWhiteSpaces(String text) {

        String[] words = text.split(" ");
        text = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>0) {
                text += words[i];
                text += " ";
            }

        }
        return  text.substring(0,text.length()-1);
    }

    //todo:P09
    public  String joiningStrings(){
        String text=String.join(" ","this","is","an","example");
        return text;
    }

    //todo:P10
    public  void permutations(String text){
        permutations1("",text);

    }
    private void permutations1(String prefix,String text){

        int n=text.length();

        if(n==0){
            System.out.println(prefix);
        }else{
            for(int i=0;i<n;i++){
                permutations1(prefix+text.charAt(i),text.substring(i+1,n)+text.substring(0,i));
            }
        }

    }


    //todo:P11
    private  String palindrome(String text){
        String palindrom="";
        for(int i=text.length()-1;i>=0;i--){
            palindrom+=text.charAt(i);
        }
        return palindrom;
    }
    public  boolean isPalindrome(String text){
        return text.equals(palindrome(text));
    }

    //todo:P12
    public  String removingDublicateCharacters(String text){
        for(int i=0;i<text.length()-1;i++){
            if(text.charAt(i)==text.charAt(i+1)){
                text=text.substring(0,i)+text.substring(i+1);
                i--;
            }
        }
        return text;

    }


    //todo:P13
    public  String removingAGivenCharacter(char ch,String text){
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==ch){
                text=text.substring(0,i)+text.substring(i+1);
                i--;
            }
        }
        return text;
    }

    //todo:P14
    private  int apperance(char ch,String text){
        int ap=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==ch){
                ap++;
            }
        }
        return ap;
    }
    public  char characterWithMostApparances(String text){

        char chMax=text.charAt(0);
        int max=apperance(chMax,text);

        for(int i=1;i<text.length();i++){

            if(apperance(text.charAt(i),text)>max){
                chMax=text.charAt(i);
                max=apperance(text.charAt(i),text);
            }

        }
        return chMax;
    }

    //todo:P15
    public  void sortingAnArrayOfStrings(String[] array){
        int flag;
        do{
            flag=1;
            for(int i=0;i<array.length;i++){
                if(array[i].length()>array[i+1].length()){
                    String aux=array[i];
                    array[i]=array[i+1];
                    array[i+1]=aux;
                    flag=0;
                }
            }
        }while(flag==0);
    }

    //todo:P16
    public boolean stringContainsSubstring(String text,String sub){

        return text.contains(sub);
    }

    //todo:P17
    public  int countingSubstrings(String text,String sub){

        int count=0;
        int n=sub.length();
        for(int i=0;i<text.length()-3;i++){
            String aux=text.substring(i,i+n);
            if(aux.equals(sub)){
                count++;
            }
        }
        return count;
    }

    //todo:P18
    public  boolean anagrams(String text1, String text2){


        int[] characters=new int[256];

        text1=text1.toLowerCase();
        text2=text2.toLowerCase();


        text1=removingAGivenCharacter(' ',text1);
        text2=removingAGivenCharacter(' ',text2);


        char[] str1=text1.toCharArray();
        char[] str2=text2.toCharArray();

        if(text1.length()!=text2.length()){
            return false;
        }

        for(int i=0;i<str1.length;i++){
            characters[str1[i]]++;
            characters[str2[i]]--;

        }

        for(int i=0;i<characters.length;i++){
            if(characters[i]!=0){
                return false;
            }
        }

        return true;

    }

    //todo:P19
    public  void declaringMultipleStrings(){
        String text=String.join(System.lineSeparator(),"My name is ","The same as yours");
        System.out.println(text);
    }

    //todo:P20
    public  String concatenatingNTimes(int n,String text){
        String concatText= String.join("", Collections.nCopies(n,text));

        return  concatText;
    }

    //todo:P21
    public  String deletingTrailingAndLeadingSpaces(String text){
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                text=text.substring(0,i)+text.substring(i+1);
                break;
            }
        }


        for(int i=text.length()-1;i>=0;i--){
            if(text.charAt(i)==' '){
                text=text.substring(0,i)+text.substring(i+1);
                break;
            }
        }

        return text;
    }

    //todo:P22
    public  String longestCommonPrefix(String text){
        String [] words=text.split(" ");
        int firstL=words[0].length();

        for(int i=0;i<firstL;i++){

            char prefix=words[0].charAt(firstL);

            for(int j=1;j< words.length;j++){
                if(firstL>=words[i].length() || words[i].charAt(i)!=prefix){
                    return words[i].substring(0,firstL);
                }
            }
        }
        return words[0];
    }
}
