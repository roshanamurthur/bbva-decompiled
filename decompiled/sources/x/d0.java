package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n81#2:306\n107#2,2:307\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n215#1:306\n215#1:307,2\n*E\n"})
public abstract class d0 extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f94315c;

    public d0(Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.f94315c = SnapshotStateKt.mutableStateOf$default(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    @NotNull
    public abstract WindowInsets d(@NotNull WindowInsets windowInsets);

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public final ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final WindowInsets getValue() {
        return (WindowInsets) this.f94315c.getValue();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f94315c.setValue(d((WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
