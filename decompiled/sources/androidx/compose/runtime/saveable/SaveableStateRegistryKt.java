package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "SaveableStateRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
public final class SaveableStateRegistryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<SaveableStateRegistry> f15232a = CompositionLocalKt.staticCompositionLocalOf(a.f15233p0);

    /* JADX INFO: compiled from: SaveableStateRegistry.kt */
    public static final class a extends Lambda implements Function0<SaveableStateRegistry> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15233p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ SaveableStateRegistry invoke() {
            return null;
        }
    }

    @NotNull
    public static final SaveableStateRegistry SaveableStateRegistry(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        return new SaveableStateRegistryImpl(map, function1);
    }

    public static final boolean access$fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return f15232a;
    }
}
