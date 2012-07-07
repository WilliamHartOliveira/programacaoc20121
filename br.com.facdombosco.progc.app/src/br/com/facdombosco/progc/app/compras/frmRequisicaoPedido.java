package br.com.facdombosco.progc.app.compras;

import java.awt.Dimension;

public class frmRequisicaoPedido extends javax.swing.JInternalFrame
{
    public frmRequisicaoPedido() 
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
        jpVisualizarRequisicao = new javax.swing.JPanel();
        txtRequisicao = new javax.swing.JComboBox();
        btVisualizar = new javax.swing.JButton();
        jpPedidoFinalizado = new javax.swing.JPanel();
        txtPedidoFinalizado = new javax.swing.JComboBox();
        btRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jpPrincipal.setName("jpPrincipal"); // NOI18N

        jpVisualizarRequisicao.setBackground(new java.awt.Color(0, 0, 0));
        jpVisualizarRequisicao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "VISUALIZAR REQUISIÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpVisualizarRequisicao.setName("jpVisualizarRequisicao"); // NOI18N

        txtRequisicao.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtRequisicao.setName("txtRequisicao"); // NOI18N

        btVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        btVisualizar.setForeground(new java.awt.Color(0, 0, 153));
        btVisualizar.setMnemonic('r');
        btVisualizar.setText("VISUALIZAR");
        btVisualizar.setName("btVisualizar"); // NOI18N

        javax.swing.GroupLayout jpVisualizarRequisicaoLayout = new javax.swing.GroupLayout(jpVisualizarRequisicao);
        jpVisualizarRequisicao.setLayout(jpVisualizarRequisicaoLayout);
        jpVisualizarRequisicaoLayout.setHorizontalGroup(
            jpVisualizarRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVisualizarRequisicaoLayout.createSequentialGroup()
                .addGroup(jpVisualizarRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVisualizarRequisicaoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVisualizarRequisicaoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btVisualizar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jpVisualizarRequisicaoLayout.setVerticalGroup(
            jpVisualizarRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVisualizarRequisicaoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btVisualizar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpPedidoFinalizado.setBackground(new java.awt.Color(0, 0, 0));
        jpPedidoFinalizado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "PEDIDO(S) FINALIZADO(S)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jpPedidoFinalizado.setFont(new java.awt.Font("Lucida Console", 1, 14));
        jpPedidoFinalizado.setName("jpPedidoFinalizado"); // NOI18N

        txtPedidoFinalizado.setFont(new java.awt.Font("Lucida Sans", 1, 14));
        txtPedidoFinalizado.setName("txtPedidoFinalizado"); // NOI18N

        btRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btRelatorio.setForeground(new java.awt.Color(0, 0, 153));
        btRelatorio.setMnemonic('r');
        btRelatorio.setText("RELATÓRIO");
        btRelatorio.setName("btRelatorio"); // NOI18N

        javax.swing.GroupLayout jpPedidoFinalizadoLayout = new javax.swing.GroupLayout(jpPedidoFinalizado);
        jpPedidoFinalizado.setLayout(jpPedidoFinalizadoLayout);
        jpPedidoFinalizadoLayout.setHorizontalGroup(
            jpPedidoFinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPedidoFinalizadoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtPedidoFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPedidoFinalizadoLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(btRelatorio)
                .addGap(195, 195, 195))
        );
        jpPedidoFinalizadoLayout.setVerticalGroup(
            jpPedidoFinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPedidoFinalizadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtPedidoFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btRelatorio)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPedidoFinalizado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpVisualizarRequisicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVisualizarRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpPedidoFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
                new frmRequisicaoPedido().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JPanel jpPedidoFinalizado;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpVisualizarRequisicao;
    private javax.swing.JComboBox txtPedidoFinalizado;
    private javax.swing.JComboBox txtRequisicao;
    // End of variables declaration//GEN-END:variables
}
