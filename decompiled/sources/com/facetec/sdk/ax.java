package com.facetec.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"AppCompatCustomView"})
class ax extends TextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40411c;

    public ax(Context context) {
        super(context);
        this.f40411c = false;
        a();
    }

    private void a() {
        if (this.f40411c) {
            return;
        }
        this.f40411c = true;
        setIncludeFontPadding(ay.d(ak.f40286c));
    }

    public ax(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40411c = false;
        a();
    }

    public ax(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40411c = false;
        a();
    }
}
