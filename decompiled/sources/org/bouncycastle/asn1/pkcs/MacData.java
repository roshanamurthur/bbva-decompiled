package org.bouncycastle.asn1.pkcs;

import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class MacData extends ASN1Object {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f87400s0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DigestInfo f87401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87402q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f87403r0;

    public MacData(DigestInfo digestInfo, byte[] bArr, int i10) {
        this.f87401p0 = digestInfo;
        this.f87402q0 = Arrays.clone(bArr);
        this.f87403r0 = BigInteger.valueOf(i10);
    }

    public static MacData getInstance(Object obj) {
        if (obj instanceof MacData) {
            return (MacData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MacData macData = new MacData();
        macData.f87401p0 = DigestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        macData.f87402q0 = a.c(aSN1Sequence, 1);
        macData.f87403r0 = aSN1Sequence.size() == 3 ? ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).getValue() : f87400s0;
        return macData;
    }

    public BigInteger getIterationCount() {
        return this.f87403r0;
    }

    public DigestInfo getMac() {
        return this.f87401p0;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.f87402q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87401p0);
        aSN1EncodableVector.add(new DEROctetString(this.f87402q0));
        BigInteger bigInteger = f87400s0;
        BigInteger bigInteger2 = this.f87403r0;
        if (!bigInteger2.equals(bigInteger)) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
