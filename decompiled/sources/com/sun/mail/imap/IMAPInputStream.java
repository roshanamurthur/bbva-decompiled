package com.sun.mail.imap;

import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.MessageRemovedIOException;
import java.io.IOException;
import java.io.InputStream;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPInputStream extends InputStream {
    public ByteArray E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final IMAPMessage f65319p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f65320q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f65321r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f65322s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f65323t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f65324u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f65325w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f65326x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f65327y0;

    public IMAPInputStream(IMAPMessage iMAPMessage, String str, int i10, boolean z10) {
        this.f65319p0 = iMAPMessage;
        this.f65320q0 = str;
        this.f65323t0 = i10;
        this.f65327y0 = z10;
        this.f65322s0 = iMAPMessage.getFetchBlockSize();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        return this.v0 - this.f65325w0;
    }

    public final void b() {
        IMAPMessage iMAPMessage = this.f65319p0;
        if (this.f65327y0) {
            return;
        }
        try {
            Folder folder = iMAPMessage.getFolder();
            if (folder == null || folder.getMode() == 1) {
                return;
            }
            Flags.Flag flag = Flags.Flag.SEEN;
            if (iMAPMessage.isSet(flag)) {
                return;
            }
            iMAPMessage.setFlag(flag, true);
        } catch (MessagingException unused) {
        }
    }

    public final void e() throws IOException {
        int i10;
        int i11;
        ByteArray byteArray;
        if (this.f65326x0 || ((i10 = this.f65323t0) != -1 && this.f65321r0 >= i10)) {
            if (this.f65321r0 == 0) {
                b();
            }
            this.E0 = null;
            return;
        }
        if (this.E0 == null) {
            this.E0 = new ByteArray(this.f65322s0 + 64);
        }
        synchronized (this.f65319p0.getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = this.f65319p0.getProtocol();
                    if (this.f65319p0.isExpunged()) {
                        throw new MessageRemovedIOException("No content for expunged message");
                    }
                    int sequenceNumber = this.f65319p0.getSequenceNumber();
                    i11 = this.f65322s0;
                    int i12 = this.f65323t0;
                    if (i12 != -1) {
                        int i13 = this.f65321r0;
                        if (i13 + i11 > i12) {
                            i11 = i12 - i13;
                        }
                    }
                    BODY bodyPeekBody = this.f65327y0 ? protocol.peekBody(sequenceNumber, this.f65320q0, this.f65321r0, i11, this.E0) : protocol.fetchBody(sequenceNumber, this.f65320q0, this.f65321r0, i11, this.E0);
                    if (bodyPeekBody == null || (byteArray = bodyPeekBody.getByteArray()) == null) {
                        l();
                        byteArray = new ByteArray(0);
                    }
                } catch (ProtocolException e5) {
                    l();
                    throw new IOException(e5.getMessage());
                } catch (FolderClosedException e7) {
                    throw new FolderClosedIOException(e7.getFolder(), e7.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f65321r0 == 0) {
            b();
        }
        this.f65324u0 = byteArray.getBytes();
        this.f65325w0 = byteArray.getStart();
        int count = byteArray.getCount();
        this.f65326x0 = count < i11;
        this.v0 = this.f65325w0 + count;
        this.f65321r0 += count;
    }

    public final void l() throws MessageRemovedIOException, FolderClosedIOException {
        synchronized (this.f65319p0.getMessageCacheLock()) {
            try {
                try {
                    this.f65319p0.getProtocol().noop();
                } catch (ConnectionException e5) {
                    throw new FolderClosedIOException(this.f65319p0.getFolder(), e5.getMessage());
                }
            } catch (ProtocolException unused) {
            } catch (FolderClosedException e7) {
                throw new FolderClosedIOException(e7.getFolder(), e7.getMessage());
            }
        }
        if (this.f65319p0.isExpunged()) {
            throw new MessageRemovedIOException();
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        if (this.f65325w0 >= this.v0) {
            e();
            if (this.f65325w0 >= this.v0) {
                return -1;
            }
        }
        byte[] bArr = this.f65324u0;
        int i10 = this.f65325w0;
        this.f65325w0 = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.v0 - this.f65325w0;
        if (i12 <= 0) {
            e();
            i12 = this.v0 - this.f65325w0;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(this.f65324u0, this.f65325w0, bArr, i10, i11);
        this.f65325w0 += i11;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
