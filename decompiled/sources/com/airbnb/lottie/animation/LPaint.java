package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LPaint extends Paint {
    public LPaint() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(MiscUtils.clamp(i10, 0, 255));
        } else {
            setColor((MiscUtils.clamp(i10, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    public LPaint(int i10) {
        super(i10);
    }

    public LPaint(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public LPaint(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
