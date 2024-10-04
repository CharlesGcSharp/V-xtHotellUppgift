package VaxtPackage;

import javax.swing.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {


//


        Cactus igge = new Cactus("Igge", 0.2f);

        Palm laura = new Palm("Laura", 5f);

        Meateater meatloaf = new Meateater("Meatloaf", 0.7f);

        Palm olof = new Palm("Olof", 1f);



        ArrayList<Vaxt> vaxter = new ArrayList<>();

        vaxter.add(igge);
        vaxter.add(laura);
        vaxter.add(meatloaf);
        vaxter.add(olof);

       while (true)
       {



           try
           {


               String vaxt = JOptionPane.showInputDialog("Vilken växt ska få vätska? Tryck 'q' för avslut");

               if (vaxt.isEmpty())
               {
                   JOptionPane.showMessageDialog(null, "Du matade inte in något. Försök igen");
               }

               if (vaxt.equals("q"))
               {
                   System.exit(0);
               }


               for (Vaxt vaxten : vaxter)
               {
                   if (vaxt.equals(vaxten.name))
                   {
                       ((Iinstructions)  vaxten).getInstructions();
                   }

               }








           }
           catch (Exception e)
           {
               System.out.println(e.getMessage());
           }
       }






    }
}