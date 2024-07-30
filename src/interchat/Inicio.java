/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interchat;

import br.edu.ifsuldeminas.sd.chat.MensagemRecebida;
import br.edu.ifsuldeminas.sd.chat.client.Chat;
import interchat.Inicio;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import java.awt.Cursor;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;


public class Inicio extends javax.swing.JFrame {
     int localPort,serverPort;
     String from, message,ip;
     Chat chat = new Chat();
     
     private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
     
     private static boolean isPortaValida(String str) {
         return Integer.parseInt(str)>=1 && Integer.parseInt(str) <= 65536;
    }
     
         // an IPv4 address
    private static final String INET4ADDRESS = "172.8.9.28";
 
    private static final String IPV4_REGEX =
                    "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
 
    private static final Pattern IPv4_PATTERN = Pattern.compile(IPV4_REGEX);
 
    public static boolean isValidInet4Address(String ip)
    {
        if (ip == null) {
            return false;
        }
 
        Matcher matcher = IPv4_PATTERN.matcher(ip);
 
        return matcher.matches();
    }
     

    /**
     * Creates new form 
     */
    public Inicio() {
        initComponents();

        
 
    }
    
    private void ThreadReceberMensagem(){//Java SwingWorker demo no youtube
        SwingWorker<Void, String> Worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                while(true){
                    Thread.sleep(50);
                    atualizar();
                }
            }
        };
        Worker.execute();
    }
    public void atualizar(){
        panelMensagem.setText(panelMensagem.getText()+MensagemRecebida.mensagem);
        MensagemRecebida.mensagem ="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelMensagem = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPortaLocal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        txtPortaRemota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        txtNome = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        btnConectar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        txtIP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        btnEnviar = new javax.swing.JButton();
        btnEnviar.setIcon(new ImageIcon("C:\\Users\\emers\\Downloads\\mail-send.png"));
        btnEnviar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
        txtMensagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setIcon(new ImageIcon("C:\\Users\\emers\\Downloads\\clean.png"));
        jLabel7.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setResizable(false);

        panelMensagem.setEditable(false);
        panelMensagem.setEnabled(false);
        jScrollPane1.setViewportView(panelMensagem);

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel1.setText("CHAT");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Porta local:");

        jLabel3.setText("Porta remota:");

        txtPortaRemota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortaRemotaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        txtIP.setToolTipText("");

        jLabel6.setText("IP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPortaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPortaRemota, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConectar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPortaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPortaRemota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar))
                .addGap(23, 23, 23))
        );

        jLabel5.setText("Digite sua mensagem:");

        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtMensagem.setEnabled(false);
        txtMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMensagemKeyPressed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(51, 132, 226));
        jLabel7.setText("Limpar");
        jLabel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addGap(0, 766, Short.MAX_VALUE))
        				.addComponent(jLabel5)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txtMensagem, GroupLayout.PREFERRED_SIZE, 703, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(732, Short.MAX_VALUE)
        			.addComponent(jLabel7)
        			.addGap(31))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(6)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addComponent(jLabel7)
        			.addGap(9)
        			.addComponent(jLabel5)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtMensagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
       if(txtNome.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,
                "O campo 'Nome'  nao foi preenchido",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtNome.requestFocus();
       }else if(txtPortaLocal.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,
                "O campo 'Porta Local'  nao foi preenchido",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtPortaLocal.requestFocus();
       }else if(txtIP.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,
                "O campo 'IP'  nao foi preenchido",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtIP.requestFocus();
       }else if(txtPortaRemota.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,
                "O campo 'Porta Remota'  nao foi preenchido",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtPortaRemota.requestFocus();
       }else if(!isInteger(txtPortaLocal.getText())){
           JOptionPane.showMessageDialog(null,
                "O campo 'Porta Local'  nao e um numero valido.",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtPortaLocal.requestFocus();
           
       }else if(!isInteger(txtPortaRemota.getText())){
           JOptionPane.showMessageDialog(null,
                "O campo 'Porta remora'  nao e um numero valido.",
                "Valor invalido.",
                JOptionPane.INFORMATION_MESSAGE);
           txtPortaRemota.requestFocus();
       }else if(!isPortaValida(txtPortaLocal.getText())){
           JOptionPane.showMessageDialog(null,
                "O numero digitado em 'Porta Local' e invalido\n"
                        + "Digite uma porta entre 1 e 65536",
                 "Numero da porta invalido",
                JOptionPane.INFORMATION_MESSAGE);
           txtPortaLocal.requestFocus();
       }else if(!isPortaValida(txtPortaRemota.getText())){
           JOptionPane.showMessageDialog(null,
                "O numero digitado me 'Porta Remora' e invalido\n"
                        + "Digite uma porta entre 1 e 65536",
                 "Numero da porta invalido",
                JOptionPane.INFORMATION_MESSAGE); 
           txtPortaRemota.requestFocus();
       }else if(!isValidInet4Address(txtIP.getText()) && !(txtIP.getText().toLowerCase().equals("localhost"))){
           JOptionPane.showMessageDialog(null,
                "O campo IP nao e um IP valido",
                 "IP invalido",
                JOptionPane.INFORMATION_MESSAGE); 
           txtIP.requestFocus();
       }else{
            ThreadReceberMensagem();
            localPort = Integer.parseInt(txtPortaLocal.getText());
            serverPort = Integer.parseInt(txtPortaRemota.getText());
            from = txtNome.getText();
            ip = txtIP.getText();

            message = "[CONEXAO ESTABELECIDA]";
            Chat chat = new Chat(localPort,serverPort,from,message,ip);
            this.chat = chat;
            chat.conectar();
            btnConectar.setEnabled(false);
            txtNome.setEnabled(false);
            txtPortaLocal.setEnabled(false);
            txtPortaRemota.setEnabled(false);
            txtMensagem.setEnabled(true);
            btnEnviar.setEnabled(true);
            panelMensagem.setEnabled(true);
            txtIP.setEnabled(false);
       }
       
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       
        chat.enviar(txtMensagem.getText());
        String horaEDataAtual = new SimpleDateFormat("(dd/MM/yyyy - HH:mm:ss) ").format(Calendar.getInstance().getTime());
        String messagemtemp = String.format(horaEDataAtual+txtNome.getText()+" - "+txtMensagem.getText());
        panelMensagem.setText(panelMensagem.getText()+"\n"+messagemtemp);
        txtMensagem.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtPortaRemotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortaRemotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortaRemotaActionPerformed

    private void txtMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensagemKeyPressed
        int key = evt.getKeyCode();
    if (key == KeyEvent.VK_ENTER) {
    //Your Code
        btnEnviarActionPerformed(null);
    }//No Else
    }//GEN-LAST:event_txtMensagemKeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        panelMensagem.setText("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane panelMensagem;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPortaLocal;
    private javax.swing.JTextField txtPortaRemota;
    // End of variables declaration//GEN-END:variables
}