
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import task.DBConnect;
import task.TaskList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kush3
 */
public class HomeScreen extends javax.swing.JFrame {
    
    /**
     * MOUSE X AND Y CO-ORDINATES FOR DRAGGIND FUCTION
     */
    private int mouseX;
    private int mouseY;
    
    private JTable taskTable;

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        super("ToDo List");
        initComponents();
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - getWidth() / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - getHeight() / 2);      
        
        initializeTaskList();
        initalizeTaskTable();
        initializeOptionsPopup();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icox64.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsPopup = new javax.swing.JPopupMenu();
        titlebarPnl = new javax.swing.JPanel();
        closeLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titlebarIconLbl = new javax.swing.JLabel();
        optionsLbl = new javax.swing.JLabel();
        buttonsPnl = new javax.swing.JPanel();
        addTaskBtn = new javax.swing.JButton();
        deleteTaskBtn = new javax.swing.JButton();
        clearAllBtn = new javax.swing.JButton();
        taskContainer = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        titlebarPnl.setBackground(new java.awt.Color(238, 238, 238));
        titlebarPnl.setPreferredSize(new java.awt.Dimension(172, 45));
        titlebarPnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarPnlMouseDragged(evt);
            }
        });
        titlebarPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarPnlMousePressed(evt);
            }
        });

        closeLbl.setBackground(new java.awt.Color(238, 238, 238));
        closeLbl.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        closeLbl.setForeground(new java.awt.Color(51, 51, 51));
        closeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLbl.setText("X");
        closeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLbl.setOpaque(true);
        closeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLblMouseExited(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        titleLbl.setText("ToDo List");

        titlebarIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icox28.png"))); // NOI18N

        optionsLbl.setBackground(new java.awt.Color(238, 238, 238));
        optionsLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        optionsLbl.setForeground(new java.awt.Color(51, 51, 51));
        optionsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optionsLbl.setText("•••");
        optionsLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        optionsLbl.setOpaque(true);
        optionsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titlebarPnlLayout = new javax.swing.GroupLayout(titlebarPnl);
        titlebarPnl.setLayout(titlebarPnlLayout);
        titlebarPnlLayout.setHorizontalGroup(
            titlebarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlebarPnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titlebarIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlebarPnlLayout.setVerticalGroup(
            titlebarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebarIconLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(closeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonsPnl.setBackground(new java.awt.Color(238, 238, 238));

        addTaskBtn.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        addTaskBtn.setMnemonic('a');
        addTaskBtn.setText("Add Task");
        addTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskBtnActionPerformed(evt);
            }
        });

        deleteTaskBtn.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        deleteTaskBtn.setMnemonic('d');
        deleteTaskBtn.setText("Delete Task");
        deleteTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTaskBtnActionPerformed(evt);
            }
        });

        clearAllBtn.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        clearAllBtn.setMnemonic('c');
        clearAllBtn.setText("Clear All");
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPnlLayout = new javax.swing.GroupLayout(buttonsPnl);
        buttonsPnl.setLayout(buttonsPnlLayout);
        buttonsPnlLayout.setHorizontalGroup(
            buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPnlLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPnlLayout.createSequentialGroup()
                        .addComponent(addTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPnlLayout.createSequentialGroup()
                        .addComponent(clearAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        buttonsPnlLayout.setVerticalGroup(
            buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        taskContainer.setBackground(new java.awt.Color(238, 238, 238));
        taskContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebarPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(buttonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(taskContainer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlebarPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(taskContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Initializes the JTable that contains all the tasks
     * Also useful for updating the table everytime a task is added or removed
     */
    private void initalizeTaskTable() {
        String[] head = {"Tasks"};
        taskTable = new JTable(TaskList.get2DArray(), head) {
            /**
             * Overidden method to disable the Cell editing for the JTable
             */
            @Override
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        taskTable.setFont(new Font("Segoe Script", Font.PLAIN, 14));
        taskTable.getTableHeader().setFont(new Font("Segoe Script", Font.BOLD, 16));
        taskTable.getTableHeader().setOpaque(false);
        taskTable.getTableHeader().setBackground(new Color(190, 190, 190));
        taskTable.setRowHeight(30);
        taskTable.setAutoCreateRowSorter(true);
        
        /**
         * Sets the ScrollPane to display the JTable
         */
        taskContainer.setViewportView(taskTable);
    }
    
    /**
     * Creates an ArrayList of String containing all the tasks from the database
     * and initializes the taskList to that ArrayList to load the tasks from the database
     */
    private void initializeTaskList() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Tasks");
            while(rs.next())
                list.add(rs.getString(1));
            
            TaskList.initializeTaskList(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    /**
     * Initializes the Popup menu with the JMenuItems
     */
    private void initializeOptionsPopup() {
        JMenuItem backupItem = new JMenuItem("Backup");
        JMenuItem restoreItem = new JMenuItem("Restore");
        
        backupItem.addActionListener(e -> {
            System.out.println("Import Button Clickes..!!");
        });
        
        restoreItem.addActionListener(e -> {
            System.out.println("Export Button Clicked..!!");
        });
        
        optionsPopup.add(backupItem);
        optionsPopup.add(restoreItem);
    }
    
    /**
     * *****************************************************
     * ****************** EVENT HANDLING *******************
     * *****************************************************
     */
    
    /**
     * Sets the X and Y co-ordinates of the mouse in mouseX and mouseY on pressing the mouse
     * @param evt The MouseEvent Object generated on pressing the mouse
     */
    private void titlebarPnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarPnlMousePressed
        this.mouseX = evt.getX();
        this.mouseY = evt.getY();
    }//GEN-LAST:event_titlebarPnlMousePressed

    /**
     * Gets the X and Y co-ordinates of the screen and then sets the location of the window
     * by subtracting the X and Y co-ordinates of the mouse from the X and Y co-ordinates of the screen
     * @param evt The MouseEvent Object generated on pressing the mouse
     */
    private void titlebarPnlMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarPnlMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_titlebarPnlMouseDragged

    /**
     * Sets the background and Foreground color of close button back to default
     * @param evt 
     */
    private void closeLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseExited
        closeLbl.setBackground(new Color(238, 238, 238));
        closeLbl.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_closeLblMouseExited

    /**
     * Sets the close button's background to red and foreground to white on mouse entering
     * @param evt 
     */
    private void closeLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseEntered
        closeLbl.setBackground(Color.red);
        closeLbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_closeLblMouseEntered

    /**
     * Terminates the program on click
     * @param evt 
     */
    private void closeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseClicked
        System.exit(1);
    }//GEN-LAST:event_closeLblMouseClicked

    /**
     * Takes Input of the task from the User and then adds that task to the taskList
     * @param evt 
     */
    private void addTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskBtnActionPerformed
        String task = JOptionPane.showInputDialog(this, "Please Enter the Task", "Add New Task", JOptionPane.INFORMATION_MESSAGE).trim();
        
        if(! task.equals("")) {
            if(! TaskList.checkDuplicates(task)) {
                try {
                    if(TaskList.addTask(task))
                        JOptionPane.showMessageDialog(this, "Task Added Successfully", "Add New Task", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(this, "Unexpected Error Occured while Adding the task", "Add New Task", JOptionPane.ERROR_MESSAGE);
                    
                    initalizeTaskTable();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "This Task already Exists!!!", "Add New Task", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter a Task", "Add New Task", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addTaskBtnActionPerformed

    /**
     * Takes task selection from the JTable and then removes the task from the taskList
     * @param evt 
     */
    private void deleteTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTaskBtnActionPerformed
        int selectedIndex = taskTable.getSelectedRow();
        if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please Select a Task to Delete", "Delete A Task", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String task = (String) taskTable.getValueAt(selectedIndex, 0);
                if(TaskList.removeTask(task)) {
                    JOptionPane.showMessageDialog(this, "Task Deleted Successfully", "Delete A Task", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Unexpected Error Occured while Deleting the task", "Delete A Task", JOptionPane.ERROR_MESSAGE);
                }
                initalizeTaskTable();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_deleteTaskBtnActionPerformed

    /**
     * Deletes all the tasks from the taskList and Refreshes the JTable
     * @param evt
     */
    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        try {
            TaskList.removeAllTasks();
            JOptionPane.showMessageDialog(this, "All Tasks Deleted Successfuly", "Clear All Tasks", JOptionPane.INFORMATION_MESSAGE);
            initalizeTaskTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_clearAllBtnActionPerformed

    /**
     * Display the Options for Backing up and Restoring the Database
     * @param evt 
     */
    private void optionsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsLblMouseClicked
        optionsPopup.show(this, 300, 45);               
    }//GEN-LAST:event_optionsLblMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskBtn;
    private javax.swing.JPanel buttonsPnl;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JLabel closeLbl;
    private javax.swing.JButton deleteTaskBtn;
    private javax.swing.JLabel optionsLbl;
    private javax.swing.JPopupMenu optionsPopup;
    private javax.swing.JScrollPane taskContainer;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titlebarIconLbl;
    private javax.swing.JPanel titlebarPnl;
    // End of variables declaration//GEN-END:variables
}
