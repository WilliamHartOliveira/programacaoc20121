/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facdombosco.progc.reportsGeneral;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Anderson
 */
public class ReportGeneral {

    public void ExecutarReport(String fileName, String query) throws JRException, SQLException, ClassNotFoundException{

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        Class.forName(conexaoBanco.getDriver());
        Connection con = DriverManager.getConnection(conexaoBanco.getUrl(), conexaoBanco.getLogin(), conexaoBanco.getPwd());
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        Map parametros = new HashMap();

        JasperViewer ver = null;
        JasperPrint jasper = null;

        try {
            jasper = JasperFillManager.fillReport(fileName, parametros, jrRS);

            ver = new JasperViewer(jasper,false);
            ver.setTitle("Sistema integrado de Gestão - Loja de Informática PICAREDATA");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
}
