package br.com.facdombosco.progc.app.compras;

import br.com.facdombosco.progc.app.vendas.ProdutoTableModel;
import br.com.facdombosco.progc.dvo.compras.FormaPagamento;
import br.com.facdombosco.progc.dvo.compras.Fornecedor;
////import br.com.facdombosco.progc.dvo.compras.Teste;
import br.com.facdombosco.progc.dvo.vendas.Produto;
import br.com.facdombosco.progc.service.compras.FormaPagamentoService;
import br.com.facdombosco.progc.service.compras.FornecedorService;
//import br.com.facdombosco.progc.service.compras.TesteService;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import java.awt.Dimension;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class frmFinalizarPedido extends javax.swing.JInternalFrame
{
    public frmFinalizarPedido()
    {
        initComponents();
        ListarFormaPagamento();
        ListarFornecedor();
        ListarProduto();
    }

    public void AdaptarPosicao()
    {
        Dimension vDimensao = this.getDesktopPane().getSize();

        this.setLocation(((vDimensao.width - this.getSize().width) / 2), ((vDimensao.height - this.getSize().height) / 2));
     }

    private Dictionary<String, Object> PesquisarDicionario()
    {
        Dictionary<String, Object> vPropriedade = new Hashtable<String, Object>();

        return vPropriedade;
    }

    public void ListarFormaPagamento()
    {
        FormaPagamentoService vServicoFormaPagamento = new FormaPagamentoService();
        List<FormaPagamento> vFormaPagamento = vServicoFormaPagamento.findAll(this.PesquisarDicionario());
        FormaPagamentoTableModel vTabelaModeloFormaPagamento = new FormaPagamentoTableModel(vFormaPagamento);

        this.tbPagamento.setModel(vTabelaModeloFormaPagamento);
    }

    public void ListarFornecedor()
    {
        FornecedorService vServicoFornecedor = new FornecedorService();
        List<Fornecedor> vListaFornecedor = vServicoFornecedor.findAll(this.PesquisarDicionario());
        FornecedorTableModel vTabelaModeloFornecedor = new FornecedorTableModel(vListaFornecedor);

        this.tbFornecedor.setModel(vTabelaModeloFornecedor);
    }

    public void ListarProduto()
    {
////        TesteService vServicoTeste = new TesteService();
////        List<Teste> vListaTeste = vServicoTeste.findAll(this.PesquisarDicionario());
////        TesteTableModel vTabelaModeloTeste = new TesteTableModel(vListaTeste);

//        this.tbProduto.setModel(vTabelaModeloTeste);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        spCadastroFornecedor1 = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        spCadastroFornecedor = new javax.swing.JScrollPane();
        tbPagamento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtEmail1 = new javax.swing.JFormattedTextField();
        lblTelefone1 = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        txtCidade1 = new javax.swing.JTextField();
        lblCidade1 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtCnpj1 = new javax.swing.JTextField();
        lblCnpj1 = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        txtNome3 = new javax.swing.JTextField();
        txtEstado2 = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        spCadastroFornecedor2 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE O FORNECEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        spCadastroFornecedor1.setName("spCadastroFornecedor1"); // NOI18N

        tbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFornecedor.setName("tbFornecedor"); // NOI18N
        spCadastroFornecedor1.setViewportView(tbFornecedor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(spCadastroFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE A FORMA DE PAGAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        spCadastroFornecedor.setName("spCadastroFornecedor"); // NOI18N

        tbPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPagamento.setName("tbPagamento"); // NOI18N
        spCadastroFornecedor.setViewportView(tbPagamento);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblEstado1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(0, 0, 153));
        lblEstado1.setText("Valor total");
        lblEstado1.setName("lblEstado1"); // NOI18N

        txtCidade1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCidade1.setName("txtCidade1"); // NOI18N

        lblCidade1.setFont(new java.awt.Font("Lucida Console", 1, 14));
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

        lblNome3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(0, 0, 153));
        lblNome3.setText("Valor");
        lblNome3.setName("lblNome3"); // NOI18N

        txtNome3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNome3.setName("txtNome3"); // NOI18N

        txtEstado2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEstado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10%", "15%", "20%", "25%" }));
        txtEstado2.setName("txtEstado2"); // NOI18N

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setForeground(new java.awt.Color(0, 0, 153));
        btSalvar.setMnemonic('f');
        btSalvar.setText("FINALIZAR");
        btSalvar.setName("btSalvar"); // NOI18N

        btSalvar1.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar1.setForeground(new java.awt.Color(0, 0, 153));
        btSalvar1.setMnemonic('c');
        btSalvar1.setText("CANCELAR");
        btSalvar1.setName("btSalvar1"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome3)
                            .addComponent(lblCnpj1)
                            .addComponent(lblEndereco1)
                            .addComponent(lblCidade1)
                            .addComponent(lblEstado1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome3)
                            .addComponent(txtEndereco1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCnpj1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalvar)
                            .addComponent(btSalvar1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblTelefone1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(lblEstado1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone1)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INFORMAÇÕES SOBRE O PRODUTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N

        spCadastroFornecedor2.setName("spCadastroFornecedor2"); // NOI18N

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProduto.setName("tbProduto"); // NOI18N
        spCadastroFornecedor2.setViewportView(tbProduto);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFornecedor2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(spCadastroFornecedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCnpj1;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JScrollPane spCadastroFornecedor;
    private javax.swing.JScrollPane spCadastroFornecedor1;
    private javax.swing.JScrollPane spCadastroFornecedor2;
    private javax.swing.JTable tbFornecedor;
    private javax.swing.JTable tbPagamento;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField txtCidade1;
    private javax.swing.JTextField txtCnpj1;
    private javax.swing.JFormattedTextField txtEmail1;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JComboBox txtEstado2;
    private javax.swing.JTextField txtNome3;
    // End of variables declaration//GEN-END:variables

}
