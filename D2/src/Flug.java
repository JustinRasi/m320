import java.util.ArrayList;
import java.util.List;

public class Flug {
    List<Passagier> passagierList = new ArrayList<>();

    void passagierListeAusgeben(){
        for (int i = 0; i < passagierList.size(); i++) {
            System.out.println(passagierList.get(i));
        }
    }
}
