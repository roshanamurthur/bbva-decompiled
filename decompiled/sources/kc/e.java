package kc;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.ui.compose.TextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f79302p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f79303q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f79304r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f79305s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, long j10, String str) {
        super(2);
        this.f79302p0 = str;
        this.f79303q0 = i10;
        this.f79304r0 = j10;
        this.f79305s0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        TextFieldKt.m4983access$BottomTextXOJAsU(this.f79302p0, this.f79303q0, this.f79304r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f79305s0 | 1));
        return Unit.INSTANCE;
    }
}
