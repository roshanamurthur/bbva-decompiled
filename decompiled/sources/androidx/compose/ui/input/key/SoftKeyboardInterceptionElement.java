package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c1.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SoftwareKeyboardInterceptionModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lc1/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class SoftKeyboardInterceptionElement extends ModifierNodeElement<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<KeyEvent, Boolean> f16317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<KeyEvent, Boolean> f16318c;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@Nullable Function1<? super KeyEvent, Boolean> function1, @Nullable Function1<? super KeyEvent, Boolean> function2) {
        this.f16317b = function1;
        this.f16318c = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        a aVar = new a();
        aVar.H0 = this.f16317b;
        aVar.I0 = this.f16318c;
        return aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return Intrinsics.areEqual(this.f16317b, softKeyboardInterceptionElement.f16317b) && Intrinsics.areEqual(this.f16318c, softKeyboardInterceptionElement.f16318c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        Function1<KeyEvent, Boolean> function1 = this.f16317b;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<KeyEvent, Boolean> function2 = this.f16318c;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        Function1<KeyEvent, Boolean> function1 = this.f16317b;
        if (function1 != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onKeyToSoftKeyboardInterceptedEvent", function1);
        }
        Function1<KeyEvent, Boolean> function2 = this.f16318c;
        if (function2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onPreKeyToSoftKeyboardInterceptedEvent", function2);
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SoftKeyboardInterceptionElement(onKeyEvent=");
        sb2.append(this.f16317b);
        sb2.append(", onPreKeyEvent=");
        return ci.a.c(sb2, this.f16318c, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        a node2 = (a) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f16317b;
        node2.I0 = this.f16318c;
    }
}
