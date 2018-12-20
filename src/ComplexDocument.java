import java.util.ArrayList;
import java.util.List;
public class ComplexDocument extends IdDocument{
    private List<Document> list = new ArrayList<Document>();

    public int size(){
        int res = 0;
        for(Document d: list){
            res += d.size();
        }
        return res;
    }
    public void add(Document d){
        list.add(d);
        System.out.println("Erfolgreich hinzugefuegt");
    }
    public void rmv(Document d){
        try{
            list.remove(d);
            System.out.println("Erfolgreich geloescht");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
