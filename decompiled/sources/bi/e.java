package bi;

import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.listeners.OnCompleteListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SonicController f25233p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OnCompleteListener f25234q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SonicController sonicController, OnCompleteListener onCompleteListener) {
        super(0);
        this.f25233p0 = sonicController;
        this.f25234q0 = onCompleteListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25233p0.a(this.f25234q0);
        return Unit.INSTANCE;
    }
}
