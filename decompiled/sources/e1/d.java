package e1;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,242:1\n81#2:243\n107#2,2:244\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconModifierLocal\n*L\n150#1:243\n150#1:244,2\n*E\n"})
public final class d implements PointerIcon, ModifierLocalProvider<d>, ModifierLocalConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public PointerIcon f68260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f68261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Function1<? super PointerIcon, Unit> f68262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f68263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f68265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ProvidableModifierLocal<d> f68266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final d f68267h;

    /* JADX INFO: compiled from: PointerIcon.kt */
    public static final class a extends Lambda implements Function1<PointerIcon, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f68268p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(PointerIcon pointerIcon) {
            return Unit.INSTANCE;
        }
    }

    public d(@NotNull PointerIcon icon, boolean z10, @NotNull androidx.compose.ui.input.pointer.b onSetIcon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        this.f68260a = icon;
        this.f68261b = z10;
        this.f68262c = onSetIcon;
        this.f68263d = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f68266g = PointerIconKt.f16392a;
        this.f68267h = this;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d c() {
        return (d) this.f68263d.getValue();
    }

    public final boolean d() {
        if (this.f68261b) {
            return true;
        }
        d dVarC = c();
        return dVarC != null && dVarC.d();
    }

    public final void e() {
        this.f68264e = true;
        d dVarC = c();
        if (dVarC != null) {
            dVarC.e();
        }
    }

    public final void f() {
        this.f68264e = false;
        if (this.f68265f) {
            this.f68262c.invoke(this.f68260a);
            return;
        }
        if (c() == null) {
            this.f68262c.invoke(null);
            return;
        }
        d dVarC = c();
        if (dVarC != null) {
            dVarC.f();
        }
    }

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
    public final ProvidableModifierLocal<d> getKey() {
        return this.f68266g;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final d getValue() {
        return this.f68267h;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        d dVarC = c();
        this.f68263d.setValue((d) scope.getCurrent(PointerIconKt.f16392a));
        if (dVarC == null || c() != null) {
            return;
        }
        if (this.f68265f) {
            dVarC.f();
        }
        this.f68265f = false;
        this.f68262c = a.f68268p0;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
