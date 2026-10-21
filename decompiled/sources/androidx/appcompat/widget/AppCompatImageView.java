package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final k f1199p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final AppCompatImageHelper f1200q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f1201r0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1202a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1206e;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1203b = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1204c = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1205d = propertyMapper.mapObject("tint", R.attr.tint);
            this.f1206e = propertyMapper.mapObject("tintMode", R.attr.tintMode);
            this.f1202a = true;
        }

        public void readProperties(@NonNull AppCompatImageView appCompatImageView, @NonNull PropertyReader propertyReader) {
            if (!this.f1202a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1203b, appCompatImageView.getBackgroundTintList());
            propertyReader.readObject(this.f1204c, appCompatImageView.getBackgroundTintMode());
            propertyReader.readObject(this.f1205d, appCompatImageView.getImageTintList());
            propertyReader.readObject(this.f1206e, appCompatImageView.getImageTintMode());
        }
    }

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f1199p0;
        if (kVar != null) {
            kVar.b();
        }
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.c();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1199p0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1199p0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1200q0.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1199p0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1199p0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null && drawable != null && !this.f1201r0) {
            appCompatImageHelper.getClass();
            appCompatImageHelper.f1198e = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.f1200q0;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.c();
            if (this.f1201r0) {
                return;
            }
            this.f1200q0.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1201r0 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.setImageResource(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.c();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1199p0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1199p0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f1200q0;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.h(mode);
        }
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        this.f1201r0 = false;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        k kVar = new k(this);
        this.f1199p0 = kVar;
        kVar.e(attributeSet, i10);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f1200q0 = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i10);
    }
}
