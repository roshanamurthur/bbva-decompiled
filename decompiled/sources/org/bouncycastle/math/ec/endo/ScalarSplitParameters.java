package org.bouncycastle.math.ec.endo;

import androidx.camera.camera2.internal.h0;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class ScalarSplitParameters {
    protected final int bits;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    protected final BigInteger f90849g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    protected final BigInteger f90850g2;
    protected final BigInteger v1A;
    protected final BigInteger v1B;
    protected final BigInteger v2A;
    protected final BigInteger v2B;

    public ScalarSplitParameters(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        a(bigIntegerArr, ConfigConstantsKt.CUSTOMERS_API_VERSION);
        a(bigIntegerArr2, "v2");
        this.v1A = bigIntegerArr[0];
        this.v1B = bigIntegerArr[1];
        this.v2A = bigIntegerArr2[0];
        this.v2B = bigIntegerArr2[1];
        this.f90849g1 = bigInteger;
        this.f90850g2 = bigInteger2;
        this.bits = i10;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(h0.b("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public int getBits() {
        return this.bits;
    }

    public BigInteger getG1() {
        return this.f90849g1;
    }

    public BigInteger getG2() {
        return this.f90850g2;
    }

    public BigInteger getV1A() {
        return this.v1A;
    }

    public BigInteger getV1B() {
        return this.v1B;
    }

    public BigInteger getV2A() {
        return this.v2A;
    }

    public BigInteger getV2B() {
        return this.v2B;
    }
}
