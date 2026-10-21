package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import mx.openpay.library.domain.model.EnvironmentConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lmx/openpay/library/core/model/OpenPayEnvironmentFactory;", "", "()V", "createDevelopmentCertificationEnvironment", "Lmx/openpay/library/core/model/OpenPayEnvironment;", "createDevelopmentEnvironment", "createProductionEnvironment", "createQAEnvironment", "createSandboxEnvironment", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OpenPayEnvironmentFactory {
    public static final int $stable = 0;

    @NotNull
    public static final OpenPayEnvironmentFactory INSTANCE = new OpenPayEnvironmentFactory();

    @NotNull
    public final OpenPayEnvironment createDevelopmentCertificationEnvironment() {
        return new OpenPayEnvironment(EnvironmentConstants.DEVELOPMENT_CERTIFICATION_ENV, "https://bhg54irur9.execute-api.us-east-1.amazonaws.com/api-sdk-services-jws/{country}/", 30L, true);
    }

    @NotNull
    public final OpenPayEnvironment createDevelopmentEnvironment() {
        return new OpenPayEnvironment(EnvironmentConstants.DEVELOPMENT_ENV, "https://bhg54irur9.execute-api.us-east-1.amazonaws.com/api-sdk-services-jws/{country}/", 45L, true);
    }

    @NotNull
    public final OpenPayEnvironment createProductionEnvironment() {
        return new OpenPayEnvironment(EnvironmentConstants.PRODUCTION_ENV, "https://vr1rnbgl72.execute-api.us-east-1.amazonaws.com/api-sdk-services-jws/{country}/", 30L, false);
    }

    @NotNull
    public final OpenPayEnvironment createQAEnvironment() {
        return new OpenPayEnvironment(EnvironmentConstants.QA_ENV, "https://wl54ey80j7.execute-api.us-east-1.amazonaws.com/api-sdk-services-jws/{country}/", 0L, true, 4, null);
    }

    @NotNull
    public final OpenPayEnvironment createSandboxEnvironment() {
        return new OpenPayEnvironment(EnvironmentConstants.SANDBOX_ENV, "https://nhmj9y9i9h.execute-api.us-east-1.amazonaws.com/api-sdk-services-jws/{country}/", 35L, true);
    }
}
