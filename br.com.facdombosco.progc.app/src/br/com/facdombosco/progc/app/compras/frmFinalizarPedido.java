/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmFinalizarPedido.java
 *
 * Created on 30/06/2012, 10:28:29
 */

package br.com.facdombosco.progc.app.compras;

/**
 *
 * @author 9213052
 */
public class frmFinalizarPedido extends javax.swing.JFrame {

    /** Creates new form frmFinalizarPedido */
    public frmFinalizarPedido() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        txtNome1 = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        spCadastroFornecedor = new javax.swing.JScrollPane();
        tbCadastroFornecedor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtEmail1 = new javax.swing.JFormattedTextField();
        lblTelefone1 = new javax.swing.JLabel();
        txtEstado1 = new javax.swing.JComboBox();
        lblEstado1 = new javax.swing.JLabel();
        txtCidade1 = new javax.swing.JTextField();
        lblCidade1 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtCnpj1 = new javax.swing.JTextField();
        lblCnpj1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        txtNome3 = new javax.swing.JTextField();
        txtEstado2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE O FORNECEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        lblNome.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 153));
        lblNome.setText("Nome");
        lblNome.setName("lblNome"); // NOI18N

        txtNome.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNome.setName("txtNome"); // NOI18N

        lblCnpj.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblCnpj.setForeground(new java.awt.Color(0, 0, 153));
        lblCnpj.setText("CNPJ");
        lblCnpj.setName("lblCnpj"); // NOI18N

        txtCnpj.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtCnpj.setName("txtCnpj"); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 0, 153));
        lblEndereco.setText("Endereço");
        lblEndereco.setName("lblEndereco"); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtEndereco.setName("txtEndereco"); // NOI18N

        lblCidade.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblCidade.setForeground(new java.awt.Color(0, 0, 153));
        lblCidade.setText("Cidade");
        lblCidade.setName("lblCidade"); // NOI18N

        txtCidade.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtCidade.setName("txtCidade"); // NOI18N

        lblEstado.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblEstado.setForeground(new java.awt.Color(0, 0, 153));
        lblEstado.setText("Estado");
        lblEstado.setName("lblEstado"); // NOI18N

        txtEstado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEstado.setName("txtEstado"); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 0, 153));
        lblTelefone.setText("Telefone");
        lblTelefone.setName("lblTelefone"); // NOI18N

        txtTelefone.setEditable(false);
        txtTelefone.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtTelefone.setName("txtTelefone"); // NOI18N

        lblEmail.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblEmail.setForeground(new java.awt.Color(0, 0, 153));
        lblEmail.setText("E-mail");
        lblEmail.setName("lblEmail"); // NOI18N

        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtEmail.setName("txtEmail"); // NOI18N

        txtNome1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNome1.setName("txtNome1"); // NOI18N

        lblNome1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(0, 0, 153));
        lblNome1.setText("Emissão");
        lblNome1.setName("lblNome1"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNome1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefone)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCidade)
                                    .addComponent(lblEndereco)
                                    .addComponent(lblEstado)))
                            .addComponent(lblNome)
                            .addComponent(lblCnpj)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCidade)
                            .addComponent(txtEndereco)
                            .addComponent(txtEmail)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE O PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        spCadastroFornecedor.setName("spCadastroFornecedor"); // NOI18N

        tbCadastroFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCadastroFornecedor.setName("tbCadastroFornecedor"); // NOI18N
        spCadastroFornecedor.setViewportView(tbCadastroFornecedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE VALORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        txtEmail1.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtEmail1.setName("txtEmail1"); // NOI18N

        lblTelefone1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblTelefone1.setForeground(new java.awt.Color(0, 0, 153));
        lblTelefone1.setText("Observação");
        lblTelefone1.setName("lblTelefone1"); // NOI18N

        txtEstado1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEstado1.setName("txtEstado1"); // NOI18N

        lblEstado1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(0, 0, 153));
        lblEstado1.setText("Valor total");
        lblEstado1.setName("lblEstado1"); // NOI18N

        txtCidade1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCidade1.setName("txtCidade1"); // NOI18N

        lblCidade1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblCidade1.setForeground(new java.awt.Color(0, 0, 153));
        lblCidade1.setText("Nota fiscal");
        lblCidade1.setName("lblCidade1"); // NOI18N

        txtEndereco1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEndereco1.setName("txtEndereco1"); // NOI18N

        lblEndereco1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEndereco1.setForeground(new java.awt.Color(0, 0, 153));
        lblEndereco1.setText("Data entrega");
        lblEndereco1.setName("lblEndereco1"); // NOI18N

        txtCnpj1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCnpj1.setName("txtCnpj1"); // NOI18N

        lblCnpj1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblCnpj1.setForeground(new java.awt.Color(0, 0, 153));
        lblCnpj1.setText("Desconto");
        lblCnpj1.setName("lblCnpj1"); // NOI18N

        lblNome2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(0, 0, 153));
        lblNome2.setText("Forma pagamento");
        lblNome2.setName("lblNome2"); // NOI18N

        lblNome3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(0, 0, 153));
        lblNome3.setText("Valor");
        lblNome3.setName("lblNome3"); // NOI18N

        txtNome3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNome3.setName("txtNome3"); // NOI18N

        txtEstado2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEstado2.setName("txtEstado2"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome2)
                    .addComponent(lblNome3)
                    .addComponent(lblCnpj1)
                    .addComponent(lblEndereco1)
                    .addComponent(lblCidade1)
                    .addComponent(lblEstado1)
                    .addComponent(lblTelefone1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail1)
                    .addComponent(txtEstado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstado2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEndereco1)
                    .addComponent(txtCnpj1)
                    .addComponent(txtCidade1)
                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFinalizarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCnpj1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JScrollPane spCadastroFornecedor;
    private javax.swing.JTable tbCadastroFornecedor;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade1;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCnpj1;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtEmail1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JComboBox txtEstado;
    private javax.swing.JComboBox txtEstado1;
    private javax.swing.JComboBox txtEstado2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
