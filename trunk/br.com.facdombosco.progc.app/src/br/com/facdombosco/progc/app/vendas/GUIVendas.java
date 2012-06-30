/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIVendas.java
 *
 * Created on 27/06/2012, 21:47:06
 */
package br.com.facdombosco.progc.app.vendas;

import java.awt.Dimension;

/**
 *
 * @author Francisco
 */
public class GUIVendas extends javax.swing.JPanel {

    /** Creates new form GUIVendas */
    public GUIVendas() {
        initComponents();
    }

    public void setPosicao(){
        Dimension d = this.getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnProximo = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIDVenda = new javax.swing.JTextField();
        jbtnPrimeiro = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIDVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNotaFiscalN = new javax.swing.JTextField();
        cbxFechado = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIDProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jbtnNovo = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotalVenda = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Dados da Venda "));
        jPanel2.setName("jPanel2"); // NOI18N

        jbtnProximo.setText(">");
        jbtnProximo.setName("jbtnProximo"); // NOI18N

        jbtnUltimo.setText(">|");
        jbtnUltimo.setName("jbtnUltimo"); // NOI18N

        jLabel1.setText("C�digo da Venda:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtIDVenda.setEditable(false);
        txtIDVenda.setName("txtIDVenda"); // NOI18N

        jbtnPrimeiro.setText("|<");
        jbtnPrimeiro.setName("jbtnPrimeiro"); // NOI18N

        jbtnAnterior.setText("<");
        jbtnAnterior.setName("jbtnAnterior"); // NOI18N

        jLabel2.setText("C�digo do Vendedor:");
        jLabel2.setName("jLabel2"); // NOI18N

        txtIDVendedor.setEditable(false);
        txtIDVendedor.setName("txtIDVendedor"); // NOI18N

        jLabel3.setText("C�digo do Cliente:");
        jLabel3.setName("jLabel3"); // NOI18N

        txtIDCliente.setEditable(false);
        txtIDCliente.setName("txtIDCliente"); // NOI18N

        jLabel4.setText("Nota Fiscal N�:");
        jLabel4.setName("jLabel4"); // NOI18N

        txtNotaFiscalN.setEditable(false);
        txtNotaFiscalN.setName("txtNotaFiscalN"); // NOI18N

        cbxFechado.setText("Fechado ?");
        cbxFechado.setEnabled(false);
        cbxFechado.setName("cbxFechado"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxFechado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNotaFiscalN)
                    .addComponent(txtIDCliente)
                    .addComponent(txtIDVendedor)
                    .addComponent(txtIDVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPrimeiro)
                    .addComponent(jbtnAnterior)
                    .addComponent(jbtnProximo)
                    .addComponent(jbtnUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNotaFiscalN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFechado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Itens da Venda "));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C�d. Produto", "Descri��o", "Valor Unit�rio", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("C�digo do Produto:");
        jLabel5.setName("jLabel5"); // NOI18N

        txtIDProduto.setEditable(false);
        txtIDProduto.setName("txtIDProduto"); // NOI18N

        jLabel6.setText("Quantidade:");
        jLabel6.setName("jLabel6"); // NOI18N

        txtQuantidade.setEditable(false);
        txtQuantidade.setName("txtQuantidade"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jbtnNovo.setText("Novo");
        jbtnNovo.setName("jbtnNovo"); // NOI18N

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.setName("jbtnCancelar"); // NOI18N

        jbtnSalvar.setText("Salvar");
        jbtnSalvar.setEnabled(false);
        jbtnSalvar.setName("jbtnSalvar"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("TOTAL: ");
        jLabel7.setName("jLabel7"); // NOI18N

        lblTotalVenda.setText("R$ 0,00");
        lblTotalVenda.setName("lblTotalVenda"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(jbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalVenda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotalVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovo)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnSalvar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxFechado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnPrimeiro;
    private javax.swing.JButton jbtnProximo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JButton jbtnUltimo;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtIDVenda;
    private javax.swing.JTextField txtIDVendedor;
    private javax.swing.JTextField txtNotaFiscalN;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
