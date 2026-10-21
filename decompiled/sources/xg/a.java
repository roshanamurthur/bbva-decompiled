package xg;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f94640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f94641d;

    public a(d dVar, int i10, int i11) {
        super(dVar);
        this.f94640c = (short) i10;
        this.f94641d = (short) i11;
    }

    @Override // xg.d
    public final void a(BitArray bitArray, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s4 = this.f94641d;
            if (i10 >= s4) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s4 <= 62)) {
                bitArray.appendBits(31, 5);
                if (s4 > 62) {
                    bitArray.appendBits(s4 - 31, 16);
                } else if (i10 == 0) {
                    bitArray.appendBits(Math.min((int) s4, 31), 5);
                } else {
                    bitArray.appendBits(s4 - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.f94640c + i10], 8);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        short s4 = this.f94640c;
        sb2.append((int) s4);
        sb2.append("::");
        sb2.append((s4 + this.f94641d) - 1);
        sb2.append(Typography.greater);
        return sb2.toString();
    }
}
