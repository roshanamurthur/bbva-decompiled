package k7;

import com.bbva.ethermobilesdk.passchecker.extension.StringKt;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LimitValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79227p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ValidationConfig validationConfig) {
        super(0);
        this.f79227p0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ValidationConfig validationConfig = this.f79227p0;
        return Boolean.valueOf(StringKt.appearances(validationConfig.getPassword(), validationConfig.getPolicy().getLimit().getIdenticalChar()) == 0);
    }
}
