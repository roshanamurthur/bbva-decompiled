package b4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.akamai.botman.ap;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends Observable implements SensorEventListener {
    public boolean E0;
    public long F0;
    public float[] G0;
    public float[] H0;
    public boolean I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SensorManager f24819p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Sensor f24820q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Sensor f24821r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Sensor f24822s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public HandlerThread f24823t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24824u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f24825w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f24826x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f24827y0;

    public final void a() throws Exception {
        boolean z10 = this.v0;
        SensorManager sensorManager = this.f24819p0;
        if (z10) {
            sensorManager.unregisterListener(this, this.f24821r0);
            this.v0 = false;
        }
        if (this.f24825w0) {
            sensorManager.unregisterListener(this, this.f24822s0);
            this.f24825w0 = false;
        }
        if (this.f24824u0) {
            sensorManager.unregisterListener(this, this.f24820q0);
            this.f24824u0 = false;
        }
        this.E0 = false;
        HandlerThread handlerThread = this.f24823t0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f24823t0.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.E0 && sensorEvent.accuracy == 0) {
                ap.b("OrientationListener", "Unreliable orientation sensor data...", new Throwable[0]);
                this.E0 = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 9 || type == 1) {
                this.G0 = (float[]) sensorEvent.values.clone();
                this.f24826x0 = true;
            } else if (type == 2) {
                this.H0 = (float[]) sensorEvent.values.clone();
                this.f24827y0 = true;
            }
            if (this.f24826x0 && this.f24827y0) {
                long j10 = jUptimeMillis - this.F0;
                if (j10 >= 100 || com.akamai.botman.e.f26328e == 1) {
                    this.F0 = jUptimeMillis;
                    String str = com.akamai.botman.e.f26325b;
                    com.akamai.botman.e.f26328e = 0;
                    setChanged();
                    notifyObservers(new k(this.G0, this.H0, this.F0, this.I0, j10));
                    this.f24826x0 = false;
                    this.f24827y0 = false;
                    this.I0 = false;
                }
            }
        } catch (Exception e5) {
            ap.b("OrientationListener", "Exception in processing orientation event", e5);
            f.a(e5);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
