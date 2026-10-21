package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\"0\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onPositioned", "onFocusedBoundsChanged", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalFocusedBoundsObserver", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class FocusedBoundsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<Function1<LayoutCoordinates, Unit>> f3373a = ModifierLocalKt.modifierLocalOf(a.f3374p0);

    /* JADX INFO: compiled from: FocusedBounds.kt */
    public static final class a extends Lambda implements Function0<Function1<? super LayoutCoordinates, ? extends Unit>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3374p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Function1<? super LayoutCoordinates, ? extends Unit> invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableModifierLocal<Function1<LayoutCoordinates, Unit>> getModifierLocalFocusedBoundsObserver() {
        return f3373a;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier onFocusedBoundsChanged(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Unit> onPositioned) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        return modifier.then(new FocusedBoundsObserverElement(onPositioned));
    }
}
