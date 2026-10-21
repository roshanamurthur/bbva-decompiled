package com.bbva.ui.compose;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.ui.extensions.StringKt;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClipBox.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001aD\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "size", "", "name", "imageBase64", "", "ClipBox-3MZ6nm0", "(Landroidx/compose/ui/Modifier;JFLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ClipBox", "", "iconResourceId", "ClipBox-BazWgJc", "(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClipBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,159:1\n154#2:160\n154#2:161\n154#2:162\n67#3,5:163\n72#3:196\n76#3:201\n65#3,7:202\n72#3:237\n76#3:242\n78#4,11:168\n91#4:200\n78#4,11:209\n91#4:241\n456#5,8:179\n464#5,3:193\n467#5,3:197\n456#5,8:220\n464#5,3:234\n467#5,3:238\n4144#6,6:187\n4144#6,6:228\n*S KotlinDebug\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt\n*L\n47#1:160\n64#1:161\n79#1:162\n84#1:163,5\n84#1:196\n84#1:201\n128#1:202,7\n128#1:237\n128#1:242\n84#1:168,11\n84#1:200\n128#1:209,11\n128#1:241\n84#1:179,8\n84#1:193,3\n84#1:197,3\n128#1:220,8\n128#1:234,3\n128#1:238,3\n84#1:187,6\n128#1:228,6\n*E\n"})
public final class ClipBoxKt {

    /* JADX INFO: compiled from: ClipBox.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37135p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f37136q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f37137r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37138s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f37139t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37140u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, long j10, float f6, String str, String str2, int i10, int i11) {
            super(2);
            this.f37135p0 = modifier;
            this.f37136q0 = j10;
            this.f37137r0 = f6;
            this.f37138s0 = str;
            this.f37139t0 = str2;
            this.f37140u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ClipBoxKt.m4977ClipBox3MZ6nm0(this.f37135p0, this.f37136q0, this.f37137r0, this.f37138s0, this.f37139t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37140u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37141p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f37142q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f37143r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37144s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37145t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37146u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Modifier modifier, long j10, float f6, int i10, int i11, int i12) {
            super(2);
            this.f37141p0 = modifier;
            this.f37142q0 = j10;
            this.f37143r0 = f6;
            this.f37144s0 = i10;
            this.f37145t0 = i11;
            this.f37146u0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ClipBoxKt.m4978ClipBoxBazWgJc(this.f37141p0, this.f37142q0, this.f37143r0, this.f37144s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37145t0 | 1), this.f37146u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f37147p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37148q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37149r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j10, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f37147p0 = j10;
            this.f37148q0 = function3;
            this.f37149r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37149r0 | 1);
            ClipBoxKt.a(this.f37147p0, this.f37148q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    @SourceDebugExtension({"SMAP\nClipBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt$InternalClipBox$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,159:1\n71#2:160\n*S KotlinDebug\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt$InternalClipBox$1$1\n*L\n103#1:160\n*E\n"})
    public static final class d extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f37150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f37151q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, String str) {
            super(3);
            this.f37150p0 = f6;
            this.f37151q0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ClipBoxContainer = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ClipBoxContainer, "$this$ClipBoxContainer");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1737120482, iIntValue, -1, "com.bbva.ui.compose.InternalClipBox.<anonymous>.<anonymous> (ClipBox.kt:100)");
                }
                TextKt.m879Text4IGK_g(StringKt.initials(this.f37151q0, 2), (Modifier) null, Color.INSTANCE.m2545getWhite0d7_KjU(), TextUnitKt.getSp(Dp.m4389constructorimpl(this.f37150p0 / 2.8f)), (FontStyle) null, FontWeight.INSTANCE.getThin(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196992, 0, 131026);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    @SourceDebugExtension({"SMAP\nClipBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt$InternalClipBox$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,159:1\n71#2:160\n*S KotlinDebug\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/compose/ClipBoxKt$InternalClipBox$1$2\n*L\n112#1:160\n*E\n"})
    public static final class e extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f37152p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Integer f37153q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6, Integer num) {
            super(3);
            this.f37152p0 = f6;
            this.f37153q0 = num;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ClipBoxContainer = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ClipBoxContainer, "$this$ClipBoxContainer");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1034524643, iIntValue, -1, "com.bbva.ui.compose.InternalClipBox.<anonymous>.<anonymous> (ClipBox.kt:110)");
                }
                IconKt.m780Iconww6aTOc(PainterResources_androidKt.painterResource(this.f37153q0.intValue(), composer2, 0), "", SizeKt.m335size3ABfNKs(Modifier.INSTANCE, Dp.m4389constructorimpl(this.f37152p0 / 2.2f)), Color.INSTANCE.m2545getWhite0d7_KjU(), composer2, 3128, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37154p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f37155q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f37156r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37157s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f37158t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Integer f37159u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f37160w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Modifier modifier, long j10, float f6, String str, String str2, Integer num, int i10, int i11) {
            super(2);
            this.f37154p0 = modifier;
            this.f37155q0 = j10;
            this.f37156r0 = f6;
            this.f37157s0 = str;
            this.f37158t0 = str2;
            this.f37159u0 = num;
            this.v0 = i10;
            this.f37160w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ClipBoxKt.b(this.f37154p0, this.f37155q0, this.f37156r0, this.f37157s0, this.f37158t0, this.f37159u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f37160w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: ClipBox-3MZ6nm0, reason: not valid java name */
    public static final void m4977ClipBox3MZ6nm0(@Nullable Modifier modifier, long j10, float f6, @NotNull String name, @Nullable String str, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long j11;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        String str2;
        int i17;
        Modifier modifier3;
        long jM4998getBlue600d7_KjU;
        float fM4389constructorimpl;
        Modifier modifier4;
        String str3;
        long j12;
        float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(name, "name");
        Composer composerStartRestartGroup = composer.startRestartGroup(43355194);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                j11 = j10;
                i12 |= composerStartRestartGroup.changed(j11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(name)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (composerStartRestartGroup.changed(str2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i19 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        } else {
                            jM4998getBlue600d7_KjU = j11;
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i16 != 0) {
                            str2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                        }
                        b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str3 = str2;
                        j12 = jM4998getBlue600d7_KjU;
                        f11 = fM4389constructorimpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        j12 = j11;
                        f11 = f10;
                        str3 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            f10 = f6;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(name)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
            }
        }
        i12 |= 48;
        j11 = j10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(name)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    } else {
                        jM4998getBlue600d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i16 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                    }
                    b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str3 = str2;
                    j12 = jM4998getBlue600d7_KjU;
                    f11 = fM4389constructorimpl;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f10 = f6;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(name)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                } else {
                    jM4998getBlue600d7_KjU = j11;
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i16 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
                }
                b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                str3 = str2;
                j12 = jM4998getBlue600d7_KjU;
                f11 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
            }
        }
        i12 |= 24576;
        str2 = str;
        if ((46811 & i12) == 9362) {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            } else {
                jM4998getBlue600d7_KjU = j11;
            }
            if (i13 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (i16 != 0) {
                str2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
            }
            b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            j12 = jM4998getBlue600d7_KjU;
            f11 = fM4389constructorimpl;
        } else {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            } else {
                jM4998getBlue600d7_KjU = j11;
            }
            if (i13 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (i16 != 0) {
                str2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43355194, i12, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:49)");
            }
            b(modifier3, jM4998getBlue600d7_KjU, fM4389constructorimpl, name, str2, null, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            str3 = str2;
            j12 = jM4998getBlue600d7_KjU;
            f11 = fM4389constructorimpl;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier4, j12, f11, name, str3, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: ClipBox-BazWgJc, reason: not valid java name */
    public static final void m4978ClipBoxBazWgJc(@Nullable Modifier modifier, long j10, float f6, @DrawableRes int i10, @Nullable Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long jM4998getBlue600d7_KjU;
        int i14;
        float f10;
        int i15;
        int i16;
        Modifier modifier3;
        long j11;
        float fM4389constructorimpl;
        float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(434699159);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 14) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 112) == 0) {
                jM4998getBlue600d7_KjU = j10;
                i13 |= composerStartRestartGroup.changed(jM4998getBlue600d7_KjU) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                if ((i13 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    j11 = jM4998getBlue600d7_KjU;
                    if (i14 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
                    }
                    b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j11 = jM4998getBlue600d7_KjU;
                    f11 = f10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j11, f11, i10, i11, i12));
                }
            }
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            f10 = f6;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            if ((i13 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                j11 = jM4998getBlue600d7_KjU;
                if (i14 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
                }
                b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                j11 = jM4998getBlue600d7_KjU;
                if (i14 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
                }
                b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j11, f11, i10, i11, i12));
            }
        }
        i13 |= 48;
        jM4998getBlue600d7_KjU = j10;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            if ((i13 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                j11 = jM4998getBlue600d7_KjU;
                if (i14 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
                }
                b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                j11 = jM4998getBlue600d7_KjU;
                if (i14 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
                }
                b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j11, f11, i10, i11, i12));
            }
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f10 = f6;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (composerStartRestartGroup.changed(i10)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        if ((i13 & 5851) == 1170) {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            }
            j11 = jM4998getBlue600d7_KjU;
            if (i14 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
            }
            b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f11 = fM4389constructorimpl;
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            }
            j11 = jM4998getBlue600d7_KjU;
            if (i14 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434699159, i13, -1, "com.bbva.ui.compose.ClipBox (ClipBox.kt:65)");
            }
            b(modifier3, j11, fM4389constructorimpl, null, null, Integer.valueOf(i10), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896) | ((i13 << 6) & 458752), 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f11 = fM4389constructorimpl;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j11, f11, i10, i11, i12));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(long j10, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(801781965);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801781965, i12, -1, "com.bbva.ui.compose.ClipBoxContainer (ClipBox.kt:126)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape());
            ColorPainter colorPainter = new ColorPainter(j10, null);
            ContentScale.Companion companion3 = ContentScale.INSTANCE;
            ImageKt.Image(colorPainter, (String) null, modifierClip, (Alignment) null, companion3.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            ImageKt.Image(new ColorPainter(j10, null), (String) null, ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), new SemicircleShape(45.0f)), (Alignment) null, companion3.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            function3.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(6 | (i12 & 112)));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(j10, function3, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:113:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x0213  */
    /* JADX WARN: Code duplicated, block: B:120:0x0220  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x0151  */
    /* JADX WARN: Code duplicated, block: B:99:0x0155  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(Modifier modifier, long j10, float f6, String str, String str2, @DrawableRes Integer num, Composer composer, int i10, int i11) {
        int i12;
        long jM4998getBlue600d7_KjU;
        int i13;
        float f10;
        int i14;
        int i15;
        String str3;
        int i16;
        int i17;
        String str4;
        int i18;
        int i19;
        int i20;
        Modifier modifier2;
        float fM4389constructorimpl;
        String str5;
        String str6;
        Integer num2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        Integer num3;
        float f11;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1022773676);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                jM4998getBlue600d7_KjU = j10;
                i12 |= composerStartRestartGroup.changed(jM4998getBlue600d7_KjU) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        str3 = str;
                        if (composerStartRestartGroup.changed(str3)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            str4 = str2;
                            if (composerStartRestartGroup.changed(str4)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(num)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i22 != 0) {
                                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                            }
                            if (i13 != 0) {
                                fM4389constructorimpl = Dp.m4389constructorimpl(72);
                            } else {
                                fM4389constructorimpl = f10;
                            }
                            if (i15 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i17 != 0) {
                                str6 = null;
                            } else {
                                str6 = str4;
                            }
                            if (i19 != 0) {
                                num2 = null;
                            } else {
                                num2 = num;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                            }
                            Modifier modifierM327requiredSize3ABfNKs = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (str6 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623722);
                                ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                                composerStartRestartGroup.endReplaceableGroup();
                                num3 = num2;
                            } else {
                                num3 = num2;
                                if (str5 != null) {
                                    composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else if (num3 != null) {
                                    composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            }
                            if (y2.d(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            f11 = fM4389constructorimpl;
                            str4 = str6;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            num3 = num;
                            f11 = f10;
                            str5 = str3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                        }
                    }
                    i12 |= 24576;
                    str4 = str2;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(num)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 374491) == 74898) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs2 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs3 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                    }
                }
                i12 |= 3072;
                str3 = str;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        str4 = str2;
                        if (composerStartRestartGroup.changed(str4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(num)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 374491) == 74898) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs4 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs5 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                    }
                }
                i12 |= 24576;
                str4 = str2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs6 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs7 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            f10 = f6;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    str3 = str;
                    if (composerStartRestartGroup.changed(str3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        str4 = str2;
                        if (composerStartRestartGroup.changed(str4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(num)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 374491) == 74898) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs8 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs9 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                    }
                }
                i12 |= 24576;
                str4 = str2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs10 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs11 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= 3072;
            str3 = str;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    str4 = str2;
                    if (composerStartRestartGroup.changed(str4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs12 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs13 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= 24576;
            str4 = str2;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(num)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i12 & 374491) == 74898) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs14 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs15 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
            }
        }
        i12 |= 48;
        jM4998getBlue600d7_KjU = j10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    str3 = str;
                    if (composerStartRestartGroup.changed(str3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        str4 = str2;
                        if (composerStartRestartGroup.changed(str4)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(num)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 374491) == 74898) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs16 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion16, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM2074constructorimpl, currentCompositionLocalMap16);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf16, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i22 != 0) {
                            jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(72);
                        } else {
                            fM4389constructorimpl = f10;
                        }
                        if (i15 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                        }
                        Modifier modifierM327requiredSize3ABfNKs17 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy17, composerM2074constructorimpl, currentCompositionLocalMap17);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf17, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        if (str6 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623722);
                            ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                            composerStartRestartGroup.endReplaceableGroup();
                            num3 = num2;
                        } else {
                            num3 = num2;
                            if (str5 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989623356);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else if (num3 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1989622987);
                                a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1989622629);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        f11 = fM4389constructorimpl;
                        str4 = str6;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                    }
                }
                i12 |= 24576;
                str4 = str2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs18 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion18, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy18, composerM2074constructorimpl, currentCompositionLocalMap18);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf18, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs19 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion19, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy19, composerM2074constructorimpl, currentCompositionLocalMap19);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf19, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= 3072;
            str3 = str;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    str4 = str2;
                    if (composerStartRestartGroup.changed(str4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs110 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy110, composerM2074constructorimpl, currentCompositionLocalMap110);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs111 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy111, composerM2074constructorimpl, currentCompositionLocalMap111);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= 24576;
            str4 = str2;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(num)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i12 & 374491) == 74898) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs112 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion112, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy112, composerM2074constructorimpl, currentCompositionLocalMap112);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs113 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion113, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy113, composerM2074constructorimpl, currentCompositionLocalMap113);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f10 = f6;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                str3 = str;
                if (composerStartRestartGroup.changed(str3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    str4 = str2;
                    if (composerStartRestartGroup.changed(str4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(num)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i12 & 374491) == 74898) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs114 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion114, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy114, composerM2074constructorimpl, currentCompositionLocalMap114);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i22 != 0) {
                        jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(72);
                    } else {
                        fM4389constructorimpl = f10;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                    }
                    Modifier modifierM327requiredSize3ABfNKs115 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion115, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy115, composerM2074constructorimpl, currentCompositionLocalMap115);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623722);
                        ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                        composerStartRestartGroup.endReplaceableGroup();
                        num3 = num2;
                    } else {
                        num3 = num2;
                        if (str5 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989623356);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (num3 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1989622987);
                            a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1989622629);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f11 = fM4389constructorimpl;
                    str4 = str6;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
                }
            }
            i12 |= 24576;
            str4 = str2;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(num)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i12 & 374491) == 74898) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs116 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion116, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy116, composerM2074constructorimpl, currentCompositionLocalMap116);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs117 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion117, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy117, composerM2074constructorimpl, currentCompositionLocalMap117);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
            }
        }
        i12 |= 3072;
        str3 = str;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                str4 = str2;
                if (composerStartRestartGroup.changed(str4)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(num)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i12 & 374491) == 74898) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs118 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion118, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy118, composerM2074constructorimpl, currentCompositionLocalMap118);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i22 != 0) {
                    jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
                }
                if (i13 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(72);
                } else {
                    fM4389constructorimpl = f10;
                }
                if (i15 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
                }
                Modifier modifierM327requiredSize3ABfNKs119 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion119, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy119, composerM2074constructorimpl, currentCompositionLocalMap119);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                if (str6 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623722);
                    ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    num3 = num2;
                } else {
                    num3 = num2;
                    if (str5 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989623356);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1989622987);
                        a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1989622629);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f11 = fM4389constructorimpl;
                str4 = str6;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
            }
        }
        i12 |= 24576;
        str4 = str2;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changed(num)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i12 & 374491) == 74898) {
            if (i21 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i22 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            }
            if (i13 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (i15 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i17 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (i19 != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
            }
            Modifier modifierM327requiredSize3ABfNKs1110 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1110, composerM2074constructorimpl, currentCompositionLocalMap1110);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            if (str6 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1989623722);
                ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                composerStartRestartGroup.endReplaceableGroup();
                num3 = num2;
            } else {
                num3 = num2;
                if (str5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623356);
                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (num3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989622987);
                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1989622629);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            f11 = fM4389constructorimpl;
            str4 = str6;
            modifier3 = modifier2;
        } else {
            if (i21 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i22 != 0) {
                jM4998getBlue600d7_KjU = com.bbva.ui.compose.theme.Color.INSTANCE.m4998getBlue600d7_KjU();
            }
            if (i13 != 0) {
                fM4389constructorimpl = Dp.m4389constructorimpl(72);
            } else {
                fM4389constructorimpl = f10;
            }
            if (i15 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i17 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (i19 != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022773676, i12, -1, "com.bbva.ui.compose.InternalClipBox (ClipBox.kt:82)");
            }
            Modifier modifierM327requiredSize3ABfNKs1111 = SizeKt.m327requiredSize3ABfNKs(modifier2, fM4389constructorimpl);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM327requiredSize3ABfNKs1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, composerM2074constructorimpl, currentCompositionLocalMap1111);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            if (str6 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1989623722);
                ImageKt.m158Image5hnEew(StringKt.toImageBitmap(str6), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                composerStartRestartGroup.endReplaceableGroup();
                num3 = num2;
            } else {
                num3 = num2;
                if (str5 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989623356);
                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1737120482, true, new d(fM4389constructorimpl, str5)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (num3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1989622987);
                    a(jM4998getBlue600d7_KjU, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1034524643, true, new e(fM4389constructorimpl, num3)), composerStartRestartGroup, ((i12 >> 3) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1989622629);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            f11 = fM4389constructorimpl;
            str4 = str6;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier3, jM4998getBlue600d7_KjU, f11, str5, str4, num3, i10, i11));
        }
    }
}
