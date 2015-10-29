package org.budtz.christian.shopr.dataModel;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Christian on 29-10-2015.
 */
public interface IDbController {

    public void onCreate();
    public ShopList newShopList(String name);
    public void setActiveShopList(ShopList shopList);
}
