package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class Restriction extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DirectoryString f87309p0;

    public Restriction(String str) {
        this.f87309p0 = new DirectoryString(str);
    }

    public static Restriction getInstance(Object obj) {
        if (obj instanceof Restriction) {
            return (Restriction) obj;
        }
        if (obj == null) {
            return null;
        }
        DirectoryString directoryString = DirectoryString.getInstance(obj);
        Restriction restriction = new Restriction();
        restriction.f87309p0 = directoryString;
        return restriction;
    }

    public DirectoryString getRestriction() {
        return this.f87309p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87309p0.toASN1Primitive();
    }
}
