package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckBox;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final w f1143p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final k f1144q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h0 f1145r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public y f1146s0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1147a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1153g;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1148b = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1149c = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1150d = propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
            this.f1151e = propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
            this.f1152f = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f1153g = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f1147a = true;
        }

        public void readProperties(@NonNull AppCompatCheckBox appCompatCheckBox, @NonNull PropertyReader propertyReader) {
            if (!this.f1147a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1148b, appCompatCheckBox.getBackgroundTintList());
            propertyReader.readObject(this.f1149c, appCompatCheckBox.getBackgroundTintMode());
            propertyReader.readObject(this.f1150d, appCompatCheckBox.getButtonTintList());
            propertyReader.readObject(this.f1151e, appCompatCheckBox.getButtonTintMode());
            propertyReader.readObject(this.f1152f, appCompatCheckBox.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1153g, appCompatCheckBox.getCompoundDrawableTintMode());
        }
    }

    public AppCompatCheckBox(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.f1146s0 == null) {
            this.f1146s0 = new y(this);
        }
        return this.f1146s0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f1144q0;
        if (kVar != null) {
            kVar.b();
        }
        h0 h0Var = this.f1145r0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1144q0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1144q0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        w wVar = this.f1143p0;
        if (wVar != null) {
            return wVar.f1688b;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        w wVar = this.f1143p0;
        if (wVar != null) {
            return wVar.f1689c;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1145r0.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1145r0.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1700b.isEnabled();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1144q0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1144q0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        w wVar = this.f1143p0;
        if (wVar != null) {
            if (wVar.f1692f) {
                wVar.f1692f = false;
            } else {
                wVar.f1692f = true;
                wVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1145r0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1145r0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1700b.getFilters(inputFilterArr));
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1144q0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1144q0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        w wVar = this.f1143p0;
        if (wVar != null) {
            wVar.f1688b = colorStateList;
            wVar.f1690d = true;
            wVar.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        w wVar = this.f1143p0;
        if (wVar != null) {
            wVar.f1689c = mode;
            wVar.f1691e = true;
            wVar.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        h0 h0Var = this.f1145r0;
        h0Var.k(colorStateList);
        h0Var.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        h0 h0Var = this.f1145r0;
        h0Var.l(mode);
        h0Var.b();
    }

    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        w wVar = new w(this);
        this.f1143p0 = wVar;
        wVar.b(attributeSet, i10);
        k kVar = new k(this);
        this.f1144q0 = kVar;
        kVar.e(attributeSet, i10);
        h0 h0Var = new h0(this);
        this.f1145r0 = h0Var;
        h0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i10) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }
}
