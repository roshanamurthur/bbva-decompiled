package org.bouncycastle.asn1.x509;

import androidx.camera.camera2.internal.h0;
import java.math.BigInteger;
import java.util.Enumeration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class AuthorityKeyIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1OctetString f87582p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GeneralNames f87583q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87584r0;

    public AuthorityKeyIdentifier(ASN1Sequence aSN1Sequence) {
        this.f87582p0 = null;
        this.f87583q0 = null;
        this.f87584r0 = null;
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.f87582p0 = ASN1OctetString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                this.f87583q0 = GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException("illegal tag");
                }
                this.f87584r0 = ASN1Integer.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    public static AuthorityKeyIdentifier fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.authorityKeyIdentifier));
    }

    public static AuthorityKeyIdentifier getInstance(Object obj) {
        if (obj instanceof AuthorityKeyIdentifier) {
            return (AuthorityKeyIdentifier) obj;
        }
        if (obj != null) {
            return new AuthorityKeyIdentifier(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getAuthorityCertIssuer() {
        return this.f87583q0;
    }

    public BigInteger getAuthorityCertSerialNumber() {
        ASN1Integer aSN1Integer = this.f87584r0;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public byte[] getKeyIdentifier() {
        ASN1OctetString aSN1OctetString = this.f87582p0;
        if (aSN1OctetString != null) {
            return aSN1OctetString.getOctets();
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1OctetString aSN1OctetString = this.f87582p0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1OctetString));
        }
        GeneralNames generalNames = this.f87583q0;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, generalNames));
        }
        ASN1Integer aSN1Integer = this.f87584r0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Integer));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        ASN1OctetString aSN1OctetString = this.f87582p0;
        return h0.b("AuthorityKeyIdentifier: KeyID(", aSN1OctetString != null ? Hex.toHexString(aSN1OctetString.getOctets()) : AbstractJsonLexerKt.NULL, ")");
    }

    public AuthorityKeyIdentifier(GeneralNames generalNames, BigInteger bigInteger) {
        this((byte[]) null, generalNames, bigInteger);
    }

    public static AuthorityKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public AuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(subjectPublicKeyInfo, (GeneralNames) null, (BigInteger) null);
    }

    public AuthorityKeyIdentifier(SubjectPublicKeyInfo subjectPublicKeyInfo, GeneralNames generalNames, BigInteger bigInteger) {
        this.f87582p0 = null;
        this.f87583q0 = null;
        this.f87584r0 = null;
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        sHA1Digest.update(bytes, 0, bytes.length);
        sHA1Digest.doFinal(bArr, 0);
        this.f87582p0 = new DEROctetString(bArr);
        this.f87583q0 = generalNames;
        this.f87584r0 = bigInteger != null ? new ASN1Integer(bigInteger) : null;
    }

    public AuthorityKeyIdentifier(byte[] bArr) {
        this(bArr, (GeneralNames) null, (BigInteger) null);
    }

    public AuthorityKeyIdentifier(byte[] bArr, GeneralNames generalNames, BigInteger bigInteger) {
        this.f87582p0 = null;
        this.f87583q0 = null;
        this.f87584r0 = null;
        this.f87582p0 = bArr != null ? new DEROctetString(bArr) : null;
        this.f87583q0 = generalNames;
        this.f87584r0 = bigInteger != null ? new ASN1Integer(bigInteger) : null;
    }
}
