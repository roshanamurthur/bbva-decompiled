package jg;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RequestLimiter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f79085d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f79086e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f79087a = Utils.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public long f79088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public int f79089c;

    public final synchronized long a(int i10) {
        try {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                return (long) Math.min(Math.pow(2.0d, this.f79089c) + this.f79087a.getRandomDelayForSyncPrevention(), f79086e);
            }
            return f79085d;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean b() {
        return this.f79089c == 0 || this.f79087a.currentTimeInMillis() > this.f79088b;
    }

    public final synchronized void c() {
        this.f79089c = 0;
    }

    public final synchronized void d(int i10) {
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                c();
                return;
            }
            this.f79089c++;
            this.f79088b = this.f79087a.currentTimeInMillis() + a(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
