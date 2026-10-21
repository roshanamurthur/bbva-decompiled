package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "create", "node", "", "update", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/runtime/CompositionLocalMap;", "b", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "map", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(@NotNull CompositionLocalMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        return (other instanceof CompositionLocalMapInjectionElement) && Intrinsics.areEqual(((CompositionLocalMapInjectionElement) other).map, this.map);
    }

    @NotNull
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull CompositionLocalMapInjectionNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setMap(this.map);
    }
}
