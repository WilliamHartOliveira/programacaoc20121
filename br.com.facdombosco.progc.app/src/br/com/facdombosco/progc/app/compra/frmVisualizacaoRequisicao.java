/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmVisualizacaoRequisicao.java
 *
 * Created on 30/06/2012, 10:11:33
 */

package br.com.facdombosco.progc.app.compra;

/**
 *
 * @author 9213052
 */
public class frmVisualizacaoRequisicao extends javax.swing.JFrame {

    /** Creates new form frmVisualizacaoRequisicao */
    public frmVisualizacaoRequisicao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpVisualizacaoRequisicao = new javax.swing.JPanel();
        spVisualizacaoRequisicao = new javax.swing.JScrollPane();
        tbVisualizacaoRequisicao = new javax.swing.JTable();
        btFinalizar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VISUALIZA��O DE REQUISI��O");

        jpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jpPrincipal.setName("jpPrincipal"); // NOI18N

        jpVisualizacaoRequisicao.setBackground(new java.awt.Color(0, 0, 0));
        jpVisualizacaoRequisicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jpVisualizacaoRequisicao.setName("jpVisualizacaoRequisicao"); // NOI18N

        spVisualizacaoRequisicao.setName("spVisualizacaoRequisicao"); // NOI18N

        tbVisualizacaoRequisicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbVisualizacaoRequisicao.setName("tbVisualizacaoRequisicao"); // NOI18N
        spVisualizacaoRequisicao.setViewportView(tbVisualizacaoRequisicao);

        btFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        btFinalizar.setForeground(new java.awt.Color(0, 0, 153));
        btFinalizar.setMnemonic('f');
        btFinalizar.setText("FINALIZAR");
        btFinalizar.setName("btFinalizar"); // NOI18N

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setForeground(new java.awt.Color(0, 0, 153));
        btSair.setMnemonic('r');
        btSair.setText("SAIR");
        btSair.setName("btSair"); // NOI18N

        javax.swing.GroupLayout jpVisualizacaoRequisicaoLayout = new javax.swing.GroupLayout(jpVisualizacaoRequisicao);
        jpVisualizacaoRequisicao.setLayout(jpVisualizacaoRequisicaoLayout);
        jpVisualizacaoRequisicaoLayout.setHorizontalGroup(
            jpVisualizacaoRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVisualizacaoRequisicaoLayout.createSequentialGroup()
                .addGroup(jpVisualizacaoRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVisualizacaoRequisicaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spVisualizacaoRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                    .addGroup(jpVisualizacaoRequisicaoLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpVisualizacaoRequisicaoLayout.setVerticalGroup(
            jpVisualizacaoRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVisualizacaoRequisicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spVisualizacaoRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpVisualizacaoRequisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVisualizacaoRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVisualizacaoRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVisualizacaoRequisicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpVisualizacaoRequisicao;
    private javax.swing.JScrollPane spVisualizacaoRequisicao;
    private javax.swing.JTable tbVisualizacaoRequisicao;
    // End of variables declaration//GEN-END:variables

}