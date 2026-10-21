package javax.mail.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataSource;
import javax.mail.internet.ContentType;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParseException;

/* JADX INFO: loaded from: classes12.dex */
public class ByteArrayDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f79048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f79051d;

    public static class a extends ByteArrayOutputStream {
        public final byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public ByteArrayDataSource(InputStream inputStream, String str) throws IOException {
        this.f79049b = -1;
        this.f79051d = "";
        a aVar = new a();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            } else {
                aVar.write(bArr, 0, i10);
            }
        }
        byte[] bArrB = aVar.b();
        this.f79048a = bArrB;
        int count = aVar.getCount();
        this.f79049b = count;
        if (bArrB.length - count > 262144) {
            byte[] byteArray = aVar.toByteArray();
            this.f79048a = byteArray;
            this.f79049b = byteArray.length;
        }
        this.f79050c = str;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        return this.f79050c;
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() throws IOException {
        byte[] bArr = this.f79048a;
        if (bArr == null) {
            throw new IOException("no data");
        }
        if (this.f79049b < 0) {
            this.f79049b = bArr.length;
        }
        return new SharedByteArrayInputStream(bArr, 0, this.f79049b);
    }

    @Override // javax.activation.DataSource
    public String getName() {
        return this.f79051d;
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() throws IOException {
        throw new IOException("cannot do this");
    }

    public void setName(String str) {
        this.f79051d = str;
    }

    public ByteArrayDataSource(byte[] bArr, String str) {
        this.f79049b = -1;
        this.f79051d = "";
        this.f79048a = bArr;
        this.f79050c = str;
    }

    public ByteArrayDataSource(String str, String str2) throws IOException {
        String parameter;
        this.f79049b = -1;
        this.f79051d = "";
        try {
            parameter = new ContentType(str2).getParameter("charset");
        } catch (ParseException unused) {
            parameter = null;
        }
        String strJavaCharset = MimeUtility.javaCharset(parameter);
        this.f79048a = str.getBytes(strJavaCharset == null ? MimeUtility.getDefaultJavaCharset() : strJavaCharset);
        this.f79050c = str2;
    }
}
