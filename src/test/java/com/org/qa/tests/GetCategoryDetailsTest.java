package com.org.qa.tests;

import com.org.qa.collection.CategoriesResponse;
import com.org.qa.util.APIResponseDataUtils;
import com.org.qa.utils.APIListener;
import com.org.qa.utils.AllureListener;
import com.org.qa.utils.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.org.qa.common.TestData.*;

/**
 * This includes the tests for validate the category details of https://api.tmsandbox.co.nz
 * <p>
 * Acceptance Criteria:
 * Name = "Carbon credits"
 * CanRelist = true
 * The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"
 *
 * @author Nipuni Madanayaka <sasankammn@gmail.com>
 */
@Listeners({AllureListener.class, APIListener.class})
public class GetCategoryDetailsTest extends TestBase {
    String categoryId = "6327";
    boolean isCatalogue = false;
    String promotionName = PROMO_NAME_GALLERY;

    @Test(description = "Test #1: Verify request category details ")
    public void testCategoryDetails() throws IOException {
        CategoriesResponse categoriesResponse = APIResponseDataUtils.getCategories(categoryId, isCatalogue);

        softAssert.assertEquals(categoriesResponse.getName(), CAT_NAME_CARBON_CREDITS, " Actual name is not matched with expected name-" + CAT_NAME_CARBON_CREDITS);
        softAssert.assertTrue(categoriesResponse.getCanRelist(), " Actual CanRelist value is not matched with expected value-");

        int promotionArraySize = categoriesResponse.getPromotions().size();
        String promotionDescription ;
        for (int i = 0; i < promotionArraySize; i++) {
            if (categoriesResponse.getPromotions().get(i).getName().equals(promotionName)) {
                promotionDescription = categoriesResponse.getPromotions().get(i).getDescription();
                softAssert.assertEquals(promotionDescription, PROMO_DESCRIPTION_GOOD_POSITION, " Actual description for the promotion is  not matched with expected - " + PROMO_DESCRIPTION_GOOD_POSITION);
                break;
            }
        }
        softAssert.assertAll();
    }


}
