package org.budtz.christian.shopr.dataModel;

import android.support.v7.app.AppCompatActivity;

/**
 * @author Christian on 29-10-2015.
 */
public interface IDbController {

   ShopList newShopList(String name);
    void setActiveShopList(ShopList shopList);

    void testDB();
}
