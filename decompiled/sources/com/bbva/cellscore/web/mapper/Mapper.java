package com.bbva.cellscore.web.mapper;

/* JADX INFO: loaded from: classes2.dex */
public interface Mapper<M, D> {
    M dataToModel(D d2);

    D modelToData(M m);
}
