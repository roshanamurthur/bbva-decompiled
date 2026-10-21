package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bI\u0010JJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\"\u0010\u0019\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\rJ\u001c\u0010!\u001a\u00020\u00052\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\rJ\u0006\u0010$\u001a\u00020\u0005J\u001c\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0005\u0018\u00010%2\u0006\u0010\u001a\u001a\u00020\u0017R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b3\u00101R$\u00108\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00107R$\u0010;\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00101\"\u0004\b:\u00107R$\u0010>\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u00101\"\u0004\b=\u00107R$\u0010A\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00107R$\u0010D\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00107R$\u0010G\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bE\u00101\"\u0004\bF\u00107R\u0011\u0010H\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bH\u00101¨\u0006L"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/Composer;", "composer", "", "compose", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "release", "Landroidx/compose/runtime/RecomposeScopeOwner;", "owner", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "token", EventDataKeys.Lifecycle.LIFECYCLE_START, "scopeSkipped", "instance", "", "recordRead", "Landroidx/compose/runtime/DerivedState;", "recordDerivedStateValue", "instances", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "Landroidx/compose/runtime/Anchor;", "c", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "anchor", "getValid", "()Z", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "(Z)V", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "getForcedRecompose", "setForcedRecompose", "forcedRecompose", "getSkipped$runtime_release", "setSkipped", "skipped", "isConditional", "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,449:1\n89#2:450\n1#3:451\n296#4,2:452\n267#4,4:454\n237#4,7:458\n248#4,3:466\n251#4,2:470\n272#4:472\n298#4,2:473\n273#4:475\n254#4,6:476\n274#4:482\n300#4:483\n1810#5:465\n1672#5:469\n1810#5:494\n1672#5:498\n1810#5:521\n1672#5:525\n401#6,4:484\n373#6,6:488\n383#6,3:495\n386#6,2:499\n406#6,2:501\n389#6,6:503\n408#6:509\n449#6:510\n401#6,4:511\n373#6,6:515\n383#6,3:522\n386#6,2:526\n406#6:528\n450#6,2:529\n407#6:531\n389#6,6:532\n408#6:538\n452#6:539\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:450\n359#1:452,2\n359#1:454,4\n359#1:458,7\n359#1:466,3\n359#1:470,2\n359#1:472\n359#1:473,2\n359#1:475\n359#1:476,6\n359#1:482\n359#1:483\n359#1:465\n359#1:469\n381#1:494\n381#1:498\n404#1:521\n404#1:525\n381#1:484,4\n381#1:488,6\n381#1:495,3\n381#1:499,2\n381#1:501,2\n381#1:503,6\n381#1:509\n404#1:510\n404#1:511,4\n404#1:515,6\n404#1:522,3\n404#1:526,2\n404#1:528\n404#1:529,2\n404#1:531\n404#1:532,6\n404#1:538\n404#1:539\n*E\n"})
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecomposeScopeOwner f14640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Anchor anchor;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function2<? super Composer, ? super Integer, Unit> f14642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecomposeScopeObserver f14643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MutableObjectIntMap<Object> f14645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public MutableScatterMap<DerivedState<?>, Object> f14646h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "()V", "adoptAnchoredScopes", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "anchors", "", "Landroidx/compose/runtime/Anchor;", "newOwner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "adoptAnchoredScopes$runtime_release", "hasAnchoredRecomposeScopes", "", "Landroidx/compose/runtime/SlotTable;", "hasAnchoredRecomposeScopes$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,449:1\n33#2,6:450\n93#2,2:456\n33#2,4:458\n95#2,2:462\n38#2:464\n97#2:465\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n434#1:450,6\n444#1:456,2\n444#1:458,4\n444#1:462,2\n444#1:464\n444#1:465\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void adoptAnchoredScopes$runtime_release(@NotNull SlotWriter slots, @NotNull List<Anchor> anchors, @NotNull RecomposeScopeOwner newOwner) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object objSlot = slots.slot(anchors.get(i10), 0);
                    RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(newOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@NotNull SlotTable slots, @NotNull List<Anchor> anchors) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = anchors.get(i10);
                    if (slots.ownsAnchor(anchor) && (slots.slot$runtime_release(slots.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,449:1\n843#2:450\n845#2,4:464\n849#2:474\n373#3,6:451\n383#3,3:458\n386#3,2:462\n389#3,6:468\n1810#4:457\n1672#4:461\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n411#1:450\n411#1:464,4\n411#1:474\n411#1:451,6\n411#1:458,3\n411#1:462,2\n411#1:468,6\n411#1:457\n411#1:461\n*E\n"})
    public static final class a extends Lambda implements Function1<Composition, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f14648q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableObjectIntMap<Object> f14649r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, MutableObjectIntMap<Object> mutableObjectIntMap) {
            super(1);
            this.f14648q0 = i10;
            this.f14649r0 = mutableObjectIntMap;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x008d A[LOOP:0: B:11:0x0028->B:35:0x008d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x0092 A[EDGE_INSN: B:39:0x0092->B:36:0x0092 BREAK  A[LOOP:0: B:11:0x0028->B:35:0x008d], SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Composition composition) {
            int i10;
            Composition composition2 = composition;
            RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
            int i11 = recomposeScopeImpl.f14644f;
            int i12 = this.f14648q0;
            if (i11 == i12) {
                MutableObjectIntMap mutableObjectIntMap = recomposeScopeImpl.f14645g;
                MutableObjectIntMap<Object> mutableObjectIntMap2 = this.f14649r0;
                if (Intrinsics.areEqual(mutableObjectIntMap2, mutableObjectIntMap) && (composition2 instanceof CompositionImpl)) {
                    long[] jArr = mutableObjectIntMap2.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr[i13];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i13 != length) {
                                    break;
                                    break;
                                }
                                i13++;
                            } else {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((255 & j10) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj = mutableObjectIntMap2.keys[i17];
                                        boolean z10 = mutableObjectIntMap2.values[i17] != i12;
                                        if (z10) {
                                            CompositionImpl compositionImpl = (CompositionImpl) composition2;
                                            compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                            if (obj instanceof DerivedState) {
                                                compositionImpl.removeDerivedStateObservation$runtime_release((DerivedState) obj);
                                                MutableScatterMap mutableScatterMap = recomposeScopeImpl.f14646h;
                                                if (mutableScatterMap != null) {
                                                    mutableScatterMap.remove(obj);
                                                }
                                            }
                                        }
                                        if (z10) {
                                            mutableObjectIntMap2.removeValueAt(i17);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = i14;
                                    }
                                    j10 >>= i10;
                                    i16++;
                                    i14 = i10;
                                }
                                if (i15 != i14) {
                                    break;
                                }
                                if (i13 != length) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public RecomposeScopeImpl(@Nullable RecomposeScopeOwner recomposeScopeOwner) {
        this.f14640b = recomposeScopeOwner;
    }

    public static boolean a(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    public final void adoptedBy(@NotNull RecomposeScopeOwner owner) {
        this.f14640b = owner;
    }

    public final void b(boolean z10) {
        if (z10) {
            this.f14639a |= 32;
        } else {
            this.f14639a &= -33;
        }
    }

    public final void compose(@NotNull Composer composer) {
        Unit unit;
        Function2<? super Composer, ? super Integer, Unit> function2 = this.f14642d;
        RecomposeScopeObserver recomposeScopeObserver = this.f14643e;
        if (recomposeScopeObserver != null && function2 != null) {
            recomposeScopeObserver.onBeginScopeComposition(this);
            try {
                function2.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(this);
            }
        }
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @Nullable
    public final Function1<Composition, Unit> end(int token) {
        MutableObjectIntMap<Object> mutableObjectIntMap = this.f14645g;
        if (mutableObjectIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] objArr = mutableObjectIntMap.keys;
        int[] iArr = mutableObjectIntMap.values;
        long[] jArr = mutableObjectIntMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        if (iArr[i13] != token) {
                            return new a(token, mutableObjectIntMap);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.f14642d != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.f14639a & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.f14639a & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.f14639a & 64) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.f14639a & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.f14639a & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.f14639a & 1) != 0;
    }

    public final boolean getValid() {
        Anchor anchor;
        return (this.f14640b == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.f14640b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object value) {
        InvalidationResult invalidationResultInvalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.f14640b;
        return (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final boolean isConditional() {
        return this.f14646h != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[LOOP:0: B:18:0x002f->B:32:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    public final boolean isInvalidFor(@Nullable Object instances) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (instances == null || (mutableScatterMap = this.f14646h) == null) {
            return true;
        }
        if (instances instanceof DerivedState) {
            return a((DerivedState) instances, mutableScatterMap);
        }
        if (!(instances instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) instances;
        if (scatterSet.isNotEmpty()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (!(obj instanceof DerivedState) || a((DerivedState) obj, mutableScatterMap)) {
                                    return true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
            }
        }
        return false;
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull final RecomposeScopeObserver observer) {
        synchronized (RecomposeScopeImplKt.f14652a) {
            this.f14643e = observer;
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = RecomposeScopeImplKt.f14652a;
                RecomposeScopeImpl recomposeScopeImpl = this.f14650a;
                RecomposeScopeObserver recomposeScopeObserver = observer;
                synchronized (obj) {
                    try {
                        if (Intrinsics.areEqual(recomposeScopeImpl.f14643e, recomposeScopeObserver)) {
                            recomposeScopeImpl.f14643e = null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    public final void recordDerivedStateValue(@NotNull DerivedState<?> instance, @Nullable Object value) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.f14646h;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.f14646h = mutableScatterMap;
        }
        mutableScatterMap.set(instance, value);
    }

    public final boolean recordRead(@NotNull Object instance) {
        int i10 = 0;
        if ((this.f14639a & 32) != 0) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.f14645g;
        int i11 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(i10, i11, null);
            this.f14645g = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(instance, this.f14644f, -1) == this.f14644f;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.f14640b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.f14640b = null;
        this.f14645g = null;
        this.f14646h = null;
        RecomposeScopeObserver recomposeScopeObserver = this.f14643e;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[EDGE_INSN: B:31:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.f14640b;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.f14645g) == null) {
            return;
        }
        b(true);
        try {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                recomposeScopeOwner.recordReadOf(obj);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } finally {
            b(false);
        }
    }

    public final void scopeSkipped() {
        this.f14639a |= 16;
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z10) {
        if (z10) {
            this.f14639a |= 2;
        } else {
            this.f14639a &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z10) {
        if (z10) {
            this.f14639a |= 4;
        } else {
            this.f14639a &= -5;
        }
    }

    public final void setForcedRecompose(boolean z10) {
        if (z10) {
            this.f14639a |= 64;
        } else {
            this.f14639a &= -65;
        }
    }

    public final void setRequiresRecompose(boolean z10) {
        if (z10) {
            this.f14639a |= 8;
        } else {
            this.f14639a &= -9;
        }
    }

    public final void setUsed(boolean z10) {
        if (z10) {
            this.f14639a |= 1;
        } else {
            this.f14639a &= -2;
        }
    }

    public final void start(int token) {
        this.f14644f = token;
        this.f14639a &= -17;
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) {
        this.f14642d = block;
    }
}
