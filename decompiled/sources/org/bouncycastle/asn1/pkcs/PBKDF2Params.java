package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PBKDF2Params extends ASN1Object {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final AlgorithmIdentifier f87408t0 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA1, DERNull.INSTANCE);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1OctetString f87409p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87410q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87411r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f87412s0;

    public PBKDF2Params(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87409p0 = (ASN1OctetString) objects.nextElement();
        this.f87410q0 = (ASN1Integer) objects.nextElement();
        if (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if (objNextElement instanceof ASN1Integer) {
                this.f87411r0 = ASN1Integer.getInstance(objNextElement);
                objNextElement = objects.hasMoreElements() ? objects.nextElement() : null;
            } else {
                this.f87411r0 = null;
            }
            if (objNextElement != null) {
                this.f87412s0 = AlgorithmIdentifier.getInstance(objNextElement);
                return;
            }
        } else {
            this.f87411r0 = null;
        }
        this.f87412s0 = null;
    }

    public static PBKDF2Params getInstance(Object obj) {
        if (obj instanceof PBKDF2Params) {
            return (PBKDF2Params) obj;
        }
        if (obj != null) {
            return new PBKDF2Params(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getIterationCount() {
        return this.f87410q0.getValue();
    }

    public BigInteger getKeyLength() {
        ASN1Integer aSN1Integer = this.f87411r0;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public AlgorithmIdentifier getPrf() {
        AlgorithmIdentifier algorithmIdentifier = this.f87412s0;
        return algorithmIdentifier != null ? algorithmIdentifier : f87408t0;
    }

    public byte[] getSalt() {
        return this.f87409p0.getOctets();
    }

    public boolean isDefaultPrf() {
        AlgorithmIdentifier algorithmIdentifier = this.f87412s0;
        return algorithmIdentifier == null || algorithmIdentifier.equals(f87408t0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87409p0);
        aSN1EncodableVector.add(this.f87410q0);
        ASN1Integer aSN1Integer = this.f87411r0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        AlgorithmIdentifier algorithmIdentifier = this.f87412s0;
        if (algorithmIdentifier != null && !algorithmIdentifier.equals(f87408t0)) {
            aSN1EncodableVector.add(algorithmIdentifier);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PBKDF2Params(byte[] bArr, int i10) {
        this(bArr, i10, 0);
    }

    public PBKDF2Params(byte[] bArr, int i10, int i11) {
        this(bArr, i10, i11, null);
    }

    public PBKDF2Params(byte[] bArr, int i10, int i11, AlgorithmIdentifier algorithmIdentifier) {
        this.f87409p0 = new DEROctetString(Arrays.clone(bArr));
        this.f87410q0 = new ASN1Integer(i10);
        this.f87411r0 = i11 > 0 ? new ASN1Integer(i11) : null;
        this.f87412s0 = algorithmIdentifier;
    }

    public PBKDF2Params(byte[] bArr, int i10, AlgorithmIdentifier algorithmIdentifier) {
        this(bArr, i10, 0, algorithmIdentifier);
    }
}
