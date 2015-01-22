package com.sangamclub.DAY2;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by User on 12/27/2014.
 */
public class MYmain {
    public static void main(String[] args) {
        Teacher mathTeacher=new Teacher();
        Face roundFace=new Face();
        roundFace.color="black";
        roundFace.shape="round";
        mathTeacher.teacherFace=roundFace;
        mathTeacher.name = "Jha";

        System.out.println("My Math teachers' name is " + mathTeacher.name + " His face details is " + mathTeacher.teacherFace.shape);
    Facebook my = new Facebook();
        my.family_member=3;
        my.followers=9;
        my.friends=100;
        System.out.println(my.family_member+" "+my.followers+" "+my.friends);
    }
}
