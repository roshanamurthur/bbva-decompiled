package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010$J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\bH&R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u001a\u0010%\u001a\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/layout/LayoutCoordinates;", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "", "b", "Z", "isAttached$ui_release", "()Z", "setAttached$ui_release", "(Z)V", "isAttached", "getSize-YbymL2g", "()J", "size", "getInterceptOutOfBoundsChildEvents", "interceptOutOfBoundsChildEvents", "getShareWithSiblings", "getShareWithSiblings$annotations", "()V", "shareWithSiblings", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class PointerInputFilter {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutCoordinates layoutCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: getLayoutCoordinates$ui_release, reason: from getter */
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3496getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo3581getSizeYbymL2g() : IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: isAttached$ui_release, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo3497onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds);

    public final void setAttached$ui_release(boolean z10) {
        this.isAttached = z10;
    }

    public final void setLayoutCoordinates$ui_release(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
