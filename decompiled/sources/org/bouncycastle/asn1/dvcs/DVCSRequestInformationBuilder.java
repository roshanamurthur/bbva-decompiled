package org.bouncycastle.asn1.dvcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSRequestInformationBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceType f87131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DVCSRequestInformation f87132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BigInteger f87133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DVCSTime f87134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GeneralNames f87135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PolicyInformation f87136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GeneralNames f87137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GeneralNames f87138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Extensions f87139j;

    public DVCSRequestInformationBuilder(DVCSRequestInformation dVCSRequestInformation) {
        this.f87130a = 1;
        this.f87132c = dVCSRequestInformation;
        this.f87131b = dVCSRequestInformation.getService();
        this.f87130a = dVCSRequestInformation.getVersion();
        this.f87133d = dVCSRequestInformation.getNonce();
        this.f87134e = dVCSRequestInformation.getRequestTime();
        this.f87136g = dVCSRequestInformation.getRequestPolicy();
        this.f87137h = dVCSRequestInformation.getDVCS();
        this.f87138i = dVCSRequestInformation.getDataLocations();
    }

    public DVCSRequestInformation build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        int i10 = this.f87130a;
        if (i10 != 1) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        }
        aSN1EncodableVector.add(this.f87131b);
        BigInteger bigInteger = this.f87133d;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        DVCSTime dVCSTime = this.f87134e;
        if (dVCSTime != null) {
            aSN1EncodableVector.add(dVCSTime);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        ASN1Encodable[] aSN1EncodableArr = {this.f87135f, this.f87136g, this.f87137h, this.f87138i, this.f87139j};
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i11];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(new DERTaggedObject(false, i12, aSN1Encodable));
            }
        }
        return DVCSRequestInformation.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setDVCS(GeneralName generalName) {
        setDVCS(new GeneralNames(generalName));
    }

    public void setDataLocations(GeneralName generalName) {
        setDataLocations(new GeneralNames(generalName));
    }

    public void setExtensions(Extensions extensions) {
        if (this.f87132c != null) {
            throw new IllegalStateException("cannot change extensions in existing DVCSRequestInformation");
        }
        this.f87139j = extensions;
    }

    public void setNonce(BigInteger bigInteger) {
        DVCSRequestInformation dVCSRequestInformation = this.f87132c;
        if (dVCSRequestInformation != null) {
            if (dVCSRequestInformation.getNonce() == null) {
                this.f87133d = bigInteger;
            } else {
                byte[] byteArray = dVCSRequestInformation.getNonce().toByteArray();
                byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger);
                byte[] bArr = new byte[byteArray.length + bArrAsUnsignedByteArray.length];
                System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, byteArray.length, bArrAsUnsignedByteArray.length);
                this.f87133d = new BigInteger(bArr);
            }
        }
        this.f87133d = bigInteger;
    }

    public void setRequestPolicy(PolicyInformation policyInformation) {
        if (this.f87132c != null) {
            throw new IllegalStateException("cannot change request policy in existing DVCSRequestInformation");
        }
        this.f87136g = policyInformation;
    }

    public void setRequestTime(DVCSTime dVCSTime) {
        if (this.f87132c != null) {
            throw new IllegalStateException("cannot change request time in existing DVCSRequestInformation");
        }
        this.f87134e = dVCSTime;
    }

    public void setRequester(GeneralName generalName) {
        setRequester(new GeneralNames(generalName));
    }

    public void setVersion(int i10) {
        if (this.f87132c != null) {
            throw new IllegalStateException("cannot change version in existing DVCSRequestInformation");
        }
        this.f87130a = i10;
    }

    public DVCSRequestInformationBuilder(ServiceType serviceType) {
        this.f87130a = 1;
        this.f87131b = serviceType;
    }

    public void setDVCS(GeneralNames generalNames) {
        this.f87137h = generalNames;
    }

    public void setDataLocations(GeneralNames generalNames) {
        this.f87138i = generalNames;
    }

    public void setRequester(GeneralNames generalNames) {
        this.f87135f = generalNames;
    }
}
