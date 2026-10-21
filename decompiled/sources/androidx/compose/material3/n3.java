package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13007p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13008q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13009r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13010s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f13011t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f13012u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f13013w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, TextStyle textStyle, long j10, long j11, int i10, boolean z10) {
        super(2);
        this.f13007p0 = function2;
        this.f13008q0 = function3;
        this.f13009r0 = function4;
        this.f13010s0 = textStyle;
        this.f13011t0 = j10;
        this.f13012u0 = j11;
        this.v0 = i10;
        this.f13013w0 = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835891690, iIntValue, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:115)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f13007p0;
            int i10 = this.v0;
            if (function2 == null) {
                composer2.startReplaceableGroup(-2104362496);
                int i11 = ((i10 >> 27) & 14) | 48 | (i10 & 896);
                int i12 = i10 >> 9;
                SnackbarKt.m1249access$OneRowSnackbarkKq0p4A(this.f13008q0, null, this.f13009r0, this.f13010s0, this.f13011t0, this.f13012u0, composer2, (57344 & i12) | i11 | (458752 & i12));
                composer2.endReplaceableGroup();
            } else if (this.f13013w0) {
                composer2.startReplaceableGroup(-2104362182);
                int i13 = ((i10 >> 27) & 14) | (i10 & 112) | (i10 & 896);
                int i14 = i10 >> 9;
                SnackbarKt.m1248access$NewLineButtonSnackbarkKq0p4A(this.f13008q0, this.f13007p0, this.f13009r0, this.f13010s0, this.f13011t0, this.f13012u0, composer2, (57344 & i14) | i13 | (458752 & i14));
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-2104361902);
                int i15 = ((i10 >> 27) & 14) | (i10 & 112) | (i10 & 896);
                int i16 = i10 >> 9;
                SnackbarKt.m1249access$OneRowSnackbarkKq0p4A(this.f13008q0, this.f13007p0, this.f13009r0, this.f13010s0, this.f13011t0, this.f13012u0, composer2, (57344 & i16) | i15 | (458752 & i16));
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
