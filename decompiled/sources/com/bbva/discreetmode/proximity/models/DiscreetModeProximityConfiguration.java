package com.bbva.discreetmode.proximity.models;

import com.bbva.discreetmode.extensions.NumberExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DiscreetModeProximityConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/discreetmode/proximity/models/DiscreetModeProximityConfiguration;", "", "", "getPeriodOfMeasure", "()I", "periodOfMeasure", "", "periodOfMeasureInSeconds", "<init>", "(J)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeProximityConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29101a;

    public DiscreetModeProximityConfiguration() {
        this(0L, 1, null);
    }

    public final int getPeriodOfMeasure() {
        return (int) NumberExtensionsKt.toMicroSeconds(this.f29101a);
    }

    public DiscreetModeProximityConfiguration(long j10) {
        this.f29101a = j10;
    }

    public /* synthetic */ DiscreetModeProximityConfiguration(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1L : j10);
    }
}
