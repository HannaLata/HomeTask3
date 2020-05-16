package com.mainacad;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        String originalText = "abc1de2 fg3hi4 j5klm6n";

        LOGGER.info(originalText);

        String modifiedText = originalText.replaceAll("\\d", "");

        LOGGER.info(modifiedText);

        StringBuffer buffer = new StringBuffer(modifiedText);

        buffer.reverse();

        String reversedText = buffer.toString();

        LOGGER.info(reversedText);

        StringBuffer buffer1 = new StringBuffer(reversedText);

        buffer1.insert(3, "1");
        buffer1.insert(6, "2");
        buffer1.insert(10, "3");
        buffer1.insert(13, "4");
        buffer1.insert(16, "5");
        buffer1.insert(20, "6");

        String finalText = buffer1.toString();

        LOGGER.info(finalText);











    }
}
