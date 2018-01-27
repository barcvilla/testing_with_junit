/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twju.ch02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author barcvilla
 */
public class Listing_1_PhasesComments_TimelineTest 
{
    private final static int NEW_FETCH_COUNT = TimeLine.DEFAULT_FETCH_COUNT + 1;
    
    @Test
    public void setFetchCount()
    {
        // 1. configuracion (organizar y compilar). 
        // Creamos una instancia del objeto a ser probado que se llama el Sistema Bajo Prueba
        TimeLine timeLine = new TimeLine();
        
        // 2. ejercicio (actuar, operar)
        // Despues de inicializar el objeto invocamos la funcionalidad que deseamos verificar,
        timeLine.setFetchCount(NEW_FETCH_COUNT);
        
        // 3. verificar (afirmar, verificar)
        // verificamos que el resulta coincida con el comportamiento especificado. En nuestro caso, esperamos que 
        // el conteo de recuperacion real sea igual al valor de la constante NEW_FETCH_COUNT
        assertEquals(NEW_FETCH_COUNT, timeLine.getFetchCount());
    }
    
}
