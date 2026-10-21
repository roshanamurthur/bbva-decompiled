package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import bk.q;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import m0.e0;
import m0.i0;
import m0.j0;
import m0.k0;
import m0.l0;
import m0.m0;
import m0.n0;
import m0.o0;
import m0.p0;
import m0.u;
import m0.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"m0/i0"}, d2 = {}, k = 4, mv = {1, 8, 0})
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull StateFlow<? extends T> stateFlow, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        State<T> stateCollectAsState = collectAsState(stateFlow, stateFlow.getValue(), coroutineContext2, composer, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsState;
    }

    @NotNull
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = i0.f83259b;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy, @NotNull Function0<? extends T> function0) {
        SnapshotThreadLocal<IntRef> snapshotThreadLocal = i0.f83258a;
        return new DerivedSnapshotState(snapshotMutationPolicy, function0);
    }

    public static final <T> T getValue(@NotNull State<? extends T> state, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return state.getValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> MutableState<T> mutableStateOf(T t10, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return ActualAndroid_androidKt.createSnapshotMutableState(t10, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            snapshotMutationPolicy = structuralEqualityPolicy();
        }
        return mutableStateOf(obj, snapshotMutationPolicy);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        u uVar = u.f83324a;
        Intrinsics.checkNotNull(uVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return uVar;
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull DerivedStateObserver derivedStateObserver, @NotNull Function0<? extends R> function0) {
        SnapshotThreadLocal<IntRef> snapshotThreadLocal = i0.f83258a;
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = derivedStateObservers();
        try {
            mutableVectorDerivedStateObservers.add(derivedStateObserver);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
            InlineMarker.finallyEnd(1);
        }
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean zChangedInstance = composer.changedInstance(function2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new j0(function2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        e0 e0Var = e0.f83247a;
        Intrinsics.checkNotNull(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return e0Var;
    }

    @Composable
    @NotNull
    public static final <T> State<T> rememberUpdatedState(T t10, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        mutableState.setValue(t10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> void setValue(@NotNull MutableState<T> mutableState, @Nullable Object obj, @NotNull KProperty<?> kProperty, T t10) {
        mutableState.setValue(t10);
    }

    @NotNull
    public static final <T> Flow<T> snapshotFlow(@NotNull Function0<? extends T> function0) {
        return FlowKt.flow(new p0(function0, null));
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        v0 v0Var = v0.f83334a;
        Intrinsics.checkNotNull(v0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return v0Var;
    }

    @NotNull
    public static final <T> SnapshotStateList<T> toMutableStateList(@NotNull Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(q.toMap(iterable));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf(@NotNull T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt___ArraysKt.toList(tArr));
        return snapshotStateList;
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(q.toMap(pairArr));
        return snapshotStateMap;
    }

    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull Flow<? extends T> flow, R r3, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zChangedInstance = composer.changedInstance(coroutineContext2) | composer.changedInstance(flow);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o0(coroutineContext2, flow, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i12 = i10 >> 3;
        State<R> stateProduceState = produceState(r3, flow, coroutineContext2, (Function2) objRememberedValue, composer, (i12 & 14) | (i12 & 8) | ((i10 << 3) & 112) | (i10 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull Function0<? extends T> function0) {
        SnapshotThreadLocal<IntRef> snapshotThreadLocal = i0.f83258a;
        return new DerivedSnapshotState(null, function0);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(function2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new k0(function2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (i10 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(function2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new l0(function2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i11 = i10 >> 3;
        EffectsKt.LaunchedEffect(obj, obj2, (Function2) objRememberedValue2, composer, (i11 & 112) | (i11 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(function2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new m0(function2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i11 = i10 >> 3;
        EffectsKt.LaunchedEffect(obj, obj2, obj3, (Function2) objRememberedValue2, composer, (i11 & 14) | (i11 & 112) | (i11 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t10, @NotNull Object[] objArr, @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zChangedInstance = composer.changedInstance(function2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new n0(function2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(objArrCopyOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
