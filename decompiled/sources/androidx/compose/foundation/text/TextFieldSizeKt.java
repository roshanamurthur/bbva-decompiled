package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldSizeKt {

    /* JADX INFO: compiled from: TextFieldSize.kt */
    @SourceDebugExtension({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n76#2:116\n76#2:117\n76#2:118\n50#3:119\n49#3:120\n50#3:127\n49#3:128\n25#3:135\n1097#4,6:121\n1097#4,6:129\n1097#4,6:136\n81#5:142\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n39#1:116\n40#1:117\n41#1:118\n43#1:119\n43#1:120\n46#1:127\n46#1:128\n55#1:135\n43#1:121,6\n46#1:129,6\n55#1:136,6\n46#1:142\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f6046p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextStyle textStyle) {
            super(3);
            this.f6046p0 = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            e0.k kVar;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 1582736677);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1582736677, iA, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
            }
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            FontFamily.Resolver fontFamilyResolver = (FontFamily.Resolver) composer2.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composer2.startReplaceableGroup(511388516);
            TextStyle resolvedStyle = this.f6046p0;
            boolean zChanged = composer2.changed(resolvedStyle) | composer2.changed(layoutDirection);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = TextStyleKt.resolveDefaults(resolvedStyle, layoutDirection);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            TextStyle resolvedStyle2 = (TextStyle) objRememberedValue;
            composer2.startReplaceableGroup(511388516);
            boolean zChanged2 = composer2.changed(fontFamilyResolver) | composer2.changed(resolvedStyle2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                FontFamily fontFamily = resolvedStyle2.getFontFamily();
                FontWeight fontWeight = resolvedStyle2.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyleM3990getFontStyle4Lr2A7w = resolvedStyle2.m3990getFontStyle4Lr2A7w();
                int iM4065unboximpl = fontStyleM3990getFontStyle4Lr2A7w != null ? fontStyleM3990getFontStyle4Lr2A7w.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA();
                FontSynthesis fontSynthesisM3991getFontSynthesisZQGJjVo = resolvedStyle2.m3991getFontSynthesisZQGJjVo();
                objRememberedValue2 = fontFamilyResolver.mo4038resolveDPcqOEQ(fontFamily, fontWeight, iM4065unboximpl, fontSynthesisM3991getFontSynthesisZQGJjVo != null ? fontSynthesisM3991getFontSynthesisZQGJjVo.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU());
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            State state = (State) objRememberedValue2;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object typeface = state.getValue();
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density, "density");
                Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
                Intrinsics.checkNotNullParameter(resolvedStyle, "resolvedStyle");
                Intrinsics.checkNotNullParameter(typeface, "typeface");
                e0.k kVar2 = new e0.k();
                kVar2.f68239a = layoutDirection;
                kVar2.f68240b = density;
                kVar2.f68241c = fontFamilyResolver;
                kVar2.f68242d = resolvedStyle;
                kVar2.f68243e = typeface;
                kVar2.f68244f = TextFieldDelegateKt.computeSizeForDefaultText$default(resolvedStyle, density, fontFamilyResolver, null, 0, 24, null);
                composer2.updateRememberedValue(kVar2);
                objRememberedValue3 = kVar2;
            }
            composer2.endReplaceableGroup();
            e0.k kVar3 = (e0.k) objRememberedValue3;
            Object typeface2 = state.getValue();
            kVar3.getClass();
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            Intrinsics.checkNotNullParameter(resolvedStyle2, "resolvedStyle");
            Intrinsics.checkNotNullParameter(typeface2, "typeface");
            if (layoutDirection == kVar3.f68239a && Intrinsics.areEqual(density, kVar3.f68240b) && Intrinsics.areEqual(fontFamilyResolver, kVar3.f68241c) && Intrinsics.areEqual(resolvedStyle2, kVar3.f68242d) && Intrinsics.areEqual(typeface2, kVar3.f68243e)) {
                kVar = kVar3;
            } else {
                kVar3.f68239a = layoutDirection;
                kVar3.f68240b = density;
                kVar3.f68241c = fontFamilyResolver;
                kVar3.f68242d = resolvedStyle2;
                kVar3.f68243e = typeface2;
                kVar = kVar3;
                kVar.f68244f = TextFieldDelegateKt.computeSizeForDefaultText$default(resolvedStyle2, density, fontFamilyResolver, null, 0, 24, null);
            }
            Modifier modifierLayout = LayoutModifierKt.layout(Modifier.INSTANCE, new f0(kVar));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierLayout;
        }
    }

    @NotNull
    public static final Modifier textFieldMinSize(@NotNull Modifier modifier, @NotNull TextStyle style) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return ComposedModifierKt.composed$default(modifier, null, new a(style), 1, null);
    }
}
