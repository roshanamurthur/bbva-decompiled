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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B(\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u001a\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000eHÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "create", "node", "", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "component2", "mergeDescendants", LogKeysKt.PROPERTIES, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "b", "Z", "getMergeDescendants", "()Z", "c", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean mergeDescendants;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z10, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.mergeDescendants = z10;
        this.properties = properties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i10 & 2) != 0) {
            function1 = appendedSemanticsElement.properties;
        }
        return appendedSemanticsElement.copy(z10, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> component2() {
        return this.properties;
    }

    @NotNull
    public final AppendedSemanticsElement copy(boolean mergeDescendants, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new AppendedSemanticsElement(mergeDescendants, properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) other;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && Intrinsics.areEqual(this.properties, appendedSemanticsElement.properties);
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final /* synthetic */ int getId() {
        return a.a(this);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @NotNull
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        boolean z10 = this.mergeDescendants;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.properties.hashCode() + (r1 * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "semantics").set("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        SemanticsModifierKt.access$addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppendedSemanticsElement(mergeDescendants=");
        sb2.append(this.mergeDescendants);
        sb2.append(", properties=");
        return ci.a.c(sb2, this.properties, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull CoreSemanticsModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setMergeDescendants(this.mergeDescendants);
        node.setProperties(this.properties);
    }
}
