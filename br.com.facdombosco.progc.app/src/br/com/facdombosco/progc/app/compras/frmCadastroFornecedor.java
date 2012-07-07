package br.com.facdombosco.progc.app.compras;

import br.com.facdombosco.progc.framework.controls.FixedLengthDocument;
import br.com.facdombosco.progc.framework.utils.MessageHelper;
import java.awt.Dimension;
import br.com.facdombosco.progc.service.compras.FornecedorService;
import br.com.facdombosco.progc.dvo.compras.Fornecedor;
import br.com.facdombosco.progc.framework.utils.StringUtils;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;

public class frmCadastroFornecedor extends javax.swing.JInternalFrame
{
    public frmCadastroFornecedor() 
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
         txtCnpj.setDocument(new FixedLengthDocument(13));
         txtCidade.setDocument(new FixedLengthDocument(30));
         txtEmail.setDocument(new FixedLengthDocument(30));
    }
    
    private void LimparTexto()
    {
        txtCodigo.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }
    
    private Dictionary<String, Object> PesquisarDicionario() 
    {
        Dictionary<String, Object> vPropriedade = new Hashtable<String, Object>();

        if (!this.txtCodigo.getText().equals(""))
            vPropriedade.put("idFornecedor", Integer.parseInt(this.txtCodigo.getText()));

        if (!this.txtNome.getText().equals(""))
            vPropriedade.put("nome", this.txtNome.getText());

        if (!this.txtCnpj.getText().equals(""))
            vPropriedade.put("cnpj", this.txtCnpj.getText());

        return vPropriedade;
    }
    
    private Fornecedor PersistenciarObjeto() 
    {
        Fornecedor vFornecedor = new Fornecedor();
        
        vFornecedor.setNome(this.txtNome.getText());
        vFornecedor.setCnpj(this.txtCnpj.getText());
        vFornecedor.setCidade(this.txtCidade.getText());
        vFornecedor.setTelefone(this.txtTelefone.getText());
        vFornecedor.setEmail(this.txtEmail.getText());
        
        return vFornecedor;
    }
    
    private void CarregarFormulario(Fornecedor vFornecedor) 
    {
        this.txtCodigo.setText(String.valueOf(vFornecedor.getIdFornecedor()));
        this.txtNome.setText(String.valueOf(vFornecedor.getNome()));
        this.txtCnpj.setText(String.valueOf(vFornecedor.getCnpj()));
        this.txtCidade.setText(String.valueOf(vFornecedor.getCidade()));
        this.txtTelefone.setText(String.valueOf(vFornecedor.getTelefone()));
        this.txtEmail.setText(String.valueOf(vFornecedor.getEmail()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCadastroFornecedor = new javax.swing.JPanel();
        jpIncluirFornecedor = new javax.swing.JPanel();
        btListar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txtEmail = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        jpFornecedorCadastrado = new javax.swing.JPanel();
        spCadastroFornecedor = new javax.swing.JScrollPane();
        tbCadastroFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE FORNECEDORES");

        jpCadastroFornecedor.setBackground(new java.awt.Color(0, 0, 0));
        jpCadastroFornecedor.setName("jpCadastroFornecedor"); // NOI18N

        jpIncluirFornecedor.setBackground(new java.awt.Color(0, 0, 0));
        jpIncluirFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INCLUIR FORNECEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpIncluirFornecedor.setForeground(new java.awt.Color(0, 0, 153));
        jpIncluirFornecedor.setName("jpIncluirFornecedor"); // NOI18N

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

        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtEmail.setName("txtEmail"); // NOI18N

        lblEmail.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblEmail.setForeground(new java.awt.Color(0, 0, 153));
        lblEmail.setText("E-mail");
        lblEmail.setName("lblEmail"); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblTelefone.setForeground(new java.awt.Color(0, 0, 153));
        lblTelefone.setText("Telefone");
        lblTelefone.setName("lblTelefone"); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtTelefone.setName("txtTelefone"); // NOI18N

        lblCidade.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblCidade.setForeground(new java.awt.Color(0, 0, 153));
        lblCidade.setText("Cidade");
        lblCidade.setName("lblCidade"); // NOI18N

        txtCidade.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtCidade.setName("txtCidade"); // NOI18N

        lblCnpj.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblCnpj.setForeground(new java.awt.Color(0, 0, 153));
        lblCnpj.setText("CNPJ");
        lblCnpj.setName("lblCnpj"); // NOI18N

        txtCnpj.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtCnpj.setName("txtCnpj"); // NOI18N

        txtNome.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtNome.setName("txtNome"); // NOI18N

        lblNome.setFont(new java.awt.Font("Lucida Console", 1, 14));
        lblNome.setForeground(new java.awt.Color(0, 0, 153));
        lblNome.setText("Nome");
        lblNome.setName("lblNome"); // NOI18N

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

        javax.swing.GroupLayout jpIncluirFornecedorLayout = new javax.swing.GroupLayout(jpIncluirFornecedor);
        jpIncluirFornecedor.setLayout(jpIncluirFornecedorLayout);
        jpIncluirFornecedorLayout.setHorizontalGroup(
            jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIncluirFornecedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpIncluirFornecedorLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addGap(1, 1, 1))
                    .addComponent(lblEmail)
                    .addComponent(lblCidade)
                    .addComponent(lblCnpj)
                    .addComponent(lblNome)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpIncluirFornecedorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jpIncluirFornecedorLayout.setVerticalGroup(
            jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIncluirFornecedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(34, 34, 34)
                .addGroup(jpIncluirFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jpIncluirFornecedorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCidade, txtCnpj, txtEmail, txtNome, txtTelefone});

        jpFornecedorCadastrado.setBackground(new java.awt.Color(0, 0, 0));
        jpFornecedorCadastrado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "FORNECEDOR(ES) CADASTRADO(S)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpFornecedorCadastrado.setName("jpFornecedorCadastrado"); // NOI18N

        spCadastroFornecedor.setName("spCadastroFornecedor"); // NOI18N

        tbCadastroFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCadastroFornecedor.setName("tbCadastroFornecedor"); // NOI18N
        tbCadastroFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCadastroFornecedorMouseClicked(evt);
            }
        });
        spCadastroFornecedor.setViewportView(tbCadastroFornecedor);

        javax.swing.GroupLayout jpFornecedorCadastradoLayout = new javax.swing.GroupLayout(jpFornecedorCadastrado);
        jpFornecedorCadastrado.setLayout(jpFornecedorCadastradoLayout);
        jpFornecedorCadastradoLayout.setHorizontalGroup(
            jpFornecedorCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFornecedorCadastradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFornecedorCadastradoLayout.setVerticalGroup(
            jpFornecedorCadastradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFornecedorCadastradoLayout.createSequentialGroup()
                .addComponent(spCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpCadastroFornecedorLayout = new javax.swing.GroupLayout(jpCadastroFornecedor);
        jpCadastroFornecedor.setLayout(jpCadastroFornecedorLayout);
        jpCadastroFornecedorLayout.setHorizontalGroup(
            jpCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFornecedorCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpIncluirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpCadastroFornecedorLayout.setVerticalGroup(
            jpCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFornecedorCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpIncluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        LimparTexto();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        FornecedorService vServicoFornecedor = new FornecedorService();
        List<Fornecedor> vListaFornecedor = vServicoFornecedor.findAll(this.PesquisarDicionario());
        FornecedorTableModel vTabelaModeloFornecedor = new FornecedorTableModel(vListaFornecedor);

        this.tbCadastroFornecedor.setModel(vTabelaModeloFornecedor);
    }//GEN-LAST:event_btListarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try 
        {
            FornecedorService vServicoFornecedor = new FornecedorService();
            
            vServicoFornecedor.save(this.PersistenciarObjeto());
            this.btLimparActionPerformed(evt);
            
            JOptionPane.showMessageDialog(null, "Fornecedor salvo com sucesso.", "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception vExcecao) 
        {
            JOptionPane.showMessageDialog(this, vExcecao.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try 
        {
            if (JOptionPane.showConfirmDialog(this, "Você deseja excluir " + txtNome.getText() + "?", "Fornecedor", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0)
            {
                new FornecedorService().delete(this.PersistenciarObjeto());
                
                this.btLimparActionPerformed(evt);
                this.btExcluir.setEnabled(false);
            }
        } 
        catch (Exception ex) 
        {
            MessageHelper.showError(ex.getMessage());
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tbCadastroFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadastroFornecedorMouseClicked
        if (this.tbCadastroFornecedor.getSelectedRow() != -1) 
        {
            this.LimparTexto();
            
            FornecedorTableModel vTabelaModeloFornecedor = (FornecedorTableModel)this.tbCadastroFornecedor.getModel();
            
            this.CarregarFormulario(vTabelaModeloFornecedor.getFornecedores().get(this.tbCadastroFornecedor.getSelectedRow()));
            this.btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tbCadastroFornecedorMouseClicked

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroFornecedor().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jpCadastroFornecedor;
    private javax.swing.JPanel jpFornecedorCadastrado;
    private javax.swing.JPanel jpIncluirFornecedor;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane spCadastroFornecedor;
    private javax.swing.JTable tbCadastroFornecedor;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
