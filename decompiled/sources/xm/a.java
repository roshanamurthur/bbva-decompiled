package xm;

import com.google.android.play.core.splitinstall.internal.h;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f94682d = Strings.toByteArray("expand 32-byte to 64-byte state!");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f94683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f94684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f94685c = new h();

    public a(Digest digest, Digest digest2) {
        this.f94683a = digest;
        this.f94684b = digest2;
    }

    public final void a(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        byte[] bArr4 = new byte[64];
        for (int i13 = 0; i13 < 64; i13++) {
            bArr4[i13] = (byte) (bArr2[i11 + i13] ^ bArr3[i12 + i13]);
        }
        byte[] bArr5 = new byte[64];
        for (int i14 = 0; i14 < 32; i14++) {
            bArr5[i14] = bArr4[i14];
            bArr5[i14 + 32] = f94682d[i14];
        }
        this.f94685c.getClass();
        h.c(bArr5, bArr5);
        for (int i15 = 0; i15 < 32; i15++) {
            bArr5[i15] = (byte) (bArr5[i15] ^ bArr4[i15 + 32]);
        }
        h.c(bArr5, bArr5);
        for (int i16 = 0; i16 < 32; i16++) {
            bArr[i10 + i16] = bArr5[i16];
        }
    }

    public final void b(byte[] bArr, int i10, int i11, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr3[i12] = bArr2[i11 + i12];
            bArr3[i12 + 32] = f94682d[i12];
        }
        this.f94685c.getClass();
        h.c(bArr3, bArr3);
        for (int i13 = 0; i13 < 32; i13++) {
            bArr[i10 + i13] = bArr3[i13];
        }
    }
}
