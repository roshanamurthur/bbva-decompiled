package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a©\u0001\u0010\u0015\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\u001d\u0010 \u001a\u00020\r8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001d\u0010#\u001a\u00020\r8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogContent", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "a", "F", "getDialogMinWidth", "()F", "DialogMinWidth", "b", "getDialogMaxWidth", "DialogMaxWidth", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,221:1\n71#2,4:222\n75#2,11:227\n88#2:252\n76#3:226\n456#4,14:238\n154#5:253\n154#5:254\n154#5:255\n154#5:256\n154#5:257\n154#5:258\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n130#1:222,4\n130#1:227,11\n130#1:252\n130#1:226\n130#1:238,14\n213#1:253\n214#1:254\n217#1:255\n218#1:256\n219#1:257\n220#1:258\n*E\n"})
public final class AlertDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9153a = Dp.m4389constructorimpl(280);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9154b = Dp.m4389constructorimpl(560);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9158f;

    /* JADX INFO: compiled from: AlertDialog.kt */
    @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,221:1\n74#2,6:222\n80#2:254\n84#2:297\n75#3:228\n76#3,11:230\n75#3:261\n76#3,11:263\n89#3:291\n89#3:296\n76#4:229\n76#4:262\n460#5,13:241\n460#5,13:274\n473#5,3:288\n473#5,3:293\n67#6,6:255\n73#6:287\n77#6:292\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n58#1:222,6\n58#1:254\n58#1:297\n58#1:228\n58#1:230,11\n109#1:261\n109#1:263,11\n109#1:291\n58#1:296\n58#1:229\n109#1:262\n58#1:241,13\n109#1:274,13\n109#1:288,3\n58#1:293,3\n109#1:255,6\n109#1:287\n109#1:292\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9159p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9160q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9161r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f9162s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9163t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f9164u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f9165w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9166x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, long j10, int i10, long j11, long j12, long j13, Function2<? super Composer, ? super Integer, Unit> function5) {
            super(2);
            this.f9159p0 = function2;
            this.f9160q0 = function3;
            this.f9161r0 = function4;
            this.f9162s0 = j10;
            this.f9163t0 = i10;
            this.f9164u0 = j11;
            this.v0 = j12;
            this.f9165w0 = j13;
            this.f9166x0 = function5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2126308228, iIntValue, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:56)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(companion, AlertDialogKt.f9155c);
                composer2.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(76440732);
                Function2<Composer, Integer, Unit> function2 = this.f9159p0;
                int i10 = this.f9163t0;
                if (function2 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f9162s0))}, ComposableLambdaKt.composableLambda(composer2, 934657765, true, new androidx.compose.material3.a(columnScopeInstance, function2, i10)), composer2, 56);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(76441127);
                Function2<Composer, Integer, Unit> function3 = this.f9160q0;
                if (function3 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f9164u0))}, ComposableLambdaKt.composableLambda(composer2, 1845262876, true, new androidx.compose.material3.c(columnScopeInstance, function2, function3, i10)), composer2, 56);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(76442077);
                Function2<Composer, Integer, Unit> function4 = this.f9161r0;
                if (function4 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.v0))}, ComposableLambdaKt.composableLambda(composer2, 613970333, true, new e(columnScopeInstance, function4, i10)), composer2, 56);
                }
                composer2.endReplaceableGroup();
                Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f9165w0))}, ComposableLambdaKt.composableLambda(composer2, -433542216, true, new f(i10, this.f9166x0)), composer2, 56);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ long E0;
        public final /* synthetic */ long F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;
        public final /* synthetic */ int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9167p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9168q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9169r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9170s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9171t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f9172u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f9173w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f9174x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f9175y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Shape shape, long j10, float f6, long j11, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f9167p0 = function2;
            this.f9168q0 = modifier;
            this.f9169r0 = function3;
            this.f9170s0 = function4;
            this.f9171t0 = function5;
            this.f9172u0 = shape;
            this.v0 = j10;
            this.f9173w0 = f6;
            this.f9174x0 = j11;
            this.f9175y0 = j12;
            this.E0 = j13;
            this.F0 = j14;
            this.G0 = i10;
            this.H0 = i11;
            this.I0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AlertDialogKt.m905AlertDialogContent4hvqGtA(this.f9167p0, this.f9168q0, this.f9169r0, this.f9170s0, this.f9171t0, this.f9172u0, this.v0, this.f9173w0, this.f9174x0, this.f9175y0, this.E0, this.F0, composer, RecomposeScopeImplKt.updateChangedFlags(this.G0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.H0), this.I0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class c implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f9176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9177b;

        /* JADX INFO: compiled from: AlertDialog.kt */
        @SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1864#2,2:222\n1864#2,3:224\n1866#2:227\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n*L\n191#1:222,2\n202#1:224,3\n191#1:227\n*E\n"})
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List<List<Placeable>> f9178p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f9179q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f9180r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ int f9181s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ List<Integer> f9182t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList arrayList, MeasureScope measureScope, float f6, int i10, ArrayList arrayList2) {
                super(1);
                this.f9178p0 = arrayList;
                this.f9179q0 = measureScope;
                this.f9180r0 = f6;
                this.f9181s0 = i10;
                this.f9182t0 = arrayList2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                MeasureScope measureScope;
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<List<Placeable>> list = this.f9178p0;
                int i10 = this.f9181s0;
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    List list2 = (List) obj;
                    int size = list2.size();
                    int[] iArr = new int[size];
                    int i13 = 0;
                    while (true) {
                        measureScope = this.f9179q0;
                        if (i13 >= size) {
                            break;
                        }
                        iArr[i13] = ((Placeable) list2.get(i13)).getWidth() + (i13 < CollectionsKt__CollectionsKt.getLastIndex(list2) ? measureScope.mo413roundToPx0680j_4(this.f9180r0) : 0);
                        i13++;
                    }
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    int[] iArr2 = new int[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        iArr2[i14] = 0;
                    }
                    end.arrange(measureScope, i10, iArr, measureScope.getLayoutDirection(), iArr2);
                    int i15 = 0;
                    for (Object obj2 : list2) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        Placeable.PlacementScope.place$default(layout, (Placeable) obj2, iArr2[i15], this.f9182t0.get(i11).intValue(), 0.0f, 4, null);
                        i15 = i16;
                    }
                    i11 = i12;
                }
                return Unit.INSTANCE;
            }
        }

        public c(float f6, float f10) {
            this.f9176a = f6;
            this.f9177b = f10;
        }

        public static final void a(ArrayList arrayList, Ref.IntRef intRef, MeasureScope measureScope, float f6, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef2, ArrayList arrayList4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            if (!arrayList.isEmpty()) {
                intRef.element = measureScope.mo413roundToPx0680j_4(f6) + intRef.element;
            }
            arrayList.add(CollectionsKt___CollectionsKt.toList(arrayList2));
            arrayList3.add(Integer.valueOf(intRef2.element));
            arrayList4.add(Integer.valueOf(intRef.element));
            intRef.element += intRef2.element;
            intRef3.element = Math.max(intRef3.element, intRef4.element);
            arrayList2.clear();
            intRef4.element = 0;
            intRef2.element = 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0068  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            c cVar;
            Ref.IntRef intRef;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            ArrayList arrayList4 = new ArrayList();
            Ref.IntRef intRef4 = new Ref.IntRef();
            Ref.IntRef intRef5 = new Ref.IntRef();
            Iterator<? extends Measurable> it = measurables.iterator();
            while (it.hasNext()) {
                Placeable placeableMo3575measureBRTryo0 = it.next().mo3575measureBRTryo0(j10);
                boolean zIsEmpty = arrayList4.isEmpty();
                float f6 = this.f9176a;
                if (zIsEmpty) {
                    intRef = intRef4;
                } else {
                    if (placeableMo3575measureBRTryo0.getWidth() + Layout.mo413roundToPx0680j_4(f6) + intRef4.element <= Constraints.m4357getMaxWidthimpl(j10)) {
                        intRef = intRef4;
                    } else {
                        intRef = intRef4;
                        a(arrayList, intRef3, Layout, this.f9177b, arrayList4, arrayList2, intRef5, arrayList3, intRef2, intRef);
                    }
                }
                Ref.IntRef intRef6 = intRef;
                if (!arrayList4.isEmpty()) {
                    intRef6.element = Layout.mo413roundToPx0680j_4(f6) + intRef6.element;
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(placeableMo3575measureBRTryo0);
                intRef6.element = placeableMo3575measureBRTryo0.getWidth() + intRef6.element;
                intRef5 = intRef5;
                intRef5.element = Math.max(intRef5.element, placeableMo3575measureBRTryo0.getHeight());
                arrayList4 = arrayList5;
                intRef4 = intRef6;
                arrayList = arrayList;
                intRef3 = intRef3;
            }
            ArrayList arrayList6 = arrayList4;
            Ref.IntRef intRef7 = intRef3;
            ArrayList arrayList7 = arrayList;
            Ref.IntRef intRef8 = intRef4;
            if (!arrayList6.isEmpty()) {
                cVar = this;
                a(arrayList7, intRef7, Layout, cVar.f9177b, arrayList6, arrayList2, intRef5, arrayList3, intRef2, intRef8);
            } else {
                cVar = this;
            }
            int iMax = Math.max(intRef2.element, Constraints.m4359getMinWidthimpl(j10));
            return MeasureScope.CC.q(Layout, iMax, Math.max(intRef7.element, Constraints.m4358getMinHeightimpl(j10)), null, new a(arrayList7, Layout, cVar.f9176a, iMax, arrayList3), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: AlertDialog.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f9183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f9184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9185r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9186s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(float f6, float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f9183p0 = f6;
            this.f9184q0 = f10;
            this.f9185r0 = function2;
            this.f9186s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f9186s0 | 1);
            float f6 = this.f9184q0;
            Function2<Composer, Integer, Unit> function2 = this.f9185r0;
            AlertDialogKt.m906AlertDialogFlowRowixp7dh8(this.f9183p0, f6, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 24;
        f9155c = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(f6));
        float f10 = 16;
        f9156d = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m4389constructorimpl(f10), 7, null);
        f9157e = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m4389constructorimpl(f10), 7, null);
        f9158f = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m4389constructorimpl(f6), 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0218  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    public static final void m905AlertDialogContent4hvqGtA(@NotNull Function2<? super Composer, ? super Integer, Unit> buttons, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @NotNull Shape shape, long j10, float f6, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Modifier modifier3;
        Composer composer2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Composer composerStartRestartGroup = composer.startRestartGroup(1522575799);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changedInstance(buttons) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(shape)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        i19 = i13 | 1572864;
                    } else {
                        i18 = i13;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(j10)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i19 = i18 | i20;
                        } else {
                            i19 = i18;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changed(f6)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i19 |= i21;
                        }
                        if ((i12 & 256) != 0) {
                            i19 |= 100663296;
                        } else if ((234881024 & i10) == 0) {
                            if (composerStartRestartGroup.changed(j11)) {
                                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i22 = 33554432;
                            }
                            i19 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i19 |= 805306368;
                        } else if ((1879048192 & i10) == 0) {
                            if (composerStartRestartGroup.changed(j12)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i19 |= i23;
                        }
                        i24 = i19;
                        if ((i12 & 1024) != 0) {
                            i25 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (composerStartRestartGroup.changed(j13)) {
                                i26 = 4;
                            } else {
                                i26 = 2;
                            }
                            i25 = i11 | i26;
                        } else {
                            i25 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            i25 |= 48;
                        } else if ((i11 & 112) == 0) {
                            if (composerStartRestartGroup.changed(j14)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i25 |= i27;
                        }
                        if ((1533916891 & i24) != 306783378 && (i25 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            if (i28 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                            }
                            composer2 = composerStartRestartGroup;
                            int i29 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i29 & 112) | (i29 & 896) | ((i24 >> 9) & 57344), 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
                    }
                    i19 |= 12582912;
                    if ((i12 & 256) != 0) {
                        i19 |= 100663296;
                    } else if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j11)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i19 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i19 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j12)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i19 |= i23;
                    }
                    i24 = i19;
                    if ((i12 & 1024) != 0) {
                        i25 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changed(j13)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i25 = i11 | i26;
                    } else {
                        i25 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i25 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (composerStartRestartGroup.changed(j14)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i25 |= i27;
                    }
                    if ((1533916891 & i24) != 306783378) {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i210 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i210 & 112) | (i210 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i211 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i211 & 112) | (i211 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i13 |= i17;
                if ((i12 & 64) != 0) {
                    i19 = i13 | 1572864;
                } else {
                    i18 = i13;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(j10)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i19 = i18 | i20;
                    } else {
                        i19 = i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i19 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        i19 |= 100663296;
                    } else if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j11)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i19 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i19 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j12)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i19 |= i23;
                    }
                    i24 = i19;
                    if ((i12 & 1024) != 0) {
                        i25 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changed(j13)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i25 = i11 | i26;
                    } else {
                        i25 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i25 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (composerStartRestartGroup.changed(j14)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i25 |= i27;
                    }
                    if ((1533916891 & i24) != 306783378) {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i212 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i212 & 112) | (i212 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i213 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i213 & 112) | (i213 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
                }
                i19 |= 12582912;
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i214 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i214 & 112) | (i214 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i215 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i215 & 112) | (i215 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    i19 = i13 | 1572864;
                } else {
                    i18 = i13;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(j10)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i19 = i18 | i20;
                    } else {
                        i19 = i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i19 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        i19 |= 100663296;
                    } else if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j11)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i19 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i19 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j12)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i19 |= i23;
                    }
                    i24 = i19;
                    if ((i12 & 1024) != 0) {
                        i25 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changed(j13)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i25 = i11 | i26;
                    } else {
                        i25 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i25 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (composerStartRestartGroup.changed(j14)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i25 |= i27;
                    }
                    if ((1533916891 & i24) != 306783378) {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i216 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i216 & 112) | (i216 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i217 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i217 & 112) | (i217 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
                }
                i19 |= 12582912;
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i218 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i218 & 112) | (i218 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i219 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i219 & 112) | (i219 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i17;
            if ((i12 & 64) != 0) {
                i19 = i13 | 1572864;
            } else {
                i18 = i13;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(j10)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i19 = i18 | i20;
                } else {
                    i19 = i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i19 |= i21;
                }
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2110 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2110 & 112) | (i2110 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2111 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2111 & 112) | (i2111 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i19 |= 12582912;
            if ((i12 & 256) != 0) {
                i19 |= 100663296;
            } else if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(j11)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i19 |= i22;
            }
            if ((i12 & 512) != 0) {
                i19 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changed(j12)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i19 |= i23;
            }
            i24 = i19;
            if ((i12 & 1024) != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(j13)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changed(j14)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((1533916891 & i24) != 306783378) {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i2112 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2112 & 112) | (i2112 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i2113 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2113 & 112) | (i2113 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i12 & 16) != 0) {
            if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    i19 = i13 | 1572864;
                } else {
                    i18 = i13;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(j10)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i19 = i18 | i20;
                    } else {
                        i19 = i18;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i19 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        i19 |= 100663296;
                    } else if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j11)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i19 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i19 |= 805306368;
                    } else if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j12)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i19 |= i23;
                    }
                    i24 = i19;
                    if ((i12 & 1024) != 0) {
                        i25 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changed(j13)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i25 = i11 | i26;
                    } else {
                        i25 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i25 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (composerStartRestartGroup.changed(j14)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i25 |= i27;
                    }
                    if ((1533916891 & i24) != 306783378) {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i2114 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2114 & 112) | (i2114 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } else {
                        if (i28 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                        }
                        composer2 = composerStartRestartGroup;
                        int i2115 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2115 & 112) | (i2115 & 896) | ((i24 >> 9) & 57344), 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
                }
                i19 |= 12582912;
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2116 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2116 & 112) | (i2116 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2117 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2117 & 112) | (i2117 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i17;
            if ((i12 & 64) != 0) {
                i19 = i13 | 1572864;
            } else {
                i18 = i13;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(j10)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i19 = i18 | i20;
                } else {
                    i19 = i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i19 |= i21;
                }
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2118 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2118 & 112) | (i2118 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i2119 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i2119 & 112) | (i2119 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i19 |= 12582912;
            if ((i12 & 256) != 0) {
                i19 |= 100663296;
            } else if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(j11)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i19 |= i22;
            }
            if ((i12 & 512) != 0) {
                i19 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changed(j12)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i19 |= i23;
            }
            i24 = i19;
            if ((i12 & 1024) != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(j13)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changed(j14)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((1533916891 & i24) != 306783378) {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21110 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21110 & 112) | (i21110 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21111 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21111 & 112) | (i21111 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
        }
        i13 |= 24576;
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((i12 & 64) != 0) {
                i19 = i13 | 1572864;
            } else {
                i18 = i13;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(j10)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i19 = i18 | i20;
                } else {
                    i19 = i18;
                }
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i19 |= i21;
                }
                if ((i12 & 256) != 0) {
                    i19 |= 100663296;
                } else if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i19 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i19 |= 805306368;
                } else if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j12)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i19 |= i23;
                }
                i24 = i19;
                if ((i12 & 1024) != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j13)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changed(j14)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((1533916891 & i24) != 306783378) {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i21112 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21112 & 112) | (i21112 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    if (i28 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                    }
                    composer2 = composerStartRestartGroup;
                    int i21113 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21113 & 112) | (i21113 & 896) | ((i24 >> 9) & 57344), 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
            }
            i19 |= 12582912;
            if ((i12 & 256) != 0) {
                i19 |= 100663296;
            } else if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(j11)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i19 |= i22;
            }
            if ((i12 & 512) != 0) {
                i19 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changed(j12)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i19 |= i23;
            }
            i24 = i19;
            if ((i12 & 1024) != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(j13)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changed(j14)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((1533916891 & i24) != 306783378) {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21114 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21114 & 112) | (i21114 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21115 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21115 & 112) | (i21115 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i13 |= i17;
        if ((i12 & 64) != 0) {
            i19 = i13 | 1572864;
        } else {
            i18 = i13;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(j10)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i19 = i18 | i20;
            } else {
                i19 = i18;
            }
        }
        if ((i12 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i19 |= i21;
            }
            if ((i12 & 256) != 0) {
                i19 |= 100663296;
            } else if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(j11)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i19 |= i22;
            }
            if ((i12 & 512) != 0) {
                i19 |= 805306368;
            } else if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changed(j12)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i19 |= i23;
            }
            i24 = i19;
            if ((i12 & 1024) != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changed(j13)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changed(j14)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((1533916891 & i24) != 306783378) {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21116 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21116 & 112) | (i21116 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i28 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
                }
                composer2 = composerStartRestartGroup;
                int i21117 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21117 & 112) | (i21117 & 896) | ((i24 >> 9) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
        }
        i19 |= 12582912;
        if ((i12 & 256) != 0) {
            i19 |= 100663296;
        } else if ((234881024 & i10) == 0) {
            if (composerStartRestartGroup.changed(j11)) {
                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i22 = 33554432;
            }
            i19 |= i22;
        }
        if ((i12 & 512) != 0) {
            i19 |= 805306368;
        } else if ((1879048192 & i10) == 0) {
            if (composerStartRestartGroup.changed(j12)) {
                i23 = PKIFailureInfo.duplicateCertReq;
            } else {
                i23 = 268435456;
            }
            i19 |= i23;
        }
        i24 = i19;
        if ((i12 & 1024) != 0) {
            i25 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changed(j13)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i11 | i26;
        } else {
            i25 = i11;
        }
        if ((i12 & 2048) != 0) {
            i25 |= 48;
        } else if ((i11 & 112) == 0) {
            if (composerStartRestartGroup.changed(j14)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i25 |= i27;
        }
        if ((1533916891 & i24) != 306783378) {
            if (i28 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
            }
            composer2 = composerStartRestartGroup;
            int i21118 = i24 >> 12;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21118 & 112) | (i21118 & 896) | ((i24 >> 9) & 57344), 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i28 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522575799, i24, i25, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)");
            }
            composer2 = composerStartRestartGroup;
            int i21119 = i24 >> 12;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape, j10, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2126308228, true, new a(function2, function3, function4, j12, i24, j13, j14, j11, buttons)), composer2, ((i24 >> 3) & 14) | 12582912 | (i21119 & 112) | (i21119 & 896) | ((i24 >> 9) & 57344), 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(buttons, modifier4, function2, function3, function4, shape, j10, f6, j11, j12, j13, j14, i10, i11, i12));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m906AlertDialogFlowRowixp7dh8(float f6, float f10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:124)");
            }
            c cVar = new c(f6, f10);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            int i12 = ((((i11 >> 6) & 14) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, cVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion2.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            ai.a.j((i12 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, f10, content, i10));
    }

    public static final float getDialogMaxWidth() {
        return f9154b;
    }

    public static final float getDialogMinWidth() {
        return f9153a;
    }
}
