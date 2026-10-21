package com.bbva.cells.component.kit.ui.resource;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceColorList implements ColorStable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f26706b;

    public ResourceColorList(int i10) {
        this.f26705a = i10;
    }

    @Override // com.bbva.cells.component.kit.ui.resource.ColorStable
    public ColorStateList toColorStateList(Context context) {
        ColorStateList colorStateList = this.f26706b;
        return colorStateList == null ? ContextCompat.getColorStateList(context, this.f26705a) : colorStateList;
    }

    public ResourceColorList(ColorStateList colorStateList) {
        this.f26706b = colorStateList;
    }
}
