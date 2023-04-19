package strings;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Tendulkar";
        // Methods in String class

        //public char chaAt(int index)
        char c = s1.charAt(2);
        System.out.println("Character at index 2 of string s1 " +c);

        //public String concat(String s)
        String s3 = s1.concat(s2);
        System.out.println("concat method "+s3);

        //public boolean equalsIgnoreCase(String s)
        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println("boolean value of equalsIgnoreCase " +b);

        //public int length();
        int l = s2.length();
        System.out.println("length of s2 string " +l);

        //public String toString();
        String ss = "sachin tendulkar";
        System.out.println("value od string " +ss.toString());

        //public string trim();
        String s6 = "  hi  ";
        System.out.println("trim of s6 " +s6);

        //public String replace(char oldChar, char newChar):
        String rp = s1.replace('c','C');
        System.out.println("character replaced "+rp);

        //public string lowercase()/uppercase();
        String s4 = s1.toLowerCase();
        String s5 = s2.toUpperCase();
        System.out.println("lowercase " +s4);
        System.out.println("uppercase " +s5);
        //public string substring();
        System.out.println("substring of ss "+ss.substring(6));
        System.out.println("substring of ss " +ss.substring(2,6));

        StringBuffer sb = new StringBuffer("sachin");
        sb.append("tendulkar");
        System.out.println("append method " +sb);

        sb.delete(2,5);
        System.out.println("delete method "+sb);
        sb.reverse();
        System.out.println("reverse method "+sb);



    }

}
