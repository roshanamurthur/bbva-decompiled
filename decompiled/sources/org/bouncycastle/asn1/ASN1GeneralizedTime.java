package org.bouncycastle.asn1;

import androidx.appcompat.widget.g0;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    protected byte[] time;

    public ASN1GeneralizedTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e5) {
            throw new IllegalArgumentException("invalid date string: " + e5.getMessage());
        }
    }

    public static String f(int i10) {
        return i10 < 10 ? g0.c("0", i10) : Integer.toString(i10);
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1GeneralizedTime) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static String h(String str) {
        String str2;
        StringBuilder sb2;
        char cCharAt;
        String strSubstring = str.substring(14);
        int i10 = 1;
        while (i10 < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i10)) && cCharAt <= '9') {
            i10++;
        }
        int i11 = i10 - 1;
        if (i11 > 3) {
            str2 = strSubstring.substring(0, 4) + strSubstring.substring(i10);
            sb2 = new StringBuilder();
        } else if (i11 == 1) {
            str2 = strSubstring.substring(0, i10) + "00" + strSubstring.substring(i10);
            sb2 = new StringBuilder();
        } else {
            if (i11 != 2) {
                return str;
            }
            str2 = strSubstring.substring(0, i10) + "0" + strSubstring.substring(i10);
            sb2 = new StringBuilder();
        }
        sb2.append(str.substring(0, 14));
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 24, this.time);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.areEqual(this.time, ((ASN1GeneralizedTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int b() {
        int length = this.time.length;
        return j.a(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        return new DERGeneralizedTime(this.time);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DERGeneralizedTime(this.time);
    }

    public final SimpleDateFormat e() {
        SimpleDateFormat simpleDateFormat;
        if (hasFractionalSeconds()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
        } else if (hasSeconds()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        } else {
            simpleDateFormat = hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final boolean g(int i10) {
        byte b10;
        byte[] bArr = this.time;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormatE;
        SimpleDateFormat simpleDateFormat;
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.endsWith("Z")) {
            if (hasFractionalSeconds()) {
                simpleDateFormatE = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else if (hasSeconds()) {
                simpleDateFormatE = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            } else {
                simpleDateFormatE = hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            }
            simpleDateFormatE.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strFromByteArray.indexOf(45) > 0 || strFromByteArray.indexOf(43) > 0) {
            strFromByteArray = getTime();
            simpleDateFormatE = e();
        } else {
            if (hasFractionalSeconds()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else if (hasSeconds()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            } else {
                simpleDateFormat = hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            }
            simpleDateFormatE = simpleDateFormat;
            simpleDateFormatE.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            strFromByteArray = h(strFromByteArray);
        }
        return d.a(simpleDateFormatE.parse(strFromByteArray));
    }

    public String getTime() {
        String str;
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.charAt(strFromByteArray.length() - 1) == 'Z') {
            return strFromByteArray.substring(0, strFromByteArray.length() - 1) + "GMT+00:00";
        }
        int length = strFromByteArray.length();
        char cCharAt = strFromByteArray.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strFromByteArray.indexOf(Time.GMT) == length - 9) {
            return strFromByteArray;
        }
        int length2 = strFromByteArray.length();
        int i10 = length2 - 5;
        char cCharAt2 = strFromByteArray.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, i10));
            sb2.append(Time.GMT);
            int i11 = length2 - 2;
            sb2.append(strFromByteArray.substring(i10, i11));
            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            sb2.append(strFromByteArray.substring(i11));
            return sb2.toString();
        }
        int length3 = strFromByteArray.length() - 3;
        char cCharAt3 = strFromByteArray.charAt(length3);
        if (cCharAt3 == '-' || cCharAt3 == '+') {
            return strFromByteArray.substring(0, length3) + Time.GMT + strFromByteArray.substring(length3) + ":00";
        }
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strFromByteArray);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = Constant.DASH_STRING;
        } else {
            str = "+";
        }
        int i12 = rawOffset / 3600000;
        int i13 = (rawOffset - (3600000 * i12)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    strFromByteArray = h(strFromByteArray);
                }
                if (timeZone.inDaylightTime(e().parse(strFromByteArray + Time.GMT + str + f(i12) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + f(i13)))) {
                    i12 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException e5) {
            e5.printStackTrace();
        }
        sbD.append(Time.GMT + str + f(i12) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + f(i13));
        return sbD.toString();
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    public boolean hasFractionalSeconds() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i10 == bArr.length) {
                return false;
            }
            if (bArr[i10] == 46 && i10 == 14) {
                return true;
            }
            i10++;
        }
    }

    public boolean hasMinutes() {
        return g(10) && g(11);
    }

    public boolean hasSeconds() {
        return g(12) && g(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", d.f87093c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.time = bArr;
        if (!g(0) || !g(1) || !g(2) || !g(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof ASN1GeneralizedTime)) ? getInstance(object) : new ASN1GeneralizedTime(ASN1OctetString.getInstance(object).getOctets());
    }
}
