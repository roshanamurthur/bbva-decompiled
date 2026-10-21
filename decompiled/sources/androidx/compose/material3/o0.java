package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$WeekDays$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,1920:1\n79#2,2:1921\n81#2:1949\n85#2:2000\n75#3:1923\n76#3,11:1925\n75#3:1963\n76#3,11:1965\n89#3:1993\n89#3:1999\n76#4:1924\n76#4:1964\n460#5,13:1936\n36#5:1951\n460#5,13:1976\n473#5,3:1990\n473#5,3:1996\n1855#6:1950\n1856#6:1995\n1114#7,6:1952\n68#8,5:1958\n73#8:1989\n77#8:1994\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$WeekDays$1$1\n*L\n1370#1:1921,2\n1370#1:1949\n1370#1:2000\n1370#1:1923\n1370#1:1925,11\n1380#1:1963\n1380#1:1965,11\n1380#1:1993\n1370#1:1999\n1370#1:1924\n1380#1:1964\n1370#1:1936,13\n1382#1:1951\n1380#1:1976,13\n1380#1:1990,3\n1370#1:1996,3\n1379#1:1950\n1379#1:1995\n1382#1:1952,6\n1380#1:1958,5\n1380#1:1989\n1380#1:1994\n*E\n"})
public final class o0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ArrayList<Pair<String, String>> f13025p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ArrayList<Pair<String, String>> arrayList) {
        super(2);
        this.f13025p0 = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133710592, iIntValue, -1, "androidx.compose.material3.WeekDays.<anonymous>.<anonymous> (DatePicker.kt:1368)");
            }
            Alignment alignment = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, DatePickerKt.getRecommendedSizeForAccessibility(), 1, null), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer2, 54);
            int i10 = -1323940314;
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ?? r12 = 0;
            int i11 = 2058660585;
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(784203502);
            Iterator it = this.f13025p0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(pair);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new n0(pair);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) objRememberedValue), DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility());
                Alignment center = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, r12, composer2, 6);
                Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, i10);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM337sizeVpY3zN4);
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
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, density2));
                ai.a.j(r12, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, i11);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer3 = composer2;
                TextKt.m1389Text4IGK_g((String) pair.getSecond(), SizeKt.wrapContentSize$default(companion2, alignment, r12, 3, alignment), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 48, 0, 130556);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                i11 = i11;
                r12 = r12 == true ? 1 : 0;
                alignment = alignment;
                i10 = i10;
                composer2 = composer3;
            }
            if (androidx.databinding.e.e(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
