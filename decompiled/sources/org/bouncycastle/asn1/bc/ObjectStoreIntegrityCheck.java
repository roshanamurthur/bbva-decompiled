package org.bouncycastle.asn1.bc;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectStoreIntegrityCheck extends ASN1Object implements ASN1Choice {
    public static final int PBKD_MAC_CHECK = 0;
    public static final int SIG_CHECK = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f86623p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Object f86624q0;

    public ObjectStoreIntegrityCheck(ASN1Encodable aSN1Encodable) {
        ASN1Object pbkdMacIntegrityCheck;
        if ((aSN1Encodable instanceof ASN1Sequence) || (aSN1Encodable instanceof PbkdMacIntegrityCheck)) {
            this.f86623p0 = 0;
            pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(aSN1Encodable);
        } else {
            if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException("Unknown check object in integrity check.");
            }
            this.f86623p0 = 1;
            pbkdMacIntegrityCheck = SignatureCheck.getInstance(((ASN1TaggedObject) aSN1Encodable).getObject());
        }
        this.f86624q0 = pbkdMacIntegrityCheck;
    }

    public static ObjectStoreIntegrityCheck getInstance(Object obj) {
        if (obj instanceof ObjectStoreIntegrityCheck) {
            return (ObjectStoreIntegrityCheck) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new ObjectStoreIntegrityCheck(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unable to parse integrity check details.");
            }
        }
        if (obj != null) {
            return new ObjectStoreIntegrityCheck((ASN1Encodable) obj);
        }
        return null;
    }

    public ASN1Object getIntegrityCheck() {
        return this.f86624q0;
    }

    public int getType() {
        return this.f86623p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.f86624q0;
        return aSN1Object instanceof SignatureCheck ? new DERTaggedObject(0, aSN1Object) : aSN1Object.toASN1Primitive();
    }

    public ObjectStoreIntegrityCheck(PbkdMacIntegrityCheck pbkdMacIntegrityCheck) {
        this((ASN1Encodable) pbkdMacIntegrityCheck);
    }

    public ObjectStoreIntegrityCheck(SignatureCheck signatureCheck) {
        this(new DERTaggedObject(0, signatureCheck));
    }
}
