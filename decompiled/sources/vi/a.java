package vi;

import androidx.annotation.NonNull;
import com.veridas.camera.metrics.FocusMeasurementAlreadyStartedException;
import com.veridas.camera.metrics.FocusMeasurementNotStartedException;
import com.veridas.camera.metrics.InsufficientDataCollectedException;
import com.veridas.camera.metrics.MeteringSession;
import com.veridas.camera.metrics.MeteringSessionAlreadyDestroyedException;
import com.veridas.camera.metrics.MeteringSessionAlreadyStartedException;
import com.veridas.camera.metrics.MeteringSessionAlreadyStoppedException;
import com.veridas.camera.metrics.MeteringSessionCollection;
import com.veridas.camera.metrics.MeteringSessionNotStartedException;
import com.veridas.camera.metrics.Metrics;
import com.veridas.log.Log;
import java.util.Date;
import java.util.LinkedList;

/* JADX INFO: compiled from: DefaultMeteringSession.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements MeteringSession {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MeteringSessionCollection<a> f94075g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f94077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Date f94078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Date f94079k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f94069a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f94070b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList<Long> f94071c = new LinkedList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList<Long> f94072d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList<Long> f94073e = new LinkedList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList<Boolean> f94074f = new LinkedList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f94076h = new Object();

    public a(@NonNull MeteringSessionCollection<a> meteringSessionCollection) {
        if (meteringSessionCollection == null) {
            throw new IllegalArgumentException("The meteringSessionCollection argument can't be null.");
        }
        this.f94075g = meteringSessionCollection;
    }

    public final void a() {
        synchronized (this.f94076h) {
            try {
                if (this.f94070b) {
                    this.f94072d.add(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f94076h) {
            try {
                if (this.f94070b) {
                    this.f94071c.add(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f94076h) {
            try {
                if (this.f94070b) {
                    if (this.f94077i == null) {
                        throw new FocusMeasurementNotStartedException();
                    }
                    this.f94073e.add(Long.valueOf(System.currentTimeMillis() - this.f94077i.longValue()));
                    this.f94074f.add(Boolean.valueOf(z10));
                    this.f94077i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f94076h) {
            try {
                if (this.f94070b) {
                    if (this.f94077i != null) {
                        throw new FocusMeasurementAlreadyStartedException();
                    }
                    this.f94077i = Long.valueOf(System.currentTimeMillis());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final void destroy() {
        synchronized (this.f94076h) {
            try {
                this.f94071c.clear();
                this.f94072d.clear();
                this.f94073e.clear();
                this.f94074f.clear();
                this.f94070b = false;
                this.f94069a = true;
                MeteringSessionCollection<a> meteringSessionCollection = this.f94075g;
                if (meteringSessionCollection != null) {
                    meteringSessionCollection.remove(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final Metrics getMetrics() {
        synchronized (this.f94076h) {
            try {
                if (this.f94069a) {
                    throw new MeteringSessionAlreadyDestroyedException();
                }
                if (this.f94078j == null) {
                    throw new MeteringSessionNotStartedException();
                }
                if (this.f94071c.size() < 2) {
                    throw new InsufficientDataCollectedException();
                }
                if (this.f94069a || this.f94078j == null || this.f94071c.size() <= 1) {
                    return null;
                }
                Date date = this.f94079k;
                if (date == null) {
                    date = new Date();
                }
                Date date2 = date;
                return b.a(this.f94078j, date2, new LinkedList(this.f94071c), new LinkedList(this.f94072d), new LinkedList(this.f94073e), new LinkedList(this.f94074f));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final boolean isActive() {
        return this.f94070b;
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final boolean isDestroyed() {
        return this.f94069a;
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final void start() {
        Log.i("a", "Starting metering session.");
        synchronized (this.f94076h) {
            try {
                if (this.f94070b) {
                    throw new MeteringSessionAlreadyStartedException();
                }
                this.f94078j = new Date();
                this.f94079k = null;
                this.f94071c.clear();
                this.f94072d.clear();
                this.f94073e.clear();
                this.f94074f.clear();
                this.f94070b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSession
    public final void stop() {
        Log.i("a", "Stopping metering session.");
        synchronized (this.f94076h) {
            try {
                if (!this.f94070b) {
                    throw new MeteringSessionAlreadyStoppedException();
                }
                this.f94079k = new Date();
                this.f94070b = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
