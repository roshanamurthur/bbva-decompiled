package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialThemeOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f45706a = {R.attr.theme, com.google.android.material.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f45707b = {com.google.android.material.R.attr.materialThemeOverlay};

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45707b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z10 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == resourceId;
        if (resourceId == 0 || z10) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f45706a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return contextThemeWrapper;
    }
}
