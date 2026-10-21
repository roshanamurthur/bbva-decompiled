package com.sun.mail.imap;

import androidx.appcompat.widget.o1;
import com.sun.mail.util.MailLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import javax.mail.Message;

/* JADX INFO: loaded from: classes9.dex */
public class MessageCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IMAPMessage[] f65381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f65382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IMAPFolder f65384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MailLogger f65385e;

    public MessageCache(IMAPFolder iMAPFolder, IMAPStore iMAPStore, int i10) {
        this.f65384d = iMAPFolder;
        MailLogger subLogger = iMAPFolder.logger.getSubLogger("messagecache", "DEBUG IMAP MC", iMAPStore.Z0);
        this.f65385e = subLogger;
        if (subLogger.isLoggable(Level.CONFIG)) {
            subLogger.config("create cache of size " + i10);
        }
        a(i10, 1);
    }

    public final void a(int i10, int i11) {
        IMAPMessage[] iMAPMessageArr = this.f65381a;
        if (iMAPMessageArr == null) {
            this.f65381a = new IMAPMessage[i10 + 64];
        } else {
            int length = iMAPMessageArr.length;
            MailLogger mailLogger = this.f65385e;
            if (length < i10) {
                if (mailLogger.isLoggable(Level.FINE)) {
                    mailLogger.fine("expand capacity to " + i10);
                }
                int i12 = i10 + 64;
                IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[i12];
                IMAPMessage[] iMAPMessageArr3 = this.f65381a;
                System.arraycopy(iMAPMessageArr3, 0, iMAPMessageArr2, 0, iMAPMessageArr3.length);
                this.f65381a = iMAPMessageArr2;
                int[] iArr = this.f65382b;
                if (iArr != null) {
                    int[] iArr2 = new int[i12];
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    int i13 = this.f65383c;
                    while (i13 < i12) {
                        iArr2[i13] = i11;
                        i13++;
                        i11++;
                    }
                    this.f65382b = iArr2;
                    if (mailLogger.isLoggable(Level.FINE)) {
                        StringBuilder sbC = o1.c("message ", i10, " has sequence number ");
                        sbC.append(this.f65382b[i10 - 1]);
                        mailLogger.fine(sbC.toString());
                    }
                }
            } else if (i10 < this.f65383c) {
                if (mailLogger.isLoggable(Level.FINE)) {
                    mailLogger.fine("shrink capacity to " + i10);
                }
                for (int i14 = i10 + 1; i14 <= this.f65383c; i14++) {
                    int i15 = i14 - 1;
                    this.f65381a[i15] = null;
                    int[] iArr3 = this.f65382b;
                    if (iArr3 != null) {
                        iArr3[i15] = -1;
                    }
                }
            }
        }
        this.f65383c = i10;
    }

    public void addMessages(int i10, int i11) {
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65385e;
        if (mailLogger.isLoggable(level)) {
            mailLogger.fine("add " + i10 + " messages");
        }
        a(this.f65383c + i10, i11);
    }

    public final int b(int i10) {
        if (this.f65382b == null) {
            return i10;
        }
        if (i10 < 1) {
            Level level = Level.FINE;
            MailLogger mailLogger = this.f65385e;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("bad seqnum " + i10);
            }
            return -1;
        }
        for (int i11 = i10; i11 <= this.f65383c; i11++) {
            int i12 = this.f65382b[i11 - 1];
            if (i12 == i10) {
                return i11;
            }
            if (i12 > i10) {
                break;
            }
        }
        return -1;
    }

    public final void c(int i10, int i11) {
        this.f65383c = i10 - 1;
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65385e;
        if (mailLogger.isLoggable(level)) {
            mailLogger.fine("size now " + this.f65383c);
        }
        int i12 = this.f65383c;
        if (i12 == 0) {
            this.f65381a = null;
            this.f65382b = null;
            return;
        }
        if (i12 > 64 && i12 < this.f65381a.length / 2) {
            mailLogger.fine("reallocate array");
            int i13 = this.f65383c;
            IMAPMessage[] iMAPMessageArr = new IMAPMessage[i13 + 64];
            System.arraycopy(this.f65381a, 0, iMAPMessageArr, 0, i13);
            this.f65381a = iMAPMessageArr;
            int[] iArr = this.f65382b;
            if (iArr != null) {
                int i14 = this.f65383c;
                int[] iArr2 = new int[i14 + 64];
                System.arraycopy(iArr, 0, iArr2, 0, i14);
                this.f65382b = iArr2;
                return;
            }
            return;
        }
        if (mailLogger.isLoggable(level)) {
            mailLogger.fine("clean " + i10 + " to " + i11);
        }
        while (i10 < i11) {
            int i15 = i10 - 1;
            this.f65381a[i15] = null;
            int[] iArr3 = this.f65382b;
            if (iArr3 != null) {
                iArr3[i15] = 0;
            }
            i10++;
        }
    }

    public void expungeMessage(int i10) {
        int iB = b(i10);
        MailLogger mailLogger = this.f65385e;
        if (iB < 0) {
            if (mailLogger.isLoggable(Level.FINE)) {
                mailLogger.fine("expunge no seqnum " + i10);
                return;
            }
            return;
        }
        int i11 = iB - 1;
        IMAPMessage iMAPMessage = this.f65381a[i11];
        if (iMAPMessage != null) {
            if (mailLogger.isLoggable(Level.FINE)) {
                mailLogger.fine("expunge existing " + iB);
            }
            iMAPMessage.setExpunged(true);
        }
        int[] iArr = this.f65382b;
        if (iArr == null) {
            mailLogger.fine("create seqnums array");
            this.f65382b = new int[this.f65381a.length];
            for (int i12 = 1; i12 < iB; i12++) {
                this.f65382b[i12 - 1] = i12;
            }
            this.f65382b[i11] = 0;
            int i13 = iB + 1;
            while (true) {
                int[] iArr2 = this.f65382b;
                if (i13 > iArr2.length) {
                    return;
                }
                int i14 = i13 - 1;
                iArr2[i14] = i14;
                i13++;
            }
        } else {
            iArr[i11] = 0;
            int i15 = iB + 1;
            while (true) {
                int[] iArr3 = this.f65382b;
                if (i15 > iArr3.length) {
                    return;
                }
                int i16 = i15 - 1;
                int i17 = iArr3[i16];
                if (i17 > 0) {
                    iArr3[i16] = i17 - 1;
                }
                i15++;
            }
        }
    }

    public IMAPMessage getMessage(int i10) {
        if (i10 < 1 || i10 > this.f65383c) {
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.a.c(o1.c("message number (", i10, ") out of bounds ("), this.f65383c, ")"));
        }
        int i11 = i10 - 1;
        IMAPMessage iMAPMessageNewIMAPMessage = this.f65381a[i11];
        if (iMAPMessageNewIMAPMessage == null) {
            Level level = Level.FINE;
            MailLogger mailLogger = this.f65385e;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("create message number " + i10);
            }
            iMAPMessageNewIMAPMessage = this.f65384d.newIMAPMessage(i10);
            this.f65381a[i11] = iMAPMessageNewIMAPMessage;
            if (seqnumOf(i10) <= 0) {
                mailLogger.fine("it's expunged!");
                iMAPMessageNewIMAPMessage.setExpunged(true);
            }
        }
        return iMAPMessageNewIMAPMessage;
    }

    public IMAPMessage getMessageBySeqnum(int i10) {
        int iB = b(i10);
        if (iB >= 0) {
            return getMessage(iB);
        }
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65385e;
        if (!mailLogger.isLoggable(level)) {
            return null;
        }
        mailLogger.fine("no message seqnum " + i10);
        return null;
    }

    public IMAPMessage[] removeExpungedMessages() {
        MailLogger mailLogger = this.f65385e;
        mailLogger.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 <= this.f65383c) {
            if (seqnumOf(i10) <= 0) {
                arrayList.add(getMessage(i10));
            } else {
                if (i11 != i10) {
                    IMAPMessage[] iMAPMessageArr = this.f65381a;
                    IMAPMessage iMAPMessage = iMAPMessageArr[i10 - 1];
                    iMAPMessageArr[i11 - 1] = iMAPMessage;
                    if (iMAPMessage != null) {
                        iMAPMessage.setMessageNumber(i11);
                    }
                }
                i11++;
            }
            i10++;
        }
        this.f65382b = null;
        c(i11, i10);
        int size = arrayList.size();
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[size];
        if (mailLogger.isLoggable(Level.FINE)) {
            mailLogger.fine("return " + size);
        }
        arrayList.toArray(iMAPMessageArr2);
        return iMAPMessageArr2;
    }

    public int seqnumOf(int i10) {
        if (this.f65382b == null) {
            return i10;
        }
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65385e;
        if (mailLogger.isLoggable(level)) {
            StringBuilder sbC = o1.c("msgnum ", i10, " is seqnum ");
            sbC.append(this.f65382b[i10 - 1]);
            mailLogger.fine(sbC.toString());
        }
        return this.f65382b[i10 - 1];
    }

    public int size() {
        return this.f65383c;
    }

    public IMAPMessage[] removeExpungedMessages(Message[] messageArr) {
        MailLogger mailLogger = this.f65385e;
        mailLogger.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int length = messageArr.length;
        int[] iArr = new int[length];
        boolean z10 = false;
        for (int i10 = 0; i10 < messageArr.length; i10++) {
            iArr[i10] = messageArr[i10].getMessageNumber();
        }
        Arrays.sort(iArr);
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i11 <= this.f65383c) {
            if (i13 < length && i11 == iArr[i13] && seqnumOf(i11) <= 0) {
                arrayList.add(getMessage(i11));
                while (i13 < length && iArr[i13] <= i11) {
                    i13++;
                }
            } else {
                if (i12 != i11) {
                    IMAPMessage[] iMAPMessageArr = this.f65381a;
                    int i14 = i12 - 1;
                    int i15 = i11 - 1;
                    IMAPMessage iMAPMessage = iMAPMessageArr[i15];
                    iMAPMessageArr[i14] = iMAPMessage;
                    if (iMAPMessage != null) {
                        iMAPMessage.setMessageNumber(i12);
                    }
                    int[] iArr2 = this.f65382b;
                    if (iArr2 != null) {
                        iArr2[i14] = iArr2[i15];
                    }
                }
                int[] iArr3 = this.f65382b;
                if (iArr3 != null && iArr3[i12 - 1] != i12) {
                    z10 = true;
                }
                i12++;
            }
            i11++;
        }
        if (!z10) {
            this.f65382b = null;
        }
        c(i12, i11);
        int size = arrayList.size();
        IMAPMessage[] iMAPMessageArr2 = new IMAPMessage[size];
        if (mailLogger.isLoggable(Level.FINE)) {
            mailLogger.fine("return " + size);
        }
        arrayList.toArray(iMAPMessageArr2);
        return iMAPMessageArr2;
    }
}
