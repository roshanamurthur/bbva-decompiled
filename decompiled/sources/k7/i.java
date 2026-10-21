package k7;

import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LimitValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79228p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ValidationConfig validationConfig) {
        super(0);
        this.f79228p0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ValidationConfig validationConfig = this.f79228p0;
        return Boolean.valueOf(validationConfig.getPassword().length() <= validationConfig.getPolicy().getLimit().getLength());
    }
}
