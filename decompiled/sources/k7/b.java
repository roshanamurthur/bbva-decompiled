package k7;

import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AllowValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f79216p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79217q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, ValidationConfig validationConfig) {
        super(0);
        this.f79216p0 = z10;
        this.f79217q0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!(this.f79217q0.getPolicy().getAllow().getNumbers() ^ this.f79216p0));
    }
}
