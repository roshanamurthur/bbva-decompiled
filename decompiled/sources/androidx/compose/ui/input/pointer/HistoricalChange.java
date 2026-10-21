package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "", "toString", "", "a", "J", "getUptimeMillis", "()J", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "b", "getPosition-F1C5BW0", "position", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class HistoricalChange {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long uptimeMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long position;

    public HistoricalChange(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.uptimeMillis = j10;
        this.position = j11;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2283toStringimpl(this.position)) + RootService.CLOSE_BRACKET;
    }
}
