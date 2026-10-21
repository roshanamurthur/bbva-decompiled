package org.bouncycastle.asn1.eac;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PackedDate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f87188a;

    public PackedDate(String str) {
        this.f87188a = a(str);
    }

    public static byte[] a(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 != 6; i10++) {
            bArr[i10] = (byte) (charArray[i10] - '0');
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PackedDate) {
            return Arrays.areEqual(this.f87188a, ((PackedDate) obj).f87188a);
        }
        return false;
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyyyMMdd").parse(PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND + toString());
    }

    public byte[] getEncoding() {
        return Arrays.clone(this.f87188a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f87188a);
    }

    public String toString() {
        byte[] bArr = this.f87188a;
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) ((bArr[i10] & 255) + 48);
        }
        return new String(cArr);
    }

    public PackedDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f87188a = a(simpleDateFormat.format(date));
    }

    public PackedDate(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f87188a = a(simpleDateFormat.format(date));
    }

    public PackedDate(byte[] bArr) {
        this.f87188a = bArr;
    }
}
