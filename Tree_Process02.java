package AWT_Swing_Projects.Java_Tree_Methdologies;

import AWT_Swing_Projects.Student_Management_System.AppGUIPage;

import javax.swing.*;
import javax.swing.tree.*;

public class Tree_Process02 extends JFrame
{
    Tree_Process02()
    {
        this.setTitle("Java GUI Demo");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        DefaultMutableTreeNode myCourses,programming,economics,agricultural,mechanics,electrical,finance;

        myCourses = new DefaultMutableTreeNode("My_Course");
        programming = new DefaultMutableTreeNode("Learn Programming");

        economics = new DefaultMutableTreeNode("Economics");

        agricultural = new DefaultMutableTreeNode("Agricultural");

        mechanics = new DefaultMutableTreeNode("Mechanics");

        electrical = new DefaultMutableTreeNode("Electrical");

        finance = new DefaultMutableTreeNode("Finance");

        myCourses.add(programming);
        myCourses.add(economics);
        myCourses.add(agricultural);
        myCourses.add(mechanics);
        myCourses.add(electrical);

        DefaultMutableTreeNode java,python,javascript,C_Programming,C_Sharp,Ruby,HTML,CSS,c_plus_plus;

        java = new DefaultMutableTreeNode("Java");
        python = new DefaultMutableTreeNode("Python");
        javascript = new DefaultMutableTreeNode("JavaScript");
        C_Programming = new DefaultMutableTreeNode("C");
        c_plus_plus = new DefaultMutableTreeNode("C++");
        C_Sharp = new DefaultMutableTreeNode("C_Sharp");
        Ruby = new DefaultMutableTreeNode("Ruby");
        HTML = new DefaultMutableTreeNode("HTML");
        CSS = new DefaultMutableTreeNode("CSS");

        programming.add(java);
        programming.add(python);
        programming.add(javascript);
        programming.add(C_Programming);
        programming.add(c_plus_plus);
        programming.add(C_Sharp);
        programming.add(Ruby);
        programming.add(HTML);
        programming.add(CSS);

        DefaultMutableTreeNode micro,macro,business_analytics,emphasized_economics;

        micro = new DefaultMutableTreeNode("Micro Economics");
        macro = new DefaultMutableTreeNode("Macro Economics");
        business_analytics = new DefaultMutableTreeNode("Business Analytics");
        emphasized_economics = new DefaultMutableTreeNode("Emphasized of Economics");

        finance.add(micro);
        finance.add(macro);
        finance.add(business_analytics);
        finance.add(emphasized_economics);


        DefaultMutableTreeNode nurture_of_agriculture,Exploration_of_agriculture,exposres_of_agricultural;

        nurture_of_agriculture = new DefaultMutableTreeNode("Nurture of Agriculture");
        Exploration_of_agriculture = new DefaultMutableTreeNode("Exploration of Agriculture");
        exposres_of_agricultural = new DefaultMutableTreeNode("Exposure of Agriculture");

        agricultural.add(nurture_of_agriculture);
        agricultural.add(Exploration_of_agriculture);
        agricultural.add(exposres_of_agricultural);

        DefaultMutableTreeNode mechanisms_of_exploration,process_of_mechanical,Quotes_of_mechanical;

        mechanisms_of_exploration = new DefaultMutableTreeNode("Mechanisms of Exploration");
        process_of_mechanical = new DefaultMutableTreeNode("Process of Mechanical");
        Quotes_of_mechanical = new DefaultMutableTreeNode("Quotes of Mechanical");

        mechanics.add(nurture_of_agriculture);
        mechanics.add(Exploration_of_agriculture);
        mechanics.add(exposres_of_agricultural);

        myCourses.add(programming);
        myCourses.add(economics);
        myCourses.add(agricultural);
        myCourses.add(mechanics);
        myCourses.add(electrical);
        myCourses.add(finance);

        JTree myTree = new JTree(myCourses);
        myTree.setBounds(25,25,200,200);

        this.add(myTree);

        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Tree_Process02();
    }
}
