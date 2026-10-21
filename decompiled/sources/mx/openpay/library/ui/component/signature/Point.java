package mx.openpay.library.ui.component.signature;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lmx/openpay/library/ui/component/signature/Point;", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "velocityFrom", "a", "F", "getX", "()F", "x", "b", "getY", "y", "", "c", "J", "getTime", "()J", "time", "<init>", "(FFJ)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class Point {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long time;

    public Point(float f6, float f10, long j10) {
        this.x = f6;
        this.y = f10;
        this.time = j10;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float velocityFrom(@NotNull Point start) {
        Intrinsics.checkNotNullParameter(start, "start");
        return ((float) Math.sqrt(Math.pow(this.y - start.y, 2.0d) + Math.pow(this.x - start.x, 2.0d))) / (this.time - start.time);
    }
}
