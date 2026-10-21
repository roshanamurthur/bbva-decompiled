package com.adobe.marketing.mobile;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
class AndroidDisplayInformation implements SystemInfoService.DisplayInformation {
    private DisplayMetrics displayMetrics;

    public AndroidDisplayInformation(DisplayMetrics displayMetrics) {
        this.displayMetrics = displayMetrics;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService.DisplayInformation
    public int getDensityDpi() {
        return this.displayMetrics.densityDpi;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService.DisplayInformation
    public int getHeightPixels() {
        return this.displayMetrics.heightPixels;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService.DisplayInformation
    public int getWidthPixels() {
        return this.displayMetrics.widthPixels;
    }
}
