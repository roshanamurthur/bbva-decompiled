package k7;

import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RequireValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValidationEvaluation f79239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79240q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ValidationConfig validationConfig, ValidationEvaluation validationEvaluation) {
        super(0);
        this.f79239p0 = validationEvaluation;
        this.f79240q0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.f79239p0.getQuality() >= this.f79240q0.getPolicy().getRequire().getQuality());
    }
}
