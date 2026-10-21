package com.bbva.discreetmode.proximity.event;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.bbva.plugin.geolocation.common.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProximitySensorEventListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/discreetmode/proximity/event/ProximitySensorEventListener;", "Landroid/hardware/SensorEventListener;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", ConstantsKt.ACCURACY, "", "onProximitySensorChanged", "event", "Lcom/bbva/discreetmode/proximity/event/ProximitySensorEvent;", "onSensorChanged", "Landroid/hardware/SensorEvent;", "discreetmode_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ProximitySensorEventListener extends SensorEventListener {

    /* JADX INFO: compiled from: ProximitySensorEventListener.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onAccuracyChanged(@NotNull ProximitySensorEventListener proximitySensorEventListener, @Nullable Sensor sensor, int i10) {
            Intrinsics.checkNotNullParameter(proximitySensorEventListener, "this");
        }

        public static void onSensorChanged(@NotNull ProximitySensorEventListener proximitySensorEventListener, @Nullable SensorEvent sensorEvent) {
            Intrinsics.checkNotNullParameter(proximitySensorEventListener, "this");
            proximitySensorEventListener.onProximitySensorChanged(new ProximitySensorEvent(sensorEvent));
        }
    }

    @Override // android.hardware.SensorEventListener
    void onAccuracyChanged(@Nullable Sensor sensor, int accuracy);

    void onProximitySensorChanged(@NotNull ProximitySensorEvent event);

    @Override // android.hardware.SensorEventListener
    void onSensorChanged(@Nullable SensorEvent event);
}
