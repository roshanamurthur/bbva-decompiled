package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class W32b implements Serializable {
    public static final int WIDTH = 4;
    private static final long serialVersionUID = 5382577044317817112L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f68115b = null;

    public W32b() {
        init();
    }

    public static byte[] initNew() {
        return new byte[4];
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.f68115b, ((W32b) obj).f68115b);
        }
        return false;
    }

    public byte[] get() {
        return this.f68115b;
    }

    public long getLong() {
        return Utils.byte2long(get());
    }

    public int hashCode() {
        return Arrays.hashCode(this.f68115b) + 205;
    }

    public final void init() {
        this.f68115b = initNew();
    }

    public void set(long j10) {
        Utils.long2byte(this.f68115b, j10);
    }

    public String toString() {
        if (this.f68115b == null) {
            return "W32b{b=null}";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = this.f68115b.length;
        int i10 = 0;
        while (i10 < length) {
            sb2.append(String.format("0x%02X", Integer.valueOf(this.f68115b[i10] & 255)));
            i10++;
            if (i10 != length) {
                sb2.append(", ");
            }
        }
        return "W32b{b=" + ((Object) sb2) + ";mem=" + Arrays.toString(this.f68115b) + "}";
    }
}
