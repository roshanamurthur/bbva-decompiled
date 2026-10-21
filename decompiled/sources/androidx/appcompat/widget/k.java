package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f1630a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TintInfo f1633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TintInfo f1634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TintInfo f1635f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1632c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppCompatDrawableManager f1631b = AppCompatDrawableManager.get();

    public k(@NonNull View view) {
        this.f1630a = view;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f1635f == null) {
            this.f1635f = new TintInfo();
        }
        TintInfo tintInfo = this.f1635f;
        tintInfo.mTintList = null;
        tintInfo.mHasTintList = false;
        tintInfo.mTintMode = null;
        tintInfo.mHasTintMode = false;
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.f1630a);
        if (backgroundTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.f1630a);
        if (backgroundTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = backgroundTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.a(drawable, tintInfo, this.f1630a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1633d != null;
    }

    public void b() {
        Drawable background = this.f1630a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            TintInfo tintInfo = this.f1634e;
            if (tintInfo != null) {
                AppCompatDrawableManager.a(background, tintInfo, this.f1630a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f1633d;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.a(background, tintInfo2, this.f1630a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        TintInfo tintInfo = this.f1634e;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        TintInfo tintInfo = this.f1634e;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    public void e(@Nullable AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListE;
        Context context = this.f1630a.getContext();
        int[] iArr = R.styleable.ViewBackgroundHelper;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        View view = this.f1630a;
        ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i11 = R.styleable.ViewBackgroundHelper_android_background;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                this.f1632c = tintTypedArrayObtainStyledAttributes.getResourceId(i11, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.f1631b;
                Context context2 = this.f1630a.getContext();
                int i12 = this.f1632c;
                synchronized (appCompatDrawableManager) {
                    colorStateListE = appCompatDrawableManager.f1167a.e(context2, i12);
                }
                if (colorStateListE != null) {
                    h(colorStateListE);
                }
            }
            int i13 = R.styleable.ViewBackgroundHelper_backgroundTint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                ViewCompat.setBackgroundTintList(this.f1630a, tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = R.styleable.ViewBackgroundHelper_backgroundTintMode;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                ViewCompat.setBackgroundTintMode(this.f1630a, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void f(Drawable drawable) {
        this.f1632c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        ColorStateList colorStateListE;
        this.f1632c = i10;
        AppCompatDrawableManager appCompatDrawableManager = this.f1631b;
        if (appCompatDrawableManager != null) {
            Context context = this.f1630a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateListE = appCompatDrawableManager.f1167a.e(context, i10);
            }
        } else {
            colorStateListE = null;
        }
        h(colorStateListE);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1633d == null) {
                this.f1633d = new TintInfo();
            }
            TintInfo tintInfo = this.f1633d;
            tintInfo.mTintList = colorStateList;
            tintInfo.mHasTintList = true;
        } else {
            this.f1633d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1634e == null) {
            this.f1634e = new TintInfo();
        }
        TintInfo tintInfo = this.f1634e;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1634e == null) {
            this.f1634e = new TintInfo();
        }
        TintInfo tintInfo = this.f1634e;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        b();
    }
}
