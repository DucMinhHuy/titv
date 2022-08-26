package chuoicosan;

public class bai52 {
    public static void main(String[] args) {
        String s1 = "  DUCminh huy";
        String s2="dai ca";
        String s3=s1+s2;
        //ham concat => noi chuoi;
//        String s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.concat(s2));
        // ham replace=>
        String s5="hoi.vn";
        System.out.println(s5.replace("hoi","huy"));
        System.out.println(s5.replaceAll("vn","huy"));
        //ham toLowewCase=> chuyen ve viet thuong;
        // ham toUpperCase=> chuyen ve viet hoa;
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
        // ham trim()=> xoa khoang trang du thua o dau ;
        System.out.println(s1.trim());
        // ham toCharArray chuyen ve thanh mang;
//        System.out.println(s1.toCharArray());
        // ham subString=> cat chuoi con
        System.out.println(s1.substring(4));
        // copy tu vi tri 4 den 10
        System.out.println(s1.substring(4,10));
    }
}
