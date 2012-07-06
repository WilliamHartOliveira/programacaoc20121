package br.com.facdombosco.progc.app.acessos;

import br.com.facdombosco.progc.app.main.*;
import br.com.facdombosco.progc.dvo.acessos.Usuario;
import br.com.facdombosco.progc.framework.utils.MessageHelper;
import br.com.facdombosco.progc.service.acessos.UsuarioService;

public class GUILogin extends javax.swing.JFrame {

    static GUILogin guilogin;

    /** Creates new form GUILogin */
    public GUILogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        pLogindados = new javax.swing.JPanel();
        lUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        lSenha = new javax.swing.JLabel();
        bOk = new javax.swing.JButton();
        lImagemLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lSistemaGerRecursos = new javax.swing.JLabel();
        lBemVindo = new javax.swing.JLabel();
        lDomBosco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        pLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pLogindados.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUsuario.setText("Usuário:");

        lSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lSenha.setText("Senha:");

        bOk.setText("Ok");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLogindadosLayout = new javax.swing.GroupLayout(pLogindados);
        pLogindados.setLayout(pLogindadosLayout);
        pLogindadosLayout.setHorizontalGroup(
            pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogindadosLayout.createSequentialGroup()
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pLogindadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bOk, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLogindadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfSenha)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pLogindadosLayout.setVerticalGroup(
            pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLogindadosLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLogindadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bOk)
                .addGap(25, 25, 25))
        );

        lImagemLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/login.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lSistemaGerRecursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSistemaGerRecursos.setText("Sistema integrado de Gestão");

        lBemVindo.setFont(new java.awt.Font("Tahoma", 1, 11));
        lBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBemVindo.setText("Seja bem-vindo!");

        lDomBosco.setFont(new java.awt.Font("Tahoma", 1, 11));
        lDomBosco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lSistemaGerRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDomBosco, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSistemaGerRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDomBosco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lImagemLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pLogindados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lImagemLogin)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pLogindados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(tfUsuario.getText());
        usuario.setSenha(String.copyValueOf(tfSenha.getPassword()));

        try {
            Usuario usuarioRetorno = new UsuarioService().login(usuario);

            GUIPrincipal guiPrincipal = new GUIPrincipal();
            guiPrincipal.configurarPermissoes(usuarioRetorno);
            guiPrincipal.setLocationRelativeTo(null);
            guiPrincipal.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            MessageHelper.showError(ex.getMessage());
        }
    }//GEN-LAST:event_bOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBemVindo;
    private javax.swing.JLabel lDomBosco;
    private javax.swing.JLabel lImagemLogin;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lSistemaGerRecursos;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pLogindados;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

}
