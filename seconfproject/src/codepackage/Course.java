package codepackage;

/*
*课程类
*
*/
public class Course {

    private String id;
    private String name;

    public Course(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Course(){
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Course)){
            return false;
        }
        Course course = (Course) obj;
        if(this.name == null){
            if(course.name==null){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(this.name.equals(course.name)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void setName(String name) {
        this.name=name;
    }
}
