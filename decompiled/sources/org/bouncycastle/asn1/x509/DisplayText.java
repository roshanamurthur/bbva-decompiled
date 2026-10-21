package org.bouncycastle.asn1.x509;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVisibleString;

/* JADX INFO: loaded from: classes12.dex */
public class DisplayText extends ASN1Object implements ASN1Choice {
    public static final int CONTENT_TYPE_BMPSTRING = 1;
    public static final int CONTENT_TYPE_IA5STRING = 0;
    public static final int CONTENT_TYPE_UTF8STRING = 2;
    public static final int CONTENT_TYPE_VISIBLESTRING = 3;
    public static final int DISPLAY_TEXT_MAXIMUM_SIZE = 200;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1String f87610p0;

    public DisplayText(int i10, String str) {
        str = str.length() > 200 ? str.substring(0, 200) : str;
        ASN1String dERUTF8String = i10 != 0 ? i10 != 1 ? (i10 == 2 || i10 != 3) ? new DERUTF8String(str) : new DERVisibleString(str) : new DERBMPString(str) : new DERIA5String(str);
        this.f87610p0 = dERUTF8String;
    }

    public static DisplayText getInstance(Object obj) {
        if (!(obj instanceof ASN1String)) {
            if (obj == null || (obj instanceof DisplayText)) {
                return (DisplayText) obj;
            }
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1String aSN1String = (ASN1String) obj;
        DisplayText displayText = new DisplayText();
        displayText.f87610p0 = aSN1String;
        if ((aSN1String instanceof DERUTF8String) || (aSN1String instanceof DERBMPString) || (aSN1String instanceof DERIA5String) || (aSN1String instanceof DERVisibleString)) {
            return displayText;
        }
        throw new IllegalArgumentException("unknown STRING type in DisplayText");
    }

    public String getString() {
        return this.f87610p0.getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return (ASN1Primitive) this.f87610p0;
    }

    public DisplayText(String str) {
        this.f87610p0 = new DERUTF8String(str.length() > 200 ? str.substring(0, 200) : str);
    }

    public static DisplayText getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
