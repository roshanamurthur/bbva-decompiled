package cz.muni.fi.xklinex.whiteboxAES.generator;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class Bijection4x4 implements Serializable {
    private static final long serialVersionUID = -1152980885268303628L;
    public final byte[] coding = new byte[16];
    public final byte[] invCoding = new byte[16];

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bijection4x4 bijection4x4 = (Bijection4x4) obj;
        return Arrays.equals(this.coding, bijection4x4.coding) && Arrays.equals(this.invCoding, bijection4x4.invCoding);
    }
}
