package bi;

import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.utils.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SonicController.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SonicController f25245p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f25246q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SonicController sonicController, SonicController.i iVar) {
        super(0);
        this.f25245p0 = sonicController;
        this.f25246q0 = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25245p0.f51430c = Status.ERROR;
        this.f25246q0.invoke();
        return Unit.INSTANCE;
    }
}
