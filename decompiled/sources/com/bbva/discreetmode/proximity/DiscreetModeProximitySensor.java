package com.bbva.discreetmode.proximity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.bbva.discreetmode.proximity.event.ProximitySensorEvent;
import com.bbva.discreetmode.proximity.event.ProximitySensorEventListener;
import com.bbva.discreetmode.proximity.models.DiscreetModeProximityConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeProximitySensor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/bbva/discreetmode/proximity/DiscreetModeProximitySensor;", "Lcom/bbva/discreetmode/proximity/event/ProximitySensorEventListener;", "", "startAnalyzing", "stopAnalyzing", "Lcom/bbva/discreetmode/proximity/event/ProximitySensorEvent;", "event", "onProximitySensorChanged", "Lkotlinx/coroutines/channels/Channel;", "", "r0", "Lkotlinx/coroutines/channels/Channel;", "isSensorActive", "()Lkotlinx/coroutines/channels/Channel;", "Landroid/content/Context;", "context", "Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;", "configuration", "<init>", "(Landroid/content/Context;Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeProximitySensor implements ProximitySensorEventListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f29093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final DiscreetModeProximityConfiguration f29094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Channel<Boolean> isSensorActive;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f29096s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f29097t0;

    /* JADX INFO: compiled from: DiscreetModeProximitySensor.kt */
    public static final class a extends Lambda implements Function0<Sensor> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Sensor invoke() {
            SensorManager sensorManagerAccess$getSensorManager = DiscreetModeProximitySensor.access$getSensorManager(DiscreetModeProximitySensor.this);
            if (sensorManagerAccess$getSensorManager == null) {
                return null;
            }
            return sensorManagerAccess$getSensorManager.getDefaultSensor(8);
        }
    }

    /* JADX INFO: compiled from: DiscreetModeProximitySensor.kt */
    public static final class b extends Lambda implements Function0<SensorManager> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SensorManager invoke() {
            Object systemService = DiscreetModeProximitySensor.this.f29093p0.getSystemService("sensor");
            if (systemService != null) {
                return (SensorManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.hardware.SensorManager");
        }
    }

    public DiscreetModeProximitySensor(@NotNull Context context, @NotNull DiscreetModeProximityConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f29093p0 = context;
        this.f29094q0 = configuration;
        this.isSensorActive = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f29096s0 = LazyKt__LazyJVMKt.lazy(new b());
        this.f29097t0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final SensorManager access$getSensorManager(DiscreetModeProximitySensor discreetModeProximitySensor) {
        return (SensorManager) discreetModeProximitySensor.f29096s0.getValue();
    }

    @NotNull
    public final Channel<Boolean> isSensorActive() {
        return this.isSensorActive;
    }

    @Override // com.bbva.discreetmode.proximity.event.ProximitySensorEventListener, android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int i10) {
        ProximitySensorEventListener.DefaultImpls.onAccuracyChanged(this, sensor, i10);
    }

    @Override // com.bbva.discreetmode.proximity.event.ProximitySensorEventListener
    public void onProximitySensorChanged(@NotNull ProximitySensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Float range = event.getRange();
        if (range == null) {
            return;
        }
        float fFloatValue = range.floatValue();
        Sensor sensor = (Sensor) this.f29097t0.getValue();
        if (sensor == null) {
            return;
        }
        isSensorActive().offer(Boolean.valueOf(fFloatValue < sensor.getMaximumRange()));
    }

    @Override // com.bbva.discreetmode.proximity.event.ProximitySensorEventListener, android.hardware.SensorEventListener
    public void onSensorChanged(@Nullable SensorEvent sensorEvent) {
        ProximitySensorEventListener.DefaultImpls.onSensorChanged(this, sensorEvent);
    }

    public final void startAnalyzing() {
        SensorManager sensorManager = (SensorManager) this.f29096s0.getValue();
        if (sensorManager == null) {
            return;
        }
        sensorManager.registerListener(this, (Sensor) this.f29097t0.getValue(), this.f29094q0.getPeriodOfMeasure());
    }

    public final void stopAnalyzing() {
        SensorManager sensorManager = (SensorManager) this.f29096s0.getValue();
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
    }
}
