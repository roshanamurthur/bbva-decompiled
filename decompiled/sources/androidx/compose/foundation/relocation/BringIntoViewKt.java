package androidx.compose.foundation.relocation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BringIntoView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBringIntoViewParent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalBringIntoViewParent", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class BringIntoViewKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<BringIntoViewParent> f5575a = ModifierLocalKt.modifierLocalOf(a.f5576p0);

    /* JADX INFO: compiled from: BringIntoView.kt */
    public static final class a extends Lambda implements Function0<BringIntoViewParent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5576p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ BringIntoViewParent invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableModifierLocal<BringIntoViewParent> getModifierLocalBringIntoViewParent() {
        return f5575a;
    }
}
