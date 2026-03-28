package problem_4.Export;
class CSVExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting data in CSV: " + data);
    }
}

class PDFExporter implements DataExporter {
    public void export(String data) {
        System.out.println("Exporting data in PDF: " + data);
    }
}