package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,143:1\n77#2:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n66#1:144\n*E\n"})
public final class SaveableStateHolderKt {

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    public static final class a extends Lambda implements Function0<SaveableStateHolderImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15225p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final SaveableStateHolderImpl invoke() {
            return new SaveableStateHolderImpl(0);
        }
    }

    @Composable
    @NotNull
    public static final SaveableStateHolder rememberSaveableStateHolder(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        composer.startReplaceGroup(-796080049);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) SaveableStateHolderImpl.f15204d.getSaver(), (String) null, (Function0) a.f15225p0, composer, 3072, 4);
        saveableStateHolderImpl.f15208c = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }
}
