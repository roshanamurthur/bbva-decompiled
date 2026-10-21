package com.bbva.cells.component.kit.datamanager.mapper;

/* JADX INFO: loaded from: classes2.dex */
public interface Mapper<M, D> {
    D toData(M m);

    M toModel(D d2);
}
