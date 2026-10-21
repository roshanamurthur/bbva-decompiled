package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ActualKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElement;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModifierNodeElement.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH&J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦\u0002R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "N", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "create", "()Landroidx/compose/ui/Modifier$Node;", "node", "", "update", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InspectorInfo f16872a;

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    public final InspectorInfo c() {
        InspectorInfo inspectorInfo = this.f16872a;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(inspectorInfo2);
        this.f16872a = inspectorInfo2;
        return inspectorInfo2;
    }

    @NotNull
    public abstract N create();

    public abstract boolean equals(@Nullable Object other);

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public final Sequence<ValueElement> getInspectableElements() {
        return c().getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public final String getNameFallback() {
        return c().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public final Object getValueOverride() {
        return c().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        ActualKt.tryPopulateReflectively(inspectorInfo, this);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }

    public abstract void update(@NotNull N node);
}
