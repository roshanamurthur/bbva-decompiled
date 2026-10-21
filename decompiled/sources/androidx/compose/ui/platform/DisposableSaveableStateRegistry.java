package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n0\tH\u0096\u0001J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0001J\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "value", "", "canBeSaved", "", "key", "consumeRestored", "", "", "performSave", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "", "dispose", "saveableStateRegistry", "onDispose", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f17212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f17213b;

    public DisposableSaveableStateRegistry(@NotNull SaveableStateRegistry saveableStateRegistry, @NotNull Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.f17212a = onDispose;
        this.f17213b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f17213b.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public Object consumeRestored(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f17213b.consumeRestored(key);
    }

    public final void dispose() {
        this.f17212a.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public Map<String, List<Object>> performSave() {
        return this.f17213b.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public SaveableStateRegistry.Entry registerProvider(@NotNull String key, @NotNull Function0<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f17213b.registerProvider(key, valueProvider);
    }
}
