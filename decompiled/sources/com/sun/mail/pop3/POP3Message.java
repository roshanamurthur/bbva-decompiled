package com.sun.mail.pop3;

import com.sun.mail.util.ReadableMime;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.Enumeration;
import java.util.logging.Level;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.SharedInputStream;
import si.a;
import si.b;
import si.e;

/* JADX INFO: loaded from: classes9.dex */
public class POP3Message extends MimeMessage implements ReadableMime {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final POP3Folder f65465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f65468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SoftReference<InputStream> f65469i;

    public POP3Message(Folder folder, int i10) throws MessagingException {
        super(folder, i10);
        this.f65466f = -1;
        this.f65467g = -1;
        this.f65468h = "UNKNOWN";
        this.f65469i = new SoftReference<>(null);
        this.f65465e = (POP3Folder) folder;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void addHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream g(boolean z10) throws MessagingException {
        Object obj;
        InputStream inputStreamU;
        int i10;
        try {
            synchronized (this) {
                try {
                    Object obj2 = (InputStream) this.f65469i.get();
                    obj = obj2;
                    if (obj2 == null) {
                        e eVar = this.f65465e.I0;
                        if (eVar != null) {
                            if (this.f65465e.K0.isLoggable(Level.FINE)) {
                                this.f65465e.K0.fine("caching message #" + this.msgnum + " in temp file");
                            }
                            a aVarB = eVar.b();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(aVarB);
                            try {
                                POP3Folder pOP3Folder = this.f65465e;
                                b bVar = pOP3Folder.f65462w0;
                                pOP3Folder.b();
                                bVar.v(bufferedOutputStream, this.msgnum);
                                bufferedOutputStream.close();
                                inputStreamU = aVarB.b();
                            } catch (Throwable th2) {
                                bufferedOutputStream.close();
                                throw th2;
                            }
                        } else {
                            POP3Folder pOP3Folder2 = this.f65465e;
                            b bVar2 = pOP3Folder2.f65462w0;
                            pOP3Folder2.b();
                            int i11 = this.msgnum;
                            int i12 = this.f65467g;
                            inputStreamU = bVar2.u(i11, i12 > 0 ? i12 + this.f65466f : 0);
                        }
                        InputStream inputStream = inputStreamU;
                        if (inputStream == 0) {
                            this.expunged = true;
                            throw new MessageRemovedException("can't retrieve message #" + this.msgnum + " in POP3Message.getContentStream");
                        }
                        if (this.headers == null || ((POP3Store) this.f65465e.getStore()).Q0) {
                            this.headers = new InternetHeaders(inputStream);
                            this.f65466f = (int) ((SharedInputStream) inputStream).getPosition();
                        } else {
                            do {
                                i10 = 0;
                                while (true) {
                                    int i13 = inputStream.read();
                                    if (i13 < 0 || i13 == 10) {
                                        break;
                                        break;
                                    }
                                    if (i13 == 13) {
                                        if (inputStream.available() <= 0) {
                                            break;
                                        }
                                        inputStream.mark(1);
                                        if (inputStream.read() == 10) {
                                            break;
                                        }
                                        inputStream.reset();
                                        break;
                                    }
                                    i10++;
                                }
                                if (inputStream.available() == 0) {
                                    break;
                                }
                            } while (i10 != 0);
                            this.f65466f = (int) ((SharedInputStream) inputStream).getPosition();
                        }
                        this.f65467g = inputStream.available();
                        this.f65469i = new SoftReference<>(inputStream);
                        obj = inputStream;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return ((SharedInputStream) obj).newStream(z10 ? this.f65466f : 0L, -1L);
        } catch (EOFException e5) {
            this.f65465e.close(false);
            throw new FolderClosedException(this.f65465e, e5.toString());
        } catch (IOException e7) {
            throw new MessagingException("error fetching POP3 content", e7);
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getAllHeaders() throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getAllHeaders();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.mail.internet.MimeMessage
    public synchronized InputStream getContentStream() throws MessagingException {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((SharedInputStream) closeable).newStream(0L, -1L);
        }
        InputStream inputStreamG = g(true);
        if (this.f65465e.I0 != null || ((POP3Store) this.f65465e.getStore()).V0) {
            this.contentStream = ((SharedInputStream) inputStreamG).newStream(0L, -1L);
        }
        return inputStreamG;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String[] getHeader(String str) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getHeader(str);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getMatchingHeaders(strArr);
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessagingException {
        return g(false);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getNonMatchingHeaders(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getSize() throws MessagingException {
        int i10;
        try {
            synchronized (this) {
                try {
                    int i11 = this.f65467g;
                    if (i11 > 0) {
                        return i11;
                    }
                    if (this.headers == null) {
                        h();
                    }
                    synchronized (this) {
                        try {
                            if (this.f65467g < 0) {
                                POP3Folder pOP3Folder = this.f65465e;
                                b bVar = pOP3Folder.f65462w0;
                                pOP3Folder.b();
                                this.f65467g = bVar.l(this.msgnum) - this.f65466f;
                            }
                            i10 = this.f65467g;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (EOFException e5) {
            this.f65465e.close(false);
            throw new FolderClosedException(this.f65465e, e5.toString());
        } catch (IOException e7) {
            throw new MessagingException("error getting size", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void h() throws MessagingException {
        boolean z10;
        try {
            synchronized (this) {
                try {
                    if (this.headers != null) {
                        return;
                    }
                    if (((POP3Store) this.f65465e.getStore()).P0) {
                        z10 = true;
                    } else {
                        POP3Folder pOP3Folder = this.f65465e;
                        b bVar = pOP3Folder.f65462w0;
                        pOP3Folder.b();
                        InputStream inputStreamB = bVar.B(this.msgnum, 0);
                        if (inputStreamB == null) {
                            z10 = true;
                        } else {
                            try {
                                this.f65466f = inputStreamB.available();
                                this.headers = new InternetHeaders(inputStreamB);
                                inputStreamB.close();
                                z10 = false;
                            } catch (Throwable th2) {
                                inputStreamB.close();
                                throw th2;
                            }
                        }
                    }
                    if (z10) {
                        InputStream contentStream = getContentStream();
                        if (contentStream != null) {
                            contentStream.close();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (EOFException e5) {
            this.f65465e.close(false);
            throw new FolderClosedException(this.f65465e, e5.toString());
        } catch (IOException e7) {
            throw new MessagingException("error loading POP3 headers", e7);
        }
    }

    public synchronized void invalidate(boolean z10) {
        this.content = null;
        InputStream inputStream = this.f65469i.get();
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f65469i = new SoftReference<>(null);
        }
        InputStream inputStream2 = this.contentStream;
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
            this.contentStream = null;
        }
        this.f65467g = -1;
        if (z10) {
            this.headers = null;
            this.f65466f = -1;
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void removeHeader(String str) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void saveChanges() throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) throws MessagingException {
        Flags flags2 = (Flags) this.flags.clone();
        super.setFlags(flags, z10);
        if (!this.flags.equals(flags2)) {
            this.f65465e.notifyMessageChangedListeners(1, this);
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setHeader(String str, String str2) throws MessagingException {
        throw new IllegalWriteException("POP3 messages are read-only");
    }

    public InputStream top(int i10) throws MessagingException {
        InputStream inputStreamB;
        try {
            synchronized (this) {
                POP3Folder pOP3Folder = this.f65465e;
                b bVar = pOP3Folder.f65462w0;
                pOP3Folder.b();
                inputStreamB = bVar.B(this.msgnum, i10);
            }
            return inputStreamB;
        } catch (EOFException e5) {
            this.f65465e.close(false);
            throw new FolderClosedException(this.f65465e, e5.toString());
        } catch (IOException e7) {
            throw new MessagingException("error getting size", e7);
        }
    }

    @Override // javax.mail.internet.MimeMessage
    public synchronized void writeTo(OutputStream outputStream, String[] strArr) throws MessagingException, IOException {
        try {
            Closeable closeable = (InputStream) this.f65469i.get();
            if (closeable == null && strArr == null && !((POP3Store) this.f65465e.getStore()).S0) {
                if (this.f65465e.K0.isLoggable(Level.FINE)) {
                    this.f65465e.K0.fine("streaming msg " + this.msgnum);
                }
                POP3Folder pOP3Folder = this.f65465e;
                b bVar = pOP3Folder.f65462w0;
                pOP3Folder.b();
                if (!bVar.v(outputStream, this.msgnum)) {
                    this.expunged = true;
                    throw new MessageRemovedException("can't retrieve message #" + this.msgnum + " in POP3Message.writeTo");
                }
            } else if (closeable == null || strArr != null) {
                super.writeTo(outputStream, strArr);
            } else {
                InputStream inputStreamNewStream = ((SharedInputStream) closeable).newStream(0L, -1L);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i10 = inputStreamNewStream.read(bArr);
                        if (i10 > 0) {
                            outputStream.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    inputStreamNewStream.close();
                } catch (Throwable th2) {
                    if (inputStreamNewStream != null) {
                        try {
                            inputStreamNewStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getHeader(String str, String str2) throws MessagingException {
        if (this.headers == null) {
            h();
        }
        return this.headers.getHeader(str, str2);
    }
}
