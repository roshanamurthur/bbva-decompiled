package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;

/* JADX INFO: loaded from: classes12.dex */
public class SPuri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DERIA5String f87227a;

    public SPuri(DERIA5String dERIA5String) {
        this.f87227a = dERIA5String;
    }

    public static SPuri getInstance(Object obj) {
        if (obj instanceof SPuri) {
            return (SPuri) obj;
        }
        if (obj instanceof DERIA5String) {
            return new SPuri(DERIA5String.getInstance(obj));
        }
        return null;
    }

    public DERIA5String getUri() {
        return this.f87227a;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.f87227a.toASN1Primitive();
    }
}
