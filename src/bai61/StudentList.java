package bai61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<arraylist>list;

    public StudentList(ArrayList<arraylist> list) {
        this.list = list;
    }

    public StudentList() {
        this.list=new ArrayList<arraylist>();
    }
    // 1them students
    public void add(arraylist sv){
        this.list.add(sv);
    }
    //2 in ra danh sach
    public void inStudents(){
        for (arraylist studentList:list) {
            System.out.println(studentList.toString());
        }
    }
    // 3kiem tra
    public boolean testStudents(){
        return this.list.isEmpty();
    }
    //4 lay ra so luong
    public int amount(){
        return this.list.size();
    }
    // 5lam rong danh sach sinh vien
    public void empty(){
        this.list.removeAll(list);
    }
    //6.kiểm tra sinh viên có tồn tại trong danh sách hay không, dưja trên mã sinh viên
    public boolean check(arraylist student){
        return this.list.contains(student);
    }
    //7.xoá 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên
    public boolean remote(arraylist student){
        return this.list.remove(student);
    }
    //8.tìm kiếm tất cả sinh viên dựa trên tên đựa nhập từ bán phím
    public void seack(String name){
        for (arraylist sinhvien:list) {
            if(sinhvien.getFullName().indexOf(name)>=0){
                System.out.println(sinhvien);
            }
            else{
                System.out.println("khong thay");
            }
        }
    }
    //9.xuất ra sinh vien có từ cao đến thấp
    public void sortgiam(){
        Collections.sort(this.list, new Comparator<arraylist>() {
            @Override
            public int compare(arraylist o1, arraylist o2) {
                if(o1.getAvg()>o2.getAvg()){
                    return -1;
                }else if(o1.getAvg()<o2.getAvg()){
                    return 1;
                }
                return 0;
            }
        });
    }
}
