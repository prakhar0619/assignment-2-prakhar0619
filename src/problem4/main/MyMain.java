/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree MyBinarySearchTree =new MyBinarySearchTree();
        MyBinarySearchTree.add(50);
        MyBinarySearchTree.add(294);
        MyBinarySearchTree.add(36);
        MyBinarySearchTree.add(56);
        MyBinarySearchTree.add(900);
        MyBinarySearchTree.add(404);
        MyBinarySearchTree.add(200);
        MyBinarySearchTree.add(781);
        MyBinarySearchTree.add(964);
        MyBinarySearchTree.add(563);
        MyBinarySearchTree.add(669);
        MyBinarySearchTree.add(855);
        MyBinarySearchTree.add(72);
        MyBinarySearchTree.add(50);
        MyBinarySearchTree.add(12);
        MyQueue queue = new MyQueue();
        queue.enqueue(MyBinarySearchTree.root);
        queue.printQueue();
    }

}
