package org.bouncycastle.asn1.crmf;

import androidx.appcompat.widget.g0;
import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class ProofOfPossession extends ASN1Object implements ASN1Choice {
    public static final int TYPE_KEY_AGREEMENT = 3;
    public static final int TYPE_KEY_ENCIPHERMENT = 2;
    public static final int TYPE_RA_VERIFIED = 0;
    public static final int TYPE_SIGNING_KEY = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87057p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Object f87058q0;

    public ProofOfPossession() {
        this.f87057p0 = 0;
        this.f87058q0 = DERNull.INSTANCE;
    }

    public static ProofOfPossession getInstance(Object obj) {
        ASN1Object pOPOSigningKey;
        if (obj == null || (obj instanceof ProofOfPossession)) {
            return (ProofOfPossession) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid object: "));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        ProofOfPossession proofOfPossession = new ProofOfPossession();
        int tagNo = aSN1TaggedObject.getTagNo();
        proofOfPossession.f87057p0 = tagNo;
        if (tagNo == 0) {
            pOPOSigningKey = DERNull.INSTANCE;
        } else if (tagNo == 1) {
            pOPOSigningKey = POPOSigningKey.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2 && tagNo != 3) {
                throw new IllegalArgumentException(g0.c("unknown tag: ", tagNo));
            }
            pOPOSigningKey = POPOPrivKey.getInstance(aSN1TaggedObject, true);
        }
        proofOfPossession.f87058q0 = pOPOSigningKey;
        return proofOfPossession;
    }

    public ASN1Encodable getObject() {
        return this.f87058q0;
    }

    public int getType() {
        return this.f87057p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.f87057p0, this.f87058q0);
    }

    public ProofOfPossession(int i10, POPOPrivKey pOPOPrivKey) {
        this.f87057p0 = i10;
        this.f87058q0 = pOPOPrivKey;
    }

    public ProofOfPossession(POPOSigningKey pOPOSigningKey) {
        this.f87057p0 = 1;
        this.f87058q0 = pOPOSigningKey;
    }
}
