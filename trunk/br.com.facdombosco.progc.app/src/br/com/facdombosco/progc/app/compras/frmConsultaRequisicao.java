package br.com.facdombosco.progc.app.compras;

import java.awt.Dimension;

public class frmConsultaRequisicao extends javax.swing.JInternalFrame
{
    public frmConsultaRequisicao() 
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
        jpPesquisa = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JComboBox();
        spPesquisa = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        jpRequisicaoCompra = new javax.swing.JPanel();
        spRequisicaoCompra = new javax.swing.JScrollPane();
        tbRequisicaoCompra = new javax.swing.JTable();
        btConcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTA E REQUISIÇÕES");

        jpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jpPrincipal.setName("jpPrincipal"); // NOI18N

        jpPesquisa.setBackground(new java.awt.Color(0, 0, 0));
        jpPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "PESQUISA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpPesquisa.setName("jpPesquisa"); // NOI18N

        lblProduto.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblProduto.setForeground(new java.awt.Color(0, 0, 153));
        lblProduto.setText("Produto");
        lblProduto.setName("lblProduto"); // NOI18N

        txtProduto.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtProduto.setName("txtProduto"); // NOI18N

        lblFornecedor.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblFornecedor.setForeground(new java.awt.Color(0, 0, 153));
        lblFornecedor.setText("Fornecedor");
        lblFornecedor.setName("lblFornecedor"); // NOI18N

        txtFornecedor.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtFornecedor.setName("txtFornecedor"); // NOI18N

        spPesquisa.setName("spPesquisa"); // NOI18N

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPesquisa.setName("tbPesquisa"); // NOI18N
        spPesquisa.setViewportView(tbPesquisa);

        javax.swing.GroupLayout jpPesquisaLayout = new javax.swing.GroupLayout(jpPesquisa);
        jpPesquisa.setLayout(jpPesquisaLayout);
        jpPesquisaLayout.setHorizontalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProduto)
                .addGap(18, 18, 18)
                .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPesquisaLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(spPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
        );
        jpPesquisaLayout.setVerticalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaLayout.createSequentialGroup()
                    .addContainerGap(63, Short.MAX_VALUE)
                    .addComponent(spPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        jpRequisicaoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jpRequisicaoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "REQUISIÇÃO DE COMPRA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpRequisicaoCompra.setName("jpRequisicaoCompra"); // NOI18N

        spRequisicaoCompra.setName("spRequisicaoCompra"); // NOI18N

        tbRequisicaoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbRequisicaoCompra.setName("tbRequisicaoCompra"); // NOI18N
        spRequisicaoCompra.setViewportView(tbRequisicaoCompra);

        btConcluir.setBackground(new java.awt.Color(255, 255, 255));
        btConcluir.setForeground(new java.awt.Color(0, 0, 153));
        btConcluir.setMnemonic('c');
        btConcluir.setText("CONCLUIR");
        btConcluir.setName("btConcluir"); // NOI18N

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setForeground(new java.awt.Color(0, 0, 153));
        btSair.setMnemonic('r');
        btSair.setText("SAIR");
        btSair.setName("btSair"); // NOI18N

        javax.swing.GroupLayout jpRequisicaoCompraLayout = new javax.swing.GroupLayout(jpRequisicaoCompra);
        jpRequisicaoCompra.setLayout(jpRequisicaoCompraLayout);
        jpRequisicaoCompraLayout.setHorizontalGroup(
            jpRequisicaoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRequisicaoCompraLayout.createSequentialGroup()
                .addGroup(jpRequisicaoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRequisicaoCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spRequisicaoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
                    .addGroup(jpRequisicaoCompraLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpRequisicaoCompraLayout.setVerticalGroup(
            jpRequisicaoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRequisicaoCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spRequisicaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpRequisicaoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpRequisicaoCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpRequisicaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaRequisicao().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jpPesquisa;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRequisicaoCompra;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JScrollPane spPesquisa;
    private javax.swing.JScrollPane spRequisicaoCompra;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTable tbRequisicaoCompra;
    private javax.swing.JComboBox txtFornecedor;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables

}
