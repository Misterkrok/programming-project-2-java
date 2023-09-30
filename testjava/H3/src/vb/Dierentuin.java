package vb;

import java.util.ArrayList;

public class Dierentuin {

    private ArrayList<Dier> lijst = new ArrayList<>();

    public void voegtoe(Dier d)
    {
        lijst.add(d);
    }

    public static void main(String[] args) {
        Dierentuin dt = new Dierentuin();
        Locatie l1 = new Locatie("a1","heel mooi")
        dt.voegtoe(new Dier("bowser" , 4,l1));
        dt.voegtoe(new Dier("bowser jr" , 1,l1));
        dt.voegtoe(new Dier("kermit" , 60,l1));
        dt.voegtoe(new Dier("Simba" , 10, new Locatie("ta mere", "ton pere")));
        System.out.println(dt.lijst.get(1).getNaam());

       /* l1.setBeschrijving("niet meer mooi");
        for (int i = 0 ; i<dt.lijst.size();i++){

            if (dt.lijst.get(i).getLocatie() == "A1")
            }*/
        }
    }
}
