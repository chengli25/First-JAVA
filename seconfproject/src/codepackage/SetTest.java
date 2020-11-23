package codepackage;
/**
 * 用于学生选课的存放
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Course> coursesToSelect;
    public Scanner console;
    private Student student;

    public SetTest(){
        this.coursesToSelect = new ArrayList<Course>();
        console = new Scanner(System.in);
    }
    public void testAdd(){
        //创建一个课程对象，并通过调用add方法，添加到备选课程List中
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        //System.out.println("添加了课程：" + temp.id + " : " + temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course) coursesToSelect.get(0);
        //System.out.println("添加了课程：" + temp2.id + " : " + temp2.name);

        /**
         * 重复添加的课程
         */
        //coursesToSelect.add(cr1);
        //Course temp0 = (Course) coursesToSelect.get(2);
        //System.out.println("添加了课程：" + temp0.id + " : " + temp0.name);
        /**
         * 一下方法会抛出数组下标越界异常
         */
        //Course cr3 = new Course("3","复变函数");
        // coursesToSelect.add(3,cr3);
        // Course temp3 = (Course) coursesToSelect.get(0);
        // System.out.println("添加的课程：" + temp3.id + ":" +temp3.name);

        Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")};

        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);
        //System.out.println("添加了两门课程：" + temp3.id + ": " + temp3.name + "; " + temp4.id + " : " + temp4.name);

        Course[] course2 = {new Course("5","高等数学"),new Course("6","大学英语")};
        coursesToSelect.addAll(2,Arrays.asList(course2));
        Course temp5 = (Course) coursesToSelect.get(2);
        Course temp6 = (Course) coursesToSelect.get(3);
        //System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + "; " + temp6.id + ": " + temp6.name);
    }
    public void testForEach(){
        System.out.println("有如下的课程可选（通过for each遍历List）：");
        for(Object obj:coursesToSelect){
            Course cr=(Course) obj;
            System.out.println("课程：" + cr.getId() + ": " + cr.getName());
        }
    }

    /**
     * 打印输出
     * @param student
     */
    public void testForEachForSet(SetTest st,Student student){
        System.out.println("共选择了：" + student.courses.size() + "门课程！");
        for(Course cr : student.courses){
            System.out.println("选择了课程:" + cr.getId() + "：" + cr.getName());
        }
    }
    //创建学生对象并选课
    //public void createStudentAndSelect(){
    //
    //    student = new Student("1","小明");
    //    System.out.println("欢迎学生" + student.getName() + "选课！");
    //    //创建一个scanner对象，用来接收从键盘输入的课程ID
    //    Scanner console = new Scanner(System.in);
    //    for (int i = 0; i < 3; i++) {
    //        System.out.println("请输入课程ID");
    //        String courseID = console.next();
    //        for(Course cr : coursesToSelect){
    //            if(cr.getId().equals(courseID)){
    //                student.courses.add(cr);
    //                //student.courses.add(null);//可以添加空对象
    //}





    //public void testChoose(SetTest st, Student student){
    //    System.out.println("欢迎学生" + student.getName() + "选课！");
    //    //创建一个scanner对象，用来接收从键盘输入的课程ID
    //    Scanner console = new Scanner(System.in);
    //    for (int i = 0; i < 3; i++) {
    //        System.out.println("请输入课程ID");
    //        String courseID = console.next();
    //        for(Course cr : st.coursesToSelect){
    //            if(cr.getId().equals(courseID)){
    //                student.courses.add(cr);
    //                //student.courses.add(null);//可以添加空对象
                    /**
                     * Set中添加某个对象无论添加多少次都只会保留一个对象，并且是第一次那个
                    */
                    //测试重复添加student.courses.add(cr);
//            }
//        }
//    }
//}

    /**
     * 测试list中的contain方法
     */
    //public void testListContains(){
    //    //取得备选课程序列的第0个元素
    //    Course course =coursesToSelect.get(0);
    //    //打印出coursesToSelected是否包含了course对象
    //    System.out.println("取得课程：" + course.getName());
    //    System.out.println("备选课程中是否包含课程：" + course.getName() + "," + coursesToSelect.contains(course));
    //    //创建一个新的课程对象，ID和名称，与course对象完全一样
    //    //提示输入课程名称
    //    System.out.println("请输入课程名称：");
    //    String name = console.next();
    //    Course course2 = new Course();
    //    course2.setName(name);
    //    System.out.println("取得课程：" + course2.getName());
    //    System.out.println("备选课程中是否包含课程：" +  course2.getName() + "," + coursesToSelect.contains(course2));
    //
    //}
    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        //st.testForEach();
        //Student student = new Student("1","小明");
        //st.testChoose(st,student);
        //st.testForEachForSet(st,student);
        //st.testListContains();
    }


}