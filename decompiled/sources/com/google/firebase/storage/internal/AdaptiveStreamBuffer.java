package com.google.firebase.storage.internal;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class AdaptiveStreamBuffer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Runtime f49125f = Runtime.getRuntime();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f49126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f49127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49128c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49130e = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49129d = false;

    public AdaptiveStreamBuffer(InputStream inputStream, int i10) {
        this.f49126a = inputStream;
        this.f49127b = new byte[i10];
    }

    public int advance(int i10) throws IOException {
        int i11 = this.f49128c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f49128c = i13;
            byte[] bArr = this.f49127b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f49128c = 0;
        while (i12 < i10) {
            InputStream inputStream = this.f49126a;
            int iSkip = (int) inputStream.skip(i10 - i12);
            if (iSkip > 0) {
                i12 += iSkip;
            } else if (iSkip != 0) {
                continue;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    public int available() {
        return this.f49128c;
    }

    public void close() throws IOException {
        this.f49126a.close();
    }

    public int fill(int i10) throws IOException {
        byte[] bArr = this.f49127b;
        if (i10 > bArr.length) {
            int iMax = Math.max(bArr.length * 2, i10);
            Runtime runtime = f49125f;
            long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (!this.f49130e || iMax >= jMaxMemory) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
            } else {
                try {
                    byte[] bArr2 = new byte[iMax];
                    System.arraycopy(this.f49127b, 0, bArr2, 0, this.f49128c);
                    this.f49127b = bArr2;
                } catch (OutOfMemoryError unused) {
                    Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                    this.f49130e = false;
                }
            }
            i10 = Math.min(i10, this.f49127b.length);
        }
        while (true) {
            int i11 = this.f49128c;
            if (i11 >= i10) {
                break;
            }
            int i12 = this.f49126a.read(this.f49127b, i11, i10 - i11);
            if (i12 == -1) {
                this.f49129d = true;
                break;
            }
            this.f49128c += i12;
        }
        return this.f49128c;
    }

    public byte[] get() {
        return this.f49127b;
    }

    public boolean isFinished() {
        return this.f49129d;
    }
}
