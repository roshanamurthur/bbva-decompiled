package com.bbva.discreetmode.proximity.event;

import android.hardware.SensorEvent;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProximitySensorEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/discreetmode/proximity/event/ProximitySensorEvent;", "", "", "a", "Ljava/lang/Float;", "getRange$discreetmode_release", "()Ljava/lang/Float;", "range", "Landroid/hardware/SensorEvent;", "event", "<init>", "(Landroid/hardware/SensorEvent;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class ProximitySensorEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float range;

    public ProximitySensorEvent(@Nullable SensorEvent sensorEvent) {
        float[] fArr;
        Float fFirstOrNull = null;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            fFirstOrNull = ArraysKt___ArraysKt.firstOrNull(fArr);
        }
        this.range = fFirstOrNull;
    }

    @Nullable
    /* JADX INFO: renamed from: getRange$discreetmode_release, reason: from getter */
    public final Float getRange() {
        return this.range;
    }
}
