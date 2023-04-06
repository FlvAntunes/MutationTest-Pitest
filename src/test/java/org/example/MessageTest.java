package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MessageTest {
    @Test
    public void messageOk1() {
        Message message = new Message();
        String result = message.message(5);
        assertEquals("YES", result);
    }

    @Test
    public void messageOk2() {
        Message message = new Message();
        String result = message.message(-5);
        assertEquals("NO", result);
    }

/*
DESCOMENTE OS TESTES ABAIXO PARA VALIDAR 100% DE COBERTURA NO TESTE DE MUTAÇÃO
*/

//    @Test
//    public void messageLimit1() {
//        Message message = new Message();
//        String result = message.message(0);
//        assertEquals("YES", result);
//    }
//
//    @Test
//    public void messageLimit2() {
//        Message message = new Message();
//        String result = message.message(10);
//        assertEquals("YES", result);
//    }
//
//    @Test
//    public void messageUnderZero() {
//        Message message = new Message();
//        String result = message.message(-1);
//        assertEquals("NO", result);
//    }
//
//    @Test
//    public void messageAboveten() {
//        Message message = new Message();
//        String result = message.message(11);
//        assertEquals("NO", result);
//    }
}
