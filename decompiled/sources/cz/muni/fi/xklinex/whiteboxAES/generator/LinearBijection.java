package cz.muni.fi.xklinex.whiteboxAES.generator;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class LinearBijection implements Serializable {
    private static final long serialVersionUID = 1495183229858485109L;

    /* JADX INFO: renamed from: mb, reason: collision with root package name */
    private final GF2MatrixEx f68118mb = new GF2MatrixEx();
    private final GF2MatrixEx inv = new GF2MatrixEx();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinearBijection linearBijection = (LinearBijection) obj;
        return Objects.equals(this.f68118mb, linearBijection.f68118mb) && Objects.equals(this.inv, linearBijection.inv);
    }

    public GF2MatrixEx getInv() {
        return this.inv;
    }

    public GF2MatrixEx getMb() {
        return this.f68118mb;
    }
}
