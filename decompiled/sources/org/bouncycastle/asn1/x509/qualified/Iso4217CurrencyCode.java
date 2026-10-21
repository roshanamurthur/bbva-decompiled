package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERPrintableString;

/* JADX INFO: loaded from: classes12.dex */
public class Iso4217CurrencyCode extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Primitive f87790p0;

    public Iso4217CurrencyCode(int i10) {
        if (i10 > 999 || i10 < 1) {
            throw new IllegalArgumentException("wrong size in numeric code : not in (1..999)");
        }
        this.f87790p0 = new ASN1Integer(i10);
    }

    public static Iso4217CurrencyCode getInstance(Object obj) {
        if (obj == null || (obj instanceof Iso4217CurrencyCode)) {
            return (Iso4217CurrencyCode) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new Iso4217CurrencyCode(ASN1Integer.getInstance(obj).intValueExact());
        }
        if (obj instanceof DERPrintableString) {
            return new Iso4217CurrencyCode(DERPrintableString.getInstance(obj).getString());
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public String getAlphabetic() {
        return ((DERPrintableString) this.f87790p0).getString();
    }

    public int getNumeric() {
        return ((ASN1Integer) this.f87790p0).intValueExact();
    }

    public boolean isAlphabetic() {
        return this.f87790p0 instanceof DERPrintableString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87790p0.toASN1Primitive();
    }

    public Iso4217CurrencyCode(String str) {
        if (str.length() > 3) {
            throw new IllegalArgumentException("wrong size in alphabetic code : max size is 3");
        }
        this.f87790p0 = new DERPrintableString(str);
    }
}
