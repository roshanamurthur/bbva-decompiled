package mx.openpay.library.domain.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Environment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/model/EnvironmentConstants;", "", "()V", "DEVELOPMENT_CERTIFICATION_ENV", "", "DEVELOPMENT_ENV", "PRODUCTION_ENV", "QA_ENV", "SANDBOX_ENV", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EnvironmentConstants {

    @NotNull
    public static final String DEVELOPMENT_CERTIFICATION_ENV = "DevelopmentCertification";

    @NotNull
    public static final String DEVELOPMENT_ENV = "Development";

    @NotNull
    public static final EnvironmentConstants INSTANCE = new EnvironmentConstants();

    @NotNull
    public static final String PRODUCTION_ENV = "Production";

    @NotNull
    public static final String QA_ENV = "QA";

    @NotNull
    public static final String SANDBOX_ENV = "Sandbox";
}
