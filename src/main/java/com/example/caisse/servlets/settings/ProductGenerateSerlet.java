package com.example.caisse.servlets.settings;

import com.example.caisse.dao.impl.ProduitsDao;
import com.example.caisse.entities.Gestionnaire;
import com.example.caisse.entities.Produits;
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

@WebServlet(name = "ProductGenerateSerlet", value = "/ProductGenerateSerlet")
public class ProductGenerateSerlet extends HttpServlet {
    private final ProduitsDao produitDao = new ProduitsDao();
    private Font getFont(String header) {
        switch(header){
            case "Header":
                Font font= FontFactory.getFont(FontFactory.HELVETICA_BOLDOBLIQUE,18, BaseColor.BLACK);
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
        Stream.of("Code Produit","Libelle","Prix","Quantite").forEach(columnTitle -> {
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

    private void addRow(PdfPTable table, Produits produits) {
        table.addCell(produits.getCodeproduct());
        table.addCell(produits.getLibelle());
        table.addCell(String.valueOf(produits.getPrice()));
        table.addCell(String.valueOf(produits.getQuantity()));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Produits> p = produitDao.findAll();
        Date date = new Date();
        long time = date.getTime();
        String UUID = "Caisse-Pro-"+time+"AllProduct";
        String path= "C:\\Users\\13476\\Desktop\\projetJavaEE";
        String content ="Caisse-Pro\n\n";
        String title ="Liste des Produits\n\n\n";
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
            Paragraph dateDoc = new Paragraph(p+"\n \n",getFont("data"));
            dateDoc.add(dateDoc);
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            addTableHeader(table);
            for (Produits produits : p) {
                addRow(table, produits);
            }
            document.add(table);
            Paragraph footer = new Paragraph("\n\nTotal : "+p.size()+"\n \n"+"Caisse-Pro :",getFont("data"));
            document.add(footer);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("HomeUserServlet");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}