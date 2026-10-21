package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ColorStateList f45096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @FontRes
    public final int f45098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45099d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Typeface f45100e;

    @Nullable
    public final String fontFamily;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @Nullable
    public final ColorStateList textColorHint;

    @Nullable
    public final ColorStateList textColorLink;
    public final int textStyle;
    public final int typeface;

    public class a extends ResourcesCompat.FontCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextAppearanceFontCallback f45101a;

        public a(TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f45101a = textAppearanceFontCallback;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i10) {
            TextAppearance.this.f45099d = true;
            this.f45101a.onFontRetrievalFailed(i10);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
            TextAppearance textAppearance = TextAppearance.this;
            textAppearance.f45100e = Typeface.create(typeface, textAppearance.textStyle);
            textAppearance.f45099d = true;
            this.f45101a.onFontRetrieved(textAppearance.f45100e, false);
        }
    }

    public class b extends TextAppearanceFontCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f45104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextAppearanceFontCallback f45105c;

        public b(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f45103a = context;
            this.f45104b = textPaint;
            this.f45105c = textAppearanceFontCallback;
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrievalFailed(int i10) {
            this.f45105c.onFontRetrievalFailed(i10);
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
            TextAppearance.this.updateTextPaintMeasureState(this.f45103a, this.f45104b, typeface);
            this.f45105c.onFontRetrieved(typeface, z10);
        }
    }

    public TextAppearance(@NonNull Context context, @StyleRes int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i11 = R.styleable.TextAppearance_fontFamily;
        i11 = typedArrayObtainStyledAttributes.hasValue(i11) ? i11 : R.styleable.TextAppearance_android_fontFamily;
        this.f45098c = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(i11);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, R.styleable.MaterialTextAppearance);
        int i12 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(i12);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(i12, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f45100e == null && (str = this.fontFamily) != null) {
            this.f45100e = Typeface.create(str, this.textStyle);
        }
        if (this.f45100e == null) {
            int i10 = this.typeface;
            if (i10 == 1) {
                this.f45100e = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f45100e = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f45100e = Typeface.DEFAULT;
            } else {
                this.f45100e = Typeface.MONOSPACE;
            }
            this.f45100e = Typeface.create(this.f45100e, this.textStyle);
        }
    }

    public Typeface getFallbackFont() {
        a();
        return this.f45100e;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.f45099d) {
            return this.f45100e;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f45098c);
                this.f45100e = font;
                if (font != null) {
                    this.f45100e = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f45099d = true;
        return this.f45100e;
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new b(context, textPaint, textAppearanceFontCallback));
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.f45096a;
    }

    public float getTextSize() {
        return this.f45097b;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.f45096a = colorStateList;
    }

    public void setTextSize(float f6) {
        this.f45097b = f6;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f45096a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f6 = this.shadowRadius;
        float f10 = this.shadowDx;
        float f11 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f6, f10, f11, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (!TextAppearanceConfig.shouldLoadFontSynchronously()) {
            int i10 = this.f45098c;
            if ((i10 != 0 ? ResourcesCompat.getCachedFont(context, i10) : null) == null) {
                getFontAsync(context, textPaint, textAppearanceFontCallback);
                return;
            }
        }
        updateTextPaintMeasureState(context, textPaint, getFont(context));
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f45097b);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public void getFontAsync(@NonNull Context context, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        boolean zShouldLoadFontSynchronously = TextAppearanceConfig.shouldLoadFontSynchronously();
        int i10 = this.f45098c;
        if (!zShouldLoadFontSynchronously) {
            if ((i10 != 0 ? ResourcesCompat.getCachedFont(context, i10) : null) != null) {
                getFont(context);
            } else {
                a();
            }
        } else {
            getFont(context);
        }
        if (i10 == 0) {
            this.f45099d = true;
        }
        if (this.f45099d) {
            textAppearanceFontCallback.onFontRetrieved(this.f45100e, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i10, new a(textAppearanceFontCallback), null);
        } catch (Resources.NotFoundException unused) {
            this.f45099d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception unused2) {
            this.f45099d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }
}
