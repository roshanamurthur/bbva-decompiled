package u;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ModifierLocalProvider<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f93647a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<Boolean> f93648b = ScrollableKt.getModifierLocalScrollableContainer();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f93649c = true;

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

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public final ProvidableModifierLocal<Boolean> getKey() {
        return f93648b;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Boolean getValue() {
        return Boolean.valueOf(f93649c);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
