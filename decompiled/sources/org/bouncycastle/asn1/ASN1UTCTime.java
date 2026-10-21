package org.bouncycastle.asn1;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1UTCTime extends ASN1Primitive {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86541p0;

    public ASN1UTCTime(String str) {
        this.f86541p0 = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e5) {
            throw new IllegalArgumentException("invalid date string: " + e5.getMessage());
        }
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1UTCTime) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 23, this.f86541p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1UTCTime)) {
            return false;
        }
        return Arrays.areEqual(this.f86541p0, ((ASN1UTCTime) aSN1Primitive).f86541p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        int length = this.f86541p0.length;
        return j.a(length) + 1 + length;
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return d.a(simpleDateFormat.parse(getAdjustedTime()));
    }

    public String getAdjustedTime() {
        String time = getTime();
        return (time.charAt(0) < '5' ? PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND : "19").concat(time);
    }

    public Date getDate() throws ParseException {
        return d.a(new SimpleDateFormat("yyMMddHHmmssz").parse(getTime()));
    }

    public String getTime() {
        StringBuilder sb2;
        String strSubstring;
        String strFromByteArray = Strings.fromByteArray(this.f86541p0);
        if (strFromByteArray.indexOf(45) >= 0 || strFromByteArray.indexOf(43) >= 0) {
            int iIndexOf = strFromByteArray.indexOf(45);
            if (iIndexOf < 0) {
                iIndexOf = strFromByteArray.indexOf(43);
            }
            if (iIndexOf == strFromByteArray.length() - 3) {
                strFromByteArray = strFromByteArray.concat("00");
            }
            if (iIndexOf == 10) {
                sb2 = new StringBuilder();
                sb2.append(strFromByteArray.substring(0, 10));
                sb2.append("00GMT");
                sb2.append(strFromByteArray.substring(10, 13));
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                strSubstring = strFromByteArray.substring(13, 15);
            } else {
                sb2 = new StringBuilder();
                sb2.append(strFromByteArray.substring(0, 12));
                sb2.append(Time.GMT);
                sb2.append(strFromByteArray.substring(12, 15));
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                strSubstring = strFromByteArray.substring(15, 17);
            }
        } else if (strFromByteArray.length() == 11) {
            sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, 10));
            strSubstring = "00GMT+00:00";
        } else {
            sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, 12));
            strSubstring = "GMT+00:00";
        }
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86541p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return Strings.fromByteArray(this.f86541p0);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", d.f87093c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f86541p0 = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f86541p0 = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(byte[] bArr) {
        byte b10;
        byte b11;
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f86541p0 = bArr;
        if (bArr.length <= 0 || (b10 = bArr[0]) < 48 || b10 > 57 || bArr.length <= 1 || (b11 = bArr[1]) < 48 || b11 > 57) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof ASN1UTCTime)) ? getInstance(object) : new ASN1UTCTime(ASN1OctetString.getInstance(object).getOctets());
    }
}
