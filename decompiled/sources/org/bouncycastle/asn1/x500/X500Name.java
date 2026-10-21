package org.bouncycastle.asn1.x500;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* JADX INFO: loaded from: classes12.dex */
public class X500Name extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static X500NameStyle f87538u0 = BCStyle.INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f87539p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f87540q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final X500NameStyle f87541r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RDN[] f87542s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final DERSequence f87543t0;

    public X500Name(String str) {
        this(f87538u0, str);
    }

    public static X500NameStyle getDefaultStyle() {
        return f87538u0;
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        if (x500NameStyle == null) {
            throw new NullPointerException("cannot set style to null");
        }
        f87538u0 = x500NameStyle;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.f87541r0.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        RDN[] rdnArr = this.f87542s0;
        int size = 0;
        for (RDN rdn : rdnArr) {
            size += rdn.size();
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        int i10 = 0;
        for (RDN rdn2 : rdnArr) {
            ASN1Set aSN1Set = rdn2.f87537p0;
            int size2 = aSN1Set.size();
            for (int i11 = 0; i11 < size2; i11++) {
                aSN1ObjectIdentifierArr[i10 + i11] = AttributeTypeAndValue.getInstance(aSN1Set.getObjectAt(i11)).getType();
            }
            i10 += size2;
        }
        return aSN1ObjectIdentifierArr;
    }

    public RDN[] getRDNs() {
        return (RDN[]) this.f87542s0.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.f87539p0) {
            return this.f87540q0;
        }
        this.f87539p0 = true;
        int iCalculateHashCode = this.f87541r0.calculateHashCode(this);
        this.f87540q0 = iCalculateHashCode;
        return iCalculateHashCode;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87543t0;
    }

    public String toString() {
        return this.f87541r0.toString(this);
    }

    public X500Name(ASN1Sequence aSN1Sequence) {
        this(f87538u0, aSN1Sequence);
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        RDN[] rdnArr = this.f87542s0;
        int length = rdnArr.length;
        RDN[] rdnArr2 = new RDN[length];
        int i10 = 0;
        for (int i11 = 0; i11 != rdnArr.length; i11++) {
            RDN rdn = rdnArr[i11];
            ASN1Set aSN1Set = rdn.f87537p0;
            int size = aSN1Set.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (AttributeTypeAndValue.getInstance(aSN1Set.getObjectAt(i12)).getType().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    rdnArr2[i10] = rdn;
                    i10++;
                    break;
                }
            }
        }
        if (i10 >= length) {
            return rdnArr2;
        }
        RDN[] rdnArr3 = new RDN[i10];
        System.arraycopy(rdnArr2, 0, rdnArr3, 0, i10);
        return rdnArr3;
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.f87541r0 = x500NameStyle;
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj != null) {
            return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        this.f87541r0 = x500NameStyle;
        this.f87542s0 = new RDN[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        boolean z10 = true;
        int i10 = 0;
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            RDN rdn = RDN.getInstance(objNextElement);
            z10 &= rdn == objNextElement;
            this.f87542s0[i10] = rdn;
            i10++;
        }
        this.f87543t0 = z10 ? DERSequence.convert(aSN1Sequence) : new DERSequence(this.f87542s0);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.f87541r0 = x500NameStyle;
        this.f87542s0 = x500Name.f87542s0;
        this.f87543t0 = x500Name.f87543t0;
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.f87541r0 = x500NameStyle;
        RDN[] rdnArr2 = (RDN[]) rdnArr.clone();
        this.f87542s0 = rdnArr2;
        this.f87543t0 = new DERSequence(rdnArr2);
    }

    public X500Name(RDN[] rdnArr) {
        this(f87538u0, rdnArr);
    }
}
