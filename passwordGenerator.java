import java.util.*;

public class passwordGenerator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        String[] nameParts=name.split(" ");
        String firstname=nameParts[0];
        // System.out.println(firstname);
        String lastname=nameParts[nameParts.length-1];
        // System.out.println(lastname);
        
        StringBuilder num=new StringBuilder();
        for(char c:firstname.toCharArray()){
            int val=getCharValue(c);
            num.append(val);
        }

        String last3characters=lastname.substring(Math.max(0,lastname.length()-3)).toUpperCase();
        String password=num.toString()+"@"+last3characters;
        System.out.println("Password for you: "+password);

        sc.close();
    }

    public static int getCharValue(char c){
        //if everytime we want new password
        Random r=new Random();
        int charValue=r.nextInt(10);
        return charValue;

        // if we want the same password everytime depending on its position in alphabets and if the position is more
        // than 9 then it will done like if its z, the position of it is 26, therefore 2+6=8

        // int charValue=Character.toUpperCase(c)-'A'+1;
        
        // int sum=0;
        // while(charValue>0){
        //     sum+=charValue%10;
        //     charValue/=10;
        // }

        // return sum;

        
    }
}