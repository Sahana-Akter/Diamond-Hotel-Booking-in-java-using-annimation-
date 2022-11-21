package hotelbooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class update extends JFrame implements ActionListener
{
    JComboBox comboid;
    JTextField tfnumber,tfname,tfcountry,tfdeposit,croom,gendercombo;
    //Choice croom;
    JLabel checkintime;
    JButton add,cancle,update,check;
    Choice ccustomer;
    update()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text=new JLabel("Your Information Update");
        text.setBounds(100,20,300,30);
        text.setFont(new Font("Raleway",Font.PLAIN,20));
        add(text);


        JLabel lblid= new JLabel("ID");
        lblid.setBounds(35,80,100,20);
        lblid.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblid);

        ccustomer=new Choice();
        ccustomer.setBounds(200,80,150,25);
        add(ccustomer);

        try
        {
            Conn c=new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next())
            {
                ccustomer.add(rs.getString("number"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        JLabel lblname= new JLabel("Name");
        lblname.setBounds(35,120,100,20);
        lblname.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblname);

        tfname=new JTextField();
        tfname.setBounds(200,120,150,20);
        add(tfname);

        JLabel lblclean = new JLabel("Gender");
        lblclean.setFont(new Font("Raleway",Font.PLAIN,20));
        lblclean.setBounds(35,160,100,20);
        add(lblclean);

        gendercombo=new JTextField();
        gendercombo.setBounds(200,160,150,20);
        gendercombo.setBackground(Color.WHITE);
        gendercombo.setEditable(true);
        add(gendercombo);

        JLabel lblcountry= new JLabel("Country");
        lblcountry.setBounds(35,190,120,30);
        lblcountry.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblcountry);

        tfcountry=new JTextField();
        tfcountry.setBounds(200,190,150,25);
        add(tfcountry);

        JLabel lblroom= new JLabel("Room Choice");
        lblroom.setBounds(35,240,150,20);
        lblroom.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lblroom);

        croom=new JTextField();
        croom.setBounds(200,240,150,20);
        croom.setBackground(Color.WHITE);
        add(croom);

        JLabel lbltime= new JLabel("Checkin Time");
        lbltime.setBounds(35,280,150,20);
        lbltime.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lbltime);

        java.util.Date date= new Date();

        checkintime= new JLabel(""+date);
        checkintime.setBounds(200,280,150,25);
        checkintime.setFont(new Font("Raleway",Font.PLAIN,16));
        add(checkintime);

        JLabel lbldeposit= new JLabel("Amount Paid");
        lbldeposit.setBounds(35,320,150,20);
        lbldeposit.setFont(new Font("Raleway",Font.PLAIN,20));
        add(lbldeposit);

        tfdeposit=new JTextField();
        tfdeposit.setBounds(200,320,150,25);
        add(tfdeposit);


        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(50,410,120,30);
        check.addActionListener(this);
        add(check);

        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(200,410,120,30);
        update.addActionListener(this);
        add(update);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(450,50,300,350);
        add(image);

        setBounds(350,200,800,550);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==check)
        {
            String id=ccustomer.getSelectedItem();
            String query="select *from customer where number ='"+id+"'";
            try
            {
                Conn c= new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next())
                {
                    tfname.setText(rs.getString("name"));
                    gendercombo.setText(rs.getString("gender"));
                    tfcountry.setText(rs.getString("country"));
                    croom.setText(rs.getString("room"));
                    checkintime.setText(rs.getString("checkintime"));
                    tfdeposit.setText(rs.getString("deposit"));


                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==update)
        {
            String number =ccustomer.getSelectedItem();
            String room=croom.getText();
            String name=tfname.getText();
            String checkin=checkintime.getText();
            String deposit=tfdeposit.getText();
            try
            {
                Conn c= new Conn();
                c.s.executeUpdate("update customer set room ='"+room+"',name ='"+name+"',checkintime ='"+checkin+"',deposit ='"+deposit+"'where number = '"+number+"'");
                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                setVisible(false);
                new hotelbooking.splashscreen.SplashScreen(null,true).setVisible(true);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            setVisible(false);
            new login();

        }
        else
        {
            setVisible(false);
            new login();

        }
    }

    public static void main(String[] args)
    {

        new update();
    }

}

