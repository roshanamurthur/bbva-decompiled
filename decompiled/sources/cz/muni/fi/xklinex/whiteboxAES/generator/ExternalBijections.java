package cz.muni.fi.xklinex.whiteboxAES.generator;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class ExternalBijections implements Serializable {
    private static final long serialVersionUID = 2997480453304089327L;
    private final Bijection4x4[][] lfC = (Bijection4x4[][]) Array.newInstance((Class<?>) Bijection4x4.class, 2, 32);
    private final LinearBijection[] IODM = new LinearBijection[2];

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalBijections externalBijections = (ExternalBijections) obj;
        return Arrays.deepEquals(this.lfC, externalBijections.lfC) && Arrays.deepEquals(this.IODM, externalBijections.IODM);
    }

    public LinearBijection[] getIODM() {
        return this.IODM;
    }

    public Bijection4x4[][] getLfC() {
        return this.lfC;
    }
}
