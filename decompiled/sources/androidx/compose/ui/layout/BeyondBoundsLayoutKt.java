package androidx.compose.ui.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBeyondBoundsLayout", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalBeyondBoundsLayout", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class BeyondBoundsLayoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<BeyondBoundsLayout> f16528a = ModifierLocalKt.modifierLocalOf(a.f16529p0);

    /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
    public static final class a extends Lambda implements Function0<BeyondBoundsLayout> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16529p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ BeyondBoundsLayout invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableModifierLocal<BeyondBoundsLayout> getModifierLocalBeyondBoundsLayout() {
        return f16528a;
    }
}
