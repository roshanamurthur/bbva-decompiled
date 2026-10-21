package com.bbva.cellscore.app;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public class PageContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<ComponentContainer> f26908a = new SparseArray<>();

    public ComponentContainer get(int i10) {
        SparseArray<ComponentContainer> sparseArray = this.f26908a;
        ComponentContainer componentContainer = sparseArray.get(i10);
        if (componentContainer != null) {
            return componentContainer;
        }
        ComponentContainer componentContainer2 = new ComponentContainer();
        sparseArray.put(i10, componentContainer2);
        return componentContainer2;
    }

    public void remove(int i10) {
        this.f26908a.remove(i10);
    }
}
