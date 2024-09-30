package VaxtPackage;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {





        Cactus igge = new Cactus("Igge", 0.2f);

        Palm laura = new Palm("Laura", 5f);

        Meateater meatloaf = new Meateater("Meatloaf", 0.7f);

        Palm olof = new Palm("Olof", 1f);




       while (true)
       {
           try
           {

               String vaxt = JOptionPane.showInputDialog("Vilken växt ska få vätska? Tryck 'q' för avslut");

               if (vaxt.equals("Igge"))
               {
                    igge.waterPlant();

               }
               else if (vaxt.equals("Laura"))
               {
                    laura.waterPlant();

               }
               else if (vaxt.equals("Meatloaf"))
               {
                    meatloaf.waterPlant();

               }
               else if (vaxt.equals("Olof"))
               {
                    olof.waterPlant();

               }
               else if (vaxt.equals("q") || vaxt.equals("Q"))
               {
                   break;
               }
               else
               {

                   JOptionPane.showMessageDialog(null, "Du kan bara välja mellan de namnen som finns i databasen. Försök igen.");
               }

           }
           catch (Exception e)
           {
               System.out.println(e.getMessage());
           }
       }






    }
}