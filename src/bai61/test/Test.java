package bai61.test;

import bai61.StudentList;
import bai61.arraylist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentList ad=new StudentList();
        int choose=0;
        do {
            System.out.println("menu------");
            System.out.println("vui long chon chuc nang");
            System.out.println("1. thêm sinh viên vào danh sách"+"\n"+
                            "2.in danh sách sinh viên ra màn hình \n"+
                            "3.kiểm tra danh sách có rỗng hay khoon\n"+
                            "4.lấy ra số lượng sinh viên trong danh sách\n"+
                            "5.làm rỗng danh sách sinh viên\n"+
                            "6.kiểm tra sinh viên có tồn tại trong danh sách hay không, dưja trên mã sinh viên\n" +
                            "7.xoá 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên\n"+
                            "8.tìm kiếm tất cả sinh viên dựa trên tên đựa nhập từ bán phím\n"+
                            "9.xuất ra sinh vien có từ cao đến thấp\n"+
                    "");
            choose= scanner.nextInt();
//            scanner.nextLine();
            switch (choose){
                case 1:
                    // them
                    System.out.println("nhap studentCode");int codeStudent=scanner.nextInt();
                    System.out.println("nhap fullName:"); String fullName=scanner.nextLine();
                    String fullName1=scanner.nextLine();
                    System.out.println("nhap dateOfBirth :");int dateOfBirth=scanner.nextInt();
                    System.out.println("nhap avg:");double avg=scanner.nextDouble();
                    arraylist sv=new arraylist(codeStudent,fullName,dateOfBirth,avg);
                    ad.add(sv);
                    break;
                case 2:
                    //in ra
                    ad.inStudents();
                    break;
                case 3:
                    //kiem tra
                    System.out.println("danh sach rong :"+ad.testStudents());
                    break;
                case 4:
                    //lấy ra số lượng sinh viên trong danh sách
                    System.out.println("so luong hien tai:"+ad.amount());
                    break;
                case 5:
                    //làm rỗng danh sách sinh viên
                    ad.empty();
                    break;
                case 6:
                    //kiểm tra sinh viên có tồn tại trong danh sách hay không, dưja trên mã sinh viên
                    System.out.println("nhap ma sinh vien:");int Codestudent=scanner.nextInt();
                    arraylist student=new arraylist(Codestudent);
                    System.out.println("kiem tra sinh vien co trongdanh sach :"+ad.check(student));
                    break;
                case 7:
                    //xoá 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên
                    System.out.println("nhap ma sinh vien:");int Codestudents=scanner.nextInt();
                    arraylist student1=new arraylist(Codestudents);
                    System.out.println("xoa sinh vien co trongdanh sach :"+ad.remote(student1));
                    break;
                case 8:
                    //tìm kiếm tất cả sinh viên dựa trên tên đựa nhập từ bán phím
                    System.out.println("nhap fullName:"); String FullName=scanner.nextLine();
                    System.out.println("ket qua tim kiem :");
                    ad.seack(FullName);
                    break;
                case 9:
                  //xuất ra sinh vien có từ cao đến thấp
                  ad.sortgiam();
                  ad.inStudents();
                  break;
            }

        }while (choose!=0);

    }
}
