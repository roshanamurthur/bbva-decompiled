package androidx.compose.ui.semantics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016J\u001a\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\fHÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\fHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "component1", LogKeysKt.PROPERTIES, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.properties = properties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = clearAndSetSemanticsElement.properties;
        }
        return clearAndSetSemanticsElement.copy(function1);
    }

    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> component1() {
        return this.properties;
    }

    @NotNull
    public final ClearAndSetSemanticsElement copy(@NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new ClearAndSetSemanticsElement(properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearAndSetSemanticsElement) && Intrinsics.areEqual(this.properties, ((ClearAndSetSemanticsElement) other).properties);
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final /* synthetic */ int getId() {
        return a.a(this);
    }

    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @NotNull
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("clearAndSetSemantics");
        SemanticsModifierKt.access$addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @NotNull
    public String toString() {
        return ci.a.c(new StringBuilder("ClearAndSetSemanticsElement(properties="), this.properties, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull CoreSemanticsModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setProperties(this.properties);
    }
}
