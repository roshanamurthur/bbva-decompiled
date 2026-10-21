package org.junit.internal;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes13.dex */
public class RealSystem implements JUnitSystem {
    @Override // org.junit.internal.JUnitSystem
    @Deprecated
    public void exit(int i10) {
        System.exit(i10);
    }

    @Override // org.junit.internal.JUnitSystem
    public PrintStream out() {
        return System.out;
    }
}
