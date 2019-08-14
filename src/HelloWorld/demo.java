package HelloWorld;


public class demo {

    public static void main(String[] args) {

        student student = new student();
        System.out.println("姓名："+student.name);//null
        System.out.println("年龄："+student.age);//0
        System.out.println("----------");



        //给成员变量赋值
         student.name="林青霞";
        student.age=20;

        System.out.println("姓名："+student.name);//null
        System.out.println("年龄："+student.age);//0
        System.out.println("----------");


        //调用成员方法
        student.study();
        student.eat();

    }

    public void test(){
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println("c");
    }
}


