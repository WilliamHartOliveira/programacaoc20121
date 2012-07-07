package br.com.facdombosco.progc.app.compras;

import br.com.facdombosco.progc.dvo.compras.FormaPagamento;
import br.com.facdombosco.progc.framework.controls.FixedLengthDocument;
import br.com.facdombosco.progc.framework.utils.StringUtils;
import br.com.facdombosco.progc.service.compras.FormaPagamentoService;
import br.com.facdombosco.progc.framework.utils.MessageHelper;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;

public class frmCadastroFormaPagamento extends javax.swing.JInternalFrame
{
    public frmCadastroFormaPagamento() 
    {
        initComponents();
        LimitarTexto();
        this.btExcluir.setEnabled(false);
    }

    public void AdaptarPosicao()
    {
        Dimension vDimensao = this.getDesktopPane().getSize();
        
        this.setLocation(((vDimensao.width - this.getSize().width) / 2), ((vDimensao.height - this.getSize().height) / 2));
     }
    
    private void LimitarTexto()
    {
         txtNome.setDocument(new FixedLengthDocument(30));
         txtQuantidadeDiaParcela.setDocument(new FixedLengthDocument(10));
         txtQuantidadeParcela.setDocument(new FixedLengthDocument(10));
    }
    
    private void LimparTexto()
    {
        txtCodigo.setText("");
        txtNome.setText("");
        txtQuantidadeDiaParcela.setText("");
        txtQuantidadeParcela.setText("");
    }
    
    private Dictionary<String, Object> PesquisarDicionario() 
    {
        Dictionary<String, Object> vPropriedade = new Hashtable<String, Object>();

        if (!this.txtCodigo.getText().equals(""))
            vPropriedade.put("idFormaPagamento", Integer.parseInt(this.txtCodigo.getText()));

        if (!this.txtNome.getText().equals(""))
            vPropriedade.put("nome", this.txtNome.getText());

        if (!this.txtQuantidadeDiaParcela.getText().equals(""))
            vPropriedade.put("quantidadeDiasParcela", this.txtQuantidadeDiaParcela.getText());
        
        if (!this.txtQuantidadeParcela.getText().equals(""))
            vPropriedade.put("quantidadeParcelas", this.txtQuantidadeParcela.getText());

        return vPropriedade;
    }
    
    private FormaPagamento PersistenciarObjeto() 
    {
        FormaPagamento vFormaPagamento = new FormaPagamento();
        
        vFormaPagamento.setNome(this.txtNome.getText());
        vFormaPagamento.setQuantidadeDiasParcela(Integer.parseInt(this.txtQuantidadeDiaParcela.getText()));
        vFormaPagamento.setQuantidadeParcelas(Integer.parseInt(this.txtQuantidadeParcela.getText()));

        return vFormaPagamento;
    }
    
    private void CarregarFormulario(FormaPagamento vFormaPagamento) 
    {
        this.txtCodigo.setText(String.valueOf(vFormaPagamento.getIdFormaPagamento()));
        this.txtNome.setText(String.valueOf(vFormaPagamento.getNome()));
        this.txtQuantidadeDiaParcela.setText(String.valueOf(vFormaPagamento.getQuantidadeDiasParcela()));
        this.txtQuantidadeParcela.setText(String.valueOf(vFormaPagamento.getQuantidadeParcelas()));
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
        btExcluir = new javax.swing.JButton();
        lblQuantidadeDiaParcela = new javax.swing.JLabel();
        txtQuantidadeDiaParcela = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        tbCadastroFormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCadastroFormaPagamentoMouseClicked(evt);
            }
        });
        spCadastroFormaPagamento.setViewportView(tbCadastroFormaPagamento);

        javax.swing.GroupLayout jpCadastroFormaPagamentoLayout = new javax.swing.GroupLayout(jpCadastroFormaPagamento);
        jpCadastroFormaPagamento.setLayout(jpCadastroFormaPagamentoLayout);
        jpCadastroFormaPagamentoLayout.setHorizontalGroup(
            jpCadastroFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCadastroFormaPagamentoLayout.setVerticalGroup(
            jpCadastroFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpIncluirFormaPagamento.setBackground(new java.awt.Color(0, 0, 0));
        jpIncluirFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INCLUIR FORMA DE PAGAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpIncluirFormaPagamento.setName("jpIncluirFormaPagamento"); // NOI18N

        lblNome.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblNome.setForeground(new java.awt.Color(0, 0, 153));
        lblNome.setText("Nome");
        lblNome.setName("lblNome"); // NOI18N

        txtNome.setFont(new java.awt.Font("Lucida Sans", 1, 14));
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
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setForeground(new java.awt.Color(0, 0, 153));
        btExcluir.setMnemonic('e');
        btExcluir.setText("EXCLUIR");
        btExcluir.setName("btExcluir"); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblQuantidadeDiaParcela.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblQuantidadeDiaParcela.setForeground(new java.awt.Color(0, 0, 153));
        lblQuantidadeDiaParcela.setText("Quantidade de dias p/ parcela");
        lblQuantidadeDiaParcela.setName("lblQuantidadeDiaParcela"); // NOI18N

        txtQuantidadeDiaParcela.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtQuantidadeDiaParcela.setName("txtQuantidadeDiaParcela"); // NOI18N

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setForeground(new java.awt.Color(0, 0, 153));
        btLimpar.setMnemonic('l');
        btLimpar.setText("LIMPAR");
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btListar.setBackground(new java.awt.Color(255, 255, 255));
        btListar.setForeground(new java.awt.Color(0, 0, 153));
        btListar.setMnemonic('r');
        btListar.setText("LISTAR");
        btListar.setName("btListar"); // NOI18N
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtCodigo.setName("txtCodigo"); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblCodigo.setForeground(new java.awt.Color(0, 0, 153));
        lblCodigo.setText("Código");
        lblCodigo.setName("lblCodigo"); // NOI18N

        btFechar.setBackground(new java.awt.Color(255, 255, 255));
        btFechar.setForeground(new java.awt.Color(0, 0, 153));
        btFechar.setMnemonic('f');
        btFechar.setText("FECHAR");
        btFechar.setName("btFechar"); // NOI18N
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIncluirFormaPagamentoLayout = new javax.swing.GroupLayout(jpIncluirFormaPagamento);
        jpIncluirFormaPagamento.setLayout(jpIncluirFormaPagamentoLayout);
        jpIncluirFormaPagamentoLayout.setHorizontalGroup(
            jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIncluirFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                        .addComponent(lblQuantidadeParcela)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantidadeParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpIncluirFormaPagamentoLayout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addGap(18, 18, 18)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIncluirFormaPagamentoLayout.createSequentialGroup()
                            .addComponent(btSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIncluirFormaPagamentoLayout.createSequentialGroup()
                            .addComponent(lblQuantidadeDiaParcela)
                            .addGap(18, 18, 18)
                            .addComponent(txtQuantidadeDiaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
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
                .addGap(18, 18, 18)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeParcela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jpIncluirFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btListar))
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

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        LimparTexto();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        FormaPagamentoService vServicoFornecedor = new FormaPagamentoService();
        List<FormaPagamento> vFormaPagamento = vServicoFornecedor.findAll(this.PesquisarDicionario());
        FormaPagamentoTableModel vTabelaModeloFormaPagamento = new FormaPagamentoTableModel(vFormaPagamento);

        this.tbCadastroFormaPagamento.setModel(vTabelaModeloFormaPagamento);
    }//GEN-LAST:event_btListarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try 
        {
            FormaPagamentoService vServicoFormaPagamento = new FormaPagamentoService();
            
            vServicoFormaPagamento.save(this.PersistenciarObjeto());
            this.btLimparActionPerformed(evt);
            
            JOptionPane.showMessageDialog(null, "Forma de pagamento salva com sucesso.", "Forma de pagamento ", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception vExcecao) 
        {
            JOptionPane.showMessageDialog(this, vExcecao.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try 
        {
            if (JOptionPane.showConfirmDialog(this, "Você deseja excluir " + txtNome.getText() + "?", "Forma de pagamento", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0)
            {
                new FormaPagamentoService().delete(this.PersistenciarObjeto());
                
                this.btLimparActionPerformed(evt);
                this.btExcluir.setEnabled(false);
            }
        } 
        catch (Exception ex) 
        {
            MessageHelper.showError(ex.getMessage());
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tbCadastroFormaPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadastroFormaPagamentoMouseClicked
        if (this.tbCadastroFormaPagamento.getSelectedRow() != -1) 
        {
            this.LimparTexto();
            
            FormaPagamentoTableModel vTabelaModeloFormaPagamento = (FormaPagamentoTableModel)this.tbCadastroFormaPagamento.getModel();
            
            this.CarregarFormulario(vTabelaModeloFormaPagamento.getFormaPagamento().get(this.tbCadastroFormaPagamento.getSelectedRow()));
            this.btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tbCadastroFormaPagamentoMouseClicked

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btFecharActionPerformed

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
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jpCadastroFormaPagamento;
    private javax.swing.JPanel jpIncluirFormaPagamento;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidadeDiaParcela;
    private javax.swing.JLabel lblQuantidadeParcela;
    private javax.swing.JScrollPane spCadastroFormaPagamento;
    private javax.swing.JTable tbCadastroFormaPagamento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidadeDiaParcela;
    private javax.swing.JTextField txtQuantidadeParcela;
    // End of variables declaration//GEN-END:variables

}
