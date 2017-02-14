package pl.gendoria.rpgmvtranslationextractor;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 *
 */
public class TranslationExtractorWindow extends javax.swing.JFrame {

    /**
     * Creates new form StartWindow
     */
    public TranslationExtractorWindow() {
        initComponents();

        DocumentListener outputChanged = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOutputFilePath();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOutputFilePath();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateOutputFilePath();
            }
        };

        outputFolder.getDocument().addDocumentListener(outputChanged);
        outputFile.getDocument().addDocumentListener(outputChanged);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsPanel = new javax.swing.JPanel();
        keyFormatLabel = new javax.swing.JLabel();
        inputFolderLabel = new javax.swing.JLabel();
        outputFolderLabel = new javax.swing.JLabel();
        keyFormat = new javax.swing.JTextField();
        inputFolder = new javax.swing.JTextField();
        inputFolderChooser = new javax.swing.JButton();
        outputFolder = new javax.swing.JTextField();
        outputFolderChooser = new javax.swing.JButton();
        outputFile = new javax.swing.JTextField();
        outputFileLabel = new javax.swing.JLabel();
        outputFilePath = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle"); // NOI18N
        setTitle(bundle.getString("TranslationExtractorWindow.title")); // NOI18N
        setResizable(false);

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("TranslationExtractorWindow.settingsPanel.border.title"))); // NOI18N
        settingsPanel.setToolTipText(bundle.getString("TranslationExtractorWindow.settingsPanel.toolTipText")); // NOI18N
        settingsPanel.setName(""); // NOI18N

        keyFormatLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        keyFormatLabel.setText(bundle.getString("TranslationExtractorWindow.keyFormatLabel.text")); // NOI18N

        inputFolderLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        inputFolderLabel.setText(bundle.getString("TranslationExtractorWindow.inputFolderLabel.text")); // NOI18N

        outputFolderLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        outputFolderLabel.setText(bundle.getString("TranslationExtractorWindow.outputFolderLabel.text")); // NOI18N

        keyFormat.setText(bundle.getString("TranslationExtractorWindow.keyFormat.text")); // NOI18N
        keyFormat.setToolTipText(bundle.getString("TranslationExtractorWindow.keyFormat.toolTipText")); // NOI18N
        keyFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyFormatActionPerformed(evt);
            }
        });

        inputFolderChooser.setText(bundle.getString("TranslationExtractorWindow.inputFolderChooser.text")); // NOI18N
        inputFolderChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFolderChooserActionPerformed(evt);
            }
        });

        outputFolderChooser.setText(bundle.getString("TranslationExtractorWindow.outputFolderChooser.text")); // NOI18N
        outputFolderChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFolderChooserActionPerformed(evt);
            }
        });

        outputFile.setText(bundle.getString("TranslationExtractorWindow.outputFile.text")); // NOI18N

        outputFileLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        outputFileLabel.setText(bundle.getString("TranslationExtractorWindow.outputFileLabel.text")); // NOI18N

        outputFilePath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyFormatLabel)
                    .addComponent(inputFolderLabel)
                    .addComponent(outputFolderLabel)
                    .addComponent(outputFileLabel))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyFormat)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(outputFolder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(inputFolder, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFolderChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputFolderChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(outputFile, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(outputFilePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyFormatLabel)
                    .addComponent(keyFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFolderChooser)
                    .addComponent(inputFolderLabel))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFolderChooser)
                    .addComponent(outputFolderLabel))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputFileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(outputFilePath)
                .addContainerGap())
        );

        start.setText(bundle.getString("TranslationExtractorWindow.start.text")); // NOI18N
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        exit.setText(bundle.getString("TranslationExtractorWindow.exit.text")); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(start)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void outputFolderChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFolderChooserActionPerformed
        JFileChooser chooser = new JFileChooser(outputFolder.getText());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setApproveButtonText(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.outputFolder.approve.text"));

        int ret = chooser.showOpenDialog(null);
        if (ret != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File f = chooser.getSelectedFile();

        outputFolder.setText(f.getAbsolutePath());
    }//GEN-LAST:event_outputFolderChooserActionPerformed

    private void inputFolderChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFolderChooserActionPerformed
        JFileChooser chooser = new JFileChooser(inputFolder.getText());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setApproveButtonText(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.inputFolder.approve.text"));

        int ret = chooser.showOpenDialog(null);
        if (ret != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File f = chooser.getSelectedFile();

        inputFolder.setText(f.getAbsolutePath());
        if (outputFolder.getText().equals("")) { //NOI18N
            outputFolder.setText(f.getAbsolutePath() + File.separator + "i18n"); //NOI18N
        }
    }//GEN-LAST:event_inputFolderChooserActionPerformed

    private void updateOutputFilePath() {
        if (outputFolder.getText().equals("") || outputFile.getText().equals("")) { //NOI18N
            outputFilePath.setText(""); //NOI18N
        } else {
            File f = new File(outputFolder.getText());
            if (!f.isDirectory()) {
                outputFilePath.setText(""); //NOI18N
            } else {
                outputFilePath.setText(outputFolder.getText() + File.separator + outputFile.getText());
            }
        }
    }

    private void keyFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyFormatActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        File input = new File(inputFolder.getText());
        File output = new File(outputFilePath.getText());

        if (!input.isDirectory() || outputFilePath.getText().equals("")) { //NOI18N
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.error.inputOutputFolders"), java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.error.label"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!keyFormat.getText().contains("{key}")) { //NOI18N
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.error.keyFormatError"), java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.error.label"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (output.isFile()) {
            int ret = JOptionPane.showConfirmDialog(rootPane, StringEscapeUtils.unescapeJava(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.outputFileExistsWarning.text")), java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.outputFileExistsWarning.label"), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (ret == JOptionPane.NO_OPTION) {
                return;
            }
        }

        Extractor extractor = new Extractor(input, keyFormat.getText());
        Saver saver = new Saver(output);
        
        try {
            saver.save(extractor.extract());
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.success.description"), java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.success.label"), JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.exception.description")+ex.getMessage(), java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Bundle").getString("TranslationExtractorWindow.start.error.label"), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_startActionPerformed

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
                if ("Nimbus".equals(info.getName())) { //NOI18N
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TranslationExtractorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranslationExtractorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranslationExtractorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranslationExtractorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranslationExtractorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputFolder;
    private javax.swing.JButton inputFolderChooser;
    private javax.swing.JLabel inputFolderLabel;
    private javax.swing.JTextField keyFormat;
    private javax.swing.JLabel keyFormatLabel;
    private javax.swing.JTextField outputFile;
    private javax.swing.JLabel outputFileLabel;
    private javax.swing.JLabel outputFilePath;
    private javax.swing.JTextField outputFolder;
    private javax.swing.JButton outputFolderChooser;
    private javax.swing.JLabel outputFolderLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
