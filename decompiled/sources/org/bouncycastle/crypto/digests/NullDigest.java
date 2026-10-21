package org.bouncycastle.crypto.digests;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class NullDigest implements Digest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88099a = new a();

    public static class a extends ByteArrayOutputStream {
        public final void a(int i10, byte[] bArr) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i10, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public final void reset() {
            super.reset();
            Arrays.clear(((ByteArrayOutputStream) this).buf);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        a aVar = this.f88099a;
        int size = aVar.size();
        aVar.a(i10, bArr);
        reset();
        return size;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return VDVideoSelfieConfiguration.NULL;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88099a.size();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88099a.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) throws IOException {
        this.f88099a.write(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) throws IOException {
        this.f88099a.write(bArr, i10, i11);
    }
}
