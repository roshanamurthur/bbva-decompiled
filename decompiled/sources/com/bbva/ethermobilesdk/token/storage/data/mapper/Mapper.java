package com.bbva.ethermobilesdk.token.storage.data.mapper;

import kotlin.Metadata;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/mapper/Mapper;", "D", "M", "", "toData", "model", "(Ljava/lang/Object;)Ljava/lang/Object;", "toModel", "data", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Mapper<D, M> {
    D toData(M model);

    M toModel(D data);
}
