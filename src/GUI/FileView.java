/*
 * Author: Juan Luis Suárez Díaz
 * July, 2015
 * Music Player
 */
package GUI;

import FileUtils.FileSend;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Luis
 */
public class FileView extends javax.swing.JPanel implements LoadableView{
    private String fileLoading;
    private int curr;
    private int tot;
    private String unit;
    private String action;
    File f;
    
    /**
     * Creates new form FileView
     */
    public FileView() {
        initComponents();
        f = null;
        this.downloadBt.setVisible(false);
        this.viewBt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        downloadPb = new javax.swing.JProgressBar();
        iconLab = new javax.swing.JLabel();
        fileLab = new javax.swing.JLabel();
        downloadBt = new javax.swing.JButton();
        viewBt = new javax.swing.JButton();
        dateLab = new javax.swing.JLabel();
        senderLab = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(675, 115));
        setMinimumSize(new java.awt.Dimension(675, 115));

        iconLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Extensions/_blank.png"))); // NOI18N

        fileLab.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        fileLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLab.setText("mandelbrot.png");

        downloadBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/download_icon.png"))); // NOI18N
        downloadBt.setToolTipText("Guardar archivo.");
        downloadBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBtActionPerformed(evt);
            }
        });

        viewBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/loupe_icon.png"))); // NOI18N
        viewBt.setToolTipText("Visualizar archivo.");
        viewBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtActionPerformed(evt);
            }
        });

        dateLab.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        dateLab.setForeground(new java.awt.Color(0, 0, 255));
        dateLab.setText("24/06/2016 23:30:00");

        senderLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        senderLab.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        senderLab.setText("JuanAsh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconLab)
                        .addGap(81, 81, 81)
                        .addComponent(fileLab, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(downloadPb, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senderLab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewBt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downloadBt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(downloadBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senderLab)
                            .addComponent(dateLab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fileLab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconLab))
                        .addGap(18, 18, 18)))
                .addComponent(downloadPb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void downloadBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBtActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(this);
        FileOutputStream fw = null;
        if(returnVal == JFileChooser.APPROVE_OPTION){
            try{
                byte[] data = FileSend.loadFile(f.getAbsolutePath());
                File save = new File(fc.getSelectedFile().getAbsolutePath());
                fw = new FileOutputStream(save);
                fw.write(data);
                // Sugerir liberación de memoria.
                data = null;
                System.gc();
            }
            catch(Exception ex){
                System.err.println("Error al guardar archivo: "+ex.getMessage());
                JOptionPane.showMessageDialog(this, "Error al guardar archivo: "+
                        ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            finally{
                try{
                    fw.close();
                }
                catch(Exception ex){}
            }
        }
    }//GEN-LAST:event_downloadBtActionPerformed

    private void viewBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtActionPerformed
        String extension = fileLoading.substring(fileLoading.lastIndexOf(".")+1);
            switch(extension.toLowerCase()){
                case "png":
                case "gif":
                case "jpeg":
                case "jpg":
                case "bmp":
                case "wbmp":
                    
                    try {
                        new ImageView(null, false).setView(f);
                        
                       
                    } catch (Exception ex) {
                        System.err.println("Error al cargar imagen: "+ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Error: No se pudo cargar la imagen", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    
                
                    break;
                    
                case "aif":
                case "aiff":
                case "fxm":
                case "flv":
                case "m3u8":
                case "mp3":
                case "mp4":
                case "m4a":
                case "m4v":
                case "wav":
                    try{
                        new AudioView(null, false).setView(f);
                    }
                    catch(Exception ex){
                        System.err.println("Error al reproducir audio: "+ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Error: No se pudo cargar el audio", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "txt":
                case "c":
                case "cpp":
                case "css":
                case "h":
                case "hpp":
                case "htm":
                case "html":
                case "java":
                case "js":
                case "php":   
                case "py":
                case "rb": 
                case "sql":
                case "sass":
                case "scss":
                    try{
                        new TextFileView(null, false).setView(f);
                    }
                    catch(Exception ex){
                        System.err.println("Error al cargar fichero de texto: "+ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Error: No se pudo cargar el fichero de texto.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "DISPLAY ERROR", 
                        "No se reconoce el formato del archivo entre los conocidos por el programa.", JOptionPane.ERROR_MESSAGE);
                    break;
            }
    }//GEN-LAST:event_viewBtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton downloadBt;
    private javax.swing.JProgressBar downloadPb;
    private javax.swing.JLabel fileLab;
    private javax.swing.JLabel iconLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel senderLab;
    private javax.swing.JButton viewBt;
    // End of variables declaration//GEN-END:variables

    @Override
    public void hideView() {
        this.downloadPb.setVisible(false);
    }

    @Override
    public void setView(String fileLoading, int curr, int tot, String unit, String action) {
        this.fileLoading = fileLoading;
        this.curr =  curr;
        this.tot = tot;
        this.unit = unit;
        this.action = action;
        
        this.fileLab.setText(fileLoading+ (curr<tot?" ("+action+")":""));
        this.downloadPb.setVisible(true);
        this.downloadPb.setMaximum(tot);
        this.downloadPb.setMinimum(0);
        this.downloadPb.setValue(curr);
        this.downloadPb.setToolTipText(Integer.toString(curr)+" / "+Integer.toString(tot)+" "+unit);
        
        try{
            String extension = fileLoading.substring(fileLoading.lastIndexOf(".")+1);
            this.iconLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Extensions/"+extension+".png")));
        }
        catch(Exception ex){
            this.iconLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Extensions/_blank.png")));
        }
        this.repaint();
        this.revalidate();
    }
    
    public void setMetaView(String date, String sender){
        this.dateLab.setText(date);
        this.senderLab.setText(sender);
    }

    @Override
    public void showView() {
        this.setVisible(true);
    }

    @Override
    public void updateView(int curr, int tot) {
        setView(fileLoading,curr,tot,unit,action);
    }
    
    public void setFile(File f){
        this.f = f;
        if(f.exists()){
            this.downloadBt.setVisible(true);
            String extension = fileLoading.substring(fileLoading.lastIndexOf(".")+1);
            switch(extension.toLowerCase()){
                case "png":
                case "gif":
                case "jpeg":
                case "jpg":
                case "bmp":
                case "wbmp":
                    
                case "aif":
                case "aiff":
                case "fxm":
                case "flv":
                case "m3u8":
                case "mp3":
                case "mp4":
                case "m4a":
                case "m4v":
                case "wav":
                    
                case "txt":
                case "c":
                case "cpp":
                case "css":
                case "h":
                case "hpp":
                case "htm":
                case "html":
                case "java":
                case "js":
                case "php":   
                case "py":
                case "rb": 
                case "sql":
                case "sass":
                case "scss":
                    
                    this.viewBt.setVisible(true);
                    break;
                default:
                    this.viewBt.setVisible(false);
                    break;
            }
        }
        
        
        this.repaint();
        this.revalidate();
    }

    public String getFileLoading() {
        return fileLoading;
    }
    
    public String getSender(){
        return senderLab.getText();
    }
    
    
}
