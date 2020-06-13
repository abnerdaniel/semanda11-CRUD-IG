package com.poo.view;

import java.util.Arrays;
import javax.swing.DefaultListModel;

import com.poo.controller.Controller;
import com.poo.model.Aluno;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author MeuPC
 */
public class Tela extends javax.swing.JFrame {
    
    int vetor[] = new int[5], sele = 0;
    DefaultListModel lista = new DefaultListModel();
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        for(int c = 0;c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        lbCriar = new javax.swing.JButton();
        lblSelect = new javax.swing.JButton();
        lblUpdate = new javax.swing.JButton();
        lblDelete = new javax.swing.JButton();
        lblClear = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelConteudo = new javax.swing.JLabel();
        jLabelConteudo1 = new javax.swing.JLabel();
        jLabelConteudo2 = new javax.swing.JLabel();
        jLabelConteudo3 = new javax.swing.JLabel();
        jLabelConteudo4 = new javax.swing.JLabel();
        jLabelConteudo5 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(4);

        lbCriar.setText("Criar");
        lbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCriarActionPerformed(evt);
            }
        });

        lblSelect.setText("Ler");
        lblSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSelectActionPerformed(evt);
            }
        });

        lblUpdate.setText("Alterar");
        lblUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUpdateActionPerformed(evt);
            }
        });

        lblDelete.setText("Deletar");
        lblDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDeleteActionPerformed(evt);
            }
        });

        lblClear.setText("Clear");
        lblClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblClearActionPerformed(evt);
            }
        });

        jTextFieldNome.setText("Nome");

        jTextFieldMatricula.setText("Matricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(59)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabelConteudo5, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabelConteudo4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabelConteudo3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabelConteudo2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabelConteudo1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabelConteudo, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addContainerGap(257, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextFieldNome)
        				.addComponent(jTextFieldMatricula, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabelTitulo, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(165, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblUpdate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbCriar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblSelect, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(lblClear, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        					.addGap(32))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextFieldMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbCriar)
        						.addComponent(lblDelete))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblUpdate)
        						.addComponent(lblSelect)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(51)
        					.addComponent(lblClear)))
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addComponent(jLabelTitulo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabelConteudo1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelConteudo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelConteudo3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelConteudo2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelConteudo5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabelConteudo4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addGap(23))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        


   
    private void lbCriarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    	
    	try {
			
			Aluno aluno = new Aluno();
			Controller controller = new Controller();

			
			aluno.setMatricula(jTextFieldMatricula.getText());
			aluno.setNome(jTextFieldNome.getText());
			
			jLabelTitulo.setText(controller.create(aluno));
		} catch (Exception e){
			jLabelTitulo.setText("Erro na tela de incluir o aluno");
		}

    }                                       

    private void lblSelectActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

		Controller controller = new Controller();
		
    	for(Aluno aluno:controller.readAll()) {
    		
    		StringBuilder txt = new StringBuilder();
    		if(jLabelConteudo.getText() != null) {
    			txt.append(jLabelConteudo.getText()).append("\n");
    		}
    		    		
    		if(aluno.getMatricula() != "") {
    			jLabelConteudo.setText(txt + aluno.getMatricula() +" " + aluno.getNome() +" \n/" );
    		}else {
    			jLabelTitulo.setText("Tabela vazia!");
    		}//deixa tudo na mesma linha depois eu vejo
		}

    }                                         

    private void lblUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	try {
			
			Aluno aluno = new Aluno();
			Controller controller = new Controller();

			
			aluno.setMatricula(jTextFieldMatricula.getText());
			aluno.setNome(jTextFieldNome.getText());
			
			jLabelTitulo.setText(controller.update(aluno));
		} catch (Exception e){
			jLabelTitulo.setText("Erro na tela de Alterar o aluno");
		}

        
    }                                         

    private void lblDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	try {
			
			Aluno aluno = new Aluno();
			Controller controller = new Controller();

			
			aluno.setMatricula(jTextFieldMatricula.getText());
			aluno.setNome(jTextFieldNome.getText());
			
			jLabelTitulo.setText(controller.delete(aluno));
		} catch (Exception e){
			jLabelTitulo.setText("Erro na tela de deletar o aluno");
		}
    }                                         

    private void lblClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	jLabelConteudo.setText("");
    	jLabelTitulo.setText("Feito!");
    
    }                                         

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabelConteudo;
    private javax.swing.JLabel jLabelConteudo1;
    private javax.swing.JLabel jLabelConteudo2;
    private javax.swing.JLabel jLabelConteudo3;
    private javax.swing.JLabel jLabelConteudo4;
    private javax.swing.JLabel jLabelConteudo5;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JButton lbCriar;
    private javax.swing.JButton lblClear;
    private javax.swing.JButton lblDelete;
    private javax.swing.JButton lblSelect;
    private javax.swing.JButton lblUpdate;
    // End of variables declaration                   
}