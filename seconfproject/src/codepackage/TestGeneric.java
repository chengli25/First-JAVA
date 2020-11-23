package codepackage;

import java.util.ArrayList;
import java.util.List;

/**
 * 带有泛型--Course的List类型属性
 */
public class TestGeneric {
    public List<Course> courses;
    public TestGeneric(){
        this.courses = new ArrayList<Course>();
    }
/**
 * 测试添加
 */
    public void testAdd() {
    Course cr1 = new Course("1", "大学语文");
    courses.add(cr1);
    //泛型集合中，不能添加规定类型及其子类型以外的对象，否则会报错;
    //System.out.println("能否添加一些奇怪的东西呢");
    //courses.add("学习");
    Course cr2 = new Course("2", "java基础");
    courses.add(cr2);
    }

    /**
     * ForEach遍历整个List
     */
    public void testForEach(){
    for(Course cr:courses){
        System.out.println(cr.getId() + ":" + cr.getName());
    }
}

    /**
     *泛型集合可以添加泛型子类的对象实例
     * @param
     */
    public void testChild(){
    ChildCourse ccr = new ChildCourse("3","我是子类课程对象实例");

    //ccr.id ="3";
    //ccr.name = "我是子类的对象实例";
    courses.add(ccr);
    }

    /**
     * 泛型不能使用基本类型（可以使用类型的包装类）
     * @param
     */
    public void testBasicType(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型必须使用包装类型作为泛型!" + list.get(0));
    }
    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
        tg.testBasicType();
    }

}
