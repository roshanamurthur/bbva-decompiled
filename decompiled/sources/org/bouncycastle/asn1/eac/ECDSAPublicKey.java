package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ECDSAPublicKey extends PublicKeyDataObject {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87179p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87180q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f87181r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BigInteger f87182s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f87183t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public BigInteger f87184u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public BigInteger f87185w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f87186x0;

    public ECDSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] bArr, BigInteger bigInteger4, byte[] bArr2, int i10) {
        this.f87179p0 = aSN1ObjectIdentifier;
        int i11 = this.f87186x0;
        if ((i11 & 1) != 0) {
            throw new IllegalArgumentException("Prime Modulus P already set");
        }
        int i12 = i11 | 1;
        this.f87186x0 = i12;
        this.f87180q0 = bigInteger;
        if ((i12 & 2) != 0) {
            throw new IllegalArgumentException("First Coef A already set");
        }
        int i13 = i11 | 3;
        this.f87186x0 = i13;
        this.f87181r0 = bigInteger2;
        if ((i13 & 4) != 0) {
            throw new IllegalArgumentException("Second Coef B already set");
        }
        this.f87186x0 = i11 | 7;
        this.f87182s0 = bigInteger3;
        DEROctetString dEROctetString = new DEROctetString(bArr);
        int i14 = this.f87186x0;
        if ((i14 & 8) != 0) {
            throw new IllegalArgumentException("Base Point G already set");
        }
        this.f87186x0 = i14 | 8;
        this.f87183t0 = dEROctetString.getOctets();
        int i15 = this.f87186x0;
        if ((i15 & 16) != 0) {
            throw new IllegalArgumentException("Order of base point R already set");
        }
        this.f87186x0 = i15 | 16;
        this.f87184u0 = bigInteger4;
        a(new DEROctetString(bArr2));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        int i16 = this.f87186x0;
        if ((i16 & 64) != 0) {
            throw new IllegalArgumentException("Cofactor F already set");
        }
        this.f87186x0 = i16 | 64;
        this.f87185w0 = bigIntegerValueOf;
    }

    public final void a(ASN1OctetString aSN1OctetString) throws IllegalArgumentException {
        int i10 = this.f87186x0;
        if ((i10 & 32) != 0) {
            throw new IllegalArgumentException("Public Point Y already set");
        }
        this.f87186x0 = i10 | 32;
        this.v0 = aSN1OctetString.getOctets();
    }

    public ASN1EncodableVector getASN1EncodableVector(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(8);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        if (!z10) {
            aSN1EncodableVector.add(new UnsignedInteger(1, getPrimeModulusP()));
            aSN1EncodableVector.add(new UnsignedInteger(2, getFirstCoefA()));
            aSN1EncodableVector.add(new UnsignedInteger(3, getSecondCoefB()));
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, new DEROctetString(getBasePointG())));
            aSN1EncodableVector.add(new UnsignedInteger(5, getOrderOfBasePointR()));
        }
        aSN1EncodableVector.add(new DERTaggedObject(false, 6, new DEROctetString(getPublicPointY())));
        if (!z10) {
            aSN1EncodableVector.add(new UnsignedInteger(7, getCofactorF()));
        }
        return aSN1EncodableVector;
    }

    public byte[] getBasePointG() {
        if ((this.f87186x0 & 8) != 0) {
            return Arrays.clone(this.f87183t0);
        }
        return null;
    }

    public BigInteger getCofactorF() {
        if ((this.f87186x0 & 64) != 0) {
            return this.f87185w0;
        }
        return null;
    }

    public BigInteger getFirstCoefA() {
        if ((this.f87186x0 & 2) != 0) {
            return this.f87181r0;
        }
        return null;
    }

    public BigInteger getOrderOfBasePointR() {
        if ((this.f87186x0 & 16) != 0) {
            return this.f87184u0;
        }
        return null;
    }

    public BigInteger getPrimeModulusP() {
        if ((this.f87186x0 & 1) != 0) {
            return this.f87180q0;
        }
        return null;
    }

    public byte[] getPublicPointY() {
        if ((this.f87186x0 & 32) != 0) {
            return Arrays.clone(this.v0);
        }
        return null;
    }

    public BigInteger getSecondCoefB() {
        if ((this.f87186x0 & 4) != 0) {
            return this.f87182s0;
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public ASN1ObjectIdentifier getUsage() {
        return this.f87179p0;
    }

    public boolean hasParameters() {
        return this.f87180q0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(getASN1EncodableVector(this.f87179p0, !hasParameters()));
    }

    public ECDSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) throws IllegalArgumentException {
        this.f87179p0 = aSN1ObjectIdentifier;
        a(new DEROctetString(bArr));
    }
}
