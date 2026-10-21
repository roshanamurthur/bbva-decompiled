package javax.mail.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.mail.internet.SharedInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class SharedByteArrayInputStream extends ByteArrayInputStream implements SharedInputStream {
    protected int start;

    public SharedByteArrayInputStream(byte[] bArr) {
        super(bArr);
        this.start = 0;
    }

    @Override // javax.mail.internet.SharedInputStream
    public long getPosition() {
        return ((ByteArrayInputStream) this).pos - this.start;
    }

    @Override // javax.mail.internet.SharedInputStream
    public InputStream newStream(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (j11 == -1) {
            j11 = ((ByteArrayInputStream) this).count - this.start;
        }
        return new SharedByteArrayInputStream(((ByteArrayInputStream) this).buf, this.start + ((int) j10), (int) (j11 - j10));
    }

    public SharedByteArrayInputStream(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.start = i10;
    }
}
