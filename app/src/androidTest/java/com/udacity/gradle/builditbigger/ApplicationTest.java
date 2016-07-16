package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.CountDownLatch;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    private String mJoke;
    private CountDownLatch signal;

    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testVerifyResponse() throws InterruptedException {
        new EndpointsAsyncTask(new ResultCallback() {
            @Override
            public void returnResult(String result) {
                mJoke = result;
                signal.countDown();
            }
        }).execute(getContext());
        signal.await();
        assertNotNull(mJoke);
    }
}