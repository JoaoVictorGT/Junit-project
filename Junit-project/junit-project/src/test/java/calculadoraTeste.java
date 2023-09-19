import org.example.Calculadora;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTeste {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(12, 3);
        assertEquals(4, resultado);
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(7, 2);
        assertEquals(14, resultado);
    }
}
