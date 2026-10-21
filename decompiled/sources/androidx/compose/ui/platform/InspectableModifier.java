package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B \u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\b\u001a\u00060\u0003R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableModifier$End;", "c", "Landroidx/compose/ui/platform/InspectableModifier$End;", "getEnd", "()Landroidx/compose/ui/platform/InspectableModifier$End;", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "End", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final End end;

    /* JADX INFO: compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier$End;", "Landroidx/compose/ui/Modifier$Element;", "(Landroidx/compose/ui/platform/InspectableModifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class End implements Modifier.Element {
        public End(InspectableModifier inspectableModifier) {
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean all(Function1 function1) {
            return u0.f.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean any(Function1 function1) {
            return u0.f.b(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return u0.f.c(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return u0.f.d(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier
        public final /* synthetic */ Modifier then(Modifier modifier) {
            return u0.e.a(this, modifier);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectableModifier(@NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.end = new End(this);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @NotNull
    public final End getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
