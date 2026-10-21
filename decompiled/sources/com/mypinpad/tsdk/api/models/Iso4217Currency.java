package com.mypinpad.tsdk.api.models;

import com.mypinpad.tsdk.api.errors.TerminalException;
import com.mypinpad.tsdk.isolation.nb;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "", "", "a", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNumericCode", "()I", "numericCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0})
public final class Iso4217Currency {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int numericCode;

    public Iso4217Currency(int i10) throws TerminalException {
        this.numericCode = i10;
        nb nbVar = nb.INSTANCE;
        nb.setX(new Object[]{Integer.valueOf(i10)}, 1383735215, -1383735215, i10);
    }

    @JvmName(name = "getNumericCode")
    public final int getNumericCode() {
        return this.numericCode;
    }
}
