package org.bouncycastle.asn1.eac;

import androidx.camera.core.processing.f;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes12.dex */
public class CertificateHolderAuthorization extends ASN1Object {
    public static final int CVCA = 192;
    public static final int DV_DOMESTIC = 128;
    public static final int DV_FOREIGN = 64;
    public static final int IS = 0;
    public static final int RADG3 = 1;
    public static final int RADG4 = 2;
    public static final ASN1ObjectIdentifier id_role_EAC = EACObjectIdentifiers.bsi_de.branch("3.1.2.1");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final BidirectionalMap f87173r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87174p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1ApplicationSpecific f87175q0;

    static {
        Hashtable hashtable = new Hashtable();
        BidirectionalMap bidirectionalMap = new BidirectionalMap();
        f87173r0 = bidirectionalMap;
        new Hashtable();
        hashtable.put(Integers.valueOf(2), "RADG4");
        hashtable.put(Integers.valueOf(1), "RADG3");
        bidirectionalMap.put(Integers.valueOf(192), "CVCA");
        bidirectionalMap.put(Integers.valueOf(128), "DV_DOMESTIC");
        bidirectionalMap.put(Integers.valueOf(64), "DV_FOREIGN");
        bidirectionalMap.put(Integers.valueOf(0), "IS");
    }

    public CertificateHolderAuthorization(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 76) {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
            ASN1Primitive object = aSN1InputStream.readObject();
            if (!(object instanceof ASN1ObjectIdentifier)) {
                throw new IllegalArgumentException("no Oid in CerticateHolderAuthorization");
            }
            this.f87174p0 = (ASN1ObjectIdentifier) object;
            ASN1Primitive object2 = aSN1InputStream.readObject();
            if (!(object2 instanceof ASN1ApplicationSpecific)) {
                throw new IllegalArgumentException("No access rights in CerticateHolderAuthorization");
            }
            this.f87175q0 = (ASN1ApplicationSpecific) object2;
        }
    }

    public static int getFlag(String str) {
        Integer num = (Integer) f87173r0.getReverse(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(f.d("Unknown value ", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getRoleDescription(int i10) {
        return (String) f87173r0.get(Integers.valueOf(i10));
    }

    public int getAccessRights() {
        return this.f87175q0.getContents()[0] & 255;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.f87174p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87174p0);
        aSN1EncodableVector.add(this.f87175q0);
        return new DERApplicationSpecific(76, aSN1EncodableVector);
    }

    public CertificateHolderAuthorization(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10) throws IOException {
        this.f87174p0 = aSN1ObjectIdentifier;
        this.f87175q0 = new DERApplicationSpecific(19, new byte[]{(byte) i10});
    }
}
