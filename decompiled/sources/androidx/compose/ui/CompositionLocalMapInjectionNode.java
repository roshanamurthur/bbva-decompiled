package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "", "onAttach", "Landroidx/compose/runtime/CompositionLocalMap;", "value", "H0", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "map", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CompositionLocalMapInjectionNode extends Modifier.Node {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(@NotNull CompositionLocalMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    @NotNull
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }

    public final void setMap(@NotNull CompositionLocalMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.map = value;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(value);
    }
}
