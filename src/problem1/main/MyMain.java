/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain
{
    public static void main(String[] args)
    {

        MyBinarySearchTree MyBinarySearchTree =   new MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int input = 7;
        while (input > 0)
        {
            MyBinarySearchTree.add(sc.nextInt());
            input--;
        }
    }
}
