package hotelbooking.splashscreen;

import java.awt.Color;
import javax.swing.JDialog;

public class SplashScreen extends javax.swing.JDialog 
{  
    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(221,221,221));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new hotelbooking.splashscreen.CurvesPanel();
        jLabel1 = new javax.swing.JLabel();
        pro = new hotelbooking.splashscreen.ProgressBarCustom();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N

        lbStatus.setForeground(new java.awt.Color(198, 198, 198));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("Status");

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStatus)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       new Thread(new Runnable(){
           public void run(){
               try
               {
                   doTask(" DIAMOND HOTEL BOOKING......",1);
                   doTask("DIAMOND HOTEL BOOKING......",10);
                   doTask("DIAMOND HOTEL BOOKING......",20);
                   doTask("DIAMOND HOTEL BOOKING......",30);
                   doTask("DIAMOND HOTEL BOOKING......",40);
                   dispose();
                  curvesPanel1.stop();
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           }

           private Object CurvesPanel() {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
       }).start();
    }//GEN-LAST:event_formWindowOpened
   
    private void doTask(String taskName,int progress) throws Exception
    {
        lbStatus.setText(taskName);
        Thread.sleep(1000);
        pro.setValue(progress);
        
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            SplashScreen dialog = new SplashScreen(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hotelbooking.splashscreen.CurvesPanel curvesPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbStatus;
    private hotelbooking.splashscreen.ProgressBarCustom pro;
    // End of variables declaration//GEN-END:variables
}
