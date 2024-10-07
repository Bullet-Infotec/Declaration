import java.io.*;

public class DocumentGenerator {
    
    public void generateDocument(String templatePath, String outputPath, Map<String, String> placeholders) {
        try (FileInputStream fis = new FileInputStream(templatePath);
             XWPFDocument doc = new XWPFDocument();
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            for (XWPFParagraph paragraph : doc.getParagraphs()) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.getText(0);
                    for (Map.Entry<String, String> entry : placeholders.entrySet()) {
                        text = text.replace(entry.getKey(), entry.getValue());
                    }
                    run.setText(text, 0);
                }
            }
            doc.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
