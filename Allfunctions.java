public class Allfunctions {
    public static void main(String[] args) {
        String a="Rahul";
        int length=a.length();
        System.out.println("Lenth of string:"+length);
        char charAt=a.charAt(3);
        System.out.println("character at index:"+charAt);
        int indexof=a.indexOf('l');
        System.out.println("Character at index:"+indexof);
        int lastIndexOf=a.lastIndexOf('h');
        System.out.println("Character at lastIndexOf:"+lastIndexOf);
        String toUpperCase= a.toUpperCase();
        System.out.println("string in toUpperCase:"+toUpperCase);
        String toLowerCase= a.toLowerCase();
        System.out.println("string in toLowerCase:"+toLowerCase);
        String replace=a.replace('h','g');
        System.out.println("String is replace:"+replace);
        String concat=a.concat(" Mohammad");
        System.out.println("String is concat:" +concat);

    }
    
}
