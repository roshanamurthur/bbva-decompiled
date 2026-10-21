package kotlin.io.encoding;

import androidx.collection.h;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalEncodingApi
public final class a extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final OutputStream f79668p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Base64 f79669q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f79670r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79671s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final byte[] f79672t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final byte[] f79673u0;
    public int v0;

    public a(@NotNull OutputStream output, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f79668p0 = output;
        this.f79669q0 = base64;
        this.f79671s0 = base64.getIsMimeScheme() ? 76 : -1;
        this.f79672t0 = new byte[1024];
        this.f79673u0 = new byte[3];
    }

    public final void b() {
        if (c(0, this.v0, this.f79673u0) != 4) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.v0 = 0;
    }

    public final int c(int i10, int i11, byte[] bArr) throws IOException {
        int iEncodeIntoByteArray = this.f79669q0.encodeIntoByteArray(bArr, this.f79672t0, 0, i10, i11);
        int i12 = this.f79671s0;
        OutputStream outputStream = this.f79668p0;
        if (i12 == 0) {
            outputStream.write(Base64.INSTANCE.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.f79671s0 = 76;
            if (iEncodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        outputStream.write(this.f79672t0, 0, iEncodeIntoByteArray);
        this.f79671s0 -= iEncodeIntoByteArray;
        return iEncodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f79670r0) {
            return;
        }
        this.f79670r0 = true;
        if (this.v0 != 0) {
            b();
        }
        this.f79668p0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f79670r0) {
            throw new IOException("The output stream is closed.");
        }
        this.f79668p0.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (this.f79670r0) {
            throw new IOException("The output stream is closed.");
        }
        int i11 = this.v0;
        int i12 = i11 + 1;
        this.v0 = i12;
        this.f79673u0[i11] = (byte) i10;
        if (i12 == 3) {
            b();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] source, int i10, int i11) throws IOException {
        int i12;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f79670r0) {
            if (i10 < 0 || i11 < 0 || (i12 = i10 + i11) > source.length) {
                StringBuilder sbE = h.e("offset: ", i10, ", length: ", i11, ", source size: ");
                sbE.append(source.length);
                throw new IndexOutOfBoundsException(sbE.toString());
            }
            if (i11 == 0) {
                return;
            }
            int i13 = this.v0;
            if (i13 < 3) {
                byte[] bArr = this.f79673u0;
                if (i13 != 0) {
                    int iMin = Math.min(3 - i13, i12 - i10);
                    int i14 = i10 + iMin;
                    ArraysKt___ArraysJvmKt.copyInto(source, bArr, this.v0, i10, i14);
                    int i15 = this.v0 + iMin;
                    this.v0 = i15;
                    if (i15 == 3) {
                        b();
                    }
                    if (this.v0 != 0) {
                        return;
                    } else {
                        i10 = i14;
                    }
                }
                while (i10 + 3 <= i12) {
                    int iMin2 = Math.min((this.f79669q0.getIsMimeScheme() ? this.f79671s0 : this.f79672t0.length) / 4, (i12 - i10) / 3);
                    int i16 = (iMin2 * 3) + i10;
                    if (c(i10, i16, source) != iMin2 * 4) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i10 = i16;
                }
                ArraysKt___ArraysJvmKt.copyInto(source, bArr, 0, i10, i12);
                this.v0 = i12 - i10;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IOException("The output stream is closed.");
    }
}
