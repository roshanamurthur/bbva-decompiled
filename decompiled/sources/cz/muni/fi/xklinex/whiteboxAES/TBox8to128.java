package cz.muni.fi.xklinex.whiteboxAES;

import androidx.appcompat.widget.a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class TBox8to128 implements Serializable {
    public static final int IWIDTH = 1;
    public static final int ROWS = 256;
    private static final long serialVersionUID = 5273192538806301472L;
    protected State[] tbl = null;

    public TBox8to128() {
        init();
    }

    public static State[] initNew() {
        return new State[256];
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.tbl, ((TBox8to128) obj).tbl);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.tbl) + 511;
    }

    public final void init() {
        this.tbl = initNew();
        for (int i10 = 0; i10 < 256; i10++) {
            this.tbl[i10] = new State();
        }
    }

    public State lookup(byte b10) {
        return this.tbl[AES.posIdx(b10)];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TBox8to128{tbl=");
        sb2.append(Arrays.toString(this.tbl));
        sb2.append("; size=");
        State[] stateArr = this.tbl;
        return a.c(sb2, stateArr != null ? stateArr.length : -1, "}");
    }
}
