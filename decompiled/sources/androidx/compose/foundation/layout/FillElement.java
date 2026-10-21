package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.q;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/q;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class FillElement extends ModifierNodeElement<q> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Companion f4242e = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Direction f4243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f4245d;

    /* JADX INFO: compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$Companion;", "", "()V", "height", "Landroidx/compose/foundation/layout/FillElement;", "fraction", "", "size", "width", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        @NotNull
        public final FillElement height(float fraction) {
            return new FillElement(Direction.Vertical, fraction, "fillMaxHeight");
        }

        @Stable
        @NotNull
        public final FillElement size(float fraction) {
            return new FillElement(Direction.Both, fraction, "fillMaxSize");
        }

        @Stable
        @NotNull
        public final FillElement width(float fraction) {
            return new FillElement(Direction.Horizontal, fraction, "fillMaxWidth");
        }
    }

    public FillElement(@NotNull Direction direction, float f6, @NotNull String inspectorName) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(inspectorName, "inspectorName");
        this.f4243b = direction;
        this.f4244c = f6;
        this.f4245d = inspectorName;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Direction direction = this.f4243b;
        Intrinsics.checkNotNullParameter(direction, "direction");
        q qVar = new q();
        qVar.H0 = direction;
        qVar.I0 = this.f4244c;
        return qVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f4243b == fillElement.f4243b && this.f4244c == fillElement.f4244c;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Float.floatToIntBits(this.f4244c) + (this.f4243b.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName(this.f4245d);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("fraction", Float.valueOf(this.f4244c));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        q node2 = (q) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Direction direction = this.f4243b;
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        node2.H0 = direction;
        node2.I0 = this.f4244c;
    }
}
