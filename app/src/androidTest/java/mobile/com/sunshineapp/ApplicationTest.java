package mobile.com.sunshineapp;

import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    public static Test suite(){
        return new TestSuite(ApplicationTest.class);

    }

    public ApplicationTest() {
        super(Application.class);
    }
}