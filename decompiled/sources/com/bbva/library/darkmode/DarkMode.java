package com.bbva.library.darkmode;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: DarkMode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/library/darkmode/DarkMode;", "", "", "value", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "FORCE_ON", "FORCE_OFF", "FORCE_AUTO", "darkmode_release"}, k = 1, mv = {1, 4, 0})
public enum DarkMode {
    FORCE_ON(2),
    FORCE_OFF(0),
    FORCE_AUTO(1);

    private final int value;

    DarkMode(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
