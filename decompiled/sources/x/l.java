package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class l extends InspectorValueInfo implements ModifierLocalConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<WindowInsets, Unit> f94362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public WindowInsets f94363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Function1<? super WindowInsets, Unit> block, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f94362c = block;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return Intrinsics.areEqual(((l) obj).f94362c, this.f94362c);
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    public final int hashCode() {
        return this.f94362c.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        WindowInsets windowInsets = (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (Intrinsics.areEqual(windowInsets, this.f94363d)) {
            return;
        }
        this.f94363d = windowInsets;
        this.f94362c.invoke(windowInsets);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
