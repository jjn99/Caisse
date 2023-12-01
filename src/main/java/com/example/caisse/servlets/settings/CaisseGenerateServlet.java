package com.example.caisse.servlets.settings;

import com.example.caisse.dao.impl.CaisseDao;
import com.example.caisse.entities.Caisse;
import com.example.caisse.entities.DepenseReaprovisionnement;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@WebServlet(name = "CaisseGenerateServlet", value = "/CaisseGenerateServlet")
public class CaisseGenerateServlet extends HttpServlet {
    private final CaisseDao caisseDao = new CaisseDao();

    private void setRectangleInPdf(Document document) throws DocumentException {
        Rectangle rect = new Rectangle(100, 100, 100, 100);
        rect.enableBorderSide(1);
        rect.enableBorderSide(2);
        rect.enableBorderSide(4);
        rect.enableBorderSide(8);
        rect.setBorderColor(BaseColor.BLACK);
        rect.setBorder(1);
        document.add(rect);
    }

    private Font getFont(String header) {
        switch(header){
            case "Header":
                Font font= FontFactory.getFont(FontFactory.HELVETICA_BOLDOBLIQUE,18,BaseColor.BLACK);
                font.setStyle(Font.BOLD);
                return font;
            case "data":
                Font dataFont = FontFactory.getFont(FontFactory.TIMES_ROMAN,11,BaseColor.BLACK);
                dataFont.setStyle(Font.BOLD);
                return dataFont;
            default:
                return new Font();

        }
    }

    private void addTableHeader(PdfPTable table) {
        Stream.of("Libelle","Statut","Montant").forEach(columnTitle -> {
            PdfPCell header = new PdfPCell();
            header.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header.setBorderWidth(2);
            header.setPhrase(new Phrase(columnTitle));
            header.setBackgroundColor(BaseColor.LIGHT_GRAY);
            header.setHorizontalAlignment(Element.ALIGN_CENTER);
            header.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(header);
        });
    }

    private void addRow(PdfPTable table, Caisse caisse) {
        table.addCell(caisse.getLibelle());
        table.addCell(String.valueOf(caisse.isActif()));
        table.addCell(String.valueOf(caisse.getMontants()));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Caisse> c = caisseDao.findAll();
        Date date = new Date();
        long time = date.getTime();
        String UUID = "Caisse-Pro-"+time+"AllCaisse";
        String path= "C:\\Users\\13476\\Desktop\\projetJavaEE";
        String content ="Caisse-Pro\n\n";
        String title ="Liste des Caisse\n\n\n";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,new FileOutputStream(path+"\\"+UUID+".pdf"));
            document.open();
            setRectangleInPdf(document);
            Paragraph doc = new Paragraph(content,getFont("Header"));
            doc.setAlignment(Element.ALIGN_CENTER);
            document.add(doc);
            Paragraph titleDoc = new Paragraph(title,getFont("Data"));
            document.add(titleDoc);
            Paragraph dateDoc = new Paragraph(c+"\n \n",getFont("data"));
            dateDoc.add(dateDoc);
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            addTableHeader(table);
            for (Caisse caisse : c) {
                addRow(table, caisse);
            }
            document.add(table);
            Paragraph footer = new Paragraph("\n\nTotal : "+c.size()+"\n \n"+"Caisse-Pro :",getFont("data"));
            document.add(footer);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("HomeCaisseServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}