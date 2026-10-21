package k7;

import com.bbva.ethermobilesdk.passchecker.extension.StringKt;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RequireValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79238p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ValidationConfig validationConfig) {
        super(0);
        this.f79238p0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ValidationConfig validationConfig = this.f79238p0;
        return Boolean.valueOf(StringKt.countNumbers(validationConfig.getPassword()) >= validationConfig.getPolicy().getRequire().getNumbers());
    }
}
