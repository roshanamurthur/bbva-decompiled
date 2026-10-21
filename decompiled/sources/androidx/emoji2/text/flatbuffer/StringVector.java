package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class StringVector extends BaseVector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Utf8 f21383d = Utf8.getDefault();

    public StringVector __assign(int i10, int i11, ByteBuffer byteBuffer) {
        __reset(i10, i11, byteBuffer);
        return this;
    }

    public String get(int i10) {
        return Table.__string(__element(i10), this.bb, this.f21383d);
    }
}
