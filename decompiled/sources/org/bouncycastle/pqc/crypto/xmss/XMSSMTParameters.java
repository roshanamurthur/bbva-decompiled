package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTParameters {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<Integer, XMSSMTParameters> f91328e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultXMSSMTOid f91329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XMSSParameters f91330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91332d;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        com.google.android.gms.internal.mlkit_common.a.b(20, 4, aSN1ObjectIdentifier, map, Integers.valueOf(2));
        com.google.android.gms.internal.mlkit_common.a.b(40, 2, aSN1ObjectIdentifier, map, Integers.valueOf(3));
        com.google.android.gms.internal.mlkit_common.a.b(40, 4, aSN1ObjectIdentifier, map, Integers.valueOf(4));
        com.google.android.gms.internal.mlkit_common.a.b(40, 8, aSN1ObjectIdentifier, map, Integers.valueOf(5));
        com.google.android.gms.internal.mlkit_common.a.b(60, 3, aSN1ObjectIdentifier, map, Integers.valueOf(6));
        com.google.android.gms.internal.mlkit_common.a.b(60, 6, aSN1ObjectIdentifier, map, Integers.valueOf(7));
        com.google.android.gms.internal.mlkit_common.a.b(60, 12, aSN1ObjectIdentifier, map, Integers.valueOf(8));
        Integer numValueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        com.google.android.gms.internal.mlkit_common.a.b(20, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(10));
        com.google.android.gms.internal.mlkit_common.a.b(40, 2, aSN1ObjectIdentifier2, map, Integers.valueOf(11));
        com.google.android.gms.internal.mlkit_common.a.b(40, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(12));
        com.google.android.gms.internal.mlkit_common.a.b(40, 8, aSN1ObjectIdentifier2, map, Integers.valueOf(13));
        com.google.android.gms.internal.mlkit_common.a.b(60, 3, aSN1ObjectIdentifier2, map, Integers.valueOf(14));
        com.google.android.gms.internal.mlkit_common.a.b(60, 6, aSN1ObjectIdentifier2, map, Integers.valueOf(15));
        com.google.android.gms.internal.mlkit_common.a.b(60, 12, aSN1ObjectIdentifier2, map, Integers.valueOf(16));
        Integer numValueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        com.google.android.gms.internal.mlkit_common.a.b(20, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(18));
        com.google.android.gms.internal.mlkit_common.a.b(40, 2, aSN1ObjectIdentifier3, map, Integers.valueOf(19));
        com.google.android.gms.internal.mlkit_common.a.b(40, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(20));
        com.google.android.gms.internal.mlkit_common.a.b(40, 8, aSN1ObjectIdentifier3, map, Integers.valueOf(21));
        com.google.android.gms.internal.mlkit_common.a.b(60, 3, aSN1ObjectIdentifier3, map, Integers.valueOf(22));
        com.google.android.gms.internal.mlkit_common.a.b(60, 6, aSN1ObjectIdentifier3, map, Integers.valueOf(23));
        com.google.android.gms.internal.mlkit_common.a.b(60, 12, aSN1ObjectIdentifier3, map, Integers.valueOf(24));
        Integer numValueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        com.google.android.gms.internal.mlkit_common.a.b(20, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(26));
        com.google.android.gms.internal.mlkit_common.a.b(40, 2, aSN1ObjectIdentifier4, map, Integers.valueOf(27));
        com.google.android.gms.internal.mlkit_common.a.b(40, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(28));
        com.google.android.gms.internal.mlkit_common.a.b(40, 8, aSN1ObjectIdentifier4, map, Integers.valueOf(29));
        com.google.android.gms.internal.mlkit_common.a.b(60, 3, aSN1ObjectIdentifier4, map, Integers.valueOf(30));
        com.google.android.gms.internal.mlkit_common.a.b(60, 6, aSN1ObjectIdentifier4, map, Integers.valueOf(31));
        com.google.android.gms.internal.mlkit_common.a.b(60, 12, aSN1ObjectIdentifier4, map, Integers.valueOf(32));
        f91328e = Collections.unmodifiableMap(map);
    }

    public XMSSMTParameters(int i10, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f91331c = i10;
        this.f91332d = i11;
        if (i10 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i10 % i11 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i12 = i10 / i11;
        if (i12 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        XMSSParameters xMSSParameters = new XMSSParameters(i12, aSN1ObjectIdentifier);
        this.f91330b = xMSSParameters;
        this.f91329a = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), xMSSParameters.f91380e, getLen(), getHeight(), i11);
    }

    public static XMSSMTParameters lookupByOID(int i10) {
        return f91328e.get(Integers.valueOf(i10));
    }

    public int getHeight() {
        return this.f91331c;
    }

    public int getLayers() {
        return this.f91332d;
    }

    public int getLen() {
        return this.f91330b.f91383h.f95107c;
    }

    public XMSSOid getOid() {
        return this.f91329a;
    }

    public String getTreeDigest() {
        return this.f91330b.f91381f;
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.f91330b.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.f91330b.getTreeDigestSize();
    }

    public b getWOTSPlus() {
        return this.f91330b.a();
    }

    public XMSSParameters getXMSSParameters() {
        return this.f91330b;
    }

    public XMSSMTParameters(int i10, int i11, Digest digest) {
        this(i10, i11, zm.a.b(digest.getAlgorithmName()));
    }
}
