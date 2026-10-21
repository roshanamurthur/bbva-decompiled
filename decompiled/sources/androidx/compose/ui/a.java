package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public class a extends InspectorValueInfo implements Modifier.Element {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function3<Modifier, Composer, Integer, Modifier> f15422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f15422c = factory;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return f.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return e.a(this, modifier);
    }
}
