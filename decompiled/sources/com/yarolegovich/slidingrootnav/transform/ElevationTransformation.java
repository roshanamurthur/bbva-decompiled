package com.yarolegovich.slidingrootnav.transform;

import android.view.View;
import com.yarolegovich.slidingrootnav.util.SideNavUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ElevationTransformation implements RootTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68105a;

    public ElevationTransformation(float f6) {
        this.f68105a = f6;
    }

    @Override // com.yarolegovich.slidingrootnav.transform.RootTransformation
    public void transform(float f6, View view) {
        view.setElevation(SideNavUtils.evaluate(f6, 0.0f, this.f68105a));
    }
}
