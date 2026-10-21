package b4;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.akamai.botman.ap;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Observable implements SensorEventListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SensorManager f24793p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Sensor f24794q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Sensor f24795r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HandlerThread f24796s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f24797t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24798u0 = false;
    public boolean v0 = false;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f24799w0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f24800x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f24801y0 = false;
    public float E0 = -1.0f;
    public float F0 = -1.0f;
    public float G0 = -1.0f;
    public float H0 = -1.0f;
    public float I0 = -1.0f;
    public float J0 = -1.0f;
    public float K0 = -1.0f;
    public float L0 = -1.0f;
    public float M0 = -1.0f;
    public float N0 = 0.0f;
    public final float[] O0 = {0.0f, 0.0f, 0.0f};
    public int P0 = 0;
    public boolean Q0 = true;

    public i(Application application) {
        try {
            this.f24793p0 = (SensorManager) application.getSystemService("sensor");
        } catch (Exception e5) {
            ap.c("MotionListener", "Exception on getting sensor service", e5);
            f.a(e5);
        }
    }

    public final void a() throws Exception {
        boolean z10 = this.v0;
        SensorManager sensorManager = this.f24793p0;
        if (z10) {
            sensorManager.unregisterListener(this, this.f24795r0);
            this.v0 = false;
        }
        if (this.f24798u0) {
            sensorManager.unregisterListener(this, this.f24794q0);
            this.f24798u0 = false;
        }
        this.f24801y0 = false;
        HandlerThread handlerThread = this.f24796s0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f24796s0.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f24801y0 && sensorEvent.accuracy == 0) {
                ap.b("MotionListener", "Unreliable motion sensors data...", new Throwable[0]);
                this.f24801y0 = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 4) {
                if (this.v0) {
                    float[] fArr = sensorEvent.values;
                    this.K0 = fArr[0];
                    this.L0 = fArr[1];
                    this.M0 = fArr[2];
                    this.f24799w0 = true;
                }
            } else if (type == 1 && this.f24798u0) {
                float[] fArr2 = sensorEvent.values;
                this.E0 = fArr2[0];
                this.F0 = fArr2[1];
                this.G0 = fArr2[2];
                float fNanoTime = System.nanoTime();
                int i10 = this.P0 + 1;
                this.P0 = i10;
                float f6 = 1.0f / (i10 / ((fNanoTime - this.N0) / 1.0E9f));
                if (Float.isNaN(f6) || Float.isInfinite(f6)) {
                    f6 = 0.0f;
                }
                float f10 = 0.18f / (f6 + 0.18f);
                float[] fArr3 = this.O0;
                float f11 = 1.0f - f10;
                float f12 = (fArr2[0] * f11) + (fArr3[0] * f10);
                fArr3[0] = f12;
                float f13 = (fArr2[1] * f11) + (fArr3[1] * f10);
                fArr3[1] = f13;
                float f14 = (f11 * fArr2[2]) + (f10 * fArr3[2]);
                fArr3[2] = f14;
                float[] fArr4 = {0.0f, 0.0f, 0.0f};
                float f15 = fArr2[0] - f12;
                fArr4[0] = f15;
                fArr4[1] = fArr2[1] - f13;
                fArr4[2] = fArr2[2] - f14;
                if (Float.isNaN(f15) || Float.isInfinite(fArr4[0])) {
                    fArr4[0] = 0.0f;
                }
                if (Float.isNaN(fArr4[1]) || Float.isInfinite(fArr4[1])) {
                    fArr4[1] = 0.0f;
                }
                if (Float.isNaN(fArr4[2]) || Float.isInfinite(fArr4[2])) {
                    fArr4[2] = 0.0f;
                }
                float f16 = fArr4[0];
                float f17 = fArr4[1];
                float f18 = fArr4[2];
                this.E0 *= -1.0f;
                this.F0 *= -1.0f;
                this.G0 *= -1.0f;
                this.H0 = f16 * (-1.0f);
                this.I0 = f17 * (-1.0f);
                this.J0 = f18 * (-1.0f);
                this.f24800x0 = true;
            }
            if (this.f24799w0 && this.f24800x0) {
                long j10 = jUptimeMillis - this.f24797t0;
                if (j10 >= 100 || com.akamai.botman.e.f26327d == 1) {
                    this.f24797t0 = jUptimeMillis;
                    String str = com.akamai.botman.e.f26325b;
                    com.akamai.botman.e.f26327d = 0;
                    setChanged();
                    notifyObservers(new j(this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.f24797t0, this.Q0, j10));
                    this.f24799w0 = !this.v0;
                    this.f24800x0 = !this.f24798u0;
                    this.Q0 = false;
                }
            }
        } catch (Exception e5) {
            ap.b("MotionListener", "Exception in processing motion event", e5);
            f.a(e5);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
