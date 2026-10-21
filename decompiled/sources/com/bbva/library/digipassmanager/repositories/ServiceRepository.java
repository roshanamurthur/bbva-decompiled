package com.bbva.library.digipassmanager.repositories;

import android.content.Context;
import com.bbva.library.digipassmanager.callbacks.OnResponseOperation;
import com.bbva.library.digipassmanager.datasources.ServiceDataSource;
import com.bbva.library.digipassmanager.helpers.RepositoryHelper;
import com.bbva.library.digipassmanager.models.ActivateTokenRequest;
import com.bbva.library.digipassmanager.models.CreateTokenRequest;
import com.bbva.library.digipassmanager.models.Request;
import com.bbva.library.digipassmanager.models.ValidateTokenRequest;
import com.bbva.network.model.pinning.PinningCatalog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/library/digipassmanager/repositories/ServiceRepository;", "", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "", "setPinningCatalog$digipassmanager_library_release", "(Lcom/bbva/network/model/pinning/PinningCatalog;)V", "setPinningCatalog", "Lcom/bbva/library/digipassmanager/models/Request;", "request", "Lcom/bbva/library/digipassmanager/callbacks/OnResponseOperation;", "callback", "fetchRequest", "Companion", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final class ServiceRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile ServiceRepository f34975b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ServiceDataSource f34976a;

    /* JADX INFO: compiled from: ServiceRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/library/digipassmanager/repositories/ServiceRepository$Companion;", "", "()V", "INSTANCE", "Lcom/bbva/library/digipassmanager/repositories/ServiceRepository;", "getInstance", "context", "Landroid/content/Context;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized ServiceRepository getInstance(@NotNull Context context) {
            ServiceRepository serviceRepository;
            Intrinsics.checkNotNullParameter(context, "context");
            serviceRepository = ServiceRepository.f34975b;
            if (serviceRepository == null) {
                serviceRepository = new ServiceRepository(context, null);
                ServiceRepository.f34975b = serviceRepository;
            }
            return serviceRepository;
        }
    }

    public ServiceRepository(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this.f34976a = new ServiceDataSource(context);
    }

    public final void fetchRequest(@NotNull Request request, @NotNull OnResponseOperation callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (request instanceof CreateTokenRequest) {
            CreateTokenRequest createTokenRequest = (CreateTokenRequest) request;
            this.f34976a.executeRequest(createTokenRequest.getOperationCode(), createTokenRequest.getMethod(), createTokenRequest.getUrl(), createTokenRequest.getBody(), createTokenRequest.getHeaders(), callback);
        } else if (request instanceof ValidateTokenRequest) {
            ValidateTokenRequest validateTokenRequest = (ValidateTokenRequest) request;
            this.f34976a.executeRequest(validateTokenRequest.getOperationCode(), validateTokenRequest.getMethod(), new RepositoryHelper().formatUrlWithQueryParamsAndFormat(validateTokenRequest.getUrl(), validateTokenRequest.getQueryParams()), validateTokenRequest.getBody(), validateTokenRequest.getHeaders(), callback);
        } else if (request instanceof ActivateTokenRequest) {
            ActivateTokenRequest activateTokenRequest = (ActivateTokenRequest) request;
            this.f34976a.executeRequest(activateTokenRequest.getOperationCode(), activateTokenRequest.getMethod(), new RepositoryHelper().formatUrlWithQueryParamsAndFormat(activateTokenRequest.getUrl(), activateTokenRequest.getQueryParams()), activateTokenRequest.getBody(), activateTokenRequest.getHeaders(), callback);
        }
    }

    public final void setPinningCatalog$digipassmanager_library_release(@Nullable PinningCatalog pinningCatalog) {
        this.f34976a.setPinningCatalog$digipassmanager_library_release(pinningCatalog);
    }
}
