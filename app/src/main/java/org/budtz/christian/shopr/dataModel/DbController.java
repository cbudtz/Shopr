package org.budtz.christian.shopr.dataModel;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

import org.budtz.christian.shopr.MainActivity;

/**
 * @author Christian on 29-10-2015.
 */
public class DbController implements IDbController {
    private final SharedPreferences prefs;
    private Firebase fireBase;

    private static DbController instance;


    /**
     * Singleton - Get Singleton Instance
     * @return SingleTon instance
     */
    public synchronized static DbController getI(AppCompatActivity a) {
        if (instance == null) instance = new DbController(a);
        return instance;
    }

    /**
     * Private Constructor - Singleton class
     */
    private DbController(AppCompatActivity a){
        prefs = PreferenceManager.getDefaultSharedPreferences(a);
        Firebase.setAndroidContext(a);
        fireBase= new Firebase("https://shop-r.firebaseio.com/");

    }

    @Override
    public ShopList newShopList(String name) {
        return null;
    }

    @Override
    public void setActiveShopList(ShopList shopList) {

    }
    @Override
    public void testDB(){
       fireBase.child("message").setValue("Do you have data? You'll love Firebase.");
    }


}
