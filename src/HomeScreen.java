
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        initComponents();
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - getWidth() / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - getHeight() / 2);      
        
        initializeTaskList();
        initalizeTaskTable();
        
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

        titlebarPnl = new javax.swing.JPanel();
        closeLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titlebarIconLbl = new javax.swing.JLabel();
        buttonsPnl = new javax.swing.JPanel();
        addTaskBtn = new javax.swing.JButton();
        deleteTaskBtn = new javax.swing.JButton();
        taskContainer = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        titlebarPnl.setBackground(new java.awt.Color(238, 238, 238));
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
        closeLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
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

        javax.swing.GroupLayout titlebarPnlLayout = new javax.swing.GroupLayout(titlebarPnl);
        titlebarPnl.setLayout(titlebarPnlLayout);
        titlebarPnlLayout.setHorizontalGroup(
            titlebarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlebarPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlebarIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlebarPnlLayout.setVerticalGroup(
            titlebarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlebarPnlLayout.createSequentialGroup()
                .addGroup(titlebarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(titlebarIconLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonsPnl.setBackground(new java.awt.Color(238, 238, 238));

        addTaskBtn.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        addTaskBtn.setText("Add Task");
        addTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskBtnActionPerformed(evt);
            }
        });

        deleteTaskBtn.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        deleteTaskBtn.setText("Delete Task");
        deleteTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTaskBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPnlLayout = new javax.swing.GroupLayout(buttonsPnl);
        buttonsPnl.setLayout(buttonsPnlLayout);
        buttonsPnlLayout.setHorizontalGroup(
            buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(addTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        buttonsPnlLayout.setVerticalGroup(
            buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPnlLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(buttonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        taskContainer.setBackground(new java.awt.Color(238, 238, 238));
        taskContainer.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebarPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(taskContainer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlebarPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(taskContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
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
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        taskTable.setFont(new Font("Segoe Script", Font.PLAIN, 14));
        taskTable.getTableHeader().setFont(new Font("Segoe Script", Font.BOLD, 16));
        taskTable.getTableHeader().setOpaque(false);
        taskTable.getTableHeader().setBackground(new Color(190, 190, 190));
        taskTable.setRowHeight(30);
        
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
    private javax.swing.JLabel closeLbl;
    private javax.swing.JButton deleteTaskBtn;
    private javax.swing.JScrollPane taskContainer;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titlebarIconLbl;
    private javax.swing.JPanel titlebarPnl;
    // End of variables declaration//GEN-END:variables
}
