import java.util.Scanner;
public class chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("nhap chuoi :");
        s = sc.nextLine();
        System.out.println("-----");
        //ham length()
        System.out.println(s.length());
        int doDai = s.length();
        // ham charAt(vi tri)=> lay ra 1 ky tu tai vi tri
        for (int i = 0; i < doDai; i++) {
            System.out.println("vi tri" + i + "la :" + s.charAt(i));
        }
        // ham getChars (vi tri bắt đầu , vị trí kết thúc -1, mảng lưu dữ liệu,,vi trí bắt đầu lưu của mảng)
        char[] arrayChar=new char[10];
        s.getChars(1,3,arrayChar, 1);
        for(int i=0;i<arrayChar.length;i++){
            System.out.println("gia tri cua mang "+i+" la:"+arrayChar[i]);
        }
        // hàm getByte=> lấy kí tự tương ứng với sô trog bảng unikry;
        byte[] arrayByte=s.getBytes();
        for(byte b:arrayByte){
            System.out.println(b);
        }
    }
}
