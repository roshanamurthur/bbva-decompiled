package com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated;

import android.graphics.Rect;
import android.media.Image;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f65882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f65885d;

    public b(Image image) {
        this.f65883b = image.getWidth();
        this.f65884c = image.getHeight();
        this.f65885d = image.getPlanes()[0].getRowStride();
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.remaining()];
        this.f65882a = bArr;
        buffer.get(bArr);
    }

    public void a(Rect rect) {
        int i10 = 1;
        while ((rect.height() * rect.width()) / (i10 * i10) > 900000) {
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
        this.f65883b = rect.width() / i10;
        int iHeight = rect.height() / i10;
        this.f65884c = iHeight;
        byte[] bArr = new byte[this.f65883b * iHeight];
        int i15 = 0;
        for (int i16 = rect.top; i16 < rect.bottom; i16 += i10) {
            int i17 = this.f65885d * i16;
            for (int i18 = rect.left; i18 < rect.right; i18 += i10) {
                bArr[i15] = this.f65882a[i17 + i18];
                i15++;
            }
        }
        this.f65882a = bArr;
    }

    public int b() {
        return this.f65884c;
    }

    public int c() {
        return this.f65883b;
    }

    public byte[] a() {
        return this.f65882a;
    }
}
