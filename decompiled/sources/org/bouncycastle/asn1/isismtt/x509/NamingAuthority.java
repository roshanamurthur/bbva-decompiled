package org.bouncycastle.asn1.isismtt.x509;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class NamingAuthority extends ASN1Object {
    public static final ASN1ObjectIdentifier id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern = new ASN1ObjectIdentifier(ISISMTTObjectIdentifiers.id_isismtt_at_namingAuthorities + ".1");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87297p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f87298q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DirectoryString f87299r0;

    public NamingAuthority(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, DirectoryString directoryString) {
        this.f87297p0 = aSN1ObjectIdentifier;
        this.f87298q0 = str;
        this.f87299r0 = directoryString;
    }

    public static NamingAuthority getInstance(Object obj) {
        if (obj == null || (obj instanceof NamingAuthority)) {
            return (NamingAuthority) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        NamingAuthority namingAuthority = new NamingAuthority();
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof ASN1ObjectIdentifier) {
                namingAuthority.f87297p0 = (ASN1ObjectIdentifier) aSN1Encodable;
            } else if (aSN1Encodable instanceof DERIA5String) {
                namingAuthority.f87298q0 = DERIA5String.getInstance(aSN1Encodable).getString();
            } else {
                if (!(aSN1Encodable instanceof ASN1String)) {
                    throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable.getClass());
                }
                namingAuthority.f87299r0 = DirectoryString.getInstance(aSN1Encodable);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable2 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof DERIA5String) {
                namingAuthority.f87298q0 = DERIA5String.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof ASN1String)) {
                    throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable2.getClass());
                }
                namingAuthority.f87299r0 = DirectoryString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable3 = (ASN1Encodable) objects.nextElement();
            if (!(aSN1Encodable3 instanceof ASN1String)) {
                throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable3.getClass());
            }
            namingAuthority.f87299r0 = DirectoryString.getInstance(aSN1Encodable3);
        }
        return namingAuthority;
    }

    public ASN1ObjectIdentifier getNamingAuthorityId() {
        return this.f87297p0;
    }

    public DirectoryString getNamingAuthorityText() {
        return this.f87299r0;
    }

    public String getNamingAuthorityUrl() {
        return this.f87298q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87297p0;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        String str = this.f87298q0;
        if (str != null) {
            aSN1EncodableVector.add(new DERIA5String(str, true));
        }
        DirectoryString directoryString = this.f87299r0;
        if (directoryString != null) {
            aSN1EncodableVector.add(directoryString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static NamingAuthority getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
