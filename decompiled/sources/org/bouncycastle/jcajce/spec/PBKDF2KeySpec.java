package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes8.dex */
public class PBKDF2KeySpec extends PBEKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final AlgorithmIdentifier f90293q0 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA1, DERNull.INSTANCE);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f90294p0;

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i10, int i11, AlgorithmIdentifier algorithmIdentifier) {
        super(cArr, bArr, i10, i11);
        this.f90294p0 = algorithmIdentifier;
    }

    public AlgorithmIdentifier getPrf() {
        return this.f90294p0;
    }

    public boolean isDefaultPrf() {
        return f90293q0.equals(this.f90294p0);
    }
}
