package com.bbva.glomohybrid.profiling.repository.datasource;

import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.repository.mapper.ProfilingMapper;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.a;

/* JADX INFO: compiled from: NetworkProfilingDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/profiling/repository/datasource/NetworkProfilingDataSource;", "", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", FetchCommand.ID, "", "endPoint", "Lcom/bbva/network/NetworkWorker;", "netWorker", "<init>", "(Ljava/lang/String;Lcom/bbva/network/NetworkWorker;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkProfilingDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkProfilingDataSource.kt\ncom/bbva/glomohybrid/profiling/repository/datasource/NetworkProfilingDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class NetworkProfilingDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f33842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f33843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ProfilingMapper f33844c;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkProfilingDataSource(@NotNull String endPoint, @NotNull NetworkWorker netWorker) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(netWorker, "netWorker");
        this.f33842a = endPoint;
        this.f33843b = netWorker;
        this.f33844c = new ProfilingMapper(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Profiling fetch() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f33843b.execute(MutableNetworkRequestKt.request(new a(this))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                ProfilingMapper profilingMapper = this.f33844c;
                String strString = ((NetworkResponse) objM5535constructorimpl).getBody().string();
                if (strString == null) {
                    strString = "";
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl(profilingMapper.map(strString));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null && (thM5538exceptionOrNullimpl instanceof ConnectionException)) {
            LoggerKt.logCritical$default("profiling onFail", thM5538exceptionOrNullimpl, null, 4, null);
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = null;
        }
        return (Profiling) objM5535constructorimpl2;
    }
}
