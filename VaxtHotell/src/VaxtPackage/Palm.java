package VaxtPackage;

import javax.swing.*;

public class Palm extends Vaxt implements Iinstructions
{


    public Palm(String name, float height) {
        super(name, height);
    }

    @Override
    public void waterPlant()
    {


        JOptionPane.showMessageDialog(null, "Hämtar instruktioner för palmen " + name + "... " );

        getInstructions();

    }

    @Override
    public void getInstructions()
    {


        float waterNeeded = height*0.5f;


        JOptionPane.showMessageDialog(null, "Vattna palmen med " + waterNeeded + " liter kranvatten.");
    }
}
