package org.bouncycastle.jcajce.spec;

import java.security.spec.EncodedKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class OpenSSHPublicKeySpec extends EncodedKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String[] f90291q0 = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f90292p0;

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i10 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i10 >= bArr.length) {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        String strFromByteArray = Strings.fromByteArray(Arrays.copyOfRange(bArr, 4, i10));
        this.f90292p0 = strFromByteArray;
        if (strFromByteArray.startsWith("ecdsa")) {
            return;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            if (f90291q0[i11].equals(this.f90292p0)) {
                return;
            }
        }
        throw new IllegalArgumentException("unrecognised public key type " + this.f90292p0);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }

    public String getType() {
        return this.f90292p0;
    }
}
