package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int[] f1207s0 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final k f1208p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final h0 f1209q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final x f1210r0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1211a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1215e;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1212b = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.f1213c = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.f1214d = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.f1215e = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.f1211a = true;
        }

        public void readProperties(@NonNull AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView, @NonNull PropertyReader propertyReader) {
            if (!this.f1211a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1212b, appCompatMultiAutoCompleteTextView.getBackgroundTintList());
            propertyReader.readObject(this.f1213c, appCompatMultiAutoCompleteTextView.getBackgroundTintMode());
            propertyReader.readObject(this.f1214d, appCompatMultiAutoCompleteTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1215e, appCompatMultiAutoCompleteTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f1208p0;
        if (kVar != null) {
            kVar.b();
        }
        h0 h0Var = this.f1209q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1208p0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1208p0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1209q0.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1209q0.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.f1210r0.f1696b.isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        z.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        return this.f1210r0.f1696b.onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1208p0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1208p0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1209q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1209q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i10) {
        setDropDownBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z10) {
        this.f1210r0.f1696b.setEnabled(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1210r0.a(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1208p0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1208p0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        h0 h0Var = this.f1209q0;
        h0Var.k(colorStateList);
        h0Var.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        h0 h0Var = this.f1209q0;
        h0Var.l(mode);
        h0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        h0 h0Var = this.f1209q0;
        if (h0Var != null) {
            h0Var.g(context, i10);
        }
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, f1207s0, i10, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        k kVar = new k(this);
        this.f1208p0 = kVar;
        kVar.e(attributeSet, i10);
        h0 h0Var = new h0(this);
        this.f1209q0 = h0Var;
        h0Var.f(attributeSet, i10);
        h0Var.b();
        x xVar = new x(this);
        this.f1210r0 = xVar;
        xVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = xVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
