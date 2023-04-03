package com.org.qa.tests;

import com.org.qa.collection.Categories;
import com.org.qa.common.testData.CategoryTestData;
import com.org.qa.common.testData.PromotionTestData;
import com.org.qa.util.APIResponseDataUtils;
import com.org.qa.utils.APIListener;
import com.org.qa.utils.AllureListener;
import com.org.qa.utils.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This includes the tests for validate the category details of <a href="https://api.tmsandbox.co.nz">...</a>
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
    @Test(description = "Test #1: Verify request category details ")
    public void testCategoryDetails() {
        Categories categoriesResponse = APIResponseDataUtils.getCategories(CategoryTestData.CAT_ID_6327, false);

        softAssert.assertEquals(categoriesResponse.getName(), CategoryTestData.CAT_NAME_CARBON_CREDITS,
                "Actual name is not matched with expected name-" + CategoryTestData.CAT_NAME_CARBON_CREDITS);
        softAssert.assertTrue(categoriesResponse.getCanRelist(),
                "Actual CanRelist value is not matched with expected value-");

        int promotionArraySize = categoriesResponse.getPromotions().size();
        String promotionDescription;
        for (int i = 0; i < promotionArraySize; i++) {
            if (categoriesResponse.getPromotions().get(i).getName().equals(PromotionTestData.PROMO_NAME_GALLERY)) {
                promotionDescription = categoriesResponse.getPromotions().get(i).getDescription();
                softAssert.assertEquals(promotionDescription, PromotionTestData.PROMO_DESCRIPTION_GOOD_POSITION,
                        "Actual description is not matched with expected- " + PromotionTestData.PROMO_DESCRIPTION_GOOD_POSITION);
                break;
            }
        }
        softAssert.assertAll();
    }


}
