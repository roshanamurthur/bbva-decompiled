package bc.org.bouncycastle.math.ec.endo;

import androidx.camera.camera2.internal.h0;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GLVTypeBParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BigInteger f25179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final BigInteger f25180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final BigInteger f25181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final BigInteger f25182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final BigInteger f25183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final BigInteger f25184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final BigInteger f25185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final BigInteger f25186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f25187i;

    public GLVTypeBParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        a(bigIntegerArr, ConfigConstantsKt.CUSTOMERS_API_VERSION);
        a(bigIntegerArr2, "v2");
        this.f25179a = bigInteger;
        this.f25180b = bigInteger2;
        this.f25181c = bigIntegerArr[0];
        this.f25182d = bigIntegerArr[1];
        this.f25183e = bigIntegerArr2[0];
        this.f25184f = bigIntegerArr2[1];
        this.f25185g = bigInteger3;
        this.f25186h = bigInteger4;
        this.f25187i = i10;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(h0.b("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public BigInteger getBeta() {
        return this.f25179a;
    }

    public int getBits() {
        return this.f25187i;
    }

    public BigInteger getG1() {
        return this.f25185g;
    }

    public BigInteger getG2() {
        return this.f25186h;
    }

    public BigInteger getLambda() {
        return this.f25180b;
    }

    public BigInteger[] getV1() {
        return new BigInteger[]{this.f25181c, this.f25182d};
    }

    public BigInteger getV1A() {
        return this.f25181c;
    }

    public BigInteger getV1B() {
        return this.f25182d;
    }

    public BigInteger[] getV2() {
        return new BigInteger[]{this.f25183e, this.f25184f};
    }

    public BigInteger getV2A() {
        return this.f25183e;
    }

    public BigInteger getV2B() {
        return this.f25184f;
    }
}
