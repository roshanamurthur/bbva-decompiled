package com.bbva.ui.compose.theme;

import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt$BbvaTheme$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,482:1\n25#2:483\n1097#3,6:484\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/ThemeKt$BbvaTheme$1$1\n*L\n112#1:483\n112#1:484,6\n*E\n"})
public final class a extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f37623p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Typography f37624q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Function2<? super Composer, ? super Integer, Unit> function2, Typography typography) {
        super(2);
        this.f37623p0 = function2;
        this.f37624q0 = typography;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784119651, iIntValue, -1, "com.bbva.ui.compose.theme.BbvaTheme.<anonymous>.<anonymous> (Theme.kt:109)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            Colors colors = materialTheme.getColors(composer2, i10);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = TypeKt.applyFontFamily(this.f37624q0, TypeKt.getBentonSans());
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colors, (Typography) objRememberedValue, materialTheme.getShapes(composer2, i10), this.f37623p0, composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
