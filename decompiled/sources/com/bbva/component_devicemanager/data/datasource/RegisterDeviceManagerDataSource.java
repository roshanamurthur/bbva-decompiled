package com.bbva.component_devicemanager.data.datasource;

import com.bbva.component_devicemanager.data.datasource.request.NetworkRequestBuilder;
import com.bbva.component_devicemanager.domain.model.DeviceManagerData;
import com.bbva.network.NetworkWorker;
import com.bbva.network.model.NetworkRequest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterDeviceManagerDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/component_devicemanager/data/datasource/RegisterDeviceManagerDataSource;", "", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerData;", "data", "", "register", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component_devicemanager/data/datasource/request/NetworkRequestBuilder;", "networkRequestBuilder", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component_devicemanager/data/datasource/request/NetworkRequestBuilder;)V", "Companion", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class RegisterDeviceManagerDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f28883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkRequestBuilder f28884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28885c;

    public RegisterDeviceManagerDataSource(@NotNull NetworkWorker worker, @NotNull NetworkRequestBuilder networkRequestBuilder) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(networkRequestBuilder, "networkRequestBuilder");
        this.f28883a = worker;
        this.f28884b = networkRequestBuilder;
    }

    public final void register(@NotNull DeviceManagerData data) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        while (this.f28885c < 2) {
            NetworkRequest networkRequestBuild = this.f28884b.build(data);
            this.f28885c++;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (this.f28883a.execute(networkRequestBuild).isSuccessful()) {
                    this.f28885c++;
                }
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m5540isFailureimpl(objM5535constructorimpl);
        }
    }
}
