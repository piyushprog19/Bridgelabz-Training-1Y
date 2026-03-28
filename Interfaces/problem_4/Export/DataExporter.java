package problem_4.Export;
interface DataExporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data in JSON: {" + data + "}");
    }
}