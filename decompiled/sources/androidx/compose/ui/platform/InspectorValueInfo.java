package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableValue;", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "info", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<InspectorInfo, Unit> f17241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InspectorInfo f17242b;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectorValueInfo(@NotNull Function1<? super InspectorInfo, Unit> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f17241a = info;
    }

    public final InspectorInfo c() {
        InspectorInfo inspectorInfo = this.f17242b;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.f17241a.invoke(inspectorInfo);
        }
        this.f17242b = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public Sequence<ValueElement> getInspectableElements() {
        return c().getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public String getNameFallback() {
        return c().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public Object getValueOverride() {
        return c().getValue();
    }
}
