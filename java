Java
Mảng
Datatype[] arr = new datatype[n];
Arrays.sort(arr, Collections.reverseOrder());
Collections.sort(arr, Collections.reverseOrder());

Int[] arr = new int[100];
int arr[]  = {1,2,3};
int[3] arr = {1,2,3};

ArrayList
//chỉ lưu được Object

ArrayList<Interger> arr = new ArrayList<>();
arr.add(...);
arr.clear();
arr.isEmpty();
arr.contains();
arr.remove(index);
arr.remove(Object(value));
arr.indexOf(value);// index đầu của value/ -1 nếu không có

Collections.sort(arr, new Comparator<Interger>(){
	@Override
	Public int compare(Interger a, Integer b){
		Return a - b;
	}
});

Set 	- Không có 2 phần tử có giá trị giống nhau
- Xóa, thêm, tìm kiếm nhiều lần
	- Giá trị khác nhau của mảng
	- Chỉ lưu Object

//Không có thứ tự - Tìm kiếm O(1)
HashSet<Interger> se = new HashSet<>();

add()
remove()
size()
contains() - bool
clear()
isEmpty()

//Có thứ tự - Tìm kiếm O(1)
Set<Interger> se = new LinkedHashSet<>();
HashSet<Interger> se = new LinkedHashSet<>();

//Thứ tự tăng dần - LogN
TreeSet<Interger> se = new TreeSet<>();

Map

HashMap<Key, Value> ma = new HashMap<>();

put(key, value);
size();
isEmpty();
clear();
containsKey();
containsValue();
get(keyValue) -> trả về value tương ứng;
remove(keyValue);
replace(x,y);

Duyệt qua map
Set<Map.Entry<Interger, Interger>> se = map.entrySet();
for(Map.Entry<Interger, Interger> x : se){
	sout(x.getKey() + “ “ + x.getValue());
}

LinkedHashMap<Interger> map = new LinkedHashMap<>();
TreeMap<Interger> map = new TreeMap<>();

String
String s = Scanner.nextLine();
nextLine().charAt():
nextLine();

length();
toUpperCase();//không thay đổi xâu ban đầu
toLowerCase();
s.compareTo(t);
substring(begin, end);
contains();

C1:
String s = “ dkafjkf fdaskf dkf “;
String[] a = s.split(“\\s+”); \\s: white space and \n - +: one or more
C2:
StringTokenizer st = new StringTokenizer(s);
while(st.hasMoreTokens()){
	sout(st.nextToken());
}
Chuẩn hóa tên
StringBuilder sb = new StringBuilder(“”);
String[] a = s.split(“\\s+”);
for(String x : a){
sb.append(Character.toUpperCase(s.charAt(0)));
for(int i=1;i<x.length();i++){
sb.append(Character.toLowerCase(s.charAt(i)));
}	
sb.append(“ “);

}
sb.toString();

Comparator

Arrays.sort(a, new Comparator<Interger>(){
	public int compare(Interger a, Interger b){
	ìf(a > b) return -1;
	else return 1;
}

})

OOP

Access modifier
Class
Public: mọi class khác đều truy cập được

1 class gồm 3 phần: Attribute(Thuộc tính) - Constructor(Hàm tạo) - Method(phương thức)
Public: mọi class đều truy cập được code
Protected: code chỉ truy cập trong cùng 1 class hoặc subclass (Protected)
Private: code chỉ truy cập được trong 1 class khai báo

Non-access modifier
Class
Final: Không thể kế thừa được
Abstract: Không thể dùng để tạo Object được
Attribute & Method
Final  == const
Static: có thể dùng mà không cần tạo 1 object -> sử dụng luôn tên class

Encapsulation(Đóng gói)
Sử dụng: Attribute private +  method Getter() và Setter()

Inheritance(Kế thừa)
Sử dụng 1 lớp cha với các protected attributes, methods, constructors cho trước

Các lớp con: public class subclass extends superclass{}

Tên lớp cha = super

Polymorphism(Đa hình)
Kế thừa nhiều mức



 


