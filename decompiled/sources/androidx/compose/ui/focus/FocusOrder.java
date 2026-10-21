package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "Use FocusProperties instead")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\t\b\u0016¢\u0006\u0004\b\u001f\u0010!R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "Landroidx/compose/ui/focus/FocusRequester;", "next", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", Parameters.DIRECTION.LEFT, "getLeft", "setLeft", Parameters.DIRECTION.RIGHT, "getRight", "setRight", EventDataKeys.Lifecycle.LIFECYCLE_START, "getStart", "setStart", "end", "getEnd", "setEnd", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "<init>", "(Landroidx/compose/ui/focus/FocusProperties;)V", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusOrder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FocusProperties f15483a;

    public FocusOrder(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f15483a = focusProperties;
    }

    @NotNull
    public final FocusRequester getDown() {
        return this.f15483a.getDown();
    }

    @NotNull
    public final FocusRequester getEnd() {
        return this.f15483a.getEnd();
    }

    @NotNull
    public final FocusRequester getLeft() {
        return this.f15483a.getLeft();
    }

    @NotNull
    public final FocusRequester getNext() {
        return this.f15483a.getNext();
    }

    @NotNull
    public final FocusRequester getPrevious() {
        return this.f15483a.getPrevious();
    }

    @NotNull
    public final FocusRequester getRight() {
        return this.f15483a.getRight();
    }

    @NotNull
    public final FocusRequester getStart() {
        return this.f15483a.getStart();
    }

    @NotNull
    public final FocusRequester getUp() {
        return this.f15483a.getUp();
    }

    public final void setDown(@NotNull FocusRequester down) {
        Intrinsics.checkNotNullParameter(down, "down");
        this.f15483a.setDown(down);
    }

    public final void setEnd(@NotNull FocusRequester end) {
        Intrinsics.checkNotNullParameter(end, "end");
        this.f15483a.setEnd(end);
    }

    public final void setLeft(@NotNull FocusRequester left) {
        Intrinsics.checkNotNullParameter(left, "left");
        this.f15483a.setLeft(left);
    }

    public final void setNext(@NotNull FocusRequester next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.f15483a.setNext(next);
    }

    public final void setPrevious(@NotNull FocusRequester previous) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        this.f15483a.setPrevious(previous);
    }

    public final void setRight(@NotNull FocusRequester right) {
        Intrinsics.checkNotNullParameter(right, "right");
        this.f15483a.setRight(right);
    }

    public final void setStart(@NotNull FocusRequester start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.f15483a.setStart(start);
    }

    public final void setUp(@NotNull FocusRequester up) {
        Intrinsics.checkNotNullParameter(up, "up");
        this.f15483a.setUp(up);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
