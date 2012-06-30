package br.com.facdombosco.progc.app.acessos;

import br.com.facdombosco.progc.dvo.acessos.Usuario;
import br.com.facdombosco.progc.framework.controls.FixedLengthDocument;
import br.com.facdombosco.progc.framework.utils.MessageHelper;
import br.com.facdombosco.progc.service.acessos.UsuarioService;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.tool.hbm2x.StringUtils;

public class GUIUsuario extends javax.swing.JInternalFrame {

    public GUIUsuario() {
        initComponents();
        LimitCharacter();
    }

     private void LimitCharacter(){
         txtNomeUsuario.setDocument(new FixedLengthDocument(30));
         txtLoginUsuario.setDocument(new FixedLengthDocument(20));
         txtSenhaUsuario.setDocument(new FixedLengthDocument(5));
    }

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        btnLimpar_Usuario = new javax.swing.JButton();
        btnListar_Usuario = new javax.swing.JButton();
        btnSalvar_Usuario = new javax.swing.JButton();
        btnExcluir_Usuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        chkVendasUsuario = new javax.swing.JCheckBox();
        chkServicosUsuario = new javax.swing.JCheckBox();
        chkSuprimentoUsuario = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();

        setClosable(true);
        setTitle("Gerenciamento - Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Usuários"));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtNomeUsuario.setName("txtNomeUsuario"); // NOI18N

        btnLimpar_Usuario.setText("Limpar");
        btnLimpar_Usuario.setName("btnLimpar_Usuario"); // NOI18N
        btnLimpar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_UsuarioActionPerformed(evt);
            }
        });

        btnListar_Usuario.setText("Listar");
        btnListar_Usuario.setName("btnListar_Usuario"); // NOI18N
        btnListar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListar_UsuarioActionPerformed(evt);
            }
        });

        btnSalvar_Usuario.setText("Salvar");
        btnSalvar_Usuario.setName("btnSalvar_Usuario"); // NOI18N
        btnSalvar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_UsuarioActionPerformed(evt);
            }
        });

        btnExcluir_Usuario.setText("Excluir");
        btnExcluir_Usuario.setName("btnExcluir_Usuario"); // NOI18N
        btnExcluir_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_UsuarioActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Login:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha:");
        jLabel4.setName("jLabel4"); // NOI18N

        txtLoginUsuario.setName("txtLoginUsuario"); // NOI18N

        txtSenhaUsuario.setName("txtSenhaUsuario"); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Código:");
        jLabel5.setName("jLabel5"); // NOI18N

        txtCodigoUsuario.setEditable(false);
        txtCodigoUsuario.setName("txtCodigoUsuario"); // NOI18N

        chkVendasUsuario.setText("Vendas");
        chkVendasUsuario.setName("chkVendasUsuario"); // NOI18N

        chkServicosUsuario.setText("Serviços");
        chkServicosUsuario.setName("chkServicosUsuario"); // NOI18N

        chkSuprimentoUsuario.setText("Suprimento");
        chkSuprimentoUsuario.setName("chkSuprimentoUsuario"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLoginUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkVendasUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkServicosUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkSuprimentoUsuario)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnSalvar_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir_Usuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkVendasUsuario)
                    .addComponent(chkServicosUsuario)
                    .addComponent(chkSuprimentoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnLimpar_Usuario)
                    .addComponent(btnListar_Usuario)
                    .addComponent(btnSalvar_Usuario)
                    .addComponent(btnExcluir_Usuario)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuario.setName("tblUsuario"); // NOI18N
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_UsuarioActionPerformed

        this.limpar();
}//GEN-LAST:event_btnLimpar_UsuarioActionPerformed

    private void limpar() {
        this.limparTodosCampos();
        this.tblUsuario.setModel(new UsuarioTableModel((new ArrayList<Usuario>())));
    }

    private void limparTodosCampos() {
        txtCodigoUsuario.setText(null);
        txtNomeUsuario.setText(null);
        txtLoginUsuario.setText(null);
        txtSenhaUsuario.setText(null);
        this.chkServicosUsuario.setSelected(false);
        this.chkSuprimentoUsuario.setSelected(false);
        this.chkVendasUsuario.setSelected(false);
    }

    private void carregarFormulario(Usuario usuario) {

        this.txtCodigoUsuario.setText(String.valueOf(usuario.getIdUsuario()));
        
        this.txtNomeUsuario.setText(usuario.getNome());
        this.txtLoginUsuario.setText(usuario.getNomeUsuario());

        this.chkVendasUsuario.setSelected(usuario.getVendas().equals("S") ? true : false);
        this.chkServicosUsuario.setSelected(usuario.getServicos().equals("S") ? true : false);
        this.chkSuprimentoUsuario.setSelected(usuario.getSuprimentos().equals("S") ? true : false);

        this.edicao = true;
        
    }

    private Usuario carregarObjetoPersistencia() {

        Usuario usuario = new Usuario();
        usuario.setNome(this.txtNomeUsuario.getText());
        usuario.setNomeUsuario(this.txtLoginUsuario.getText());
        usuario.setSenha(this.txtSenhaUsuario.getText());
        usuario.setVendas((this.chkVendasUsuario.isSelected() ? "S" : "N"));
        usuario.setServicos((this.chkServicosUsuario.isSelected() ? "S" : "N"));
        usuario.setSuprimentos((this.chkSuprimentoUsuario.isSelected() ? "S" : "N"));

        if (this.edicao)
            usuario.setIdUsuario(Integer.parseInt(this.txtCodigoUsuario.getText()));

        return usuario;
    }

    private Dictionary<String, Object> carregarDictionaryPesquisa() {

        Dictionary<String, Object> properties = new Hashtable<String, Object>();

        if (!this.txtCodigoUsuario.getText().equals(""))
            properties.put("idUsuario", Integer.parseInt(this.txtCodigoUsuario.getText()));

        if (!this.txtNomeUsuario.getText().equals(""))
            properties.put("nome", this.txtNomeUsuario.getText());

        if (!this.txtLoginUsuario.getText().equals(""))
            properties.put("nomeUsuario", this.txtLoginUsuario.getText());

        return properties;
    }

    private void btnListar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListar_UsuarioActionPerformed
        if (StringUtils.isNumeric(this.txtCodigoUsuario.getText())) {

            UsuarioService usuarioService = new UsuarioService();
            List<Usuario> listUsuario = usuarioService.findAll(this.carregarDictionaryPesquisa());

            UsuarioTableModel usuarioTableModel = new UsuarioTableModel(listUsuario);
            this.tblUsuario.setModel(usuarioTableModel);
        }
        else
            JOptionPane.showMessageDialog(this, "O código digitado deve ser númerico!");
}//GEN-LAST:event_btnListar_UsuarioActionPerformed

    private void btnSalvar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_UsuarioActionPerformed
        try {
            UsuarioService usuarioService = new UsuarioService();
            usuarioService.save(this.carregarObjetoPersistencia());
            this.btnLimpar_UsuarioActionPerformed(evt);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso.", "Usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_btnSalvar_UsuarioActionPerformed

    private void btnExcluir_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_UsuarioActionPerformed
        try {
            if(JOptionPane.showConfirmDialog(this, "Você deseja excluir " + txtNomeUsuario.getText() +"?","Usuário",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
                new UsuarioService().delete(this.carregarObjetoPersistencia());
                this.btnLimpar_UsuarioActionPerformed(evt);
            }
        } catch (Exception ex) {
            MessageHelper.showError(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnExcluir_UsuarioActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        if (this.tblUsuario.getSelectedRow() != -1) {
            this.limparTodosCampos();
            UsuarioTableModel usuarioTableModel = (UsuarioTableModel)this.tblUsuario.getModel();
            this.carregarFormulario(usuarioTableModel.getUsuarios().get(this.tblUsuario.getSelectedRow()));
            this.btnExcluir_Usuario.setEnabled(true);
        }
    }//GEN-LAST:event_tblUsuarioMouseClicked
    private boolean edicao = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir_Usuario;
    private javax.swing.JButton btnLimpar_Usuario;
    private javax.swing.JButton btnListar_Usuario;
    private javax.swing.JButton btnSalvar_Usuario;
    private javax.swing.JCheckBox chkServicosUsuario;
    private javax.swing.JCheckBox chkSuprimentoUsuario;
    private javax.swing.JCheckBox chkVendasUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

}
