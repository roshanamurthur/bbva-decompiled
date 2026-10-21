package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterator<ByteBuffer> f21110p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ByteBuffer f21111q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f21112r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f21113s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f21114t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f21115u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f21116w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f21117x0;

    public r(Iterable<ByteBuffer> iterable) {
        this.f21110p0 = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f21112r0++;
        }
        this.f21113s0 = -1;
        if (b()) {
            return;
        }
        this.f21111q0 = Internal.EMPTY_BYTE_BUFFER;
        this.f21113s0 = 0;
        this.f21114t0 = 0;
        this.f21117x0 = 0L;
    }

    public final boolean b() {
        this.f21113s0++;
        Iterator<ByteBuffer> it = this.f21110p0;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer next = it.next();
        this.f21111q0 = next;
        this.f21114t0 = next.position();
        if (this.f21111q0.hasArray()) {
            this.f21115u0 = true;
            this.v0 = this.f21111q0.array();
            this.f21116w0 = this.f21111q0.arrayOffset();
        } else {
            this.f21115u0 = false;
            this.f21117x0 = v0.a(this.f21111q0);
            this.v0 = null;
        }
        return true;
    }

    public final void c(int i10) {
        int i11 = this.f21114t0 + i10;
        this.f21114t0 = i11;
        if (i11 == this.f21111q0.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f21113s0 == this.f21112r0) {
            return -1;
        }
        if (this.f21115u0) {
            int i10 = this.v0[this.f21114t0 + this.f21116w0] & 255;
            c(1);
            return i10;
        }
        int iF = v0.f21151d.f(((long) this.f21114t0) + this.f21117x0) & 255;
        c(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f21113s0 == this.f21112r0) {
            return -1;
        }
        int iLimit = this.f21111q0.limit();
        int i12 = this.f21114t0;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f21115u0) {
            System.arraycopy(this.v0, i12 + this.f21116w0, bArr, i10, i11);
            c(i11);
        } else {
            int iPosition = this.f21111q0.position();
            this.f21111q0.position(this.f21114t0);
            this.f21111q0.get(bArr, i10, i11);
            this.f21111q0.position(iPosition);
            c(i11);
        }
        return i11;
    }
}
