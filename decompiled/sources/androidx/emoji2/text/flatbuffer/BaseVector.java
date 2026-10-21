package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BaseVector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21337b;
    protected ByteBuffer bb;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21338c;

    public int __element(int i10) {
        return (i10 * this.f21338c) + this.f21336a;
    }

    public void __reset(int i10, int i11, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.f21336a = i10;
            this.f21337b = byteBuffer.getInt(i10 - 4);
            this.f21338c = i11;
        } else {
            this.f21336a = 0;
            this.f21337b = 0;
            this.f21338c = 0;
        }
    }

    public int __vector() {
        return this.f21336a;
    }

    public int length() {
        return this.f21337b;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
