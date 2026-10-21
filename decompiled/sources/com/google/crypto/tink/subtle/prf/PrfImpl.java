package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class PrfImpl implements Prf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreamingPrf f47516a;

    public PrfImpl(StreamingPrf streamingPrf) {
        this.f47516a = streamingPrf;
    }

    public static PrfImpl wrap(StreamingPrf streamingPrf) {
        return new PrfImpl(streamingPrf);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i10) throws GeneralSecurityException {
        if (bArr == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        }
        if (i10 <= 0) {
            throw new GeneralSecurityException("Invalid outputLength specified.");
        }
        InputStream inputStreamComputePrf = this.f47516a.computePrf(bArr);
        try {
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStreamComputePrf.read(bArr2, i11, i10 - i11);
                if (i12 <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i11 += i12;
            }
            return bArr2;
        } catch (IOException e5) {
            throw new GeneralSecurityException(e5);
        }
    }
}
