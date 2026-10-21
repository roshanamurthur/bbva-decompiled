package com.sun.mail.imap.protocol;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.PropUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MailDateFormat;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class ENVELOPE implements Item {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f65419p0 = {'E', 'N', 'V', 'E', Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'P', 'E'};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final MailDateFormat f65420q0 = new MailDateFormat();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f65421r0 = PropUtil.getBooleanSystemProperty("mail.imap.parse.debug", false);
    public InternetAddress[] bcc;
    public InternetAddress[] cc;
    public Date date;
    public InternetAddress[] from;
    public String inReplyTo;
    public String messageId;
    public int msgno;
    public InternetAddress[] replyTo;
    public InternetAddress[] sender;
    public String subject;
    public InternetAddress[] to;

    public ENVELOPE(FetchResponse fetchResponse) throws ParsingException {
        this.date = null;
        if (f65421r0) {
            System.out.println("parse ENVELOPE");
        }
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 40) {
            throw new ParsingException("ENVELOPE parse error");
        }
        String string = fetchResponse.readString();
        if (string != null) {
            try {
                MailDateFormat mailDateFormat = f65420q0;
                synchronized (mailDateFormat) {
                    this.date = mailDateFormat.parse(string);
                }
            } catch (ParseException unused) {
            }
        }
        boolean z10 = f65421r0;
        if (z10) {
            System.out.println("  Date: " + this.date);
        }
        this.subject = fetchResponse.readString();
        if (z10) {
            System.out.println("  Subject: " + this.subject);
        }
        if (z10) {
            System.out.println("  From addresses:");
        }
        this.from = a(fetchResponse);
        if (z10) {
            System.out.println("  Sender addresses:");
        }
        this.sender = a(fetchResponse);
        if (z10) {
            System.out.println("  Reply-To addresses:");
        }
        this.replyTo = a(fetchResponse);
        if (z10) {
            System.out.println("  To addresses:");
        }
        this.to = a(fetchResponse);
        if (z10) {
            System.out.println("  Cc addresses:");
        }
        this.cc = a(fetchResponse);
        if (z10) {
            System.out.println("  Bcc addresses:");
        }
        this.bcc = a(fetchResponse);
        this.inReplyTo = fetchResponse.readString();
        if (z10) {
            System.out.println("  In-Reply-To: " + this.inReplyTo);
        }
        this.messageId = fetchResponse.readString();
        if (z10) {
            System.out.println("  Message-ID: " + this.messageId);
        }
        if (!fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            throw new ParsingException("ENVELOPE parse error");
        }
    }

    public static InternetAddress[] a(Response response) throws ParsingException {
        response.skipSpaces();
        byte b10 = response.readByte();
        if (b10 != 40) {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("ADDRESS parse error");
            }
            response.skip(2);
            return null;
        }
        if (response.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            a aVar = new a(response);
            if (f65421r0) {
                System.out.println("    Address: " + aVar);
            }
            if (!aVar.f65459t0 || aVar.v0 != null) {
                arrayList.add(aVar);
            }
        } while (!response.isNextNonSpace(RootService.CLOSE_BRACKET));
        return (InternetAddress[]) arrayList.toArray(new InternetAddress[arrayList.size()]);
    }
}
