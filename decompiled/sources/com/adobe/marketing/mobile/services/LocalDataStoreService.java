package com.adobe.marketing.mobile.services;

import android.content.Context;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;

/* JADX INFO: loaded from: classes2.dex */
class LocalDataStoreService implements DataStoring {
    private static final String TAG = "LocalDataStoreService";

    @Override // com.adobe.marketing.mobile.services.DataStoring
    public NamedCollection getNamedCollection(String str) {
        if (str == null || str.isEmpty()) {
            MobileCore.log(LoggingMode.ERROR, TAG, String.format("Failed to create an instance of NamedCollection with name - %s: the collection name is null or empty.", str));
            return null;
        }
        Context applicationContext = ServiceProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            MobileCore.log(LoggingMode.ERROR, TAG, String.format("Failed to create an instance of NamedCollection with name - %s: the ApplicationContext is null", str));
            return null;
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (sharedPreferences != null && editorEdit != null) {
            return new SharedPreferencesNamedCollection(sharedPreferences, editorEdit);
        }
        MobileCore.log(LoggingMode.ERROR, TAG, "Failed to create a valid SharedPreferences object or SharedPreferences.Editor object");
        return null;
    }
}
