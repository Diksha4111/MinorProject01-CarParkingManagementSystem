/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class Home_bookslot extends javax.swing.JFrame {

    //private String slotname;

    //public String slotname;

    /**
     * Creates new form Home_login
     */
    public Home_bookslot() {
        initComponents();
    }
    
    
    //creating sql connection
    //Connection con;
    PreparedStatement pst;
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/minorproject1", "root","Diksha@1503");
            //Statement smt = con.createStatement();
            System.out.println("Connection done successfully");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        timePicker1 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcarplateno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtentrytime = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtentrydate = new datechooser.beans.DateChooserCombo();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        timePicker1.setForeground(new java.awt.Color(53, 53, 164));
        timePicker1.setDisplayText(txtentrytime);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(368, 472));
        setMinimumSize(new java.awt.Dimension(368, 472));
        setPreferredSize(new java.awt.Dimension(368, 472));

        jPanel1.setBackground(new java.awt.Color(5, 2, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(368, 472));
        jPanel1.setMinimumSize(new java.awt.Dimension(368, 472));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Enter Details");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Name");

        txtname.setBackground(new java.awt.Color(5, 2, 29));
        txtname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 204));
        txtname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 12, 58), 2));
        txtname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Mobile no.");

        txtmobileno.setBackground(new java.awt.Color(5, 2, 29));
        txtmobileno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtmobileno.setForeground(new java.awt.Color(255, 255, 204));
        txtmobileno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtmobileno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 12, 58), 2));
        txtmobileno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtmobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobilenoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Car Plate no.");

        txtcarplateno.setBackground(new java.awt.Color(5, 2, 29));
        txtcarplateno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtcarplateno.setForeground(new java.awt.Color(255, 255, 204));
        txtcarplateno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcarplateno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 12, 58), 2));
        txtcarplateno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Time");

        jPanel2.setBackground(new java.awt.Color(53, 53, 164));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 10, 41)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setBackground(new java.awt.Color(17, 12, 58));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Book");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtentrytime.setBackground(new java.awt.Color(5, 2, 29));
        txtentrytime.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtentrytime.setForeground(new java.awt.Color(255, 255, 204));
        txtentrytime.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtentrytime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 12, 58), 2));
        txtentrytime.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtentrytime.setSelectionColor(new java.awt.Color(53, 53, 164));

        jPanel4.setBackground(new java.awt.Color(53, 53, 164));

        jLabel12.setBackground(new java.awt.Color(53, 53, 164));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Select Time");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtentrydate.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    txtentrydate.setCalendarBackground(new java.awt.Color(5, 2, 29));
    txtentrydate.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.BOLD, 12));
    txtentrydate.setNavigateFont(new java.awt.Font("Century Gothic", java.awt.Font.BOLD, 12));
    txtentrydate.setShowOneMonth(true);

    jPanel3.setBackground(new java.awt.Color(53, 53, 164));

    jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 204));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Book Slot");

    jLabel9.setBackground(new java.awt.Color(17, 12, 58));
    jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 204));
    jLabel9.setText("< Back");
    jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jLabel9MousePressed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel9)
            .addGap(70, 70, 70)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel9)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(18, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(16, 16, 16))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtmobileno)
                        .addComponent(txtname)
                        .addComponent(txtcarplateno)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtentrytime, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtentrydate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel2))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(98, 98, 98)))
            .addContainerGap(43, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel4)
                .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txtcarplateno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtentrytime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addComponent(txtentrydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(61, 61, 61))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenoActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed

        new Home().show();
        
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        
        timePicker1.showPopup(this,100,100);
    }//GEN-LAST:event_jLabel12MousePressed

    public void book(){
        
                String name, mobileno, carplateno, entrydate, entrytime;
                //id = txtid.getText();
                name = txtname.getText();
                mobileno = txtmobileno.getText();
                carplateno = txtcarplateno.getText();
                entrydate = txtentrydate.getText();
                entrytime = txtentrytime.getText();
                
                
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                String slotname ="";
                String s = "";
                
                
                try {
                    //for adding data in table UserDetails
                    String query = "insert into UserDetails(Name,MobileNo,CarPlateNo,EntryDate,EntryTime)values(?,?,?,?,?)";
                    pst = Home_bookslot.connect().prepareStatement(query);
                    //pst = con.prepareStatement(query);
                    //pst.setString(1, id);
                    pst.setString(1, name);
                    pst.setString(2, mobileno);
                    pst.setString(3, carplateno);
                    pst.setString(4, entrydate);
                    pst.setString(5, entrytime);
                    //pst.setString(6,null);

                    pst.executeUpdate();
                    //JOptionPane.showMessageDialog(null, "Record Added");
                    //table_load();
                    txtname.setText("");
                    txtmobileno.setText("");
                    txtcarplateno.setText("");
                    txtentrytime.setText("");
                    txtentrydate.setText("");
                    txtcarplateno.requestFocus();
                    
                    
                    //for fetching optimal slot from the table Slots
                    
                    String query1 = "select Distance from Slots where SlotNo is null";
                    pst = Home_bookslot.connect().prepareStatement(query1);
                    ResultSet rs1 = pst.executeQuery(query1);
                    ResultSetMetaData rsmd = rs1.getMetaData();
                    int columnsNumber = rsmd.getColumnCount();
                    while (rs1.next()) {
                        for (int i = 1; i <= columnsNumber; i++) {
                            if (i > 1) System.out.print(",  ");
                            Integer columnValue = rs1.getInt(i);
                            //int value = Integer.parseInt(columnValue); 
                            //System.out.print(columnValue);
                            pq.add(columnValue);
                            
                        }
                        System.out.println("");
                    }
                    /*while (!pq.isEmpty()) {
                        Integer i = pq.poll();
                        System.out.println(i);
                    }*/
                    int dist = pq.peek();
                    ResultSet rs2 = pst.executeQuery("select SlotName from Slots where Distance='"+dist+"' and SlotNo is null");
                    while(rs2.next()){
                         slotname = rs2.getString("SlotName");
                    }
                    System.out.println("Your slot distance is : "+ dist);
                    System.out.println("Your slotname is : "+ slotname);
                    
                    s = slotname.replace("s", "");
                    int slot = Integer.parseInt(s);
                    System.out.println(slot);
                    
                    //update slotno from null to some value
                    String query2 = "update Slots set SlotNo='"+slot+"' where SlotName='"+slotname+"'";
                    pst.execute(query2);   
                } 
                catch (SQLException e1) {
                    e1.printStackTrace();
                }// TODO add your handling code here:
                
                
                String msg = "Your Slotno. is: " + s;
                JOptionPane.showMessageDialog(null, msg );
                
                
    
    }
                    /*while (!pq.isEmpty()) {
                        Integer i = pq.poll();
                        System.out.println(i);
                    }*/
                    /*int slotno = pq.peek();
                    ResultSet rs2 = pst.executeQuery("select SlotName from Slots where Distance =" +slotno);
                    while(rs2.next()){
                         slotname = rs2.getString("SlotName");
                    }
                    System.out.println("Your slot distance is : "+ slotno);
                    System.out.println("Your slotname is : "+ slotname);

                    /*while(rs.next())  {
                        System.out.println(rs.get<varchar>(1)+"  "+rs.get<int>(2)+"  "+rs.get<int>(3));
                    } */ 
                   
                
                /*catch (SQLException e1) {
                    e1.printStackTrace();
                }
            
                return slotname;
    }*/
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
                
                
                book();
                
    }//GEN-LAST:event_jLabel8MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_bookslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_bookslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_bookslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_bookslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_bookslot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.TimePicker timePicker1;
    private javax.swing.JTextField txtcarplateno;
    private datechooser.beans.DateChooserCombo txtentrydate;
    private javax.swing.JTextField txtentrytime;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
