package xg;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f94642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f94643d;

    public b(d dVar, int i10, int i11) {
        super(dVar);
        this.f94642c = (short) i10;
        this.f94643d = (short) i11;
    }

    @Override // xg.d
    public final void a(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.f94642c, this.f94643d);
    }

    public final String toString() {
        short s4 = this.f94643d;
        return "<" + Integer.toBinaryString((1 << s4) | (((1 << s4) - 1) & this.f94642c) | (1 << s4)).substring(1) + Typography.greater;
    }
}
