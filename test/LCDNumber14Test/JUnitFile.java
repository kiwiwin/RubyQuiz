package LCDNumber14Test;

import java.io.*;

import static junit.framework.Assert.*;

class JUnitFile {
    public static void assertFile(String fixtureDirectory, String fixtureFilename, String actual) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fixtureDirectory + fixtureFilename));
            BufferedReader actualReader = new BufferedReader(new StringReader(actual));

            String fileLine;
            int lineIndex = 0;

            while ((fileLine = fileReader.readLine()) != null) {
                lineIndex++;
                fileLine = fileLine.substring(0, fileLine.length() - 1);
                String actualLine = actualReader.readLine();
                assertEquals(" Line:" + lineIndex, fileLine, actualLine);
            }

            if ((actualReader.readLine()) != null) {
                fail("lines number not equal");
            }
        } catch (IOException e) {
            fail("exception happened: " + e.getMessage());
        }
    }
}
