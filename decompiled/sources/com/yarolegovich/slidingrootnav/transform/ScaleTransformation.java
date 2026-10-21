package com.yarolegovich.slidingrootnav.transform;

import android.view.View;
import com.yarolegovich.slidingrootnav.util.SideNavUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ScaleTransformation implements RootTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68106a;

    public ScaleTransformation(float f6) {
        this.f68106a = f6;
    }

    @Override // com.yarolegovich.slidingrootnav.transform.RootTransformation
    public void transform(float f6, View view) {
        float fEvaluate = SideNavUtils.evaluate(f6, 1.0f, this.f68106a);
        view.setScaleX(fEvaluate);
        view.setScaleY(fEvaluate);
    }
}
