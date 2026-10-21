package com.bbva.glomoutils;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoutils/Mapper;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "", "map", "input", "(Ljava/lang/Object;)Ljava/lang/Object;", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Mapper<I, O> {
    O map(I input);
}
