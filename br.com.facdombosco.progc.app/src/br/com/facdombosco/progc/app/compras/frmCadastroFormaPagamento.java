package br.com.facdombosco.progc.app.compras;

import java.awt.Dimension;

public class frmCadastroFormaPagamento extends javax.swing.JInternalFrame
{
    public frmCadastroFormaPagamento() 
    {
        initComponents();
    }

    public void setPosicao()
    {
        Dimension vDimensao = this.getDesktopPane().getSize();
        
        this.setLocation(((vDimensao.width - this.getSize().width) / 2), ((vDimensao.height - this.getSize().height) / 2));
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpCadastroFormaPagamento = new javax.swing.JPanel();
        spCadastroFormaPagamento = new javax.swing.JScrollPane();
        tbCadastroFormaPagamento = new javax.swing.JTable();
        jpIncluirFormaPagamento = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblQuantidadeParcela = new javax.swing.JLabel();
        txtQuantidadeParcela = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lblQuantidadeDiaParcela = new javax.swing.JLabel();
        txtQuantidadeDiaParcela = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DAS FORMAS DE PAGAMENTO");

        jpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jpPrincipal.setName("jpPrincipal"); // NOI18N

        jpCadastroFormaPagamento.setBackground(new java.awt.Color(0, 0, 0));
        jpCadastroFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "FORMAS DE PAGAMENTOS CADASTRADA(S)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpCadastroFormaPagamento.setName("jpCadastroFormaPagamento"); // NOI18N

        spCadastroFormaPagamento.setName("spCadastroFormaPagamento"); // NOI18N

        tbCadastroFormaPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCadastroFormaPagamento.setName("tbCadastroFormaPagamento"); // NOI18N
        spCadastroFormaPagamento.setViewportView(tbCadastroFormaPagamento);

        javax.swing.GroupLayout jpCadastroFormaPagamentoLayout = new javax.swing.GroupLayout(jpCadastroFormaPagamento);
        jpCadastroFormaPagamento.setLayout(jpCadastroFormaPagamentoLayout);
        jpCadastroFormaPagamentoLayout.setHorizontalGroup(
            jpCadastroFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCadastroFormaPagamentoLayout.setVerticalGroup(
            jpCadastroFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpIncluirFormaPagamento.setBackground(new java.awt.Color(0, 0, 0));
        jpIncluirFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INCLUIR FORMA DE PAGAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpIncluirFormaPagamento.setName("jpIncluirFormaPagamento"); // NOI18N

        lblNome.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 153));
        lblNome.setText("Nome");
        lblNome.setName("lblNome"); // NOI18N

        txtNome.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNome.setName("txtNome"); // NOI18N

        lblQuantidadeParcela.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblQuantidadeParcela.setForeground(new java.awt.Color(0, 0, 153));
        lblQuantidadeParcela.setText("Quantidade de parcelas");
        lblQuantidadeParcela.setName("lblQuantidadeParcela"); // NOI18N

        txtQuantidadeParcela.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtQuantidadeParcela.setName("txtQuantidadeParcela"); // NOI18N

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setForeground(new java.awt.Color(0, 0, 153));
        btSalvar.setMnemonic('s');
        btSalvar.setText("SALVAR");
        btSalvar.setName("btSalvar"); // NOI18N

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setForeground(new java.awt.Color(0, 0, 153));
        btSair.setMnemonic('r');
        btSair.setText("SAIR");
        btSair.setName("btSair"); // NOI18N

        lblQuantidadeDiaParcela.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblQuantidadeDiaParcela.setForeground(new java.awt.Color(0, 0, 153));
        lblQuantidadeDiaParcela.setText("Quantidade de dias p/ parcela");
        lblQuantidadeDiaParcela.setName("lblQuantidadeDiaParcela"); // NOI18N

        txtQuantidadeDiaParcela.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtQuantidadeDiaParcela.setName("txtQuantidadeDiaParcela"); // NOI18N

        javax.swing.GroupLayout jpIncluirFormaPagamentoLayout = new javax.swing.GroupLayout(jpIncluirFormaPagamento);
        jpIncluirFormaPagamento.setLayout(jpIncluirFormaPagamentoLayout);
        jpIncluirFormaPagamentoLayout.setHorizontalGroup(
            jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(lblQuantidadeDiaParcela)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantidadeDiaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSalvar)
                                    .addComponent(lblQuantidadeParcela))
                                .addGap(18, 18, 18)
                                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidadeParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jpIncluirFormaPagamentoLayout.setVerticalGroup(
            jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIncluirFormaPagamentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeDiaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeDiaParcela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeParcela))
                .addGap(18, 18, 18)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpIncluirFormaPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCadastroFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCadastroFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpIncluirFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new frmCadastroFormaPagamento().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jpCadastroFormaPagamento;
    private javax.swing.JPanel jpIncluirFormaPagamento;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidadeDiaParcela;
    private javax.swing.JLabel lblQuantidadeParcela;
    private javax.swing.JScrollPane spCadastroFormaPagamento;
    private javax.swing.JTable tbCadastroFormaPagamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidadeDiaParcela;
    private javax.swing.JTextField txtQuantidadeParcela;
    // End of variables declaration//GEN-END:variables

}
