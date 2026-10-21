package org.bouncycastle.asn1.x509;

import ad.e;
import androidx.appcompat.widget.g0;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class V2TBSCertListGenerator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ASN1Sequence[] f87744h = {b(0), b(1), b(2), b(3), b(4), b(5), b(6), b(7), b(8), b(9), b(10)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlgorithmIdentifier f87746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X500Name f87747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Time f87748d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1Integer f87745a = new ASN1Integer(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Time f87749e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Extensions f87750f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ASN1EncodableVector f87751g = new ASN1EncodableVector();

    public static DERSequence a(ASN1GeneralizedTime aSN1GeneralizedTime) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        try {
            aSN1EncodableVector.add(Extension.invalidityDate);
            aSN1EncodableVector.add(new DEROctetString(aSN1GeneralizedTime.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e5) {
            throw new IllegalArgumentException(e.d("error encoding reason: ", e5));
        }
    }

    public static DERSequence b(int i10) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        CRLReason cRLReasonLookup = CRLReason.lookup(i10);
        try {
            aSN1EncodableVector.add(Extension.reasonCode);
            aSN1EncodableVector.add(new DEROctetString(cRLReasonLookup.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e5) {
            throw new IllegalArgumentException(e.d("error encoding reason: ", e5));
        }
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, ASN1UTCTime aSN1UTCTime, int i10) {
        addCRLEntry(aSN1Integer, new Time(aSN1UTCTime), i10);
    }

    public TBSCertList generateTBSCertList() {
        if (this.f87746b == null || this.f87747c == null || this.f87748d == null) {
            throw new IllegalStateException("Not all mandatory fields set in V2 TBSCertList generator.");
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.f87745a);
        aSN1EncodableVector.add(this.f87746b);
        aSN1EncodableVector.add(this.f87747c);
        aSN1EncodableVector.add(this.f87748d);
        Time time = this.f87749e;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        ASN1EncodableVector aSN1EncodableVector2 = this.f87751g;
        if (aSN1EncodableVector2.size() != 0) {
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        Extensions extensions = this.f87750f;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, extensions));
        }
        return new TBSCertList(new DERSequence(aSN1EncodableVector));
    }

    public void setExtensions(Extensions extensions) {
        this.f87750f = extensions;
    }

    public void setIssuer(X500Name x500Name) {
        this.f87747c = x500Name;
    }

    public void setNextUpdate(ASN1UTCTime aSN1UTCTime) {
        this.f87749e = new Time(aSN1UTCTime);
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.f87746b = algorithmIdentifier;
    }

    public void setThisUpdate(ASN1UTCTime aSN1UTCTime) {
        this.f87748d = new Time(aSN1UTCTime);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i10) {
        addCRLEntry(aSN1Integer, time, i10, null);
    }

    public void setExtensions(X509Extensions x509Extensions) {
        setExtensions(Extensions.getInstance(x509Extensions));
    }

    public void setIssuer(X509Name x509Name) {
        this.f87747c = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setNextUpdate(Time time) {
        this.f87749e = time;
    }

    public void setThisUpdate(Time time) {
        this.f87748d = time;
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i10, ASN1GeneralizedTime aSN1GeneralizedTime) {
        DERSequence dERSequence;
        if (i10 != 0) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
            if (i10 >= 11) {
                aSN1EncodableVector.add(b(i10));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(g0.c("invalid reason value: ", i10));
                }
                aSN1EncodableVector.add(f87744h[i10]);
            }
            if (aSN1GeneralizedTime != null) {
                aSN1EncodableVector.add(a(aSN1GeneralizedTime));
            }
            DERSequence dERSequence2 = new DERSequence(aSN1EncodableVector);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(aSN1Integer);
            aSN1EncodableVector2.add(time);
            aSN1EncodableVector2.add(dERSequence2);
            dERSequence = new DERSequence(aSN1EncodableVector2);
        } else if (aSN1GeneralizedTime != null) {
            DERSequence dERSequence3 = new DERSequence(a(aSN1GeneralizedTime));
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector(3);
            aSN1EncodableVector3.add(aSN1Integer);
            aSN1EncodableVector3.add(time);
            aSN1EncodableVector3.add(dERSequence3);
            dERSequence = new DERSequence(aSN1EncodableVector3);
        } else {
            addCRLEntry(aSN1Integer, time, (Extensions) null);
            return;
        }
        addCRLEntry(dERSequence);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, Extensions extensions) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Sequence aSN1Sequence) {
        this.f87751g.add(aSN1Sequence);
    }
}
