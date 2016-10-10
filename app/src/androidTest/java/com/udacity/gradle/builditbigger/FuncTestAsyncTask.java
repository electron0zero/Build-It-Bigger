package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;
@RunWith(AndroidJUnit4.class)
public class FuncTestAsyncTask {
    @Test
    public void testDoInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new AsyncTaskEndpoint().execute(fragment);
        Thread.sleep(10000);
        assertTrue("Error: Fetched Joke = " + fragment.joke_loaded, fragment.joke_loaded != null);
    }
}
