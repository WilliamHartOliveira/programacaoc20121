package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.vendas.Produto;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import java.awt.Dimension;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.tool.hbm2x.StringUtils;

public class GUIProduto extends javax.swing.JInternalFrame {

    public GUIProduto() {
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
        txtNome_Produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo_Produto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtValor_Produto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setClosable(true);
        setTitle("Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtNome_Produto.setName("txtNome_Produto"); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Código:");
        jLabel6.setName("jLabel6"); // NOI18N

        txtCodigo_Produto.setEditable(false);
        txtCodigo_Produto.setName("txtCodigo_Produto"); // NOI18N

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

        txtValor_Produto.setName("txtValor_Produto"); // NOI18N
        txtValor_Produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValor_ProdutoKeyPressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Valor Unitario:");
        jLabel13.setName("jLabel13"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome_Produto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(txtCodigo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor_Produto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtValor_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)))
        );

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProduto.setName("tblProduto"); // NOI18N
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduto);

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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpaTodosCampos() {
        this.txtCodigo_Produto.setText(null);
        this.txtValor_Produto.setText(null);
        this.txtNome_Produto.setText(null);
        this.edicao = true;
    }
    
    private void carregarFormulario(Produto produto) {

        this.txtCodigo_Produto.setText(String.valueOf(produto.getIdProduto()));
        this.txtValor_Produto.setText(produto.getValor().toString());
        this.txtNome_Produto.setText(produto.getNome());
        this.edicao = true;
    }

    private Produto carregarObjetoPersistencia()
    {
        Produto produto = new Produto();

        if(!this.txtValor_Produto.getText().isEmpty())
            produto.setValor(Float.parseFloat(this.txtValor_Produto.getText()));
        else
            produto.setValor(new Float(0.0));

        produto.setNome(this.txtNome_Produto.getText());

        if (this.edicao)
            produto.setIdProduto(Integer.parseInt(this.txtCodigo_Produto.getText()));

        return produto;
    }

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        if (this.tblProduto.getSelectedRow() != -1) {
            ProdutoTableModel produtoTableModel = (ProdutoTableModel)this.tblProduto.getModel();
            this.carregarFormulario(produtoTableModel.getProdutos().get(this.tblProduto.getSelectedRow()));
            this.jButton4.setEnabled(true);
        }
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ProdutoService produtoservice = new ProdutoService();
            produtoservice.save(this.carregarObjetoPersistencia());
            this.jButton2ActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimpaTodosCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(StringUtils.isNumeric(this.txtCodigo_Produto.getText()))
       {
            ProdutoService produtoService = new ProdutoService();
            List<Produto> listProduto = produtoService.findAll(this.carregarDictionaryPesquisa());

            ProdutoTableModel produtoTableModel = new ProdutoTableModel(listProduto);
            this.tblProduto.setModel(produtoTableModel);
            LimpaTodosCampos();
        }else
            JOptionPane.showMessageDialog(this, "O código digitado deve ser númerico!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ProdutoService().delete(this.carregarObjetoPersistencia());
        this.jButton2ActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtValor_ProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor_ProdutoKeyPressed
        if(evt.getKeyCode() == 8) return;
        if(evt.getKeyCode() == 10) return;
        if(evt.getKeyCode() == 46) return;

        if((evt.getKeyCode() < 48)||(evt.getKeyCode() > 57))
        {
            evt.consume();
            return;
        }
    }//GEN-LAST:event_txtValor_ProdutoKeyPressed

    private Dictionary<String, Object> carregarDictionaryPesquisa() {

        Dictionary<String, Object> properties = new Hashtable<String, Object>();

        if (!this.txtCodigo_Produto.getText().equals(""))
            properties.put("idProduto", Integer.parseInt(this.txtCodigo_Produto.getText()));

        if (!this.txtNome_Produto.getText().equals(""))
            properties.put("nome", this.txtNome_Produto.getText());

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
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodigo_Produto;
    private javax.swing.JTextField txtNome_Produto;
    private javax.swing.JTextField txtValor_Produto;
    // End of variables declaration//GEN-END:variables
}
