import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.FileWriter;

public class secretSanta {
    public static void main(String[]args) throws IOException {
        String [] names={"Itani","Monty","Ibrahim","Jawad","Michael","Mark","Andre"};
        List<String> strList = Arrays.asList(names);
        Collections.shuffle(strList);
        names = strList.toArray(new String[strList.size()]);
        FileWriter l;

        for(int i=0;i<names.length;i++) {
            if (i==strList.size()-1){
                l = new FileWriter(names[i]+".txt");
                int r=0;
                l.write(names[r]);
                l.close();
                break;
            }
            //names[i] gives to names[i++]
            //the last name gives to the first
            l = new FileWriter(names[i]+".txt");
            l.write(names[i+1]);
            l.close();
        }



    }
}
