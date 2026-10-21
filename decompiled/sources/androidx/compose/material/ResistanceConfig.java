package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "", "overflow", "computeResistance", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "F", "getBasis", "()F", "basis", "b", "getFactorAtMin", "factorAtMin", "c", "getFactorAtMax", "factorAtMax", "<init>", "(FFF)V", "material_release"}, k = 1, mv = {1, 8, 0})
public final class ResistanceConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float basis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float factorAtMin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float factorAtMax;

    public ResistanceConfig(float f6, float f10, float f11) {
        this.basis = f6;
        this.factorAtMin = f10;
        this.factorAtMax = f11;
    }

    public final float computeResistance(float overflow) {
        float f6 = overflow < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f6 == 0.0f) {
            return 0.0f;
        }
        float f10 = this.basis;
        return (f10 / f6) * ((float) Math.sin((kotlin.ranges.c.coerceIn(overflow / f10, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) other;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.factorAtMax) + com.mypinpad.tsdk.isolation.z1.a(this.factorAtMin, Float.floatToIntBits(this.basis) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResistanceConfig(basis=");
        sb2.append(this.basis);
        sb2.append(", factorAtMin=");
        sb2.append(this.factorAtMin);
        sb2.append(", factorAtMax=");
        return androidx.camera.camera2.internal.compat.u.i(sb2, this.factorAtMax, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ResistanceConfig(float f6, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, (i10 & 2) != 0 ? 10.0f : f10, (i10 & 4) != 0 ? 10.0f : f11);
    }
}
