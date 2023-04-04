package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MessageTest {
    @Test
    public void messageOk1() {
        Message calculator = new Message();
        String result = calculator.message(5);
        assertEquals("YES", result);
    }

    @Test
    public void messageOk2() {
        Message calculator = new Message();
        String result = calculator.message(-5);
        assertEquals("NO", result);
    }

/*
DESCOMENTE OS TESTES ABAIXO PARA VALIDAR 100% DE COBERTURA NO TESTE DE MUTAÇÃO
*/

//    @Test
//    public void messageLimit1() {
//        Message calculator = new Message();
//        String result = calculator.message(0);
//        assertEquals("YES", result);
//    }
//
//    @Test
//    public void messageLimit2() {
//        Message calculator = new Message();
//        String result = calculator.message(10);
//        assertEquals("YES", result);
//    }
//
//    @Test
//    public void messageUnderZero() {
//        Message calculator = new Message();
//        String result = calculator.message(-1);
//        assertEquals("NO", result);
//    }
//
//    @Test
//    public void messageAboveten() {
//        Message calculator = new Message();
//        String result = calculator.message(11);
//        assertEquals("NO", result);
//    }
}
