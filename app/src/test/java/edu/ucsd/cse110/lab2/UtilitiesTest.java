package edu.ucsd.cse110.lab2;
import static org.junit.Assert.*;

import android.net.Uri;

import org.junit.Test;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayStr(){
        assertEquals("12.32",Utilities.trimDisplayStr("12.320"));
        assertEquals("13",Utilities.trimDisplayStr("13.0"));
    }
}
