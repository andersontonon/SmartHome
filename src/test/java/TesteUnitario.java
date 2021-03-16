import Codigo.CalculosCmol;
import Codigo.CalculosIdeais;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitario {
    
    public TesteUnitario() {
    }
    CalculosIdeais ideais = new CalculosIdeais();
    CalculosCmol cmol = new CalculosCmol();
    
    @Test
    public void test1(){
       assertEquals(ideais.Fosforo(1),9.0);
       assertEquals(ideais.Fosforo(2),12.0);
       assertEquals(ideais.Fosforo(3),0);
    }
    
    @Test
    public void test2(){
       assertEquals(ideais.Potassio(1),0.35);
       assertEquals(ideais.Potassio(2),0.25);
       assertEquals(ideais.Potassio(3),0); 
    }
    @Test
    public void test3(){
       assertEquals(ideais.Calcio(1),6.0);
       assertEquals(ideais.Calcio(2),4.0);
       assertEquals(ideais.Calcio(3),0); 
    }
    @Test
    public void test4(){
       assertEquals(ideais.Magnesio(1),1.5);
       assertEquals(ideais.Magnesio(2),1.0);
       assertEquals(ideais.Magnesio(3),0); 
    }
    @Test
    public void test5(){
       assertEquals(ideais.Enxofre(1),9.0);
       assertEquals(ideais.Enxofre(2),6.0);
       assertEquals(ideais.Enxofre(3),0); 
    }
    
    public void test6(){
        assertEquals(cmol.S_cmol(5.5, 3.4, 2.7), 11.6);
    }
    public void test7(){
        assertEquals(cmol.CTC_cmol(5.5, 3.4, 2.7, 7.7),5.5 + 3.4 + 2.7 + 7.7);
    }
    public void test8(){
        double a = 5.5, b = 3.4, c = 2.7, d = 7.7;
        double e = 3.3, f = 6.4, g = 2.8, h = 2.7;
        double i = 5.4, j = 7.4, k = 9.7, l = 1.7;
        
        assertEquals(Double.parseDouble(String.format("%.2f", cmol.V_atual(a, b, c, d )).replaceAll( "," , "." )),(double)60.10); 
        assertEquals(Double.parseDouble(String.format("%.2f", cmol.V_atual(e, f, g, h )).replaceAll( "," , "." )),(double)82.24); 
        assertNotSame(Double.parseDouble(String.format("%.2f", cmol.V_atual(i, j, k, l )).replaceAll( "," , "." )),(double)92.97); //valor correto 92.98
        assertEquals(Double.parseDouble(String.format("%.2f", cmol.V_atual(i, j, k, l )).replaceAll( "," , "." )),(double)92.98); //valor correto 92.98

    }
}