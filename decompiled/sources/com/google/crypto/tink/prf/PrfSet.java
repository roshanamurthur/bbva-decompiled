package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public abstract class PrfSet {
    public byte[] computePrimary(byte[] bArr, int i10) throws GeneralSecurityException {
        return getPrfs().get(Integer.valueOf(getPrimaryId())).compute(bArr, i10);
    }

    public abstract Map<Integer, Prf> getPrfs() throws GeneralSecurityException;

    public abstract int getPrimaryId();
}
