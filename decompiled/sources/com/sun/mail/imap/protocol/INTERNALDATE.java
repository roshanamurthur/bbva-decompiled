package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.mail.internet.MailDateFormat;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class INTERNALDATE implements Item {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f65447p0 = {'I', 'N', 'T', 'E', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'N', 'A', Matrix.MATRIX_TYPE_RANDOM_LT, 'D', 'A', 'T', 'E'};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final MailDateFormat f65448q0 = new MailDateFormat();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final SimpleDateFormat f65449r0 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss ", Locale.US);
    protected Date date;
    public int msgno;

    public INTERNALDATE(FetchResponse fetchResponse) throws ParsingException {
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        String string = fetchResponse.readString();
        if (string == null) {
            throw new ParsingException("INTERNALDATE is NIL");
        }
        try {
            MailDateFormat mailDateFormat = f65448q0;
            synchronized (mailDateFormat) {
                this.date = mailDateFormat.parse(string);
            }
        } catch (ParseException unused) {
            throw new ParsingException("INTERNALDATE parse error");
        }
    }

    public static String format(Date date) {
        StringBuffer stringBuffer = new StringBuffer();
        SimpleDateFormat simpleDateFormat = f65449r0;
        synchronized (simpleDateFormat) {
            simpleDateFormat.format(date, stringBuffer, new FieldPosition(0));
        }
        int offset = (TimeZone.getDefault().getOffset(date.getTime()) / 60) / 1000;
        if (offset < 0) {
            stringBuffer.append('-');
            offset = -offset;
        } else {
            stringBuffer.append('+');
        }
        int i10 = offset / 60;
        int i11 = offset % 60;
        stringBuffer.append(Character.forDigit(i10 / 10, 10));
        stringBuffer.append(Character.forDigit(i10 % 10, 10));
        stringBuffer.append(Character.forDigit(i11 / 10, 10));
        stringBuffer.append(Character.forDigit(i11 % 10, 10));
        return stringBuffer.toString();
    }

    public Date getDate() {
        return this.date;
    }
}
