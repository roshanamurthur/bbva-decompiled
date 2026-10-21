package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class KTSParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlgorithmParameterSpec f90278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmIdentifier f90279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f90280e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AlgorithmParameterSpec f90283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AlgorithmIdentifier f90284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f90285e;

        public Builder(String str, int i10) {
            this(str, i10, null);
        }

        public KTSParameterSpec build() {
            return new KTSParameterSpec(this.f90281a, this.f90282b, this.f90283c, this.f90284d, this.f90285e);
        }

        public Builder withKdfAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
            this.f90284d = algorithmIdentifier;
            return this;
        }

        public Builder withParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
            this.f90283c = algorithmParameterSpec;
            return this;
        }

        public Builder(String str, int i10, byte[] bArr) {
            this.f90281a = str;
            this.f90282b = i10;
            this.f90284d = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));
            this.f90285e = bArr == null ? new byte[0] : Arrays.clone(bArr);
        }
    }

    public KTSParameterSpec(String str, int i10, AlgorithmParameterSpec algorithmParameterSpec, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f90276a = str;
        this.f90277b = i10;
        this.f90278c = algorithmParameterSpec;
        this.f90279d = algorithmIdentifier;
        this.f90280e = bArr;
    }

    public AlgorithmIdentifier getKdfAlgorithm() {
        return this.f90279d;
    }

    public String getKeyAlgorithmName() {
        return this.f90276a;
    }

    public int getKeySize() {
        return this.f90277b;
    }

    public byte[] getOtherInfo() {
        return Arrays.clone(this.f90280e);
    }

    public AlgorithmParameterSpec getParameterSpec() {
        return this.f90278c;
    }
}
