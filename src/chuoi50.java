public class chuoi50 {
    public static void main(String[] args) {
        String s1="huy1";
        String s2="huy1";
        String s3="Huy1";
        // hàm qquals =>2 chuối giống nhau có phân biệt hia thường;
        System.out.println("s1 equals s2 :"+s1.equals(s2));
        System.out.println("s1 equals s3 :"+s1.equals(s3));
        // hàm equalsIgroneCase so sánh k phân biệt hoa thường;
        // chuôi giống nhau thì so sánh độ dài chuỗi;
        System.out.println("s1 equalsIgroneCase s2 :"+s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIdroneCase s3 :"+s1.equalsIgnoreCase(s3));
        //compeTo  so sanh <>=;
        String sv1="dmh";
        String sv2="ndp";
        System.out.println("sv1 compeTo sv2 :"+sv1.compareTo(sv2));
        // ham competoIgnoreCase;
        // ham regionMatches => so sanh 1 doan
        System.out.println(s1.regionMatches(0,s2,0,3));
        // 0  là index thứ 0 tại s1,
        // s2 là chuỗi
        // 0 là index của s2 tại 0
        //3 là kết thúc tại index thứ 3 của s2;
        System.out.println();
        // hàm startWith => hàm kiểm tra đầu chuỗi ;
        String sdt="122334";
//        String sdt1="32445";
//        String[] list =new String[]{sdt, sdt1};
//        for(int i=0;i<list.length;i++){
//            if(list[i]==l"122"){
//                System.out.println(i);
//            }
            System.out.println(sdt.startsWith("345"));
        System.out.println(sdt.startsWith("122"));
//        }
//ham endWith => kiểm tra cuối chỗi;
        String tenfile="I love you.jpg";
        if(tenfile.endsWith("jpg")){
            System.out.println("laf file anh");
            }else{
            System.out.println("k phai");
        }
    }
}
