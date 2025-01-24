package fr.insarouen.iti.prog.aventure;

import fr.insarouen.iti.prog.aventure.elements.objets.PiedDeBiche;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestFramework{


    @Test
    void testObjet1(){
        Monde monde1 = new Monde("monde1");

        PiedDeBiche pied1 = new PiedDeBiche("pied1", monde1);

        assertEquals(pied1.getNom(), "pied1");
        assertEquals(pied1.getMonde().getNom(), "monde1");
        assertTrue(pied1.estDeplacable());

    }
    


}