package halalab;

public class HalaLab extends javax.swing.JFrame {

    int mentes = 1;

    public HalaLab() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpJatek = new javax.swing.JTabbedPane();
        pnKalandlap = new javax.swing.JPanel();
        pnStatok = new javax.swing.JPanel();
        lblEletero = new javax.swing.JLabel();
        lblUgyesseg = new javax.swing.JLabel();
        tbtUgyesseg = new javax.swing.JToggleButton();
        tbtEletero = new javax.swing.JToggleButton();
        tbtSzerencse = new javax.swing.JToggleButton();
        lblSzerencse = new javax.swing.JLabel();
        pnKalandor = new javax.swing.JPanel();
        lblKalandorKep = new javax.swing.JLabel();
        pnElso = new javax.swing.JPanel();
        lblElsoKep = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taElso = new javax.swing.JTextArea();
        tbt66 = new javax.swing.JToggleButton();
        tbt270 = new javax.swing.JToggleButton();
        pn270 = new javax.swing.JPanel();
        pn66 = new javax.swing.JPanel();
        lbl66 = new javax.swing.JLabel();
        btKalandlap = new javax.swing.JButton();
        btJatek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnKalandlap.setDoubleBuffered(false);
        pnKalandlap.setEnabled(false);

        pnStatok.setBorder(javax.swing.BorderFactory.createTitledBorder("Statok:"));

        lblEletero.setText("jLabel3");

        lblUgyesseg.setText("jLabel2");

        tbtUgyesseg.setText("ÜGYESSÉG:");

        tbtEletero.setText("ÉLETERŐ:");

        tbtSzerencse.setText("SZERENCSE:");

        lblSzerencse.setText("jLabel5");

        javax.swing.GroupLayout pnStatokLayout = new javax.swing.GroupLayout(pnStatok);
        pnStatok.setLayout(pnStatokLayout);
        pnStatokLayout.setHorizontalGroup(
            pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSzerencse)
                    .addComponent(tbtEletero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtUgyesseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEletero)
                    .addComponent(lblSzerencse)
                    .addComponent(lblUgyesseg))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnStatokLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbtEletero, tbtSzerencse, tbtUgyesseg});

        pnStatokLayout.setVerticalGroup(
            pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUgyesseg)
                    .addComponent(tbtUgyesseg))
                .addGap(37, 37, 37)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtEletero)
                    .addComponent(lblEletero))
                .addGap(34, 34, 34)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtSzerencse)
                    .addComponent(lblSzerencse))
                .addContainerGap())
        );

        pnKalandor.setBorder(javax.swing.BorderFactory.createTitledBorder("Roberto a Kalandor:"));

        lblKalandorKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/karakter.png"))); // NOI18N

        javax.swing.GroupLayout pnKalandorLayout = new javax.swing.GroupLayout(pnKalandor);
        pnKalandor.setLayout(pnKalandorLayout);
        pnKalandorLayout.setHorizontalGroup(
            pnKalandorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKalandorKep, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnKalandorLayout.setVerticalGroup(
            pnKalandorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKalandorLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblKalandorKep, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnKalandlapLayout = new javax.swing.GroupLayout(pnKalandlap);
        pnKalandlap.setLayout(pnKalandlapLayout);
        pnKalandlapLayout.setHorizontalGroup(
            pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandlapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnKalandor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnKalandlapLayout.setVerticalGroup(
            pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandlapLayout.createSequentialGroup()
                .addGroup(pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnKalandlapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnKalandor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnKalandlapLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tpJatek.addTab("Kalandlap", pnKalandlap);

        lblElsoKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/1. oldal.png"))); // NOI18N

        taElso.setColumns(20);
        taElso.setLineWrap(true);
        taElso.setRows(5);
        taElso.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. Ha inkább tovább haladsz észak felé, lapozz a 66-ra.");
        taElso.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taElso);

        tbt66.setText("jToggleButton6");
        tbt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt66ActionPerformed(evt);
            }
        });

        tbt270.setText("jToggleButton7");

        javax.swing.GroupLayout pnElsoLayout = new javax.swing.GroupLayout(pnElso);
        pnElso.setLayout(pnElsoLayout);
        pnElsoLayout.setHorizontalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElsoKep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnElsoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnElsoLayout.createSequentialGroup()
                        .addComponent(tbt66, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbt270, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        pnElsoLayout.setVerticalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbt270)
                    .addComponent(tbt66))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblElsoKep))
        );

        tpJatek.addTab("Játék", pnElso);

        javax.swing.GroupLayout pn270Layout = new javax.swing.GroupLayout(pn270);
        pn270.setLayout(pn270Layout);
        pn270Layout.setHorizontalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        pn270Layout.setVerticalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        tpJatek.addTab("tab4", pn270);

        lbl66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/66. oldal.png"))); // NOI18N

        javax.swing.GroupLayout pn66Layout = new javax.swing.GroupLayout(pn66);
        pn66.setLayout(pn66Layout);
        pn66Layout.setHorizontalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn66Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl66)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        pn66Layout.setVerticalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn66Layout.createSequentialGroup()
                .addComponent(lbl66, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab3", pn66);

        getContentPane().add(tpJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -36, -1, 310));

        btKalandlap.setText("KALANDLAP");
        btKalandlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKalandlapActionPerformed(evt);
            }
        });
        getContentPane().add(btKalandlap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        btJatek.setText("JÁTÉK");
        btJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJatekActionPerformed(evt);
            }
        });
        getContentPane().add(btJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKalandlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKalandlapActionPerformed
        mentes = tpJatek.getSelectedIndex();
        tpJatek.setSelectedIndex(0);
        
        if (mentes > 0) {
            btKalandlap.setEnabled(true);
        } else if (mentes == 0) {
            btKalandlap.setEnabled(false);
        }
        
    }//GEN-LAST:event_btKalandlapActionPerformed

    private void btJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJatekActionPerformed
        tpJatek.setSelectedIndex(mentes);
        if (mentes > 0) {
            btKalandlap.setEnabled(true);
        } else if (mentes == 0) {
            btKalandlap.setEnabled(false);
        }
        
    }//GEN-LAST:event_btJatekActionPerformed

    private void tbt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt66ActionPerformed
        mentes = tpJatek.getSelectedIndex();
        tpJatek.setSelectedIndex(3);
        
        if (mentes > 0) {
            btKalandlap.setEnabled(true);
        } else if (mentes == 0) {
            btKalandlap.setEnabled(false);
        }
       
    }//GEN-LAST:event_tbt66ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (mentes > 0) {
            btKalandlap.setEnabled(true);
        } else if (mentes == 0) {
            btKalandlap.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalaLab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJatek;
    private javax.swing.JButton btKalandlap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblElsoKep;
    private javax.swing.JLabel lblKalandorKep;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblUgyesseg;
    private javax.swing.JPanel pn270;
    private javax.swing.JPanel pn66;
    private javax.swing.JPanel pnElso;
    private javax.swing.JPanel pnKalandlap;
    private javax.swing.JPanel pnKalandor;
    private javax.swing.JPanel pnStatok;
    private javax.swing.JTextArea taElso;
    private javax.swing.JToggleButton tbt270;
    private javax.swing.JToggleButton tbt66;
    private javax.swing.JToggleButton tbtEletero;
    private javax.swing.JToggleButton tbtSzerencse;
    private javax.swing.JToggleButton tbtUgyesseg;
    private javax.swing.JTabbedPane tpJatek;
    // End of variables declaration//GEN-END:variables
}
