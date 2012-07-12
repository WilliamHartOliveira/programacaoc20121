/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIVendas.java
 *
 * Created on 07/07/2012, 09:44:33
 */

package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.vendas.*;
import br.com.facdombosco.progc.service.vendas.ClienteService;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import br.com.facdombosco.progc.service.vendas.VendaService;
import br.com.facdombosco.progc.service.vendas.VendedorService;
import java.awt.Dimension;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author 9213091
 */
public class GUIVendas extends javax.swing.JInternalFrame {
    List<Produto> listProduto = new ArrayList<Produto>();
    List<ItemVenda> listItem = new ArrayList<ItemVenda>();
    
    /** Creates new form GUIVendas */
    public GUIVendas() {
        initComponents();

    }

    private Dictionary<String, Object> carregarDictionaryPesquisa() {

        Dictionary<String, Object> properties = new Hashtable<String, Object>();

        if (!this.txtCodProduto.getText().equals(""))
            properties.get(this.txtCodProduto.getText());

        return properties;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtCodVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxFinalizado = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtNotaNumero = new javax.swing.JTextField();
        btnCodVendedor = new javax.swing.JButton();
        btnCodCliente = new javax.swing.JButton();
        jlAvisoCli = new javax.swing.JLabel();
        jlAvisoVend = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAddProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jsQuantidade = new javax.swing.JSpinner();
        btnCodProduto = new javax.swing.JButton();
        btnRemoveProduto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Pedido de Venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Dados da Venda "));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText("Código:");
        jLabel1.setToolTipText("");
        jLabel1.setName("jLabel1"); // NOI18N

        txtCodigo.setEnabled(false);
        txtCodigo.setName("txtCodigo"); // NOI18N

        btnPrimeiro.setText("|<");
        btnPrimeiro.setEnabled(false);
        btnPrimeiro.setName("btnPrimeiro"); // NOI18N

        btnAnterior.setText("<");
        btnAnterior.setEnabled(false);
        btnAnterior.setName("btnAnterior"); // NOI18N

        btnProximo.setText(">");
        btnProximo.setEnabled(false);
        btnProximo.setName("btnProximo"); // NOI18N

        btnUltimo.setText(">|");
        btnUltimo.setEnabled(false);
        btnUltimo.setName("btnUltimo"); // NOI18N

        jLabel2.setText("Código Cliente:");
        jLabel2.setName("jLabel2"); // NOI18N

        txtCodCliente.setEnabled(false);
        txtCodCliente.setName("txtCodCliente"); // NOI18N
        txtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyTyped(evt);
            }
        });

        txtCodVendedor.setEnabled(false);
        txtCodVendedor.setName("txtCodVendedor"); // NOI18N
        txtCodVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodVendedorKeyTyped(evt);
            }
        });

        jLabel3.setText("Código Vendedor:");
        jLabel3.setName("jLabel3"); // NOI18N

        cbxFinalizado.setText("Finalizado ?");
        cbxFinalizado.setEnabled(false);
        cbxFinalizado.setName("cbxFinalizado"); // NOI18N
        cbxFinalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxFinalizadoMouseClicked(evt);
            }
        });

        jLabel4.setText("Nota Nº:");
        jLabel4.setName("jLabel4"); // NOI18N

        txtNotaNumero.setEditable(false);
        txtNotaNumero.setName("txtNotaNumero"); // NOI18N

        btnCodVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/lupa.png"))); // NOI18N
        btnCodVendedor.setEnabled(false);
        btnCodVendedor.setName("btnCodVendedor"); // NOI18N
        btnCodVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodVendedorActionPerformed(evt);
            }
        });

        btnCodCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/lupa.png"))); // NOI18N
        btnCodCliente.setEnabled(false);
        btnCodCliente.setName("btnCodCliente"); // NOI18N
        btnCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodClienteActionPerformed(evt);
            }
        });

        jlAvisoCli.setName("jlAvisoCli");

        jlAvisoVend.setName("jlAvisoVend");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNotaNumero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxFinalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodVendedor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoVend))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoCli)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNotaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(btnCodCliente)
                            .addComponent(jlAvisoCli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnCodVendedor)))
                    .addComponent(jlAvisoVend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFinalizado))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Dados dos Produtos "));
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel5.setText("Código do Produto:");
        jLabel5.setName("jLabel5"); // NOI18N

        txtCodProduto.setEnabled(false);
        txtCodProduto.setName("txtCodProduto"); // NOI18N
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyPressed(evt);
            }
        });

        jLabel6.setText("Quantidade:");
        jLabel6.setName("jLabel6"); // NOI18N

        btnAddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/add.png"))); // NOI18N
        btnAddProduto.setEnabled(false);
        btnAddProduto.setName("btnAddProduto"); // NOI18N
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Item", "Descrição", "Valor Unitário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jsQuantidade.setEnabled(false);
        jsQuantidade.setName("jsQuantidade"); // NOI18N
        jsQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsQuantidadeStateChanged(evt);
            }
        });

        btnCodProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/lupa.png"))); // NOI18N
        btnCodProduto.setEnabled(false);
        btnCodProduto.setName("btnCodProduto"); // NOI18N
        btnCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodProdutoActionPerformed(evt);
            }
        });

        btnRemoveProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/facdombosco/progc/app/icons/remove.png"))); // NOI18N
        btnRemoveProduto.setEnabled(false);
        btnRemoveProduto.setName("btnRemoveProduto"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsQuantidade)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCodProduto)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRemoveProduto)
                        .addComponent(btnAddProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL:");
        jLabel7.setName("jLabel7"); // NOI18N

        jlTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(204, 0, 0));
        jlTotal.setText("R$ 0,00");
        jlTotal.setName("jlTotal"); // NOI18N

        btnNovo.setText("Novo");
        btnNovo.setName("btnNovo"); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTotal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodCliente.setEnabled(true);
        txtCodVendedor.setEnabled(true);
        txtCodigo.setEnabled(true);
        cbxFinalizado.setEnabled(false);
        txtCodProduto.setEnabled(true);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(true);
        
        VendaService vs = new VendaService();
//        Venda venda = vs.findLastVenda();
//        String txtCod = String.valueOf(venda.getIdVenda());
//        txtCodigo.setText(txtCod);
}//GEN-LAST:event_btnNovoActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        double total = 0;
        ProdutoService produtoService = new ProdutoService();
        for(int i=0; i<Integer.parseInt(jsQuantidade.getValue().toString()); i++){
            listProduto.add(produtoService.findByProd(Integer.parseInt(this.txtCodProduto.getText())));
            ProdutoTableModel1 produtoTableModel = new ProdutoTableModel1(listProduto);
            this.jTable1.setModel(produtoTableModel);
        }
        for(int i=0; i<jTable1.getRowCount(); i++)
        {
            total = total + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        jlTotal.setText("$ "+String.valueOf(total).substring(0, 4)+"0");
        cbxFinalizado.setEnabled(true);
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCodCliente.setEnabled(false);
        txtCodVendedor.setEnabled(false);
        cbxFinalizado.setSelected(false);
        cbxFinalizado.setEnabled(false);
        txtCodProduto.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnAddProduto.setEnabled(false);
        
        txtCodVendedor.setText("");
        btnCodVendedor.setEnabled(false);
        txtCodCliente.setText("");
        btnCodCliente.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtCodProduto.setText("");
        btnCodProduto.setEnabled(false);
        jsQuantidade.setValue(0);
        jsQuantidade.setEnabled(false);
        jTable1.removeRowSelectionInterval(0, jTable1.getRowCount());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyPressed
        btnCodProduto.setEnabled(true);
    }//GEN-LAST:event_txtCodProdutoKeyPressed

    private void btnCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodProdutoActionPerformed
        ProdutoService produtoService = new ProdutoService();
        Produto returned = produtoService.findByProd(Integer.parseInt(this.txtCodProduto.getText()));
        if(returned != null)
        {
            jsQuantidade.setEnabled(true);
        }else{
            jsQuantidade.setEnabled(false);
        }
    }//GEN-LAST:event_btnCodProdutoActionPerformed

    private void jsQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsQuantidadeStateChanged
        if(Integer.parseInt(jsQuantidade.getValue().toString()) > 0)
        {
            btnAddProduto.setEnabled(true);
        }else{
            btnAddProduto.setEnabled(false);
        }
    }//GEN-LAST:event_jsQuantidadeStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        for(int i=0; i<jTable1.getRowCount();i++)
        {
            int count = 0;
            String codItem = jTable1.getValueAt(i, 0).toString();
            for(int j=i; j<jTable1.getRowCount();j++)
            {
                String varrer = jTable1.getValueAt(j, 0).toString();
                if(varrer.equals(codItem))
                {
                    count++;
                }
            }
            ItemVenda itemvenda = new ItemVenda();
            Produto enter = new Produto(null, jTable1.getValueAt(i, 1).toString(), Float.parseFloat(jTable1.getValueAt(i, 2).toString()));
            itemvenda.setProduto(enter);
            itemvenda.setQuantidade(String.valueOf(count));
            listItem.add(itemvenda);
            count = 0;
        }
        Cliente c = new Cliente(txtCodCliente.getText());
        Vendedor v = new Vendedor(Integer.parseInt(txtCodVendedor.getText()));
        Set nfVenda = new HashSet(listItem);
        NotaFiscal nf = new NotaFiscal(null, null, nfVenda);
        Venda venda = new Venda(c, v, nf, true, nfVenda);
        VendaService vendaService = new VendaService();
        try {
            vendaService.save(venda);
        } catch (Exception ex) {
            Logger.getLogger(GUIVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyTyped
        btnCodCliente.setEnabled(true);
    }//GEN-LAST:event_txtCodClienteKeyTyped

    private void btnCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodClienteActionPerformed
        ClienteService cliService = new ClienteService();
        Cliente returned = cliService.findByCpf(this.txtCodCliente.getText());
        if(returned == null)
        {
            jlAvisoCli.setText("Cliente não encontrado!");
            btnSalvar.setEnabled(false);
        }else{
            jlAvisoCli.setText("");
            btnSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCodClienteActionPerformed

    private void btnCodVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodVendedorActionPerformed
        VendedorService cliService = new VendedorService();
        Vendedor returned = cliService.findByID(Integer.parseInt(this.txtCodVendedor.getText()));
        if(returned == null)
        {
            jlAvisoVend.setText("Vendedor não encontrado!");
            btnSalvar.setEnabled(false);
        }else{
            jlAvisoVend.setText("");
            btnSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCodVendedorActionPerformed

    private void txtCodVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodVendedorKeyTyped
        btnCodVendedor.setEnabled(true);
    }//GEN-LAST:event_txtCodVendedorKeyTyped

    private void cbxFinalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxFinalizadoMouseClicked
        if(cbxFinalizado.isSelected())
        {
            btnSalvar.setEnabled(true);
        }else{
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_cbxFinalizadoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCodCliente;
    private javax.swing.JButton btnCodProduto;
    private javax.swing.JButton btnCodVendedor;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnRemoveProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JCheckBox cbxFinalizado;
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
    private javax.swing.JLabel jlAvisoCli;
    private javax.swing.JLabel jlAvisoVend;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtCodVendedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNotaNumero;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2, (d.height - this.getSize().height)/2);
    }

}
