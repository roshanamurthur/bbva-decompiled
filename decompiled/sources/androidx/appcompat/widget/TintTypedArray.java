package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TintTypedArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f1501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1502c;

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static int b(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f1500a = context;
        this.f1501b = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i10, boolean z10) {
        return this.f1501b.getBoolean(i10, z10);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return a.a(this.f1501b);
    }

    public int getColor(int i10, int i11) {
        return this.f1501b.getColor(i10, i11);
    }

    public ColorStateList getColorStateList(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f1501b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(this.f1500a, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public float getDimension(int i10, float f6) {
        return this.f1501b.getDimension(i10, f6);
    }

    public int getDimensionPixelOffset(int i10, int i11) {
        return this.f1501b.getDimensionPixelOffset(i10, i11);
    }

    public int getDimensionPixelSize(int i10, int i11) {
        return this.f1501b.getDimensionPixelSize(i10, i11);
    }

    public Drawable getDrawable(int i10) {
        int resourceId;
        TypedArray typedArray = this.f1501b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : AppCompatResources.getDrawable(this.f1500a, resourceId);
    }

    public Drawable getDrawableIfKnown(int i10) {
        int resourceId;
        Drawable drawableD;
        if (!this.f1501b.hasValue(i10) || (resourceId = this.f1501b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        Context context = this.f1500a;
        synchronized (appCompatDrawableManager) {
            drawableD = appCompatDrawableManager.f1167a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public float getFloat(int i10, float f6) {
        return this.f1501b.getFloat(i10, f6);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int i10, int i11, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1501b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1502c == null) {
            this.f1502c = new TypedValue();
        }
        return ResourcesCompat.getFont(this.f1500a, resourceId, this.f1502c, i11, fontCallback);
    }

    public float getFraction(int i10, int i11, int i12, float f6) {
        return this.f1501b.getFraction(i10, i11, i12, f6);
    }

    public int getIndex(int i10) {
        return this.f1501b.getIndex(i10);
    }

    public int getIndexCount() {
        return this.f1501b.getIndexCount();
    }

    public int getInt(int i10, int i11) {
        return this.f1501b.getInt(i10, i11);
    }

    public int getInteger(int i10, int i11) {
        return this.f1501b.getInteger(i10, i11);
    }

    public int getLayoutDimension(int i10, String str) {
        return this.f1501b.getLayoutDimension(i10, str);
    }

    public String getNonResourceString(int i10) {
        return this.f1501b.getNonResourceString(i10);
    }

    public String getPositionDescription() {
        return this.f1501b.getPositionDescription();
    }

    public int getResourceId(int i10, int i11) {
        return this.f1501b.getResourceId(i10, i11);
    }

    public Resources getResources() {
        return this.f1501b.getResources();
    }

    public String getString(int i10) {
        return this.f1501b.getString(i10);
    }

    public CharSequence getText(int i10) {
        return this.f1501b.getText(i10);
    }

    public CharSequence[] getTextArray(int i10) {
        return this.f1501b.getTextArray(i10);
    }

    public int getType(int i10) {
        return a.b(this.f1501b, i10);
    }

    public boolean getValue(int i10, TypedValue typedValue) {
        return this.f1501b.getValue(i10, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.f1501b;
    }

    public boolean hasValue(int i10) {
        return this.f1501b.hasValue(i10);
    }

    public int length() {
        return this.f1501b.length();
    }

    public TypedValue peekValue(int i10) {
        return this.f1501b.peekValue(i10);
    }

    public void recycle() {
        this.f1501b.recycle();
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public int getLayoutDimension(int i10, int i11) {
        return this.f1501b.getLayoutDimension(i10, i11);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i10, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i10, iArr));
    }
}
