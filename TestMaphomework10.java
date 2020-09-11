package ke.Map;

import java.util.*;

public class TestMaphomework10 {
	public static void main(String[] args) {
			HashMap<Student, String> students = new HashMap<Student,String>();
		//刚创建hashmap之后没有添加元素 table=null size=0 ⽬的节省空间
		 //1添加元素
		 Student s1=new Student("孙悟空", 100);
		 Student s2=new Student("猪⼋戒", 101);
		 Student s3=new Student("沙和尚", 102);
		 students.put(s1, "北京");
		 students.put(s2, "上海");
		 students.put(s3, "杭州");
		 //students.put(s3, "南京");
		 students.put(new Student("沙和尚", 102), "南京");
		 System.out.println("元素个数:"+students.size());
		 System.out.println(students.toString());
		 //2删除
		// students.remove(s1);
		// System.out.println("删除之后"+students.size());
		 //3遍历
		 System.out.println("--------keySet---------");
		 //3.1使⽤keySet();
		 for (Student key : students.keySet()) {
		 System.out.println(key.toString()+"========="+students.get(key));
		 }
		 System.out.println("--------entrySet---------");
		 //3.2使⽤entrySet();
		 for (Map.Entry<Student, String> entry : students.entrySet()) {
		 System.out.println(entry.getKey()+"---------"+entry.getValue());
		 }
		 //4判断
		 System.out.println(students.containsKey(new Student("孙悟空", 100)));
		 System.out.println(students.containsValue("杭州"));

	}
}


class Student {
	 private String name;
	 private int stuNo;

	 public Student() {
	 // TODO Auto-generated constructor stub
	 }
	 public Student(String name, int stuNo) {
	 super();
	 this.name = name;
	 this.stuNo = stuNo;
	 }
	 
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public int getStuNo() {
	 return stuNo;
	 }
	 public void setStuNo(int stuNo) {
	 this.stuNo = stuNo;
	 }


	 @Override
	 public int hashCode() {
	 final int prime = 31;
	 int result = 1;
	 result = prime * result + ((name == null) ? 0 : name.hashCode());
	 result = prime * result + stuNo;
	 return result;
	 }
	 @Override
	 public boolean equals(Object obj) {
	 if (this == obj)
	 return true;
	 if (obj == null)
	 return false;
	 if (getClass() != obj.getClass())
	 return false;
	 Student other = (Student) obj;
	 if (name == null) {
	 if (other.name != null)
	 return false;
	 } else if (!name.equals(other.name))
	 return false;
	 if (stuNo != other.stuNo)
	 return false;
	 return true;
	 }
	 
	 @Override
	 public String toString() {
	 return "Student [name=" + name + ", stuNo=" + stuNo + "]";
	 }
	}