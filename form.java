package com.mycompany.project;
import java.io.*;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.table.DefaultTableModel;
import com.mycompany.pack1.*;
import java.util.Comparator;

public class form extends javax.swing.JFrame{
    String name,num_days, start_date, return_date, amt, num;  
    static Queue<User> q = new PriorityQueue<User>(20, (Comparator<User>) new pqueue_Comparator());
    bike b1,b2,b3;
    public form() {
        b1 = new bike("KA02N6784" ,"Bajaj Platina");
        b2 = new bike("KA78M8922", "Bajaj Dominar");
        b3 = new bike("KA80K8900", "Pulsar");
        initComponents();           
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        startDate_field = new javax.swing.JFormattedTextField();
        startDate = new javax.swing.JLabel();
        format1 = new javax.swing.JLabel();
        returnDate = new javax.swing.JLabel();
        format2 = new javax.swing.JLabel();
        returnDate_field = new javax.swing.JFormattedTextField();
        deposit = new javax.swing.JLabel();
        amount = new javax.swing.JFormattedTextField();
        phno = new javax.swing.JLabel();
        Phno = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Allot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        available = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        name_return = new javax.swing.JLabel();
        name_return_field = new javax.swing.JTextField();
        reg_no = new javax.swing.JLabel();
        regNo_field = new javax.swing.JTextField();
        brand = new javax.swing.JLabel();
        brand_field = new javax.swing.JTextField();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike Renting Service");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(500, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {b1.regNo, b1.brand},
                {b2.regNo, b2.brand},
                {b3.regNo, b3.brand},
                {null,null}

            },
            new String [] {
                "Registration No", "Brand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bikes Available", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setForeground(new java.awt.Color(51, 51, 0));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        startDate_field.setEditable(false);
        startDate_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-mm-yyyy"))));
        startDate_field.setText(((java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")).format(java.time.LocalDate.now())).toString());
        startDate_field.setToolTipText("");
        startDate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDate_fieldActionPerformed(evt);
            }
        });

        startDate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        startDate.setForeground(new java.awt.Color(51, 51, 0));
        startDate.setText("Start Date");

        format1.setText("(dd-mm-yyyy)");

        returnDate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        returnDate.setForeground(new java.awt.Color(51, 51, 0));
        returnDate.setText("Return Date");

        format2.setText("(dd-mm-yyyy)");

        returnDate_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-mm-yyyy"))));
        returnDate_field.setToolTipText("");
        returnDate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnDate_fieldActionPerformed(evt);
            }
        });

        deposit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        deposit.setForeground(new java.awt.Color(51, 51, 0));
        deposit.setText("Deposit Amount");

        amount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        phno.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        phno.setForeground(new java.awt.Color(51, 51, 0));
        phno.setText("Phone Number");

        Phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhnoActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Name.setForeground(new java.awt.Color(51, 51, 0));
        Name.setText("Name");

        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(returnDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(format2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deposit)
                            .addComponent(phno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnDate_field)
                            .addComponent(amount)
                            .addComponent(Phno)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(startDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(format1)
                                .addGap(42, 42, 42)
                                .addComponent(startDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Name))
                                .addGap(158, 158, 158)
                                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate)
                    .addComponent(format1)
                    .addComponent(startDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnDate)
                    .addComponent(format2)
                    .addComponent(returnDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(submit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phno)
                            .addComponent(Phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Request a Bike", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        Allot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Allot.setForeground(new java.awt.Color(51, 51, 0));
        Allot.setText("Allot");
        Allot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllotActionPerformed(evt);
            }
        });

        available.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg No", "Brand"
            }
        ));
        jScrollPane1.setViewportView(available);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Bike Available to");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(Allot, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(Allot)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bike Allotment", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        name_return.setBackground(new java.awt.Color(51, 51, 0));
        name_return.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name_return.setText("Name");

        name_return_field.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        reg_no.setBackground(new java.awt.Color(51, 51, 0));
        reg_no.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reg_no.setText("Bike Registration No");

        regNo_field.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        brand.setBackground(new java.awt.Color(51, 51, 0));
        brand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        brand.setText("Brand");

        brand_field.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        brand_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_fieldActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Return.setForeground(new java.awt.Color(51, 51, 0));
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_return, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg_no)
                            .addComponent(brand))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regNo_field)
                            .addComponent(name_return_field)
                            .addComponent(brand_field, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_return, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_return_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reg_no)
                    .addComponent(regNo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand)
                    .addComponent(brand_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(Return)
                .addGap(180, 180, 180))
        );

        jTabbedPane1.addTab("Return Bike", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class CustException extends Exception
    {
        public CustException(String str)
        {
            javax.swing.JOptionPane.showMessageDialog(jPanel2,str);
        }
    }

    class excep
    {
        public void check() throws CustException {
            if(name_field.getText().equals("") && returnDate_field.getText().equals("") && amount.getText().equals("") && Phno.getText().equals(""))
        {
            throw new CustException("Details in the fields missing\n");
        }
        else if(name_field.getText().equals("") || returnDate_field.getText().equals("") || amount.getText().equals("") || Phno.getText().equals(""))
        {
            throw new CustException("Details in the fields missing\n");
        }
        else{
        if(Phno.getText().length()!=10)
        {
            javax.swing.JOptionPane.showMessageDialog(jPanel2,"Phone Number not valid\n");
        }
        else{
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\Sunil kumar\\Documents\\NetBeansProjects\\project\\src\\main\\java\\com\\mycompany\\project\\data.txt",true);
            name = name_field.getText();
            start_date = startDate_field.getText();
            return_date = returnDate_field.getText();
            amt = amount.getText();
            num = Phno.getText();
            f.write("Name : " + name + "\nStart Date : " + start_date + "\nReturn Date : " + return_date + "\nDeposit : " + amt + "\nPhone Number : " + num + "\n\n\n");
            f.close();
        }
        catch(IOException E)
        {}
        name_field.setText("");
        startDate_field.setText(((java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")).format(java.time.LocalDate.now())).toString());
        returnDate_field.setText("");
        amount.setText("");
        Phno.setText("");
        User u = new User(name,start_date,return_date,amt,num);
        q.add(u);
        javax.swing.JOptionPane.showMessageDialog(jPanel2,"Request for bike sent\n");
        }
        }
    }}
    
    private void AllotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllotActionPerformed
        Iterator<User> itr;
        itr = q.iterator();
        Object o1 = jTable2.getModel().getValueAt(0,0);
        Object o2 = jTable2.getModel().getValueAt(0,1);
        while(((o1!=null) && (o2!=null)) && itr.hasNext())
        {
                String bike_regNo = q.peek().BikeNo(o1.toString());
                String brand_name = q.peek().Brand(o2.toString());
                DefaultTableModel m1 = (DefaultTableModel)available.getModel();
                m1.addRow(new Object[]{q.peek().getName(),q.peek().bikeNo,q.peek().brand});
                try{
                FileWriter f2 = new FileWriter("C:\\Users\\Sunil kumar\\Documents\\NetBeansProjects\\project\\src\\main\\java\\com\\mycompany\\project\\allot.txt",true);
                f2.write(q.poll().display() + "\n");
                f2.close();
                }
                catch(IOException e)
                {}
                //System.out.println("Bike - " + bike_regNo + " " + brand_name + " " + "alloted to " + q.poll().getName());
                
                ((DefaultTableModel)jTable2.getModel()).removeRow(0);
                o1 = jTable2.getModel().getValueAt(0,0);
                o2 = jTable2.getModel().getValueAt(0,1);
        }
        if(q.isEmpty())
            javax.swing.JOptionPane.showMessageDialog(jPanel3,"No requests");
        else if(jTable2.getRowCount()!=1)
            javax.swing.JOptionPane.showMessageDialog(jPanel3,"No bikes available");
    }//GEN-LAST:event_AllotActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        
    }//GEN-LAST:event_name_fieldActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        excep e = new excep();
        try
        {
            e.check();
        }
        catch(CustException c)
        {}
    }//GEN-LAST:event_submitActionPerformed

    private void PhnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhnoActionPerformed
        
    }//GEN-LAST:event_PhnoActionPerformed

    private void returnDate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnDate_fieldActionPerformed
        
    }//GEN-LAST:event_returnDate_fieldActionPerformed

    private void startDate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDate_fieldActionPerformed
        
    }//GEN-LAST:event_startDate_fieldActionPerformed

    private void brand_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_fieldActionPerformed

    }//GEN-LAST:event_brand_fieldActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        if(name_return_field.getText().equals("") && regNo_field.getText().equals("") && brand_field.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(jPanel4,"Details in the fields missing\n");
        }
        else if(name_return_field.getText().equals("") || regNo_field.getText().equals("") || brand_field.getText().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(jPanel4,"Details in the fields missing\n");
        }
        else
        {
        DefaultTableModel m = (DefaultTableModel)jTable2.getModel();
        bike b = new bike(regNo_field.getText(), brand_field.getText());
        m.insertRow(0,new Object[]{b.regNo,b.brand});
        try{
        FileWriter f1 = new FileWriter("C:\\Users\\Sunil kumar\\Documents\\NetBeansProjects\\project\\src\\main\\java\\com\\mycompany\\project\\bike return.txt",true);
        f1.write(b.display() + name_return_field + "\n");
        f1.close();
        }
        catch(IOException e)
        {}
        name_return_field.setText("");
        regNo_field.setText("");
        brand_field.setText("");
        javax.swing.JOptionPane.showMessageDialog(jPanel4,"Bike returned");
        }
    }//GEN-LAST:event_ReturnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
                new form().setVisible(true);
           }
        });  
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Allot;
    public static javax.swing.JLabel Name;
    public static javax.swing.JTextField Phno;
    public static javax.swing.JButton Return;
    public static javax.swing.JFormattedTextField amount;
    public static javax.swing.JTable available;
    public static javax.swing.JLabel brand;
    public static javax.swing.JTextField brand_field;
    public static javax.swing.JLabel deposit;
    public static javax.swing.JLabel format1;
    public static javax.swing.JLabel format2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTextField name_field;
    public static javax.swing.JLabel name_return;
    public static javax.swing.JTextField name_return_field;
    public static javax.swing.JLabel phno;
    public static javax.swing.JTextField regNo_field;
    public static javax.swing.JLabel reg_no;
    public static javax.swing.JLabel returnDate;
    public static javax.swing.JFormattedTextField returnDate_field;
    public static javax.swing.JLabel startDate;
    public static javax.swing.JFormattedTextField startDate_field;
    public static javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
