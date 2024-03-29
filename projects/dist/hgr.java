package Gui;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;

public class Gesture extends javax.swing.JFrame {
 /**
 * Creates new form Gesture
 */
 public Gesture() {
 initComponents();
 setLocationRelativeTo(null);
 }
 /**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 jLabel1 = new javax.swing.JLabel();
 jPanel3 = new javax.swing.JPanel();
 jLabel2 = new javax.swing.JLabel();
 jLabel3 = new javax.swing.JLabel();
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jButton3 = new javax.swing.JButton();
 jButton4 = new javax.swing.JButton();
 jButton5 = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jPanel1.setBackground(new java.awt.Color(153, 153, 255));
 jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
 jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel1.setText("Hand Gesture Recognition");
 jLabel2.setIcon(new
javax.swing.ImageIcon(getClass().getResource("/ExtraFiles/gnit.jpg"))); // NOI18N
 jLabel3.setBackground(new java.awt.Color(204, 204, 204));
 jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
 jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel3.setText("GREATER NOIDA INSTITUTE OF TECHNOLOGY");
 javax.swing.GroupLayout jPanel3Layout = new
javax.swing.GroupLayout(jPanel3);
 jPanel3.setLayout(jPanel3Layout);
 jPanel3Layout.setHorizontalGroup(

jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel3Layout.createSequentialGroup()
 .addComponent(jLabel2)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addContainerGap())
 );
 jPanel3Layout.setVerticalGroup(

jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.B
ASELINE)
 .addComponent(jLabel2)
 .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
149, javax.swing.GroupLayout.PREFERRED_SIZE))
 );
 jButton1.setBackground(new java.awt.Color(153, 153, 0));
 jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jButton1.setText("COUNT FINGERS");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jButton2.setBackground(new java.awt.Color(0, 0, 204));
 jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jButton2.setForeground(new java.awt.Color(255, 255, 255));
 jButton2.setText("PLAY GAME");
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 jButton3.setBackground(new java.awt.Color(204, 0, 204));
 jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jButton3.setText("SCROLLING");
 jButton3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton3ActionPerformed(evt);
 }
 });
 jButton4.setBackground(new java.awt.Color(0, 153, 0));
 jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jButton4.setText("Play/Pause");
 jButton4.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton4ActionPerformed(evt);
 }
 });
 jButton5.setBackground(new java.awt.Color(255, 0, 0));
 jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jButton5.setText("EXIT");
 jButton5.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton5ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel1Layout = new
javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(

jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
 .addContainerGap(161, Short.MAX_VALUE)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LE
ADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
.addComponent(jButton5,
javax.swing.GroupLayout.PREFERRED_SIZE, 119,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(109, 109, 109))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
 .addComponent(jButton1,
javax.swing.GroupLayout.PREFERRED_SIZE, 199,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(18, 18, 18)
 .addComponent(jButton2)
 .addGap(18, 18, 18)
 .addComponent(jButton3)
 .addGap(18, 18, 18)
 .addComponent(jButton4)
 .addGap(148, 148, 148))))
 );
 jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new
java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});
 jPanel1Layout.setVerticalGroup(

jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
 .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(126, 126, 126)

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.B
ASELINE)
 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
79, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jButton2)
 .addComponent(jButton3)
 .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
58, javax.swing.GroupLayout.PREFERRED_SIZE))

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148,
Short.MAX_VALUE)
 .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(76, 76, 76))
 );
 jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new
java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});
 javax.swing.GroupLayout layout = new
javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 );
 pack();
 }// </editor-fold>
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
 //Play game
 try {
 Process p=Runtime.getRuntime().exec("C:\\Python27\\python.exe
Files\\game.py");
 } catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
     //Scrolling
 try {
 Process p=Runtime.getRuntime().exec("C:\\Python27\\python.exe
Files\\scrolling.py");
 } catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
 //Play/Pause
 try {
 Process p=Runtime.getRuntime().exec("C:\\Python27\\python.exe
Files\\pause.py");
 } catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 try {
 //Count Fingers
 Process p=Runtime.getRuntime().exec("C:\\Python27\\python.exe
Files\\count.py");
 } catch (IOException ex) {
 ex.printStackTrace();
 }
 }
 private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
 System.exit(0);
 }
 /**
 * @param args the command line arguments
 */
 public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
(optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look
and feel.
* For details see
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
 */
 try {
 for (javax.swing.UIManager.LookAndFeelInfo info :
javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {

java.util.logging.Logger.getLogger(Gesture.class.getName()).log(java.util.logging.Leve
l.SEVERE, null, ex);
 } catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(Gesture.class.getName()).log(java.util.logging.Leve
l.SEVERE, null, ex);
 } catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(Gesture.class.getName()).log(java.util.logging.Leve
l.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(Gesture.class.getName()).log(java.util.logging.Leve
l.SEVERE, null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Gesture().setVisible(true);
 }
 });
 }
 // Variables declaration - do not modify
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JButton jButton5;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel3;