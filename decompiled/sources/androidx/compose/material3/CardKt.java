package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001au\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,772:1\n25#2:773\n25#2:780\n25#2:787\n1114#3,6:774\n1114#3,6:781\n1114#3,6:788\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n140#1:773\n238#1:780\n335#1:787\n140#1:774,6\n238#1:781,6\n335#1:788,6\n*E\n"})
public final class CardKt {

    /* JADX INFO: compiled from: Card.kt */
    @SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,772:1\n73#2,7:773\n80#2:806\n84#2:811\n75#3:780\n76#3,11:782\n89#3:810\n76#4:781\n460#5,13:793\n473#5,3:807\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n*L\n93#1:773,7\n93#1:806\n93#1:811\n93#1:780\n93#1:782,11\n93#1:810\n93#1:781\n93#1:793,13\n93#1:807,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9565p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f9566q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f9565p0 = function3;
            this.f9566q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(664103990, iIntValue, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:91)");
                }
                int i10 = (this.f9566q0 >> 6) & 7168;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j((i12 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                this.f9565p0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

    /* JADX INFO: compiled from: Card.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9567p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f9568q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9569r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9570s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f9571t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9572u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9573w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9567p0 = modifier;
            this.f9568q0 = shape;
            this.f9569r0 = cardColors;
            this.f9570s0 = cardElevation;
            this.f9571t0 = borderStroke;
            this.f9572u0 = function3;
            this.v0 = i10;
            this.f9573w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.Card(this.f9567p0, this.f9568q0, this.f9569r0, this.f9570s0, this.f9571t0, this.f9572u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9573w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Card.kt */
    @SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,772:1\n73#2,7:773\n80#2:806\n84#2:811\n75#3:780\n76#3,11:782\n89#3:810\n76#4:781\n460#5,13:793\n473#5,3:807\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$4\n*L\n155#1:773,7\n155#1:806\n155#1:811\n155#1:780\n155#1:782,11\n155#1:810\n155#1:781\n155#1:793,13\n155#1:807,3\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9574p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f9575q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f9574p0 = function3;
            this.f9575q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(776921067, iIntValue, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:153)");
                }
                int i10 = (this.f9575q0 >> 15) & 7168;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j((i12 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                this.f9574p0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

    /* JADX INFO: compiled from: Card.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9576p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9577q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f9578r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f9579s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9580t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9581u0;
        public final /* synthetic */ BorderStroke v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f9582w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9583x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9584y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9576p0 = function0;
            this.f9577q0 = modifier;
            this.f9578r0 = z10;
            this.f9579s0 = shape;
            this.f9580t0 = cardColors;
            this.f9581u0 = cardElevation;
            this.v0 = borderStroke;
            this.f9582w0 = mutableInteractionSource;
            this.f9583x0 = function3;
            this.f9584y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.Card(this.f9576p0, this.f9577q0, this.f9578r0, this.f9579s0, this.f9580t0, this.f9581u0, this.v0, this.f9582w0, this.f9583x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9584y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Card.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9585p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f9586q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9587r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9588s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9589t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9590u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9585p0 = modifier;
            this.f9586q0 = shape;
            this.f9587r0 = cardColors;
            this.f9588s0 = cardElevation;
            this.f9589t0 = function3;
            this.f9590u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.ElevatedCard(this.f9585p0, this.f9586q0, this.f9587r0, this.f9588s0, this.f9589t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9590u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Card.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9591p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9592q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f9593r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f9594s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9595t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9596u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9597w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f9598x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9599y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9591p0 = function0;
            this.f9592q0 = modifier;
            this.f9593r0 = z10;
            this.f9594s0 = shape;
            this.f9595t0 = cardColors;
            this.f9596u0 = cardElevation;
            this.v0 = mutableInteractionSource;
            this.f9597w0 = function3;
            this.f9598x0 = i10;
            this.f9599y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.ElevatedCard(this.f9591p0, this.f9592q0, this.f9593r0, this.f9594s0, this.f9595t0, this.f9596u0, this.v0, this.f9597w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9598x0 | 1), this.f9599y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Card.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9600p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f9601q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9602r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9603s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f9604t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9605u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9606w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9600p0 = modifier;
            this.f9601q0 = shape;
            this.f9602r0 = cardColors;
            this.f9603s0 = cardElevation;
            this.f9604t0 = borderStroke;
            this.f9605u0 = function3;
            this.v0 = i10;
            this.f9606w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.OutlinedCard(this.f9600p0, this.f9601q0, this.f9602r0, this.f9603s0, this.f9604t0, this.f9605u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9606w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Card.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9607p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9608q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f9609r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f9610s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CardColors f9611t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CardElevation f9612u0;
        public final /* synthetic */ BorderStroke v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f9613w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9614x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9615y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9607p0 = function0;
            this.f9608q0 = modifier;
            this.f9609r0 = z10;
            this.f9610s0 = shape;
            this.f9611t0 = cardColors;
            this.f9612u0 = cardElevation;
            this.v0 = borderStroke;
            this.f9613w0 = mutableInteractionSource;
            this.f9614x0 = function3;
            this.f9615y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CardKt.OutlinedCard(this.f9607p0, this.f9608q0, this.f9609r0, this.f9610s0, this.f9611t0, this.f9612u0, this.v0, this.f9613w0, this.f9614x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9615y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:102:0x0158  */
    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0140  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card(@Nullable Modifier modifier, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @Nullable BorderStroke borderStroke, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        int i13;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColorsM940cardColorsro_MJ88;
        CardElevation cardElevationM941cardElevationaqJV_2Y;
        BorderStroke borderStroke3;
        int i14;
        CardElevation cardElevation3;
        BorderStroke borderStroke4;
        CardElevation cardElevation4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1179621553);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shape2 = shape;
                int i16 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i12 |= i16;
            } else {
                shape2 = shape;
            }
            i12 |= i16;
        } else {
            shape2 = shape;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                cardColors2 = cardColors;
                int i17 = composerStartRestartGroup.changed(cardColors2) ? 256 : 128;
                i12 |= i17;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i17;
        } else {
            cardColors2 = cardColors;
        }
        if ((i10 & 7168) == 0) {
            cardElevation2 = cardElevation;
            i12 |= ((i11 & 8) == 0 && composerStartRestartGroup.changed(cardElevation2)) ? 2048 : 1024;
        } else {
            cardElevation2 = cardElevation;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((57344 & i10) == 0) {
                i12 |= composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) == 0) {
            if ((458752 & i10) == 0) {
                i13 = composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -113;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 4) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -897;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 8) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation;
                    }
                    if (i18 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    CardElevation cardElevation5 = cardElevationM941cardElevationaqJV_2Y;
                    i14 = i12;
                    cardElevation3 = cardElevation5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    modifier3 = modifier2;
                    shape3 = shape2;
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                    borderStroke3 = borderStroke2;
                    i14 = i12;
                    cardElevation3 = cardElevation2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
                }
                int i19 = i14 >> 3;
                int i20 = (i19 & 112) | 6;
                int i21 = (i19 & 896) | 54;
                CardElevation cardElevation6 = cardElevation3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape3, cardColorsM940cardColorsro_MJ88.containerColor$material3_release(true, composerStartRestartGroup, i20).getValue().m2518unboximpl(), cardColorsM940cardColorsro_MJ88.contentColor$material3_release(true, composerStartRestartGroup, i20).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(true, null, composerStartRestartGroup, i21).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(true, null, composerStartRestartGroup, i21).getValue().m4403unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 664103990, true, new a(content, i14)), composerStartRestartGroup, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cardColors2 = cardColorsM940cardColorsro_MJ88;
                borderStroke4 = borderStroke3;
                cardElevation4 = cardElevation6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                borderStroke4 = borderStroke2;
                cardElevation4 = cardElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, shape3, cardColors2, cardElevation4, borderStroke4, content, i10, i11));
        }
        i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation7 = cardElevationM941cardElevationaqJV_2Y;
                i14 = i12;
                cardElevation3 = cardElevation7;
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation8 = cardElevationM941cardElevationaqJV_2Y;
                i14 = i12;
                cardElevation3 = cardElevation8;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
            }
            int i110 = i14 >> 3;
            int i22 = (i110 & 112) | 6;
            int i23 = (i110 & 896) | 54;
            CardElevation cardElevation9 = cardElevation3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape3, cardColorsM940cardColorsro_MJ88.containerColor$material3_release(true, composerStartRestartGroup, i22).getValue().m2518unboximpl(), cardColorsM940cardColorsro_MJ88.contentColor$material3_release(true, composerStartRestartGroup, i22).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(true, null, composerStartRestartGroup, i23).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(true, null, composerStartRestartGroup, i23).getValue().m4403unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 664103990, true, new a(content, i14)), composerStartRestartGroup, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors2 = cardColorsM940cardColorsro_MJ88;
            borderStroke4 = borderStroke3;
            cardElevation4 = cardElevation9;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation10 = cardElevationM941cardElevationaqJV_2Y;
                i14 = i12;
                cardElevation3 = cardElevation10;
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation;
                }
                if (i18 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                CardElevation cardElevation11 = cardElevationM941cardElevationaqJV_2Y;
                i14 = i12;
                cardElevation3 = cardElevation11;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i14, -1, "androidx.compose.material3.Card (Card.kt:75)");
            }
            int i111 = i14 >> 3;
            int i24 = (i111 & 112) | 6;
            int i25 = (i111 & 896) | 54;
            CardElevation cardElevation12 = cardElevation3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, shape3, cardColorsM940cardColorsro_MJ88.containerColor$material3_release(true, composerStartRestartGroup, i24).getValue().m2518unboximpl(), cardColorsM940cardColorsro_MJ88.contentColor$material3_release(true, composerStartRestartGroup, i24).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(true, null, composerStartRestartGroup, i25).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(true, null, composerStartRestartGroup, i25).getValue().m4403unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 664103990, true, new a(content, i14)), composerStartRestartGroup, 12582912 | (i14 & 14) | (i14 & 112) | ((i14 << 6) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors2 = cardColorsM940cardColorsro_MJ88;
            borderStroke4 = borderStroke3;
            cardElevation4 = cardElevation12;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, shape3, cardColors2, cardElevation4, borderStroke4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ElevatedCard(@Nullable Modifier modifier, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Shape elevatedShape;
        CardColors cardColorsM942elevatedCardColorsro_MJ88;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevationM943elevatedCardElevationaqJV_2Y;
        Modifier modifier4;
        Shape shape4;
        CardColors cardColors4;
        CardElevation cardElevation3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(895940201);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shape2 = shape;
                int i14 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i12 |= i14;
            } else {
                shape2 = shape;
            }
            i12 |= i14;
        } else {
            shape2 = shape;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                cardColors2 = cardColors;
                int i15 = composerStartRestartGroup.changed(cardColors2) ? 256 : 128;
                i12 |= i15;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i15;
        } else {
            cardColors2 = cardColors;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i16 = composerStartRestartGroup.changed(cardElevation2) ? 2048 : 1024;
                i12 |= i16;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i16;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            shape4 = shape2;
            cardColors4 = cardColors2;
            cardElevation3 = cardElevation2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    elevatedShape = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    modifier3 = modifier5;
                    shape3 = elevatedShape;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                } else {
                    modifier3 = modifier5;
                    shape3 = elevatedShape;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(895940201, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
                }
                Card(modifier3, shape3, cardColors3, cardElevationM943elevatedCardElevationaqJV_2Y, null, content, composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevationM943elevatedCardElevationaqJV_2Y;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
            }
            cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(895940201, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
            }
            Card(modifier3, shape3, cardColors3, cardElevationM943elevatedCardElevationaqJV_2Y, null, content, composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape4 = shape3;
            cardColors4 = cardColors3;
            cardElevation3 = cardElevationM943elevatedCardElevationaqJV_2Y;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(modifier4, shape4, cardColors4, cardElevation3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x016a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0179  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedCard(@Nullable Modifier modifier, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @Nullable BorderStroke borderStroke, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        int i13;
        Modifier modifier3;
        Shape outlinedShape;
        CardColors cardColorsM944outlinedCardColorsro_MJ88;
        CardElevation cardElevationM945outlinedCardElevationaqJV_2Y;
        BorderStroke borderStrokeOutlinedCardBorder;
        Modifier modifier4;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        Modifier modifier5;
        Shape shape4;
        CardColors cardColors4;
        CardElevation cardElevation4;
        BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(740336179);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shape2 = shape;
                int i15 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i12 |= i15;
            } else {
                shape2 = shape;
            }
            i12 |= i15;
        } else {
            shape2 = shape;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                cardColors2 = cardColors;
                int i16 = composerStartRestartGroup.changed(cardColors2) ? 256 : 128;
                i12 |= i16;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i16;
        } else {
            cardColors2 = cardColors;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i17 = composerStartRestartGroup.changed(cardElevation2) ? 2048 : 1024;
                i12 |= i17;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i17;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i10 & 57344) == 0) {
            borderStroke2 = borderStroke;
            i12 |= ((i11 & 16) == 0 && composerStartRestartGroup.changed(borderStroke2)) ? 16384 : 8192;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i11 & 32) == 0) {
            if ((i10 & 458752) == 0) {
                i13 = composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        i12 &= -113;
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 4) != 0) {
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -897;
                    } else {
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 8) != 0) {
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation2;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        modifier4 = modifier3;
                        shape3 = outlinedShape;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                        modifier4 = modifier3;
                        shape3 = outlinedShape;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    modifier4 = modifier2;
                    shape3 = shape2;
                    cardColors3 = cardColors2;
                    borderStrokeOutlinedCardBorder = borderStroke2;
                    cardElevation3 = cardElevation2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
                }
                Card(modifier4, shape3, cardColors3, cardElevation3, borderStrokeOutlinedCardBorder, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation4 = cardElevation3;
                borderStroke3 = borderStrokeOutlinedCardBorder;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                shape4 = shape2;
                cardColors4 = cardColors2;
                cardElevation4 = cardElevation2;
                borderStroke3 = borderStroke2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(modifier5, shape4, cardColors4, cardElevation4, borderStroke3, content, i10, i11));
        }
        i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                }
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
            }
            Card(modifier4, shape3, cardColors3, cardElevation3, borderStrokeOutlinedCardBorder, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            shape4 = shape3;
            cardColors4 = cardColors3;
            cardElevation4 = cardElevation3;
            borderStroke3 = borderStrokeOutlinedCardBorder;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                }
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    i12 &= -113;
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 4) != 0) {
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -897;
                } else {
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 8) != 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -7169;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation2;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(false, composerStartRestartGroup, 48, 1);
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                    modifier4 = modifier3;
                    shape3 = outlinedShape;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
            }
            Card(modifier4, shape3, cardColors3, cardElevation3, borderStrokeOutlinedCardBorder, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            shape4 = shape3;
            cardColors4 = cardColors3;
            cardElevation4 = cardElevation3;
            borderStroke3 = borderStrokeOutlinedCardBorder;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(modifier5, shape4, cardColors4, cardElevation4, borderStroke3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0151  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01de  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:144:0x023b  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ElevatedCard(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevationM943elevatedCardElevationaqJV_2Y;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        Modifier modifier3;
        boolean z12;
        Shape elevatedShape;
        int i18;
        CardColors cardColorsM942elevatedCardColorsro_MJ88;
        MutableInteractionSource mutableInteractionSource3;
        CardElevation cardElevation2;
        CardColors cardColors3;
        Modifier modifier4;
        Object objRememberedValue;
        Modifier modifier5;
        CardColors cardColors4;
        CardElevation cardElevation3;
        MutableInteractionSource mutableInteractionSource4;
        boolean z13;
        Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850977784);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
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
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        shape2 = shape;
                        int i20 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i21 = composerStartRestartGroup.changed(cardColors2) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i12 |= i21;
                } else {
                    cardColors2 = cardColors;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                        int i22 = composerStartRestartGroup.changed(cardElevationM943elevatedCardElevationaqJV_2Y) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                    }
                    i12 |= i22;
                } else {
                    cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                    }
                    if ((23967451 & i12) != 4793490 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        z13 = z11;
                        shape3 = shape2;
                        cardColors4 = cardColors2;
                        cardElevation3 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                            } else {
                                elevatedShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                i18 = i12 & (-57345);
                                cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                i18 = i12;
                                cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                            }
                            if ((i11 & 32) != 0) {
                                cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                i12 = i18 & (-458753);
                            } else {
                                i12 = i18;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                            cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            modifier4 = modifier2;
                            z12 = z11;
                            elevatedShape = shape2;
                            cardColors3 = cardColors2;
                            cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                        }
                        int i23 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                        int i24 = i12 << 3;
                        Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i23 | (i24 & 29360128) | (i24 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        cardColors4 = cardColors3;
                        cardElevation3 = cardElevation2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z13 = z12;
                        shape3 = elevatedShape;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
                }
                i17 = 12582912;
                i12 |= i17;
                if ((23967451 & i12) != 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i25 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i26 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i25 | (i26 & 29360128) | (i26 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i27 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i28 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i27 | (i28 & 29360128) | (i28 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i21;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i21;
            } else {
                cardColors2 = cardColors;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevationM943elevatedCardElevationaqJV_2Y)) {
                    }
                    i12 |= i22;
                } else {
                    cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                }
                i12 |= i22;
            } else {
                cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) != 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i29 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i210 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i29 | (i210 & 29360128) | (i210 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i211 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i212 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i211 | (i212 & 29360128) | (i212 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i213 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i214 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i213 | (i214 & 29360128) | (i214 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i215 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i216 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i215 | (i216 & 29360128) | (i216 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i20;
                } else {
                    shape2 = shape;
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i21;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i21;
            } else {
                cardColors2 = cardColors;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevationM943elevatedCardElevationaqJV_2Y)) {
                    }
                    i12 |= i22;
                } else {
                    cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                }
                i12 |= i22;
            } else {
                cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if ((23967451 & i12) != 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i217 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i218 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i217 | (i218 & 29360128) | (i218 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                        } else {
                            elevatedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 = i18 & (-458753);
                        } else {
                            i12 = i18;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                    }
                    int i219 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                    int i2110 = i12 << 3;
                    Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i219 | (i2110 & 29360128) | (i2110 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z13 = z12;
                    shape3 = elevatedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
            }
            i17 = 12582912;
            i12 |= i17;
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2111 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i2112 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i2111 | (i2112 & 29360128) | (i2112 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2113 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i2114 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i2113 | (i2114 & 29360128) | (i2114 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i20;
            } else {
                shape2 = shape;
            }
            i12 |= i20;
        } else {
            shape2 = shape;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                cardColors2 = cardColors;
                if (composerStartRestartGroup.changed(cardColors2)) {
                }
                i12 |= i21;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i21;
        } else {
            cardColors2 = cardColors;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
                if (composerStartRestartGroup.changed(cardElevationM943elevatedCardElevationaqJV_2Y)) {
                }
                i12 |= i22;
            } else {
                cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
            }
            i12 |= i22;
        } else {
            cardElevationM943elevatedCardElevationaqJV_2Y = cardElevation;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
            }
            if ((23967451 & i12) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2115 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i2116 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i2115 | (i2116 & 29360128) | (i2116 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                    } else {
                        elevatedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 = i18 & (-458753);
                    } else {
                        i12 = i18;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                    modifier4 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                }
                int i2117 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
                int i2118 = i12 << 3;
                Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i2117 | (i2118 & 29360128) | (i2118 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                mutableInteractionSource4 = mutableInteractionSource3;
                z13 = z12;
                shape3 = elevatedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
        }
        i17 = 12582912;
        i12 |= i17;
        if ((23967451 & i12) != 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                } else {
                    elevatedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                modifier4 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                } else {
                    elevatedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                modifier4 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
            }
            int i2119 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
            int i21110 = i12 << 3;
            Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i2119 | (i21110 & 29360128) | (i21110 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            cardColors4 = cardColors3;
            cardElevation3 = cardElevation2;
            mutableInteractionSource4 = mutableInteractionSource3;
            z13 = z12;
            shape3 = elevatedShape;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                } else {
                    elevatedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                modifier4 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                } else {
                    elevatedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM942elevatedCardColorsro_MJ88 = CardDefaults.INSTANCE.m942elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM942elevatedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM943elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m943elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 = i18 & (-458753);
                } else {
                    i12 = i18;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM943elevatedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM942elevatedCardColorsro_MJ88;
                modifier4 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850977784, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
            }
            int i21111 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752);
            int i21112 = i12 << 3;
            Card(onClick, modifier4, z12, elevatedShape, cardColors3, cardElevation2, null, mutableInteractionSource3, content, composerStartRestartGroup, i21111 | (i21112 & 29360128) | (i21112 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            cardColors4 = cardColors3;
            cardElevation3 = cardElevation2;
            mutableInteractionSource4 = mutableInteractionSource3;
            z13 = z12;
            shape3 = elevatedShape;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier5, z13, shape3, cardColors4, cardElevation3, mutableInteractionSource4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0193  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0200  */
    /* JADX WARN: Code duplicated, block: B:146:0x0212  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:152:0x023b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0281  */
    /* JADX WARN: Code duplicated, block: B:160:0x0299  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedCard(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevationM945outlinedCardElevationaqJV_2Y;
        BorderStroke borderStroke2;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        Shape outlinedShape;
        int i18;
        CardColors cardColorsM944outlinedCardColorsro_MJ88;
        boolean z12;
        BorderStroke borderStrokeOutlinedCardBorder;
        MutableInteractionSource mutableInteractionSource2;
        CardElevation cardElevation2;
        CardColors cardColors3;
        Modifier modifier3;
        boolean z13;
        Object objRememberedValue;
        Modifier modifier4;
        boolean z14;
        CardColors cardColors4;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-727137250);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        shape2 = shape;
                        int i21 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i22 = composerStartRestartGroup.changed(cardColors2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i12 |= i22;
                } else {
                    cardColors2 = cardColors;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                        int i23 = composerStartRestartGroup.changed(cardElevationM945outlinedCardElevationaqJV_2Y) ? 131072 : 65536;
                        i12 |= i23;
                    } else {
                        cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                    }
                    i12 |= i23;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                }
                if ((i10 & 3670016) == 0) {
                    borderStroke2 = borderStroke;
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(borderStroke2)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i12 |= i19;
                } else {
                    borderStroke2 = borderStroke;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i17 = 33554432;
                        }
                    }
                    if ((191739611 & i12) != 38347922 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z14 = z11;
                        shape3 = shape2;
                        cardColors4 = cardColors2;
                        cardElevation3 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                            } else {
                                outlinedShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                i18 = i12 & (-57345);
                                cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                i18 = i12;
                                cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                            }
                            if ((i11 & 32) != 0) {
                                i18 &= -458753;
                                cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            }
                            if ((i11 & 64) != 0) {
                                borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                                i18 &= -3670017;
                            } else {
                                borderStrokeOutlinedCardBorder = borderStroke;
                            }
                            if (i15 != 0) {
                                z12 = z11;
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    z12 = z11;
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                z12 = z11;
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                z12 = z11;
                                z12 = z11;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                            cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                            i12 = i18;
                            modifier3 = modifier2;
                            z13 = z12;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            modifier3 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z13 = z11;
                            outlinedShape = shape2;
                            cardColors3 = cardColors2;
                            cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                            borderStrokeOutlinedCardBorder = borderStroke2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                        }
                        Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z14 = z13;
                        cardColors4 = cardColors3;
                        cardElevation3 = cardElevation2;
                        borderStroke3 = borderStrokeOutlinedCardBorder;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape3 = outlinedShape;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
                }
                i17 = 100663296;
                i12 |= i17;
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i22;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i22;
            } else {
                cardColors2 = cardColors;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevationM945outlinedCardElevationaqJV_2Y)) {
                    }
                    i12 |= i23;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                }
                i12 |= i23;
            } else {
                cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
            }
            if ((i10 & 3670016) == 0) {
                borderStroke2 = borderStroke;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                borderStroke2 = borderStroke;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i17 = 33554432;
                    }
                }
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
            }
            i17 = 100663296;
            i12 |= i17;
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i22;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i22;
            } else {
                cardColors2 = cardColors;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevationM945outlinedCardElevationaqJV_2Y)) {
                    }
                    i12 |= i23;
                } else {
                    cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                }
                i12 |= i23;
            } else {
                cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
            }
            if ((i10 & 3670016) == 0) {
                borderStroke2 = borderStroke;
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            } else {
                borderStroke2 = borderStroke;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i17 = 33554432;
                    }
                }
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            i18 = i12 & (-57345);
                            cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            i18 = i12;
                            cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            i18 &= -458753;
                            cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        }
                        if ((i11 & 64) != 0) {
                            borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                            i18 &= -3670017;
                        } else {
                            borderStrokeOutlinedCardBorder = borderStroke;
                        }
                        if (i15 != 0) {
                            z12 = z11;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                z12 = z11;
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z12 = z11;
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            z12 = z11;
                            z12 = z11;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                        cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                        i12 = i18;
                        modifier3 = modifier2;
                        z13 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                    }
                    Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z14 = z13;
                    cardColors4 = cardColors3;
                    cardElevation3 = cardElevation2;
                    borderStroke3 = borderStrokeOutlinedCardBorder;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = outlinedShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
            }
            i17 = 100663296;
            i12 |= i17;
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            i12 |= i21;
        } else {
            shape2 = shape;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                cardColors2 = cardColors;
                if (composerStartRestartGroup.changed(cardColors2)) {
                }
                i12 |= i22;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i22;
        } else {
            cardColors2 = cardColors;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
                if (composerStartRestartGroup.changed(cardElevationM945outlinedCardElevationaqJV_2Y)) {
                }
                i12 |= i23;
            } else {
                cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
            }
            i12 |= i23;
        } else {
            cardElevationM945outlinedCardElevationaqJV_2Y = cardElevation;
        }
        if ((i10 & 3670016) == 0) {
            borderStroke2 = borderStroke;
            if ((i11 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        } else {
            borderStroke2 = borderStroke;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
            }
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                    } else {
                        outlinedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        i18 = i12 & (-57345);
                        cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        i18 = i12;
                        cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        i18 &= -458753;
                        cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    }
                    if ((i11 & 64) != 0) {
                        borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                        i18 &= -3670017;
                    } else {
                        borderStrokeOutlinedCardBorder = borderStroke;
                    }
                    if (i15 != 0) {
                        z12 = z11;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z12 = z11;
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z12 = z11;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        z12 = z11;
                        z12 = z11;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                    cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                    i12 = i18;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                }
                Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z14 = z13;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStrokeOutlinedCardBorder;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = outlinedShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
        }
        i17 = 100663296;
        i12 |= i17;
        if ((191739611 & i12) != 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        z12 = z11;
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z12 = z11;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    z12 = z11;
                    z12 = z11;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                i12 = i18;
                modifier3 = modifier2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        z12 = z11;
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z12 = z11;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    z12 = z11;
                    z12 = z11;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                i12 = i18;
                modifier3 = modifier2;
                z13 = z12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
            }
            Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z14 = z13;
            cardColors4 = cardColors3;
            cardElevation3 = cardElevation2;
            borderStroke3 = borderStrokeOutlinedCardBorder;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape3 = outlinedShape;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        z12 = z11;
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z12 = z11;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    z12 = z11;
                    z12 = z11;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                i12 = i18;
                modifier3 = modifier2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                } else {
                    outlinedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    i18 = i12 & (-57345);
                    cardColorsM944outlinedCardColorsro_MJ88 = CardDefaults.INSTANCE.m944outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    i18 = i12;
                    cardColorsM944outlinedCardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    i18 &= -458753;
                    cardElevationM945outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m945outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                }
                if ((i11 & 64) != 0) {
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z12, composerStartRestartGroup, ((i18 >> 6) & 14) | 48, 0);
                    i18 &= -3670017;
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                }
                if (i15 != 0) {
                    z12 = z11;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        z12 = z11;
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z12 = z11;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    z12 = z11;
                    z12 = z11;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                cardElevation2 = cardElevationM945outlinedCardElevationaqJV_2Y;
                cardColors3 = cardColorsM944outlinedCardColorsro_MJ88;
                i12 = i18;
                modifier3 = modifier2;
                z13 = z12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727137250, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
            }
            Card(onClick, modifier3, z13, outlinedShape, cardColors3, cardElevation2, borderStrokeOutlinedCardBorder, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z14 = z13;
            cardColors4 = cardColors3;
            cardElevation3 = cardElevation2;
            borderStroke3 = borderStrokeOutlinedCardBorder;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape3 = outlinedShape;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, z14, shape3, cardColors4, cardElevation3, borderStroke3, mutableInteractionSource3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x0205  */
    /* JADX WARN: Code duplicated, block: B:148:0x021a  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, @Nullable CardColors cardColors, @Nullable CardElevation cardElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        int i15;
        BorderStroke borderStroke2;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        char c10;
        Shape shape3;
        CardColors cardColorsM940cardColorsro_MJ88;
        CardElevation cardElevationM941cardElevationaqJV_2Y;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i20;
        Shape shape4;
        BorderStroke borderStroke4;
        CardColors cardColors3;
        boolean z12;
        CardElevation cardElevation3;
        Object objRememberedValue;
        Composer composer2;
        Modifier modifier4;
        Shape shape5;
        BorderStroke borderStroke5;
        CardColors cardColors4;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        CardElevation cardElevation4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024281376);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        shape2 = shape;
                        int i22 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i12 |= i22;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i23 = composerStartRestartGroup.changed(cardColors2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i12 |= i23;
                } else {
                    cardColors2 = cardColors;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        int i24 = composerStartRestartGroup.changed(cardElevation2) ? 131072 : 65536;
                        i12 |= i24;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) != 38347922 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        z13 = z11;
                        shape5 = shape2;
                        cardColors4 = cardColors2;
                        cardElevation4 = cardElevation2;
                        borderStroke5 = borderStroke2;
                        modifier4 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            modifier3 = modifier;
                            borderStroke4 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape4 = shape2;
                            cardColors3 = cardColors2;
                            cardElevation3 = cardElevation2;
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                c10 = 6;
                                shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i12 &= -7169;
                            } else {
                                c10 = 6;
                                shape3 = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                i12 &= -57345;
                            } else {
                                cardColorsM940cardColorsro_MJ88 = cardColors2;
                            }
                            if ((i11 & 32) != 0) {
                                cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                i12 &= -458753;
                            } else {
                                cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                            }
                            if (i15 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier3 = modifier2;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                cardColors3 = cardColorsM940cardColorsro_MJ88;
                                cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier3 = modifier2;
                                i20 = i12;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                cardColors3 = cardColorsM940cardColorsro_MJ88;
                                z12 = z11;
                                cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                            }
                            int i25 = (i20 >> 6) & 14;
                            int i26 = i20 >> 9;
                            int i27 = i25 | (i26 & 112);
                            int i28 = i25 | ((i20 >> 18) & 112) | (i26 & 896);
                            CardColors cardColors5 = cardColors3;
                            boolean z14 = z12;
                            int i29 = i20;
                            int i30 = (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168);
                            int i31 = i29 << 6;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            CardElevation cardElevation5 = cardElevation3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z14, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i27).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i27).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i28).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i28).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i30 | (i31 & 234881024) | (i31 & 1879048192), 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            shape5 = shape4;
                            borderStroke5 = borderStroke4;
                            cardColors4 = cardColors5;
                            z13 = z14;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            cardElevation4 = cardElevation5;
                        }
                        i20 = i12;
                        z12 = z11;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                        }
                        int i210 = (i20 >> 6) & 14;
                        int i211 = i20 >> 9;
                        int i212 = i210 | (i211 & 112);
                        int i213 = i210 | ((i20 >> 18) & 112) | (i211 & 896);
                        CardColors cardColors6 = cardColors3;
                        boolean z15 = z12;
                        int i214 = i20;
                        int i32 = (i214 & 14) | (i214 & 112) | (i214 & 896) | (i214 & 7168);
                        int i33 = i214 << 6;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        CardElevation cardElevation6 = cardElevation3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z15, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i212).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i212).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i213).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i213).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i32 | (i33 & 234881024) | (i33 & 1879048192), 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape5 = shape4;
                        borderStroke5 = borderStroke4;
                        cardColors4 = cardColors6;
                        z13 = z15;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        cardElevation4 = cardElevation6;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i215 = (i20 >> 6) & 14;
                    int i216 = i20 >> 9;
                    int i217 = i215 | (i216 & 112);
                    int i218 = i215 | ((i20 >> 18) & 112) | (i216 & 896);
                    CardColors cardColors7 = cardColors3;
                    boolean z16 = z12;
                    int i219 = i20;
                    int i34 = (i219 & 14) | (i219 & 112) | (i219 & 896) | (i219 & 7168);
                    int i35 = i219 << 6;
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                    CardElevation cardElevation7 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z16, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i217).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i217).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i218).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i218).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i34 | (i35 & 234881024) | (i35 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors7;
                    z13 = z16;
                    mutableInteractionSource3 = mutableInteractionSource6;
                    cardElevation4 = cardElevation7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2110 = (i20 >> 6) & 14;
                    int i2111 = i20 >> 9;
                    int i2112 = i2110 | (i2111 & 112);
                    int i2113 = i2110 | ((i20 >> 18) & 112) | (i2111 & 896);
                    CardColors cardColors8 = cardColors3;
                    boolean z17 = z12;
                    int i2114 = i20;
                    int i36 = (i2114 & 14) | (i2114 & 112) | (i2114 & 896) | (i2114 & 7168);
                    int i37 = i2114 << 6;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                    CardElevation cardElevation8 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z17, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i2112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i2112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i36 | (i37 & 234881024) | (i37 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors8;
                    z13 = z17;
                    mutableInteractionSource3 = mutableInteractionSource7;
                    cardElevation4 = cardElevation8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i23;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i23;
            } else {
                cardColors2 = cardColors;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevation2 = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevation2)) {
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2115 = (i20 >> 6) & 14;
                    int i2116 = i20 >> 9;
                    int i2117 = i2115 | (i2116 & 112);
                    int i2118 = i2115 | ((i20 >> 18) & 112) | (i2116 & 896);
                    CardColors cardColors9 = cardColors3;
                    boolean z18 = z12;
                    int i2119 = i20;
                    int i38 = (i2119 & 14) | (i2119 & 112) | (i2119 & 896) | (i2119 & 7168);
                    int i39 = i2119 << 6;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                    CardElevation cardElevation9 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z18, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i2117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i2117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i38 | (i39 & 234881024) | (i39 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors9;
                    z13 = z18;
                    mutableInteractionSource3 = mutableInteractionSource8;
                    cardElevation4 = cardElevation9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i21110 = (i20 >> 6) & 14;
                    int i21111 = i20 >> 9;
                    int i21112 = i21110 | (i21111 & 112);
                    int i21113 = i21110 | ((i20 >> 18) & 112) | (i21111 & 896);
                    CardColors cardColors10 = cardColors3;
                    boolean z19 = z12;
                    int i21114 = i20;
                    int i310 = (i21114 & 14) | (i21114 & 112) | (i21114 & 896) | (i21114 & 7168);
                    int i311 = i21114 << 6;
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                    CardElevation cardElevation10 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z19, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i21112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i21112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i310 | (i311 & 234881024) | (i311 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors10;
                    z13 = z19;
                    mutableInteractionSource3 = mutableInteractionSource9;
                    cardElevation4 = cardElevation10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21115 = (i20 >> 6) & 14;
                int i21116 = i20 >> 9;
                int i21117 = i21115 | (i21116 & 112);
                int i21118 = i21115 | ((i20 >> 18) & 112) | (i21116 & 896);
                CardColors cardColors11 = cardColors3;
                boolean z110 = z12;
                int i21119 = i20;
                int i312 = (i21119 & 14) | (i21119 & 112) | (i21119 & 896) | (i21119 & 7168);
                int i313 = i21119 << 6;
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                CardElevation cardElevation11 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z110, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i21117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i21117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i312 | (i313 & 234881024) | (i313 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors11;
                z13 = z110;
                mutableInteractionSource3 = mutableInteractionSource10;
                cardElevation4 = cardElevation11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i211110 = (i20 >> 6) & 14;
                int i211111 = i20 >> 9;
                int i211112 = i211110 | (i211111 & 112);
                int i211113 = i211110 | ((i20 >> 18) & 112) | (i211111 & 896);
                CardColors cardColors12 = cardColors3;
                boolean z111 = z12;
                int i211114 = i20;
                int i314 = (i211114 & 14) | (i211114 & 112) | (i211114 & 896) | (i211114 & 7168);
                int i315 = i211114 << 6;
                MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                CardElevation cardElevation12 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z111, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i211112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i211112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i314 | (i315 & 234881024) | (i315 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors12;
                z13 = z111;
                mutableInteractionSource3 = mutableInteractionSource11;
                cardElevation4 = cardElevation12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    cardColors2 = cardColors;
                    if (composerStartRestartGroup.changed(cardColors2)) {
                    }
                    i12 |= i23;
                } else {
                    cardColors2 = cardColors;
                }
                i12 |= i23;
            } else {
                cardColors2 = cardColors;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    cardElevation2 = cardElevation;
                    if (composerStartRestartGroup.changed(cardElevation2)) {
                    }
                    i12 |= i24;
                } else {
                    cardElevation2 = cardElevation;
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                borderStroke2 = borderStroke;
            } else {
                borderStroke2 = borderStroke;
                if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) != 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i211115 = (i20 >> 6) & 14;
                    int i211116 = i20 >> 9;
                    int i211117 = i211115 | (i211116 & 112);
                    int i211118 = i211115 | ((i20 >> 18) & 112) | (i211116 & 896);
                    CardColors cardColors13 = cardColors3;
                    boolean z112 = z12;
                    int i211119 = i20;
                    int i316 = (i211119 & 14) | (i211119 & 112) | (i211119 & 896) | (i211119 & 7168);
                    int i317 = i211119 << 6;
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                    CardElevation cardElevation13 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z112, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i211117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i211117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i316 | (i317 & 234881024) | (i317 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors13;
                    z13 = z112;
                    mutableInteractionSource3 = mutableInteractionSource12;
                    cardElevation4 = cardElevation13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) == 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c10 = 6;
                            shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i12 &= -7169;
                        } else {
                            c10 = 6;
                            shape3 = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            i12 &= -57345;
                        } else {
                            cardColorsM940cardColorsro_MJ88 = cardColors2;
                        }
                        if ((i11 & 32) != 0) {
                            cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i12 &= -458753;
                        } else {
                            cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                        }
                        if (i15 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i20 = i12;
                            z12 = z11;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            i20 = i12;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            cardColors3 = cardColorsM940cardColorsro_MJ88;
                            z12 = z11;
                            cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                    }
                    int i2111110 = (i20 >> 6) & 14;
                    int i2111111 = i20 >> 9;
                    int i2111112 = i2111110 | (i2111111 & 112);
                    int i2111113 = i2111110 | ((i20 >> 18) & 112) | (i2111111 & 896);
                    CardColors cardColors14 = cardColors3;
                    boolean z113 = z12;
                    int i2111114 = i20;
                    int i318 = (i2111114 & 14) | (i2111114 & 112) | (i2111114 & 896) | (i2111114 & 7168);
                    int i319 = i2111114 << 6;
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                    CardElevation cardElevation14 = cardElevation3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z113, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i2111112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i2111112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i318 | (i319 & 234881024) | (i319 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape5 = shape4;
                    borderStroke5 = borderStroke4;
                    cardColors4 = cardColors14;
                    z13 = z113;
                    mutableInteractionSource3 = mutableInteractionSource13;
                    cardElevation4 = cardElevation14;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i2111115 = (i20 >> 6) & 14;
                int i2111116 = i20 >> 9;
                int i2111117 = i2111115 | (i2111116 & 112);
                int i2111118 = i2111115 | ((i20 >> 18) & 112) | (i2111116 & 896);
                CardColors cardColors15 = cardColors3;
                boolean z114 = z12;
                int i2111119 = i20;
                int i3110 = (i2111119 & 14) | (i2111119 & 112) | (i2111119 & 896) | (i2111119 & 7168);
                int i3111 = i2111119 << 6;
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                CardElevation cardElevation15 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z114, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i2111117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i2111117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i3110 | (i3111 & 234881024) | (i3111 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors15;
                z13 = z114;
                mutableInteractionSource3 = mutableInteractionSource14;
                cardElevation4 = cardElevation15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21111110 = (i20 >> 6) & 14;
                int i21111111 = i20 >> 9;
                int i21111112 = i21111110 | (i21111111 & 112);
                int i21111113 = i21111110 | ((i20 >> 18) & 112) | (i21111111 & 896);
                CardColors cardColors16 = cardColors3;
                boolean z115 = z12;
                int i21111114 = i20;
                int i3112 = (i21111114 & 14) | (i21111114 & 112) | (i21111114 & 896) | (i21111114 & 7168);
                int i3113 = i21111114 << 6;
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                CardElevation cardElevation16 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z115, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i21111112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i21111112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21111113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21111113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i3112 | (i3113 & 234881024) | (i3113 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors16;
                z13 = z115;
                mutableInteractionSource3 = mutableInteractionSource15;
                cardElevation4 = cardElevation16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            i12 |= i22;
        } else {
            shape2 = shape;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                cardColors2 = cardColors;
                if (composerStartRestartGroup.changed(cardColors2)) {
                }
                i12 |= i23;
            } else {
                cardColors2 = cardColors;
            }
            i12 |= i23;
        } else {
            cardColors2 = cardColors;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                cardElevation2 = cardElevation;
                if (composerStartRestartGroup.changed(cardElevation2)) {
                }
                i12 |= i24;
            } else {
                cardElevation2 = cardElevation;
            }
            i12 |= i24;
        } else {
            cardElevation2 = cardElevation;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i21111115 = (i20 >> 6) & 14;
                int i21111116 = i20 >> 9;
                int i21111117 = i21111115 | (i21111116 & 112);
                int i21111118 = i21111115 | ((i20 >> 18) & 112) | (i21111116 & 896);
                CardColors cardColors17 = cardColors3;
                boolean z116 = z12;
                int i21111119 = i20;
                int i3114 = (i21111119 & 14) | (i21111119 & 112) | (i21111119 & 896) | (i21111119 & 7168);
                int i3115 = i21111119 << 6;
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                CardElevation cardElevation17 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z116, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i21111117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i21111117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21111118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i21111118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i3114 | (i3115 & 234881024) | (i3115 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors17;
                z13 = z116;
                mutableInteractionSource3 = mutableInteractionSource16;
                cardElevation4 = cardElevation17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) == 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c10 = 6;
                        shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i12 &= -7169;
                    } else {
                        c10 = 6;
                        shape3 = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        i12 &= -57345;
                    } else {
                        cardColorsM940cardColorsro_MJ88 = cardColors2;
                    }
                    if ((i11 & 32) != 0) {
                        cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                        i12 &= -458753;
                    } else {
                        cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                    }
                    if (i15 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i20 = i12;
                        z12 = z11;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        i20 = i12;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        cardColors3 = cardColorsM940cardColorsro_MJ88;
                        z12 = z11;
                        cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
                }
                int i211111110 = (i20 >> 6) & 14;
                int i211111111 = i20 >> 9;
                int i211111112 = i211111110 | (i211111111 & 112);
                int i211111113 = i211111110 | ((i20 >> 18) & 112) | (i211111111 & 896);
                CardColors cardColors18 = cardColors3;
                boolean z117 = z12;
                int i211111114 = i20;
                int i3116 = (i211111114 & 14) | (i211111114 & 112) | (i211111114 & 896) | (i211111114 & 7168);
                int i3117 = i211111114 << 6;
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
                CardElevation cardElevation18 = cardElevation3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z117, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i211111112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i211111112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211111113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211111113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i3116 | (i3117 & 234881024) | (i3117 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape5 = shape4;
                borderStroke5 = borderStroke4;
                cardColors4 = cardColors18;
                z13 = z117;
                mutableInteractionSource3 = mutableInteractionSource17;
                cardElevation4 = cardElevation18;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) != 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -57345;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i20 = i12;
                    z12 = z11;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    i20 = i12;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    z12 = z11;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                }
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -57345;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i20 = i12;
                    z12 = z11;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    i20 = i12;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    z12 = z11;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
            }
            int i211111115 = (i20 >> 6) & 14;
            int i211111116 = i20 >> 9;
            int i211111117 = i211111115 | (i211111116 & 112);
            int i211111118 = i211111115 | ((i20 >> 18) & 112) | (i211111116 & 896);
            CardColors cardColors19 = cardColors3;
            boolean z118 = z12;
            int i211111119 = i20;
            int i3118 = (i211111119 & 14) | (i211111119 & 112) | (i211111119 & 896) | (i211111119 & 7168);
            int i3119 = i211111119 << 6;
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
            CardElevation cardElevation19 = cardElevation3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z118, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i211111117).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i211111117).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211111118).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i211111118).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i3118 | (i3119 & 234881024) | (i3119 & 1879048192), 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape5 = shape4;
            borderStroke5 = borderStroke4;
            cardColors4 = cardColors19;
            z13 = z118;
            mutableInteractionSource3 = mutableInteractionSource18;
            cardElevation4 = cardElevation19;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -57345;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i20 = i12;
                    z12 = z11;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    i20 = i12;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    z12 = z11;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                }
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c10 = 6;
                    shape3 = CardDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i12 &= -7169;
                } else {
                    c10 = 6;
                    shape3 = shape2;
                }
                if ((i11 & 16) != 0) {
                    cardColorsM940cardColorsro_MJ88 = CardDefaults.INSTANCE.m940cardColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    i12 &= -57345;
                } else {
                    cardColorsM940cardColorsro_MJ88 = cardColors2;
                }
                if ((i11 & 32) != 0) {
                    cardElevationM941cardElevationaqJV_2Y = CardDefaults.INSTANCE.m941cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i12 &= -458753;
                } else {
                    cardElevationM941cardElevationaqJV_2Y = cardElevation2;
                }
                if (i15 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i20 = i12;
                    z12 = z11;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    i20 = i12;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    cardColors3 = cardColorsM940cardColorsro_MJ88;
                    z12 = z11;
                    cardElevation3 = cardElevationM941cardElevationaqJV_2Y;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024281376, i20, -1, "androidx.compose.material3.Card (Card.kt:131)");
            }
            int i2111111110 = (i20 >> 6) & 14;
            int i2111111111 = i20 >> 9;
            int i2111111112 = i2111111110 | (i2111111111 & 112);
            int i2111111113 = i2111111110 | ((i20 >> 18) & 112) | (i2111111111 & 896);
            CardColors cardColors110 = cardColors3;
            boolean z119 = z12;
            int i2111111114 = i20;
            int i31110 = (i2111111114 & 14) | (i2111111114 & 112) | (i2111111114 & 896) | (i2111111114 & 7168);
            int i31111 = i2111111114 << 6;
            MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource2;
            CardElevation cardElevation110 = cardElevation3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1332Surfaceo_FOJdg(onClick, modifier3, z119, shape4, cardColors3.containerColor$material3_release(z12, composerStartRestartGroup, i2111111112).getValue().m2518unboximpl(), cardColors3.contentColor$material3_release(z12, composerStartRestartGroup, i2111111112).getValue().m2518unboximpl(), cardElevation3.tonalElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111111113).getValue().m4403unboximpl(), cardElevation3.shadowElevation$material3_release(z12, mutableInteractionSource2, composerStartRestartGroup, i2111111113).getValue().m4403unboximpl(), borderStroke4, mutableInteractionSource19, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 776921067, true, new c(content, i20)), composer2, i31110 | (i31111 & 234881024) | (i31111 & 1879048192), 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape5 = shape4;
            borderStroke5 = borderStroke4;
            cardColors4 = cardColors110;
            z13 = z119;
            mutableInteractionSource3 = mutableInteractionSource19;
            cardElevation4 = cardElevation110;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, z13, shape5, cardColors4, cardElevation4, borderStroke5, mutableInteractionSource3, content, i10, i11));
    }
}
