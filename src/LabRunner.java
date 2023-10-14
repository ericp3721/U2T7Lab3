public class LabRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        boolean bool = methods.longerThan("blue", 3);
        System.out.println(bool);
        String str = methods.funnyString("aqua", 1);
        System.out.println(str);
        str = methods.halvesReversed("green");
        System.out.println(str);
        str = methods.pigLatin("gold");
        System.out.println(str);
        str = methods.removeCharacter("black", 0);
        System.out.println(str);
        str = methods.insertAt("red", "er!", "d");
        System.out.println(str);
        str = methods.endUp("brown", 3);
        System.out.println(str);
        str = methods.yellOrWhisper("Rainbow!");
        System.out.println(str);


    }
}
