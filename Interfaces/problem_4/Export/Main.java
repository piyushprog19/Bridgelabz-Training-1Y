package problem_4.Export;
public class Main {
    public static void main(String[] args) {
        DataExporter d1 = new CSVExporter();
        DataExporter d2 = new PDFExporter();

        d1.export("name,age");
        d1.exportToJSON("name:John,age:25");

        d2.export("Report Data");
        d2.exportToJSON("title:Report");
    }
}