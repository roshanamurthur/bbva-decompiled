package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1dSDK implements SensorEventListener {

    @NonNull
    private final String AFInAppEventType;
    private long afDebugLog;
    private final int afErrorLog;

    @Nullable
    private Executor afInfoLog;
    private double afRDLog;
    private final int valueOf;

    @NonNull
    private final String values;
    private final float[][] AFKeystoreWrapper = new float[2][];
    private final long[] AFInAppEventParameterName = new long[2];

    public AFf1dSDK(Sensor sensor) {
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.values = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventType = str;
        this.afErrorLog = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.AFKeystoreWrapper;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventParameterName[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.AFKeystoreWrapper[1] = fArrCopyOf;
            this.AFInAppEventParameterName[1] = jCurrentTimeMillis;
            this.afRDLog = values(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j10 - this.afDebugLog) {
            this.afDebugLog = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFInAppEventParameterName[1] = jCurrentTimeMillis;
                return;
            }
            double dValues = values(fArr3, fArr);
            if (dValues > this.afRDLog) {
                this.AFKeystoreWrapper[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFInAppEventParameterName[1] = jCurrentTimeMillis;
                this.afRDLog = dValues;
            }
        }
    }

    @NonNull
    private static List<Float> AFInAppEventType(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(Float.valueOf(f6));
        }
        return arrayList;
    }

    @NonNull
    private synchronized Executor AFKeystoreWrapper() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @NonNull
    private Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.values);
        concurrentHashMap.put("sV", this.AFInAppEventType);
        float[] fArr = this.AFKeystoreWrapper[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.AFKeystoreWrapper[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }

    private static double values(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i10 = 0; i10 < iMin; i10++) {
            dPow += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFf1dSDK)) {
            return false;
        }
        AFf1dSDK aFf1dSDK = (AFf1dSDK) obj;
        return values(aFf1dSDK.valueOf, aFf1dSDK.values, aFf1dSDK.AFInAppEventType);
    }

    public final int hashCode() {
        return this.afErrorLog;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFKeystoreWrapper().execute(new androidx.appcompat.app.h(this, sensorEvent, 6));
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    private boolean values(int i10, @NonNull String str, @NonNull String str2) {
        return this.valueOf == i10 && this.values.equals(str) && this.AFInAppEventType.equals(str2);
    }

    public final void AFKeystoreWrapper(@NonNull Map<AFf1dSDK, Map<String, Object>> map, boolean z10) {
        if (values()) {
            map.put(this, valueOf());
            if (z10) {
                int length = this.AFKeystoreWrapper.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.AFKeystoreWrapper[i10] = null;
                }
                int length2 = this.AFInAppEventParameterName.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.AFInAppEventParameterName[i11] = 0;
                }
                this.afRDLog = 0.0d;
                this.afDebugLog = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, valueOf());
    }

    private boolean values() {
        return this.AFKeystoreWrapper[0] != null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
