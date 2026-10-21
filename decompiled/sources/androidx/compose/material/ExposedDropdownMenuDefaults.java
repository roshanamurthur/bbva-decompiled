package androidx.compose.material;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,737:1\n76#2:738\n76#2:739\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n359#1:738\n462#1:739\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7141p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7142p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver clearAndSetSemantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7143p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(2);
            this.f7143p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(726122713, iIntValue, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:299)");
                }
                IconKt.m781Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, this.f7143p0 ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f7145q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7146r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7147s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7148t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f7145q0 = z10;
            this.f7146r0 = function0;
            this.f7147s0 = i10;
            this.f7148t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ExposedDropdownMenuDefaults.this.TrailingIcon(this.f7145q0, this.f7146r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7147s0 | 1), this.f7148t0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(boolean z10, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(876077373);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                function0 = a.f7141p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i12, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:291)");
            }
            IconButtonKt.IconButton(function0, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, b.f7142p0), false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 726122713, true, new c(z10)), composerStartRestartGroup, ((i12 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Function0<Unit> function1 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, function1, i10, i11));
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m762outlinedTextFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        long jM2507copywmQWz5c$default3;
        long jM2507copywmQWz5c$default4;
        long jM2507copywmQWz5c$default5;
        long jM2507copywmQWz5c$default6;
        composer.startReplaceableGroup(1162641182);
        long jM2507copywmQWz5c$default7 = (i13 & 1) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i13 & 2) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        long jM2543getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM713getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j13;
        long jM707getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j14;
        long jM2507copywmQWz5c$default8 = (i13 & 32) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default9 = (i13 & 64) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j17;
        }
        long jM707getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j18;
        long jM2507copywmQWz5c$default10 = (i13 & 512) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default3 = j20;
        }
        long j32 = (i13 & 2048) != 0 ? jM2507copywmQWz5c$default10 : j21;
        long jM2507copywmQWz5c$default11 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM2507copywmQWz5c$default12 = (i13 & 8192) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            jM2507copywmQWz5c$default4 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default4 = j24;
        }
        long jM707getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j25;
        long jM2507copywmQWz5c$default13 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM2507copywmQWz5c$default14 = (131072 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            jM2507copywmQWz5c$default5 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default5 = j28;
        }
        long jM707getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j29;
        long jM2507copywmQWz5c$default15 = (1048576 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if ((i13 & 2097152) != 0) {
            jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default6 = j31;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1162641182, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:460)");
        }
        h0.o0 o0Var = new h0.o0(jM2507copywmQWz5c$default7, jM2507copywmQWz5c$default, jM713getPrimary0d7_KjU, jM707getError0d7_KjU, jM2507copywmQWz5c$default8, jM2507copywmQWz5c$default9, jM707getError0d7_KjU2, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default10, jM2507copywmQWz5c$default3, j32, jM2507copywmQWz5c$default11, jM2507copywmQWz5c$default12, jM2507copywmQWz5c$default4, jM707getError0d7_KjU3, jM2543getTransparent0d7_KjU, jM2507copywmQWz5c$default13, jM2507copywmQWz5c$default14, jM2507copywmQWz5c$default5, jM707getError0d7_KjU4, jM2507copywmQWz5c$default15, jM2507copywmQWz5c$default6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0Var;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m763textFieldColorsDlUQjxs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        long jM2507copywmQWz5c$default3;
        long jM2507copywmQWz5c$default4;
        long jM2507copywmQWz5c$default5;
        long jM2507copywmQWz5c$default6;
        composer.startReplaceableGroup(1208167904);
        long jM2507copywmQWz5c$default7 = (i13 & 1) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i13 & 2) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        long jM2507copywmQWz5c$default8 = (i13 & 4) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM713getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j13;
        long jM707getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j14;
        long jM2507copywmQWz5c$default9 = (i13 & 32) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default10 = (i13 & 64) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j17;
        }
        long jM707getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j18;
        long jM2507copywmQWz5c$default11 = (i13 & 512) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default3 = j20;
        }
        long j32 = (i13 & 2048) != 0 ? jM2507copywmQWz5c$default11 : j21;
        long jM2507copywmQWz5c$default12 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM2507copywmQWz5c$default13 = (i13 & 8192) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((i13 & 16384) != 0) {
            jM2507copywmQWz5c$default4 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default4 = j24;
        }
        long jM707getError0d7_KjU3 = (32768 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j25;
        long jM2507copywmQWz5c$default14 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM2507copywmQWz5c$default15 = (131072 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((262144 & i13) != 0) {
            jM2507copywmQWz5c$default5 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default5 = j28;
        }
        long jM707getError0d7_KjU4 = (524288 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j29;
        long jM2507copywmQWz5c$default16 = (1048576 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if ((i13 & 2097152) != 0) {
            jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default16, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default6 = j31;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208167904, i10, i11, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:357)");
        }
        h0.o0 o0Var = new h0.o0(jM2507copywmQWz5c$default7, jM2507copywmQWz5c$default, jM713getPrimary0d7_KjU, jM707getError0d7_KjU, jM2507copywmQWz5c$default9, jM2507copywmQWz5c$default10, jM707getError0d7_KjU2, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default11, jM2507copywmQWz5c$default3, j32, jM2507copywmQWz5c$default12, jM2507copywmQWz5c$default13, jM2507copywmQWz5c$default4, jM707getError0d7_KjU3, jM2507copywmQWz5c$default8, jM2507copywmQWz5c$default14, jM2507copywmQWz5c$default15, jM2507copywmQWz5c$default5, jM707getError0d7_KjU4, jM2507copywmQWz5c$default16, jM2507copywmQWz5c$default6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0Var;
    }
}
