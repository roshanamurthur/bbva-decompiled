package com.yarolegovich.slidingrootnav.transform;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CompositeTransformation implements RootTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<RootTransformation> f68104a;

    public CompositeTransformation(List<RootTransformation> list) {
        this.f68104a = list;
    }

    @Override // com.yarolegovich.slidingrootnav.transform.RootTransformation
    public void transform(float f6, View view) {
        Iterator<RootTransformation> it = this.f68104a.iterator();
        while (it.hasNext()) {
            it.next().transform(f6, view);
        }
    }
}
