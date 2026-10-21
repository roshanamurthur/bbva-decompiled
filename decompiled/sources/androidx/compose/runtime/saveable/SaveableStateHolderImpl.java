package androidx.compose.runtime.saveable;

import androidx.collection.j;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import bk.q;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n148#2,3:144\n151#2,2:159\n1225#3,6:147\n1225#3,6:153\n1855#4,2:161\n1#5:163\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n77#1:144,3\n77#1:159,2\n78#1:147,6\n89#1:153,6\n103#1:161,2\n*E\n"})
public final class SaveableStateHolderImpl implements SaveableStateHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Companion f15204d = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Saver<SaveableStateHolderImpl, ?> f15205e = SaverKt.Saver(a.f15216p0, b.f15217p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Object, Map<String, List<Object>>> f15206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f15207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SaveableStateRegistry f15208c;

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.f15205e;
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00030\u0002R\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "", "", "", "", "map", "", "saveTo", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "", "b", "Z", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "shouldSave", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "c", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "registry", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
    public final class RegistryHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public boolean shouldSave = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SaveableStateRegistry registry;

        /* JADX INFO: compiled from: SaveableStateHolder.kt */
        public static final class a extends Lambda implements Function1<Object, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SaveableStateHolderImpl f15212p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SaveableStateHolderImpl saveableStateHolderImpl) {
                super(1);
                this.f15212p0 = saveableStateHolderImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry = this.f15212p0.f15208c;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true);
            }
        }

        public RegistryHolder(@NotNull SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry(saveableStateHolderImpl.f15206a.get(obj), new a(saveableStateHolderImpl));
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        @NotNull
        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(@NotNull Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> mapPerformSave = this.registry.performSave();
                boolean zIsEmpty = mapPerformSave.isEmpty();
                Object obj = this.key;
                if (zIsEmpty) {
                    map.remove(obj);
                } else {
                    map.put(obj, mapPerformSave);
                }
            }
        }

        public final void setShouldSave(boolean z10) {
            this.shouldSave = z10;
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    public static final class a extends Lambda implements Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15216p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
            SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
            Map<Object, Map<String, List<Object>>> mutableMap = q.toMutableMap(saveableStateHolderImpl2.f15206a);
            Iterator it = saveableStateHolderImpl2.f15207b.values().iterator();
            while (it.hasNext()) {
                ((RegistryHolder) it.next()).saveTo(mutableMap);
            }
            if (mutableMap.isEmpty()) {
                return null;
            }
            return mutableMap;
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    public static final class b extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f15217p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new SaveableStateHolderImpl((Map<Object, Map<String, List<Object>>>) map);
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,143:1\n1#2:144\n64#3,5:145\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n*L\n93#1:145,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateHolderImpl f15218p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f15219q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RegistryHolder f15220r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            super(1);
            this.f15218p0 = saveableStateHolderImpl;
            this.f15219q0 = obj;
            this.f15220r0 = registryHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            final SaveableStateHolderImpl saveableStateHolderImpl = this.f15218p0;
            LinkedHashMap linkedHashMap = saveableStateHolderImpl.f15207b;
            final Object obj = this.f15219q0;
            if (!(!linkedHashMap.containsKey(obj))) {
                throw new IllegalArgumentException(j.b("Key ", obj, " was used multiple times ").toString());
            }
            saveableStateHolderImpl.f15206a.remove(obj);
            LinkedHashMap linkedHashMap2 = saveableStateHolderImpl.f15207b;
            final RegistryHolder registryHolder = this.f15220r0;
            linkedHashMap2.put(obj, registryHolder);
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                    registryHolder.saveTo(saveableStateHolderImpl2.f15206a);
                    saveableStateHolderImpl2.f15207b.remove(obj);
                }
            };
        }
    }

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f15222q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f15223r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f15224s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f15222q0 = obj;
            this.f15223r0 = function2;
            this.f15224s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15224s0 | 1);
            Object obj = this.f15222q0;
            Function2<Composer, Integer, Unit> function2 = this.f15223r0;
            SaveableStateHolderImpl.this.SaveableStateProvider(obj, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public SaveableStateHolderImpl() {
        this(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public final void SaveableStateProvider(@NotNull Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1198538093);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            composerStartRestartGroup.startReusableGroup(207, obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                SaveableStateRegistry saveableStateRegistry = this.f15208c;
                if (saveableStateRegistry != null && !saveableStateRegistry.canBeSaved(obj)) {
                    throw new IllegalArgumentException(j.b("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objRememberedValue = new RegistryHolder(this, obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RegistryHolder registryHolder = (RegistryHolder) objRememberedValue;
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), function2, composerStartRestartGroup, (i11 & 112) | ProvidedValue.$stable);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(obj) | composerStartRestartGroup.changedInstance(registryHolder);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new c(registryHolder, this, obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(obj, function2, i10));
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(@NotNull Object obj) {
        RegistryHolder registryHolder = (RegistryHolder) this.f15207b.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.f15206a.remove(obj);
        }
    }

    public SaveableStateHolderImpl(@NotNull Map<Object, Map<String, List<Object>>> map) {
        this.f15206a = map;
        this.f15207b = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(int i10) {
        this(new LinkedHashMap());
    }
}
