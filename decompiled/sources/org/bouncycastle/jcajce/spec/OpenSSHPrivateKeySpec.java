package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f90290p0;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        String str;
        super(bArr);
        byte b10 = bArr[0];
        if (b10 == 48) {
            str = "ASN.1";
        } else {
            if (b10 != 111) {
                throw new IllegalArgumentException("unknown byte encoding");
            }
            str = "OpenSSH";
        }
        this.f90290p0 = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f90290p0;
    }
}
