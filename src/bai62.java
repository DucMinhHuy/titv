import java.util.Scanner;
import java.util.Stack;

public class bai62 {
    // .push => dua gia tri vao
    //.pop => lay ra va xoa
    //.peek => lay ra nhung k xoa;
    //.clear=> xoa tat ca trong stack;
    //.contains=> xac dinh gia tri cos trong stack hay k;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Stack<String> stack=new Stack<String>();
        // dao nguoc
//        System.out.println("nhap:");
//        String s=sc.nextLine();
//        for(int i=0;i<s.length();i++){
//            stack.push(s.charAt(i)+"");
//        }
//        System.out.println(" chuoi");
//        for(int i=0;i<s.length();i++){
//            System.out.print(stack.pop());
//        }
        Stack<Integer> stack1=new Stack<>();
        System.out.println("nhap 1 so nguyenduong");
        int x=sc.nextInt();
        while (x>0){
            int length=x%2;
            System.out.println(length);
            stack1.push(length);
            x=x/2;
        }
        System.out.println("so nhi phan");
        int n=stack1.size();
        for(int i=0;i<n;i++){
            System.out.println(stack1.pop());
        }
    }
}
