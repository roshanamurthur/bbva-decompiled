package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSParameters {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<Integer, XMSSParameters> f91375i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultXMSSOid f91376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ASN1ObjectIdentifier f91379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f91381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zm.d f91383h;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSParameters(10, aSN1ObjectIdentifier));
        map.put(Integers.valueOf(2), new XMSSParameters(16, aSN1ObjectIdentifier));
        map.put(Integers.valueOf(3), new XMSSParameters(20, aSN1ObjectIdentifier));
        Integer numValueOf2 = Integers.valueOf(4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSParameters(10, aSN1ObjectIdentifier2));
        map.put(Integers.valueOf(5), new XMSSParameters(16, aSN1ObjectIdentifier2));
        map.put(Integers.valueOf(6), new XMSSParameters(20, aSN1ObjectIdentifier2));
        Integer numValueOf3 = Integers.valueOf(7);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSParameters(10, aSN1ObjectIdentifier3));
        map.put(Integers.valueOf(8), new XMSSParameters(16, aSN1ObjectIdentifier3));
        map.put(Integers.valueOf(9), new XMSSParameters(20, aSN1ObjectIdentifier3));
        Integer numValueOf4 = Integers.valueOf(10);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSParameters(10, aSN1ObjectIdentifier4));
        map.put(Integers.valueOf(11), new XMSSParameters(16, aSN1ObjectIdentifier4));
        map.put(Integers.valueOf(12), new XMSSParameters(20, aSN1ObjectIdentifier4));
        f91375i = Collections.unmodifiableMap(map);
    }

    public XMSSParameters(int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i10 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("digest == null");
        }
        this.f91377b = i10;
        int i11 = 2;
        while (true) {
            int i12 = this.f91377b;
            if (i11 > i12) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i12 - i11) % 2 == 0) {
                this.f91378c = i11;
                String str = (String) zm.a.f95099b.get(aSN1ObjectIdentifier);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: " + aSN1ObjectIdentifier);
                }
                this.f91381f = str;
                this.f91379d = aSN1ObjectIdentifier;
                zm.d dVar = new zm.d(aSN1ObjectIdentifier);
                this.f91383h = dVar;
                int i13 = dVar.f95105a;
                this.f91382g = i13;
                int i14 = dVar.f95106b;
                this.f91380e = i14;
                this.f91376a = DefaultXMSSOid.lookup(str, i13, i14, dVar.f95107c, i10);
                return;
            }
            i11++;
        }
    }

    public static XMSSParameters lookupByOID(int i10) {
        return f91375i.get(Integers.valueOf(i10));
    }

    public final b a() {
        return new b(this.f91383h);
    }

    public int getHeight() {
        return this.f91377b;
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.f91379d;
    }

    public int getTreeDigestSize() {
        return this.f91382g;
    }

    public XMSSParameters(int i10, Digest digest) {
        this(i10, zm.a.b(digest.getAlgorithmName()));
    }
}
