package com.bumptech.glide.gifdecoder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import rc.a;

/* JADX INFO: loaded from: classes9.dex */
public class GifHeaderParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f38106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GifHeader f38107c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38105a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38108d = 0;

    public final boolean a() {
        return this.f38107c.f38094b != 0;
    }

    public final int b() {
        try {
            return this.f38106b.get() & 255;
        } catch (Exception unused) {
            this.f38107c.f38094b = 1;
            return 0;
        }
    }

    public final void c() {
        int iB = b();
        this.f38108d = iB;
        if (iB <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f38108d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f38106b.get(this.f38105a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                this.f38107c.f38094b = 1;
                return;
            }
        }
    }

    public void clear() {
        this.f38106b = null;
        this.f38107c = null;
    }

    @Nullable
    public final int[] d(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f38106b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            this.f38107c.f38094b = 1;
        }
        return iArr;
    }

    public final void e(int i10) {
        byte[] bArr;
        boolean z10 = false;
        while (!z10 && !a() && this.f38107c.f38095c <= i10) {
            int iB = b();
            if (iB == 33) {
                int iB2 = b();
                if (iB2 == 1) {
                    g();
                } else if (iB2 == 249) {
                    this.f38107c.f38096d = new a();
                    b();
                    int iB3 = b();
                    a aVar = this.f38107c.f38096d;
                    int i11 = (iB3 & 28) >> 2;
                    aVar.f92984g = i11;
                    if (i11 == 0) {
                        aVar.f92984g = 1;
                    }
                    aVar.f92983f = (iB3 & 1) != 0;
                    short s4 = this.f38106b.getShort();
                    if (s4 < 2) {
                        s4 = 10;
                    }
                    a aVar2 = this.f38107c.f38096d;
                    aVar2.f92986i = s4 * 10;
                    aVar2.f92985h = b();
                    b();
                } else if (iB2 == 254) {
                    g();
                } else if (iB2 != 255) {
                    g();
                } else {
                    c();
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    while (true) {
                        bArr = this.f38105a;
                        if (i12 >= 11) {
                            break;
                        }
                        sb2.append((char) bArr[i12]);
                        i12++;
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        do {
                            c();
                            if (bArr[0] == 1) {
                                this.f38107c.f38104l = (bArr[1] & 255) | ((bArr[2] & 255) << 8);
                            }
                            if (this.f38108d <= 0) {
                                break;
                            }
                        } while (!a());
                    } else {
                        g();
                    }
                }
            } else if (iB == 44) {
                GifHeader gifHeader = this.f38107c;
                if (gifHeader.f38096d == null) {
                    gifHeader.f38096d = new a();
                }
                this.f38107c.f38096d.f92978a = this.f38106b.getShort();
                this.f38107c.f38096d.f92979b = this.f38106b.getShort();
                this.f38107c.f38096d.f92980c = this.f38106b.getShort();
                this.f38107c.f38096d.f92981d = this.f38106b.getShort();
                int iB4 = b();
                boolean z11 = (iB4 & 128) != 0;
                int iPow = (int) Math.pow(2.0d, (iB4 & 7) + 1);
                a aVar3 = this.f38107c.f38096d;
                aVar3.f92982e = (iB4 & 64) != 0;
                if (z11) {
                    aVar3.f92988k = d(iPow);
                } else {
                    aVar3.f92988k = null;
                }
                this.f38107c.f38096d.f92987j = this.f38106b.position();
                b();
                g();
                if (!a()) {
                    GifHeader gifHeader2 = this.f38107c;
                    gifHeader2.f38095c++;
                    gifHeader2.f38097e.add(gifHeader2.f38096d);
                }
            } else if (iB != 59) {
                this.f38107c.f38094b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void f() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) b());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f38107c.f38094b = 1;
            return;
        }
        this.f38107c.f38098f = this.f38106b.getShort();
        this.f38107c.f38099g = this.f38106b.getShort();
        int iB = b();
        GifHeader gifHeader = this.f38107c;
        gifHeader.f38100h = (iB & 128) != 0;
        gifHeader.f38101i = (int) Math.pow(2.0d, (iB & 7) + 1);
        this.f38107c.f38102j = b();
        GifHeader gifHeader2 = this.f38107c;
        b();
        gifHeader2.getClass();
        if (!this.f38107c.f38100h || a()) {
            return;
        }
        GifHeader gifHeader3 = this.f38107c;
        gifHeader3.f38093a = d(gifHeader3.f38101i);
        GifHeader gifHeader4 = this.f38107c;
        gifHeader4.f38103k = gifHeader4.f38093a[gifHeader4.f38102j];
    }

    public final void g() {
        int iB;
        do {
            iB = b();
            this.f38106b.position(Math.min(this.f38106b.position() + iB, this.f38106b.limit()));
        } while (iB > 0);
    }

    public boolean isAnimated() {
        f();
        if (!a()) {
            e(2);
        }
        return this.f38107c.f38095c > 1;
    }

    @NonNull
    public GifHeader parseHeader() {
        if (this.f38106b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f38107c;
        }
        f();
        if (!a()) {
            e(Integer.MAX_VALUE);
            GifHeader gifHeader = this.f38107c;
            if (gifHeader.f38095c < 0) {
                gifHeader.f38094b = 1;
            }
        }
        return this.f38107c;
    }

    public GifHeaderParser setData(@Nullable byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
        } else {
            this.f38106b = null;
            this.f38107c.f38094b = 2;
        }
        return this;
    }

    public GifHeaderParser setData(@NonNull ByteBuffer byteBuffer) {
        this.f38106b = null;
        Arrays.fill(this.f38105a, (byte) 0);
        this.f38107c = new GifHeader();
        this.f38108d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f38106b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f38106b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
