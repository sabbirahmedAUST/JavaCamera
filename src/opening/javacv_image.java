package opening;



import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.IPL_DEPTH_8U;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvGetSize;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2GRAY;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2HSV;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_highgui;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
//import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2RGB;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class javacv_image extends javax.swing.JFrame {
    private final JFileChooser openFileChooser;
    private BufferedImage orginalBI;
    
    
    public javacv_image() {
        initComponents();
        this.setLocation(0,0);
        setSize(500,500);
        initialize();
        openFileChooser =new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("C:\\Users\\maksi\\Desktop\\gallery"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PNG images","png"));
        
        
    }
    private void initialize(){
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("image.png")));
    
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        webcam_capture = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        OpenFileButton = new javax.swing.JButton();
        rGRAY = new javax.swing.JRadioButton();
        rHSV = new javax.swing.JRadioButton();
        rORGINAL = new javax.swing.JRadioButton();
        bRESET = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        getContentPane().setLayout(null);

        webcam_capture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/webcam.png"))); // NOI18N
        webcam_capture.setText("WEBCAM");
        webcam_capture.setIconTextGap(10);
        webcam_capture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webcam_captureActionPerformed(evt);
            }
        });
        getContentPane().add(webcam_capture);
        webcam_capture.setBounds(20, 20, 180, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/capture.png"))); // NOI18N
        jButton2.setText("CAPTURE");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setIconTextGap(10);
        jButton2.setMaximumSize(new java.awt.Dimension(121, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 20, 190, 100);

        OpenFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/search.png"))); // NOI18N
        OpenFileButton.setText("BROWSE  IMAGE");
        OpenFileButton.setIconTextGap(8);
        OpenFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OpenFileButton);
        OpenFileButton.setBounds(120, 140, 190, 90);

        rGRAY.setText("GRAY");
        rGRAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGRAYActionPerformed(evt);
            }
        });
        getContentPane().add(rGRAY);
        rGRAY.setBounds(200, 320, 70, 23);

        rHSV.setText("HSV");
        rHSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rHSVActionPerformed(evt);
            }
        });
        getContentPane().add(rHSV);
        rHSV.setBounds(200, 350, 60, 23);

        rORGINAL.setText("REALISTIC");
        rORGINAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rORGINALActionPerformed(evt);
            }
        });
        getContentPane().add(rORGINAL);
        rORGINAL.setBounds(200, 380, 80, 23);

        bRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/replay.png"))); // NOI18N
        bRESET.setText("RESET");
        bRESET.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRESETActionPerformed(evt);
            }
        });
        getContentPane().add(bRESET);
        bRESET.setBounds(170, 410, 110, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/crop.png"))); // NOI18N
        jButton3.setText("EDIT  IMAGE");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(10);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 260, 140, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void webcam_captureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webcam_captureActionPerformed
      
     
            
       Thread webcam  = new Thread() {
                public void run() {
                    CvCapture capture = opencv_highgui.cvCreateCameraCapture(0);

                    opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT, 500);
                    opencv_highgui.cvSetCaptureProperty(capture, opencv_highgui.CV_CAP_PROP_FRAME_WIDTH, 500);
                 
                    IplImage grabbedImage = opencv_highgui.cvQueryFrame(capture);
                    CanvasFrame frame = new CanvasFrame("Webcam");
                   frame.setSize(-900, 0);
                  
                    while (frame.isVisible() && (grabbedImage = opencv_highgui.cvQueryFrame(capture)) != null) {
                        frame.showImage(grabbedImage);
                    }

                }
            };
            webcam.start();
    }//GEN-LAST:event_webcam_captureActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
      try{
        grabber.start();
        IplImage img =grabber.grab();
        if(img!=null)
        {
          cvSaveImage("28_7_2018.jpg",img);
        }
      } catch (Exception e){
          e.printStackTrace();
      }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OpenFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileButtonActionPerformed
       new openimage().setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_OpenFileButtonActionPerformed

    private void rGRAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGRAYActionPerformed
        if(rGRAY.isSelected())
            rHSV.setSelected(false);
        rORGINAL.setSelected(false);
    }//GEN-LAST:event_rGRAYActionPerformed

    private void bRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRESETActionPerformed
       
        rGRAY.setSelected(false);
        rHSV.setSelected(false);
        rORGINAL.setSelected(false);
       
    }//GEN-LAST:event_bRESETActionPerformed

    private void rHSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rHSVActionPerformed

        if(rHSV.isSelected())
            rGRAY.setSelected(false);
        rORGINAL.setSelected(false);
    }//GEN-LAST:event_rHSVActionPerformed

    private void rORGINALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rORGINALActionPerformed
        
        if(rORGINAL.isSelected())
            rGRAY.setSelected(false);
        rHSV.setSelected(false);
    }//GEN-LAST:event_rORGINALActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
         opencv_core.IplImage img = cvLoadImage("C:\\Users\\maksi\\Desktop\\opening\\28_7_2018.jpg");
      
        opencv_core.IplImage hsvimg = cvCreateImage(cvGetSize(img), IPL_DEPTH_8U, 3);
        opencv_core.IplImage grayimg = cvCreateImage(cvGetSize(img), IPL_DEPTH_8U, 1);
        cvCvtColor(img, hsvimg, CV_BGR2HSV);
        cvCvtColor(img, grayimg, CV_BGR2GRAY);
       
        if(rGRAY.isSelected()){
            cvShowImage("GRAY", grayimg);
            int cvWaitKey = cvWaitKey();
            cvSaveImage("C:\\Users\\maksi\\Desktop\\opening\\openimage", grayimg);
            cvReLeaseImage(grayimg);
            
        }else if(rHSV.isSelected()){
            cvShowImage("HSV", hsvimg);
            int cvWaitKey = cvWaitKey();
            cvSaveImage("C:\\Users\\maksi\\Desktop\\opening\\openimage", hsvimg);
            
            cvReLeaseImage(hsvimg);
            
        }else if(rORGINAL.isSelected()){
            cvShowImage("Orginal", img);
            int cvWaitKey = cvWaitKey();
            cvSaveImage("C:\\Users\\maksi\\Desktop\\opening\\openimage", img);
            
            cvReLeaseImage(img);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    }

    

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
            java.util.logging.Logger.getLogger(javacv_image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javacv_image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javacv_image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javacv_image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javacv_image().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenFileButton;
    private javax.swing.JButton bRESET;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton rGRAY;
    private javax.swing.JRadioButton rHSV;
    private javax.swing.JRadioButton rORGINAL;
    private javax.swing.JButton webcam_capture;
    // End of variables declaration//GEN-END:variables

    private void cvReLeaseImage(IplImage img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
