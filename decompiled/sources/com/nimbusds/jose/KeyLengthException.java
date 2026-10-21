package com.nimbusds.jose;

import androidx.camera.core.impl.utils.b;

/* JADX INFO: loaded from: classes10.dex */
public class KeyLengthException extends KeyException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f62552p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Algorithm f62553q0;

    public KeyLengthException(String str) {
        super(str);
        this.f62552p0 = 0;
        this.f62553q0 = null;
    }

    public Algorithm getAlgorithm() {
        return this.f62553q0;
    }

    public int getExpectedKeyLength() {
        return this.f62552p0;
    }

    public KeyLengthException(Algorithm algorithm) {
        this(0, algorithm);
    }

    public KeyLengthException(int i10, Algorithm algorithm) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 > 0 ? b.a("The expected key length is ", i10, " bits") : "Unexpected key length");
        if (algorithm != null) {
            str = " (for " + algorithm + " algorithm)";
        } else {
            str = "";
        }
        sb2.append(str);
        super(sb2.toString());
        this.f62552p0 = i10;
        this.f62553q0 = algorithm;
    }
}
