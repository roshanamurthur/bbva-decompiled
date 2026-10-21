package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.h;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx/h;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
final class AspectRatioElement extends ModifierNodeElement<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f4193d;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f6, boolean z10, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f4191b = f6;
        this.f4192c = z10;
        this.f4193d = inspectorInfo;
        if (f6 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f6 + " must be > 0").toString());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        h hVar = new h();
        hVar.H0 = this.f4191b;
        hVar.I0 = this.f4192c;
        return hVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f4191b == aspectRatioElement.f4191b) {
            if (this.f4192c == ((AspectRatioElement) obj).f4192c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (Float.floatToIntBits(this.f4191b) * 31) + (this.f4192c ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f4193d.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        h node2 = (h) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4191b;
        node2.I0 = this.f4192c;
    }
}
