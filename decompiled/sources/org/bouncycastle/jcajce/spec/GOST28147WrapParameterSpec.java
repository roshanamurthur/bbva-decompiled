package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class GOST28147WrapParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f90270c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f90272b;

    static {
        HashMap map = new HashMap();
        f90270c = map;
        map.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, "E-A");
        map.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet, "E-B");
        map.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet, "E-C");
        map.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet, "E-D");
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, "Param-Z");
    }

    public GOST28147WrapParameterSpec(String str) {
        this.f90271a = null;
        this.f90272b = null;
        this.f90272b = GOST28147Engine.getSBox(str);
    }

    public byte[] getSBox() {
        return Arrays.clone(this.f90272b);
    }

    public byte[] getUKM() {
        return Arrays.clone(this.f90271a);
    }

    public GOST28147WrapParameterSpec(String str, byte[] bArr) {
        this(str);
        byte[] bArr2 = new byte[bArr.length];
        this.f90271a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GOST28147WrapParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        String str = (String) f90270c.get(aSN1ObjectIdentifier);
        if (str != null) {
            this(str);
            this.f90271a = Arrays.clone(bArr);
        } else {
            throw new IllegalArgumentException("unknown OID: " + aSN1ObjectIdentifier);
        }
    }

    public GOST28147WrapParameterSpec(byte[] bArr) {
        this.f90271a = null;
        this.f90272b = null;
        byte[] bArr2 = new byte[bArr.length];
        this.f90272b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public GOST28147WrapParameterSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.f90271a = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }
}
