public class CustomStringMethods {

    /* this class has no instance variables */

    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */
    public CustomStringMethods() { }

// WRITE AND TEST THE METHODS BELOW

    /* Client provides myString and maxLength and method returns true if the length of myString
              exceeds maxLength, and returns false otherwise.

               Example:  If myString is apples and maxLength is 5, this method returns true.
               Example:  If myString is apples and maxLength is 6, this method returns false.
        */
    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength) {
            return (true);
        }else {
            return (false);
        }
    }

    /* Client provides str and idx and method returns a new String created by appending
              the character located at index idx of str to the beginning of str and the end of str

               Example:  If str is apples and idx is 4, this method returns the string eapplese
               Example:  If str is apples and idx is 0, this method returns the string aapplesa
     */

    public String funnyString(String str, int idx) {
        String letter = str.substring(idx, idx + 1);
        return(letter + str + letter);
    }

    /**Client provides myString and the method returns a String that represents mystring
     with its halves reversed; strings of odd length should have the extra character be a part
     of the second half when initially halved (and appear in the first half in the returned String).

     Example:  If myString is computers, this method should return the string uterscomp
     Example:  If myString is "reverse me!", this method should return "e me!revers";
     */
    public String halvesReversed(String myString) {
        int start = myString.length()/2;
        String secondHalf = myString.substring(start);
        String firstHalf = myString.substring(0,start);
        return(secondHalf + firstHalf);
    }
    /* Client provides a single word as orig and the method returns a String that represents orig
            written in “Pig Latin”, which means that the first letter of the word is removed from the front and
            added to the end, and then “ay” is appended.

             Example:  If orig is bananas, then the method returns the “Pig Latin” version, ananasbay
  */
    public String pigLatin(String orig) {
        String newWord = orig.substring(1);
        String firstLetter = orig.substring(0,1);
        return(newWord + firstLetter + "ay");
    }

    /**Client provides myString and removeIdx and method returns a new String with the character
     located at removeIdx in myString removed.  If removeIdx is outside the bounds of myString,
     the method should return myString unchanged.

     Example:  If myString is "Halloween" and removeIdx is 5, this method should the string
     "Halloeen"
     Example:  If myString is "Halloween" and removeIdx is 0, this method should the string
     "alloween"
     Example:  If myString is "Halloween" and removeIdx is 9 (outside the bounds of myString),
     this method should return the string "Halloween" (the original myString unchanged).
     */
    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx != 0){
            String word = myString.substring(removeIdx + 1,myString.length());
            String word2 = myString.substring(0,removeIdx);
            return(word2 + word);
        }
        else {
            return(myString.substring(1));
        }
    }

    /**Client provides orig, insertText, and searchStr, and the method returns a new String where
     insertText has been inserted into orig starting at the index where searchStr is first found in
     orig, "pushing” all characters that come after insertIdx in orig behind insertText.
     In the event insertText is not found in orig, append insertText onto the end of orig and
     return that String.

     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "o",
     this method would return the String "ghBOO!ost" (since in orig, searchStr is found at index 2).
     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "st",
     this method would return the String "ghoBOO!st" (since in orig, searchStr is found at index 3).
     Example:  If myString is "ghost", insertText is  "BOO!", and searchStr is "m",
     this method would return the String "ghostBOO!" (since searchStr is not found in orig).
     */
    public String insertAt(String orig, String insertText, String searchStr) {

    }

    /**Client provides myString and the method returns a new String with the last numToCap characters in
     uppercase, if not already; if myString has less than numToCap characters, uppercase the entire
     String. Any punctuation marks at the end should count towards numToCap.

     Example:  If myString is "hello" and numToCap is 3, this method returns the String  "heLLO"
     Example:  If myString is "hello" and numToCap is 6, this method returns the String  "HELLO"
     Example:  If myString is "Gigantic" and numToCap is 3, this method returns the String
     "GiganTIC"
     Example:  If myString is "Gigantic!!" and numToCap is 3, this method returns the String
     "GigantiC!!"
     */
    public String endUp(String myString, int numToCap){

    }

    /**Client provides myString and this method should return a String with all characters in myString
     in uppercase if the first letter of myString is an uppercase letter.  If the first letter of myString is a
     lowercase letter, this method should return a String with all characters in myString in lowercase.
     You can assume myString will always begin with a letter (and not a number or some other character).

     Example:  If myString is "Hello James!", this method returns the String  "HELLO JAMES!"
     because the first letter of myString , "H", is an uppercase letter.
     Example:  If myString is "hello James!", this method returns the String  "hello james!"
     because the first letter of myString, "h", is a lowercase letter.
     */
    public String yellOrWhisper(String myString) {

    }
}


