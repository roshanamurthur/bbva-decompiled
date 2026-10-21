package com.bbva.ui.compose.theme;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.themeadapter.material.MdcTheme;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "BbvaTheme", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ThemeBuilder.kt\ncom/bbva/ui/compose/theme/ThemeBuilderKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,482:1\n76#2:483\n481#3,5:484\n486#3,13:490\n1#4:489\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt\n*L\n98#1:483\n101#1:484,5\n101#1:490,13\n101#1:489\n*E\n"})
public final class ThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ExtendedColors> f37613a = CompositionLocalKt.staticCompositionLocalOf(c.f37621p0);

    /* JADX INFO: compiled from: Theme.kt */
    @SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt$BbvaTheme$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,482:1\n36#2:483\n1097#3,6:484\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt$BbvaTheme$1\n*L\n104#1:483\n104#1:484,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f37614p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f37615q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f37616r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Context context, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f37614p0 = obj;
            this.f37615q0 = context;
            this.f37616r0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-513155549, iIntValue, -1, "com.bbva.ui.compose.theme.BbvaTheme.<anonymous> (Theme.kt:102)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i10 = MaterialTheme.$stable;
                Colors colors = materialTheme.getColors(composer2, i10);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(this.f37614p0);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = ThemeBuilderKt.createExtendedColors(this.f37615q0, colors);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ThemeKt.f37613a.provides((ExtendedColors) objRememberedValue)}, ComposableLambdaKt.composableLambda(composer2, 1784119651, true, new com.bbva.ui.compose.theme.a(this.f37616r0, materialTheme.getTypography(composer2, i10))), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Theme.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f37617p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f37618q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37619r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37620s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f37617p0 = context;
            this.f37618q0 = function2;
            this.f37619r0 = i10;
            this.f37620s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37619r0 | 1);
            ThemeKt.BbvaTheme(this.f37617p0, this.f37618q0, composer, iUpdateChangedFlags, this.f37620s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Theme.kt */
    public static final class c extends Lambda implements Function0<ExtendedColors> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f37621p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ExtendedColors invoke() {
            Colors colorsM735lightColors2qZNXz8$default = ColorsKt.m735lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
            androidx.compose.ui.graphics.Color.Companion companion = androidx.compose.ui.graphics.Color.INSTANCE;
            return new ExtendedColors(colorsM735lightColors2qZNXz8$default, companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), new ExtendedColors.Surface(new ExtendedColors.Surface.Ambient(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Alternative(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Contrast(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Info(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Success(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Warning(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Error(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Surface.Sustainability(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Support(new ExtendedColors.Support.Info(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Support.Success(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Support.Warning(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Support.Error(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Support.Pending(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Support.Sustainability(companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Badge(new ExtendedColors.Badge.Info(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Badge.Success(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Badge.Warning(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Badge.Error(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Badge.Off(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Badge.Sustainability(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Notification(new ExtendedColors.Notification.Alert(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Notification.Info(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Format(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Rating(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Categories(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Process(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Risk(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Data(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Locations(companion.m2544getUnspecified0d7_KjU(), new ExtendedColors.Locations.Pins(companion.m2544getUnspecified0d7_KjU(), new ExtendedColors.Locations.Pins.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Locations.Pins.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), null), null), new ExtendedColors.Emergent(new ExtendedColors.Emergent.Main(companion.m2544getUnspecified0d7_KjU(), new ExtendedColors.Emergent.Main.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Emergent.Main.Link(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), null)), new ExtendedColors.Cta(new ExtendedColors.Cta.Main(new ExtendedColors.Cta.Main.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Main.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Cta.Complementary(new ExtendedColors.Cta.Complementary.Background(companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Complementary.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Complementary.Border(companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Cta.Positive(new ExtendedColors.Cta.Positive.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Positive.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Cta.Negative(new ExtendedColors.Cta.Negative.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Negative.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Cta.Disabled(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Multistep(new ExtendedColors.Cta.Multistep.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Cta.Multistep.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null))), new ExtendedColors.Selection(new ExtendedColors.Selection.Interaction01(new ExtendedColors.Selection.Interaction01.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Selection.Interaction01.Text(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Selection.Interaction02(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Link(new ExtendedColors.Link.Main(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Link.Complementary(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Link.Highlight(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Link.Negative(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Link.Inverse(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Link.Image(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Form(new ExtendedColors.Form.Input(new ExtendedColors.Form.Input.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.Placeholder(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.FieldText(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.HintText(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.Icon(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.AddIcon(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Input.Border(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Form.Selector(new ExtendedColors.Form.Selector.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Selector.Border(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Selector.Check(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null)), new ExtendedColors.Form.Switch(new ExtendedColors.Form.Switch.Background(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null), new ExtendedColors.Form.Switch.Handle(companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), companion.m2544getUnspecified0d7_KjU(), null))), null);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void BbvaTheme(@Nullable Context context, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(153858227);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (i12 == 1 && (i13 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i12 != 0) {
                    i13 &= -15;
                }
            } else if (i12 != 0) {
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                i13 &= -15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(153858227, i13, -1, "com.bbva.ui.compose.theme.BbvaTheme (Theme.kt:99)");
            }
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            if (!ThemeBuilderKt.f37611a) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                    declaredMethod.setAccessible(true);
                    ThemeBuilderKt.f37612b = declaredMethod;
                } catch (ReflectiveOperationException unused) {
                }
                ThemeBuilderKt.f37611a = true;
            }
            Object objInvoke = null;
            if (ThemeBuilderKt.f37612b != null) {
                try {
                    Method method = ThemeBuilderKt.f37612b;
                    if (method != null) {
                        objInvoke = method.invoke(theme, new Object[0]);
                    }
                } catch (ReflectiveOperationException unused2) {
                    objInvoke = Unit.INSTANCE;
                }
            }
            if (objInvoke == null) {
                objInvoke = context.getTheme();
            }
            MdcTheme.MdcTheme(null, false, false, false, true, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -513155549, true, new a(objInvoke, context, content)), composerStartRestartGroup, 1597440, 47);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(context, content, i10, i11));
        }
    }
}
