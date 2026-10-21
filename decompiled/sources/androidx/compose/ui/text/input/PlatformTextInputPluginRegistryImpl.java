package androidx.compose.ui.text.input;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.text.InternalTextApi;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B%\u0012\u001c\u0010\u000f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "plugin", "rememberAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "getOrCreateAdapter", "getFocusedAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "focusedAdapter", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "factory", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "AdapterHandle", "a", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@InternalTextApi
@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,341:1\n1#2:342\n36#3:343\n25#3:354\n1097#4,6:344\n1097#4,3:355\n1100#4,3:361\n486#5,4:350\n490#5,2:358\n494#5:364\n486#6:360\n766#7:365\n857#7,2:366\n33#8,6:368\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n173#1:343\n178#1:354\n173#1:344,6\n178#1:355,3\n178#1:361,3\n178#1:350,4\n178#1:358,2\n178#1:364\n178#1:360\n247#1:365\n247#1:366,2\n248#1:368,6\n*E\n"})
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> f18104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<PlatformTextInputPlugin<?>, b<?>> f18105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PlatformTextInputPlugin<?> f18107d;

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "dispose", "a", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "adapter", "Lkotlin/Function0;", "onDispose", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputAdapter;Lkotlin/jvm/functions/Function0;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @InternalTextApi
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1#2:342\n*E\n"})
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final T adapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Boolean> f18109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18110c;

        public AdapterHandle(@NotNull T adapter, @NotNull Function0<Boolean> onDispose) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(onDispose, "onDispose");
            this.adapter = adapter;
            this.f18109b = onDispose;
        }

        public final boolean dispose() {
            if (!(!this.f18110c)) {
                throw new IllegalStateException("AdapterHandle already disposed".toString());
            }
            this.f18110c = true;
            return this.f18109b.invoke().booleanValue();
        }

        @NotNull
        public final T getAdapter() {
            return this.adapter;
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    public final class a implements PlatformTextInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PlatformTextInputPlugin<?> f18111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f18112b;

        public a(@NotNull PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin<?> plugin) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            this.f18112b = platformTextInputPluginRegistryImpl;
            this.f18111a = plugin;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInput
        public final void releaseInputFocus() {
            PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl = this.f18112b;
            if (Intrinsics.areEqual(platformTextInputPluginRegistryImpl.f18107d, this.f18111a)) {
                platformTextInputPluginRegistryImpl.f18107d = null;
            }
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInput
        public final void requestInputFocus() {
            this.f18112b.f18107d = this.f18111a;
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,341:1\n75#2:342\n108#2,2:343\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n297#1:342\n297#1:343,2\n*E\n"})
    public final class b<T extends PlatformTextInputAdapter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final T f18113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableIntState f18114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f18115c;

        public b(@NotNull PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f18115c = platformTextInputPluginRegistryImpl;
            this.f18113a = adapter;
            this.f18114b = SnapshotIntStateKt.mutableIntStateOf(0);
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    public static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ b<T> f18116p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<T> bVar) {
            super(0);
            this.f18116p0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z10;
            b<T> bVar = this.f18116p0;
            MutableIntState mutableIntState = bVar.f18114b;
            bVar.f18114b.setIntValue(mutableIntState.getIntValue() - 1);
            if (mutableIntState.getIntValue() < 0) {
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + mutableIntState.getIntValue() + RootService.CLOSE_BRACKET).toString());
            }
            if (mutableIntState.getIntValue() == 0) {
                z10 = true;
                bVar.f18115c.f18106c = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: PlatformTextInputAdapter.kt */
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,341:1\n63#2,5:342\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n*L\n180#1:342,5\n*E\n"})
    public static final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AdapterHandle<T> f18117p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f18118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f18119r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdapterHandle<T> adapterHandle, CoroutineScope coroutineScope, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
            super(1);
            this.f18117p0 = adapterHandle;
            this.f18118q0 = coroutineScope;
            this.f18119r0 = platformTextInputPluginRegistryImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final CoroutineScope coroutineScope = this.f18118q0;
            final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl = this.f18119r0;
            final AdapterHandle<T> adapterHandle = this.f18117p0;
            return new DisposableEffectResult() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    if (adapterHandle.dispose()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, NonCancellable.INSTANCE, null, new a(platformTextInputPluginRegistryImpl, null), 2, null);
                    }
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformTextInputPluginRegistryImpl(@NotNull Function2<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f18104a = factory;
        this.f18105b = SnapshotStateKt.mutableStateMapOf();
    }

    public static final void access$disposeTombstonedAdapters(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
        if (platformTextInputPluginRegistryImpl.f18106c) {
            platformTextInputPluginRegistryImpl.f18106c = false;
            SnapshotStateMap<PlatformTextInputPlugin<?>, b<?>> snapshotStateMap = platformTextInputPluginRegistryImpl.f18105b;
            Set<Map.Entry<PlatformTextInputPlugin<?>, b<?>>> setEntrySet = snapshotStateMap.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((b) ((Map.Entry) obj).getValue()).f18114b.getIntValue() == 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i10);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                b bVar = (b) entry.getValue();
                if (Intrinsics.areEqual(platformTextInputPluginRegistryImpl.f18107d, platformTextInputPlugin)) {
                    platformTextInputPluginRegistryImpl.f18107d = null;
                }
                snapshotStateMap.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(bVar.f18113a);
            }
        }
    }

    @Nullable
    public final PlatformTextInputAdapter getFocusedAdapter() {
        b<?> bVar = this.f18105b.get(this.f18107d);
        if (bVar != null) {
            return bVar.f18113a;
        }
        return null;
    }

    @InternalTextApi
    @NotNull
    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(@NotNull PlatformTextInputPlugin<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        SnapshotStateMap<PlatformTextInputPlugin<?>, b<?>> snapshotStateMap = this.f18105b;
        b<?> bVar = snapshotStateMap.get(plugin);
        if (bVar == null) {
            PlatformTextInputAdapter platformTextInputAdapterInvoke = this.f18104a.invoke(plugin, new a(this, plugin));
            Intrinsics.checkNotNull(platformTextInputAdapterInvoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
            b<?> bVar2 = new b<>(this, platformTextInputAdapterInvoke);
            snapshotStateMap.put(plugin, bVar2);
            bVar = bVar2;
        }
        MutableIntState mutableIntState = bVar.f18114b;
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        return new AdapterHandle<>(bVar.f18113a, new c(bVar));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputPluginRegistry
    @Composable
    @NotNull
    public <T extends PlatformTextInputAdapter> T rememberAdapter(@NotNull PlatformTextInputPlugin<T> plugin, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        composer.startReplaceableGroup(-845039128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845039128, i10, -1, "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:167)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(plugin);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = getOrCreateAdapter(plugin);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AdapterHandle adapterHandle = (AdapterHandle) objRememberedValue;
        Object objB = androidx.databinding.c.b(composer, 773894976, -492369756);
        if (objB == Composer.INSTANCE.getEmpty()) {
            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(adapterHandle, new d(adapterHandle, coroutineScope, this), composer, 8);
        T t10 = (T) adapterHandle.getAdapter();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t10;
    }
}
