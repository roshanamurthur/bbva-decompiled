package l0;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f83048p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f83049q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f83050r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f83051s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f83052t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Integer f83053u0;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f83054w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, Function3 function3, int i11) {
        super(2);
        this.f83048p0 = windowInsets;
        this.f83049q0 = subcomposeMeasureScope;
        this.f83050r0 = arrayList;
        this.f83051s0 = i10;
        this.f83052t0 = arrayList2;
        this.f83053u0 = num;
        this.v0 = function3;
        this.f83054w0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Integer num2;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1643221465, iIntValue, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:220)");
            }
            WindowInsets windowInsets = this.f83048p0;
            SubcomposeMeasureScope subcomposeMeasureScope = this.f83049q0;
            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
            this.v0.invoke(PaddingKt.m292PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), this.f83050r0.isEmpty() ? paddingValuesAsPaddingValues.getTop() : subcomposeMeasureScope.mo406toDpu2uoSUM(this.f83051s0), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (this.f83052t0.isEmpty() || (num2 = this.f83053u0) == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope.mo406toDpu2uoSUM(num2.intValue())), composer2, Integer.valueOf((this.f83054w0 >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
