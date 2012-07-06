package br.com.facdombosco.progc.app.suprimentos;

import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import br.com.facdombosco.progc.service.suprimentos.EstoqueItemService;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import java.awt.Dimension;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.tool.hbm2x.StringUtils;

public class GUIEstoqueItem extends javax.swing.JInternalFrame {

    public GUIEstoqueItem() {
        initComponents();
    }
    
    private boolean edicao = false;

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId_Produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo_EstoqueItem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtQtd_Produto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstoqueItem = new javax.swing.JTable();

        setClosable(true);
        setTitle("Estoque Item");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Produto:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtId_Produto.setName("txtId_Produto"); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Código:");
        jLabel6.setName("jLabel6"); // NOI18N

        txtCodigo_EstoqueItem.setEditable(false);
        txtCodigo_EstoqueItem.setName("txtCodigo_EstoqueItem"); // NOI18N

        jButton1.setText("Salvar");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Listar");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtQtd_Produto.setName("txtQtd_Produto"); // NOI18N
        txtQtd_Produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtd_ProdutoKeyPressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Qtd:");
        jLabel13.setName("jLabel13"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo_EstoqueItem, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtId_Produto))
                        .addContainerGap(247, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtd_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo_EstoqueItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtQtd_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)))
        );

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tblEstoqueItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEstoqueItem.setName("tblEstoqueItem"); // NOI18N
        tblEstoqueItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueItemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEstoqueItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Estoque Item");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpaTodosCampos() {
        this.txtCodigo_EstoqueItem.setText(null);
        this.txtQtd_Produto.setText(null);
        this.txtId_Produto.setText(null);
        this.edicao = true;
    }
    
    private void carregarFormulario(EstoqueItem estoqueItem) {
        this.txtCodigo_EstoqueItem.setText(String.valueOf(estoqueItem.getIdEstoqueItem()));
        this.txtQtd_Produto.setText(String.valueOf(estoqueItem.getQtdProduto()));
        this.txtId_Produto.setText(String.valueOf(estoqueItem.getProduto().getIdProduto()));
        this.edicao = true;
    }

    private EstoqueItem carregarObjetoPersistencia()
    {
        EstoqueItem estoqueItem = new EstoqueItem();

        if(!this.txtQtd_Produto.getText().isEmpty())
            estoqueItem.setQtdProduto(Integer.parseInt(this.txtQtd_Produto.getText()));

        if(!this.txtId_Produto.getText().isEmpty())
            estoqueItem.setProduto(new ProdutoService().findById(Integer.parseInt(this.txtId_Produto.getText())));

        return estoqueItem;
    }

    private void tblEstoqueItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueItemMouseClicked
        if (this.tblEstoqueItem.getSelectedRow() != -1) {
            EstoqueItemTableModel estoqueItemTableModel = (EstoqueItemTableModel)this.tblEstoqueItem.getModel();
            this.carregarFormulario(estoqueItemTableModel.getEstoqueItens().get(this.tblEstoqueItem.getSelectedRow()));
            this.jButton4.setEnabled(true);
        }
    }//GEN-LAST:event_tblEstoqueItemMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EstoqueItemService produtoservice = new EstoqueItemService();
            produtoservice.save(this.carregarObjetoPersistencia());
            this.jButton2ActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimpaTodosCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(StringUtils.isNumeric(this.txtCodigo_EstoqueItem.getText()))
       {
            EstoqueItemService estoqueItemService = new EstoqueItemService();
            List<EstoqueItem> listEstoqueItem = estoqueItemService.findAll(this.carregarDictionaryPesquisa());

            EstoqueItemTableModel estoqueItemTableModel = new EstoqueItemTableModel(listEstoqueItem);
            this.tblEstoqueItem.setModel(estoqueItemTableModel);
            LimpaTodosCampos();
        }else
            JOptionPane.showMessageDialog(this, "O código digitado deve ser númerico!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new EstoqueItemService().delete(this.carregarObjetoPersistencia());
        this.jButton2ActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtQtd_ProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtd_ProdutoKeyPressed
        if(evt.getKeyCode() == 8) return;
        if(evt.getKeyCode() == 10) return;
        if(evt.getKeyCode() == 46) return;

        if((evt.getKeyCode() < 48)||(evt.getKeyCode() > 57))
        {
            evt.consume();
            return;
        }
    }//GEN-LAST:event_txtQtd_ProdutoKeyPressed

    private Dictionary<String, Object> carregarDictionaryPesquisa() {

        Dictionary<String, Object> properties = new Hashtable<String, Object>();

        if (!this.txtCodigo_EstoqueItem.getText().equals(""))
            properties.put("idProduto", Integer.parseInt(this.txtCodigo_EstoqueItem.getText()));

        if (!this.txtId_Produto.getText().equals(""))
            properties.put("nome", this.txtId_Produto.getText());

        return properties;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEstoqueItem;
    private javax.swing.JTextField txtCodigo_EstoqueItem;
    private javax.swing.JTextField txtId_Produto;
    private javax.swing.JTextField txtQtd_Produto;
    // End of variables declaration//GEN-END:variables
}
