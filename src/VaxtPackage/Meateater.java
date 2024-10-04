package VaxtPackage;

import javax.swing.*;

public class Meateater extends Vaxt implements Iinstructions
{


    public Meateater(String name, float height) {
        super(name, height);
    }




    @Override
    public void getInstructions()
    {

        float baseProteinDrinkNeeded = 0.1f;

        float additionalProteinDrinkNeeded = height*0.2f;

        float finalProteinDrinkNeeded = additionalProteinDrinkNeeded + baseProteinDrinkNeeded;







        JOptionPane.showMessageDialog(null,"Mata den köttätande växten med " + finalProteinDrinkNeeded +  " liter proteindryck");

    }
}
