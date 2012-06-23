package br.com.facdombosco.progc.app.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

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
        itemDeMenuCliente_Vendas = new javax.swing.JMenuItem();
        itemDeMenuTipoCliente_Vendas = new javax.swing.JMenuItem();
        itemDeMenuCategoriaVendedor_Vendas = new javax.swing.JMenuItem();
        itemDeMenuOrcamento_Vendas = new javax.swing.JMenuItem();
        itemDeMenuHistoricoCompras_Vendas = new javax.swing.JMenuItem();
        itemDeMenuTabelaDePreco_Vendas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemMenuRelatorio_Vendas = new javax.swing.JMenu();
        itemDeMenuRelatorioCliente_Vendas = new javax.swing.JMenuItem();
        itemDeMenuRelatorioTipoCliente_Vendas = new javax.swing.JMenuItem();
        itemDeMenuRelatorioCategoriaVendedor_Vendas = new javax.swing.JMenuItem();
        itemDeMenuRelatorioTabelaDePreco_Vendas = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemDeMenuSair_Vendas = new javax.swing.JMenuItem();
        menuServico = new javax.swing.JMenu();
        solicitacaoDeOrcamento_Servicos = new javax.swing.JMenuItem();
        ordemDeServico_Servicos = new javax.swing.JMenuItem();
        estatisicas_Servicos = new javax.swing.JMenuItem();
        relatoriosServicos_Servicos = new javax.swing.JMenuItem();
        menuSuprimento = new javax.swing.JMenu();
        itemDeMenuFornecedor = new javax.swing.JMenuItem();
        itemDeMenuProduto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        itemDeMenuCadastroUsuario = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemDeMenuAjuda = new javax.swing.JMenuItem();

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

        lHora.setFont(new java.awt.Font("Tahoma", 1, 18));
        lHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lHora.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desenvolvido pelo Grupo de Programação C - Faculdade Dom Bosco de Porto Alegre");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuVendas.setText("Vendas");

        itemDeMenuCliente_Vendas.setText("Cliente");
        itemDeMenuCliente_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuCliente_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuCliente_Vendas);

        itemDeMenuTipoCliente_Vendas.setText("Tipo Cliente");
        itemDeMenuTipoCliente_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuTipoCliente_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuTipoCliente_Vendas);

        itemDeMenuCategoriaVendedor_Vendas.setText("Categoria de Vendedor");
        itemDeMenuCategoriaVendedor_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuCategoriaVendedor_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuCategoriaVendedor_Vendas);

        itemDeMenuOrcamento_Vendas.setText("Orçamento");
        itemDeMenuOrcamento_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuOrcamento_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuOrcamento_Vendas);

        itemDeMenuHistoricoCompras_Vendas.setText("Histórico Compras");
        itemDeMenuHistoricoCompras_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuHistoricoCompras_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuHistoricoCompras_Vendas);

        itemDeMenuTabelaDePreco_Vendas.setText("Tabela de Preço");
        itemDeMenuTabelaDePreco_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuTabelaDePreco_VendasActionPerformed(evt);
            }
        });
        menuVendas.add(itemDeMenuTabelaDePreco_Vendas);
        menuVendas.add(jSeparator2);

        itemMenuRelatorio_Vendas.setText("Relatório");

        itemDeMenuRelatorioCliente_Vendas.setText("Cliente");
        itemDeMenuRelatorioCliente_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioCliente_VendasActionPerformed(evt);
            }
        });
        itemMenuRelatorio_Vendas.add(itemDeMenuRelatorioCliente_Vendas);

        itemDeMenuRelatorioTipoCliente_Vendas.setText("Tipo Cliente");
        itemDeMenuRelatorioTipoCliente_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioTipoCliente_VendasActionPerformed(evt);
            }
        });
        itemMenuRelatorio_Vendas.add(itemDeMenuRelatorioTipoCliente_Vendas);

        itemDeMenuRelatorioCategoriaVendedor_Vendas.setText("Categoria Vendedor");
        itemDeMenuRelatorioCategoriaVendedor_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioCategoriaVendedor_VendasActionPerformed(evt);
            }
        });
        itemMenuRelatorio_Vendas.add(itemDeMenuRelatorioCategoriaVendedor_Vendas);

        itemDeMenuRelatorioTabelaDePreco_Vendas.setText("Tabela de Preço");
        itemDeMenuRelatorioTabelaDePreco_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuRelatorioTabelaDePreco_VendasActionPerformed(evt);
            }
        });
        itemMenuRelatorio_Vendas.add(itemDeMenuRelatorioTabelaDePreco_Vendas);

        menuVendas.add(itemMenuRelatorio_Vendas);
        menuVendas.add(jSeparator3);

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

        ordemDeServico_Servicos.setText("Ordem de Serviço");
        ordemDeServico_Servicos.setActionCommand("OrdemDeServico");
        ordemDeServico_Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemDeServico_ServicosActionPerformed(evt);
            }
        });
        menuServico.add(ordemDeServico_Servicos);

        estatisicas_Servicos.setText("Estatísicas");
        estatisicas_Servicos.setActionCommand("Estatisicas");
        estatisicas_Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisicas_ServicosActionPerformed(evt);
            }
        });
        menuServico.add(estatisicas_Servicos);

        relatoriosServicos_Servicos.setText("Relatórios de Serviços");
        relatoriosServicos_Servicos.setActionCommand("RelatoriosServicos");
        relatoriosServicos_Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosServicos_ServicosActionPerformed(evt);
            }
        });
        menuServico.add(relatoriosServicos_Servicos);
        relatoriosServicos_Servicos.getAccessibleContext().setAccessibleParent(this);

        menuBar.add(menuServico);

        menuSuprimento.setText("Suprimentos");

        itemDeMenuFornecedor.setText("Fornecedor");
        itemDeMenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuFornecedorActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuFornecedor);

        itemDeMenuProduto.setText("Produto");
        itemDeMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuProdutoActionPerformed(evt);
            }
        });
        menuSuprimento.add(itemDeMenuProduto);

        jMenuItem1.setText("Solicitação de Compras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSuprimento.add(jMenuItem1);

        jMenuItem2.setText("Relatórios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSuprimento.add(jMenuItem2);

        menuBar.add(menuSuprimento);

        menuUsuario.setText("Usuário");

        itemDeMenuCadastroUsuario.setText("Cadastro");
        itemDeMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemDeMenuCadastroUsuario);

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

    public void configurarPermissoes() {
        menuVendas.setEnabled(true);
        menuServico.setEnabled(true);
        menuSuprimento.setEnabled(true);

        menuUsuario.setEnabled(true);
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
        
    }//GEN-LAST:event_itemDeMenuCadastroUsuarioActionPerformed

    private void itemDeMenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuFornecedorActionPerformed

    }//GEN-LAST:event_itemDeMenuFornecedorActionPerformed

    private void itemDeMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuProdutoActionPerformed

    }//GEN-LAST:event_itemDeMenuProdutoActionPerformed

    private void itemDeMenuTipoCliente_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuTipoCliente_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuTipoCliente_VendasActionPerformed

    private void itemDeMenuCategoriaVendedor_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuCategoriaVendedor_VendasActionPerformed
        
    }//GEN-LAST:event_itemDeMenuCategoriaVendedor_VendasActionPerformed

    private void solicitacaoDeOrcamento_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitacaoDeOrcamento_ServicosActionPerformed

    }//GEN-LAST:event_solicitacaoDeOrcamento_ServicosActionPerformed

    private void ordemDeServico_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemDeServico_ServicosActionPerformed

    }//GEN-LAST:event_ordemDeServico_ServicosActionPerformed

    private void estatisicas_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisicas_ServicosActionPerformed

    }//GEN-LAST:event_estatisicas_ServicosActionPerformed

    private void relatoriosServicos_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosServicos_ServicosActionPerformed

    }//GEN-LAST:event_relatoriosServicos_ServicosActionPerformed

    private void itemDeMenuSair_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuSair_VendasActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemDeMenuSair_VendasActionPerformed

    private void itemDeMenuOrcamento_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuOrcamento_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuOrcamento_VendasActionPerformed

    private void itemDeMenuTabelaDePreco_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuTabelaDePreco_VendasActionPerformed
        
    }//GEN-LAST:event_itemDeMenuTabelaDePreco_VendasActionPerformed

    private void itemDeMenuCliente_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuCliente_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuCliente_VendasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemDeMenuRelatorioCliente_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioCliente_VendasActionPerformed
        
    }//GEN-LAST:event_itemDeMenuRelatorioCliente_VendasActionPerformed

    private void itemDeMenuRelatorioTipoCliente_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioTipoCliente_VendasActionPerformed
        
    }//GEN-LAST:event_itemDeMenuRelatorioTipoCliente_VendasActionPerformed

    private void itemDeMenuRelatorioTabelaDePreco_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioTabelaDePreco_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuRelatorioTabelaDePreco_VendasActionPerformed

    private void itemDeMenuRelatorioCategoriaVendedor_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuRelatorioCategoriaVendedor_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuRelatorioCategoriaVendedor_VendasActionPerformed

    private void itemDeMenuHistoricoCompras_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuHistoricoCompras_VendasActionPerformed

    }//GEN-LAST:event_itemDeMenuHistoricoCompras_VendasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem estatisicas_Servicos;
    private javax.swing.JMenuItem itemDeMenuAjuda;
    private javax.swing.JMenuItem itemDeMenuCadastroUsuario;
    private javax.swing.JMenuItem itemDeMenuCategoriaVendedor_Vendas;
    private javax.swing.JMenuItem itemDeMenuCliente_Vendas;
    private javax.swing.JMenuItem itemDeMenuFornecedor;
    private javax.swing.JMenuItem itemDeMenuHistoricoCompras_Vendas;
    private javax.swing.JMenuItem itemDeMenuOrcamento_Vendas;
    private javax.swing.JMenuItem itemDeMenuProduto;
    private javax.swing.JMenuItem itemDeMenuRelatorioCategoriaVendedor_Vendas;
    private javax.swing.JMenuItem itemDeMenuRelatorioCliente_Vendas;
    private javax.swing.JMenuItem itemDeMenuRelatorioTabelaDePreco_Vendas;
    private javax.swing.JMenuItem itemDeMenuRelatorioTipoCliente_Vendas;
    private javax.swing.JMenuItem itemDeMenuSair_Vendas;
    private javax.swing.JMenuItem itemDeMenuTabelaDePreco_Vendas;
    private javax.swing.JMenuItem itemDeMenuTipoCliente_Vendas;
    private javax.swing.JMenu itemMenuRelatorio_Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lHora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuServico;
    private javax.swing.JMenu menuSuprimento;
    private javax.swing.JMenu menuUsuario;
    public static javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem ordemDeServico_Servicos;
    private javax.swing.JMenuItem relatoriosServicos_Servicos;
    private javax.swing.JMenuItem solicitacaoDeOrcamento_Servicos;
    // End of variables declaration//GEN-END:variables
    private GUIAjuda guiajuda;
}
