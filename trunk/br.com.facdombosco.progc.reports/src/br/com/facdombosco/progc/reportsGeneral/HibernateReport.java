/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facdombosco.progc.reportsGeneral;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Marcelo
 */
public class HibernateReport {

    public static void abrirReport(String nomeArquivo, List listObjetos, Map parametros) throws JRException {

        JasperViewer ver = null;
        JasperPrint jasper = null;

        JRBeanCollectionDataSource jrRS = new JRBeanCollectionDataSource(listObjetos);
        jasper = JasperFillManager.fillReport(nomeArquivo, parametros, jrRS);

        ver = new JasperViewer(jasper,false);
        ver.setTitle("Sistema integrado de Gestão - Loja de Informática PICAREDATA");
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.setFocusable(true);
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.setVisible(true);
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.requestFocus();
        ver.setAlwaysOnTop(true);
    }

    public static void abrirReport(String nomeArquivo, List listObjetos) throws JRException {

        HibernateReport.abrirReport(nomeArquivo, listObjetos, new HashMap());
    }
}
