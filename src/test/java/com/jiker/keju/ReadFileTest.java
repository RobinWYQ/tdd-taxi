package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadFileTest {
    @Test
    public void should_return_text_string(){
        ReadFile readFile = new ReadFile();
        assertEquals("1公里,等待0分钟\n" +
                "3公里,等待0分钟\n" +
                "10公里,等待0分钟\n" +
                "2公里,等待3分钟\n",readFile.readFile("testData.txt"));
    }

}
