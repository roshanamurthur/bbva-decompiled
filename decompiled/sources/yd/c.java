package yd;

import androidx.camera.camera2.internal.compat.u;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: EventStoreConfig.java */
/* JADX INFO: loaded from: classes9.dex */
@AutoValue
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94771a;

    static {
        Long l6 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l7 = 604800000L;
        Integer num3 = 81920;
        String strF = l6 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strF = strF.concat(" loadBatchSize");
        }
        if (num2 == null) {
            strF = u.f(strF, " criticalSectionEnterTimeoutMs");
        }
        if (l7 == null) {
            strF = u.f(strF, " eventCleanUpAge");
        }
        if (num3 == null) {
            strF = u.f(strF, " maxBlobByteSizePerRow");
        }
        if (!strF.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }
        f94771a = new a(l6.longValue(), num.intValue(), num2.intValue(), l7.longValue(), num3.intValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
