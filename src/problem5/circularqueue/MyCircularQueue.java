/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
public class MyCircularQueue
{

 private Node front;
    private int size;

    public MyCircularQueue()
    {
        front = null;
        size = 0;
    }

    public void enqueue(ArrayList<Student> addData)
    {
        for (Student stu : addData)
        {
            if (stu.getBackLog() - stu.getAppearance() == 0)
            {
            }
            else if (stu.getBackLog() - stu.getAppearance() > 0)
            {

                Node temp = new Node(stu);
                if (this.front == null)
                {
                    front = temp;
                    temp.setNext(temp);
                    size++;
                } else
                    {
                    temp.setNext(this.front);
                    Node parser = this.front;
                    while (parser.getNext() != this.front)
                    {
                        parser = parser.getNext();
                    }
                    parser.setNext(temp);
                    front = temp;
                    size++;
                }
            } else
                {

                System.out.println("Data is Invalid");
            }
        }

    }

    public int getSize()
    {
        return size;
    }

    public void printQueue()
    {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++)
        {
            if (i != this.size - 1)
            {
                System.out.print(temp.getData().toStrings() + ":-");
                temp = temp.getNext();
            } else
                {
                System.out.println(temp.getData().toStrings());
            }
        }
    }
}



