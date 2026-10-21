package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* JADX INFO: loaded from: classes13.dex */
public class LMSigParameters {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f91118e;
    public static final LMSigParameters lms_sha256_n32_h10;
    public static final LMSigParameters lms_sha256_n32_h15;
    public static final LMSigParameters lms_sha256_n32_h20;
    public static final LMSigParameters lms_sha256_n32_h25;
    public static final LMSigParameters lms_sha256_n32_h5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ASN1ObjectIdentifier f91122d;

    public static class a extends HashMap<Object, LMSigParameters> {
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        LMSigParameters lMSigParameters = new LMSigParameters(5, 32, 5, aSN1ObjectIdentifier);
        lms_sha256_n32_h5 = lMSigParameters;
        LMSigParameters lMSigParameters2 = new LMSigParameters(6, 32, 10, aSN1ObjectIdentifier);
        lms_sha256_n32_h10 = lMSigParameters2;
        LMSigParameters lMSigParameters3 = new LMSigParameters(7, 32, 15, aSN1ObjectIdentifier);
        lms_sha256_n32_h15 = lMSigParameters3;
        LMSigParameters lMSigParameters4 = new LMSigParameters(8, 32, 20, aSN1ObjectIdentifier);
        lms_sha256_n32_h20 = lMSigParameters4;
        LMSigParameters lMSigParameters5 = new LMSigParameters(9, 32, 25, aSN1ObjectIdentifier);
        lms_sha256_n32_h25 = lMSigParameters5;
        a aVar = new a();
        aVar.put(Integer.valueOf(lMSigParameters.f91119a), lMSigParameters);
        aVar.put(Integer.valueOf(lMSigParameters2.f91119a), lMSigParameters2);
        aVar.put(Integer.valueOf(lMSigParameters3.f91119a), lMSigParameters3);
        aVar.put(Integer.valueOf(lMSigParameters4.f91119a), lMSigParameters4);
        aVar.put(Integer.valueOf(lMSigParameters5.f91119a), lMSigParameters5);
        f91118e = aVar;
    }

    public LMSigParameters(int i10, int i11, int i12, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f91119a = i10;
        this.f91120b = i11;
        this.f91121c = i12;
        this.f91122d = aSN1ObjectIdentifier;
    }

    public ASN1ObjectIdentifier getDigestOID() {
        return this.f91122d;
    }

    public int getH() {
        return this.f91121c;
    }

    public int getM() {
        return this.f91120b;
    }

    public int getType() {
        return this.f91119a;
    }
}
