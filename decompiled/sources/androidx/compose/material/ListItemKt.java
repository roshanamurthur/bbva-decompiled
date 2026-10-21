package androidx.compose.material;

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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import h0.o3;
import h0.p3;
import java.util.List;
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

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0092\u0001\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "secondaryText", "", "singleLineSecondaryText", "overlineText", "trailing", "text", "ListItem", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,429:1\n78#2,11:430\n91#2:461\n78#2,11:462\n91#2:493\n456#3,8:441\n464#3,6:455\n456#3,8:473\n464#3,6:487\n4144#4,6:449\n4144#4,6:481\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n353#1:430,11\n353#1:461\n395#1:462,11\n395#1:493\n353#1:441,8\n353#1:455,6\n395#1:473,8\n395#1:487,6\n353#1:449,6\n395#1:481,6\n*E\n"})
public final class ListItemKt {

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7257p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7258q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7259r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7260s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7261t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7262u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7263w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7264x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, int i10, int i11) {
            super(2);
            this.f7257p0 = modifier;
            this.f7258q0 = function2;
            this.f7259r0 = function3;
            this.f7260s0 = z10;
            this.f7261t0 = function4;
            this.f7262u0 = function5;
            this.v0 = function6;
            this.f7263w0 = i10;
            this.f7264x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ListItemKt.ListItem(this.f7257p0, this.f7258q0, this.f7259r0, this.f7260s0, this.f7261t0, this.f7262u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7263w0 | 1), this.f7264x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7265p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x018a  */
    /* JADX WARN: Code duplicated, block: B:109:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    public static final void ListItem(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function9;
        boolean z12;
        ComposableLambda composableLambdaA;
        ComposableLambda composableLambdaA2;
        ComposableLambda composableLambdaA3;
        ComposableLambda composableLambdaA4;
        Modifier modifierSemantics;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        boolean z13;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-450923337);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                function6 = function2;
                i12 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function7 = function3;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            function8 = function4;
                            if (composerStartRestartGroup.changedInstance(function8)) {
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
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(text)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i23 != 0) {
                                function6 = null;
                            }
                            if (i13 != 0) {
                                function9 = null;
                            } else {
                                function9 = function7;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i17 != 0) {
                                function8 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function13 = i19 == 0 ? function5 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                            }
                            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            TextStyle subtitle1 = typography.getSubtitle1();
                            ContentAlpha contentAlpha = ContentAlpha.INSTANCE;
                            composableLambdaA = a(contentAlpha.getHigh(composerStartRestartGroup, 6), subtitle1, text);
                            Intrinsics.checkNotNull(composableLambdaA);
                            composableLambdaA2 = a(contentAlpha.getMedium(composerStartRestartGroup, 6), typography.getBody2(), function9);
                            composableLambdaA3 = a(contentAlpha.getHigh(composerStartRestartGroup, 6), typography.getOverline(), function8);
                            composableLambdaA4 = a(contentAlpha.getHigh(composerStartRestartGroup, 6), typography.getCaption(), function13);
                            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                            if (composableLambdaA2 == null || composableLambdaA3 != null) {
                                function10 = function8;
                                if ((composableLambdaA3 == null || !z12) && composableLambdaA2 != null) {
                                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(-210280382);
                                    p3.f69035a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280579);
                                function10 = function8;
                                h0.b2.f68661a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 24576, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function11 = function13;
                            z13 = z12;
                            function12 = function10;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function11 = function5;
                            function9 = function7;
                            z13 = z11;
                            function12 = function8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
                    }
                    i12 |= 24576;
                    function8 = function4;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 2995931) == 599186) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle2 = typography2.getSubtitle1();
                        ContentAlpha contentAlpha2 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha2.getHigh(composerStartRestartGroup, 6), subtitle2, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha2.getMedium(composerStartRestartGroup, 6), typography2.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha2.getHigh(composerStartRestartGroup, 6), typography2.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha2.getHigh(composerStartRestartGroup, 6), typography2.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle3 = typography3.getSubtitle1();
                        ContentAlpha contentAlpha3 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha3.getHigh(composerStartRestartGroup, 6), subtitle3, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha3.getMedium(composerStartRestartGroup, 6), typography3.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha3.getHigh(composerStartRestartGroup, 6), typography3.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha3.getHigh(composerStartRestartGroup, 6), typography3.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
                }
                i12 |= 3072;
                z11 = z10;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
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
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 2995931) == 599186) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle4 = typography4.getSubtitle1();
                        ContentAlpha contentAlpha4 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha4.getHigh(composerStartRestartGroup, 6), subtitle4, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha4.getMedium(composerStartRestartGroup, 6), typography4.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha4.getHigh(composerStartRestartGroup, 6), typography4.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha4.getHigh(composerStartRestartGroup, 6), typography4.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle5 = typography5.getSubtitle1();
                        ContentAlpha contentAlpha5 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha5.getHigh(composerStartRestartGroup, 6), subtitle5, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha5.getMedium(composerStartRestartGroup, 6), typography5.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha5.getHigh(composerStartRestartGroup, 6), typography5.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha5.getHigh(composerStartRestartGroup, 6), typography5.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
                }
                i12 |= 24576;
                function8 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle6 = typography6.getSubtitle1();
                    ContentAlpha contentAlpha6 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha6.getHigh(composerStartRestartGroup, 6), subtitle6, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha6.getMedium(composerStartRestartGroup, 6), typography6.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha6.getHigh(composerStartRestartGroup, 6), typography6.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha6.getHigh(composerStartRestartGroup, 6), typography6.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle7 = typography7.getSubtitle1();
                    ContentAlpha contentAlpha7 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha7.getHigh(composerStartRestartGroup, 6), subtitle7, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha7.getMedium(composerStartRestartGroup, 6), typography7.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha7.getHigh(composerStartRestartGroup, 6), typography7.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha7.getHigh(composerStartRestartGroup, 6), typography7.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function7 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
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
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 2995931) == 599186) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle8 = typography8.getSubtitle1();
                        ContentAlpha contentAlpha8 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha8.getHigh(composerStartRestartGroup, 6), subtitle8, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha8.getMedium(composerStartRestartGroup, 6), typography8.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha8.getHigh(composerStartRestartGroup, 6), typography8.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha8.getHigh(composerStartRestartGroup, 6), typography8.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle9 = typography9.getSubtitle1();
                        ContentAlpha contentAlpha9 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha9.getHigh(composerStartRestartGroup, 6), subtitle9, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha9.getMedium(composerStartRestartGroup, 6), typography9.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha9.getHigh(composerStartRestartGroup, 6), typography9.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha9.getHigh(composerStartRestartGroup, 6), typography9.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
                }
                i12 |= 24576;
                function8 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle10 = typography10.getSubtitle1();
                    ContentAlpha contentAlpha10 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha10.getHigh(composerStartRestartGroup, 6), subtitle10, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha10.getMedium(composerStartRestartGroup, 6), typography10.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha10.getHigh(composerStartRestartGroup, 6), typography10.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha10.getHigh(composerStartRestartGroup, 6), typography10.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle11 = typography11.getSubtitle1();
                    ContentAlpha contentAlpha11 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha11.getHigh(composerStartRestartGroup, 6), subtitle11, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha11.getMedium(composerStartRestartGroup, 6), typography11.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha11.getHigh(composerStartRestartGroup, 6), typography11.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha11.getHigh(composerStartRestartGroup, 6), typography11.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
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
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle12 = typography12.getSubtitle1();
                    ContentAlpha contentAlpha12 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha12.getHigh(composerStartRestartGroup, 6), subtitle12, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha12.getMedium(composerStartRestartGroup, 6), typography12.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha12.getHigh(composerStartRestartGroup, 6), typography12.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha12.getHigh(composerStartRestartGroup, 6), typography12.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle13 = typography13.getSubtitle1();
                    ContentAlpha contentAlpha13 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha13.getHigh(composerStartRestartGroup, 6), subtitle13, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha13.getMedium(composerStartRestartGroup, 6), typography13.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha13.getHigh(composerStartRestartGroup, 6), typography13.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha13.getHigh(composerStartRestartGroup, 6), typography13.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= 24576;
            function8 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 2995931) == 599186) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle14 = typography14.getSubtitle1();
                ContentAlpha contentAlpha14 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha14.getHigh(composerStartRestartGroup, 6), subtitle14, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha14.getMedium(composerStartRestartGroup, 6), typography14.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha14.getHigh(composerStartRestartGroup, 6), typography14.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha14.getHigh(composerStartRestartGroup, 6), typography14.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle15 = typography15.getSubtitle1();
                ContentAlpha contentAlpha15 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha15.getHigh(composerStartRestartGroup, 6), subtitle15, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha15.getMedium(composerStartRestartGroup, 6), typography15.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha15.getHigh(composerStartRestartGroup, 6), typography15.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha15.getHigh(composerStartRestartGroup, 6), typography15.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
        }
        i12 |= 48;
        function6 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function7 = function3;
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function8 = function4;
                        if (composerStartRestartGroup.changedInstance(function8)) {
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
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(text)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 2995931) == 599186) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography16 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle16 = typography16.getSubtitle1();
                        ContentAlpha contentAlpha16 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha16.getHigh(composerStartRestartGroup, 6), subtitle16, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha16.getMedium(composerStartRestartGroup, 6), typography16.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha16.getHigh(composerStartRestartGroup, 6), typography16.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha16.getHigh(composerStartRestartGroup, 6), typography16.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            function6 = null;
                        }
                        if (i13 != 0) {
                            function9 = null;
                        } else {
                            function9 = function7;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i17 != 0) {
                            function8 = null;
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                        }
                        Typography typography17 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        TextStyle subtitle17 = typography17.getSubtitle1();
                        ContentAlpha contentAlpha17 = ContentAlpha.INSTANCE;
                        composableLambdaA = a(contentAlpha17.getHigh(composerStartRestartGroup, 6), subtitle17, text);
                        Intrinsics.checkNotNull(composableLambdaA);
                        composableLambdaA2 = a(contentAlpha17.getMedium(composerStartRestartGroup, 6), typography17.getBody2(), function9);
                        composableLambdaA3 = a(contentAlpha17.getHigh(composerStartRestartGroup, 6), typography17.getOverline(), function8);
                        composableLambdaA4 = a(contentAlpha17.getHigh(composerStartRestartGroup, 6), typography17.getCaption(), function13);
                        modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                        if (composableLambdaA2 == null) {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        } else {
                            function10 = function8;
                            if (composableLambdaA3 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-210280168);
                                o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function13;
                        z13 = z12;
                        function12 = function10;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
                }
                i12 |= 24576;
                function8 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography18 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle18 = typography18.getSubtitle1();
                    ContentAlpha contentAlpha18 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha18.getHigh(composerStartRestartGroup, 6), subtitle18, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha18.getMedium(composerStartRestartGroup, 6), typography18.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha18.getHigh(composerStartRestartGroup, 6), typography18.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha18.getHigh(composerStartRestartGroup, 6), typography18.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography19 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle19 = typography19.getSubtitle1();
                    ContentAlpha contentAlpha19 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha19.getHigh(composerStartRestartGroup, 6), subtitle19, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha19.getMedium(composerStartRestartGroup, 6), typography19.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha19.getHigh(composerStartRestartGroup, 6), typography19.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha19.getHigh(composerStartRestartGroup, 6), typography19.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
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
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle110 = typography110.getSubtitle1();
                    ContentAlpha contentAlpha110 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha110.getHigh(composerStartRestartGroup, 6), subtitle110, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha110.getMedium(composerStartRestartGroup, 6), typography110.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha110.getHigh(composerStartRestartGroup, 6), typography110.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha110.getHigh(composerStartRestartGroup, 6), typography110.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle111 = typography111.getSubtitle1();
                    ContentAlpha contentAlpha111 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha111.getHigh(composerStartRestartGroup, 6), subtitle111, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha111.getMedium(composerStartRestartGroup, 6), typography111.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha111.getHigh(composerStartRestartGroup, 6), typography111.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha111.getHigh(composerStartRestartGroup, 6), typography111.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= 24576;
            function8 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 2995931) == 599186) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle112 = typography112.getSubtitle1();
                ContentAlpha contentAlpha112 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha112.getHigh(composerStartRestartGroup, 6), subtitle112, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha112.getMedium(composerStartRestartGroup, 6), typography112.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha112.getHigh(composerStartRestartGroup, 6), typography112.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha112.getHigh(composerStartRestartGroup, 6), typography112.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle113 = typography113.getSubtitle1();
                ContentAlpha contentAlpha113 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha113.getHigh(composerStartRestartGroup, 6), subtitle113, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha113.getMedium(composerStartRestartGroup, 6), typography113.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha113.getHigh(composerStartRestartGroup, 6), typography113.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha113.getHigh(composerStartRestartGroup, 6), typography113.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function7 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function8 = function4;
                    if (composerStartRestartGroup.changedInstance(function8)) {
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
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(text)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 2995931) == 599186) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle114 = typography114.getSubtitle1();
                    ContentAlpha contentAlpha114 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha114.getHigh(composerStartRestartGroup, 6), subtitle114, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha114.getMedium(composerStartRestartGroup, 6), typography114.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha114.getHigh(composerStartRestartGroup, 6), typography114.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha114.getHigh(composerStartRestartGroup, 6), typography114.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        function6 = null;
                    }
                    if (i13 != 0) {
                        function9 = null;
                    } else {
                        function9 = function7;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i17 != 0) {
                        function8 = null;
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                    }
                    Typography typography115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    TextStyle subtitle115 = typography115.getSubtitle1();
                    ContentAlpha contentAlpha115 = ContentAlpha.INSTANCE;
                    composableLambdaA = a(contentAlpha115.getHigh(composerStartRestartGroup, 6), subtitle115, text);
                    Intrinsics.checkNotNull(composableLambdaA);
                    composableLambdaA2 = a(contentAlpha115.getMedium(composerStartRestartGroup, 6), typography115.getBody2(), function9);
                    composableLambdaA3 = a(contentAlpha115.getHigh(composerStartRestartGroup, 6), typography115.getOverline(), function8);
                    composableLambdaA4 = a(contentAlpha115.getHigh(composerStartRestartGroup, 6), typography115.getCaption(), function13);
                    modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                    if (composableLambdaA2 == null) {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    } else {
                        function10 = function8;
                        if (composableLambdaA3 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-210280168);
                            o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function13;
                    z13 = z12;
                    function12 = function10;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
            }
            i12 |= 24576;
            function8 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 2995931) == 599186) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle116 = typography116.getSubtitle1();
                ContentAlpha contentAlpha116 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha116.getHigh(composerStartRestartGroup, 6), subtitle116, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha116.getMedium(composerStartRestartGroup, 6), typography116.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha116.getHigh(composerStartRestartGroup, 6), typography116.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha116.getHigh(composerStartRestartGroup, 6), typography116.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle117 = typography117.getSubtitle1();
                ContentAlpha contentAlpha117 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha117.getHigh(composerStartRestartGroup, 6), subtitle117, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha117.getMedium(composerStartRestartGroup, 6), typography117.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha117.getHigh(composerStartRestartGroup, 6), typography117.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha117.getHigh(composerStartRestartGroup, 6), typography117.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                function8 = function4;
                if (composerStartRestartGroup.changedInstance(function8)) {
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
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(text)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 2995931) == 599186) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle118 = typography118.getSubtitle1();
                ContentAlpha contentAlpha118 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha118.getHigh(composerStartRestartGroup, 6), subtitle118, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha118.getMedium(composerStartRestartGroup, 6), typography118.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha118.getHigh(composerStartRestartGroup, 6), typography118.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha118.getHigh(composerStartRestartGroup, 6), typography118.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    function6 = null;
                }
                if (i13 != 0) {
                    function9 = null;
                } else {
                    function9 = function7;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i17 != 0) {
                    function8 = null;
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
                }
                Typography typography119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                TextStyle subtitle119 = typography119.getSubtitle1();
                ContentAlpha contentAlpha119 = ContentAlpha.INSTANCE;
                composableLambdaA = a(contentAlpha119.getHigh(composerStartRestartGroup, 6), subtitle119, text);
                Intrinsics.checkNotNull(composableLambdaA);
                composableLambdaA2 = a(contentAlpha119.getMedium(composerStartRestartGroup, 6), typography119.getBody2(), function9);
                composableLambdaA3 = a(contentAlpha119.getHigh(composerStartRestartGroup, 6), typography119.getOverline(), function8);
                composableLambdaA4 = a(contentAlpha119.getHigh(composerStartRestartGroup, 6), typography119.getCaption(), function13);
                modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
                if (composableLambdaA2 == null) {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    function10 = function8;
                    if (composableLambdaA3 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-210280168);
                        o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function13;
                z13 = z12;
                function12 = function10;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
        }
        i12 |= 24576;
        function8 = function4;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(text)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        }
        if ((i12 & 2995931) == 599186) {
            if (i22 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i23 != 0) {
                function6 = null;
            }
            if (i13 != 0) {
                function9 = null;
            } else {
                function9 = function7;
            }
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i17 != 0) {
                function8 = null;
            }
            if (i19 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
            }
            Typography typography1110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1110 = typography1110.getSubtitle1();
            ContentAlpha contentAlpha1110 = ContentAlpha.INSTANCE;
            composableLambdaA = a(contentAlpha1110.getHigh(composerStartRestartGroup, 6), subtitle1110, text);
            Intrinsics.checkNotNull(composableLambdaA);
            composableLambdaA2 = a(contentAlpha1110.getMedium(composerStartRestartGroup, 6), typography1110.getBody2(), function9);
            composableLambdaA3 = a(contentAlpha1110.getHigh(composerStartRestartGroup, 6), typography1110.getOverline(), function8);
            composableLambdaA4 = a(contentAlpha1110.getHigh(composerStartRestartGroup, 6), typography1110.getCaption(), function13);
            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
            if (composableLambdaA2 == null) {
                function10 = function8;
                if (composableLambdaA3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function10 = function8;
                if (composableLambdaA3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function13;
            z13 = z12;
            function12 = function10;
            modifier3 = modifier2;
        } else {
            if (i22 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i23 != 0) {
                function6 = null;
            }
            if (i13 != 0) {
                function9 = null;
            } else {
                function9 = function7;
            }
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i17 != 0) {
                function8 = null;
            }
            if (i19 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450923337, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:72)");
            }
            Typography typography1111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1111 = typography1111.getSubtitle1();
            ContentAlpha contentAlpha1111 = ContentAlpha.INSTANCE;
            composableLambdaA = a(contentAlpha1111.getHigh(composerStartRestartGroup, 6), subtitle1111, text);
            Intrinsics.checkNotNull(composableLambdaA);
            composableLambdaA2 = a(contentAlpha1111.getMedium(composerStartRestartGroup, 6), typography1111.getBody2(), function9);
            composableLambdaA3 = a(contentAlpha1111.getHigh(composerStartRestartGroup, 6), typography1111.getOverline(), function8);
            composableLambdaA4 = a(contentAlpha1111.getHigh(composerStartRestartGroup, 6), typography1111.getCaption(), function13);
            modifierSemantics = SemanticsModifierKt.semantics(modifier2, true, b.f7265p0);
            if (composableLambdaA2 == null) {
                function10 = function8;
                if (composableLambdaA3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function10 = function8;
                if (composableLambdaA3 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-210280168);
                    o3.f69002a.a(modifierSemantics, function6, composableLambdaA, composableLambdaA2, composableLambdaA3, composableLambdaA4, composerStartRestartGroup, (i12 & 112) | 1572864, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function13;
            z13 = z12;
            function12 = function10;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function6, function9, z13, function12, function11, text, i10, i11));
    }

    public static final ComposableLambda a(float f6, TextStyle textStyle, Function2 function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new h0.m1(f6, textStyle, function2));
    }

    public static final void access$BaselinesOffsetColumn(List list, Modifier modifier, Function2 function2, Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1631148337);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i10, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        h0.h1 h1Var = new h0.h1(list);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i12 = (((((i10 >> 6) & 14) | (i10 & 112)) << 9) & 7168) | 6;
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
        Updater.m2081setimpl(composerM2074constructorimpl, h1Var, companion.getSetMeasurePolicy());
        Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
        }
        ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.i1(list, modifier2, function2, i10, i11));
    }

    /* JADX INFO: renamed from: access$OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m782access$OffsetToBaselineOrCenterKz89ssw(float f6, Modifier modifier, Function2 function2, Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i12, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            h0.j1 j1Var = new h0.j1(f6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i14 = ((((i12 & 112) | ((i12 >> 6) & 14)) << 9) & 7168) | 6;
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
            Updater.m2081setimpl(composerM2074constructorimpl, j1Var, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j((i14 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.k1(f6, i10, i11, modifier2, function2));
    }
}
