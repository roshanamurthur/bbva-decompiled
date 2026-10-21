package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.errors.TerminalException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class sl implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f60892p0;

    public sl(int i10) throws TerminalException {
        this.f60892p0 = i10;
        nb nbVar = nb.INSTANCE;
        nb.setX(new Object[]{Integer.valueOf(i10)}, 1383735215, -1383735215, i10);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return Integer.valueOf(((sl) objArr[0]).f60892p0);
    }

    public final int setY() {
        return ((Integer) setY(new Object[]{this}, -1433045547, 1433045547, System.identityHashCode(this))).intValue();
    }
}
