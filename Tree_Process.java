package AWT_Swing_Projects.Java_Tree_Methdologies;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree_Process extends JFrame
{
    Tree_Process()
    {
        this.setTitle(("Java GUI Demo"));
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        DefaultMutableTreeNode myCourses = new DefaultMutableTreeNode("My_Course");
        DefaultMutableTreeNode programming = new DefaultMutableTreeNode("Programming");
        DefaultMutableTreeNode economics = new DefaultMutableTreeNode("Economics");

        myCourses.add(programming);
        myCourses.add(economics);

        DefaultMutableTreeNode java = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode python = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode javascript = new DefaultMutableTreeNode("JavaScript");

        myCourses.add(java);
        myCourses.add(python);
        myCourses.add(javascript);

        DefaultMutableTreeNode finance = new DefaultMutableTreeNode("Finance");
        DefaultMutableTreeNode micro = new DefaultMutableTreeNode("Micro Economics");
        DefaultMutableTreeNode macro = new DefaultMutableTreeNode("Macro Economics");

        economics.add(finance);
        economics.add(micro);
        myCourses.add(macro);
        macro.add(finance);

        JTree myTree = new JTree(myCourses);
        myTree.setBounds(25,25,200,200);

        this.add(myTree);

        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Tree_Process();
    }
}
