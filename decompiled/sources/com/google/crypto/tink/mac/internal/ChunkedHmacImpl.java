package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.mac.ChunkedMac;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.mac.ChunkedMacVerification;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import jf.c;
import jf.d;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ChunkedHmacImpl implements ChunkedMac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f46813b = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HmacKey f46814a;

    public ChunkedHmacImpl(HmacKey hmacKey) throws GeneralSecurityException {
        if (!f46813b.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f46814a = hmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacComputation createComputation() throws GeneralSecurityException {
        return new c(this.f46814a);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacVerification createVerification(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        HmacKey hmacKey = this.f46814a;
        if (length < hmacKey.getOutputPrefix().size()) {
            throw new GeneralSecurityException("Tag too short");
        }
        if (hmacKey.getOutputPrefix().equals(Bytes.copyFrom(bArr, 0, hmacKey.getOutputPrefix().size()))) {
            return new d(hmacKey, bArr);
        }
        throw new GeneralSecurityException("Wrong tag prefix");
    }
}
