package com.veridas.math.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Angle.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/veridas/math/geometry/Angle;", "", "", "toEuler", "a", "D", "getPhi", "()D", "phi", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class Angle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double phi;

    /* JADX INFO: compiled from: Angle.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/veridas/math/geometry/Angle$Companion;", "", "()V", "byEuler", "Lcom/veridas/math/geometry/Angle;", "phi", "", "byRadians", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Angle byEuler(double phi) {
            return new Angle(Math.toRadians(phi % 360.0d), null);
        }

        @NotNull
        public final Angle byRadians(double phi) {
            return new Angle(phi, null);
        }
    }

    public Angle(double d2, DefaultConstructorMarker defaultConstructorMarker) {
        this.phi = d2;
    }

    public final double getPhi() {
        return this.phi;
    }

    public final double toEuler() {
        return Math.toDegrees(this.phi);
    }
}
