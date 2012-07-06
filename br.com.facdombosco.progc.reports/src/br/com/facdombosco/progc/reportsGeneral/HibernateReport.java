package br.com.facdombosco.progc.reportsGeneral;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

public class HibernateReport {
    
    public static void abrirReport() throws JRException {
        JasperReport report = JasperCompileManager.compileReport(
                    "C:/Documents and Settings/dsv.php/Desktop/programacaoc20121/trunk/br.com.facdombosco.progc.reports/ReportsSuprimentos/relatorioUsuarios.jrxml");
    }

    public static void abrirReport(String nomeArquivo, List listObjetos, Map parametros) throws JRException {

        /*JasperViewer ver = null;
        JasperPrint jasper = null;

        JRBeanCollectionDataSource jrRS = new JRBeanCollectionDataSource(listObjetos);
        jasper = JasperFillManager.fillReport(nomeArquivo, parametros, jrRS);

        JasperViewer ver = null;
        ver = new JasperViewer(jasper,false);
        ver.setTitle("Relatório");
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.setFocusable(true);
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.setVisible(true);
        ver.setExtendedState(ver.MAXIMIZED_BOTH);
        ver.requestFocus();
        ver.setAlwaysOnTop(true);*/
        try {
            //JasperReport report = JasperCompileManager.compileReport(nomeArquivo);
            
            JasperReport report = JasperCompileManager.compileReport("C:/Documents and Settings/dsv.php/Desktop/programacaoc20121/trunk/br.com.facdombosco.progc.reports/ReportsSuprimentos/relatorioUsuarios.jrxml");
                                    
            JasperPrint print = JasperFillManager.fillReport(report, null,
                                new JRBeanCollectionDataSource(listObjetos));
            JasperExportManager.exportReportToPdfFile(print, nomeArquivo);
            JasperExportManager.exportReportToHtmlFile(print, nomeArquivo);
            JRXlsExporter exporterXLS = new JRXlsExporter();
            exporterXLS.setParameter(JRXlsExporterParameter.JASPER_PRINT, print);
            
            exporterXLS.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, new FileOutputStream(new File(nomeArquivo)));
            exporterXLS.exportReport();
            
            JasperViewer ver = null;
            ver = new JasperViewer(print, false);
            ver.setTitle("Relatório");
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setFocusable(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.setVisible(true);
            ver.setExtendedState(ver.MAXIMIZED_BOTH);
            ver.requestFocus();
            ver.setAlwaysOnTop(true);
        } 
        catch (Exception ex) {
            Logger.getLogger(HibernateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void abrirReport(String nomeArquivo, List listObjetos) throws JRException {

        HibernateReport.abrirReport(nomeArquivo, listObjetos, new HashMap());
    }
}
