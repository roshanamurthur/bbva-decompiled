package com.google.crypto.tink.mac.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.ChunkedMac;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.mac.ChunkedMacVerification;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import jf.a;
import jf.b;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class ChunkedAesCmacImpl implements ChunkedMac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f46811b = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesCmacKey f46812a;

    public ChunkedAesCmacImpl(AesCmacKey aesCmacKey) throws GeneralSecurityException {
        if (!f46811b.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f46812a = aesCmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacComputation createComputation() throws GeneralSecurityException {
        return new a(this.f46812a);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public ChunkedMacVerification createVerification(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        AesCmacKey aesCmacKey = this.f46812a;
        if (length < aesCmacKey.getOutputPrefix().size()) {
            throw new GeneralSecurityException("Tag too short");
        }
        if (aesCmacKey.getOutputPrefix().equals(Bytes.copyFrom(bArr, 0, aesCmacKey.getOutputPrefix().size()))) {
            return new b(aesCmacKey, bArr);
        }
        throw new GeneralSecurityException("Wrong tag prefix");
    }
}
