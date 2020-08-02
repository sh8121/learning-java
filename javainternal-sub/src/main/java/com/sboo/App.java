package com.sboo;

import com.sboo.di.ContainerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AccountService accountService = ContainerService.getObject(AccountService.class);
        accountService.join();
    }
}
