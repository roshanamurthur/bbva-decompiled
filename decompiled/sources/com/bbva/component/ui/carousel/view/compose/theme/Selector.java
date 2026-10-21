package com.bbva.component.ui.carousel.view.compose.theme;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/ui/carousel/view/compose/theme/Selector;", "", "Landroidx/compose/ui/graphics/Color;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "default", "pressed", "copy--OWjLjI", "(JJ)Lcom/bbva/component/ui/carousel/view/compose/theme/Selector;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "J", "getDefault-0d7_KjU", "b", "getPressed-0d7_KjU", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Selector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long pressed;

    public Selector(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.default = j10;
        this.pressed = j11;
    }

    /* JADX INFO: renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ Selector m4875copyOWjLjI$default(Selector selector, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = selector.default;
        }
        if ((i10 & 2) != 0) {
            j11 = selector.pressed;
        }
        return selector.m4878copyOWjLjI(j10, j11);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getPressed() {
        return this.pressed;
    }

    @NotNull
    /* JADX INFO: renamed from: copy--OWjLjI, reason: not valid java name */
    public final Selector m4878copyOWjLjI(long j10, long pressed) {
        return new Selector(j10, pressed, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selector)) {
            return false;
        }
        Selector selector = (Selector) other;
        return Color.m2509equalsimpl0(this.default, selector.default) && Color.m2509equalsimpl0(this.pressed, selector.pressed);
    }

    /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name */
    public final long m4879getDefault0d7_KjU() {
        return this.default;
    }

    /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name */
    public final long m4880getPressed0d7_KjU() {
        return this.pressed;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.pressed) + (Color.m2515hashCodeimpl(this.default) * 31);
    }

    @NotNull
    public String toString() {
        return u.g("Selector(default=", Color.m2516toStringimpl(this.default), ", pressed=", Color.m2516toStringimpl(this.pressed), ")");
    }

    public /* synthetic */ Selector(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : j10, (i10 & 2) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : j11, null);
    }
}
