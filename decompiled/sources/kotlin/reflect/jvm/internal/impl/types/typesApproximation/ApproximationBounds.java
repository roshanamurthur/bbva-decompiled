package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f82057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f82058b;

    public ApproximationBounds(T t10, T t11) {
        this.f82057a = t10;
        this.f82058b = t11;
    }

    public final T component1() {
        return this.f82057a;
    }

    public final T component2() {
        return this.f82058b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.areEqual(this.f82057a, approximationBounds.f82057a) && Intrinsics.areEqual(this.f82058b, approximationBounds.f82058b);
    }

    public final T getLower() {
        return this.f82057a;
    }

    public final T getUpper() {
        return this.f82058b;
    }

    public int hashCode() {
        T t10 = this.f82057a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f82058b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApproximationBounds(lower=");
        sb2.append(this.f82057a);
        sb2.append(", upper=");
        return v.d(sb2, this.f82058b, RootService.CLOSE_BRACKET);
    }
}
