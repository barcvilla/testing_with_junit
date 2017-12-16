/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twju.ch02;

/**
 *
 * @author barcvilla
 */
public class TimeLine 
{
    public static final int FETCH_COUNT_LOWER_BOUND = 1;
    public static final int FETCH_COUNT_UPPER_BOUND = 20;
    
    static final int DEFAULT_FETCH_COUNT = 10;
    
    private int fetchCount;
    
    public TimeLine()
    {
        fetchCount = DEFAULT_FETCH_COUNT;
    }
    
    public void setFetchCount(int fetchCount)
    {
        if(fetchCount >= FETCH_COUNT_LOWER_BOUND && fetchCount <= FETCH_COUNT_UPPER_BOUND)
        {
            this.fetchCount = fetchCount;
        }
    }
    
    public int getFetchCount()
    {
        return fetchCount;
    }
    
    public void dispose()
    {
    }
}
