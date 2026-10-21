package com.bbva.glomohybrid.featureflags.repository.datasource;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.repository.mapper.FeatureFlagsMapper;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.salesforce.marketingcloud.config.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/repository/datasource/NetworkDataSource;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", FetchCommand.ID, "", a.f64109t, "Lcom/bbva/network/NetworkWorker;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "<init>", "(Ljava/lang/String;Lcom/bbva/network/NetworkWorker;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataSource.kt\ncom/bbva/glomohybrid/featureflags/repository/datasource/NetworkDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class NetworkDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f32162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsMapper f32163c;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkDataSource(@NotNull String endpoint, @NotNull NetworkWorker network) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(network, "network");
        this.f32161a = endpoint;
        this.f32162b = network;
        this.f32163c = new FeatureFlagsMapper(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final FeatureFlags fetch() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        NetworkResponse networkResponse;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f32162b.execute(MutableNetworkRequestKt.request(new t8.a(this))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                FeatureFlagsMapper featureFlagsMapper = this.f32163c;
                String strString = ((NetworkResponse) objM5535constructorimpl).getBody().string();
                if (strString == null) {
                    strString = "";
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl(featureFlagsMapper.map(strString));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null && (thM5538exceptionOrNullimpl instanceof ConnectionException) && ((networkResponse = ((ConnectionException) thM5538exceptionOrNullimpl).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String()) == null || networkResponse.getCode() != 304)) {
            LoggerKt.logCritical$default("featureflags-error", thM5538exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = null;
        }
        return (FeatureFlags) objM5535constructorimpl2;
    }
}
