package k7;

import com.bbva.ethermobilesdk.passchecker.extension.StringKt;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RequireValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79241p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ValidationConfig validationConfig) {
        super(0);
        this.f79241p0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ValidationConfig validationConfig = this.f79241p0;
        return Boolean.valueOf(StringKt.countSpecials(validationConfig.getPassword(), validationConfig.getPolicy().getAllow().getExtraValidChars()) >= validationConfig.getPolicy().getRequire().getSpecial());
    }
}
