import java.util.*;
public class Even{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println(num+"is a even number");
        }
        else{
            System.out.println(num+"is a odd number");
        }
    }
    public boolean  isEven(int num){
        return num%2==0;
    }
}