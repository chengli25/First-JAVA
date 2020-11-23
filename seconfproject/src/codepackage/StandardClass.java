package codepackage;

public class StandardClass {
    private String name;//按照封装的原则，将属性私有化
    private int age;//private修饰
    public StandardClass(){}//无参构造方法
    public StandardClass(String name,int age){//带两个参数的构造方法
        this.name = name;
        this.age = age;
    }
    public StandardClass(String name){//带一个参数的构造方法
        this.name = name;
    }
    public String getName(){//获取私有化的变量的信息
        return name;
    }
    public void setName(String name){//对私有化的变量初始化
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + name + " " + "年龄：" + age);
    }
}
class TestClass{
    public static void main(String[] args) {
        //方式1
        StandardClass s = new StandardClass();
        s.setName("程立");
        s.setAge(21);
        s.show();
        System.out.println("姓名：" + s.getName() + " " + "年龄：" + s.getAge());
        //方式2
        StandardClass s1 = new StandardClass("程立",21);
        s1.show();
        //方式3
        StandardClass s2 =new StandardClass("程立",20);
        System.out.println("姓名：" + s2.getName() + " 年龄：" + s2.getAge());

    }
}
