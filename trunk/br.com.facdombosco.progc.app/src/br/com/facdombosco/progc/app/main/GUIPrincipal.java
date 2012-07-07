package br.com.facdombosco.progc.app.main;

import br.com.facdombosco.progc.app.vendas.GUIVendas;
import br.com.facdombosco.progc.app.vendas.GUIProduto;
import br.com.facdombosco.progc.app.acessos.GUIUsuario;
import br.com.facdombosco.progc.app.compras.frmCadastroFormaPagamento;
import br.com.facdombosco.progc.app.compras.frmCadastroFornecedor;
import br.com.facdombosco.progc.app.compras.frmConsultaRequisicao;
import br.com.facdombosco.progc.app.compras.frmRequisicaoPedido;
import br.com.facdombosco.progc.app.suprimentos.GUIEstoqueItem;
import br.com.facdombosco.progc.dvo.acessos.Usuario;
import br.com.facdombosco.progc.reportsGeneral.HibernateReport;
import br.com.facdombosco.progc.service.suprimentos.EstoqueItemService;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;

public class GUIPrincipal extends javax.swing.JFrame {

    /** Creates new form GUIPrincipal */
    public GUIPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // cuida para que o relÃ³rio atualize sempre
        Thread time = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        lHora.setText(pegarData());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("");
                    }
                }
            }
        };

        time.start();
    }

    String pegarData() {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss aa"); //
        return data.format(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuVendas = new javax.swing.JMenu();
        pedidoVenda_Vendas = new javax.swing.JMenuItem();
        itemDeMenuSair_Vendas = new javax.swing.JMenuItem();
        menuServico = new javax.swing.JMenu();
        solicitacaoDeOrcamento_Servicos = new javax.swing.JMenuItem();
        menuSuprimento = new javax.swing.JMenu();
        itemDeMenuEstoqueItem = new javax.swing.JMenuItem();
        itemDeMenuProduto = new javax.swing.JMenuItem();
        itemDeMenuRelatorioEstoqueItem = new javax.swing.JMenuItem();
        itemDeMenuRelatorioProduto = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        itemDeMenuCadastroUsuario = new javax.swing.JMenuItem();
        itemDeMenuRelatorioUsuario = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemDeMenuAjuda = new javax.swing.JMenuItem();
        jmCompra = new javax.swing.JMenu();
        miCadastroFornecedor = new javax.swing.JMenuItem();
        miCadastroFormaPagamento = new javax.swing.JMenuItem();
        miConsultaRequisicao = new javax.swing.JMenuItem();
        miRequisicaoPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Integrado de Gestão - Picaredata");
        setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel2.setBounds(0, 0, 1250, 740);
        desktopPane.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lHora.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desenvolvido pelo Grupo de Programação C - Faculdade Dom Bosco de Porto Alegre");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuVendas.setText("Vendas");

        pedidoVenda_Vendas.setText("Pedido de Venda");
        pedidoVenda_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoVenda_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(pedidoVenda_Vendas);

        itemDeMenuSair_Vendas.setText("Sair");
        itemDeMenuSair_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuSair_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuSair_Vendas);

        menuBar.add(menuVendas);

        menuServico.setText("Serviços");
        menuServico.setActionCommand("Servicos"); // NOI18N

        solicitacaoDeOrcamento_Servicos.setText("Solicitação de Orçamento");
        solicitacaoDeOrcamento_Servicos.setActionCommand("SolicitacaoDeOrcamento");
        menuServico.add(solicitacaoDeOrcamento_Servicos);

        menuBar.add(menuServico);

        menuSuprimento.setText("Suprimentos");

        itemDeMenuEstoqueItem.setText("Estoque Item");
        itemDeMenuEstoqueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuEstoqueItemActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuEstoqueItem);

        itemDeMenuProduto.setText("Produto");
        itemDeMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuProdutoActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuProduto);

        itemDeMenuRelatorioEstoqueItem.setText("Relatório Estoque");
        itemDeMenuRelatorioEstoqueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioEstoqueItemActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuRelatorioEstoqueItem);

        itemDeMenuRelatorioProduto.setText("Relatório Produto");
        itemDeMenuRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioProdutoActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuRelatorioProduto);

        menuBar.add(menuSuprimento);

        menuUsuario.setText("Usuário");

        itemDeMenuCadastroUsuario.setText("Usuário");
        itemDeMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemDeMenuCadastroUsuario);

        itemDeMenuRelatorioUsuario.setText("Relatório Usuário");
        itemDeMenuRelatorioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemDeMenuRelatorioUsuario);

        menuBar.add(menuUsuario);

        menuAjuda.setText("Ajuda");

        itemDeMenuAjuda.setText("Ajuda");
        itemDeMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuAjudaActionPerformed(evt);
            }
        });
        menuAjuda.add(itemDeMenuAjuda);

        menuBar.add(menuAjuda);

        jmCompra.setMnemonic('c');
        jmCompra.setText("Compras");

        miCadastroFornecedor.setMnemonic('f');
        miCadastroFornecedor.setText("Cadastro de Fornecedores");
        miCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroFornecedorActionPerformed(evt);
            }
        });
        jmCompra.add(miCadastroFornecedor);

        miCadastroFormaPagamento.setMnemonic('p');
        miCadastroFormaPagamento.setText("Cadastro de Formas de Pagamentos");
        miCadastroFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroFormaPagamentoActionPerformed(evt);
            }
        });
        jmCompra.add(miCadastroFormaPagamento);

        miConsultaRequisicao.setMnemonic('r');
        miConsultaRequisicao.setText("Consulta / Requisição");
        miConsultaRequisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaRequisicaoActionPerformed(evt);
            }
        });
        jmCompra.add(miConsultaRequisicao);

        miRequisicaoPedido.setMnemonic('i');
        miRequisicaoPedido.setText("Requisição / Pedido");
        miRequisicaoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRequisicaoPedidoActionPerformed(evt);
            }
        });
        jmCompra.add(miRequisicaoPedido);

        menuBar.add(jmCompra);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lHora, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lHora, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void configurarPermissoes(Usuario usuario) {
        menuUsuario.setEnabled(usuario.getNomeUsuario().equals("admin") ? true : false);
        menuVendas.setEnabled(usuario.getVendas().equals("S") ? true : false);
        menuServico.setEnabled(usuario.getServicos().equals("S") ? true : false);
        menuSuprimento.setEnabled(usuario.getSuprimentos().equals("S") ? true : false);
    }

    private void itemDeMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuAjudaActionPerformed
        if ((guiajuda == null) || (!guiajuda.isVisible())) {
            guiajuda = new GUIAjuda();
            desktopPane.add(guiajuda);
            guiajuda.setPosicao();
            guiajuda.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuAjudaActionPerformed

    private void itemDeMenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuCadastroUsuarioActionPerformed
        if ((guiUsuario == null) || (!guiUsuario.isVisible())) {
            guiUsuario = new GUIUsuario();
            desktopPane.add(guiUsuario);
            guiUsuario.setPosicao();
            guiUsuario.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuCadastroUsuarioActionPerformed

    private void itemDeMenuEstoqueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuEstoqueItemActionPerformed
        if ((guiEstoqueItem == null) || (!guiEstoqueItem.isVisible())) {
            guiEstoqueItem = new GUIEstoqueItem();
            desktopPane.add(guiEstoqueItem);
            guiEstoqueItem.setPosicao();
            guiEstoqueItem.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuEstoqueItemActionPerformed

    private void itemDeMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuProdutoActionPerformed
        if ((guiProduto == null) || (!guiProduto.isVisible())) {
            guiProduto = new GUIProduto();
            desktopPane.add(guiProduto);
            guiProduto.setPosicao();
            guiProduto.setVisible(true);
        }
    }//GEN-LAST:event_itemDeMenuProdutoActionPerformed

    private void solicitacaoDeOrcamento_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitacaoDeOrcamento_ServicosActionPerformed

    }//GEN-LAST:event_solicitacaoDeOrcamento_ServicosActionPerformed

    private void itemDeMenuSair_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSair_VendasActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemDeMenuSair_VendasActionPerformed

    private void pedidoVenda_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoVenda_VendasActionPerformed
        if((guivendas == null)||(!guivendas.isVisible())){
            guivendas = new GUIVendas();
            desktopPane.add(guivendas);
            guivendas.setPosicao();
            guivendas.setVisible(true);
        }
    }//GEN-LAST:event_pedidoVenda_VendasActionPerformed

    private void itemDeMenuRelatorioEstoqueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioEstoqueItemActionPerformed
        try {
            HibernateReport.abrirReport();
            
            HibernateReport.abrirReport("../br.com.facdombosco.progc.reports/ReportsSuprimentos/reportEstoqueItem.jrxml",
                                        new EstoqueItemService().findAll());
        } catch (JRException ex) {
            Logger.getLogger(GUIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemDeMenuRelatorioEstoqueItemActionPerformed

    private void itemDeMenuRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioProdutoActionPerformed
        try {
            HibernateReport.abrirReport("../br.com.facdombosco.progc.reports/ReportsVendas/reportProduto.jrxml",
                                        new ProdutoService().findAll());
        } catch (JRException ex) {
            Logger.getLogger(GUIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemDeMenuRelatorioProdutoActionPerformed

    private void itemDeMenuRelatorioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioUsuarioActionPerformed
        try {
            HibernateReport.abrirReport("../br.com.facdombosco.progc.reports/ReportsAcesps/reportUsuario.jrxml",
                                        new ProdutoService().findAll());
        } catch (JRException ex) {
            Logger.getLogger(GUIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemDeMenuRelatorioUsuarioActionPerformed

    private void miCadastroFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroFormaPagamentoActionPerformed
        if (vCadastroFormaPagamento == null || !vCadastroFormaPagamento.isVisible()) 
        {
            vCadastroFormaPagamento = new frmCadastroFormaPagamento();
            
            desktopPane.add(vCadastroFormaPagamento);
            vCadastroFormaPagamento.setPosicao();
            vCadastroFormaPagamento.setVisible(true);
        }
    }//GEN-LAST:event_miCadastroFormaPagamentoActionPerformed

    private void miCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroFornecedorActionPerformed
        if (vCadastroFornecedor == null || !vCadastroFornecedor.isVisible()) 
        {
            vCadastroFornecedor = new frmCadastroFornecedor();
            
            desktopPane.add(vCadastroFornecedor);
            vCadastroFornecedor.AdaptarPosicao();
            vCadastroFornecedor.setVisible(true);
        }
    }//GEN-LAST:event_miCadastroFornecedorActionPerformed

    private void miConsultaRequisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaRequisicaoActionPerformed
        if (vConsultaRequisicao == null || !vConsultaRequisicao.isVisible()) 
        {
            vConsultaRequisicao = new frmConsultaRequisicao();
            
            desktopPane.add(vConsultaRequisicao);
            vConsultaRequisicao.setPosicao();
            vConsultaRequisicao.setVisible(true);
        }
    }//GEN-LAST:event_miConsultaRequisicaoActionPerformed

    private void miRequisicaoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRequisicaoPedidoActionPerformed
        if (vRequisicaoPedido == null || !vRequisicaoPedido.isVisible()) 
        {
            vRequisicaoPedido = new frmRequisicaoPedido();
            
            desktopPane.add(vRequisicaoPedido);
            vRequisicaoPedido.setPosicao();
            vRequisicaoPedido.setVisible(true);
        }
    }//GEN-LAST:event_miRequisicaoPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemDeMenuAjuda;
    private javax.swing.JMenuItem itemDeMenuCadastroUsuario;
    private javax.swing.JMenuItem itemDeMenuEstoqueItem;
    private javax.swing.JMenuItem itemDeMenuProduto;
    private javax.swing.JMenuItem itemDeMenuRelatorioEstoqueItem;
    private javax.swing.JMenuItem itemDeMenuRelatorioProduto;
    private javax.swing.JMenuItem itemDeMenuRelatorioUsuario;
    private javax.swing.JMenuItem itemDeMenuSair_Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jmCompra;
    private javax.swing.JLabel lHora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuServico;
    private javax.swing.JMenu menuSuprimento;
    private javax.swing.JMenu menuUsuario;
    public static javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem miCadastroFormaPagamento;
    private javax.swing.JMenuItem miCadastroFornecedor;
    private javax.swing.JMenuItem miConsultaRequisicao;
    private javax.swing.JMenuItem miRequisicaoPedido;
    private javax.swing.JMenuItem pedidoVenda_Vendas;
    private javax.swing.JMenuItem solicitacaoDeOrcamento_Servicos;
    // End of variables declaration//GEN-END:variables
    private GUIAjuda guiajuda;
    private GUIVendas guivendas;
    private GUIProduto guiProduto;
    private GUIUsuario guiUsuario;
    private GUIEstoqueItem guiEstoqueItem;
    private frmCadastroFormaPagamento vCadastroFormaPagamento;
    private frmCadastroFornecedor vCadastroFornecedor;
    private frmConsultaRequisicao vConsultaRequisicao;
    private frmRequisicaoPedido vRequisicaoPedido;
}
