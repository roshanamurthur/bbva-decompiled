package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/time/TimedValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "Lkotlin/time/Duration;", "component2-UwyO8pc", "()J", "component2", "value", TypedValues.TransitionType.S_DURATION, "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "b", "J", "getDuration-UwyO8pc", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalTime.class})
public final /* data */ class TimedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long duration;

    /* JADX WARN: Multi-variable type inference failed */
    public TimedValue(Object obj, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = obj;
        this.duration = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m5938copyRFiDyg4$default(TimedValue timedValue, Object obj, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i10 & 2) != 0) {
            j10 = timedValue.duration;
        }
        return timedValue.m5940copyRFiDyg4(obj, j10);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m5940copyRFiDyg4(T value, long duration) {
        return new TimedValue<>(value, duration, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m5816equalsimpl0(this.duration, timedValue.duration);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m5941getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t10 = this.value;
        return Duration.m5836hashCodeimpl(this.duration) + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m5855toStringimpl(this.duration)) + RootService.CLOSE_BRACKET;
    }
}
