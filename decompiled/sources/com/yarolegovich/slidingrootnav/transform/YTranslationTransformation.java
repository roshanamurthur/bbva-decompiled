package com.yarolegovich.slidingrootnav.transform;

import android.view.View;
import com.yarolegovich.slidingrootnav.util.SideNavUtils;

/* JADX INFO: loaded from: classes7.dex */
public class YTranslationTransformation implements RootTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68107a;

    public YTranslationTransformation(float f6) {
        this.f68107a = f6;
    }

    @Override // com.yarolegovich.slidingrootnav.transform.RootTransformation
    public void transform(float f6, View view) {
        view.setTranslationY(SideNavUtils.evaluate(f6, 0.0f, this.f68107a));
    }
}
