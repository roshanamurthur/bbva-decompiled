package com.adobe.marketing.mobile.services;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
class DisplayInfoService implements DeviceInforming.DisplayInformation {
    private DisplayMetrics displayMetrics;

    public DisplayInfoService(DisplayMetrics displayMetrics) {
        this.displayMetrics = displayMetrics;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getDensityDpi() {
        return this.displayMetrics.densityDpi;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getHeightPixels() {
        return this.displayMetrics.heightPixels;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getWidthPixels() {
        return this.displayMetrics.widthPixels;
    }
}
