package jk;

import androidx.collection.h;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.Base64Kt;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalEncodingApi
public final class a extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InputStream f79094p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Base64 f79095q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f79096r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f79097s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final byte[] f79098t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final byte[] f79099u0;

    @NotNull
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f79100w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f79101x0;

    public a(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f79094p0 = input;
        this.f79095q0 = base64;
        this.f79098t0 = new byte[1];
        this.f79099u0 = new byte[1024];
        this.v0 = new byte[1024];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f79096r0) {
            return;
        }
        this.f79096r0 = true;
        this.f79094p0.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f79100w0;
        int i11 = this.f79101x0;
        if (i10 < i11) {
            int i12 = this.v0[i10] & 255;
            int i13 = i10 + 1;
            this.f79100w0 = i13;
            if (i13 == i11) {
                this.f79100w0 = 0;
                this.f79101x0 = 0;
            }
            return i12;
        }
        byte[] bArr = this.f79098t0;
        int i14 = read(bArr, 0, 1);
        if (i14 == -1) {
            return -1;
        }
        if (i14 == 1) {
            return bArr[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int i10, int i11) throws IOException {
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i10 >= 0 && i11 >= 0 && (i12 = i10 + i11) <= destination.length) {
            if (!this.f79096r0) {
                if (this.f79097s0) {
                    return -1;
                }
                int i16 = 0;
                if (i11 == 0) {
                    return 0;
                }
                int i17 = this.f79101x0;
                int i18 = this.f79100w0;
                int i19 = i17 - i18;
                byte[] bArr = this.v0;
                if (i19 >= i11) {
                    ArraysKt___ArraysJvmKt.copyInto(bArr, destination, i10, i18, i18 + i11);
                    int i20 = this.f79100w0 + i11;
                    this.f79100w0 = i20;
                    if (i20 == this.f79101x0) {
                        this.f79100w0 = 0;
                        this.f79101x0 = 0;
                    }
                    return i11;
                }
                int i21 = (((i11 - (i17 - i18)) + 2) / 3) * 4;
                int i22 = i10;
                while (true) {
                    z10 = this.f79097s0;
                    if (z10 || i21 <= 0) {
                        break;
                    }
                    byte[] bArr2 = this.f79099u0;
                    int iMin = Math.min(bArr2.length, i21);
                    int i23 = i16;
                    while (true) {
                        z11 = this.f79097s0;
                        if (z11 || i23 >= iMin) {
                            break;
                        }
                        Base64 base64 = this.f79095q0;
                        boolean zIsMimeScheme$kotlin_stdlib = base64.getIsMimeScheme();
                        InputStream inputStream = this.f79094p0;
                        if (!zIsMimeScheme$kotlin_stdlib) {
                            i14 = inputStream.read();
                        } else {
                            do {
                                i14 = inputStream.read();
                                if (i14 == -1) {
                                    break;
                                }
                            } while (!Base64Kt.isInMimeAlphabet(i14));
                        }
                        if (i14 == -1) {
                            this.f79097s0 = true;
                        } else if (i14 != 61) {
                            bArr2[i23] = (byte) i14;
                            i23++;
                        } else {
                            bArr2[i23] = Base64.padSymbol;
                            if ((i23 & 3) == 2) {
                                if (!base64.getIsMimeScheme()) {
                                    i15 = inputStream.read();
                                } else {
                                    do {
                                        i15 = inputStream.read();
                                        if (i15 == -1) {
                                            break;
                                        }
                                    } while (!Base64Kt.isInMimeAlphabet(i15));
                                }
                                if (i15 >= 0) {
                                    bArr2[i23 + 1] = (byte) i15;
                                }
                                i23 += 2;
                            } else {
                                i23++;
                            }
                            this.f79097s0 = true;
                        }
                    }
                    if (!z11 && i23 != iMin) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i21 -= i23;
                    int i24 = this.f79101x0;
                    int iDecodeIntoByteArray = i24 + this.f79095q0.decodeIntoByteArray(this.f79099u0, this.v0, i24, 0, i23);
                    this.f79101x0 = iDecodeIntoByteArray;
                    int iMin2 = Math.min(iDecodeIntoByteArray - this.f79100w0, i12 - i22);
                    int i25 = this.f79100w0;
                    ArraysKt___ArraysJvmKt.copyInto(bArr, destination, i22, i25, i25 + iMin2);
                    int i26 = this.f79100w0 + iMin2;
                    this.f79100w0 = i26;
                    if (i26 == this.f79101x0) {
                        i13 = 0;
                        this.f79100w0 = 0;
                        this.f79101x0 = 0;
                    } else {
                        i13 = 0;
                    }
                    int length = bArr.length;
                    int i27 = this.f79101x0;
                    if ((bArr2.length / 4) * 3 > length - i27) {
                        ArraysKt___ArraysJvmKt.copyInto(bArr, bArr, i13, this.f79100w0, i27);
                        this.f79101x0 -= this.f79100w0;
                        this.f79100w0 = i13;
                    }
                    i22 += iMin2;
                    i16 = i13;
                }
                if (i22 == i10 && z10) {
                    return -1;
                }
                return i22 - i10;
            }
            throw new IOException("The input stream is closed.");
        }
        StringBuilder sbE = h.e("offset: ", i10, ", length: ", i11, ", buffer size: ");
        sbE.append(destination.length);
        throw new IndexOutOfBoundsException(sbE.toString());
    }
}
