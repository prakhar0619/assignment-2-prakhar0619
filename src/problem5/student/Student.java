/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student
{
    private int rollNo;
    private String Name;
    private int backs;
    private int appearing;

    public Student(int rno, String name)
    {
        this.rollNo = rno;
        Name = name;
    }

    public Student(int rno, String name, int backLog, int appearance)
    {
        this.rollNo =   rno;
        Name = name;
        this.backs = backLog;
        this.appearing = appearance;
    }

    public int getRollNumber()
    {
        return rollNo;
    }

    public void setRollNumber(int rno)
    {
        this.rollNo = rno;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getBackLog()
    {
        return backs;
    }

    public void setBackLog(int backLog)
    {
        this.backs = backLog;
    }

    public int getAppearance()
    {
        return appearing;
    }

    public void setAppearance(int appearance)
    {
        this.appearing = appearance;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "RollNumber=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String toStrings()
    {
        return "Student{" +
                "RollNumber=" + rollNo +
                ", Name='" + Name + '\'' +
                ", No. of BackLogs=" + backs +
                ", no. of Appearances=" + appearing +
                '}';
    }
}



