package org.bouncycastle.asn1.icao;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class LDSSecurityObject extends ASN1Object implements ICAOObjectIdentifiers {
    public static final int ub_DataGroups = 16;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87276p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87277q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DataGroupHash[] f87278r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LDSVersionInfo f87279s0;

    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr) {
        this.f87276p0 = new ASN1Integer(0L);
        this.f87276p0 = new ASN1Integer(0L);
        this.f87277q0 = algorithmIdentifier;
        int length = dataGroupHashArr.length;
        DataGroupHash[] dataGroupHashArr2 = new DataGroupHash[length];
        System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        this.f87278r0 = dataGroupHashArr2;
        a(dataGroupHashArr.length);
    }

    public static void a(int i10) {
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        }
    }

    public static LDSSecurityObject getInstance(Object obj) {
        if (obj instanceof LDSSecurityObject) {
            return (LDSSecurityObject) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        LDSSecurityObject lDSSecurityObject = new LDSSecurityObject();
        lDSSecurityObject.f87276p0 = new ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new IllegalArgumentException("null or empty sequence passed.");
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(objects.nextElement());
        lDSSecurityObject.f87276p0 = aSN1Integer;
        lDSSecurityObject.f87277q0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objects.nextElement());
        if (aSN1Integer.intValueExact() == 1) {
            lDSSecurityObject.f87279s0 = LDSVersionInfo.getInstance(objects.nextElement());
        }
        a(aSN1Sequence2.size());
        lDSSecurityObject.f87278r0 = new DataGroupHash[aSN1Sequence2.size()];
        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
            lDSSecurityObject.f87278r0[i10] = DataGroupHash.getInstance(aSN1Sequence2.getObjectAt(i10));
        }
        return lDSSecurityObject;
    }

    public DataGroupHash[] getDatagroupHash() {
        DataGroupHash[] dataGroupHashArr = this.f87278r0;
        int length = dataGroupHashArr.length;
        DataGroupHash[] dataGroupHashArr2 = new DataGroupHash[length];
        System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        return dataGroupHashArr2;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.f87277q0;
    }

    public int getVersion() {
        return this.f87276p0.intValueExact();
    }

    public LDSVersionInfo getVersionInfo() {
        return this.f87279s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87276p0);
        aSN1EncodableVector.add(this.f87277q0);
        aSN1EncodableVector.add(new DERSequence(this.f87278r0));
        LDSVersionInfo lDSVersionInfo = this.f87279s0;
        if (lDSVersionInfo != null) {
            aSN1EncodableVector.add(lDSVersionInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr, LDSVersionInfo lDSVersionInfo) {
        this.f87276p0 = new ASN1Integer(0L);
        this.f87276p0 = new ASN1Integer(1L);
        this.f87277q0 = algorithmIdentifier;
        int length = dataGroupHashArr.length;
        DataGroupHash[] dataGroupHashArr2 = new DataGroupHash[length];
        System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        this.f87278r0 = dataGroupHashArr2;
        this.f87279s0 = lDSVersionInfo;
        a(dataGroupHashArr.length);
    }
}
