package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* JADX INFO: loaded from: classes13.dex */
public class LMOtsParameters {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f91091h;
    public static final int reserved = 0;
    public static final LMOtsParameters sha256_n32_w1;
    public static final LMOtsParameters sha256_n32_w2;
    public static final LMOtsParameters sha256_n32_w4;
    public static final LMOtsParameters sha256_n32_w8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ASN1ObjectIdentifier f91098g;

    public static class a extends HashMap<Object, LMOtsParameters> {
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        LMOtsParameters lMOtsParameters = new LMOtsParameters(1, 32, 1, 265, 7, 8516, aSN1ObjectIdentifier);
        sha256_n32_w1 = lMOtsParameters;
        LMOtsParameters lMOtsParameters2 = new LMOtsParameters(2, 32, 2, 133, 6, 4292, aSN1ObjectIdentifier);
        sha256_n32_w2 = lMOtsParameters2;
        LMOtsParameters lMOtsParameters3 = new LMOtsParameters(3, 32, 4, 67, 4, 2180, aSN1ObjectIdentifier);
        sha256_n32_w4 = lMOtsParameters3;
        LMOtsParameters lMOtsParameters4 = new LMOtsParameters(4, 32, 8, 34, 0, 1124, aSN1ObjectIdentifier);
        sha256_n32_w8 = lMOtsParameters4;
        a aVar = new a();
        aVar.put(Integer.valueOf(lMOtsParameters.f91092a), lMOtsParameters);
        aVar.put(Integer.valueOf(lMOtsParameters2.f91092a), lMOtsParameters2);
        aVar.put(Integer.valueOf(lMOtsParameters3.f91092a), lMOtsParameters3);
        aVar.put(Integer.valueOf(lMOtsParameters4.f91092a), lMOtsParameters4);
        f91091h = aVar;
    }

    public LMOtsParameters(int i10, int i11, int i12, int i13, int i14, int i15, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f91092a = i10;
        this.f91093b = i11;
        this.f91094c = i12;
        this.f91095d = i13;
        this.f91096e = i14;
        this.f91097f = i15;
        this.f91098g = aSN1ObjectIdentifier;
    }

    public static LMOtsParameters getParametersForType(int i10) {
        return f91091h.get(Integer.valueOf(i10));
    }

    public ASN1ObjectIdentifier getDigestOID() {
        return this.f91098g;
    }

    public int getLs() {
        return this.f91096e;
    }

    public int getN() {
        return this.f91093b;
    }

    public int getP() {
        return this.f91095d;
    }

    public int getSigLen() {
        return this.f91097f;
    }

    public int getType() {
        return this.f91092a;
    }

    public int getW() {
        return this.f91094c;
    }
}
