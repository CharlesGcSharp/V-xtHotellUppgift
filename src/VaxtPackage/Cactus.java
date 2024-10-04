package VaxtPackage;

import javax.swing.*;

public class Cactus extends Vaxt implements Iinstructions
{


    public Cactus(String name, float height) {
        super(name, height); // Här är ett exempel på arv. Fälten "name" och "height" hamnar automatiskt i ...
                            // ... subklasserna eftersom jag har skrivit "extends Vaxt" i deras deklaration
    }


    @Override
    public void getInstructions()
    {

        // Här används interfacet "Iinstructions". I och med att subklasserna implementerar interfacet, måste de...
        // ha dennes metod. Varje subklass "getInstructions()" metod kommer att agera annorlunda.
        JOptionPane.showMessageDialog(null, "Vattna kaktusen med 2 cl mineralvatten. ");

    }
}
