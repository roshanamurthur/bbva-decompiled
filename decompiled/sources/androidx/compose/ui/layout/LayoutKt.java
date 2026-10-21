package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.protobuf.q;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a \u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\u000b\u001a>\u0010\u0000\u001a\u00020\u00012\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00050\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00050\rH\u0001¢\u0006\u0002\u0010\u0013\u001a6\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010\u001b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u001a\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "contents", "", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/ExtensionFunctionType;", "modifierMaterializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "materializerOfWithCompositionLocalInjection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,353:1\n78#1,11:397\n91#1:428\n456#2,8:354\n464#2,6:368\n286#2,8:374\n294#2,2:388\n36#2:390\n456#2,8:408\n464#2,6:422\n365#2,8:429\n373#2,3:443\n4144#3,6:362\n4144#3,6:382\n4144#3,6:416\n4144#3,6:437\n1097#4,6:391\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n169#1:397,11\n169#1:428\n80#1:354,8\n80#1:368,6\n126#1:374,8\n126#1:388,2\n172#1:390\n169#1:408,8\n169#1:422,6\n251#1:429,8\n251#1:443,3\n86#1:362,6\n133#1:382,6\n169#1:416,6\n260#1:437,6\n172#1:391,6\n*E\n"})
public final class LayoutKt {

    /* JADX INFO: compiled from: Layout.kt */
    public static final class a extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16567p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode init = layoutNode;
            Intrinsics.checkNotNullParameter(init, "$this$init");
            init.setCanMultiMeasure$ui_release(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Layout.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16568p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f16569q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MeasurePolicy f16570r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16571s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f16572t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, MeasurePolicy measurePolicy, int i10, int i11) {
            super(2);
            this.f16568p0 = modifier;
            this.f16569q0 = function2;
            this.f16570r0 = measurePolicy;
            this.f16571s0 = i10;
            this.f16572t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LayoutKt.MultiMeasureLayout(this.f16568p0, this.f16569q0, this.f16570r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16571s0 | 1), this.f16572t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Layout.kt */
    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,353:1\n33#2,4:354\n38#2:375\n365#3,8:358\n373#3,3:372\n4144#4,6:366\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n*L\n180#1:354,4\n180#1:375\n182#1:358,8\n182#1:372,3\n186#1:366,6\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Function2<Composer, Integer, Unit>> f16573p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Function2<? super Composer, ? super Integer, Unit>> list) {
            super(2);
            this.f16573p0 = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, iIntValue, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:178)");
                }
                List<Function2<Composer, Integer, Unit>> list = this.f16573p0;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Function2<Composer, Integer, Unit> function2 = list.get(i10);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> virtualConstructor = companion.getVirtualConstructor();
                    composer2.startReplaceableGroup(-692256719);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(virtualConstructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    function2.invoke(composer2, 0);
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Layout.kt */
    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,353:1\n4255#2,2:354\n4257#2,2:362\n4144#3,6:356\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n205#1:354,2\n205#1:362,2\n208#1:356,6\n*E\n"})
    public static final class d extends Lambda implements Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16574p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Modifier modifier) {
            super(3);
            this.f16574p0 = modifier;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
            Composer f14736a = skippableUpdater.getF14736a();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(f14736a, "$this$null");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1586257396, iIntValue, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:201)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, this.f16574p0);
            f14736a.startReplaceableGroup(509942095);
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(f14736a);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m2081setimpl(composerM2074constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            f14736a.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Layout.kt */
    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,353:1\n4255#2,2:354\n4257#2,2:362\n4144#3,6:356\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n*L\n228#1:354,2\n228#1:362,2\n231#1:356,6\n*E\n"})
    public static final class e extends Lambda implements Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16575p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Modifier modifier) {
            super(3);
            this.f16575p0 = modifier;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
            Composer f14736a = skippableUpdater.getF14736a();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(f14736a, "$this$null");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-55743822, iIntValue, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:224)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            Modifier modifierMaterializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, this.f16575p0);
            f14736a.startReplaceableGroup(509942095);
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(f14736a);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m2081setimpl(composerM2074constructorimpl, modifierMaterializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            f14736a.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = modifierMaterializerOf(modifier);
        int i12 = ((i10 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(composer, Integer.valueOf((i12 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(@Nullable Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i14 = ((i12 << 3) & 896) | 6;
            composerStartRestartGroup.startReplaceableGroup(-692256719);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m2081setimpl(composerM2074constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m2078initimpl(composerM2074constructorimpl, a.f16567p0);
            Updater.m2081setimpl(composerM2074constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            content.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, content, measurePolicy, i10, i11));
    }

    @PublishedApi
    @NotNull
    public static final Function2<Composer, Integer, Unit> combineAsVirtualLayouts(@NotNull List<? extends Function2<? super Composer, ? super Integer, Unit>> contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new c(contents));
    }

    @JvmName(name = "materializerOf")
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    @PublishedApi
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new e(modifier));
    }

    @PublishedApi
    @JvmName(name = "modifierMaterializerOf")
    @NotNull
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new d(modifier));
    }

    @Composable
    @UiComposable
    public static final void Layout(@Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final Function0<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Updater.m2081setimpl(composerM2074constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2081setimpl(composerM2074constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
        }
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull List<? extends Function2<? super Composer, ? super Integer, Unit>> contents, @Nullable Modifier modifier, @NotNull MultiContentMeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1399185516);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = combineAsVirtualLayouts(contents);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(measurePolicy);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(measurePolicy);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
        int i12 = i10 & 112;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = modifierMaterializerOf(modifier);
        int i13 = ((i12 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i13 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        q.e((i13 >> 9) & 14, function2CombineAsVirtualLayouts, composer);
    }
}
