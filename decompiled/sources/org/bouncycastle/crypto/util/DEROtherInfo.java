package org.bouncycastle.crypto.util;

import java.io.IOException;
import lm.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public class DEROtherInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DERSequence f89621a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlgorithmIdentifier f89622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DEROctetString f89623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DEROctetString f89624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public DERTaggedObject f89625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DERTaggedObject f89626e;

        public Builder(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
            this.f89622a = algorithmIdentifier;
            this.f89623b = a.a(bArr);
            this.f89624c = a.a(bArr2);
        }

        public DEROtherInfo build() {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.f89622a);
            aSN1EncodableVector.add(this.f89623b);
            aSN1EncodableVector.add(this.f89624c);
            DERTaggedObject dERTaggedObject = this.f89625d;
            if (dERTaggedObject != null) {
                aSN1EncodableVector.add(dERTaggedObject);
            }
            DERTaggedObject dERTaggedObject2 = this.f89626e;
            if (dERTaggedObject2 != null) {
                aSN1EncodableVector.add(dERTaggedObject2);
            }
            return new DEROtherInfo(new DERSequence(aSN1EncodableVector));
        }

        public Builder withSuppPrivInfo(byte[] bArr) {
            this.f89626e = new DERTaggedObject(false, 1, a.a(bArr));
            return this;
        }

        public Builder withSuppPubInfo(byte[] bArr) {
            this.f89625d = new DERTaggedObject(false, 0, a.a(bArr));
            return this;
        }
    }

    public DEROtherInfo(DERSequence dERSequence) {
        this.f89621a = dERSequence;
    }

    public byte[] getEncoded() throws IOException {
        return this.f89621a.getEncoded();
    }
}
