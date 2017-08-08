package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;


import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

/**
 * Created by ahmed on 8/7/17.
 */

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void verifyAsyncTaskResult(){
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

        String joke = null;
        try {
            joke = endpointsAsyncTask.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Assert.fail();

        } catch (ExecutionException e) {
            e.printStackTrace();
            Assert.fail();
        }

        assertNotNull(joke);
        assertFalse(joke.isEmpty());


    }
}
