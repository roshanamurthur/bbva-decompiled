package l0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ TextFieldColors E0;
    public final /* synthetic */ MutableInteractionSource F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ int I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f82701p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f82702q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f82703r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f82704s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f82705t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82706u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82707w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82708x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82709y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m3(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, boolean z10, Function1<? super Boolean, Unit> function3, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i10, int i11, int i12) {
        super(2);
        this.f82701p0 = str;
        this.f82702q0 = function1;
        this.f82703r0 = function2;
        this.f82704s0 = z10;
        this.f82705t0 = function3;
        this.f82706u0 = modifier;
        this.v0 = z11;
        this.f82707w0 = function4;
        this.f82708x0 = function5;
        this.f82709y0 = function6;
        this.E0 = textFieldColors;
        this.F0 = mutableInteractionSource;
        this.G0 = i10;
        this.H0 = i11;
        this.I0 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SearchBarKt.access$SearchBarInputField(this.f82701p0, this.f82702q0, this.f82703r0, this.f82704s0, this.f82705t0, this.f82706u0, this.v0, this.f82707w0, this.f82708x0, this.f82709y0, this.E0, this.F0, composer, RecomposeScopeImplKt.updateChangedFlags(this.G0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.H0), this.I0);
        return Unit.INSTANCE;
    }
}
