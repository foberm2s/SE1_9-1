public class TestClient {

    public static void main(String[] args) {
        ComplexDocument doc = new ComplexDocument();
        ComplexDocument doc3 = new ComplexDocument();
        Document doc2 = new TextDocument("test123", Encoding.UTF8);
        Document doc5 = new TextDocument("test123", Encoding.UTF16);
        Document doc4 = new GraficDocument("jadadadada");
        doc.add(doc2);
        doc.add(doc3);
        doc3.add(doc5);
        doc3.add(doc4); 
        System.out.println(doc.size());
    }
}
