package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.w1;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/w1;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class WrapContentElement extends ModifierNodeElement<w1> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Companion f4474g = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Direction f4475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function2<IntSize, LayoutDirection, IntOffset> f4477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f4478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f4479f;

    /* JADX INFO: compiled from: Size.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$Companion;", "", "()V", "height", "Landroidx/compose/foundation/layout/WrapContentElement;", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "size", "Landroidx/compose/ui/Alignment;", "width", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Size.kt */
        public static final class a extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment.Vertical f4480p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Alignment.Vertical vertical) {
                super(2);
                this.f4480p0 = vertical;
            }

            @Override // kotlin.jvm.functions.Function2
            public final IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                long f18319a = intSize.getF18319a();
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(0, this.f4480p0.align(0, IntSize.m4548getHeightimpl(f18319a))));
            }
        }

        /* JADX INFO: compiled from: Size.kt */
        public static final class b extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment f4481p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Alignment alignment) {
                super(2);
                this.f4481p0 = alignment;
            }

            @Override // kotlin.jvm.functions.Function2
            public final IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                long f18319a = intSize.getF18319a();
                LayoutDirection layoutDirection2 = layoutDirection;
                Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
                return IntOffset.m4498boximpl(this.f4481p0.mo2184alignKFBX0sM(IntSize.INSTANCE.m4554getZeroYbymL2g(), f18319a, layoutDirection2));
            }
        }

        /* JADX INFO: compiled from: Size.kt */
        public static final class c extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment.Horizontal f4482p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Alignment.Horizontal horizontal) {
                super(2);
                this.f4482p0 = horizontal;
            }

            @Override // kotlin.jvm.functions.Function2
            public final IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                long f18319a = intSize.getF18319a();
                LayoutDirection layoutDirection2 = layoutDirection;
                Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
                return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(this.f4482p0.align(0, IntSize.m4549getWidthimpl(f18319a), layoutDirection2), 0));
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        @NotNull
        public final WrapContentElement height(@NotNull Alignment.Vertical align, boolean unbounded) {
            Intrinsics.checkNotNullParameter(align, "align");
            return new WrapContentElement(Direction.Vertical, unbounded, new a(align), align, "wrapContentHeight");
        }

        @Stable
        @NotNull
        public final WrapContentElement size(@NotNull Alignment align, boolean unbounded) {
            Intrinsics.checkNotNullParameter(align, "align");
            return new WrapContentElement(Direction.Both, unbounded, new b(align), align, "wrapContentSize");
        }

        @Stable
        @NotNull
        public final WrapContentElement width(@NotNull Alignment.Horizontal align, boolean unbounded) {
            Intrinsics.checkNotNullParameter(align, "align");
            return new WrapContentElement(Direction.Horizontal, unbounded, new c(align), align, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@NotNull Direction direction, boolean z10, @NotNull Function2<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback, @NotNull Object align, @NotNull String inspectorName) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(inspectorName, "inspectorName");
        this.f4475b = direction;
        this.f4476c = z10;
        this.f4477d = alignmentCallback;
        this.f4478e = align;
        this.f4479f = inspectorName;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Direction direction = this.f4475b;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Function2<IntSize, LayoutDirection, IntOffset> alignmentCallback = this.f4477d;
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        w1 w1Var = new w1();
        w1Var.H0 = direction;
        w1Var.I0 = this.f4476c;
        w1Var.J0 = alignmentCallback;
        return w1Var;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(WrapContentElement.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.layout.WrapContentElement");
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f4475b == wrapContentElement.f4475b && this.f4476c == wrapContentElement.f4476c && Intrinsics.areEqual(this.f4478e, wrapContentElement.f4478e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f4478e.hashCode() + (((this.f4475b.hashCode() * 31) + (this.f4476c ? 1231 : 1237)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName(this.f4479f);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("align", this.f4478e);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("unbounded", Boolean.valueOf(this.f4476c));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        w1 node2 = (w1) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Direction direction = this.f4475b;
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        node2.H0 = direction;
        node2.I0 = this.f4476c;
        Function2<IntSize, LayoutDirection, IntOffset> function2 = this.f4477d;
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        node2.J0 = function2;
    }
}
