/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twju.ch01.timeline;

import org.junit.Test;

/**
 *
 * @author barcvilla
 */
public class TimeLineTest 
{
    @Test
    public void setFetchCount()
    {
        /*
        * Para probar al componente TimeLine, creamos una variable local que toma una nueva instancia de este componente
        */
        TimeLine timeLine = new TimeLine();
        timeLine.setFetchCount(5);
        int actual = timeLine.getFetchCount();
    }
}
