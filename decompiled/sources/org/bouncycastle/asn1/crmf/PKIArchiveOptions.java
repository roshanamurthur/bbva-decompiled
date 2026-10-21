package org.bouncycastle.asn1.crmf;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class PKIArchiveOptions extends ASN1Object implements ASN1Choice {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Object f87044p0;

    public PKIArchiveOptions(ASN1OctetString aSN1OctetString) {
        this.f87044p0 = aSN1OctetString;
    }

    public static PKIArchiveOptions getInstance(Object obj) {
        ASN1Object encryptedKey;
        if (obj == null || (obj instanceof PKIArchiveOptions)) {
            return (PKIArchiveOptions) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(c.c("unknown object: ", obj));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        PKIArchiveOptions pKIArchiveOptions = new PKIArchiveOptions();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            encryptedKey = EncryptedKey.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 1) {
            encryptedKey = ASN1OctetString.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
            }
            encryptedKey = ASN1Boolean.getInstance(aSN1TaggedObject, false);
        }
        pKIArchiveOptions.f87044p0 = encryptedKey;
        return pKIArchiveOptions;
    }

    public int getType() {
        ASN1Object aSN1Object = this.f87044p0;
        if (aSN1Object instanceof EncryptedKey) {
            return 0;
        }
        return aSN1Object instanceof ASN1OctetString ? 1 : 2;
    }

    public ASN1Encodable getValue() {
        return this.f87044p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.f87044p0;
        if (aSN1Object instanceof EncryptedKey) {
            return new DERTaggedObject(true, 0, aSN1Object);
        }
        return aSN1Object instanceof ASN1OctetString ? new DERTaggedObject(false, 1, aSN1Object) : new DERTaggedObject(false, 2, aSN1Object);
    }

    public PKIArchiveOptions(EncryptedKey encryptedKey) {
        this.f87044p0 = encryptedKey;
    }

    public PKIArchiveOptions(boolean z10) {
        this.f87044p0 = ASN1Boolean.getInstance(z10);
    }
}
