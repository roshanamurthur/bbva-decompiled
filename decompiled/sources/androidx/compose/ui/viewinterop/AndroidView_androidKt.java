package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.vierge.bluetoothlibrary.BluetoothState;
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

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\r\"(\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "AndroidView", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,398:1\n76#2:399\n76#2:400\n76#2:401\n76#2:402\n76#2:423\n76#2:424\n286#3,10:403\n251#3,10:413\n4144#4,6:425\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n212#1:399\n213#1:400\n220#1:401\n221#1:402\n266#1:423\n268#1:424\n224#1:403,10\n242#1:413,10\n304#1:425,6\n*E\n"})
public final class AndroidView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f18368a = h.f18387p0;

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, T> f18371p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f18372q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f18373r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f18374s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f18375t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function2, int i10, int i11) {
            super(2);
            this.f18371p0 = function1;
            this.f18372q0 = modifier;
            this.f18373r0 = function2;
            this.f18374s0 = i10;
            this.f18375t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidView_androidKt.AndroidView(this.f18371p0, this.f18372q0, this.f18373r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18374s0 | 1), this.f18375t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class b<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f18376p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setResetBlock(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class c<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f18377p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setUpdateBlock(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class d<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f18378p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setReleaseBlock(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class e<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f18379p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setUpdateBlock(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class f<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f18380p0 = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Object obj) {
            LayoutNode set = layoutNode;
            Function1 it = (Function1) obj;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setReleaseBlock(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, T> f18381p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f18382q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f18383r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f18384s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f18385t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f18386u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, Function1<? super T, Unit> function4, int i10, int i11) {
            super(2);
            this.f18381p0 = function1;
            this.f18382q0 = modifier;
            this.f18383r0 = function2;
            this.f18384s0 = function3;
            this.f18385t0 = function4;
            this.f18386u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidView_androidKt.AndroidView(this.f18381p0, this.f18382q0, this.f18383r0, this.f18384s0, this.f18385t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18386u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class h extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f18387p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class i extends Lambda implements Function2<LayoutNode, Modifier, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f18388p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Modifier modifier) {
            LayoutNode set = layoutNode;
            Modifier it = modifier;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setModifier(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class j extends Lambda implements Function2<LayoutNode, Density, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f18389p0 = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Density density) {
            LayoutNode set = layoutNode;
            Density it = density;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setDensity(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class k extends Lambda implements Function2<LayoutNode, LifecycleOwner, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f18390p0 = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
            LayoutNode set = layoutNode;
            LifecycleOwner it = lifecycleOwner;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setLifecycleOwner(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class l extends Lambda implements Function2<LayoutNode, SavedStateRegistryOwner, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f18391p0 = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
            LayoutNode set = layoutNode;
            SavedStateRegistryOwner it = savedStateRegistryOwner;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidView_androidKt.access$requireViewFactoryHolder(set).setSavedStateRegistryOwner(it);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@NotNull Function1<? super Context, ? extends T> factory, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(factory) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            h hVar = f18368a;
            if (i14 != 0) {
                function1 = hVar;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:100)");
            }
            AndroidView(factory, modifier, null, hVar, function1, composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function1<? super T, Unit> function2 = function1;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(factory, modifier2, function2, i10, i11));
    }

    @Composable
    public static final y1.a a(Function1 function1, Composer composer, int i10) {
        composer.startReplaceableGroup(2030558801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:261)");
        }
        y1.a aVar = new y1.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), function1, ComposablesKt.rememberCompositionContext(composer, 0), (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()), ComposablesKt.getCurrentCompositeKeyHash(composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return aVar;
    }

    public static final ViewFactoryHolder access$requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNull(interopViewFactoryHolder, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (ViewFactoryHolder) interopViewFactoryHolder;
    }

    public static final <T extends View> void b(Composer composer, Modifier modifier, int i10, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.m2081setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2081setimpl(composer, modifier, i.f18388p0);
        Updater.m2081setimpl(composer, density, j.f18389p0);
        Updater.m2081setimpl(composer, lifecycleOwner, k.f18390p0);
        Updater.m2081setimpl(composer, savedStateRegistryOwner, l.f18391p0);
        Updater.m2081setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.f18392p0);
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i10))) {
            bc.org.bouncycastle.math.ec.a.f(i10, composer, i10, setCompositeKeyHash);
        }
    }

    @NotNull
    public static final Function1<View, Unit> getNoOpUpdate() {
        return f18368a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x0184  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b1  */
    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@NotNull Function1<? super Context, ? extends T> factory, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super T, Unit> function2, @Nullable Function1<? super T, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Function1<? super T, Unit> function4;
        int i14;
        int i15;
        Function1<? super T, Unit> function5;
        int i16;
        int i17;
        Function1<? super T, Unit> function6;
        int i18;
        Modifier modifier3;
        h hVar;
        int currentCompositeKeyHash;
        Modifier modifierMaterializeModifier;
        Density density;
        LayoutDirection layoutDirection;
        CompositionLocalMap currentCompositionLocalMap;
        LifecycleOwner lifecycleOwner;
        SavedStateRegistryOwner savedStateRegistryOwner;
        final y1.a aVarA;
        final y1.a aVarA2;
        Function1<? super T, Unit> function7;
        Function1<? super T, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer composerStartRestartGroup = composer.startRestartGroup(-180024211);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(factory) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((46811 & i12) != 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            if (i19 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            hVar = f18368a;
                            if (i15 != 0) {
                                function5 = hVar;
                            }
                            if (i17 != 0) {
                                function6 = hVar;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                            }
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                            if (function4 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-88753439);
                                aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                                composerStartRestartGroup.startReplaceableGroup(1405779621);
                                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final LayoutNode invoke() {
                                            return aVarA2.invoke();
                                        }
                                    });
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                                b(composerM2074constructorimpl, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                Updater.m2081setimpl(composerM2074constructorimpl, function4, b.f18376p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, function6, c.f18377p0);
                                Updater.m2081setimpl(composerM2074constructorimpl, function5, d.f18378p0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-88752574);
                                aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                                composerStartRestartGroup.startReplaceableGroup(1886828752);
                                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final LayoutNode invoke() {
                                            return aVarA.invoke();
                                        }
                                    });
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                                b(composerM2074constructorimpl2, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                Updater.m2081setimpl(composerM2074constructorimpl2, function6, e.f18379p0);
                                Updater.m2081setimpl(composerM2074constructorimpl2, function5, f.f18380p0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        function7 = function4;
                        function8 = function6;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
                    }
                    i12 |= 24576;
                    function6 = function3;
                    if ((46811 & i12) != 9362) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl3, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl3, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl3, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl3, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl4, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl4, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl4, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl5, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl5, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl5, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl5, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl6, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl6, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl6, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
                }
                i12 |= 3072;
                function5 = function2;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) != 9362) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl7, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl7, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl7, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl7, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl8, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl8, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl8, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl9, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl9, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl9, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl9, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl10, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl10, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl10, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
                }
                i12 |= 24576;
                function6 = function3;
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl12, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl12, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl12, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl13, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl13, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl13, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl13, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl14, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl14, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl14, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function4 = function1;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) != 9362) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl15, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl15, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl15, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl15, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl16, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl16, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl16, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl17, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl17, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl17, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl17, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl18, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl18, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl18, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
                }
                i12 |= 24576;
                function6 = function3;
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl19, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl19, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl19, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl19, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl110, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl110, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl111, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl111, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl111, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl112, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl112, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= 3072;
            function5 = function2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl113, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl113, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl113, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl114, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl114, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl115, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl115, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl115, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl116, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl116, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= 24576;
            function6 = function3;
            if ((46811 & i12) != 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl117, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl117, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl117, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl118, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl118, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl119, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl119, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl119, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl1110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl1110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl1110, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl1110, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) != 9362) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl1111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl1111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl1111, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1111, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1111, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl1112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl1112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl1112, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1112, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        hVar = f18368a;
                        if (i15 != 0) {
                            function5 = hVar;
                        }
                        if (i17 != 0) {
                            function6 = hVar;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl1113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl1113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl1113, function4, b.f18376p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1113, function6, c.f18377p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1113, function5, d.f18378p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM2074constructorimpl1114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                            b(composerM2074constructorimpl1114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                            Updater.m2081setimpl(composerM2074constructorimpl1114, function6, e.f18379p0);
                            Updater.m2081setimpl(composerM2074constructorimpl1114, function5, f.f18380p0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
                }
                i12 |= 24576;
                function6 = function3;
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl1115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl1115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl1115, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1115, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1115, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl1116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl1116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl1116, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1116, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl1117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl1117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl1117, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1117, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1117, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl1118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl1118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl1118, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1118, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= 3072;
            function5 = function2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl1119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl1119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl1119, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1119, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl1119, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11110, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11110, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11111, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11111, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11111, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11112, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11112, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= 24576;
            function6 = function3;
            if ((46811 & i12) != 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl11113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl11113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl11113, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11113, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11113, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl11114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl11114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl11114, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11114, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl11115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl11115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl11115, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11115, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11115, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl11116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl11116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl11116, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl11116, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function4 = function1;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) != 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11117, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11117, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11117, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11118, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11118, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    hVar = f18368a;
                    if (i15 != 0) {
                        function5 = hVar;
                    }
                    if (i17 != 0) {
                        function6 = hVar;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl11119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl11119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl11119, function4, b.f18376p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11119, function6, c.f18377p0);
                        Updater.m2081setimpl(composerM2074constructorimpl11119, function5, d.f18378p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM2074constructorimpl111110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        b(composerM2074constructorimpl111110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                        Updater.m2081setimpl(composerM2074constructorimpl111110, function6, e.f18379p0);
                        Updater.m2081setimpl(composerM2074constructorimpl111110, function5, f.f18380p0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
            }
            i12 |= 24576;
            function6 = function3;
            if ((46811 & i12) != 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111111, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111111, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111111, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111112, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111112, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111113, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111113, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111113, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111114, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111114, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
        }
        i12 |= 3072;
        function5 = function2;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((46811 & i12) != 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111115, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111115, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111115, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111116, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111116, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                hVar = f18368a;
                if (i15 != 0) {
                    function5 = hVar;
                }
                if (i17 != 0) {
                    function6 = hVar;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111117, function4, b.f18376p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111117, function6, c.f18377p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111117, function5, d.f18378p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2074constructorimpl111118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    b(composerM2074constructorimpl111118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                    Updater.m2081setimpl(composerM2074constructorimpl111118, function6, e.f18379p0);
                    Updater.m2081setimpl(composerM2074constructorimpl111118, function5, f.f18380p0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
        }
        i12 |= 24576;
        function6 = function3;
        if ((46811 & i12) != 9362) {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                function4 = null;
            }
            hVar = f18368a;
            if (i15 != 0) {
                function5 = hVar;
            }
            if (i17 != 0) {
                function6 = hVar;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
            }
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-88753439);
                aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return aVarA2.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl111119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                b(composerM2074constructorimpl111119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                Updater.m2081setimpl(composerM2074constructorimpl111119, function4, b.f18376p0);
                Updater.m2081setimpl(composerM2074constructorimpl111119, function6, c.f18377p0);
                Updater.m2081setimpl(composerM2074constructorimpl111119, function5, d.f18378p0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88752574);
                aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                composerStartRestartGroup.startReplaceableGroup(1886828752);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl1111110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                b(composerM2074constructorimpl1111110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                Updater.m2081setimpl(composerM2074constructorimpl1111110, function6, e.f18379p0);
                Updater.m2081setimpl(composerM2074constructorimpl1111110, function5, f.f18380p0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                function4 = null;
            }
            hVar = f18368a;
            if (i15 != 0) {
                function5 = hVar;
            }
            if (i17 != 0) {
                function6 = hVar;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180024211, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
            }
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            savedStateRegistryOwner = (SavedStateRegistryOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-88753439);
                aVarA2 = a(factory, composerStartRestartGroup, i12 & 14);
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return aVarA2.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl1111111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                b(composerM2074constructorimpl1111111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                Updater.m2081setimpl(composerM2074constructorimpl1111111, function4, b.f18376p0);
                Updater.m2081setimpl(composerM2074constructorimpl1111111, function6, c.f18377p0);
                Updater.m2081setimpl(composerM2074constructorimpl1111111, function5, d.f18378p0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88752574);
                aVarA = a(factory, composerStartRestartGroup, i12 & 14);
                composerStartRestartGroup.startReplaceableGroup(1886828752);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl1111112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                b(composerM2074constructorimpl1111112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                Updater.m2081setimpl(composerM2074constructorimpl1111112, function6, e.f18379p0);
                Updater.m2081setimpl(composerM2074constructorimpl1111112, function5, f.f18380p0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        function7 = function4;
        function8 = function6;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(factory, modifier3, function7, function5, function8, i10, i11));
    }
}
