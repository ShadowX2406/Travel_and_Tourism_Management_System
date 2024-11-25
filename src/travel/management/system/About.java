package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {

    About (){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel l1 = new JLabel("About");
        l1.setBounds(150,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);


        String readme = """
# Travel Management System

## Overview
The **Travel Management System** is a desktop-based application
designed for efficient management of hotel and travel package
bookings.
It allows users to book, view, and delete bookings through an
intuitive graphical user interface (GUI) built using Java Swing.
The application ensures seamless data handling with JDBC
for database operations.

## Features
- **Hotel Booking**:
  - Book hotels based on location and availability.
  - View and manage existing hotel bookings.
  - Delete unwanted bookings.

- **Travel Packages**:
  - Explore various travel packages tailored for vacations,
    adventures, or business trips.
  - Book, view, and delete travel packages.

- **User-friendly Interface**: Simple and intuitive GUI designed
    with Java Swing for effortless navigation.
- **Database Management**: Robust storage and retrieval of data
    using JDBC.

## Technologies Used
- **Frontend**: Java Swing (for GUI development).
- **Backend**: Java.
- **Database**: MySQL (or your preferred relational database).
- **Database Connectivity**: JDBC.

### Prerequisites
1. Install **Java Development Kit (JDK)** version 8 or higher.
2. Install **MySQL Server** (or compatible RDBMS).
3. Set up the database by importing the provided schema and data.

""";

        TextArea area = new TextArea(readme,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);

        setVisible(true );
    }

    public static void main(String[] args) {
        new About();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}