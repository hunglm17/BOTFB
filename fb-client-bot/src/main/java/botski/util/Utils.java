/*
 * Copyright 2012 ikstob.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package botski.util;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Collection of random utilities
 */
public class Utils {

    /**
     * Convenience method for sleeping and ignoring Exceptions
     */
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
        }
    }

    public static void getScrenshot(WebDriver driver, String imgName) {
        File Ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(Ss, new File("D:\\" + imgName + ".jpg"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
