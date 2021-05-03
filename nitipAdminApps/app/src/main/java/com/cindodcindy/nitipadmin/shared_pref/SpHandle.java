package com.cindodcindy.nitipadmin.shared_pref;

import android.content.Context;
import android.content.SharedPreferences;

public class SpHandle {

    public static final String SP_NITIP_BUYER_APP = "spNitipBuyerApp";

    public static final String SP_NAMA = "spNama";
    public static final String SP_EMAIL = "spEmail";
    public static final String SP_PHONE="spPhone";

    public static final String SP_ID_BUYER="spIdBuyer";

    public static final String SP_ID_SELLER="spIdSeller";

    public static final String SP_ID_ADMIN="spIdAdmin";

    public static final String SP_ID_BOOKING="spIdBooking";

    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SpHandle(Context context){
        sp = context.getSharedPreferences(SP_NITIP_BUYER_APP, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPString(String keySP, String value){
        spEditor.putString(keySP, value);
        spEditor.commit();
    }

    public void saveSPInt(String keySP, int value){
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value){
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public void setSpPhone(String keySp, String value){
        spEditor.putString(keySp,value);
        spEditor.commit();
    }

    public void setSpIdSeller(String keySp, Long value){
        spEditor.putLong(keySp,value);
        spEditor.commit();
    }

    public void setSpIdBuyer(String keySp, Long value){
        spEditor.putLong(keySp,value);
        spEditor.commit();
    }

    public void  setSpIdAdmin(String keySp, Long value){
        spEditor.putLong(keySp,value);
        spEditor.commit();
    }

    public void setSpIdBooking(String keySp, Long value){
        spEditor.putLong(keySp,value);
        spEditor.commit();
    }

    public String getSpPhone(){
        return  sp.getString(SP_PHONE,"");
    }

    public Long getIdBuyer(){
        return  sp.getLong(SP_ID_BUYER,0);
    }

    public Long getIdSeller(){
        return sp.getLong(SP_ID_SELLER,0);
    }

    public Long getIdAdmin(){
        return  sp.getLong(SP_ID_ADMIN,0);
    }

    public Long getIdBooking(){
        return  sp.getLong(SP_ID_BOOKING,0);
    }

    public String getSPNama(){
        return sp.getString(SP_NAMA, "");
    }

    public String getSPEmail(){
        return sp.getString(SP_EMAIL, "");
    }

    public Boolean getSPSudahLogin(){
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }
}
