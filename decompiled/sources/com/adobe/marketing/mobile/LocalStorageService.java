package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface LocalStorageService {

    public interface DataStore {
        boolean contains(String str);

        boolean getBoolean(String str, boolean z10);

        double getDouble(String str, double d2);

        float getFloat(String str, float f6);

        int getInt(String str, int i10);

        long getLong(String str, long j10);

        Map<String, String> getMap(String str);

        String getString(String str, String str2);

        void remove(String str);

        void removeAll();

        void setBoolean(String str, boolean z10);

        void setDouble(String str, double d2);

        void setFloat(String str, float f6);

        void setInt(String str, int i10);

        void setLong(String str, long j10);

        void setMap(String str, Map<String, String> map);

        void setString(String str, String str2);
    }

    DataStore getDataStore(String str);
}
