package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import f1.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lf1/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class RotaryInputElement extends ModifierNodeElement<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> f16511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> f16512c;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(@Nullable Function1<? super RotaryScrollEvent, Boolean> function1, @Nullable Function1<? super RotaryScrollEvent, Boolean> function2) {
        this.f16511b = function1;
        this.f16512c = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        a aVar = new a();
        aVar.H0 = this.f16511b;
        aVar.I0 = this.f16512c;
        return aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return Intrinsics.areEqual(this.f16511b, rotaryInputElement.f16511b) && Intrinsics.areEqual(this.f16512c, rotaryInputElement.f16512c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        Function1<RotaryScrollEvent, Boolean> function1 = this.f16511b;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<RotaryScrollEvent, Boolean> function2 = this.f16512c;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        Function1<RotaryScrollEvent, Boolean> function1 = this.f16511b;
        if (function1 != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onRotaryScrollEvent", function1);
        }
        Function1<RotaryScrollEvent, Boolean> function2 = this.f16512c;
        if (function2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onPreRotaryScrollEvent", function2);
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryInputElement(onRotaryScrollEvent=");
        sb2.append(this.f16511b);
        sb2.append(", onPreRotaryScrollEvent=");
        return ci.a.c(sb2, this.f16512c, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        a node2 = (a) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f16511b;
        node2.I0 = this.f16512c;
    }
}
