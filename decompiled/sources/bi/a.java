package bi;

import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.listeners.OnCompleteListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SonicController f25225p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OnCompleteListener f25226q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SonicController sonicController, OnCompleteListener onCompleteListener) {
        super(0);
        this.f25225p0 = sonicController;
        this.f25226q0 = onCompleteListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25225p0.a(this.f25226q0);
        return Unit.INSTANCE;
    }
}
