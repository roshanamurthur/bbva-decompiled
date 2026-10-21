package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.CountryCodeToRegionCodeMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class GeoEntityUtility {
    public static final String REGION_CODE_FOR_NON_GEO_ENTITIES = "001";

    public static boolean isGeoEntity(String str) {
        return !str.equals("001");
    }

    public static boolean isGeoEntity(int i10) {
        List<String> list = CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap().get(Integer.valueOf(i10));
        return (list == null || list.contains("001")) ? false : true;
    }
}
