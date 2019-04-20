

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PatientFormv1 extends javax.swing.JFrame {

    /**
     * Creates new form PatientFormv1
     */
    
    public PatientFormv1() {
        initComponents();
        buttonGroupSex.add(RadioFemale);
        buttonGroupSex.add(RadioMale);
        RadioMale.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSex = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelAllergy = new javax.swing.JLabel();
        jLabelEMD = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        RadioMale = new javax.swing.JRadioButton();
        RadioFemale = new javax.swing.JRadioButton();
        Phone = new javax.swing.JTextField();
        EMail = new javax.swing.JTextField();
        Register = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        EMD = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Allergy = new javax.swing.JTextArea();
        jLabelBranch = new javax.swing.JLabel();
        Branch = new javax.swing.JComboBox();
        jLabelJob = new javax.swing.JLabel();
        Job = new javax.swing.JComboBox();
        jLabelID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabelClass = new javax.swing.JLabel();
        Class = new javax.swing.JTextField();
        jLabelLevel = new javax.swing.JLabel();
        Level = new javax.swing.JComboBox();
        Canc = new javax.swing.JButton();
        Ins = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Өвчтөн шинээр бүртгэх");

        jLabelLastName.setText("Овог:");

        jLabelFirstName.setText("Нэр: ");

        jLabelAge.setText("Нас:");

        jLabelSex.setText("Хүйс:");

        jLabelPhone.setText("Утас:");

        jLabelMail.setText("Э-майл:");

        jLabelRegister.setText("<html>Регистрийн <br> дугаар:</html>");

        jLabelAddress.setText("Хаяг:");

        jLabelAllergy.setText("Харшлын мэдээлэл:");

        jLabelEMD.setText("<html>ЭМДД<br>дугаар:</html>");

        LastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastNameKeyTyped(evt);
            }
        });

        FirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstNameKeyTyped(evt);
            }
        });

        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeKeyTyped(evt);
            }
        });

        RadioMale.setText("Эр");
        RadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMaleActionPerformed(evt);
            }
        });

        RadioFemale.setText("Эм");

        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneKeyTyped(evt);
            }
        });

        EMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EMailKeyTyped(evt);
            }
        });

        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterKeyTyped(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Address.setColumns(20);
        Address.setRows(5);
        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Address);

        EMD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EMDKeyTyped(evt);
            }
        });

        Allergy.setColumns(20);
        Allergy.setRows(5);
        Allergy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AllergyKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Allergy);

        jLabelBranch.setText("<html>Салбар<br>сургууль:</html>");

        Branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ХШУИС", "ШУС", "БС", "ОУХНУС", "ХЗС", "АС" }));
        Branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchActionPerformed(evt);
            }
        });

        jLabelJob.setText("Ажил:");

        Job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Багш", "Оюутан", "Ажилтан" }));

        jLabelID.setText("Сиси ID:");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });

        jLabelClass.setText("Анги:");

        Class.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClassKeyTyped(evt);
            }
        });

        jLabelLevel.setText("Түвшин:");

        Level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Бакалавр", "Магистр", "Доктор" }));

        Canc.setText("Cancel");
        Canc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancActionPerformed(evt);
            }
        });

        Ins.setText("Insert");
        Ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelLevel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ins)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Canc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelFirstName)
                                                .addComponent(jLabelAge)
                                                .addComponent(jLabelLastName))
                                            .addGap(41, 41, 41)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelSex)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RadioMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RadioFemale))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelPhone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelMail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EMail, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EMD, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelJob)
                                        .addGap(18, 18, 18)
                                        .addComponent(Job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelClass)
                                        .addGap(18, 18, 18)
                                        .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAllergy)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFirstName)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAge)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSex)
                            .addComponent(RadioMale)
                            .addComponent(RadioFemale)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAllergy)
                        .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLevel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ins)
                            .addComponent(Canc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMail)
                            .addComponent(EMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EMD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJob)
                            .addComponent(Job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClass)
                            .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioMaleActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void CancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancActionPerformed
        dispose();
        
    }//GEN-LAST:event_CancActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:
        
           
        
    }//GEN-LAST:event_PhoneActionPerformed

    private void BranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BranchActionPerformed

    private void PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneKeyTyped
        
        char c = evt.getKeyChar();
        String checker = Phone.getText();
        int ln = checker.length();
        if(Character.isDigit(c)){
            if(ln >= 8)
                evt.consume(); 
        }
    }//GEN-LAST:event_PhoneKeyTyped

    private void EMDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EMDKeyTyped
        char c = evt.getKeyChar();
        String checker = EMD.getText();
        int ln = checker.length();
        if(!Character.isDigit(c))
            evt.consume();
        if(ln >= 9)
                evt.consume();
    }//GEN-LAST:event_EMDKeyTyped

    private void AgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyTyped
        char c = evt.getKeyChar();
        String checker = Age.getText();
        int ln = checker.length();
        if(!Character.isDigit(c))
                evt.consume();
        if(ln >= 3)
                evt.consume();
    }//GEN-LAST:event_AgeKeyTyped

    private void LastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameKeyTyped
        char c = evt.getKeyChar();
        String checker = LastName.getText();
        int ln = checker.length();
        if(!Character.isLetter(c))
            evt.consume();
        if(ln >= 25)
            evt.consume();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameKeyTyped

    private void FirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameKeyTyped
        char c = evt.getKeyChar();
        String checker = FirstName.getText();
        int ln = checker.length();
        if(!Character.isLetter(c))
            evt.consume();
        if(ln >= 25)
            evt.consume();
    }//GEN-LAST:event_FirstNameKeyTyped

    private void RegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterKeyTyped
        String checker = Register.getText();
        int ln = checker.length();
        if(ln >= 10)
            evt.consume();
    }//GEN-LAST:event_RegisterKeyTyped

    private void EMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EMailKeyTyped
         String checker = EMail.getText();
        int ln = checker.length();
        if(ln >= 100)
            evt.consume();
    }//GEN-LAST:event_EMailKeyTyped

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
         String checker = ID.getText();
        int ln = checker.length();
        if(ln >= 12)
            evt.consume();
    }//GEN-LAST:event_IDKeyTyped

    private void ClassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClassKeyTyped
        String checker = Class.getText();
        int ln = checker.length();
        if(ln >= 50)
            evt.consume();
    }//GEN-LAST:event_ClassKeyTyped

    private void AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyTyped
        String checker = Address.getText();
        int ln = checker.length();
        if(ln >= 255)
            evt.consume();
    }//GEN-LAST:event_AddressKeyTyped

    private void AllergyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AllergyKeyTyped
        String checker = Allergy.getText();
        int ln = checker.length();
        if(ln >= 255)
            evt.consume(); 
    }//GEN-LAST:event_AllergyKeyTyped

    private void InsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsActionPerformed
        String sex;
        if(RadioFemale.isSelected())
            sex = "Female";
        else 
            sex = "Male";
        AddPatient p;
        p = new AddPatient();
        p.insertUpdateDeletePatient('i', null,FirstName.getText(), LastName.getText(), sex, Age.getText(), ID.getText(),Class.getText() , Branch.getSelectedItem().toString(), Phone.getText(), Address.getText(), Register.getText(), Allergy.getText(), EMail.getText(), EMD.getText(), Job.getSelectedItem().toString(), Level.getSelectedItem().toString());
    }//GEN-LAST:event_InsActionPerformed
                                    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientFormv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PatientFormv1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextArea Allergy;
    private javax.swing.JComboBox Branch;
    private javax.swing.JButton Canc;
    private javax.swing.JTextField Class;
    private javax.swing.JTextField EMD;
    private javax.swing.JTextField EMail;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Ins;
    private javax.swing.JComboBox Job;
    private javax.swing.JTextField LastName;
    private javax.swing.JComboBox Level;
    private javax.swing.JTextField Phone;
    private javax.swing.JRadioButton RadioFemale;
    private javax.swing.JRadioButton RadioMale;
    private javax.swing.JTextField Register;
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAllergy;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelEMD;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelJob;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
