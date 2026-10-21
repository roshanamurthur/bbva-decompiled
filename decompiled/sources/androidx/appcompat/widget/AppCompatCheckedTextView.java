package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final v f1154p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final k f1155q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h0 f1156r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public y f1157s0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1158a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1164g;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1159b = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1160c = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1161d = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
            this.f1162e = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
            this.f1163f = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f1164g = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f1158a = true;
        }

        public void readProperties(@NonNull AppCompatCheckedTextView appCompatCheckedTextView, @NonNull PropertyReader propertyReader) {
            if (!this.f1158a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1159b, appCompatCheckedTextView.getBackgroundTintList());
            propertyReader.readObject(this.f1160c, appCompatCheckedTextView.getBackgroundTintMode());
            propertyReader.readObject(this.f1161d, appCompatCheckedTextView.getCheckMarkTintList());
            propertyReader.readObject(this.f1162e, appCompatCheckedTextView.getCheckMarkTintMode());
            propertyReader.readObject(this.f1163f, appCompatCheckedTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1164g, appCompatCheckedTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatCheckedTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.f1157s0 == null) {
            this.f1157s0 = new y(this);
        }
        return this.f1157s0;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        h0 h0Var = this.f1156r0;
        if (h0Var != null) {
            h0Var.b();
        }
        k kVar = this.f1155q0;
        if (kVar != null) {
            kVar.b();
        }
        v vVar = this.f1154p0;
        if (vVar != null) {
            vVar.a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1155q0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1155q0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        v vVar = this.f1154p0;
        if (vVar != null) {
            return vVar.f1682b;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        v vVar = this.f1154p0;
        if (vVar != null) {
            return vVar.f1683c;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1156r0.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1156r0.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1700b.isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        z.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1155q0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1155q0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        v vVar = this.f1154p0;
        if (vVar != null) {
            if (vVar.f1686f) {
                vVar.f1686f = false;
            } else {
                vVar.f1686f = true;
                vVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1156r0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1156r0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1155q0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1155q0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        v vVar = this.f1154p0;
        if (vVar != null) {
            vVar.f1682b = colorStateList;
            vVar.f1684d = true;
            vVar.a();
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        v vVar = this.f1154p0;
        if (vVar != null) {
            vVar.f1683c = mode;
            vVar.f1685e = true;
            vVar.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        h0 h0Var = this.f1156r0;
        h0Var.k(colorStateList);
        h0Var.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        h0 h0Var = this.f1156r0;
        h0Var.l(mode);
        h0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        h0 h0Var = this.f1156r0;
        if (h0Var != null) {
            h0Var.g(context, i10);
        }
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        h0 h0Var = new h0(this);
        this.f1156r0 = h0Var;
        h0Var.f(attributeSet, i10);
        h0Var.b();
        k kVar = new k(this);
        this.f1155q0 = kVar;
        kVar.e(attributeSet, i10);
        this.f1154p0 = new v(this);
        Context context2 = getContext();
        int[] iArr = R.styleable.CheckedTextView;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i12 = R.styleable.CheckedTextView_checkMarkCompat;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i12) && (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = R.styleable.CheckedTextView_android_checkMark;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                        setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                    }
                }
            } else {
                i11 = R.styleable.CheckedTextView_android_checkMark;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i11) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0)) != 0) {
                    setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
                }
            }
            int i13 = R.styleable.CheckedTextView_checkMarkTint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                CheckedTextViewCompat.setCheckMarkTintList(this, tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = R.styleable.CheckedTextView_checkMarkTintMode;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                CheckedTextViewCompat.setCheckMarkTintMode(this, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            getEmojiTextViewHelper().a(attributeSet, i10);
        } catch (Throwable th2) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i10) {
        setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }
}
