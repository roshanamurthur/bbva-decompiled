package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\n\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\n\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u001a$\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\r8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionServiceKey;", "key", "getCompositionService", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Composition", "Landroidx/compose/runtime/ReusableComposition;", "ReusableComposition", "Landroidx/compose/runtime/ControlledComposition;", "ControlledComposition", "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "Landroidx/compose/runtime/CompositionImpl;", "b", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "CompositionImplServiceKey", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class CompositionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f14521a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CompositionKt$CompositionImplServiceKey$1 f14522b = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @TestOnly
    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @NotNull
    public static final ReusableComposition ReusableComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final void access$swap(List list, int i10, int i11) {
        Object obj = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, obj);
    }

    @NotNull
    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return f14522b;
    }

    @Nullable
    public static final <T> T getCompositionService(@NotNull Composition composition, @NotNull CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @ExperimentalComposeApi
    @NotNull
    public static final CoroutineContext getRecomposeCoroutineContext(@NotNull ControlledComposition controlledComposition) {
        CoroutineContext recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    @ExperimentalComposeApi
    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull CoroutineContext coroutineContext) {
        return new CompositionImpl(compositionContext, applier, coroutineContext);
    }

    @TestOnly
    @ExperimentalComposeApi
    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull CoroutineContext coroutineContext) {
        return new CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final void access$swap(MutableIntList mutableIntList, int i10, int i11) {
        int i12 = mutableIntList.get(i10);
        mutableIntList.set(i10, mutableIntList.get(i11));
        mutableIntList.set(i11, i12);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }
}
