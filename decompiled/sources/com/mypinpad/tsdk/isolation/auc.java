package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class auc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53873b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f53874a;

    public auc(BigInteger bigInteger, BigInteger bigInteger2, aud audVar) {
        this.f53874a = bigInteger;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        auc aucVar = (auc) objArr[0];
        int i13 = f53873b;
        int i14 = (i13 & (-54)) | ((~i13) & 53);
        int i15 = -(-((i13 & 53) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        BigInteger bigInteger = aucVar.f53874a;
        if (i18 == 0) {
            int i19 = 83 / 0;
        }
        int i20 = i17 + 43;
        f53873b = i20 % 128;
        if (i20 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public final BigInteger setX() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -315634745, 315634745, System.identityHashCode(this));
    }
}
