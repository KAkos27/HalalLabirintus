package halalab;

import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class HalaLab extends javax.swing.JFrame {

    int mentes = 1;
    boolean gombTilto = true;

    int ugyesseg = 6;
    int eletero = 12;
    int szerencse = 6;
    int tamadoero = 0;
    int ellenfelEletero = 7;
    int ellenfelUgyesseg = 7;
    int ellenfelTamadoero = 0;
    int arany = 0;

    public HalaLab() {
        ImageIcon labKep = new ImageIcon("labirintus.png");
        String udvozloSzvoeg = "Üdvözöllek a Halál Labirintusban, kalandor.";
        String udvozloCim = "Halál Labirintus";

        JOptionPane.showMessageDialog(rootPane, udvozloSzvoeg, udvozloCim, HEIGHT, labKep);

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
        tbtArany = new javax.swing.JToggleButton();
        lblArany = new javax.swing.JLabel();
        pnKalandor = new javax.swing.JPanel();
        lblKalandorKep = new javax.swing.JLabel();
        pnElso = new javax.swing.JPanel();
        lblElsoKep = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taElso = new javax.swing.JTextArea();
        tbt66 = new javax.swing.JToggleButton();
        tbt270 = new javax.swing.JToggleButton();
        pn270 = new javax.swing.JPanel();
        lbl270 = new javax.swing.JLabel();
        tbt270tol66 = new javax.swing.JToggleButton();
        btKinyit = new javax.swing.JButton();
        pn66 = new javax.swing.JPanel();
        lbl66 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta66 = new javax.swing.JTextArea();
        tbt56 = new javax.swing.JToggleButton();
        tbt293 = new javax.swing.JToggleButton();
        pn56 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta56 = new javax.swing.JTextArea();
        lbl56 = new javax.swing.JLabel();
        tbt373 = new javax.swing.JToggleButton();
        tbt215 = new javax.swing.JToggleButton();
        pn293 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta293 = new javax.swing.JTextArea();
        lbl293 = new javax.swing.JLabel();
        tbt137 = new javax.swing.JToggleButton();
        tbt387 = new javax.swing.JToggleButton();
        pn215 = new javax.swing.JPanel();
        lbl215 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta67 = new javax.swing.JTextArea();
        pn373 = new javax.swing.JPanel();
        lbl373 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta373 = new javax.swing.JTextArea();
        pn137 = new javax.swing.JPanel();
        lbl137 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta374 = new javax.swing.JTextArea();
        pn387 = new javax.swing.JPanel();
        lbl387 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta387 = new javax.swing.JTextArea();
        btHarc = new javax.swing.JButton();
        lblbarlangi = new javax.swing.JLabel();
        lblBarHp = new javax.swing.JLabel();
        lblRoberto = new javax.swing.JLabel();
        lblRobHp = new javax.swing.JLabel();
        btKalandlap = new javax.swing.JButton();
        btJatek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halál Labirintus");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnKalandlap.setDoubleBuffered(false);
        pnKalandlap.setEnabled(false);

        pnStatok.setBorder(javax.swing.BorderFactory.createTitledBorder("Statok:"));

        lblEletero.setText("12");

        lblUgyesseg.setText("6");

        tbtUgyesseg.setText("ÜGYESSÉG:");
        tbtUgyesseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtUgyessegActionPerformed(evt);
            }
        });

        tbtEletero.setText("ÉLETERŐ:");
        tbtEletero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEleteroActionPerformed(evt);
            }
        });

        tbtSzerencse.setText("SZERENCSE:");
        tbtSzerencse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSzerencseActionPerformed(evt);
            }
        });

        lblSzerencse.setText("6");

        tbtArany.setSelected(true);
        tbtArany.setText("ARANY:");
        tbtArany.setEnabled(false);

        lblArany.setText("0");

        javax.swing.GroupLayout pnStatokLayout = new javax.swing.GroupLayout(pnStatok);
        pnStatok.setLayout(pnStatokLayout);
        pnStatokLayout.setHorizontalGroup(
            pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSzerencse)
                    .addComponent(tbtEletero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtUgyesseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtArany))
                .addGap(31, 31, 31)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEletero)
                    .addComponent(lblUgyesseg)
                    .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblArany, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSzerencse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnStatokLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbtArany, tbtEletero, tbtSzerencse, tbtUgyesseg});

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtArany)
                    .addComponent(lblArany))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnKalandlapLayout.setVerticalGroup(
            pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandlapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnKalandor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tpJatek.addTab("Kalandlap", pnKalandlap);

        lblElsoKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/1. oldal.png"))); // NOI18N

        taElso.setEditable(false);
        taElso.setColumns(20);
        taElso.setLineWrap(true);
        taElso.setRows(5);
        taElso.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. Ha inkább tovább haladsz észak felé, lapozz a 66-ra.");
        taElso.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taElso);

        tbt66.setText("66.");
        tbt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt66ActionPerformed(evt);
            }
        });

        tbt270.setText("270.");
        tbt270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt270ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnElsoLayout = new javax.swing.GroupLayout(pnElso);
        pnElso.setLayout(pnElsoLayout);
        pnElsoLayout.setHorizontalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElsoKep)
                .addGap(18, 18, 18)
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnElsoLayout.createSequentialGroup()
                        .addComponent(tbt66, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbt270, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnElsoLayout.setVerticalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnElsoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbt270)
                            .addComponent(tbt66)))
                    .addGroup(pnElsoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblElsoKep)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tpJatek.addTab("Játék", pnElso);

        lbl270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/270. oldal 1.png"))); // NOI18N

        tbt270tol66.setText("66.");
        tbt270tol66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt270tol66ActionPerformed(evt);
            }
        });

        btKinyit.setText("Kinyit");
        btKinyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKinyitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn270Layout = new javax.swing.GroupLayout(pn270);
        pn270.setLayout(pn270Layout);
        pn270Layout.setHorizontalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn270Layout.createSequentialGroup()
                .addComponent(lbl270)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btKinyit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbt270tol66, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pn270Layout.setVerticalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn270Layout.createSequentialGroup()
                .addComponent(lbl270)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(pn270Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKinyit)
                    .addComponent(tbt270tol66))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab4", pn270);

        lbl66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/66. oldal.png"))); // NOI18N

        ta66.setEditable(false);
        ta66.setColumns(20);
        ta66.setLineWrap(true);
        ta66.setRows(5);
        ta66.setText("Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.");
        ta66.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta66);

        tbt56.setText("56.");
        tbt56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt56ActionPerformed(evt);
            }
        });

        tbt293.setText("293.");
        tbt293.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt293ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn66Layout = new javax.swing.GroupLayout(pn66);
        pn66.setLayout(pn66Layout);
        pn66Layout.setHorizontalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl66)
                .addGap(19, 19, 19)
                .addGroup(pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn66Layout.createSequentialGroup()
                        .addComponent(tbt56, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbt293, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn66Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbt293, tbt56});

        pn66Layout.setVerticalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn66Layout.createSequentialGroup()
                .addGroup(pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn66Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbt56)
                            .addComponent(tbt293)))
                    .addGroup(pn66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl66, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab3", pn66);

        ta56.setEditable(false);
        ta56.setColumns(20);
        ta56.setLineWrap(true);
        ta56.setRows(5);
        ta56.setText("Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. Ha ketté akarod vágni a kardoddal, lapozz a 215-re.");
        ta56.setWrapStyleWord(true);
        jScrollPane4.setViewportView(ta56);

        lbl56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/56. oldal.png"))); // NOI18N

        tbt373.setText("373.");
        tbt373.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt373ActionPerformed(evt);
            }
        });

        tbt215.setText("215.");
        tbt215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt215ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn56Layout = new javax.swing.GroupLayout(pn56);
        pn56.setLayout(pn56Layout);
        pn56Layout.setHorizontalGroup(
            pn56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn56Layout.createSequentialGroup()
                .addComponent(lbl56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn56Layout.createSequentialGroup()
                        .addComponent(tbt215, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tbt373, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        pn56Layout.setVerticalGroup(
            pn56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn56Layout.createSequentialGroup()
                .addGroup(pn56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn56Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pn56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbt373)
                            .addComponent(tbt215)))
                    .addComponent(lbl56))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab5", pn56);

        ta293.setEditable(false);
        ta293.setColumns(20);
        ta293.setLineWrap(true);
        ta293.setRows(5);
        ta293.setText("A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re. Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.");
        ta293.setWrapStyleWord(true);
        jScrollPane5.setViewportView(ta293);

        lbl293.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/293. oldal.png"))); // NOI18N

        tbt137.setText("137.");
        tbt137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt137ActionPerformed(evt);
            }
        });

        tbt387.setText("387.");
        tbt387.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt387ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn293Layout = new javax.swing.GroupLayout(pn293);
        pn293.setLayout(pn293Layout);
        pn293Layout.setHorizontalGroup(
            pn293Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn293Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl293)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn293Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn293Layout.createSequentialGroup()
                        .addComponent(tbt137, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbt387, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        pn293Layout.setVerticalGroup(
            pn293Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn293Layout.createSequentialGroup()
                .addGroup(pn293Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn293Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl293))
                    .addGroup(pn293Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn293Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbt137)
                            .addComponent(tbt387))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab6", pn293);

        lbl215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/215. oldal .png"))); // NOI18N

        ta67.setEditable(false);
        ta67.setColumns(20);
        ta67.setLineWrap(true);
        ta67.setRows(5);
        ta67.setText("Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. 2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.");
        ta67.setWrapStyleWord(true);
        jScrollPane6.setViewportView(ta67);

        javax.swing.GroupLayout pn215Layout = new javax.swing.GroupLayout(pn215);
        pn215.setLayout(pn215Layout);
        pn215Layout.setHorizontalGroup(
            pn215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn215Layout.createSequentialGroup()
                .addComponent(lbl215)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn215Layout.setVerticalGroup(
            pn215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn215Layout.createSequentialGroup()
                .addComponent(lbl215)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn215Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab7", pn215);

        lbl373.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/373. oldal.png"))); // NOI18N

        ta373.setEditable(false);
        ta373.setColumns(20);
        ta373.setLineWrap(true);
        ta373.setRows(5);
        ta373.setText("Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé");
        ta373.setWrapStyleWord(true);
        jScrollPane7.setViewportView(ta373);

        javax.swing.GroupLayout pn373Layout = new javax.swing.GroupLayout(pn373);
        pn373.setLayout(pn373Layout);
        pn373Layout.setHorizontalGroup(
            pn373Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn373Layout.createSequentialGroup()
                .addComponent(lbl373)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn373Layout.setVerticalGroup(
            pn373Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn373Layout.createSequentialGroup()
                .addComponent(lbl373)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn373Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab7", pn373);

        lbl137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/harang.png"))); // NOI18N

        ta374.setEditable(false);
        ta374.setColumns(20);
        ta374.setLineWrap(true);
        ta374.setRows(5);
        ta374.setText("Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.");
        ta374.setWrapStyleWord(true);
        jScrollPane8.setViewportView(ta374);

        javax.swing.GroupLayout pn137Layout = new javax.swing.GroupLayout(pn137);
        pn137.setLayout(pn137Layout);
        pn137Layout.setHorizontalGroup(
            pn137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn137Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl137)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pn137Layout.setVerticalGroup(
            pn137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn137Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pn137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn137Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl137))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab7", pn137);

        lbl387.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/387. oldal.png"))); // NOI18N

        ta387.setEditable(false);
        ta387.setColumns(20);
        ta387.setLineWrap(true);
        ta387.setRows(5);
        ta387.setText("Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel. Barlangi Ember ÜGYESSÉG 7 ÉLETERŐ 7 ");
        ta387.setWrapStyleWord(true);
        jScrollPane9.setViewportView(ta387);

        btHarc.setText("Harc!!!");
        btHarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHarcActionPerformed(evt);
            }
        });

        lblbarlangi.setText("Barlangi Ember");

        lblBarHp.setText("asd");

        lblRoberto.setText("Roberto, a Kalandor");

        lblRobHp.setText("asd");

        javax.swing.GroupLayout pn387Layout = new javax.swing.GroupLayout(pn387);
        pn387.setLayout(pn387Layout);
        pn387Layout.setHorizontalGroup(
            pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn387Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl387)
                .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn387Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn387Layout.createSequentialGroup()
                                    .addComponent(lblbarlangi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBarHp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn387Layout.createSequentialGroup()
                                    .addComponent(lblRoberto)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblRobHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pn387Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btHarc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn387Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBarHp, lblRobHp});

        pn387Layout.setVerticalGroup(
            pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn387Layout.createSequentialGroup()
                .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn387Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbarlangi)
                            .addComponent(lblBarHp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btHarc))
                    .addGroup(pn387Layout.createSequentialGroup()
                        .addComponent(lbl387)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pn387Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoberto)
                    .addComponent(lblRobHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pn387Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBarHp, lblRobHp});

        tpJatek.addTab("tab7", pn387);

        getContentPane().add(tpJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -36, 510, 370));

        btKalandlap.setText("KALANDLAP");
        btKalandlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKalandlapActionPerformed(evt);
            }
        });
        getContentPane().add(btKalandlap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        btJatek.setText("JÁTÉK");
        btJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJatekActionPerformed(evt);
            }
        });
        getContentPane().add(btJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btKalandlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKalandlapActionPerformed
        mentes = tpJatek.getSelectedIndex();
        gombTilto = true;
        tpJatek.setSelectedIndex(0);

        gombTiltas();
    }//GEN-LAST:event_btKalandlapActionPerformed

    private void btJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJatekActionPerformed
        boolean statMegadva = tbtUgyesseg.isSelected() & tbtEletero.isSelected() & tbtSzerencse.isSelected();
        if (statMegadva) {
            tpJatek.setSelectedIndex(mentes);
            gombTilto = false;

            gombTiltas();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nem számoltad ki a statjaidat!");
        }
    }//GEN-LAST:event_btJatekActionPerformed

    private void tbt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt66ActionPerformed
        tpJatek.setSelectedIndex(3);
    }//GEN-LAST:event_tbt66ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        gombTiltas();
    }//GEN-LAST:event_formWindowOpened

    private void tbtUgyessegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtUgyessegActionPerformed
        int dobas = doboKocka(7);

        ugyesseg = dobas + ugyesseg;
        lblUgyesseg.setText(ugyesseg + "");
        tbtUgyesseg.setEnabled(false);
    }//GEN-LAST:event_tbtUgyessegActionPerformed

    private void tbtEleteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEleteroActionPerformed
        int dobas = doboKocka(13);

        eletero += dobas;
        lblEletero.setText(eletero + "");
        tbtEletero.setEnabled(false);
    }//GEN-LAST:event_tbtEleteroActionPerformed

    private void tbtSzerencseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSzerencseActionPerformed
        int dobas = doboKocka(7);

        szerencse += dobas;
        lblSzerencse.setText(szerencse + "");
        tbtSzerencse.setEnabled(false);
    }//GEN-LAST:event_tbtSzerencseActionPerformed

    private void tbt270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt270ActionPerformed
        tpJatek.setSelectedIndex(2);
        tbt270tol66.setEnabled(false);
    }//GEN-LAST:event_tbt270ActionPerformed

    private void tbt270tol66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt270tol66ActionPerformed
        tpJatek.setSelectedIndex(3);
    }//GEN-LAST:event_tbt270tol66ActionPerformed

    private void tbt56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt56ActionPerformed
        tpJatek.setSelectedIndex(4);
    }//GEN-LAST:event_tbt56ActionPerformed

    private void tbt293ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt293ActionPerformed
        tpJatek.setSelectedIndex(5);
    }//GEN-LAST:event_tbt293ActionPerformed

    private void tbt215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt215ActionPerformed
        tpJatek.setSelectedIndex(6);
        eletero -= 2;
        lblEletero.setText(eletero + "");
    }//GEN-LAST:event_tbt215ActionPerformed

    private void tbt373ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt373ActionPerformed
        tpJatek.setSelectedIndex(7);
    }//GEN-LAST:event_tbt373ActionPerformed

    private void tbt137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt137ActionPerformed
        tpJatek.setSelectedIndex(8);
    }//GEN-LAST:event_tbt137ActionPerformed

    private void tbt387ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt387ActionPerformed
        tpJatek.setSelectedIndex(9);
        lblBarHp.setText("Életerő: " + ellenfelEletero);
        lblRobHp.setText("Életerő: " + eletero);
    }//GEN-LAST:event_tbt387ActionPerformed

    private void btHarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHarcActionPerformed
        harcRendszer();
    }//GEN-LAST:event_btHarcActionPerformed

    private void harcRendszer() throws HeadlessException {
        int elsoDobas = doboKocka(7);
        int masodikDobas = doboKocka(7);
        int sebzes = -2;
        int ellenfelSebzes = 2;

        ellenfelTamadoero = elsoDobas + ellenfelUgyesseg;
        tamadoero = masodikDobas + ugyesseg;

        String cim = "Harc!!!";
        String harcSzoveg = "Barlangi Ember támadóereje: " + ellenfelTamadoero + "\nRoberto, a Kalandor támadóereje: " + tamadoero;
        String robNyerSzoveg = "\nMeg fogod sebezni a barlangi embert!\nPróbára teszed a szerencséd?";
        String barNyerSzoveg = "\nMeg fog sebezni a barlangi ember!\nPróbára teszed a szerencséd?";
        String blokkSzoveg = "\nBlokkoltátok egymás támadását!";
        String gyozSzoveg = "Nyertél!";
        String verSzoveg = "Vesztettél!";

        boolean robertoNagyobb = tamadoero > ellenfelTamadoero;
        boolean egyenlo = tamadoero == ellenfelTamadoero;

        ImageIcon blokk = new ImageIcon("blokk.png");
        ImageIcon robNyer = new ImageIcon("robnyer.png");
        ImageIcon barNyer = new ImageIcon("barnyer.png");
        ImageIcon veresegKep = new ImageIcon("gameover.png");
        ImageIcon gyozelemKep = new ImageIcon("victory.png");

        if (egyenlo) {
            JOptionPane.showMessageDialog(rootPane, harcSzoveg + blokkSzoveg, cim, HEIGHT, blokk);
        } else if (robertoNagyobb) {
            sebzes = sebzesKalkulacio(harcSzoveg, robNyerSzoveg, cim, robNyer, sebzes);
            ellenfelEletero += sebzes;
            tamadasKimenetel(verSzoveg, cim, veresegKep, gyozSzoveg, gyozelemKep);
        } else if (!robertoNagyobb) {
            ellenfelSebzes = sebzesKalkulacio(harcSzoveg, barNyerSzoveg, cim, barNyer, ellenfelSebzes);
            eletero -= ellenfelSebzes;
            tamadasKimenetel(verSzoveg, cim, veresegKep, gyozSzoveg, gyozelemKep);
        }
    }

    private void tamadasKimenetel(String verSzoveg, String cim, ImageIcon veresegKep, String gyozSzoveg, ImageIcon gyozelemKep) throws HeadlessException {
        String hpKiiras = "Életerő: " + eletero;
        String barHpKiiras = "Életerő: " + ellenfelEletero;
        String kalandlapHpKiiras = eletero + "";

        lblBarHp.setText(barHpKiiras);
        lblRobHp.setText(hpKiiras);
        lblEletero.setText(kalandlapHpKiiras);

        boolean vege = eletero < 1 || ellenfelEletero < 1;
        if (vege) {
            if (eletero < ellenfelEletero) {
                JOptionPane.showMessageDialog(rootPane, verSzoveg, cim, HEIGHT, veresegKep);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(rootPane, gyozSzoveg, cim, HEIGHT, gyozelemKep);
                System.exit(0);
            }
        }
    }

    private int sebzesKalkulacio(String harcSzoveg, String gyozelemSzoveg, String cim, ImageIcon nyertesKep, int vegsoSebzes) throws HeadlessException {
        int szerencseHasznalat = JOptionPane.showConfirmDialog(rootPane, harcSzoveg + gyozelemSzoveg, cim, YES_NO_OPTION, HEIGHT, nyertesKep);
        boolean vanSzerencse = szerencseHasznalat == 0 & szerencse > 0;
        boolean nincsSzerencse = szerencseHasznalat == 0 & szerencse < 1;
        if (vanSzerencse) {

            vegsoSebzes = szerencseKalkulacio(vegsoSebzes);
            szerencse -= 1;
            lblSzerencse.setText(szerencse + "");

        } else if (nincsSzerencse) {
            JOptionPane.showMessageDialog(rootPane, "Kifogytál a szerencséből!", cim, HEIGHT);

        }
        return vegsoSebzes;
    }

    private void btKinyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKinyitActionPerformed
        ImageIcon kep = new ImageIcon("270. oldal 2.png");
        String ladaSzoveg = "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz,\nés egy üzenetet, amely egy kis pergamenen neked szól.\nElőbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet:\n- „Jól tetted. Legalább volt annyi eszed, hogy megállj és\nelfogadd az ajándékot. Most azt tanácsolom neked, hogy keress\nés használj különféle tárgyakat, ha sikerrel akarsz áthaladni\nHalállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot,\napródarabokra téped a pergament, és tovább mészészak felé.\nLapozz a 66-ra.";
        JOptionPane.showMessageDialog(rootPane, ladaSzoveg, "Jutalom", HEIGHT, kep);
        arany += 2;
        lblArany.setText(arany + "");
        btKinyit.setEnabled(false);
        tbt270tol66.setEnabled(true);
    }//GEN-LAST:event_btKinyitActionPerformed

    public int szerencseKalkulacio(int sebzes) {
        ImageIcon szerencseKep = new ImageIcon("szerencse.png");
        ImageIcon balSZerencseKep = new ImageIcon("balszerencse.png");

        int szerencseDobas = doboKocka(13);
        if (szerencseDobas < szerencse) {
            JOptionPane.showMessageDialog(rootPane, "Szerencse", "Szerencse", HEIGHT, szerencseKep);
            sebzes -= 1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "balszerencse", "balszerencse", HEIGHT, balSZerencseKep);
            sebzes += 1;
        }
        return sebzes;
    }

    public int doboKocka(int max) {
        Random rand = new Random();
        int dobas = rand.nextInt(max);
        if (max == 7) {
            while (dobas == 0) {
                dobas = rand.nextInt(max);
            }
            return dobas;
        } else if (max == 13) {
            while (dobas < 2) {
                dobas = rand.nextInt(max);
            }
            return dobas;
        }
        return 0;
    }

    private void gombTiltas() {
        if (gombTilto == true) {
            btJatek.setEnabled(true);
            btKalandlap.setEnabled(false);
        } else if (gombTilto == false) {
            btJatek.setEnabled(false);
            btKalandlap.setEnabled(true);
        }
    }

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
    private javax.swing.JButton btHarc;
    private javax.swing.JButton btJatek;
    private javax.swing.JButton btKalandlap;
    private javax.swing.JButton btKinyit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbl137;
    private javax.swing.JLabel lbl215;
    private javax.swing.JLabel lbl270;
    private javax.swing.JLabel lbl293;
    private javax.swing.JLabel lbl373;
    private javax.swing.JLabel lbl387;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lblArany;
    private javax.swing.JLabel lblBarHp;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblElsoKep;
    private javax.swing.JLabel lblKalandorKep;
    private javax.swing.JLabel lblRobHp;
    private javax.swing.JLabel lblRoberto;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblUgyesseg;
    private javax.swing.JLabel lblbarlangi;
    private javax.swing.JPanel pn137;
    private javax.swing.JPanel pn215;
    private javax.swing.JPanel pn270;
    private javax.swing.JPanel pn293;
    private javax.swing.JPanel pn373;
    private javax.swing.JPanel pn387;
    private javax.swing.JPanel pn56;
    private javax.swing.JPanel pn66;
    private javax.swing.JPanel pnElso;
    private javax.swing.JPanel pnKalandlap;
    private javax.swing.JPanel pnKalandor;
    private javax.swing.JPanel pnStatok;
    private javax.swing.JTextArea ta293;
    private javax.swing.JTextArea ta373;
    private javax.swing.JTextArea ta374;
    private javax.swing.JTextArea ta387;
    private javax.swing.JTextArea ta56;
    private javax.swing.JTextArea ta66;
    private javax.swing.JTextArea ta67;
    private javax.swing.JTextArea taElso;
    private javax.swing.JToggleButton tbt137;
    private javax.swing.JToggleButton tbt215;
    private javax.swing.JToggleButton tbt270;
    private javax.swing.JToggleButton tbt270tol66;
    private javax.swing.JToggleButton tbt293;
    private javax.swing.JToggleButton tbt373;
    private javax.swing.JToggleButton tbt387;
    private javax.swing.JToggleButton tbt56;
    private javax.swing.JToggleButton tbt66;
    private javax.swing.JToggleButton tbtArany;
    private javax.swing.JToggleButton tbtEletero;
    private javax.swing.JToggleButton tbtSzerencse;
    private javax.swing.JToggleButton tbtUgyesseg;
    private javax.swing.JTabbedPane tpJatek;
    // End of variables declaration//GEN-END:variables
}
