package chuoicosan;

public class bai51 {
    public static void main(String[] args) {
        // indexOf=> 4 truong hop
        //int => lay tu dau && lay o vi tri
        //tring => lay tu dau && lay tu vi tri;
        String s1 = "xin chao dai ca huuy xin chao";
        String s2 = "xin chao";
        String s3 = "dai ca123";
        System.out.println("vi tri cua s2 trong s1 la :"+s1.indexOf(s2));
        System.out.println("vi tri cua s2 trong s1 la :"+s1.indexOf(s2,3));
        // ham lastIndextOf => tim tu phai qua trai;
        // chu yeu tim file;
    }
}
