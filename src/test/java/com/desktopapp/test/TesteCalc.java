package com.desktopapp.test;

import com.desktopapp.calc.Calculadora;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

public class TesteCalc {

    @Test
    public void testaMensagem() {
        String message = "Gerência de Configuração";
        Assert.assertTrue(message.equals("Gerência de Configuração"));
    }

    @Test
    public void testeMensagemHamcrest() {
        String message = "Gerência de Configuração";
        Assert.assertThat("disciplinaGC", is("disciplinaGC"));
    }

    @Test
    public void testeSoma() {
        Calculadora c = new Calculadora();
        Assert.assertEquals(new Double(6), c.soma(3, 3), 0);
    }

    @Test
    public void testeSubtracao() {
        Calculadora c = new Calculadora();
        Assert.assertTrue(c.subtracao(4.0, 3.0) == 1.0);
    }

    @Test
    public void testeMultiplicacao() {
        Calculadora c = new Calculadora();
        Assert.assertNotEquals(new Double(9), c.multiplicacao(3, 4), 0);
    }

    @Test
    public void testeDivisao() {
        Calculadora c = new Calculadora();
        Assert.assertSame(true, c.divisao(10, 2) == 5);
    }

    @Test
    public void testeObjetoNulo() {
        Calculadora c = new Calculadora();
        Assert.assertNotNull(c);
    }

    @Test
    public void testeObjetoNuloHamcrest() {
        Calculadora c = new Calculadora();
        Assert.assertThat(c, is(IsNull.notNullValue()));
    }
    
}
