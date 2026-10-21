package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.bbva.nativesettings.common.Constants;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    private final k mBackgroundTintHelper;

    @NonNull
    private y mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;

    @Nullable
    private a mSuperCaller;
    private final f0 mTextClassifierHelper;
    private final h0 mTextHelper;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1258a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1266i;

        /* JADX INFO: compiled from: AppCompatTextView$InspectionCompanion.java */
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
            this.f1259b = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.f1260c = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.f1261d = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.f1262e = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new a());
            this.f1263f = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1264g = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1265h = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f1266i = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f1258a = true;
        }

        public void readProperties(@NonNull AppCompatTextView appCompatTextView, @NonNull PropertyReader propertyReader) {
            if (!this.f1258a) {
                throw j.c();
            }
            propertyReader.readInt(this.f1259b, appCompatTextView.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.f1260c, appCompatTextView.getAutoSizeMinTextSize());
            propertyReader.readInt(this.f1261d, appCompatTextView.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.f1262e, appCompatTextView.getAutoSizeTextType());
            propertyReader.readObject(this.f1263f, appCompatTextView.getBackgroundTintList());
            propertyReader.readObject(this.f1264g, appCompatTextView.getBackgroundTintMode());
            propertyReader.readObject(this.f1265h, appCompatTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1266i, appCompatTextView.getCompoundDrawableTintMode());
        }
    }

    public interface a {
        void a(@Px int i10);

        void b(int i10, @FloatRange(from = 0.0d) float f6);

        void c(@Px int i10);
    }

    @RequiresApi(api = 28)
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(@Px int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(@Px int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    @RequiresApi(api = 34)
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i10, float f6) {
            AppCompatTextView.super.setLineHeight(i10, f6);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new y(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    @RequiresApi(api = 26)
    @UiThread
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        f0 f0Var;
        if (Build.VERSION.SDK_INT >= 28 || (f0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = f0Var.f1599b;
        return textClassifier == null ? f0.a.a(f0Var.f1598a) : textClassifier;
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.getTextMetricsParams(this);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1700b.isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, getText());
        }
        z.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService(Constants.INPUT_METHOD)).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1700b.getFilters(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @Px int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i10);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @Px int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0) @Px int i10) {
        TextViewCompat.setLineHeight(this, i10);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.setPrecomputedText(this, precomputedTextCompat);
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        f0 f0Var;
        if (Build.VERSION.SDK_INT >= 28 || (f0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f0Var.f1599b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        TextViewCompat.setTextMetricsParams(this, params);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceCreate = (typeface == null || i10 <= 0) ? null : TypefaceCompat.create(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, @FloatRange(from = 0.0d) float f6) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().b(i10, f6);
        } else {
            TextViewCompat.setLineHeight(this, i10, f6);
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        k kVar = new k(this);
        this.mBackgroundTintHelper = kVar;
        kVar.e(attributeSet, i10);
        h0 h0Var = new h0(this);
        this.mTextHelper = h0Var;
        h0Var.f(attributeSet, i10);
        h0Var.b();
        this.mTextClassifierHelper = new f0(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AppCompatResources.getDrawable(context, i10) : null, i11 != 0 ? AppCompatResources.getDrawable(context, i11) : null, i12 != 0 ? AppCompatResources.getDrawable(context, i12) : null, i13 != 0 ? AppCompatResources.getDrawable(context, i13) : null);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AppCompatResources.getDrawable(context, i10) : null, i11 != 0 ? AppCompatResources.getDrawable(context, i11) : null, i12 != 0 ? AppCompatResources.getDrawable(context, i12) : null, i13 != 0 ? AppCompatResources.getDrawable(context, i13) : null);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @RequiresApi(api = 26)
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10, float f6) {
        }
    }
}
