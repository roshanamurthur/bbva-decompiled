package androidx.compose.material;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", LogKeysKt.PROPERTIES, "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidAlertDialog_androidKt {

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidAlertDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material/AndroidAlertDialog_androidKt$AlertDialog$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,152:1\n154#2:153\n154#2:189\n154#2:190\n66#3,6:154\n72#3:188\n76#3:195\n78#4,11:160\n91#4:194\n456#5,8:171\n464#5,3:185\n467#5,3:191\n4144#6,6:179\n*S KotlinDebug\n*F\n+ 1 AndroidAlertDialog.android.kt\nandroidx/compose/material/AndroidAlertDialog_androidKt$AlertDialog$1\n*L\n80#1:153\n82#1:189\n83#1:190\n80#1:154,6\n80#1:188\n80#1:195\n80#1:160,11\n80#1:194\n80#1:171,8\n80#1:185,3\n80#1:191,3\n80#1:179,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6613p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6614q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6615r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2, Function2 function3) {
            super(2);
            this.f6613p0 = function2;
            this.f6614q0 = i10;
            this.f6615r0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1849673151, iIntValue, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                }
                float f6 = 8;
                Modifier modifierM297paddingVpY3zN4 = PaddingKt.m297paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(2));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM297paddingVpY3zN4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                AlertDialogKt.m652AlertDialogFlowRowixp7dh8(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new e(this.f6614q0, this.f6613p0, this.f6615r0)), composer2, 438);
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

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6616p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6617q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6618r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6619s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6620t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6621u0;
        public final /* synthetic */ Shape v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f6622w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f6623x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f6624y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Shape shape, long j10, long j11, DialogProperties dialogProperties, int i10, int i11) {
            super(2);
            this.f6616p0 = function0;
            this.f6617q0 = function2;
            this.f6618r0 = modifier;
            this.f6619s0 = function3;
            this.f6620t0 = function4;
            this.f6621u0 = function5;
            this.v0 = shape;
            this.f6622w0 = j10;
            this.f6623x0 = j11;
            this.f6624y0 = dialogProperties;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidAlertDialog_androidKt.m653AlertDialog6oU6zVQ(this.f6616p0, this.f6617q0, this.f6618r0, this.f6619s0, this.f6620t0, this.f6621u0, this.v0, this.f6622w0, this.f6623x0, this.f6624y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6627r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6628s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f6629t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f6630u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6631w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, long j10, long j11, int i10) {
            super(2);
            this.f6625p0 = function2;
            this.f6626q0 = modifier;
            this.f6627r0 = function3;
            this.f6628s0 = function4;
            this.f6629t0 = shape;
            this.f6630u0 = j10;
            this.v0 = j11;
            this.f6631w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1787418772, iIntValue, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                }
                Function2<Composer, Integer, Unit> function2 = this.f6625p0;
                Modifier modifier = this.f6626q0;
                Function2<Composer, Integer, Unit> function3 = this.f6627r0;
                Function2<Composer, Integer, Unit> function4 = this.f6628s0;
                Shape shape = this.f6629t0;
                long j10 = this.f6630u0;
                long j11 = this.v0;
                int i10 = this.f6631w0 >> 3;
                AlertDialogKt.m651AlertDialogContentWMdw5o4(function2, modifier, function3, function4, shape, j10, j11, composer2, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6632p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6633q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6634r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6635s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6636t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f6637u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f6638w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f6639x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f6640y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, long j10, long j11, DialogProperties dialogProperties, int i10, int i11) {
            super(2);
            this.f6632p0 = function0;
            this.f6633q0 = function2;
            this.f6634r0 = modifier;
            this.f6635s0 = function3;
            this.f6636t0 = function4;
            this.f6637u0 = shape;
            this.v0 = j10;
            this.f6638w0 = j11;
            this.f6639x0 = dialogProperties;
            this.f6640y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidAlertDialog_androidKt.m654AlertDialogwqdebIU(this.f6632p0, this.f6633q0, this.f6634r0, this.f6635s0, this.f6636t0, this.f6637u0, this.v0, this.f6638w0, this.f6639x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6640y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0193  */
    /* JADX WARN: Code duplicated, block: B:129:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01de  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:154:0x0217  */
    /* JADX WARN: Code duplicated, block: B:157:0x0225  */
    /* JADX WARN: Code duplicated, block: B:160:0x027f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0299  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    public static final void m653AlertDialog6oU6zVQ(@NotNull Function0<Unit> onDismissRequest, @NotNull Function2<? super Composer, ? super Integer, Unit> confirmButton, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, long j10, long j11, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i18;
        long jM731contentColorForek8zF_U;
        int i19;
        int i20;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Shape medium;
        int i21;
        long jM717getSurface0d7_KjU;
        DialogProperties dialogProperties2;
        long j12;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        long j13;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Shape shape3;
        long j14;
        long j15;
        DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i22;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-606536823);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i25 = i11 & 4;
        if (i25 == 0) {
            if ((i10 & 896) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function5 = function4;
                    } else {
                        function5 = function4;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(shape)) {
                            i24 = 524288;
                        } else {
                            i24 = 1048576;
                        }
                        i12 |= i24;
                    }
                    if ((i10 & 29360128) != 0) {
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i23 = 4194304;
                        } else {
                            i23 = 8388608;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 234881024) == 0) {
                        jM731contentColorForek8zF_U = j11;
                        if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(jM731contentColorForek8zF_U)) {
                            i22 = 33554432;
                        } else {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i12 |= i22;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    i19 = i11 & 512;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i20 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i25 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i15 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function14 = i17 == 0 ? function5 : null;
                            if ((i11 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -3670017;
                            } else {
                                medium = shape;
                            }
                            if ((i11 & 128) != 0) {
                                i21 = i12 & (-29360129);
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            } else {
                                i21 = i12;
                                jM717getSurface0d7_KjU = j10;
                            }
                            if ((i11 & 256) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                                i21 &= -234881025;
                            }
                            if (i19 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            j12 = jM717getSurface0d7_KjU;
                            function8 = function14;
                            function9 = function6;
                            i12 = i21;
                            function10 = function7;
                            j13 = jM731contentColorForek8zF_U;
                            shape2 = medium;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                            }
                            modifier2 = modifier;
                            function10 = function3;
                            shape2 = shape;
                            j12 = j10;
                            dialogProperties2 = dialogProperties;
                            j13 = jM731contentColorForek8zF_U;
                            function8 = function5;
                            function9 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                        }
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                        int i26 = (i12 & 14) | 48 | (i12 & 896);
                        int i27 = i12 >> 3;
                        Function2<? super Composer, ? super Integer, Unit> function15 = function9;
                        m654AlertDialogwqdebIU(onDismissRequest, composableLambda, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i26 | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016) | (i27 & 29360128) | (i27 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function15;
                        modifier3 = modifier2;
                        function12 = function10;
                        function13 = function8;
                        shape3 = shape2;
                        j14 = j12;
                        j15 = j13;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function11 = function2;
                        function12 = function3;
                        dialogProperties3 = dialogProperties;
                        function13 = function5;
                        j15 = jM731contentColorForek8zF_U;
                        shape3 = shape;
                        j14 = j10;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 234881024) == 0) {
                    jM731contentColorForek8zF_U = j11;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i28 = (i12 & 14) | 48 | (i12 & 896);
                    int i29 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda2, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i28 | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function16;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i210 = (i12 & 14) | 48 | (i12 & 896);
                    int i211 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda3, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i210 | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function17;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
            }
            i12 |= 3072;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 234881024) == 0) {
                    jM731contentColorForek8zF_U = j11;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i212 = (i12 & 14) | 48 | (i12 & 896);
                    int i213 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function18 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda4, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i212 | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (i213 & 3670016) | (i213 & 29360128) | (i213 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function18;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i214 = (i12 & 14) | 48 | (i12 & 896);
                    int i215 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function19 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda5, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i214 | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function19;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((i10 & 234881024) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i216 = (i12 & 14) | 48 | (i12 & 896);
                int i217 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function110 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda6, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i216 | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (i217 & 3670016) | (i217 & 29360128) | (i217 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function110;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i218 = (i12 & 14) | 48 | (i12 & 896);
                int i219 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function111 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda7, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i218 | (i219 & 7168) | (57344 & i219) | (458752 & i219) | (i219 & 3670016) | (i219 & 29360128) | (i219 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function111;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((i10 & 234881024) == 0) {
                    jM731contentColorForek8zF_U = j11;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i2110 = (i12 & 14) | 48 | (i12 & 896);
                    int i2111 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function112 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda8, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i2110 | (i2111 & 7168) | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016) | (i2111 & 29360128) | (i2111 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function112;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i11 & 128) != 0) {
                            i21 = i12 & (-29360129);
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        } else {
                            i21 = i12;
                            jM717getSurface0d7_KjU = j10;
                        }
                        if ((i11 & 256) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                            i21 &= -234881025;
                        }
                        if (i19 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j12 = jM717getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i12 = i21;
                        function10 = function7;
                        j13 = jM731contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                    int i2112 = (i12 & 14) | 48 | (i12 & 896);
                    int i2113 = i12 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function113 = function9;
                    m654AlertDialogwqdebIU(onDismissRequest, composableLambda9, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i2112 | (i2113 & 7168) | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016) | (i2113 & 29360128) | (i2113 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function113;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j14 = j12;
                    j15 = j13;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((i10 & 234881024) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i2114 = (i12 & 14) | 48 | (i12 & 896);
                int i2115 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function114 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda10, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i2114 | (i2115 & 7168) | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016) | (i2115 & 29360128) | (i2115 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function114;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i2116 = (i12 & 14) | 48 | (i12 & 896);
                int i2117 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function115 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda11, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i2116 | (i2117 & 7168) | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016) | (i2117 & 29360128) | (i2117 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function115;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
        }
        i12 |= 3072;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((i10 & 234881024) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i2118 = (i12 & 14) | 48 | (i12 & 896);
                int i2119 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function116 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda12, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i2118 | (i2119 & 7168) | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016) | (i2119 & 29360128) | (i2119 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function116;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i11 & 128) != 0) {
                        i21 = i12 & (-29360129);
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    } else {
                        i21 = i12;
                        jM717getSurface0d7_KjU = j10;
                    }
                    if ((i11 & 256) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                        i21 &= -234881025;
                    }
                    if (i19 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j12 = jM717getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i12 = i21;
                    function10 = function7;
                    j13 = jM731contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
                int i21110 = (i12 & 14) | 48 | (i12 & 896);
                int i21111 = i12 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function117 = function9;
                m654AlertDialogwqdebIU(onDismissRequest, composableLambda13, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i21110 | (i21111 & 7168) | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016) | (i21111 & 29360128) | (i21111 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function117;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j14 = j12;
                j15 = j13;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function4;
        } else {
            function5 = function4;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i24 = 524288;
            } else {
                i24 = 524288;
            }
            i12 |= i24;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i23 = 4194304;
            } else {
                i23 = 4194304;
            }
            i12 |= i23;
        }
        if ((i10 & 234881024) == 0) {
            jM731contentColorForek8zF_U = j11;
            if ((i11 & 256) == 0) {
                i22 = 33554432;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        i19 = i11 & 512;
        if (i19 != 0) {
            i12 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(dialogProperties)) {
                i20 = PKIFailureInfo.duplicateCertReq;
            } else {
                i20 = 268435456;
            }
            i12 |= i20;
        }
        if ((i12 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i11 & 128) != 0) {
                    i21 = i12 & (-29360129);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i21 = i12;
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 256) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                    i21 &= -234881025;
                }
                if (i19 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j12 = jM717getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i12 = i21;
                function10 = function7;
                j13 = jM731contentColorForek8zF_U;
                shape2 = medium;
            } else {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i11 & 128) != 0) {
                    i21 = i12 & (-29360129);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i21 = i12;
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 256) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                    i21 &= -234881025;
                }
                if (i19 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j12 = jM717getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i12 = i21;
                function10 = function7;
                j13 = jM731contentColorForek8zF_U;
                shape2 = medium;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
            }
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
            int i21112 = (i12 & 14) | 48 | (i12 & 896);
            int i21113 = i12 >> 3;
            Function2<? super Composer, ? super Integer, Unit> function118 = function9;
            m654AlertDialogwqdebIU(onDismissRequest, composableLambda14, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i21112 | (i21113 & 7168) | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016) | (i21113 & 29360128) | (i21113 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function118;
            modifier3 = modifier2;
            function12 = function10;
            function13 = function8;
            shape3 = shape2;
            j14 = j12;
            j15 = j13;
            dialogProperties3 = dialogProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i11 & 128) != 0) {
                    i21 = i12 & (-29360129);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i21 = i12;
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 256) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                    i21 &= -234881025;
                }
                if (i19 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j12 = jM717getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i12 = i21;
                function10 = function7;
                j13 = jM731contentColorForek8zF_U;
                shape2 = medium;
            } else {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i11 & 128) != 0) {
                    i21 = i12 & (-29360129);
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                } else {
                    i21 = i12;
                    jM717getSurface0d7_KjU = j10;
                }
                if ((i11 & 256) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i21 >> 21) & 14);
                    i21 &= -234881025;
                }
                if (i19 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j12 = jM717getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i12 = i21;
                function10 = function7;
                j13 = jM731contentColorForek8zF_U;
                shape2 = medium;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606536823, i12, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
            }
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new a(i12, function9, confirmButton));
            int i21114 = (i12 & 14) | 48 | (i12 & 896);
            int i21115 = i12 >> 3;
            Function2<? super Composer, ? super Integer, Unit> function119 = function9;
            m654AlertDialogwqdebIU(onDismissRequest, composableLambda15, modifier2, function10, function8, shape2, j12, j13, dialogProperties2, composerStartRestartGroup, i21114 | (i21115 & 7168) | (57344 & i21115) | (458752 & i21115) | (i21115 & 3670016) | (i21115 & 29360128) | (i21115 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function119;
            modifier3 = modifier2;
            function12 = function10;
            function13 = function8;
            shape3 = shape2;
            j14 = j12;
            j15 = j13;
            dialogProperties3 = dialogProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j14, j15, dialogProperties3, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x016f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0181  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:152:0x0230  */
    /* JADX WARN: Code duplicated, block: B:157:0x0248  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    public static final void m654AlertDialogwqdebIU(@NotNull Function0<Unit> onDismissRequest, @NotNull Function2<? super Composer, ? super Integer, Unit> buttons, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, long j10, long j11, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i16;
        Shape shape2;
        long j12;
        int i17;
        int i18;
        Modifier modifier2;
        Shape medium;
        long jM717getSurface0d7_KjU;
        long jM731contentColorForek8zF_U;
        DialogProperties dialogProperties2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function7;
        long j13;
        long j14;
        int i19;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Shape shape4;
        long j15;
        long j16;
        DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035523925);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(buttons) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 896) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            shape2 = shape;
                            int i21 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i12 |= i21;
                        } else {
                            shape2 = shape;
                        }
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    if ((3670016 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            j12 = j10;
                            int i22 = composerStartRestartGroup.changed(j12) ? 1048576 : 524288;
                            i12 |= i22;
                        } else {
                            j12 = j10;
                        }
                        i12 |= i22;
                    } else {
                        j12 = j10;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
                    }
                    i17 = i11 & 256;
                    if (i17 != 0) {
                        if ((234881024 & i10) == 0) {
                            if (composerStartRestartGroup.changed(dialogProperties)) {
                                i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i18 = 33554432;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i20 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    function4 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function10 = i15 == 0 ? function5 : null;
                                if ((i11 & 32) != 0) {
                                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                    i12 &= -458753;
                                } else {
                                    medium = shape2;
                                }
                                if ((i11 & 64) != 0) {
                                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                    i12 &= -3670017;
                                } else {
                                    jM717getSurface0d7_KjU = j12;
                                }
                                if ((i11 & 128) != 0) {
                                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                    i12 &= -29360129;
                                } else {
                                    jM731contentColorForek8zF_U = j11;
                                }
                                if (i17 != 0) {
                                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                }
                                function6 = function10;
                                shape3 = medium;
                                function7 = function4;
                                j13 = jM717getSurface0d7_KjU;
                                j14 = jM731contentColorForek8zF_U;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                modifier2 = modifier;
                                j14 = j11;
                                dialogProperties2 = dialogProperties;
                                function7 = function4;
                                function6 = function5;
                                shape3 = shape2;
                                j13 = j12;
                            }
                            i19 = i12;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                            }
                            Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                            Modifier modifier4 = modifier2;
                            composer2 = composerStartRestartGroup;
                            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function11;
                            modifier3 = modifier4;
                            function9 = function6;
                            shape4 = shape3;
                            j15 = j13;
                            j16 = j14;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function8 = function4;
                            function9 = function5;
                            shape4 = shape2;
                            j15 = j12;
                            composer2 = composerStartRestartGroup;
                            j16 = j11;
                            dialogProperties3 = dialogProperties;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
                    }
                    i12 |= 100663296;
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function12 = function7;
                        Modifier modifier5 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function12;
                        modifier3 = modifier5;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function13 = function7;
                        Modifier modifier6 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function13;
                        modifier3 = modifier6;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
                }
                i12 |= 24576;
                function5 = function3;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i22;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function14 = function7;
                        Modifier modifier7 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function14;
                        modifier3 = modifier7;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                        Modifier modifier8 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function15;
                        modifier3 = modifier8;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
                }
                i12 |= 100663296;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function16 = function7;
                    Modifier modifier9 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function16;
                    modifier3 = modifier9;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                    Modifier modifier10 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function17;
                    modifier3 = modifier10;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 3072;
            function4 = function2;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i22;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function18 = function7;
                        Modifier modifier11 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function18;
                        modifier3 = modifier11;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                        Modifier modifier12 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function19;
                        modifier3 = modifier12;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
                }
                i12 |= 100663296;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function110 = function7;
                    Modifier modifier13 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function110;
                    modifier3 = modifier13;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function111 = function7;
                    Modifier modifier14 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111;
                    modifier3 = modifier14;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 24576;
            function5 = function3;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function112 = function7;
                    Modifier modifier15 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function112;
                    modifier3 = modifier15;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                    Modifier modifier16 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function113;
                    modifier3 = modifier16;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 100663296;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function114 = function7;
                Modifier modifier17 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function114;
                modifier3 = modifier17;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                Modifier modifier18 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function115;
                modifier3 = modifier18;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i22;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function116 = function7;
                        Modifier modifier19 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function116;
                        modifier3 = modifier19;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i12 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i11 & 64) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                                i12 &= -3670017;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                                i12 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i17 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = jM731contentColorForek8zF_U;
                        }
                        i19 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function117 = function7;
                        Modifier modifier110 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function117;
                        modifier3 = modifier110;
                        function9 = function6;
                        shape4 = shape3;
                        j15 = j13;
                        j16 = j14;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
                }
                i12 |= 100663296;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function118 = function7;
                    Modifier modifier111 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function118;
                    modifier3 = modifier111;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                    Modifier modifier112 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function119;
                    modifier3 = modifier112;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 24576;
            function5 = function3;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1110 = function7;
                    Modifier modifier113 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1110;
                    modifier3 = modifier113;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                    Modifier modifier114 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111;
                    modifier3 = modifier114;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 100663296;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1112 = function7;
                Modifier modifier115 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1112;
                modifier3 = modifier115;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1113 = function7;
                Modifier modifier116 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1113;
                modifier3 = modifier116;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
        }
        i12 |= 3072;
        function4 = function2;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i22;
                } else {
                    j12 = j10;
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1114 = function7;
                    Modifier modifier117 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1114;
                    modifier3 = modifier117;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i12 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i11 & 64) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            i12 &= -3670017;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i17 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = jM731contentColorForek8zF_U;
                    }
                    i19 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                    Modifier modifier118 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1115;
                    modifier3 = modifier118;
                    function9 = function6;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j14;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
            }
            i12 |= 100663296;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1116 = function7;
                Modifier modifier119 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1116;
                modifier3 = modifier119;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1117 = function7;
                Modifier modifier1110 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1117;
                modifier3 = modifier1110;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
        }
        i12 |= 24576;
        function5 = function3;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
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
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                j12 = j10;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i22;
            } else {
                j12 = j10;
            }
            i12 |= i22;
        } else {
            j12 = j10;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) ? 4194304 : 8388608;
        }
        i17 = i11 & 256;
        if (i17 != 0) {
            if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1118 = function7;
                Modifier modifier1111 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1118;
                modifier3 = modifier1111;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i12 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i11 & 64) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        i12 &= -3670017;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i17 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = jM731contentColorForek8zF_U;
                }
                i19 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
                Modifier modifier1112 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1119;
                modifier3 = modifier1112;
                function9 = function6;
                shape4 = shape3;
                j15 = j13;
                j16 = j14;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
        }
        i12 |= 100663296;
        if ((i12 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i17 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j13 = jM717getSurface0d7_KjU;
                j14 = jM731contentColorForek8zF_U;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i17 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j13 = jM717getSurface0d7_KjU;
                j14 = jM731contentColorForek8zF_U;
            }
            i19 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
            }
            Function2<? super Composer, ? super Integer, Unit> function11110 = function7;
            Modifier modifier1113 = modifier2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function11110;
            modifier3 = modifier1113;
            function9 = function6;
            shape4 = shape3;
            j15 = j13;
            j16 = j14;
            dialogProperties3 = dialogProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i17 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j13 = jM717getSurface0d7_KjU;
                j14 = jM731contentColorForek8zF_U;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i12 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i11 & 64) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    i12 &= -3670017;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i17 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j13 = jM717getSurface0d7_KjU;
                j14 = jM731contentColorForek8zF_U;
            }
            i19 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035523925, i19, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
            }
            Function2<? super Composer, ? super Integer, Unit> function11111 = function7;
            Modifier modifier1114 = modifier2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new c(buttons, modifier2, function7, function6, shape3, j13, j14, i19)), composer2, (i19 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | ((i19 >> 21) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function11111;
            modifier3 = modifier1114;
            function9 = function6;
            shape4 = shape3;
            j15 = j13;
            j16 = j14;
            dialogProperties3 = dialogProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, buttons, modifier3, function8, function9, shape4, j15, j16, dialogProperties3, i10, i11));
    }
}
