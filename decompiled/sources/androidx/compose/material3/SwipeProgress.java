package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/SwipeProgress;", ExifInterface.GPS_DIRECTION_TRUE, "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/Object;", "getFrom", "()Ljava/lang/Object;", "from", "b", "getTo", TypedValues.TransitionType.S_TO, "", "c", "F", "getFraction", "()F", "fraction", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SwipeProgress<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final T from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final T to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float fraction;

    public SwipeProgress(T t10, T t11, float f6) {
        this.from = t10;
        this.to = t11;
        this.fraction = f6;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) other;
        return Intrinsics.areEqual(this.from, swipeProgress.from) && Intrinsics.areEqual(this.to, swipeProgress.to) && this.fraction == swipeProgress.fraction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.to;
    }

    public int hashCode() {
        T t10 = this.from;
        int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        T t11 = this.to;
        return Float.floatToIntBits(this.fraction) + ((iHashCode + (t11 != null ? t11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SwipeProgress(from=");
        sb2.append(this.from);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", fraction=");
        return androidx.camera.camera2.internal.compat.u.i(sb2, this.fraction, RootService.CLOSE_BRACKET);
    }
}
