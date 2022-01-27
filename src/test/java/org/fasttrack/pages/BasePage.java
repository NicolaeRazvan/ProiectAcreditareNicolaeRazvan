package org.fasttrack.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.EnvConstants;

public class BasePage extends PageObject {


    public int getIntFromPrice(String priceNonFormatted) {
        return Integer.parseInt(priceNonFormatted
                .replace(",", "")
                .replace(" lei", "")
                .replace(".", ""));
    }




}

