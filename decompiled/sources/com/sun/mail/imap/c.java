package com.sun.mail.imap;

import com.sun.mail.iap.Literal;
import com.sun.mail.util.CRLFOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.mail.Message;
import javax.mail.MessagingException;

/* JADX INFO: compiled from: IMAPFolder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Literal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Message f65406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f65408c;

    public c(int i10, Message message) throws MessagingException, IOException {
        this.f65407b = -1;
        this.f65406a = message;
        b bVar = new b();
        bVar.f65403p0 = 0;
        bVar.f65404q0 = new byte[8192];
        bVar.f65405r0 = i10;
        CRLFOutputStream cRLFOutputStream = new CRLFOutputStream(bVar);
        message.writeTo(cRLFOutputStream);
        cRLFOutputStream.flush();
        this.f65407b = bVar.f65403p0;
        this.f65408c = bVar.f65404q0;
    }

    @Override // com.sun.mail.iap.Literal
    public final int size() {
        return this.f65407b;
    }

    @Override // com.sun.mail.iap.Literal
    public final void writeTo(OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = this.f65408c;
            if (bArr != null) {
                outputStream.write(bArr, 0, this.f65407b);
            } else {
                this.f65406a.writeTo(new CRLFOutputStream(outputStream));
            }
        } catch (MessagingException e5) {
            throw new IOException("MessagingException while appending message: " + e5);
        }
    }
}
