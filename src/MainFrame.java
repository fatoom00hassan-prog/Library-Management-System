/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




//import static ManageCategory.jTable1;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author HP
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Resturent
     */
    public MainFrame() {
        initComponents();
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
         jTabbedPane1.setTitleAt(0, "");
          jTabbedPane1.setTitleAt(1, "");
           jTabbedPane1.setTitleAt(2, "");
            jTabbedPane1.setTitleAt(3, "");
             jTabbedPane1.setTitleAt(4, "");
              jTabbedPane1.setTitleAt(5, "");
               jTabbedPane1.setTitleAt(6, "");
                jTabbedPane1.setTitleAt(7, "");
                jTabbedPane1.setTitleAt(8, "");
                 jTabbedPane1.setTitleAt(9, "");
                  jTabbedPane1.setTitleAt(10, "");
                   jTabbedPane1.setTitleAt(11, "");
                    jTabbedPane1.setTitleAt(12, "");
                     jTabbedPane1.setTitleAt(13, "");
                       jTabbedPane1.setTitleAt(14, "");
                      jTabbedPane1.setEnabledAt(0, false);
                      jTabbedPane1.setEnabledAt(1, false);
                      jTabbedPane1.setEnabledAt(2, false);
                      jTabbedPane1.setEnabledAt(3, false);
                      jTabbedPane1.setEnabledAt(4, false);
                       jTabbedPane1.setEnabledAt(5, false);
                      jTabbedPane1.setEnabledAt(6, false);
                      jTabbedPane1.setEnabledAt(7, false);
                      jTabbedPane1.setEnabledAt(8, false);
                      jTabbedPane1.setEnabledAt(9, false);
                       jTabbedPane1.setEnabledAt(10, false);
                      jTabbedPane1.setEnabledAt(11, false);
                      jTabbedPane1.setEnabledAt(12, false);
                      jTabbedPane1.setEnabledAt(13, false);
                    jTabbedPane1.setEnabledAt(14, false);
                     
                  //    jTabbedPane1.setTitleAt(14, "");
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
         //jTabbedPane1.setVisible(false);
         
                     // jTabbedPane1.setTitleAt(14, "");
        UIManager.put("TabbedPane.selected", Color.white);
        UIManager.put("TabbedPane.unselected", Color.white);
         UIManager.put("TabbedPane.selectedforeground", Color.white);
          UIManager.put("TabbedPane.unselectedforeground", Color.white);
       // UIManager.put("TabbedPane.unselected", Color.white);
      //    jTabbedPane1.setEnabledAt(5, false);
        //jTabbedPane1.setEnabledAt(2, false);
        //jTabbedPane1.setEnabledAt(3, false);
       // jTabbedPane1.setEnabledAt(4, false);
       // jTabbedPane1.setBackground( Color.red);
      //  jTabbedPane1.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
   // @Override
   // protected void installDefaults() {
     //   highlight = shadow = darkShadow = lightHighlight = null;
       //         }});
//jTabbedPane1.setPreferredSize(new Dimension(0,0));
     //   jTabbedPane1.remove(0);
     jTableUsersign.setVisible(false);
      backbuttonadmin.setVisible(false);
        backbuttonmember.setVisible(false);
         backbuttonsearchmember.setVisible(false);
       backbuttonsearchadmin.setVisible(false);
        backbuttonbowrroadmin.setVisible(false);
       backbuttonbowrrmember.setVisible(false);
  jtablecolor(jTablereport);
    jtablecolor(jTableUser);
     jtablecolor(jTableBook);
      jtablecolor(jTableCat);
      jtablecolor(jTableManager);
     jtablecolor(jTablesearch);
       jtablecolor(jTableManager);
        jtablecolor(jTableorrow);
         jtablecolor(jTableFine);
          jtablecolor(jTablereserve);
          // jtablecolor(jTableFine);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        welcomLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        customerButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        backbutton3 = new javax.swing.JButton();
        Right4 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        Left5 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtunameReader = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtpasswordReader = new javax.swing.JPasswordField();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        backbutton1 = new javax.swing.JButton();
        Left1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButtonresver = new javax.swing.JButton();
        Right1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Left2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Right2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        backbutton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        backbutton4 = new javax.swing.JButton();
        Left6 = new javax.swing.JPanel();
        txtuserid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemial = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtrole = new javax.swing.JComboBox<>();
        addbutton1 = new javax.swing.JButton();
        Right5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        Right3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBook = new javax.swing.JTable();
        Left7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBookid = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtShelf = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtcatbookid = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        deletebutton3 = new javax.swing.JButton();
        updatebutton3 = new javax.swing.JButton();
        addbutton3 = new javax.swing.JButton();
        addbutton4 = new javax.swing.JButton();
        txtBookstat = new javax.swing.JComboBox<>();
        exportfile = new javax.swing.JButton();
        importfile = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        backbutton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        backbutton9 = new javax.swing.JButton();
        Left8 = new javax.swing.JPanel();
        addbutton6 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtcatogryid = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtcatname = new javax.swing.JTextField();
        addbutton7 = new javax.swing.JButton();
        updatebutton4 = new javax.swing.JButton();
        deletebutton4 = new javax.swing.JButton();
        Right8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCat = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        backbutton7 = new javax.swing.JButton();
        Left10 = new javax.swing.JPanel();
        txtuseridsign = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtnamesign = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemialsign = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtpasssign = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        addbutton2 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        txtrolesign = new javax.swing.JComboBox<>();
        Right6 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableUsersign = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        backbutton10 = new javax.swing.JButton();
        Left9 = new javax.swing.JPanel();
        addbutton8 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        addbutton9 = new javax.swing.JButton();
        updatebutton5 = new javax.swing.JButton();
        deletebutton5 = new javax.swing.JButton();
        userComboBox1 = new javax.swing.JComboBox<>();
        Right9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableManager = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        backbuttonsearchadmin = new javax.swing.JButton();
        backbuttonsearchmember = new javax.swing.JButton();
        Left11 = new javax.swing.JPanel();
        comboxsearch = new javax.swing.JComboBox();
        txtnamesearch = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        Right10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablesearch = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Left4 = new javax.swing.JPanel();
        userComboBox = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        bookComboBox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jButtonborrow = new javax.swing.JButton();
        jButtonreturn = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableorrow = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        backbuttonbowrroadmin = new javax.swing.JButton();
        backbuttonbowrrmember = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        backbutton12 = new javax.swing.JButton();
        Left12 = new javax.swing.JPanel();
        addbutton10 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        addbutton11 = new javax.swing.JButton();
        updatebutton6 = new javax.swing.JButton();
        deletebutton6 = new javax.swing.JButton();
        userComboBoxfine = new javax.swing.JComboBox<>();
        Right11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableFine = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        backbuttonadmin1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButtonreport2 = new javax.swing.JButton();
        jButtonreport1 = new javax.swing.JButton();
        jButtonreport4 = new javax.swing.JButton();
        jButtonreport3 = new javax.swing.JButton();
        jButtonreportprint = new javax.swing.JButton();
        jButtonreport5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTablereport = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        Left13 = new javax.swing.JPanel();
        userComboBoxreserve = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        bookComboBoxreserve = new javax.swing.JComboBox();
        jLabel81 = new javax.swing.JLabel();
        jButtonreserve = new javax.swing.JButton();
        jButtonreservecancel = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTablereserve = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        backbuttonadmin = new javax.swing.JButton();
        backbuttonmember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1603, 2570));

        jPanel1.setBackground(new java.awt.Color(250, 230, 209));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1344, 1213));

        customerButton.setBackground(new java.awt.Color(255, 204, 51));
        customerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerButton.setForeground(new java.awt.Color(255, 255, 255));
        customerButton.setText("Manager");
        customerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        welcomLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        welcomLabel.setForeground(new java.awt.Color(153, 51, 0));
        welcomLabel.setText("Welcome to our Library Management System");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG3.png"))); // NOI18N

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 51, 0));
        jLabel38.setText("Library Management System");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customerButton1.setBackground(new java.awt.Color(255, 204, 51));
        customerButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerButton1.setForeground(new java.awt.Color(255, 255, 255));
        customerButton1.setText("Member");
        customerButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(customerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(welcomLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(welcomLabel)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(250, 230, 209));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 51, 0));
        jLabel39.setText("Library Management System");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton.setBackground(new java.awt.Color(255, 204, 51));
        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right.setBackground(new java.awt.Color(250, 230, 209));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoadmin.png"))); // NOI18N

        jButton13.setBackground(new java.awt.Color(255, 204, 51));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Login");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Left.setBackground(new java.awt.Color(182, 141, 104));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN SCREEN");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");

        txtuname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtuname.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(txtuname, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtpassword)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel15.setBackground(new java.awt.Color(250, 230, 209));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(153, 51, 0));
        jLabel45.setText("Library Management System");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton3.setBackground(new java.awt.Color(255, 204, 51));
        backbutton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton3.setForeground(new java.awt.Color(255, 255, 255));
        backbutton3.setText("Back");
        backbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(backbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right4.setBackground(new java.awt.Color(250, 230, 209));
        Right4.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel49.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Library Management System");

        jLabel50.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("copyright © company name All rights reserved");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoReader.png"))); // NOI18N

        jButton14.setBackground(new java.awt.Color(255, 204, 51));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Login");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Right4Layout = new javax.swing.GroupLayout(Right4);
        Right4.setLayout(Right4Layout);
        Right4Layout.setHorizontalGroup(
            Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right4Layout.createSequentialGroup()
                        .addGroup(Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Right4Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Right4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel48))
                            .addGroup(Right4Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Right4Layout.setVerticalGroup(
            Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right4Layout.createSequentialGroup()
                .addGroup(Right4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right4Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Right4Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jLabel49)
                .addGap(26, 26, 26)
                .addComponent(jLabel50)
                .addContainerGap())
        );

        Left5.setBackground(new java.awt.Color(182, 141, 104));
        Left5.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("LOGIN SCREEN");

        jLabel53.setBackground(new java.awt.Color(102, 102, 102));
        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Name");

        txtunameReader.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtunameReader.setForeground(new java.awt.Color(102, 102, 102));

        jLabel54.setBackground(new java.awt.Color(102, 102, 102));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Password");

        jButton15.setBackground(new java.awt.Color(255, 204, 51));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Login");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 204, 51));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Sign");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left5Layout = new javax.swing.GroupLayout(Left5);
        Left5.setLayout(Left5Layout);
        Left5Layout.setHorizontalGroup(
            Left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left5Layout.createSequentialGroup()
                .addGroup(Left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(txtunameReader, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtpasswordReader)))
                    .addGroup(Left5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel52))
                    .addGroup(Left5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left5Layout.setVerticalGroup(
            Left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel52)
                .addGap(27, 27, 27)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtunameReader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpasswordReader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Left5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Left5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(Right4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Left5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel15);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 51, 0));
        jLabel43.setText("Library Management System");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton1.setBackground(new java.awt.Color(255, 204, 51));
        backbutton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton1.setForeground(new java.awt.Color(255, 255, 255));
        backbutton1.setText("Back");
        backbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left1.setBackground(new java.awt.Color(182, 141, 104));
        Left1.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manager Menu");

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText(" Books Management");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("View Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText(" Categories Management");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText(" Users Management");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 204, 51));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("Manager Management");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 204, 51));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setText(" Fines Management");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 204, 51));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setText(" Borrow & Return Books Management");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 204, 51));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton20.setText("Search Book");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButtonresver.setBackground(new java.awt.Color(255, 204, 51));
        jButtonresver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonresver.setText("View Reservation");
        jButtonresver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left1Layout = new javax.swing.GroupLayout(Left1);
        Left1.setLayout(Left1Layout);
        Left1Layout.setHorizontalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Left1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButtonresver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Left1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left1Layout.setVerticalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonresver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Right1.setBackground(new java.awt.Color(250, 230, 209));
        Right1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TASKADMIN.png"))); // NOI18N

        javax.swing.GroupLayout Right1Layout = new javax.swing.GroupLayout(Right1);
        Right1.setLayout(Right1Layout);
        Right1Layout.setHorizontalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Right1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        Right1Layout.setVerticalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Right1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 488, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Right1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        Left2.setBackground(new java.awt.Color(182, 141, 104));
        Left2.setMinimumSize(new java.awt.Dimension(400, 500));

        jButton7.setBackground(new java.awt.Color(255, 204, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Search Book");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 204, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Borrow  & Return  Books");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 204, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText(" Reserve Book");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Member Menu");

        javax.swing.GroupLayout Left2Layout = new javax.swing.GroupLayout(Left2);
        Left2.setLayout(Left2Layout);
        Left2Layout.setHorizontalGroup(
            Left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(Left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        Left2Layout.setVerticalGroup(
            Left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        Right2.setBackground(new java.awt.Color(250, 230, 209));
        Right2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel14.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TaskReader.png"))); // NOI18N

        javax.swing.GroupLayout Right2Layout = new javax.swing.GroupLayout(Right2);
        Right2.setLayout(Right2Layout);
        Right2Layout.setHorizontalGroup(
            Right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right2Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right2Layout.setVerticalGroup(
            Right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 51, 0));
        jLabel44.setText("Library Management System");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton2.setBackground(new java.awt.Color(255, 204, 51));
        backbutton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton2.setForeground(new java.awt.Color(255, 255, 255));
        backbutton2.setText("Back");
        backbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(backbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Right2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 51, 0));
        jLabel46.setText("Library Management System");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton4.setBackground(new java.awt.Color(255, 204, 51));
        backbutton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton4.setForeground(new java.awt.Color(255, 255, 255));
        backbutton4.setText("Back");
        backbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(backbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left6.setBackground(new java.awt.Color(182, 141, 104));
        Left6.setMinimumSize(new java.awt.Dimension(400, 500));
        Left6.setPreferredSize(new java.awt.Dimension(451, 500));

        jLabel33.setBackground(new java.awt.Color(250, 230, 209));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("User ID:");

        jLabel2.setBackground(new java.awt.Color(250, 230, 209));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name:");

        jLabel34.setBackground(new java.awt.Color(250, 230, 209));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Email:");

        jLabel35.setBackground(new java.awt.Color(250, 230, 209));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Password:");

        jLabel36.setBackground(new java.awt.Color(250, 230, 209));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Role:");

        addbutton.setBackground(new java.awt.Color(255, 204, 51));
        addbutton.setForeground(new java.awt.Color(255, 255, 255));
        addbutton.setText("Add");
        addbutton.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        updatebutton.setBackground(new java.awt.Color(255, 204, 51));
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(255, 204, 51));
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("Delete");
        deletebutton.setPreferredSize(new java.awt.Dimension(67, 23));
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(250, 230, 209));
        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("User Management");

        txtrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Reader" }));

        addbutton1.setBackground(new java.awt.Color(255, 204, 51));
        addbutton1.setForeground(new java.awt.Color(255, 255, 255));
        addbutton1.setText("New");
        addbutton1.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left6Layout = new javax.swing.GroupLayout(Left6);
        Left6.setLayout(Left6Layout);
        Left6Layout.setHorizontalGroup(
            Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(Left6Layout.createSequentialGroup()
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addGroup(Left6Layout.createSequentialGroup()
                                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(Left6Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(24, 24, 24))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left6Layout.createSequentialGroup()
                                                .addComponent(jLabel34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(Left6Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addGap(55, 55, 55)))
                                    .addGroup(Left6Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(40, 40, 40)))
                                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemial)
                                    .addComponent(txtname)
                                    .addComponent(txtpass)
                                    .addComponent(txtuserid)
                                    .addComponent(txtrole, 0, 210, Short.MAX_VALUE)))))
                    .addGroup(Left6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Left6Layout.setVerticalGroup(
            Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel37)
                .addGap(28, 28, 28)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(Left6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        Right5.setBackground(new java.awt.Color(250, 230, 209));
        Right5.setPreferredSize(new java.awt.Dimension(400, 300));

        jTableUser.setBackground(new java.awt.Color(242, 213, 201));
        jTableUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableUser.setForeground(new java.awt.Color(102, 0, 0));
        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableUser.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUser.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTableUser.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUser);

        javax.swing.GroupLayout Right5Layout = new javax.swing.GroupLayout(Right5);
        Right5.setLayout(Right5Layout);
        Right5Layout.setHorizontalGroup(
            Right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right5Layout.setVerticalGroup(
            Right5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Right5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left6, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Left6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Right5, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(899, 596));
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });

        Right3.setBackground(new java.awt.Color(250, 230, 209));
        Right3.setPreferredSize(new java.awt.Dimension(400, 500));

        jTableBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBook);

        javax.swing.GroupLayout Right3Layout = new javax.swing.GroupLayout(Right3);
        Right3.setLayout(Right3Layout);
        Right3Layout.setHorizontalGroup(
            Right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        Right3Layout.setVerticalGroup(
            Right3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 362, Short.MAX_VALUE))
        );

        Left7.setBackground(new java.awt.Color(182, 141, 104));
        Left7.setMinimumSize(new java.awt.Dimension(400, 500));
        Left7.setPreferredSize(new java.awt.Dimension(451, 500));

        jLabel40.setBackground(new java.awt.Color(250, 230, 209));
        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Book Management");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Book ID:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Title :");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Author:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ISBN:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ShelfLocation:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("CategoryID:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Status:");

        deletebutton3.setBackground(new java.awt.Color(255, 204, 51));
        deletebutton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebutton3.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton3.setText("Delete");
        deletebutton3.setPreferredSize(new java.awt.Dimension(67, 23));
        deletebutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton3ActionPerformed(evt);
            }
        });

        updatebutton3.setBackground(new java.awt.Color(255, 204, 51));
        updatebutton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebutton3.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton3.setText("Update");
        updatebutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton3ActionPerformed(evt);
            }
        });

        addbutton3.setBackground(new java.awt.Color(255, 204, 51));
        addbutton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbutton3.setForeground(new java.awt.Color(255, 255, 255));
        addbutton3.setText("Add");
        addbutton3.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton3ActionPerformed(evt);
            }
        });

        addbutton4.setBackground(new java.awt.Color(255, 204, 51));
        addbutton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbutton4.setForeground(new java.awt.Color(255, 255, 255));
        addbutton4.setText("New");
        addbutton4.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton4ActionPerformed(evt);
            }
        });

        txtBookstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borrowed", "Available" }));

        exportfile.setBackground(new java.awt.Color(255, 204, 51));
        exportfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportfile.setForeground(new java.awt.Color(255, 255, 255));
        exportfile.setText("export");
        exportfile.setPreferredSize(new java.awt.Dimension(67, 23));
        exportfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportfileActionPerformed(evt);
            }
        });

        importfile.setBackground(new java.awt.Color(255, 204, 51));
        importfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        importfile.setForeground(new java.awt.Color(255, 255, 255));
        importfile.setText("import");
        importfile.setPreferredSize(new java.awt.Dimension(67, 23));
        importfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left7Layout = new javax.swing.GroupLayout(Left7);
        Left7.setLayout(Left7Layout);
        Left7Layout.setHorizontalGroup(
            Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left7Layout.createSequentialGroup()
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left7Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Left7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left7Layout.createSequentialGroup()
                                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addbutton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deletebutton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left7Layout.createSequentialGroup()
                                        .addComponent(importfile, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exportfile, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Left7Layout.createSequentialGroup()
                                        .addComponent(addbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updatebutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Left7Layout.createSequentialGroup()
                                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Left7Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(37, 37, 37)))
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcatbookid)
                                    .addComponent(txtAuthor)
                                    .addComponent(txtTitle)
                                    .addComponent(txtIsbn)
                                    .addComponent(txtShelf)
                                    .addComponent(txtBookid)
                                    .addComponent(txtBookstat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left7Layout.setVerticalGroup(
            Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(13, 13, 13)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcatbookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtBookstat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importfile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportfile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 51, 0));
        jLabel47.setText("Library Management System");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton5.setBackground(new java.awt.Color(255, 204, 51));
        backbutton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton5.setForeground(new java.awt.Color(255, 255, 255));
        backbutton5.setText("Back");
        backbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(49, 49, 49)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(backbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(backbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Right3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left7, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Left7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab6", jPanel6);

        jPanel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel9ComponentShown(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 51, 0));
        jLabel59.setText("Library Management System");

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton9.setBackground(new java.awt.Color(255, 204, 51));
        backbutton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton9.setForeground(new java.awt.Color(255, 255, 255));
        backbutton9.setText("Back");
        backbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(backbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left8.setBackground(new java.awt.Color(182, 141, 104));
        Left8.setMinimumSize(new java.awt.Dimension(400, 500));
        Left8.setPreferredSize(new java.awt.Dimension(451, 500));

        addbutton6.setBackground(new java.awt.Color(255, 204, 51));
        addbutton6.setForeground(new java.awt.Color(255, 255, 255));
        addbutton6.setText("New");
        addbutton6.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton6ActionPerformed(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(250, 230, 209));
        jLabel55.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Category Management");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Category ID:");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("CategoryName: ");

        addbutton7.setBackground(new java.awt.Color(255, 204, 51));
        addbutton7.setForeground(new java.awt.Color(255, 255, 255));
        addbutton7.setText("Add");
        addbutton7.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton7ActionPerformed(evt);
            }
        });

        updatebutton4.setBackground(new java.awt.Color(255, 204, 51));
        updatebutton4.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton4.setText("Update");
        updatebutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton4ActionPerformed(evt);
            }
        });

        deletebutton4.setBackground(new java.awt.Color(255, 204, 51));
        deletebutton4.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton4.setText("Delete");
        deletebutton4.setPreferredSize(new java.awt.Dimension(67, 23));
        deletebutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left8Layout = new javax.swing.GroupLayout(Left8);
        Left8.setLayout(Left8Layout);
        Left8Layout.setHorizontalGroup(
            Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left8Layout.createSequentialGroup()
                        .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left8Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(24, 24, 24))
                            .addGroup(Left8Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(40, 40, 40)))
                        .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcatname)
                            .addComponent(txtcatogryid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left8Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left8Layout.createSequentialGroup()
                        .addComponent(addbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatebutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Left8Layout.setVerticalGroup(
            Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel55)
                .addGap(48, 48, 48)
                .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcatogryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(65, 65, 65)
                .addGroup(Left8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Right8.setBackground(new java.awt.Color(250, 230, 209));
        Right8.setPreferredSize(new java.awt.Dimension(400, 300));

        jTableCat.setBackground(new java.awt.Color(242, 213, 201));
        jTableCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableCat.setForeground(new java.awt.Color(102, 0, 0));
        jTableCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCat.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCat.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTableCat.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCatMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableCat);

        javax.swing.GroupLayout Right8Layout = new javax.swing.GroupLayout(Right8);
        Right8.setLayout(Right8Layout);
        Right8Layout.setHorizontalGroup(
            Right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right8Layout.setVerticalGroup(
            Right8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(Right8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left8, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right8, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(Left8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("tab9", jPanel9);

        jPanel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel7ComponentShown(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(153, 51, 0));
        jLabel68.setText("Library Management System");

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton7.setBackground(new java.awt.Color(255, 204, 51));
        backbutton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton7.setForeground(new java.awt.Color(255, 255, 255));
        backbutton7.setText("Back");
        backbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(backbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left10.setBackground(new java.awt.Color(182, 141, 104));
        Left10.setMinimumSize(new java.awt.Dimension(400, 500));
        Left10.setPreferredSize(new java.awt.Dimension(451, 500));

        jLabel70.setBackground(new java.awt.Color(250, 230, 209));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("User ID:");

        jLabel10.setBackground(new java.awt.Color(250, 230, 209));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Name:");

        jLabel71.setBackground(new java.awt.Color(250, 230, 209));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Email:");

        jLabel72.setBackground(new java.awt.Color(250, 230, 209));
        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Password:");

        jLabel73.setBackground(new java.awt.Color(250, 230, 209));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Role:");

        addbutton2.setBackground(new java.awt.Color(255, 204, 51));
        addbutton2.setForeground(new java.awt.Color(255, 255, 255));
        addbutton2.setText("Singn");
        addbutton2.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton2ActionPerformed(evt);
            }
        });

        jLabel74.setBackground(new java.awt.Color(250, 230, 209));
        jLabel74.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Sign As Member ");

        txtrolesign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reader" }));

        javax.swing.GroupLayout Left10Layout = new javax.swing.GroupLayout(Left10);
        Left10.setLayout(Left10Layout);
        Left10Layout.setHorizontalGroup(
            Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left10Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addGroup(Left10Layout.createSequentialGroup()
                        .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Left10Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left10Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(Left10Layout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(55, 55, 55)))
                            .addGroup(Left10Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(40, 40, 40)))
                        .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtemialsign)
                            .addComponent(txtnamesign)
                            .addComponent(txtpasssign)
                            .addComponent(txtuseridsign, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtrolesign, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left10Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left10Layout.createSequentialGroup()
                        .addComponent(addbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        Left10Layout.setVerticalGroup(
            Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left10Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel74)
                .addGap(37, 37, 37)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuseridsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemialsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpasssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addGap(18, 18, 18)
                .addGroup(Left10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtrolesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(addbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        Right6.setBackground(new java.awt.Color(250, 230, 209));
        Right6.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign.png"))); // NOI18N

        jTableUsersign.setBackground(new java.awt.Color(242, 213, 201));
        jTableUsersign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableUsersign.setForeground(new java.awt.Color(102, 0, 0));
        jTableUsersign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableUsersign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableUsersign.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUsersign.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTableUsersign.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableUsersign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersignMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableUsersign);

        javax.swing.GroupLayout Right6Layout = new javax.swing.GroupLayout(Right6);
        Right6.setLayout(Right6Layout);
        Right6Layout.setHorizontalGroup(
            Right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );
        Right6Layout.setVerticalGroup(
            Right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right6Layout.createSequentialGroup()
                .addGroup(Right6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Right6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Right6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left10, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Left10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Right6, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel16.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel16ComponentShown(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(153, 51, 0));
        jLabel62.setText("Library Management System");

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton10.setBackground(new java.awt.Color(255, 204, 51));
        backbutton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton10.setForeground(new java.awt.Color(255, 255, 255));
        backbutton10.setText("Back");
        backbutton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(backbutton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left9.setBackground(new java.awt.Color(182, 141, 104));
        Left9.setMinimumSize(new java.awt.Dimension(400, 500));
        Left9.setPreferredSize(new java.awt.Dimension(451, 500));

        addbutton8.setBackground(new java.awt.Color(255, 204, 51));
        addbutton8.setForeground(new java.awt.Color(255, 255, 255));
        addbutton8.setText("New");
        addbutton8.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton8ActionPerformed(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(250, 230, 209));
        jLabel64.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText(" Manager Management");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Select User :");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Salary: ");

        addbutton9.setBackground(new java.awt.Color(255, 204, 51));
        addbutton9.setForeground(new java.awt.Color(255, 255, 255));
        addbutton9.setText("Add");
        addbutton9.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton9ActionPerformed(evt);
            }
        });

        updatebutton5.setBackground(new java.awt.Color(255, 204, 51));
        updatebutton5.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton5.setText("Update");
        updatebutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton5ActionPerformed(evt);
            }
        });

        deletebutton5.setBackground(new java.awt.Color(255, 204, 51));
        deletebutton5.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton5.setText("Delete");
        deletebutton5.setPreferredSize(new java.awt.Dimension(67, 23));
        deletebutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left9Layout = new javax.swing.GroupLayout(Left9);
        Left9.setLayout(Left9Layout);
        Left9Layout.setHorizontalGroup(
            Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left9Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left9Layout.createSequentialGroup()
                        .addComponent(addbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left9Layout.createSequentialGroup()
                        .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Left9Layout.createSequentialGroup()
                                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66))
                                .addGap(40, 40, 40)
                                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(salaryField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(userComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(52, 52, 52))))
        );
        Left9Layout.setVerticalGroup(
            Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left9Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel64)
                .addGap(48, 48, 48)
                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(userComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(65, 65, 65)
                .addGroup(Left9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Right9.setBackground(new java.awt.Color(250, 230, 209));
        Right9.setPreferredSize(new java.awt.Dimension(400, 300));

        jTableManager.setBackground(new java.awt.Color(242, 213, 201));
        jTableManager.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableManager.setForeground(new java.awt.Color(102, 0, 0));
        jTableManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableManager.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableManager.setGridColor(new java.awt.Color(255, 255, 255));
        jTableManager.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTableManager.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableManagerMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableManager);

        javax.swing.GroupLayout Right9Layout = new javax.swing.GroupLayout(Right9);
        Right9.setLayout(Right9Layout);
        Right9Layout.setHorizontalGroup(
            Right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right9Layout.setVerticalGroup(
            Right9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Right9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left9, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Left9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Right9, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("tab9", jPanel16);

        jPanel10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel10ComponentShown(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(153, 51, 0));
        jLabel75.setText("Library Management System");

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbuttonsearchadmin.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonsearchadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonsearchadmin.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonsearchadmin.setText("Back");
        backbuttonsearchadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonsearchadminActionPerformed(evt);
            }
        });

        backbuttonsearchmember.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonsearchmember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonsearchmember.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonsearchmember.setText("Back");
        backbuttonsearchmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonsearchmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backbuttonsearchmember, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbuttonsearchadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(backbuttonsearchadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backbuttonsearchmember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left11.setBackground(new java.awt.Color(182, 141, 104));
        Left11.setMinimumSize(new java.awt.Dimension(400, 500));
        Left11.setPreferredSize(new java.awt.Dimension(451, 500));

        comboxsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BookID", "Title", "Author", "ISBN", "ShelfLocation", "CategoryID", "Status" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Value :");

        SearchButton.setBackground(new java.awt.Color(255, 204, 51));
        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Select Crtiria:");

        jLabel88.setBackground(new java.awt.Color(250, 230, 209));
        jLabel88.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Search Book");

        javax.swing.GroupLayout Left11Layout = new javax.swing.GroupLayout(Left11);
        Left11.setLayout(Left11Layout);
        Left11Layout.setHorizontalGroup(
            Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left11Layout.createSequentialGroup()
                .addGroup(Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left11Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Left11Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Left11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(27, 27, 27)
                        .addGroup(Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnamesearch)
                            .addComponent(comboxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left11Layout.setVerticalGroup(
            Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel88)
                .addGap(58, 58, 58)
                .addGroup(Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(Left11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(47, 47, 47)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        Right10.setBackground(new java.awt.Color(250, 230, 209));
        Right10.setPreferredSize(new java.awt.Dimension(400, 300));

        jTablesearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTablesearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablesearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesearchMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTablesearch);

        javax.swing.GroupLayout Right10Layout = new javax.swing.GroupLayout(Right10);
        Right10.setLayout(Right10Layout);
        Right10Layout.setHorizontalGroup(
            Right10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right10Layout.setVerticalGroup(
            Right10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Right10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left11, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Left11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Right10, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab10", jPanel10);

        jPanel8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel8ComponentShown(evt);
            }
        });

        Left4.setBackground(new java.awt.Color(182, 141, 104));
        Left4.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Select User:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Select Book:");

        jButtonborrow.setBackground(new java.awt.Color(255, 204, 51));
        jButtonborrow.setForeground(new java.awt.Color(255, 255, 255));
        jButtonborrow.setText("Borrow Book");
        jButtonborrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonborrowActionPerformed(evt);
            }
        });

        jButtonreturn.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreturn.setText("Return Book");
        jButtonreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreturnActionPerformed(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(250, 230, 209));
        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Borrow & Returen Management");

        jTableorrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableorrow);

        javax.swing.GroupLayout Left4Layout = new javax.swing.GroupLayout(Left4);
        Left4.setLayout(Left4Layout);
        Left4Layout.setHorizontalGroup(
            Left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left4Layout.createSequentialGroup()
                .addGroup(Left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel19)
                        .addGroup(Left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel20)
                                .addGap(32, 32, 32)
                                .addComponent(bookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButtonborrow)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonreturn))
                            .addGroup(Left4Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Left4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        Left4Layout.setVerticalGroup(
            Left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel42)
                .addGap(29, 29, 29)
                .addGroup(Left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(bookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jButtonreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonborrow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(153, 51, 0));
        jLabel57.setText("Library Management System");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbuttonbowrroadmin.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonbowrroadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonbowrroadmin.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonbowrroadmin.setText("Back");
        backbuttonbowrroadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonbowrroadminActionPerformed(evt);
            }
        });

        backbuttonbowrrmember.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonbowrrmember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonbowrrmember.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonbowrrmember.setText("Back");
        backbuttonbowrrmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonbowrrmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addGap(49, 49, 49)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbuttonbowrrmember, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbuttonbowrroadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(backbuttonbowrroadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbuttonbowrrmember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Left4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", jPanel8);

        jPanel11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel11ComponentShown(evt);
            }
        });

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 51, 0));
        jLabel67.setText("Library Management System");

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbutton12.setBackground(new java.awt.Color(255, 204, 51));
        backbutton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbutton12.setForeground(new java.awt.Color(255, 255, 255));
        backbutton12.setText("Back");
        backbutton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbutton12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(backbutton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Left12.setBackground(new java.awt.Color(182, 141, 104));
        Left12.setMinimumSize(new java.awt.Dimension(400, 500));
        Left12.setPreferredSize(new java.awt.Dimension(451, 500));

        addbutton10.setBackground(new java.awt.Color(255, 204, 51));
        addbutton10.setForeground(new java.awt.Color(255, 255, 255));
        addbutton10.setText("New");
        addbutton10.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton10ActionPerformed(evt);
            }
        });

        jLabel78.setBackground(new java.awt.Color(250, 230, 209));
        jLabel78.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Fine Management");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Select User :");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Amount :");

        addbutton11.setBackground(new java.awt.Color(255, 204, 51));
        addbutton11.setForeground(new java.awt.Color(255, 255, 255));
        addbutton11.setText("Add");
        addbutton11.setPreferredSize(new java.awt.Dimension(67, 23));
        addbutton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton11ActionPerformed(evt);
            }
        });

        updatebutton6.setBackground(new java.awt.Color(255, 204, 51));
        updatebutton6.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton6.setText("Make Fine Pad");
        updatebutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton6ActionPerformed(evt);
            }
        });

        deletebutton6.setBackground(new java.awt.Color(255, 204, 51));
        deletebutton6.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton6.setText("Delete");
        deletebutton6.setPreferredSize(new java.awt.Dimension(67, 23));
        deletebutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left12Layout = new javax.swing.GroupLayout(Left12);
        Left12.setLayout(Left12Layout);
        Left12Layout.setHorizontalGroup(
            Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left12Layout.createSequentialGroup()
                        .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80))
                        .addGap(40, 40, 40)
                        .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountField)
                            .addComponent(userComboBoxfine, 0, 210, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left12Layout.createSequentialGroup()
                        .addComponent(addbutton10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbutton11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebutton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left12Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        Left12Layout.setVerticalGroup(
            Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left12Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel78)
                .addGap(49, 49, 49)
                .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(userComboBoxfine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGap(65, 65, 65)
                .addGroup(Left12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Right11.setBackground(new java.awt.Color(250, 230, 209));
        Right11.setPreferredSize(new java.awt.Dimension(400, 300));

        jTableFine.setBackground(new java.awt.Color(242, 213, 201));
        jTableFine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableFine.setForeground(new java.awt.Color(102, 0, 0));
        jTableFine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableFine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFine.setGridColor(new java.awt.Color(255, 255, 255));
        jTableFine.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTableFine.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableFine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFineMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTableFine);

        javax.swing.GroupLayout Right11Layout = new javax.swing.GroupLayout(Right11);
        Right11.setLayout(Right11Layout);
        Right11Layout.setHorizontalGroup(
            Right11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        Right11Layout.setVerticalGroup(
            Right11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(Right11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left12, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(Left12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Right11, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("tab11", jPanel11);

        jPanel13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel13ComponentShown(evt);
            }
        });

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(153, 51, 0));
        jLabel85.setText("Report");

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbuttonadmin1.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonadmin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonadmin1.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonadmin1.setText("Back");
        backbuttonadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonadmin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addGap(237, 237, 237)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(backbuttonadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(backbuttonadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel12.setBackground(new java.awt.Color(242, 213, 201));

        jButtonreport2.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreport2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreport2.setText("Lists the users who have borrowed the highest number of books");
        jButtonreport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreport2ActionPerformed(evt);
            }
        });

        jButtonreport1.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreport1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreport1.setText("Get all books available ");
        jButtonreport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreport1ActionPerformed(evt);
            }
        });

        jButtonreport4.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreport4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreport4.setText("Lists books that have been reserved Last Month");
        jButtonreport4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreport4ActionPerformed(evt);
            }
        });

        jButtonreport3.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreport3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreport3.setText("Shows all currently borrowed books");
        jButtonreport3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreport3ActionPerformed(evt);
            }
        });

        jButtonreportprint.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreportprint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreportprint.setText("Print");
        jButtonreportprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreportprintActionPerformed(evt);
            }
        });

        jButtonreport5.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreport5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreport5.setText("Users with Unpaid Fines");
        jButtonreport5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreport5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonreport1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonreport3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonreport2)
                    .addComponent(jButtonreport4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButtonreport5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jButtonreportprint, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonreport1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonreport2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonreport4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonreport3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonreport5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonreportprint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(182, 141, 104));

        jTablereport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTablereport);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab13", jPanel13);

        jPanel24.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel24ComponentShown(evt);
            }
        });

        Left13.setBackground(new java.awt.Color(182, 141, 104));
        Left13.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Select User:");

        bookComboBoxreserve.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                bookComboBoxreserveComponentShown(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Select Book:");

        jButtonreserve.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreserve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreserve.setText("Reserve Book");
        jButtonreserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreserveActionPerformed(evt);
            }
        });

        jButtonreservecancel.setBackground(new java.awt.Color(255, 204, 51));
        jButtonreservecancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreservecancel.setText("Cancel Reservation");
        jButtonreservecancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreservecancelActionPerformed(evt);
            }
        });

        jLabel82.setBackground(new java.awt.Color(250, 230, 209));
        jLabel82.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Reservation Management");

        jTablereserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTablereserve);

        javax.swing.GroupLayout Left13Layout = new javax.swing.GroupLayout(Left13);
        Left13.setLayout(Left13Layout);
        Left13Layout.setHorizontalGroup(
            Left13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left13Layout.createSequentialGroup()
                .addGroup(Left13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left13Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel41)
                        .addGroup(Left13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left13Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(userComboBoxreserve, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel81)
                                .addGap(32, 32, 32)
                                .addComponent(bookComboBoxreserve, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButtonreserve)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonreservecancel))
                            .addGroup(Left13Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Left13Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        Left13Layout.setVerticalGroup(
            Left13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel82)
                .addGap(29, 29, 29)
                .addGroup(Left13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBoxreserve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(bookComboBoxreserve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(jButtonreservecancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonreserve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(153, 51, 0));
        jLabel83.setText("Library Management System");

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toplogo.png"))); // NOI18N

        backbuttonadmin.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonadmin.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonadmin.setText("Back");
        backbuttonadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonadminActionPerformed(evt);
            }
        });

        backbuttonmember.setBackground(new java.awt.Color(255, 204, 51));
        backbuttonmember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbuttonmember.setForeground(new java.awt.Color(255, 255, 255));
        backbuttonmember.setText("Back");
        backbuttonmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(backbuttonmember, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbuttonadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(backbuttonadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbuttonmember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Left13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Left13, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab8", jPanel24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void jtablecolor(JTable tablecolor){
         tablecolor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable tablecolor, Object value, boolean isSelected,
                                                               boolean hasFocus, int row, int column) {
                    Component cell = super.getTableCellRendererComponent(tablecolor, value, isSelected, hasFocus, row, column);
                    JTableHeader head= tablecolor.getTableHeader();
                     head.setBackground(new Color(0,0,0));
                    // تعيين لون الخلفية لكل صف بناءً على رقمه
                    if (row % 2 == 0) {
                        cell.setBackground(new Color(182,141,104)); // لون بني غامق
                        cell.setForeground(new Color(255, 255, 255));
                    } else {
                        cell.setBackground(new Color(250,230,209)); // بني فاتح
                         cell.setForeground(new Color(0, 0, 0));
                    }
                    
                    // تحديد لون مميز في حالة التحديد
                    if (isSelected) {
                        cell.setBackground(new Color(255, 200, 1)); // برتقالي فاتح عند التحديد
                        cell.setForeground(new Color(255, 255, 255));
                    }

                    return cell;
                }
            });
        
    }
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String username=txtunameReader.getText();
        String pass=txtpasswordReader.getText();
        String query1 = "SELECT Role FROM Users WHERE Name ='"+username+"' AND PasswordHash = '"+pass+"'";

        try {

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query1);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                
                if (rs.getString("Role").equals("Reader")) {
                    JOptionPane.showMessageDialog(null,"Login successfule");
                    // new ReaderMenu().show();
                    jTabbedPane1.setSelectedIndex(4);
                } else {
                     JOptionPane.showMessageDialog(null,"The User Account isn't Reader!");
                }
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid credentials!");
                }
            

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void backbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton3ActionPerformed
 jTabbedPane1.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_backbutton3ActionPerformed

    private void jPanel8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel8ComponentShown
        // TODO add your handling code here:
        loadUsers();
        loadBooks();
        loadTransactions();
        // tblmodel.addRow(new Object[]{id,name,emile,pass,role});

    }//GEN-LAST:event_jPanel8ComponentShown

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        // TODO add your handling code here:
        DefaultTableModel tblmodel=(DefaultTableModel) jTableBook.getModel();
        tblmodel.setRowCount(0);
        try {

            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Books");
            while (rs.next()) {
                int id=rs.getInt("BookID");
                String name=rs.getString("Title");
                String emile=rs.getString("Author");
                String pass=rs.getString("ISBN");
                String role=rs.getString("ShelfLocation");
                int catid=rs.getInt("CategoryID");
                String statues=rs.getString("Status");

                tblmodel.setColumnIdentifiers(new String[]{"BookID","Title","Author","ISBN","ShelfLocation","CategoryID","Status"});
                jTableBook.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id,name,emile,pass,role,catid,statues});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel6ComponentShown

    private void backbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbutton5ActionPerformed

    private void jTableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBookMouseClicked
        // TODO add your handling code here:
        int selectedRow=jTableBook.getSelectedRow();
        if(selectedRow!=-1){
            txtBookid.setText(jTableBook.getValueAt(selectedRow, 0).toString());
            txtTitle.setText(jTableBook.getValueAt(selectedRow, 1).toString());
            txtAuthor.setText(jTableBook.getValueAt(selectedRow, 2).toString());
            txtIsbn.setText(jTableBook.getValueAt(selectedRow, 3).toString());
            txtShelf.setText(jTableBook.getValueAt(selectedRow, 4).toString());
            txtcatbookid.setText(jTableBook.getValueAt(selectedRow, 5).toString());
            //txtBookstat.setText(jTableBook.getValueAt(selectedRow, 6).toString());
             txtBookstat.setSelectedItem(jTableBook.getValueAt(selectedRow, 6).toString());
        }
    }//GEN-LAST:event_jTableBookMouseClicked

    private void addbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton3ActionPerformed
        // TODO add your handling code here:
        if(txtBookid.getText().equals("")||txtTitle.getText().equals("")||txtAuthor.getText().equals("")||txtIsbn.getText().equals("")||txtShelf.getText().equals("")||txtcatbookid.getText().equals("")||txtBookstat.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Data.");
        }
        else{
            String userid=txtBookid.getText();
            String name=txtTitle.getText();
            String email= txtAuthor.getText();
            String pass=txtIsbn.getText();
            String role=txtShelf.getText();
            String cat=txtcatbookid.getText();
            String stat=txtBookstat.getSelectedItem().toString();

            String query = "INSERT INTO Books (Title, Author, ISBN, ShelfLocation,CategoryID,Status) VALUES (?, ?, ?, ?,?,?)";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, pass);
                stmt.setString(4, role);
                stmt.setString(5, cat);
                 stmt.setString(6, stat);
                stmt.executeUpdate();
                System.out.println("Book added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            DefaultTableModel tblmodel=(DefaultTableModel) jTableBook.getModel();
            tblmodel.addRow(new Object[]{userid,name,email,pass,role,cat,stat});
            txtBookid.setText("");
            txtTitle.setText("");
            txtAuthor.setText("");
            txtIsbn.setText("");
            txtShelf.setText("");
            txtcatbookid.setText("");
          //  txtBookstat.setText("");
            JOptionPane.showMessageDialog(null,"Add Data Successfully...");

        }
    }//GEN-LAST:event_addbutton3ActionPerformed

    private void updatebutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton3ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblmodel=(DefaultTableModel) jTableBook.getModel();
        if(jTableBook.getSelectedRowCount()==1){
            String userid=txtBookid.getText();
            String name=txtTitle.getText();
            String email= txtAuthor.getText();
            String pass=txtIsbn.getText();
            String role=txtShelf.getText();
            String cat=txtcatbookid.getText();
            String stat=txtBookstat.getSelectedItem().toString();
            String query = "update Books set Title=? ,Author=?,ISBN=?, ShelfLocation=?, CategoryID=?, Status=? where BookID= '"+userid+"'";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, pass);
                stmt.setString(4, role);
                stmt.setString(5, cat);
                stmt.setString(6, stat);
                stmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            tblmodel.setValueAt(userid,jTableBook.getSelectedRow(),0);
            tblmodel.setValueAt(name,jTableBook.getSelectedRow(),1);
            tblmodel.setValueAt(email,jTableBook.getSelectedRow(),2);
            tblmodel.setValueAt(pass,jTableBook.getSelectedRow(),3);
            tblmodel.setValueAt(role,jTableBook.getSelectedRow(),4);
            tblmodel.setValueAt(cat,jTableBook.getSelectedRow(),5);
            tblmodel.setValueAt(stat,jTableBook.getSelectedRow(),6);
            JOptionPane.showMessageDialog(null,"Update Successfully...");
        }else{
            if(jTableBook.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_updatebutton3ActionPerformed

    private void deletebutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton3ActionPerformed
        // TODO add your handling code here:
        String userid=txtBookid.getText();
        DefaultTableModel tblmodel=(DefaultTableModel) jTableBook.getModel();
        if(jTableBook.getSelectedRowCount()==1){
            tblmodel.removeRow(jTableBook.getSelectedRow());
            String query = "Delete from Books where BookID= (?)";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, userid);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Book Deleted successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            if(jTableBook.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_deletebutton3ActionPerformed

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        DefaultTableModel tblmodel=(DefaultTableModel) jTableUser.getModel();
        tblmodel.setRowCount(0);
        try {

            // Connection conn = DatabaseConnection.getConnection();
            //  Statement stmt = conn.createStatement();
            String sql ="select * from Users";
            ResultSet rs  = DatabaseManager.executeQuery(sql);
            //  ResultSet rs = stmt.executeQuery("select * from Users");
            while (rs.next()) {
                int id=rs.getInt("UserID");
                String name=rs.getString("Name");
                String emile=rs.getString("Email");
                String  pass=rs.getString("PasswordHash");
                String  role=rs.getString("Role");

                DefaultTableModel tblmodelUser=(DefaultTableModel) jTableUser.getModel();
                tblmodel.setColumnIdentifiers(new String[]{"UserID","Name","Email","Password","Role"});
                jTableUser.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id,name,emile,pass,role});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel5ComponentShown

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
        // TODO add your handling code here:
        int selectedRow=jTableUser.getSelectedRow();
        if(selectedRow!=-1){
            txtuserid.setText(jTableUser.getValueAt(selectedRow, 0).toString());
            txtname.setText(jTableUser.getValueAt(selectedRow, 1).toString());
            txtemial.setText(jTableUser.getValueAt(selectedRow, 2).toString());
            txtpass.setText(jTableUser.getValueAt(selectedRow, 3).toString());
            //txtrole.setText(jTableUser.getValueAt(selectedRow, 4).toString());
            txtrole.setSelectedItem(jTableUser.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_jTableUserMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        String userid=txtuserid.getText();
        DefaultTableModel tblmodel=(DefaultTableModel) jTableUser.getModel();
        if(jTableUser.getSelectedRowCount()==1){
            tblmodel.removeRow(jTableUser.getSelectedRow());
            String query = "Delete from Users where UserID= (?)";

            int result = DatabaseManager.executeUpdate(query, userid);

            if (result > 0) {
                DatabaseManager.showmessage("User Deleted successfully!");
            } else {
                DatabaseManager.showmessage("User can not Deleted successfully!");
            }

        }else{
            if(jTableUser.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblmodel=(DefaultTableModel) jTableUser.getModel();
        if(jTableUser.getSelectedRowCount()==1){
            String userid=txtuserid.getText();
            String name=txtname.getText();
            String email= txtemial.getText();
            String pass=txtpass.getText();
            String role=txtrole.getSelectedItem().toString();
            String sql = "update Users set Name=? ,Email=?,PasswordHash=?, Role=? where UserID= '"+userid+"'";
            int result = DatabaseManager.executeUpdate(sql,name,email,pass,role);

            if (result > 0) {
                DatabaseManager.showmessage("Update Successfully...");
            } else {
                DatabaseManager.showmessage("Update UnSuccessfully...");
            }
            tblmodel.setValueAt(userid,jTableUser.getSelectedRow(),0);
            tblmodel.setValueAt(name,jTableUser.getSelectedRow(),1);
            tblmodel.setValueAt(email,jTableUser.getSelectedRow(),2);
            tblmodel.setValueAt(pass,jTableUser.getSelectedRow(),3);
            tblmodel.setValueAt(role,jTableUser.getSelectedRow(),4);

        }else{
            if(jTableUser.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        if(txtuserid.getText().equals("")||txtname.getText().equals("")||txtemial.getText().equals("")||txtpass.getText().equals("")||txtrole.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Data.");
        }
        else{
            String userid=txtuserid.getText();
            String name=txtname.getText();
            String email= txtemial.getText();
            String pass=txtpass.getText();
            String role=txtrole.getSelectedItem().toString();

            String sql = "INSERT INTO Users (Name, Email, PasswordHash, Role) VALUES (?, ?, ?, ?)";

            int result = DatabaseManager.executeUpdate(sql,name,email,pass,role);

            if (result > 0) {
                JOptionPane.showMessageDialog(null,"User Added Successfully...");
            } else {
                JOptionPane.showMessageDialog(null,"Add UnSuccessfully...");
            }

            DefaultTableModel tblmodel=(DefaultTableModel) jTableUser.getModel();
            tblmodel.addRow(new Object[]{userid,name,email,pass,role});
            txtuserid.setText("");
            txtname.setText("");
            txtemial.setText("");
            txtpass.setText("");
            //txtrole.setText("");

        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void backbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbutton4ActionPerformed

    private void backbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_backbutton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        backbuttonbowrrmember.setVisible(true);
         jTabbedPane1.setSelectedIndex(11);
       backbuttonbowrroadmin.setVisible(false);
       jButtonborrow.setEnabled(false);
        jButtonreturn.setEnabled(false);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         backbuttonsearchmember.setVisible(true);
        jTabbedPane1.setSelectedIndex(9);
       backbuttonsearchadmin.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        /* try {

            // Connection conn = DatabaseConnection.getConnection();
            //  Statement stmt = conn.createStatement();
            String sql ="select * from Users";
            ResultSet rs  = DatabaseManager.executeQuery(sql);
            //  ResultSet rs = stmt.executeQuery("select * from Users");
            while (rs.next()) {
                int id=rs.getInt("UserID");
                String  name=rs.getString("Name");
                String  emile=rs.getString("Email");
                String pass=rs.getString("PasswordHash");
                String  role=rs.getString("Role");

                DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
                tblmodel.setColumnIdentifiers(new String[]{"UserID","Name","Email","Password","Role"});
                jTable1.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id,name,emile,pass,role});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
        try {

            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Categories");
            while (rs.next()) {
                int id=rs.getInt("CategoryID");
                String name=rs.getString("CategoryName");

                DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
                tblmodel.setColumnIdentifiers(new String[]{"CategoryID","CategoryName"});
                jTableCat.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id,name});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
        /*    try {

            //Connection conn = DatabaseConnection.getConnection();
            //Statement stmt = conn.createStatement();
            // ResultSet rs = stmt.executeQuery("select * from Books");
            String sqlbook="select * from Books";
            ResultSet rs  = DatabaseManager.executeQuery(sqlbook);
            while (rs.next()) {
                int id1=rs.getInt("BookID");
                String name1=rs.getString("Title");
                String emile1=rs.getString("Author");
                String pass1=rs.getString("ISBN");
                String role1=rs.getString("ShelfLocation");
                int catid1=rs.getInt("CategoryID");
                String statues1=rs.getString("Status");

                DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
                tblmodel.setColumnIdentifiers(new String[]{"BookID","Title","Author","ISBN","ShelfLocation","CategoryID","Status"});
                jTable1.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id1,name1,emile1,pass1,role1,catid1,statues1});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/

    }//GEN-LAST:event_jButton3ActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username=txtuname.getText();
        String pass=txtpassword.getText();
        String query1 = "SELECT Role FROM Users WHERE Name ='"+username+"' AND PasswordHash = '"+pass+"'";

        try {

            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query1);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                
                if (rs.getString("Role").equals("Admin")) {
                    JOptionPane.showMessageDialog(null,"Login successfule");
                    jTabbedPane1.setSelectedIndex(3);
                    //  AdminMenu am=new AdminMenu
                    //new AdminMenu().show();
                    // this.hide();
                }
             else {
                     JOptionPane.showMessageDialog(null,"The User Account isn't Admin!");
                }
            }
                 else {
                     JOptionPane.showMessageDialog(null,"Invalid credentials!");
                }
            

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void customerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButton1ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_customerButton1ActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_customerButtonActionPerformed

    private void addbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton1ActionPerformed
        // TODO add your handling code here:
        txtuserid.setText("");
        txtname.setText("");
        txtemial.setText("");
        txtpass.setText("");
        
    }//GEN-LAST:event_addbutton1ActionPerformed

    private void addbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton4ActionPerformed
        // TODO add your handling code here:
        txtBookid.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtIsbn.setText("");
        txtShelf.setText("");
         txtcatbookid.setText("");
    }//GEN-LAST:event_addbutton4ActionPerformed

    private void backbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton9ActionPerformed
        // TODO add your handling code here:
           jTabbedPane1.setSelectedIndex(3);
        
    }//GEN-LAST:event_backbutton9ActionPerformed

    private void addbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton6ActionPerformed
        // TODO add your handling code here:
        txtcatogryid.setText("");
        txtcatname.setText("");
    }//GEN-LAST:event_addbutton6ActionPerformed

    private void jTableCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCatMouseClicked
        // TODO add your handling code here:
         int selectedRow=jTableCat.getSelectedRow();
        if(selectedRow!=-1){
            txtcatogryid.setText(jTableCat.getValueAt(selectedRow, 0).toString());
            txtcatname.setText(jTableCat.getValueAt(selectedRow, 1).toString());

        }
    }//GEN-LAST:event_jTableCatMouseClicked

    private void addbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton7ActionPerformed
        // TODO add your handling code here:
          if(txtcatogryid.getText().equals("")||txtcatname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Data.");
        }
        else{
            String userid=txtcatogryid.getText();
            String name=txtcatname.getText();

            String query = "INSERT INTO Categories (CategoryName) VALUES (?)";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);

                stmt.executeUpdate();
                System.out.println("Categories added successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
            tblmodel.addRow(new Object[]{userid,name});
            txtcatogryid.setText("");
            txtcatname.setText("");

            JOptionPane.showMessageDialog(null,"Add Data Successfully...");

        }
    }//GEN-LAST:event_addbutton7ActionPerformed

    private void updatebutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton4ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
        if(jTableCat.getSelectedRowCount()==1){
            String userid=txtcatogryid.getText();
            String name=txtcatname.getText();

            String query = "update Categories set CategoryName=?  where CategoryID= '"+userid+"'";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);

                stmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            tblmodel.setValueAt(userid,jTableCat.getSelectedRow(),0);
            tblmodel.setValueAt(name,jTableCat.getSelectedRow(),1);

            JOptionPane.showMessageDialog(null,"Update Successfully...");
        }else{
            if(jTableCat.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_updatebutton4ActionPerformed

    private void deletebutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton4ActionPerformed
        // TODO add your handling code here:
         String userid=txtcatogryid.getText();
        DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
        if(jTableCat.getSelectedRowCount()==1){
            tblmodel.removeRow(jTableCat.getSelectedRow());
            String query = "Delete from Categories where CategoryID= (?)";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, userid);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Category Deleted successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            if(jTableCat.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"The Table is Empty");
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Any Row for Delete.");
            }
        }
    }//GEN-LAST:event_deletebutton4ActionPerformed

    private void jPanel9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel9ComponentShown
        // TODO add your handling code here:
         DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
        tblmodel.setRowCount(0);
        try {

            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Categories");
            while (rs.next()) {
                int id=rs.getInt("CategoryID");
                String name=rs.getString("CategoryName");

                // DefaultTableModel tblmodel=(DefaultTableModel) jTableCat.getModel();
                tblmodel.setColumnIdentifiers(new String[]{"CategoryID","CategoryName"});
                jTableCat.setModel(tblmodel);
                tblmodel.addRow(new Object[]{id,name});

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel9ComponentShown

    private void importfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importfileActionPerformed
        // TODO add your handling code here:
          JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open TXT File");

        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
               // DefaultTableModel model = (DefaultTableModel) jTableBook.getModel();
               // model.setRowCount(0);

                String line;
                boolean isFirstLine = true;

                while ((line = reader.readLine()) != null) {
                    String[] rowData = line.split("\t");
 txtBookid.setText(rowData[0]);
            txtTitle.setText(rowData[1]);
            txtAuthor.setText(rowData[2]);
            txtIsbn.setText(rowData[3]);
            txtShelf.setText(rowData[4]);
            txtcatbookid.setText(rowData[5]);
            //txtBookstat.setText(jTableBook.getValueAt(selectedRow, 6).toString());
             txtBookstat.setSelectedItem(rowData[6]);
                    if (isFirstLine) { // تخطي العناوين
                        isFirstLine = false;
                        continue;
                    }

                 //   model.addRow(rowData);
                    ///////
                    ////////
                    ///////
                  //  if(selectedRow!=-1){
           
              
     //   }                    ///////////
                    //////////
                }

                JOptionPane.showMessageDialog(null, "Import Successful!");
                

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error importing data from TXT!");
            }
        }

    }//GEN-LAST:event_importfileActionPerformed

    private void exportfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportfileActionPerformed
        // TODO add your handling code here:
                JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save TXT File");
        fileChooser.setSelectedFile(new File("BooksData.txt"));

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileToSave))) {
              //  TableModel model = jTableBook.getModel();
               DefaultTableModel model=(DefaultTableModel) jTableBook.getModel();

                // كتابة عناوين الأعمدة
                for (int col = 0; col < model.getColumnCount(); col++) {
                    writer.print(model.getColumnName(col) + "\t");
                }
                writer.println();

                // كتابة البيانات من الجدول
                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        writer.print(model.getValueAt(row, col) + "\t");
                    }
                    writer.println();
                }

                JOptionPane.showMessageDialog(null, "Export Successful!");

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error exporting data to TXT!");
            }
        }

    }//GEN-LAST:event_exportfileActionPerformed

    private void backbutton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton10ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbutton10ActionPerformed

    private void addbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton8ActionPerformed
        // TODO add your handling code here:
        salaryField.setText("");
    }//GEN-LAST:event_addbutton8ActionPerformed
public void fillManger() {
    //////
    loadUsersManager();
        loadManager();
        
   
        try {

            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Manager");
            while (rs.next()) {
                
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    ////////
    
    
    
    

       
       
}
 private void loadUsersManager() {
     DefaultTableModel   tableModel = new DefaultTableModel();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT UserID, Name FROM Users WHERE Role = 'Admin'")) {
            while (rs.next()) {
                userComboBox1.addItem(rs.getInt("UserID") + " - " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadManager() {
         DefaultTableModel tblmodel=(DefaultTableModel) jTableManager.getModel();
        tblmodel.setRowCount(0);
        String query = "SELECT e.ManagerID, u.UserID, u.Name, e.Salary FROM Manager e " +
                       "JOIN Users u ON e.UserID = u.UserID";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
              //  tableModel.addRow(new Object[]{
                       // rs.getInt("ManagerID"),
                       // rs.getInt("UserID"),
                       // rs.getString("Name"),
                       // rs.getDouble("Salary")
                int Managerid=rs.getInt("ManagerID");
                int Userid=rs.getInt("UserID");
                String name=rs.getString("Name");
                int sal=rs.getInt("Salary");

                
                tblmodel.setColumnIdentifiers(new String[]{"ManagerID","UserID","UserName","Salary"});
                jTableManager.setModel(tblmodel);
                tblmodel.addRow(new Object[]{Managerid,Userid,name,sal});

             //   });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addManager() {
        if (userComboBox1.getSelectedItem() == null || salaryField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a user and enter a salary!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userId = Integer.parseInt(userComboBox1.getSelectedItem().toString().split(" - ")[0]);
        Double salary;
        try {
            salary = Double.parseDouble(salaryField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid salary amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "INSERT INTO Manager (UserID, Salary) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            stmt.setDouble(2, salary);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Manager added successfully!");
            loadManager();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error adding Manager: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editManager() {
        DefaultTableModel   tableModel = new DefaultTableModel();
        if (jTableManager.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an Manager to edit!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ManagerId = (int) jTableManager.getValueAt(jTableManager.getSelectedRow(), 0);
        double salary;//= (int)tableModel.getValueAt(jTableManager.getSelectedRow(), 4);
        try {
            salary = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter new salary:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid salary amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "UPDATE Manager SET Salary = ? WHERE ManagerID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setDouble(1, salary);
            stmt.setInt(2, ManagerId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Manager updated successfully!");
            loadManager();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error updating Manager: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteManager() {
      
        if (jTableManager.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an Manager to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ManagerId =  (int)jTableManager.getValueAt(jTableManager.getSelectedRow(),0);
//JOptionPane.showConfirmDialog(this,ManagerId);
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Manager?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String query = "DELETE FROM Manager WHERE ManagerID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, ManagerId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Manager deleted successfully!");
            loadManager();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error deleting Manager: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton9ActionPerformed
        // TODO add your handling code here:
        addManager();
    }//GEN-LAST:event_addbutton9ActionPerformed

    private void updatebutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton5ActionPerformed
        // TODO add your handling code here:
        editManager();
    }//GEN-LAST:event_updatebutton5ActionPerformed

    private void deletebutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton5ActionPerformed
        // TODO add your handling code here:
        deleteManager();
        
       
        //////
    }//GEN-LAST:event_deletebutton5ActionPerformed

    private void jTableManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableManagerMouseClicked
        // TODO add your handling code here:
         int selectedRow=jTableManager.getSelectedRow();
        if(selectedRow!=-1){
           userComboBox1.setSelectedItem(jTableManager.getValueAt(selectedRow, 0).toString());
            salaryField.setText(jTableManager.getValueAt(selectedRow, 3).toString());
            
            
        }
    }//GEN-LAST:event_jTableManagerMouseClicked

    private void jPanel16ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel16ComponentShown
        // TODO add your handling code here:
       
        fillManger();
    }//GEN-LAST:event_jPanel16ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown


 
   
    private void jPanel10ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel10ComponentShown
        // TODO add your handling code here:
        
    //private JTable employeeTable;
  //  private DefaultTableModel tableModel;


        // Top Panel (Employee Form)
     //   JPanel employeePanel = new JPanel(new FlowLayout());
//employeePanel.setBackground(Color.red);
      
    }//GEN-LAST:event_jPanel10ComponentShown

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void backbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton7ActionPerformed
        // TODO add your handling code here:
          jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_backbutton7ActionPerformed

    private void addbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton2ActionPerformed
        // TODO add your handling code here:
        if(txtuseridsign.getText().equals("")||txtnamesign.getText().equals("")||txtemialsign.getText().equals("")||txtpasssign.getText().equals("")||txtrolesign.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Data.");
        }
        else{
            String userid=txtuseridsign.getText();
            String name=txtnamesign.getText();
            String email= txtemialsign.getText();
            String pass=txtpasssign.getText();
            String role=txtrolesign.getSelectedItem().toString();

            String sql = "INSERT INTO Users (Name, Email, PasswordHash, Role) VALUES (?, ?, ?, ?)";

            int result = DatabaseManager.executeUpdate(sql,name,email,pass,role);

            if (result > 0) {
                JOptionPane.showMessageDialog(null,"User Added Successfully...");
            } else {
                JOptionPane.showMessageDialog(null,"Add UnSuccessfully...");
            }

            DefaultTableModel tblmodel=(DefaultTableModel) jTableUser.getModel();
            tblmodel.addRow(new Object[]{userid,name,email,pass,role});
            txtuserid.setText("");
            txtname.setText("");
            txtemial.setText("");
            txtpass.setText("");
            //txtrole.setText("");

        }
   
        
    }//GEN-LAST:event_addbutton2ActionPerformed
    
    private void jPanel7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel7ComponentShown
        // TODO add your handling code here:
        jTableUsersign.setVisible(false);
    }//GEN-LAST:event_jPanel7ComponentShown

    private void jTableUsersignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersignMouseClicked
        // TODO add your handling code here:
        ////nooo
        if(txtuserid.getText().equals("")||txtname.getText().equals("")||txtemial.getText().equals("")||txtpass.getText().equals("")||txtrole.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Data.");
        }
        else{
            String userid=txtuserid.getText();
            String name=txtname.getText();
            String email= txtemial.getText();
            String pass=txtpass.getText();
            String role=txtrole.getSelectedItem().toString();

            String sql = "INSERT INTO Users (Name, Email, PasswordHash, Role) VALUES (?, ?, ?, ?)";

            int result = DatabaseManager.executeUpdate(sql,name,email,pass,role);

            if (result > 0) {
                JOptionPane.showMessageDialog(null,"User Added Successfully...");
            } else {
                JOptionPane.showMessageDialog(null,"Add UnSuccessfully...");
            }
    }//GEN-LAST:event_jTableUsersignMouseClicked
    }
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
  jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void backbuttonsearchadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonsearchadminActionPerformed
        // TODO add your handling code here:
         
        
        jTabbedPane1.setSelectedIndex(3);
       

    }//GEN-LAST:event_backbuttonsearchadminActionPerformed
public void filltable(){
    DefaultTableModel tblmodelsearch=(DefaultTableModel) jTablesearch.getModel();
    tblmodelsearch.setRowCount(0);
   String selectitem=comboxsearch.getSelectedItem().toString().trim();
   String searchvalue=txtnamesearch.getText().trim();
   
  
         try {
         
   Connection conn =DriverManager.getConnection( "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=LMS;encrypt=true;trustServerCertificate=true", "mmm","nnnn");
PreparedStatement stmt = conn.prepareStatement("select * from Books where "+selectitem+" like ?");
       // PreparedStatement("select * from Books where '"+selectitem+"'like ?");        
//PrepareStatement stmt = conn.createStatement();
stmt.setString(1, searchvalue);         
ResultSet rs = stmt.executeQuery();
         
            
         while (rs.next()) {
             
                int id=rs.getInt("BookID");
                 String name=rs.getString("Title");
                 String emile=rs.getString("Author");
                 String pass=rs.getString("ISBN");
                 String role=rs.getString("ShelfLocation");
                 int catid=rs.getInt("CategoryID");
                  String statues=rs.getString("Status");
          
          
          tblmodelsearch.setColumnIdentifiers(new String[]{"BookID","Title","Author","ISBN","ShelfLocation","CategoryID","Status"});  
          jTablesearch.setModel(tblmodelsearch);
          tblmodelsearch.addRow(new Object[]{id,name,emile,pass,role,catid,statues});
                  
             }
          }
         catch (SQLException e) {
            e.printStackTrace();
                                   }
}
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
       filltable();
      
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jTablesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesearchMouseClicked
        // TODO add your handling code here:
        int selectedRow=jTablesearch.getSelectedRow();
        if(selectedRow!=-1){
            // txtuserid.setText(jTable1.getValueAt(selectedRow, 0).toString());
            txtname.setText(jTablesearch.getValueAt(selectedRow, 1).toString());

        }
    }//GEN-LAST:event_jTablesearchMouseClicked

    private void backbutton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton12ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbutton12ActionPerformed

    private void addbutton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton10ActionPerformed
        // TODO add your handling code here:
         amountField.setText("");
    }//GEN-LAST:event_addbutton10ActionPerformed

    private void addFine() {
        if (userComboBoxfine.getSelectedItem() == null || amountField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a user and enter a fine amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userId = Integer.parseInt(userComboBoxfine.getSelectedItem().toString().split(" - ")[0]);
        Double amount;
        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "INSERT INTO Fines (UserID, Amount,Status) VALUES (?, ?,'Unpaid')";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            stmt.setDouble(2, amount);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Fine added successfully!");
           loadFine();
           // loadManager();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error adding Fine: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addbutton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton11ActionPerformed
        // TODO add your handling code here:
        addFine();
    }//GEN-LAST:event_addbutton11ActionPerformed
private void markFineAsPaid() {
    DefaultTableModel tableModelfine=new DefaultTableModel();
        if (jTableFine.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a fine to mark as paid!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int fineId = (int) jTableFine.getValueAt(jTableFine.getSelectedRow(), 0);

        String query = "UPDATE Fines SET Status = 'Paid' WHERE FineID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, fineId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Fine marked as paid successfully!");
            loadFine();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error updating fine status: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updatebutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton6ActionPerformed
        // TODO add your handling code here:
        markFineAsPaid();
    }//GEN-LAST:event_updatebutton6ActionPerformed
 private void deleteFine() {
      
        if (jTableFine.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an Fine to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ManagerId =  (int)jTableFine.getValueAt(jTableFine.getSelectedRow(),0);
//JOptionPane.showConfirmDialog(this,ManagerId);
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Fine?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String query = "DELETE FROM Fines WHERE FineID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, ManagerId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Fine deleted successfully!");
            loadFine();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error deleting Fine: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void deletebutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton6ActionPerformed
        // TODO add your handling code here:
        deleteFine();
    }//GEN-LAST:event_deletebutton6ActionPerformed

    private void jTableFineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFineMouseClicked
 private void loadFine() {
         DefaultTableModel tblmodel=(DefaultTableModel) jTableFine.getModel();
        tblmodel.setRowCount(0);
        String query = "SELECT e.FineID, u.UserID, u.Name, e.Amount,e.Status FROM Fines e " +
                       "JOIN Users u ON e.UserID = u.UserID";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
              //  tableModel.addRow(new Object[]{
                       // rs.getInt("ManagerID"),
                       // rs.getInt("UserID"),
                       // rs.getString("Name"),
                       // rs.getDouble("Salary")
                int fineid=rs.getInt("FineID");
                int Userid=rs.getInt("UserID");
                String name=rs.getString("Name");
                double mount=rs.getDouble("Amount");
                String statfine=rs.getString("Status");

                
                tblmodel.setColumnIdentifiers(new String[]{"FineID","UserID","UserName","Amount","Status"});
                jTableFine.setModel(tblmodel);
                tblmodel.addRow(new Object[]{fineid,Userid,name,mount,statfine});

             //   });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void jPanel11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel11ComponentShown
        // TODO add your handling code here:
         loadUsers();
         loadFine();
    }//GEN-LAST:event_jPanel11ComponentShown

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(12);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void backbuttonbowrroadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonbowrroadminActionPerformed
        // TODO add your handling code here:
       
         jTabbedPane1.setSelectedIndex(3);
    
       
    }//GEN-LAST:event_backbuttonbowrroadminActionPerformed

    private void jButtonreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreturnActionPerformed
        // TODO add your handling code here:
        returnBook();
    }//GEN-LAST:event_jButtonreturnActionPerformed

    private void jButtonborrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonborrowActionPerformed
        // TODO add your handling code here:
        borrowBook();
    }//GEN-LAST:event_jButtonborrowActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        backbuttonbowrroadmin.setVisible(true);
         jTabbedPane1.setSelectedIndex(11);
       backbuttonbowrrmember.setVisible(false);
        jButtonborrow.setEnabled(true);
        jButtonreturn.setEnabled(true);
       
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        backbuttonsearchadmin.setVisible(true);
        jTabbedPane1.setSelectedIndex(9);
       backbuttonsearchmember.setVisible(false);
       
    }//GEN-LAST:event_jButton20ActionPerformed
 private void reserveBook() {
        if (userComboBoxreserve.getSelectedItem() == null || bookComboBoxreserve.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select both a user and a book!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userId = Integer.parseInt(userComboBoxreserve.getSelectedItem().toString().split(" - ")[0]);
        int bookId = Integer.parseInt(bookComboBoxreserve.getSelectedItem().toString().split(" - ")[0]);

        String query = "INSERT INTO Reservations (UserID, BookID, ReservationDate) VALUES (?, ?, GETDATE())";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Book reserved successfully!");
            loadReservations();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error reserving book: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelReservation() {
        if (jTablereserve.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a reservation to cancel!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int reservationId = (int) jTablereserve.getValueAt(jTablereserve.getSelectedRow(), 0);

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel this reservation?", "Confirm Cancel", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String query = "DELETE FROM Reservations WHERE ReservationID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, reservationId);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Reservation canceled successfully!");
            loadReservations();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error canceling reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonreserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreserveActionPerformed
        // TODO add your handling code here:
        reserveBook();
    }//GEN-LAST:event_jButtonreserveActionPerformed

    private void jButtonreservecancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreservecancelActionPerformed
        // TODO add your handling code here:
        cancelReservation();
    }//GEN-LAST:event_jButtonreservecancelActionPerformed

    private void backbuttonadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonadminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbuttonadminActionPerformed
private void loadReservations() {
     DefaultTableModel modelreserv = (DefaultTableModel)jTablereserve.getModel();    
    modelreserv.setRowCount(0);
        String query = "SELECT r.ReservationID, u.UserID, u.Name, b.BookID, b.Title, r.ReservationDate " +
                       "FROM Reservations r " +
                       "JOIN Users u ON r.UserID = u.UserID " +
                       "JOIN Books b ON r.BookID = b.BookID";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
               // modelreserv.addRow(new Object[]{
                      int resid=  rs.getInt("ReservationID");
                   int resuserid=     rs.getInt("UserID");
                     String resbookname=   rs.getString("Name");
                   int resbookid=     rs.getInt("BookID");
                      String resbooktitle=  rs.getString("Title");
                  Timestamp resdate=      rs.getTimestamp("ReservationDate");
            modelreserv.setColumnIdentifiers(new String[]{"ReservationID","UserID","Name","BookID","Title","ReservationDate"});  
          jTableorrow.setModel(modelreserv);
          modelreserv.addRow(new Object[]{resid,resuserid,resbookname,resbookid,resbooktitle,resdate});

               // });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void jPanel24ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel24ComponentShown
        // TODO add your handling code here:
         loadUsers();
        loadBooks();
        loadReservations();
       
    }//GEN-LAST:event_jPanel24ComponentShown

    private void bookComboBoxreserveComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bookComboBoxreserveComponentShown
        // TODO add your handling code here:
      
    }//GEN-LAST:event_bookComboBoxreserveComponentShown

    private void backbuttonmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonmemberActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_backbuttonmemberActionPerformed

    private void jButtonresverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresverActionPerformed
        // TODO add your handling code here:
       backbuttonadmin.setVisible(true);
        jTabbedPane1.setSelectedIndex(14);
       backbuttonmember.setVisible(false);
         
    }//GEN-LAST:event_jButtonresverActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        backbuttonmember.setVisible(true);
        jTabbedPane1.setSelectedIndex(14);
       backbuttonadmin.setVisible(false);

        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void backbuttonsearchmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonsearchmemberActionPerformed
        // TODO add your handling code here:
         
        jTabbedPane1.setSelectedIndex(4);
   
    }//GEN-LAST:event_backbuttonsearchmemberActionPerformed

    private void backbuttonbowrrmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonbowrrmemberActionPerformed
        // TODO add your handling code here:
        
         jTabbedPane1.setSelectedIndex(4);
    
    }//GEN-LAST:event_backbuttonbowrrmemberActionPerformed

    private void backbuttonadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonadmin1ActionPerformed
        // TODO add your handling code here:
    jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_backbuttonadmin1ActionPerformed

    private void jButtonreport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreport2ActionPerformed
        // TODO add your handling code here:
          loadQuery("SELECT \n" +
"    u.UserID, \n" +
"    u.Name, \n" +
"    COUNT(br.BookID) AS TotalBooksBorrowed\n" +
"FROM BorrowTransactions br\n" +
"JOIN Users u ON br.UserID = u.UserID\n" +
"GROUP BY u.UserID, u.Name\n" +
"ORDER BY TotalBooksBorrowed DESC;");
    }//GEN-LAST:event_jButtonreport2ActionPerformed

    private void jButtonreport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreport1ActionPerformed
        // TODO add your handling code here:
       loadQuery("SELECT * FROM Books WHERE Status = 'Available'");
      
    }//GEN-LAST:event_jButtonreport1ActionPerformed

    private void jButtonreport4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreport4ActionPerformed
        // TODO add your handling code here:
        loadQuery("SELECT \n" +
"    r.ReservationID, \n" +
"    u.UserID, \n" +
"    u.Name AS MemberName, \n" +
"    b.Title, \n" +
"    r.ReservationDate\n" +
"FROM Reservations r\n" +
"JOIN Users u ON r.UserID = u.UserID\n" +
"JOIN Books b ON r.BookID = b.BookID\n" +
"WHERE ReservationDate >= DATEADD(MONTH, -1, GETDATE())");
    }//GEN-LAST:event_jButtonreport4ActionPerformed

    private void jButtonreport3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreport3ActionPerformed
    loadQuery("SELECT \n" +
"    b.BookID, \n" +
"    b.Title, \n" +
"    b.Author, \n" +
"    u.UserID, \n" +
"    u.Name AS BorrowerName, \n" +
"    br.BorrowDate \n" +
"FROM BorrowTransactions br\n" +
"JOIN Books b ON br.BookID = b.BookID\n" +
"JOIN Users u ON br.UserID = u.UserID\n" +
"WHERE br.ReturnDate IS NULL;");
    }//GEN-LAST:event_jButtonreport3ActionPerformed

        public static void exportToExcel(JTable table) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Excel File");
        fileChooser.setSelectedFile(new File("Data.xlsx"));
        
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            
          /*  try (XSSFWorkbook workbook = new XSSFWorkbook(); 
                 FileOutputStream fileOut = new FileOutputStream(fileToSave)) {
               //Sheet s=workbook.createSheet("Book");
               
                Sheet sheet = workbook.createSheet("Books");
               // TableModel model = jTablereport.getModel();
                
                // إنشاء صف العناوين
                Row headerRow = sheet.createRow(0);
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = headerRow.createCell(col);
                    cell.setCellValue(model.getColumnName(col));
                }

                // إدخال بيانات الجدول
                for (int row = 0; row < model.getRowCount(); row++) {
                    Row excelRow = sheet.createRow(row + 1);
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        Cell cell = excelRow.createCell(col);
                        cell.setCellValue(model.getValueAt(row, col).toString());
                    }
                }

                workbook.write(fileOut);
                JOptionPane.showMessageDialog(null, "Export Successful!");

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error exporting data to Excel!");
            }*/
        }
    

        }   

    public void exportfile(){
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save TXT File");
        fileChooser.setSelectedFile(new File("Data.txt"));

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileToSave))) {
              //  TableModel model = jTableBook.getModel();
               DefaultTableModel model=(DefaultTableModel) jTablereport.getModel();

                // كتابة عناوين الأعمدة
                for (int col = 0; col < model.getColumnCount(); col++) {
                    writer.print(model.getColumnName(col) + "\t");
                }
                writer.println();

                // كتابة البيانات من الجدول
                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        writer.print(model.getValueAt(row, col) + "\t");
                    }
                    writer.println();
                }

                JOptionPane.showMessageDialog(null, "Export Successful!");

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error exporting data to TXT!");
            }
        }

}
private void loadQuery(String query) {
   //  DefaultTableModel modelreport = (DefaultTableModel)jTablereport.getModel();
   DefaultTableModel modelreport = new DefaultTableModel();
   
       /* String query = "SELECT r.ReservationID, u.UserID, u.Name, b.BookID, b.Title, r.ReservationDate " +
                       "FROM Reservations r " +
                       "JOIN Users u ON r.UserID = u.UserID " +
                       "JOIN Books b ON r.BookID = b.BookID";
*/
       
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
ResultSetMetaData metaData=rs.getMetaData();
int columncount=metaData.getColumnCount();
for(int i=1;i<=columncount;i++){
    modelreport.addColumn(metaData.getColumnName(i));
}
            while (rs.next()) {
                Object[] rowData=new Object[columncount];
                for(int i=1;i<=columncount;i++){
                  rowData[i-1]=rs.getObject(i);}
                  modelreport.addRow(rowData);
                
            }
           //  modelreport.setRowCount(0);
            jTablereport.setModel(modelreport);
               // modelreserv.addRow(new Object[]{
                     /* int resid=  rs.getInt("ReservationID");
                   int resuserid=     rs.getInt("UserID");
                     String resbookname=   rs.getString("Name");
                   int resbookid=     rs.getInt("BookID");
                      String resbooktitle=  rs.getString("Title");
                  Timestamp resdate=      rs.getTimestamp("ReservationDate");*/
           /* modelreport.setColumnIdentifiers(new String[]{"ReservationID","UserID","Name","BookID","Title","ReservationDate"});  
          jTablereport.setModel(modelreport);
          modelreport.addRow(new Object[]{resid,resuserid,resbookname,resbookid,resbooktitle,resdate});

               // });
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }}
    private void jPanel13ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel13ComponentShown
        // TODO add your handling code here:
       // loadQuery();
    }//GEN-LAST:event_jPanel13ComponentShown

    private void jButtonreportprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreportprintActionPerformed
        // TODO add your handling code here:
        exportfile();
    }//GEN-LAST:event_jButtonreportprintActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(13);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonreport5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreport5ActionPerformed
        // TODO add your handling code here:
         loadQuery("SELECT \n" +
"    u.UserID, \n" +
"    u.Name, \n" +
"    SUM(f.Amount) AS TotalFine\n" +
"FROM Fines f\n" +
"JOIN Users u ON f.UserID = u.UserID\n" +
"WHERE f.Status = 'Unpaid'\n" +
"GROUP BY u.UserID, u.Name\n" +
"ORDER BY TotalFine DESC;");
    }//GEN-LAST:event_jButtonreport5ActionPerformed
    
    private void loadEmployees() {
      DefaultTableModel tableModel = new DefaultTableModel(); 
     
    }

    private void loadUsers() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT UserID, Name FROM Users")) {
            while (rs.next()) {
                userComboBox.addItem(rs.getInt("UserID") + " - " + rs.getString("Name"));
                userComboBoxfine.addItem(rs.getInt("UserID") + " - " + rs.getString("Name"));
                userComboBoxreserve.addItem(rs.getInt("UserID") + " - " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadBooks() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT BookID, Title FROM Books WHERE Status = 'Available'")) {
            while (rs.next()) {
                bookComboBox.addItem(rs.getInt("BookID") + " - " + rs.getString("Title"));
               bookComboBoxreserve.addItem(rs.getInt("BookID") + " - " + rs.getString("Title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadTransactions() {
       /////////
      
        /////
        
        DefaultTableModel tableModeltrans=(DefaultTableModel) jTableorrow.getModel();
         tableModeltrans.setRowCount(0);
        // Table Model & JTable
         // DefaultTableModel tblmodel=(DefaultTableModel) jTableorrow.getModel();
        
        String query = "SELECT bt.TransactionID, u.UserID, u.Name, b.BookID, b.Title, bt.BorrowDate, bt.ReturnDate, bt.Status " +
                       "FROM BorrowTransactions bt " +
                       "JOIN Users u ON bt.UserID = u.UserID " +
                       "JOIN Books b ON bt.BookID = b.BookID";

        try {
            Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                
                      int bid=  rs.getInt("TransactionID");
                        int buserid=rs.getInt("UserID");
                    String bname  =  rs.getString("Name");
                      int bbookid  =  rs.getInt("BookID");
                      String btitle  =  rs.getString("Title");
                    Timestamp bbDate  =    rs.getTimestamp("BorrowDate");
                    Timestamp bbreturn  =    rs.getTimestamp("ReturnDate");
                      String bstat  =  rs.getString("Status");
                tableModeltrans.setColumnIdentifiers(new String[]{"TransactionID","UserID","Name","BookID","Title","BorrowDate","ReturnDate","Status"});  
          jTableorrow.setModel(tableModeltrans);
          tableModeltrans.addRow(new Object[]{bid,buserid,bname,bbookid,btitle,bbDate,bbreturn,bstat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
         tableModeltrans.setColumnIdentifiers(new String[]{"TransactionID","UserID","UserName","BookID","BookTitle","BorrowDate","ReturnDate","Status"});  
          jTableorrow.setModel(tableModeltrans);
    }

    private void borrowBook() {
        if (userComboBox.getSelectedItem() == null || bookComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select both a user and a book!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userId = Integer.parseInt(userComboBox.getSelectedItem().toString().split(" - ")[0]);
        int bookId = Integer.parseInt(bookComboBox.getSelectedItem().toString().split(" - ")[0]);

        String query = "INSERT INTO BorrowTransactions (UserID, BookID, BorrowDate, ReturnDate, Status) VALUES (?, ?, GETDATE(), NULL, 'Pending')";
        String updateBookStatus = "UPDATE Books SET Status = 'Borrowed' WHERE BookID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             PreparedStatement updateStmt = conn.prepareStatement(updateBookStatus)) {

            stmt.setInt(1, userId);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();

            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Book borrowed successfully!");
            loadTransactions();
            loadBooks(); // Refresh book list to exclude borrowed books

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error borrowing book: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void returnBook() {
        DefaultTableModel tableModel=(DefaultTableModel) jTableorrow.getModel();
        if (jTableorrow.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a transaction to return the book!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int transactionId = (int) tableModel.getValueAt(jTableorrow.getSelectedRow(), 0);
        int bookId = (int) tableModel.getValueAt(jTableorrow.getSelectedRow(), 3);

        String query = "UPDATE BorrowTransactions SET ReturnDate = GETDATE(), Status = 'Returned' WHERE TransactionID = ?";
        String updateBookStatus = "UPDATE Books SET Status = 'Available' WHERE BookID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             PreparedStatement updateStmt = conn.prepareStatement(updateBookStatus)) {

            stmt.setInt(1, transactionId);
            stmt.executeUpdate();

            updateStmt.setInt(1, bookId);
            updateStmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Book returned successfully!");
            loadTransactions();
            loadBooks(); // Refresh available books

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error returning book: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              // new MainFrame().setVisible(true);
                MainFrame log = new MainFrame();
        log.show();
        log.pack();
        log.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Left1;
    private javax.swing.JPanel Left10;
    private javax.swing.JPanel Left11;
    private javax.swing.JPanel Left12;
    private javax.swing.JPanel Left13;
    private javax.swing.JPanel Left2;
    private javax.swing.JPanel Left4;
    private javax.swing.JPanel Left5;
    private javax.swing.JPanel Left6;
    private javax.swing.JPanel Left7;
    private javax.swing.JPanel Left8;
    private javax.swing.JPanel Left9;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel Right1;
    private javax.swing.JPanel Right10;
    private javax.swing.JPanel Right11;
    private javax.swing.JPanel Right2;
    private javax.swing.JPanel Right3;
    private javax.swing.JPanel Right4;
    private javax.swing.JPanel Right5;
    private javax.swing.JPanel Right6;
    private javax.swing.JPanel Right8;
    private javax.swing.JPanel Right9;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton addbutton;
    private javax.swing.JButton addbutton1;
    private javax.swing.JButton addbutton10;
    private javax.swing.JButton addbutton11;
    private javax.swing.JButton addbutton2;
    private javax.swing.JButton addbutton3;
    private javax.swing.JButton addbutton4;
    private javax.swing.JButton addbutton6;
    private javax.swing.JButton addbutton7;
    private javax.swing.JButton addbutton8;
    private javax.swing.JButton addbutton9;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton backbutton1;
    private javax.swing.JButton backbutton10;
    private javax.swing.JButton backbutton12;
    private javax.swing.JButton backbutton2;
    private javax.swing.JButton backbutton3;
    private javax.swing.JButton backbutton4;
    private javax.swing.JButton backbutton5;
    private javax.swing.JButton backbutton7;
    private javax.swing.JButton backbutton9;
    public javax.swing.JButton backbuttonadmin;
    public javax.swing.JButton backbuttonadmin1;
    private javax.swing.JButton backbuttonbowrrmember;
    private javax.swing.JButton backbuttonbowrroadmin;
    public javax.swing.JButton backbuttonmember;
    private javax.swing.JButton backbuttonsearchadmin;
    private javax.swing.JButton backbuttonsearchmember;
    private javax.swing.JComboBox bookComboBox;
    private javax.swing.JComboBox bookComboBoxreserve;
    private javax.swing.JComboBox comboxsearch;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton customerButton1;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton deletebutton3;
    private javax.swing.JButton deletebutton4;
    private javax.swing.JButton deletebutton5;
    private javax.swing.JButton deletebutton6;
    private javax.swing.JButton exportfile;
    private javax.swing.JButton importfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public javax.swing.JButton jButtonborrow;
    private javax.swing.JButton jButtonreport1;
    private javax.swing.JButton jButtonreport2;
    private javax.swing.JButton jButtonreport3;
    private javax.swing.JButton jButtonreport4;
    private javax.swing.JButton jButtonreport5;
    private javax.swing.JButton jButtonreportprint;
    public javax.swing.JButton jButtonreserve;
    public javax.swing.JButton jButtonreservecancel;
    private javax.swing.JButton jButtonresver;
    public javax.swing.JButton jButtonreturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTableBook;
    public static javax.swing.JTable jTableCat;
    public static javax.swing.JTable jTableFine;
    public static javax.swing.JTable jTableManager;
    public static javax.swing.JTable jTableUser;
    public static javax.swing.JTable jTableUsersign;
    private javax.swing.JTable jTableorrow;
    private javax.swing.JTable jTablereport;
    private javax.swing.JTable jTablereserve;
    public static javax.swing.JTable jTablesearch;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookid;
    private javax.swing.JComboBox<String> txtBookstat;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtShelf;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtcatbookid;
    private javax.swing.JTextField txtcatname;
    private javax.swing.JTextField txtcatogryid;
    private javax.swing.JTextField txtemial;
    private javax.swing.JTextField txtemialsign;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnamesearch;
    private javax.swing.JTextField txtnamesign;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtpasssign;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpasswordReader;
    private javax.swing.JComboBox<String> txtrole;
    private javax.swing.JComboBox<String> txtrolesign;
    private javax.swing.JTextField txtuname;
    private javax.swing.JTextField txtunameReader;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtuseridsign;
    private javax.swing.JButton updatebutton;
    private javax.swing.JButton updatebutton3;
    private javax.swing.JButton updatebutton4;
    private javax.swing.JButton updatebutton5;
    private javax.swing.JButton updatebutton6;
    private javax.swing.JComboBox userComboBox;
    private javax.swing.JComboBox<String> userComboBox1;
    private javax.swing.JComboBox<String> userComboBoxfine;
    private javax.swing.JComboBox userComboBoxreserve;
    private javax.swing.JLabel welcomLabel;
    // End of variables declaration//GEN-END:variables
}
