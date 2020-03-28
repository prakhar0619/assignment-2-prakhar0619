/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree MyBinarySearchTree = new MyBinarySearchTree();
        Scanner sc =   new Scanner(System.in);

        int inputs = 7;
        while (inputs > 0)
        {
            MyBinarySearchTree.add(sc.nextInt());
            inputs--;

        }
        MyBinarySearchTree.pre(MyBinarySearchTree.root);
        System.out.println();
        MyBinarySearchTree.post(MyBinarySearchTree.root);

    }
}
