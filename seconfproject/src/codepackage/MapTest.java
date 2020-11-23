package codepackage;

/**
 * 用于学生信息的存放
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class MapTest{

    public Set<Course> coursedepositary;


    /**
     * 用来承装学生类型的对象的
     */
    public Map<String,Student> students;

    public MapTest(){
        this.students = new HashMap<String,Student>();
        this.coursedepositary = new HashSet<Course>();
    }






    /**
     * 测试添加方法:输入学生ID，
     * 若未被占用，则输入姓名，创建新的学生对象，并
     * 添加到students中
     */
    public void testPut(){
        //创建一个Scanner对象，用来获取输入的学生ID和姓名；
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 3; ) {
            System.out.println("请输入学生ID：");
            String ID = console.next();
            //判断该ID是否被占用
            Student st = students.get(ID);
            if(st == null){
                //提示学生姓名
                System.out.println("请输入学生姓名：");
                String name = console.next();
                //创建新的学生对象
                Student newStudent = new Student(ID,name);
                //通过调用students的put方法，添加学生ID-学生映射
                students.put(ID,newStudent);
                System.out.println("成功添加学生：" + students.get(ID).getName());
                i++;
            }
            else {
                System.out.println("该学生ID已经被占用！");
                continue;
            }
        }
    }
    /**
     * 测试map的keyset方法
     */
    public void testKeySet(){
        //通过keyset方法，返回map中所有键的Set集合
        Set<String> keySet = students.keySet();
        //取得students的容量
        System.out.println("总共有：" + students.size() + "个学生！");
        //遍历keyset对象来取得每一个键，再调用get方法，取得每个键对应的value
        for(String stuid: keySet){
            Student st = students.get(stuid);
            if(st != null){
                System.out.println("学生：" + st.getName());
            }
        }
    }

    /**
     * 测试删除
     * @param
     */

    public void testRemove(){
        Scanner console = new Scanner(System.in);
        while(true){
            //提示用户输入待删除学生ID
            System.out.println("请输入待删除学生ID");
            String id = console.next();
            //判断ID是否有学生对象
            Student st = students.get(id);
            if(st == null){
                //提示输入的ID并不存在
                System.out.println("该ID不存在");
                continue;
            }
            students.remove(id);
            System.out.println("成功删除学生：" + st.getName());
            break;
        }
    }

    /**
     * 用entryset来遍历map
     * @param
     */
    public void testEntrySet(){
        //通过entryset方法，返回map中的所有键值对
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String,Student> entry : entrySet) {
            System.out.println("取得快捷键：" + entry.getKey());
            System.out.println("对应的值为：" + entry.getValue().getName());
            System.out.println("所选的课程为：" + entry.getValue().courses);
        }
    }

    /**
     * 利用put方法修改map中已有映射
     * @param
     */
    //public void testModify(){
    //    //提示输入要修改ID
    //    System.out.println("请输入修改的学生ID");
    //    //创建一个Scanner对象
    //    Scanner console = new Scanner(System.in);
    //    while(true){
    //        //取得从键盘输入的学生ID
    //        String id = console.next();
    //        //根据学生ID查找是否有相应的映射
    //        Student student = students.get(id);
    //        if(student == null){
    //            System.out.println("该ID不存在");
    //            continue;
    //        }
    //        //提示当前对应学生对象的姓名
    //        System.out.println("当前学生ID对应的学生为：" + student.getName());
    //        //提示输入新的学生姓名，来修改已有的映射
    //        System.out.println("请输入新的学生姓名：");
    //        String name = console.next();
    //        Student newStudent = new Student(id,name);
    //        students.put(id,newStudent);
    //        System.out.println("修改成功！");
    //        break;
    //    }
    //}
    public void Put(Student student){
        students.put(student.getId(),student);
        System.out.println("成功添加学生：" + student.getName());
    }
    public static void main(String[] args) {
        MapTest mt = new MapTest();//存放学生信息的集合
        SetTest st = new SetTest();//存放选择课程的集合
        Student student = new Student("1","程立");
        st.testAdd();//增加待选课程
        st.testForEach();//遍历待选课程
        //st.testChoose(st,student);//学生选择的课程
        //mt.testPut();//将选课的学生信息存入
        mt.Put(student);
        //mt.testKeySet();
        //mt.testRemove();
        //mt.testEntrySet();
        //mt.testModify();1
        mt.testEntrySet();//遍历学生的选课信息
    }



}
