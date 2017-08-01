
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddAccount = new javax.swing.JButton();
        ViewAccount = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        DepositWithdraw = new javax.swing.JButton();
        TransferMoney = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        PayBill = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        AppInterest = new javax.swing.JButton();
        SerCharge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        AddAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddAccount.setText("Add New Account");
        AddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountActionPerformed(evt);
            }
        });

        ViewAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewAccount.setText("View Account Info");
        ViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAccountActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Close.setText("Sign Out");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        DepositWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DepositWithdraw.setText("Deposit/Withdraw");
        DepositWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositWithdrawActionPerformed(evt);
            }
        });

        TransferMoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TransferMoney.setText("Transfer Money");
        TransferMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferMoneyActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IBA Fees", "SSGC", "K-Electric" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PayBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PayBill.setText("Pay");
        PayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBillActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Welcome to MMM Bank");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Logged In As");

        name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name1.setText("jLabel3");

        AppInterest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AppInterest.setText("Apply Interest");
        AppInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppInterestActionPerformed(evt);
            }
        });

        SerCharge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SerCharge.setText("Apply Service Charges");
        SerCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerChargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepositWithdraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(ViewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PayBill, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(TransferMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(SerCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AppInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransferMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SerCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayBill, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountActionPerformed

        NewAccountForm naf = new NewAccountForm();
        naf.show();
    }//GEN-LAST:event_AddAccountActionPerformed

    private void ViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAccountActionPerformed
        DisplayAccount da = new DisplayAccount();
        String accNo = JOptionPane.showInputDialog("Enter Account Number");
        da.checkAndDisplayAcc(accNo);
    }//GEN-LAST:event_ViewAccountActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, " Are You Sure ?");
        if (a == 0) {
            System.exit(1);
            this.setVisible(false);
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void DepositWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositWithdrawActionPerformed
        DepositWithdrawForm dwf = new DepositWithdrawForm();
        dwf.show();
    }//GEN-LAST:event_DepositWithdrawActionPerformed

    private void TransferMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferMoneyActionPerformed
        TransferMoneyForm tmf = new TransferMoneyForm();
        tmf.show();
    }//GEN-LAST:event_TransferMoneyActionPerformed

    private void PayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBillActionPerformed
        if (jComboBox1.getSelectedItem() == "IBA Fees") {
            IBAFeesForm iff = new IBAFeesForm();
            iff.show();
        }
        if (jComboBox1.getSelectedItem() == "SSGC") {
            SSGCBillForm sbf = new SSGCBillForm();
            sbf.show();
        }
        if (jComboBox1.getSelectedItem() == "K-Electric") {
            KEBillForm kbf = new KEBillForm();
            kbf.show();
        }
    }//GEN-LAST:event_PayBillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReportTypeForm rpf = new ReportTypeForm();
        rpf.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AppInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppInterestActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure to apply Interest");
        if (a == 0) {
            Account na = new Account();
            na.applyinterest();
            JOptionPane.showMessageDialog(rootPane, " Interest has been applied to all Savings and Term Deposit Accounts");
            na.mang.closeConn();
        }
    }//GEN-LAST:event_AppInterestActionPerformed

    private void SerChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerChargeActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure to apply Service Charges");
        if (a == 0) {
            Account na = new Account();
            na.applyService();
            JOptionPane.showMessageDialog(rootPane, " Service Charges has been applied to certain accounts");
            na.mang.closeConn();

                }    }//GEN-LAST:event_SerChargeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccount;
    private javax.swing.JButton AppInterest;
    private javax.swing.JButton Close;
    private javax.swing.JButton DepositWithdraw;
    private javax.swing.JButton PayBill;
    private javax.swing.JButton SerCharge;
    private javax.swing.JButton TransferMoney;
    private javax.swing.JButton ViewAccount;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
