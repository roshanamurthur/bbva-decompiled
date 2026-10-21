package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public final void a(@Nullable AttributeSet attributeSet, int i10, int i11) {
        Context context = getContext();
        if (MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = R.styleable.MaterialTextView;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int[] iArr2 = {R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight};
            int dimensionPixelSize = -1;
            for (int i12 = 0; i12 < 2 && dimensionPixelSize < 0; i12++) {
                dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, iArr2[i12], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, R.styleable.MaterialTextAppearance);
                Context context2 = getContext();
                int[] iArr3 = {R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight};
                int dimensionPixelSize2 = -1;
                for (int i13 = 0; i13 < 2 && dimensionPixelSize2 < 0; i13++) {
                    dimensionPixelSize2 = MaterialResources.getDimensionPixelSize(context2, typedArrayObtainStyledAttributes3, iArr3[i13], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (dimensionPixelSize2 >= 0) {
                    setLineHeight(dimensionPixelSize2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, R.styleable.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight};
            int dimensionPixelSize = -1;
            for (int i11 = 0; i11 < 2 && dimensionPixelSize < 0; i11++) {
                dimensionPixelSize = MaterialResources.getDimensionPixelSize(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (dimensionPixelSize >= 0) {
                setLineHeight(dimensionPixelSize);
            }
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        a(attributeSet, i10, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        a(attributeSet, i10, i11);
    }
}
