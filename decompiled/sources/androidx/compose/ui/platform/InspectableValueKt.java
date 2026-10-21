package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a8\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aD\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a-\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0001\"(\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "definitions", "debugInspectorInfo", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "wrapped", "inspectableWrapper", "a", "Lkotlin/jvm/functions/Function1;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "NoInspectorInfo", "", "b", "Z", "isDebugInspectorInfoEnabled", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class InspectableValueKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17232a = a.f17234p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17233b;

    /* JADX INFO: compiled from: InspectableValue.kt */
    public static final class a extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17234p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Function1<InspectorInfo, Unit> debugInspectorInfo(@NotNull final Function1<? super InspectorInfo, Unit> definitions) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        return isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                definitions.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @NotNull
    public static final Function1<InspectorInfo, Unit> getNoInspectorInfo() {
        return f17232a;
    }

    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function1<? super Modifier, ? extends Modifier> factory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return inspectableWrapper(modifier, inspectorInfo, factory.invoke(Modifier.INSTANCE));
    }

    @PublishedApi
    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Modifier wrapped) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        InspectableModifier inspectableModifier = new InspectableModifier(inspectorInfo);
        return modifier.then(inspectableModifier).then(wrapped).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return f17233b;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        f17233b = z10;
    }
}
