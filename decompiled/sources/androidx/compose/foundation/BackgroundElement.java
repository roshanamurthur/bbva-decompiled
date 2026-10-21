package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/b;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class BackgroundElement extends ModifierNodeElement<t.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Brush f3284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Shape f3286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f3287f;

    public BackgroundElement() {
        throw null;
    }

    public BackgroundElement(long j10, Brush brush, float f6, Shape shape, Function1 inspectorInfo, int i10) {
        j10 = (i10 & 1) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : j10;
        brush = (i10 & 2) != 0 ? null : brush;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f3283b = j10;
        this.f3284c = brush;
        this.f3285d = f6;
        this.f3286e = shape;
        this.f3287f = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Shape shape = this.f3286e;
        Intrinsics.checkNotNullParameter(shape, "shape");
        t.b bVar = new t.b();
        bVar.H0 = this.f3283b;
        bVar.I0 = this.f3284c;
        bVar.J0 = this.f3285d;
        bVar.K0 = shape;
        return bVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m2509equalsimpl0(this.f3283b, backgroundElement.f3283b) && Intrinsics.areEqual(this.f3284c, backgroundElement.f3284c) && this.f3285d == backgroundElement.f3285d && Intrinsics.areEqual(this.f3286e, backgroundElement.f3286e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM2515hashCodeimpl = Color.m2515hashCodeimpl(this.f3283b) * 31;
        Brush brush = this.f3284c;
        return this.f3286e.hashCode() + z1.a(this.f3285d, (iM2515hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f3287f.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        t.b node2 = (t.b) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f3283b;
        node2.I0 = this.f3284c;
        node2.J0 = this.f3285d;
        Shape shape = this.f3286e;
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        node2.K0 = shape;
    }
}
