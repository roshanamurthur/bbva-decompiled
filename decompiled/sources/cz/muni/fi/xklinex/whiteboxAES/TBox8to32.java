package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class TBox8to32 implements Serializable {
    public static final int IWIDTH = 1;
    public static final int ROWS = 256;
    private static final long serialVersionUID = -7488492591201161346L;
    protected long[] tbl = null;

    public TBox8to32() {
        init();
    }

    public static long[] initNew() {
        return new long[256];
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.tbl, ((TBox8to32) obj).tbl);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.tbl) + 291;
    }

    public final void init() {
        this.tbl = initNew();
    }

    public long lookup(byte b10) {
        return this.tbl[AES.posIdx(b10)];
    }
}
