package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes9.dex */
class da extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41143c;

    public da(Context context) {
        super(context);
        this.f41143c = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * db.d());
    }

    public void setXFraction(float f6) {
        int i10 = this.f41143c;
        setX(i10 > 0 ? f6 * i10 : -9999.0f);
    }

    public da(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41143c = (int) (Resources.getSystem().getDisplayMetrics().widthPixels * db.d());
    }
}
