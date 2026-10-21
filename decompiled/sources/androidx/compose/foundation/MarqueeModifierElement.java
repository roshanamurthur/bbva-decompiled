package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.d0;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MarqueeSpacing f3420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3421g;

    public MarqueeModifierElement(int i10, int i11, int i12, int i13, MarqueeSpacing spacing, float f6) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f3416b = i10;
        this.f3417c = i11;
        this.f3418d = i12;
        this.f3419e = i13;
        this.f3420f = spacing;
        this.f3421g = f6;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new MarqueeModifierNode(this.f3416b, this.f3417c, this.f3418d, this.f3419e, this.f3420f, this.f3421g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.f3416b == marqueeModifierElement.f3416b && MarqueeAnimationMode.m164equalsimpl0(this.f3417c, marqueeModifierElement.f3417c) && this.f3418d == marqueeModifierElement.f3418d && this.f3419e == marqueeModifierElement.f3419e && Intrinsics.areEqual(this.f3420f, marqueeModifierElement.f3420f) && Dp.m4394equalsimpl0(this.f3421g, marqueeModifierElement.f3421g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Dp.m4395hashCodeimpl(this.f3421g) + ((this.f3420f.hashCode() + ((((((MarqueeAnimationMode.m165hashCodeimpl(this.f3417c) + (this.f3416b * 31)) * 31) + this.f3418d) * 31) + this.f3419e) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "basicMarquee").set("iterations", Integer.valueOf(this.f3416b));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("animationMode", MarqueeAnimationMode.m162boximpl(this.f3417c));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("delayMillis", Integer.valueOf(this.f3418d));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("initialDelayMillis", Integer.valueOf(this.f3419e));
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("spacing", this.f3420f);
        inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("velocity", Dp.m4387boximpl(this.f3421g));
    }

    @NotNull
    public final String toString() {
        return "MarqueeModifierElement(iterations=" + this.f3416b + ", animationMode=" + ((Object) MarqueeAnimationMode.m166toStringimpl(this.f3417c)) + ", delayMillis=" + this.f3418d + ", initialDelayMillis=" + this.f3419e + ", spacing=" + this.f3420f + ", velocity=" + ((Object) Dp.m4400toStringimpl(this.f3421g)) + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        MarqueeModifierNode node2 = (MarqueeModifierNode) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        MarqueeSpacing spacing = this.f3420f;
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        Intrinsics.checkNotNullParameter(spacing, "<set-?>");
        node2.O0.setValue(spacing);
        node2.P0.setValue(MarqueeAnimationMode.m162boximpl(this.f3417c));
        int i10 = node2.H0;
        int i11 = this.f3416b;
        int i12 = this.f3418d;
        int i13 = this.f3419e;
        float f6 = this.f3421g;
        if (i10 == i11 && node2.I0 == i12 && node2.J0 == i13 && Dp.m4394equalsimpl0(node2.K0, f6)) {
            return;
        }
        node2.H0 = i11;
        node2.I0 = i12;
        node2.J0 = i13;
        node2.K0 = f6;
        if (node2.getIsAttached()) {
            BuildersKt__Builders_commonKt.launch$default(node2.getCoroutineScope(), null, null, new d0(node2, null), 3, null);
        }
    }
}
