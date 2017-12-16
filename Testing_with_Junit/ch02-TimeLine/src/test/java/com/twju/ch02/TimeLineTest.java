/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twju.ch02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author barcvilla
 */
public class TimeLineTest 
{
    private final static  int NEW_FETCH_COUNT = new TimeLine().getFetchCount() + 1;
    
    @Test
    public void setFetchCount()
    {
        TimeLine timeLine = new TimeLine();
        timeLine.setFetchCount(NEW_FETCH_COUNT);
        assertEquals(NEW_FETCH_COUNT, timeLine.getFetchCount());
    }
    
    @Test
    public void initialState()
    {
        TimeLine timeLine = new TimeLine();
        assertTrue(timeLine.getFetchCount() > 0);
    }
}
