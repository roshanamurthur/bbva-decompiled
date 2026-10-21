package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView, EmojiCompatConfigurationView {

    @NonNull
    private y mAppCompatEmojiTextHelper;
    private final k mBackgroundTintHelper;
    private final h0 mTextHelper;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1134a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1141h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1142i;

        /* JADX INFO: compiled from: AppCompatButton$InspectionCompanion.java */
        public class a implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i10) {
                if (i10 != 0) {
                    return i10 != 1 ? String.valueOf(i10) : "uniform";
                }
                return "none";
            }
        }

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1135b = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.f1136c = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.f1137d = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.f1138e = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new a());
            this.f1139f = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1140g = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1141h = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f1142i = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f1134a = true;
        }

        public void readProperties(@NonNull AppCompatButton appCompatButton, @NonNull PropertyReader propertyReader) {
            if (!this.f1134a) {
                throw j.c();
            }
            propertyReader.readInt(this.f1135b, appCompatButton.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.f1136c, appCompatButton.getAutoSizeMinTextSize());
            propertyReader.readInt(this.f1137d, appCompatButton.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.f1138e, appCompatButton.getAutoSizeTextType());
            propertyReader.readObject(this.f1139f, appCompatButton.getBackgroundTintList());
            propertyReader.readObject(this.f1140g, appCompatButton.getBackgroundTintMode());
            propertyReader.readObject(this.f1141h, appCompatButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1142i, appCompatButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new y(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.b();
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f1587c) {
            return super.getAutoSizeMaxTextSize();
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            return Math.round(h0Var.f1609i.f1641e);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f1587c) {
            return super.getAutoSizeMinTextSize();
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            return Math.round(h0Var.f1609i.f1640d);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f1587c) {
            return super.getAutoSizeStepGranularity();
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            return Math.round(h0Var.f1609i.f1639c);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f1587c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        h0 h0Var = this.mTextHelper;
        return h0Var != null ? h0Var.f1609i.f1642f : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (ViewUtils.f1587c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            return h0Var.f1609i.f1637a;
        }
        return 0;
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
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1700b.isEnabled();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h0 h0Var = this.mTextHelper;
        if (h0Var == null || ViewUtils.f1587c) {
            return;
        }
        h0Var.f1609i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h0 h0Var = this.mTextHelper;
        if (h0Var == null || ViewUtils.f1587c || !h0Var.f1609i.f()) {
            return;
        }
        this.mTextHelper.f1609i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (ViewUtils.f1587c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (ViewUtils.f1587c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (ViewUtils.f1587c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.g(i10);
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1700b.getFilters(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.f1601a.setAllCaps(z10);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.mBackgroundTintHelper;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f6) {
        boolean z10 = ViewUtils.f1587c;
        if (z10) {
            super.setTextSize(i10, f6);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var == null || z10) {
            return;
        }
        k0 k0Var = h0Var.f1609i;
        if (k0Var.f()) {
            return;
        }
        k0Var.g(f6, i10);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        k kVar = new k(this);
        this.mBackgroundTintHelper = kVar;
        kVar.e(attributeSet, i10);
        h0 h0Var = new h0(this);
        this.mTextHelper = h0Var;
        h0Var.f(attributeSet, i10);
        h0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }
}
