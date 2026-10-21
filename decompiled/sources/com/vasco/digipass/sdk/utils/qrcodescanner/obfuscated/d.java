package com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated;

import android.graphics.Rect;
import android.media.Image;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f65895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65897c;

    public d(Image image, Rect rect) {
        a(new b(image), rect);
    }

    public byte[] a() {
        return this.f65895a;
    }

    public int b() {
        return this.f65896b;
    }

    public int c() {
        return this.f65897c;
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f65898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f65899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f65900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f65901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f65902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f65903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f65904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f65905h;

        private b(Image image) {
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
            ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            this.f65898a = bArr;
            buffer.rewind();
            buffer.get(bArr);
            byte[] bArr2 = new byte[buffer2.remaining()];
            this.f65899b = bArr2;
            buffer2.rewind();
            buffer2.get(bArr2);
            byte[] bArr3 = new byte[buffer3.remaining()];
            this.f65900c = bArr3;
            buffer3.rewind();
            buffer3.get(bArr3);
            this.f65901d = image.getPlanes()[2].getPixelStride();
            this.f65902e = image.getPlanes()[2].getRowStride();
            this.f65903f = image.getPlanes()[0].getRowStride();
            this.f65904g = image.getWidth();
            this.f65905h = image.getHeight();
        }

        private b(byte[] bArr, int i10, int i11) {
            int i12 = i11 * i10;
            byte[] bArr2 = new byte[i12];
            this.f65898a = bArr2;
            int i13 = i12 / 2;
            this.f65899b = new byte[i13];
            this.f65900c = new byte[i13];
            int i14 = 0;
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            this.f65901d = 1;
            this.f65902e = i10 / 2;
            this.f65903f = i10;
            this.f65904g = i10;
            this.f65905h = i11;
            while (i12 < bArr.length - 1) {
                this.f65900c[i14] = bArr[i12];
                this.f65899b[i14] = bArr[i12 + 1];
                i14++;
                i12 += 2;
            }
        }
    }

    public void a(b bVar, Rect rect) {
        int i10 = 1;
        while ((bVar.f65904g * bVar.f65905h) / (i10 * i10) > 1000000) {
            i10 *= 2;
        }
        int i11 = rect.top;
        rect.top = i11 - (i11 % i10);
        int i12 = rect.left;
        rect.left = i12 - (i12 % i10);
        int i13 = rect.right;
        rect.right = i13 - (i13 % i10);
        int i14 = rect.bottom;
        rect.bottom = i14 - (i14 % i10);
        this.f65896b = rect.height() / i10;
        int iWidth = rect.width() / i10;
        this.f65897c = iWidth;
        this.f65895a = new byte[this.f65896b * 3 * iWidth];
        int i15 = rect.left;
        int i16 = rect.right;
        int i17 = rect.bottom;
        int i18 = 0;
        for (int i19 = rect.top; i19 < i17; i19 += i10) {
            for (int i20 = i15; i20 < i16; i20 += i10) {
                int[] iArrA = a(i19, i20, i10, bVar);
                byte[] bArr = this.f65895a;
                int i21 = i18 * 3;
                bArr[i21] = (byte) iArrA[0];
                bArr[i21 + 1] = (byte) iArrA[1];
                bArr[i21 + 2] = (byte) iArrA[2];
                i18++;
            }
        }
    }

    public d(byte[] bArr, int i10, int i11, Rect rect) {
        a(new b(bArr, i10, i11), rect);
    }

    private static int[] a(int i10, int i11, int i12, b bVar) {
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        for (int i13 = i10; i13 < i10 + i12; i13++) {
            for (int i14 = i11; i14 < i11 + i12; i14++) {
                int[] iArrA = a(i13, i14, bVar);
                iArr[0] = iArr[0] + iArrA[0];
                iArr[1] = iArr[1] + iArrA[1];
                iArr[2] = iArr[2] + iArrA[2];
            }
        }
        int i15 = i12 * i12;
        int i16 = iArr[0] / i15;
        int i17 = iArr[1] / i15;
        int i18 = iArr[2] / i15;
        iArr2[0] = i16;
        iArr2[1] = i17;
        iArr2[2] = i18;
        return iArr2;
    }

    private static int[] a(int i10, int i11, b bVar) {
        int[] iArr = new int[3];
        int i12 = ((i11 >> 1) * bVar.f65901d) + ((i10 >> 1) * bVar.f65902e);
        int i13 = bVar.f65898a[(i10 * bVar.f65903f) + i11];
        byte b10 = bVar.f65900c[i12];
        byte b11 = bVar.f65899b[i12];
        if (i13 < 0) {
            i13 += 255;
        }
        int i14 = b11 < 0 ? b11 + 127 : b11 - 128;
        int i15 = b10 < 0 ? b10 + 127 : b10 - 128;
        int i16 = i15 >> 3;
        int i17 = i15 >> 5;
        int i18 = i13 + i15 + (i15 >> 2) + i16 + i17;
        int i19 = 255;
        if (i18 < 0) {
            i18 = 0;
        } else if (i18 > 255) {
            i18 = 255;
        }
        int i20 = i14 >> 2;
        int i21 = ((((i13 - i20) + (i14 >> 4)) + (i14 >> 5)) - (i15 >> 1)) + i16 + (i15 >> 4) + i17;
        if (i21 < 0) {
            i21 = 0;
        } else if (i21 > 255) {
            i21 = 255;
        }
        int i22 = i13 + i14 + (i14 >> 1) + i20 + (i14 >> 6);
        if (i22 < 0) {
            i19 = 0;
        } else if (i22 <= 255) {
            i19 = i22;
        }
        iArr[0] = i18;
        iArr[1] = i21;
        iArr[2] = i19;
        return iArr;
    }
}
