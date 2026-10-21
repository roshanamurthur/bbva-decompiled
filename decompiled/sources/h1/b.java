package h1;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: ModifierLocalConsumer.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class b extends InspectorValueInfo implements ModifierLocalConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<ModifierLocalReadScope, Unit> f69253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super ModifierLocalReadScope, Unit> consumer, @NotNull Function1<? super InspectorInfo, Unit> debugInspectorInfo) {
        super(debugInspectorInfo);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(debugInspectorInfo, "debugInspectorInfo");
        this.f69253c = consumer;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return f.b(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof b) && Intrinsics.areEqual(((b) obj).f69253c, this.f69253c);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return f.d(this, obj, function2);
    }

    public final int hashCode() {
        return this.f69253c.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f69253c.invoke(scope);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return e.a(this, modifier);
    }
}
