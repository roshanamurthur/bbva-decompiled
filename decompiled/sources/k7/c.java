package k7;

import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AllowValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f79218p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79219q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, ValidationConfig validationConfig) {
        super(0);
        this.f79218p0 = z10;
        this.f79219q0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!(this.f79219q0.getPolicy().getAllow().getSpecial() ^ this.f79218p0));
    }
}
