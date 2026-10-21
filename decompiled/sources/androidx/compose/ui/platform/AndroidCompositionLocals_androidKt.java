package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\b8\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideAndroidCompositionLocals", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalConfiguration", "Landroid/content/Context;", "b", "getLocalContext", "LocalContext", "Landroidx/compose/ui/res/ImageVectorCache;", "c", "getLocalImageVectorCache", "LocalImageVectorCache", "Landroidx/lifecycle/LifecycleOwner;", "d", "getLocalLifecycleOwner", "LocalLifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "e", "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "f", "getLocalView", "LocalView", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n25#2:167\n36#2:174\n25#2:181\n25#2:188\n25#2:195\n25#2:202\n25#2:210\n1097#3,6:168\n1097#3,6:175\n1097#3,6:182\n1097#3,6:189\n1097#3,6:196\n1097#3,3:203\n1100#3,3:207\n1097#3,6:211\n1#4:206\n81#5:217\n107#5,2:218\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n89#1:167\n93#1:174\n95#1:181\n100#1:188\n133#1:195\n134#1:202\n137#1:210\n89#1:168,6\n93#1:175,6\n95#1:182,6\n100#1:189,6\n133#1:196,6\n134#1:203,3\n134#1:207,3\n137#1:211,6\n89#1:217\n89#1:218,2\n*E\n"})
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Configuration> f17088a = CompositionLocalKt.compositionLocalOf$default(null, a.f17095p0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Context> f17089b = CompositionLocalKt.staticCompositionLocalOf(b.f17096p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ImageVectorCache> f17090c = CompositionLocalKt.staticCompositionLocalOf(c.f17097p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> f17091d = CompositionLocalKt.staticCompositionLocalOf(d.f17098p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> f17092e = CompositionLocalKt.staticCompositionLocalOf(e.f17099p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<View> f17093f = CompositionLocalKt.staticCompositionLocalOf(f.f17100p0);

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class a extends Lambda implements Function0<Configuration> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17095p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class b extends Lambda implements Function0<Context> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17096p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class c extends Lambda implements Function0<ImageVectorCache> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17097p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ImageVectorCache invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class d extends Lambda implements Function0<LifecycleOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f17098p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleOwner invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class e extends Lambda implements Function0<SavedStateRegistryOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f17099p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final SavedStateRegistryOwner invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class f extends Lambda implements Function0<View> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f17100p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class g extends Lambda implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Configuration> f17101p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MutableState<Configuration> mutableState) {
            super(1);
            this.f17101p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Configuration configuration) {
            Configuration it = configuration;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f17101p0.setValue(new Configuration(it));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,166:1\n63#2,5:167\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n104#1:167,5\n*E\n"})
    public static final class h extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DisposableSaveableStateRegistry f17102p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
            super(1);
            this.f17102p0 = disposableSaveableStateRegistry;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.f17102p0;
            return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    disposableSaveableStateRegistry.dispose();
                }
            };
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f17103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AndroidUriHandler f17104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f17105r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f17106s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AndroidComposeView androidComposeView, AndroidUriHandler androidUriHandler, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f17103p0 = androidComposeView;
            this.f17104q0 = androidUriHandler;
            this.f17105r0 = function2;
            this.f17106s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1471621628, iIntValue, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:117)");
                }
                int i10 = ((this.f17106s0 << 3) & 896) | 72;
                CompositionLocalsKt.ProvideCommonCompositionLocals(this.f17103p0, this.f17104q0, this.f17105r0, composer2, i10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f17107p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f17108q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f17109r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(AndroidComposeView androidComposeView, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f17107p0 = androidComposeView;
            this.f17108q0 = function2;
            this.f17109r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f17109r0 | 1);
            AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.f17107p0, this.f17108q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(@NotNull AndroidComposeView owner, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1396852028);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        Context context = owner.getContext();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new g(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        owner.setConfigurationChangeObserver((Function1) objRememberedValue2);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            objRememberedValue3 = new AndroidUriHandler(context);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) objRememberedValue3;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(owner, viewTreeOwners.getSavedStateRegistryOwner());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objRememberedValue4;
        EffectsKt.DisposableEffect(Unit.INSTANCE, new h(disposableSaveableStateRegistry), composerStartRestartGroup, 6);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Configuration configuration = (Configuration) mutableState.getValue();
        composerStartRestartGroup.startReplaceableGroup(-485908294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, 72, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:128)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new ImageVectorCache();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final ImageVectorCache imageVectorCache = (ImageVectorCache) objRememberedValue5;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        Object obj = objRememberedValue6;
        if (objRememberedValue6 == companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composerStartRestartGroup.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Configuration configuration3 = (Configuration) obj;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@NotNull Configuration configuration4) {
                    Intrinsics.checkNotNullParameter(configuration4, "configuration");
                    Configuration configuration5 = configuration3;
                    imageVectorCache.prune(configuration5.updateFrom(configuration4));
                    configuration5.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int level) {
                    imageVectorCache.clear();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(imageVectorCache, new f0(context, (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) objRememberedValue7), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{f17088a.provides((Configuration) mutableState.getValue()), f17089b.provides(context), f17091d.provides(viewTreeOwners.getLifecycleOwner()), f17092e.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), f17093f.provides(owner.getView()), f17090c.provides(imageVectorCache)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1471621628, true, new i(owner, androidUriHandler, content, i10)), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(owner, content, i10));
    }

    public static final Void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return f17088a;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return f17089b;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return f17090c;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return f17091d;
    }

    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return f17092e;
    }

    @NotNull
    public static final ProvidableCompositionLocal<View> getLocalView() {
        return f17093f;
    }
}
