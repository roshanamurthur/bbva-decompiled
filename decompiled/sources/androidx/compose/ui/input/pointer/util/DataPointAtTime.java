package androidx.compose.ui.input.pointer.util;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "", "component1", "", "component2", "time", "dataPoint", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "J", "getTime", "()J", "setTime", "(J)V", "b", "F", "getDataPoint", "()F", "setDataPoint", "(F)V", "<init>", "(JF)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DataPointAtTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long time;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float dataPoint;

    public DataPointAtTime(long j10, float f6) {
        this.time = j10;
        this.dataPoint = f6;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j10, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dataPointAtTime.time;
        }
        if ((i10 & 2) != 0) {
            f6 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j10, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDataPoint() {
        return this.dataPoint;
    }

    @NotNull
    public final DataPointAtTime copy(long time, float dataPoint) {
        return new DataPointAtTime(time, dataPoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) other;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        long j10 = this.time;
        return Float.floatToIntBits(this.dataPoint) + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final void setDataPoint(float f6) {
        this.dataPoint = f6;
    }

    public final void setTime(long j10) {
        this.time = j10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.time);
        sb2.append(", dataPoint=");
        return u.i(sb2, this.dataPoint, RootService.CLOSE_BRACKET);
    }
}
