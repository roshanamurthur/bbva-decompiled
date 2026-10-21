package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class TBSCertList extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f87690p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f87691q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final X500Name f87692r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Time f87693s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Time f87694t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ASN1Sequence f87695u0;
    public final Extensions v0;

    public static class CRLEntry extends ASN1Object {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ASN1Sequence f87696p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Extensions f87697q0;

        public static CRLEntry getInstance(Object obj) {
            if (obj instanceof CRLEntry) {
                return (CRLEntry) obj;
            }
            if (obj == null) {
                return null;
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
            CRLEntry cRLEntry = new CRLEntry();
            if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 3) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            cRLEntry.f87696p0 = aSN1Sequence;
            return cRLEntry;
        }

        public Extensions getExtensions() {
            if (this.f87697q0 == null) {
                ASN1Sequence aSN1Sequence = this.f87696p0;
                if (aSN1Sequence.size() == 3) {
                    this.f87697q0 = Extensions.getInstance(aSN1Sequence.getObjectAt(2));
                }
            }
            return this.f87697q0;
        }

        public Time getRevocationDate() {
            return Time.getInstance(this.f87696p0.getObjectAt(1));
        }

        public ASN1Integer getUserCertificate() {
            return ASN1Integer.getInstance(this.f87696p0.getObjectAt(0));
        }

        public boolean hasExtensions() {
            return this.f87696p0.size() == 3;
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public ASN1Primitive toASN1Primitive() {
            return this.f87696p0;
        }
    }

    public class a implements Enumeration {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    public class b implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Enumeration f87698a;

        public b(Enumeration enumeration) {
            this.f87698a = enumeration;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f87698a.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return CRLEntry.getInstance(this.f87698a.nextElement());
        }
    }

    public TBSCertList(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 7) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.f87690p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i10 = 1;
        } else {
            this.f87690p0 = null;
        }
        this.f87691q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        this.f87692r0 = X500Name.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        int i11 = i10 + 3;
        this.f87693s0 = Time.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        if (i11 < aSN1Sequence.size() && ((aSN1Sequence.getObjectAt(i11) instanceof ASN1UTCTime) || (aSN1Sequence.getObjectAt(i11) instanceof ASN1GeneralizedTime) || (aSN1Sequence.getObjectAt(i11) instanceof Time))) {
            this.f87694t0 = Time.getInstance(aSN1Sequence.getObjectAt(i11));
            i11 = i10 + 4;
        }
        if (i11 < aSN1Sequence.size() && !(aSN1Sequence.getObjectAt(i11) instanceof ASN1TaggedObject)) {
            this.f87695u0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i11));
            i11++;
        }
        if (i11 >= aSN1Sequence.size() || !(aSN1Sequence.getObjectAt(i11) instanceof ASN1TaggedObject)) {
            return;
        }
        this.v0 = Extensions.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i11), true));
    }

    public static TBSCertList getInstance(Object obj) {
        if (obj instanceof TBSCertList) {
            return (TBSCertList) obj;
        }
        if (obj != null) {
            return new TBSCertList(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Extensions getExtensions() {
        return this.v0;
    }

    public X500Name getIssuer() {
        return this.f87692r0;
    }

    public Time getNextUpdate() {
        return this.f87694t0;
    }

    public Enumeration getRevokedCertificateEnumeration() {
        ASN1Sequence aSN1Sequence = this.f87695u0;
        return aSN1Sequence == null ? new a() : new b(aSN1Sequence.getObjects());
    }

    public CRLEntry[] getRevokedCertificates() {
        ASN1Sequence aSN1Sequence = this.f87695u0;
        if (aSN1Sequence == null) {
            return new CRLEntry[0];
        }
        int size = aSN1Sequence.size();
        CRLEntry[] cRLEntryArr = new CRLEntry[size];
        for (int i10 = 0; i10 < size; i10++) {
            cRLEntryArr[i10] = CRLEntry.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return cRLEntryArr;
    }

    public AlgorithmIdentifier getSignature() {
        return this.f87691q0;
    }

    public Time getThisUpdate() {
        return this.f87693s0;
    }

    public ASN1Integer getVersion() {
        return this.f87690p0;
    }

    public int getVersionNumber() {
        ASN1Integer aSN1Integer = this.f87690p0;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.intValueExact() + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        ASN1Integer aSN1Integer = this.f87690p0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.f87691q0);
        aSN1EncodableVector.add(this.f87692r0);
        aSN1EncodableVector.add(this.f87693s0);
        Time time = this.f87694t0;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        ASN1Sequence aSN1Sequence = this.f87695u0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        Extensions extensions = this.v0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static TBSCertList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
