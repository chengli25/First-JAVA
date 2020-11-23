package notepackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //    定义数组的方法
        //int a[] = new int[10];
        ////    int[] a=new int [10];
        ////    int a[]= int[]{1,2,3,4,5,6};(里面的的数据长度必须为空）
        //
        //int c = 10 / 4;
        //System.out.println(c);
        //数组使用的方法
        //数组名.length表示获取数组的长度；
        //输入函数

        //    定义字符串的方法
        //字符串一旦在内存中被创建就不能被修改，而我们常说的修改其实是创建了新的对象，所指向的空间已经发生了变化；
        //==是表示两个字符串在内存中的首地址是否相同；
        //equals()是表示两个字符串对象中的内容是否一致；
        //每个汉字对应两个字节值，如“学”对应 “-47 -89” ，而英文字母 “J” 对应 “74” 。同时，我们还发现汉字对应的字节值为负数，原因在于每个字节是 8 位，最大值不能超过 127，而汉字转换为字节后超过 127，如果超过就会溢出，以负数的形式显示。
        //，不同之处，StringBuffer 是线程安全的，而 StringBuilder 则没有实现线程安全功能，所以性能略高。因此一般情况下，如果需要创建一个内容可变的字符串对象，应优先考虑使用 StringBuilder 类。

        //String s ="zifuchuan "; //创建一个字符串对象zifuchuan ;名为s
        //String s1 = String();    //创建一个空字符串对象
        //String s3 =  String("imooc");//创建一个字符串对象imooc，名s3；

        //包装类的定义
        //Integer m= new Integer(5);//表示定义Integer包装类，值为5
        //Integer n= new Integer("8");//表示定义Integer包装类对象，值为8；并且只能用数值型字符串变量作为参数，否则报错


        ////基本数据类型转化难为字符串的三种方法：
        //1.使用包装类的 tostring()方法；  String str1 = Integer.toString(<基本数据类型>);
        //2.使用string类的valueOf()方法   String str2 = string.valueOf(<基本数据类型>); 不是包装类中的valueof，是string中的
        //3.用一个空字符串机上基本数据类型得到的就是基本数据类型对应的字符串  String str3 = c + "";

        //字符串类型转换为基本类型
        //1.调用包装类的parseXxx静态方法    int d=Integer.parseInt(<字符串类型>);  整数包装类的字符串静态调用为整型数据
        //2.调用包装类的valueof()方法       int e = Integer.valueOf(str);

        //获取当前时间
        System.out.println("*********获取当前时间********");
        Date d = new Date(); //(import java.util.Date) //定义一个Date的对象名字为d用来获取当前的时间但是需要引入java.util包中的Date;
        System.out.println(d);

        //时间格式化
        System.out.println("********时间格式化********");
        //调用java.text.SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年mm月dd日 hh时mm分ss秒");
        System.out.println(sdf.format(d));    //表示输出格式化后的时间

        //使用parse()方法将文本转换为日期
        System.out.println("****使用parse()方法将文本转换为日期***");
        String s ="2020-11-11 15:17:24";
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");//里面的格式化模板要和字符串里面的模板一致
        Date b=sdf1.parse(s);
        System.out.println(b);
        System.out.println();

        //使用Calendar类设置处理时间
        System.out.println("使用Calendar类设置处理时间");
        Calendar c = Calendar.getInstance();//创建一个Calendar对象，调用Calendar类中的getInstance()方法获取一个实例
        int year = c.get(Calendar.YEAR);//获取年份
        int month = c.get(Calendar.MONTH)+1;
        int day =c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second =c.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");

        //将Calendar类转化为Date类
        System.out.println("************将Calendar类转化为Date类************");
        Date date=c.getTime();//将Calendar对象获取的时间转换为Date对象
        System.out.println(date);
        //使用getTimeInMillis()方法获取Calendar的时间值，单位为毫秒
        System.out.println("***使用getTimeInMillis()方法获取Calendar的时间值，单位为毫秒***");
        long time =c.getTimeInMillis();
        System.out.println("时间值是："+ time);

        //Math类的使用
        System.out.println("*************Math的使用***************");
        double A =5.3;
        long num1 =Math.round(A);
        double num2 = Math.floor(A);
        double num3 =Math.ceil(A);
        double num4 = Math.random();
        System.out.println("num1的值是：" + num1 + '\n' + "num2的值是：" +num2 + '\n' + "num3的值是：" + num3 + '\n' + "num4的值是：" + num4);

        System.out.println("\n*********集合框架**********");
        //集合框架





        //
        //     //异常处理
        // try {
        // /*代码执行模块*/
        // }
        // catch(/*程序异常提示*/){
        //     /*异常处理模块*/
        //
        // }catch(/*程序异常提示*/){
        //     /*异常处理模块*/
        // }finally{
        //     /*善后工作*/
        // }
        // //自定义异常（要继承于exception类或者起子类）
        ///* class 自定义异常 extends 异常类型{
        //
        // }*/
    }
}