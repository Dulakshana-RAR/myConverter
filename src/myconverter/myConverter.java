package myconverter;

public class myConverter extends javax.swing.JFrame {

    public myConverter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        main_unit = new javax.swing.JComboBox<>();
        from_value = new javax.swing.JTextField();
        to_value = new javax.swing.JTextField();
        from_unit = new javax.swing.JComboBox<>();
        to_unit = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("myConverter");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Attic", 1, 24)); // NOI18N
        jLabel1.setText("myConverter");

        jLabel2.setText("Select unit type");

        main_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Length", "Temperature", "Time", "Weight" }));
        main_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_unitActionPerformed(evt);
            }
        });

        from_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_valueActionPerformed(evt);
            }
        });

        to_value.setEditable(false);

        from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From" }));
        from_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_unitActionPerformed(evt);
            }
        });

        to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To" }));

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Attic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 51));
        jButton5.setText("G");
        jButton5.setPreferredSize(new java.awt.Dimension(23, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(main_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(from_value)
                                    .addComponent(from_unit, 0, 165, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(to_unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(to_value)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(main_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(from_value, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(to_value, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear))
                .addContainerGap(14, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        // TODO add your handling code here:
        double fromvalue;
        double tovalue = 0.0;
        double x;
        try{
            fromvalue = Double.parseDouble(from_value.getText()); 
            
            int mainunit = main_unit.getSelectedIndex();
            int fromunit = from_unit.getSelectedIndex();
            int tounit = to_unit.getSelectedIndex();
            
            switch (mainunit){
                case 0:
                    switch (fromunit){
                        case 0:
                            switch (tounit){
                                case 0:
                                    tovalue = fromvalue;
                                    break;
                                case 1:
                                    tovalue = fromvalue * 39.3701;
                                    break;
                                case 2:
                                    tovalue = fromvalue * 3.28084;
                                    break;
                                case 3:
                                    tovalue = fromvalue * 0.000621371;
                                    break;
                            }
                            break;
                        case 1:
                            x = fromvalue * 0.0254;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue = fromvalue;
                                    break;
                                case 2:
                                    tovalue = x * 3.28084;
                                    break;
                                case 3:
                                    tovalue = x * 0.000621371;
                                    break;
                            }
                            break;
                        case 2:
                            x = fromvalue * 0.3048;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue = x * 39.3701;
                                    break;
                                case 2:
                                    tovalue = fromvalue;
                                    break;
                                case 3:
                                    tovalue = x * 0.000621371;
                                    break;
                            }
                            break;
                        case 3:
                            x = fromvalue * 1609.34;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue = x * 39.3701;
                                    break;
                                case 2:
                                    tovalue = x * 3.28084;
                                    break;
                                case 3:
                                    tovalue = fromvalue;
                                    break;
                            }
                            break;
                    }
                    break;
                case 1:
                    switch (fromunit){
                        case 0:
                            switch (tounit){
                                case 0:
                                    tovalue = fromvalue;
                                    break;
                                case 1:
                                    tovalue =  1.8*(fromvalue-273) + 32;
                                    break;
                                case 2:
                                    tovalue =  fromvalue - 273.15;
                                    break;
                                case 3:
                                    tovalue =  (fromvalue - 273.15) * 33/100;
                                    break;
                            }
                            break;
                        case 1:
                            x = ((fromvalue - 32)*5)/9 + 273.5;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  fromvalue;
                                    break;
                                case 2:
                                    tovalue =  x - 273.15;
                                    break;
                                case 3:
                                    tovalue =  (x - 273.15) * 33/100;
                                    break;
                            }
                            break;
                        case 2:
                            x = fromvalue + 273.15;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  1.8*(x-273) + 32;
                                    break;
                                case 2:
                                    tovalue =  fromvalue;
                                    break;
                                case 3:
                                    tovalue =  (x - 273.15) * 33/100;
                                    break;
                            }
                            break;
                        case 3:
                            x = (fromvalue * 100/33) + 273.15;
                            switch (tounit){
                                case 0:
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  1.8*(x-273) + 32;
                                    break;
                                case 2:
                                    tovalue =  x - 273.15;
                                    break;
                                case 3:
                                    tovalue =  fromvalue;
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:  //time
                    switch (fromunit){
                        case 0: //soconds to
                            switch (tounit){
                                case 0:  //seconds
                                    tovalue = fromvalue;
                                    break;
                                case 1:  //minutes
                                    tovalue =  fromvalue / 60;
                                    break;
                                case 2:  //hours
                                    tovalue =  fromvalue / 3600;
                                    break;
                                case 3:  //days
                                    tovalue =  fromvalue / (3600 * 24);
                                    break;
                            }
                            break;
                        case 1:  //minutes to seconds then to
                            x = fromvalue * 60;
                            switch (tounit){
                                case 0: 
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  fromvalue;
                                    break;
                                case 2:
                                    tovalue =  x / 3600;
                                    break;
                                case 3:
                                    tovalue =  x / (3600 * 24);
                                    break;
                            }
                            break;
                        case 2:  //hours
                            x = fromvalue * 3600;
                            switch (tounit){
                                case 0: 
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  x / 60;
                                    break;
                                case 2:
                                    tovalue =  fromvalue;
                                    break;
                                case 3:
                                    tovalue =  x / (3600 * 24);
                                    break;
                            }
                            break;
                        case 3:
                            x = fromvalue * 3600 * 24;
                            switch (tounit){
                                case 0: 
                                    tovalue = x;
                                    break;
                                case 1:
                                    tovalue =  x / 60;
                                    break;
                                case 2:
                                    tovalue =  x / 3600;
                                    break;
                                case 3:
                                    tovalue =  fromvalue;
                                    break;
                            }
                            break;
                    }
                    break;
                case 3: //weight
                    switch (fromunit){
                        case 0: //grams
                            switch (tounit){
                                case 0: //grams
                                    tovalue = fromvalue;
                                    break;
                                case 1: //pounds
                                    tovalue =  fromvalue * 0.00220462;
                                    break;
                                case 2: //ton
                                    tovalue =  fromvalue / 1000000;
                                    break;
                                case 3: //kilogram
                                    tovalue =  fromvalue / 1000;
                                    break;
                            }
                            break;
                        case 1: //pounds
                            x = fromvalue * 453.592;
                            switch (tounit){
                                case 0: //grams
                                    tovalue = x;
                                    break;
                                case 1: //pounds
                                    tovalue =  fromvalue;
                                    break;
                                case 2: //ton
                                    tovalue =  x / 1000000;
                                    break;
                                case 3: //kilogram
                                    tovalue =  x / 1000;
                                    break;
                            }
                            break;
                        case 2: //tons
                            x = fromvalue * 1000000;
                            switch (tounit){
                                case 0: //grams
                                    tovalue = x;
                                    break;
                                case 1: //pounds
                                    tovalue =  x * 0.00220462;
                                    break;
                                case 2: //ton
                                    tovalue =  fromvalue;
                                    break;
                                case 3: //kilogram
                                    tovalue =  x / 1000;
                                    break;
                            }
                            break;
                        case 3: //kilograms
                            x = fromvalue * 1000;
                            switch (tounit){
                                case 0: //grams
                                    tovalue = x;
                                    break;
                                case 1: //pounds
                                    tovalue =  x * 0.00220462;
                                    break;
                                case 2: //ton
                                    tovalue =  x / 1000000;
                                    break;
                                case 3: //kilogram
                                    tovalue =  fromvalue;
                                    break;
                            }
                            break;
                    }
                    break;
            
            }
            
        }
        catch(Exception e){
            System.out.println("exception : "+ e);
        }
        
        to_value.setText(String.valueOf(tovalue));
        
    }//GEN-LAST:event_convertActionPerformed

    
    private void from_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_unitActionPerformed

    private void from_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_valueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_from_valueActionPerformed

    private void main_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_unitActionPerformed
        // TODO add your handling code here:
        int mainunit = main_unit.getSelectedIndex();
      
        switch (mainunit){
            case 0:
                    from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meter", "Inch", "Foot", "Mile" }));
                    to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meter", "Inch", "Foot", "Mile" }));
                    break;
            case 1:
                    from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Fahrenheit", "Celsius", "Newton" }));
                    to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Fahrenheit", "Celsius", "Newton" }));
                    break;
            case 2:
                    from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Second", "Minute", "Hour", "Day" }));
                    to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Second", "Minute", "Hour", "Day" }));
                    break;
            case 3:
                    from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gram", "Pound", "Ton", "Kilogram" }));
                    to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gram", "Pound", "Ton", "Kilogram" }));
                    break;
            case 4:
                    from_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Octal", "Decimal", "HexaDecimal" }));
                    to_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Octal", "Decimal", "HexaDecimal" }));
                    break;        
        }
    }//GEN-LAST:event_main_unitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        from_value.setText("");
        to_value.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        game1 game = new game1();
        game.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(myConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new myConverter().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> from_unit;
    private javax.swing.JTextField from_value;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> main_unit;
    private javax.swing.JComboBox<String> to_unit;
    private javax.swing.JTextField to_value;
    // End of variables declaration//GEN-END:variables
}
