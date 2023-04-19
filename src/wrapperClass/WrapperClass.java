package wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 100;
        double d = 12.9;
        float f = 128.3f;
        char c = 'a';
        /* converting primitive data type to object type */
        Integer intObj = i;    //boxing
        Double doubleObj = d;   //boxing
        Float floatObj= f;      //boxing
        Character charObj = c;  //boxing

        System.out.println("Integer object value int Object  " + intObj);
        System.out.println("double object value double Object " + doubleObj);
        System.out.println("float object value float Object " + floatObj);
        System.out.println("Character object value char Object " + charObj);

        /* converting wrapper class object to primitive data type */
        int i1 = intObj.intValue();//unboxing
        double d1 = doubleObj.doubleValue();  //unboxing
        float f1 = floatObj.floatValue();    //unboxing
        char c1 = charObj.charValue();//unboxing
        byte by1 = 8;
        Byte by2 = by1;

        //by2 = new Byte(by1);
        System.out.println("byte object " +by2);



        String s = intObj.toString();
        System.out.println("String value " +s);

        String s2 = "ramya";
        String strObject = new String(s2);
        System.out.println("string converted o int " + strObject);




        System.out.println("primitive value " + i1);
        System.out.println("primitive value " + d1);
        System.out.println("primitive value " + f1);
        System.out.println("primitive value " + c1);
        Boolean b = false;
        boolean b2 = b.booleanValue();
        System.out.println(" boolen value " +b2);
        char c2 = (char)intObj.intValue();
        System.out.println("character value of int " +c2 );

    }
}
