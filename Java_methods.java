import java.util.*;
public class Java_functions{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        //===================Inputs========================//

        //Interger input 
        System.out.print("Enter number: ");
        int a=s.nextInt();
        System.out.println(a);
        //Double input
        System.out.print("Enter double value: ");
        double d=s.nextDouble();
        System.out.println(d); 
        //Float input
        System.out.print("Enter float value: ");
        float f=s.nextFloat();
        System.out.println(f);
        //String input-1
        s.nextLine();   //Use nextLine() after taking integer/double/float input
        System.out.print("Enter string-1: ");
        String s1=s.nextLine();  //Spaces are accepted...takes complete line as input
        System.out.println(s1);
        //String input-2
        System.out.print("Enter string-2: ");
        String s2=s.next();
        System.out.println(s2);
        //Character input
        System.out.print("Enter character: ");
        char c=s.next().charAt(0);
        System.out.println(c);

        //=================Array_inputs======================//

        //Integer array
        System.out.print("Enter integer array: ");
        int arr[]=new int[3]; //datatype name[]=new datatype[size]
        for(int i=0;i<3;i++) arr[i]=s.nextInt();
        for(int i=0;i<3;i++) System.out.print(arr[i]+" ");

        //String array
        System.out.print("Enter string array: ");
        String st[]=new String[3];
        for(int i=0;i<3;i++) st[i]=s.next();
        for(int i=0;i<3;i++) System.out.print(st[i]+" ");

        //================Integer_methods=================//
        System.out.println(Integer.parseInt("200"));     // 200 -- Converts string to integer 
        System.out.println(Integer.toBinaryString(24));  // 11000 -- Decimal to binary
        System.out.println(Integer.toOctalString(43));   // 53 -- Decimal to octal
        System.out.println(Integer.toHexString(47));     // 2f -- Decimal to hexadecimal
        System.out.println(Integer.parseInt("11010",2)); // 26 -- Binary to decimal
        System.out.println(Integer.parseInt("53",8));    // 43 -- Binary to octal
        System.out.println(Integer.parseInt("2f",16));   // 47 -- Binary to hexadecimal
        System.out.println(Integer.rotateLeft(10, 2));   // 40 -- 1010 -> 101000 left rotation by 2 bits -> rotateLeft(value,shifts)
        System.out.println(Integer.rotateRight(32, 2));  // 8 -- right shift
        System.out.println(Math.max(10, 20));            // 20

        //==================String_methods================//
        String str="Hello java";
        System.out.println(str.length());             // 10
        System.out.println(str.isEmpty());            // false
        System.out.println(str.charAt(1));            // e
        System.out.println(str.equals("Hellojava"));  // false
        System.out.println(str.startsWith("Hell"));   // true
        System.out.println(str.endsWith("ava"));      // true
        System.out.println(str.indexOf('o'));         // 5
        System.out.println(str.lastIndexOf('a'));     // 9
        System.out.println(str.substring(6));         // java
        System.out.println(str.substring(0,6));       // Hello
        System.out.println(str.contains("java"));     // true
        System.out.println(str.toUpperCase());        // HELLO JAVA
        System.out.println(str.toLowerCase());        // hello java
        String str1[]=str.split(" ");                 // str1[0]=hello , str1[1]=java
        System.out.println(str.replace('l','e'));     // heeeo java
        for(String i:str1) System.out.println(i);     
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) System.out.print(ch[i]+" "); // h e e e o  j a v a

        s.close();
    }
}
