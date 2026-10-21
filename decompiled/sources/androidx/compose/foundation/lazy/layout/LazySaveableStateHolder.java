package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n81#2:107\n107#2,2:108\n1855#3,2:110\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:107\n68#1:108,2\n75#1:110,2\n*E\n"})
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Companion f5050d = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SaveableStateRegistry f5051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f5052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f5053c;

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
        @SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
        public static final class a extends Lambda implements Function2<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f5054p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Map<String, ? extends List<? extends Object>> invoke(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
                SaverScope Saver = saverScope;
                LazySaveableStateHolder it = lazySaveableStateHolder;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                Map<String, List<Object>> mapPerformSave = it.performSave();
                if (mapPerformSave.isEmpty()) {
                    return null;
                }
                return mapPerformSave;
            }
        }

        /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
        public static final class b extends Lambda implements Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SaveableStateRegistry f5055p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SaveableStateRegistry saveableStateRegistry) {
                super(1);
                this.f5055p0 = saveableStateRegistry;
            }

            @Override // kotlin.jvm.functions.Function1
            public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
                Map<String, ? extends List<? extends Object>> restored = map;
                Intrinsics.checkNotNullParameter(restored, "restored");
                return new LazySaveableStateHolder(this.f5055p0, restored);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(@Nullable SaveableStateRegistry parentRegistry) {
            return SaverKt.Saver(a.f5054p0, new b(parentRegistry));
        }
    }

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    public static final class a extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateRegistry f5058p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.f5058p0 = saveableStateRegistry;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SaveableStateRegistry saveableStateRegistry = this.f5058p0;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(it) : true);
        }
    }

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    @SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,106:1\n63#2,5:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n*L\n87#1:107,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f5060q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f5060q0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final LazySaveableStateHolder lazySaveableStateHolder = LazySaveableStateHolder.this;
            LinkedHashSet linkedHashSet = lazySaveableStateHolder.f5053c;
            final Object obj = this.f5060q0;
            linkedHashSet.remove(obj);
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lazySaveableStateHolder.f5053c.add(obj);
                }
            };
        }
    }

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f5062q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f5063r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5064s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f5062q0 = obj;
            this.f5063r0 = function2;
            this.f5064s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5064s0 | 1);
            Object obj = this.f5062q0;
            Function2<Composer, Integer, Unit> function2 = this.f5063r0;
            LazySaveableStateHolder.this.SaveableStateProvider(obj, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public LazySaveableStateHolder(@Nullable SaveableStateRegistry saveableStateRegistry, @Nullable Map<String, ? extends List<? extends Object>> map) {
        SaveableStateRegistry wrappedRegistry = SaveableStateRegistryKt.SaveableStateRegistry(map, new a(saveableStateRegistry));
        Intrinsics.checkNotNullParameter(wrappedRegistry, "wrappedRegistry");
        this.f5051a = wrappedRegistry;
        this.f5052b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f5053c = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public final void SaveableStateProvider(@NotNull Object key, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f5052b.getValue();
        if (saveableStateHolder == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        saveableStateHolder.SaveableStateProvider(key, content, composerStartRestartGroup, (i10 & 112) | 520);
        EffectsKt.DisposableEffect(key, new b(key), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(key, content, i10));
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f5051a.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public final Object consumeRestored(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f5051a.consumeRestored(key);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public final Map<String, List<Object>> performSave() {
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f5052b.getValue();
        if (saveableStateHolder != null) {
            Iterator it = this.f5053c.iterator();
            while (it.hasNext()) {
                saveableStateHolder.removeState(it.next());
            }
        }
        return this.f5051a.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public final SaveableStateRegistry.Entry registerProvider(@NotNull String key, @NotNull Function0<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f5051a.registerProvider(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f5052b.getValue();
        if (saveableStateHolder == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        saveableStateHolder.removeState(key);
    }
}
