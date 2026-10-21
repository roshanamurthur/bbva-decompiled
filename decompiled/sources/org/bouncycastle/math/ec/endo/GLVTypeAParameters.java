package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class GLVTypeAParameters {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final BigInteger f90848i;
    protected final BigInteger lambda;
    protected final ScalarSplitParameters splitParams;

    public GLVTypeAParameters(BigInteger bigInteger, BigInteger bigInteger2, ScalarSplitParameters scalarSplitParameters) {
        this.f90848i = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }

    public BigInteger getI() {
        return this.f90848i;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }
}
