package com.thiskeyword;

class School
{
    int roll_no;
    String student_name;
    String school_name;
    public School(int roll_no,String student_name,String school_name)
    {
        this.roll_no=roll_no;
        this.student_name=student_name;
        this.school_name=school_name;

    }
    public void display()
    {
        System.out.println(roll_no+" "+student_name+" "+school_name);
    }
}



public class ThisAsVariable
{
    public static void main(String[] args)
    {
        School obj = new School(1,"Ram","Montessori");
        obj.display();
    }
}
