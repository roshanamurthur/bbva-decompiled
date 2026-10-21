package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AppCompatImageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ImageView f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TintInfo f1195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TintInfo f1196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TintInfo f1197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1198e = 0;

    public AppCompatImageHelper(@NonNull ImageView imageView) {
        this.f1194a = imageView;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.f1197d == null) {
            this.f1197d = new TintInfo();
        }
        TintInfo tintInfo = this.f1197d;
        tintInfo.mTintList = null;
        tintInfo.mHasTintList = false;
        tintInfo.mTintMode = null;
        tintInfo.mHasTintMode = false;
        ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.f1194a);
        if (imageTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.f1194a);
        if (imageTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = imageTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.a(drawable, tintInfo, this.f1194a.getDrawableState());
        return true;
    }

    private boolean i() {
        return this.f1195b != null;
    }

    public final void b() {
        if (this.f1194a.getDrawable() != null) {
            this.f1194a.getDrawable().setLevel(this.f1198e);
        }
    }

    public void c() {
        Drawable drawable = this.f1194a.getDrawable();
        if (drawable != null) {
            DrawableUtils.a(drawable);
        }
        if (drawable != null) {
            if (i() && a(drawable)) {
                return;
            }
            TintInfo tintInfo = this.f1196c;
            if (tintInfo != null) {
                AppCompatDrawableManager.a(drawable, tintInfo, this.f1194a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f1195b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.a(drawable, tintInfo2, this.f1194a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        TintInfo tintInfo = this.f1196c;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        TintInfo tintInfo = this.f1196c;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1194a.getBackground() instanceof RippleDrawable);
    }

    public void g(ColorStateList colorStateList) {
        if (this.f1196c == null) {
            this.f1196c = new TintInfo();
        }
        TintInfo tintInfo = this.f1196c;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        c();
    }

    public void h(PorterDuff.Mode mode) {
        if (this.f1196c == null) {
            this.f1196c = new TintInfo();
        }
        TintInfo tintInfo = this.f1196c;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        c();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1194a.getContext();
        int[] iArr = R.styleable.AppCompatImageView;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1194a;
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            Drawable drawable = this.f1194a.getDrawable();
            if (drawable == null && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AppCompatResources.getDrawable(this.f1194a.getContext(), resourceId)) != null) {
                this.f1194a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            int i11 = R.styleable.AppCompatImageView_tint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                ImageViewCompat.setImageTintList(this.f1194a, tintTypedArrayObtainStyledAttributes.getColorStateList(i11));
            }
            int i12 = R.styleable.AppCompatImageView_tintMode;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
                ImageViewCompat.setImageTintMode(this.f1194a, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i12, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i10) {
        if (i10 != 0) {
            Drawable drawable = AppCompatResources.getDrawable(this.f1194a.getContext(), i10);
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            this.f1194a.setImageDrawable(drawable);
        } else {
            this.f1194a.setImageDrawable(null);
        }
        c();
    }
}
