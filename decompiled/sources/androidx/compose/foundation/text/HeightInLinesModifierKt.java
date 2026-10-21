package androidx.compose.foundation.text;

import androidx.camera.camera2.internal.n1;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeightInLinesModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    /* JADX INFO: compiled from: HeightInLinesModifier.kt */
    @SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n76#2:137\n50#3:138\n49#3:139\n50#3:146\n49#3:147\n83#3,3:154\n83#3,3:163\n1097#4,6:140\n1097#4,6:148\n1097#4,6:157\n1097#4,6:166\n81#5:172\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:135\n64#1:136\n65#1:137\n69#1:138\n69#1:139\n72#1:146\n72#1:147\n81#1:154,3\n97#1:163,3\n69#1:140,6\n72#1:148,6\n81#1:157,6\n97#1:166,6\n72#1:172\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f5896p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5897q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5898r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, TextStyle textStyle) {
            super(3);
            this.f5896p0 = i10;
            this.f5897q0 = i11;
            this.f5898r0 = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifierM322heightInVpY3zN4;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 408240218);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408240218, iA, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
            }
            int i10 = this.f5896p0;
            int i11 = this.f5897q0;
            HeightInLinesModifierKt.validateMinMaxLines(i10, i11);
            if (i10 == 1 && i11 == Integer.MAX_VALUE) {
                modifierM322heightInVpY3zN4 = Modifier.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
            } else {
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer2.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                composer2.startReplaceableGroup(511388516);
                TextStyle textStyle = this.f5898r0;
                boolean zChanged = composer2.changed(textStyle) | composer2.changed(layoutDirection);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextStyle textStyle2 = (TextStyle) objRememberedValue;
                composer2.startReplaceableGroup(511388516);
                boolean zChanged2 = composer2.changed(resolver) | composer2.changed(textStyle2);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle2.getFontFamily();
                    FontWeight fontWeight = textStyle2.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM3990getFontStyle4Lr2A7w = textStyle2.m3990getFontStyle4Lr2A7w();
                    int iM4065unboximpl = fontStyleM3990getFontStyle4Lr2A7w != null ? fontStyleM3990getFontStyle4Lr2A7w.m4065unboximpl() : FontStyle.INSTANCE.m4067getNormal_LCdwA();
                    FontSynthesis fontSynthesisM3991getFontSynthesisZQGJjVo = textStyle2.m3991getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo4038resolveDPcqOEQ(fontFamily, fontWeight, iM4065unboximpl, fontSynthesisM3991getFontSynthesisZQGJjVo != null ? fontSynthesisM3991getFontSynthesisZQGJjVo.getF17996a() : FontSynthesis.INSTANCE.m4077getAllGVVA2EU());
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged3 = false;
                for (int i12 = 0; i12 < 5; i12++) {
                    zChanged3 |= composer2.changed(objArr[i12]);
                }
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m4548getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged4 = false;
                for (int i13 = 0; i13 < 5; i13++) {
                    zChanged4 |= composer2.changed(objArr2[i13]);
                }
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m4548getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
                Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
                modifierM322heightInVpY3zN4 = SizeKt.m322heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo406toDpu2uoSUM(numValueOf.intValue()) : Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo406toDpu2uoSUM(numValueOf2.intValue()) : Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
            }
            return modifierM322heightInVpY3zN4;
        }
    }

    @NotNull
    public static final Modifier heightInLines(@NotNull Modifier modifier, @NotNull final TextStyle textStyle, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "heightInLines").set("minLines", Integer.valueOf(i10));
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("maxLines", Integer.valueOf(i11));
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("textStyle", textStyle);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(i10, i11, textStyle));
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 1;
        }
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i10, i11);
    }

    public static final void validateMinMaxLines(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(androidx.collection.k.c("both minLines ", i10, " and maxLines ", i11, " must be greater than zero").toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(n1.e("minLines ", i10, " must be less than or equal to maxLines ", i11).toString());
        }
    }
}
