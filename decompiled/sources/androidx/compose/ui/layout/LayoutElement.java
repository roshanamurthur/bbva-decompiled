package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<MeasureScope, Measurable, Constraints, MeasureResult> f16564b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        this.f16564b = measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new LayoutModifierImpl(this.f16564b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.areEqual(this.f16564b, ((LayoutElement) obj).f16564b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f16564b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", PluginUtils.IDENTIFIER_LAYOUT).set("measure", this.f16564b);
    }

    @NotNull
    public final String toString() {
        return "LayoutElement(measure=" + this.f16564b + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LayoutModifierImpl node2 = (LayoutModifierImpl) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.setMeasureBlock(this.f16564b);
    }
}
