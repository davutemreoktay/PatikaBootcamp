package com.patikaDev.View;

import com.patikaDev.Helper.Config;
import com.patikaDev.Helper.Helper;
import com.patikaDev.Model.User;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentSignUpGUI extends JFrame{
    private JPanel wrapper;
    private JTextField txt_name;
    private JTextField txt_uname;
    private JTextField txt_password;
    private JButton btn_signup;

        public StudentSignUpGUI(){
            add(wrapper);
            setSize(400,400);
            setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setTitle(Config.PROJECT_TITLE);
            setResizable(false);
            setVisible(true);

            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    LoginGUI loginGUI = new LoginGUI();
                }
            });

            btn_signup.addActionListener(e -> {
                if(Helper.isFieldEmpty(txt_name) || Helper.isFieldEmpty(txt_uname) || Helper.isFieldEmpty(txt_password)){
                    Helper.showMsg("fill");
                }else{
                    if(User.add(txt_name.getText(),txt_uname.getText(),txt_password.getText(),"student")){
                        Helper.showMsg("success");
                        dispose();

                    }
                }
            });

        }


}
