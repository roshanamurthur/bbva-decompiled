package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Float f8801p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8802q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f8803r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f8804s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(int i10, long j10, Float f6, Function2 function2) {
        super(2);
        this.f8801p0 = f6;
        this.f8802q0 = function2;
        this.f8803r0 = i10;
        this.f8804s0 = j10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132188434, iIntValue, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
            }
            int i10 = this.f8803r0;
            Function2<Composer, Integer, Unit> function2 = this.f8802q0;
            Float f6 = this.f8801p0;
            if (f6 != null) {
                composer2.startReplaceableGroup(-452621938);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f6)}, function2, composer2, ((i10 >> 6) & 112) | 8);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-452621758);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(this.f8804s0)))}, function2, composer2, ((i10 >> 6) & 112) | 8);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
