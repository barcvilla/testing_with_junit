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
        // 1. configuracion (organizar y compilar)
        TimeLine timeLine = new TimeLine();
        
        // 2. ejercicio (actuar, operar)
        timeLine.setFetchCount(NEW_FETCH_COUNT);
        
        // 3. verificar (afirmar, verificar)
        assertEquals(NEW_FETCH_COUNT, timeLine.getFetchCount());
    }
    
}
