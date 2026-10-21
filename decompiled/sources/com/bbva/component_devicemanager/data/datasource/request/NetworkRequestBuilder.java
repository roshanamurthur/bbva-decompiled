package com.bbva.component_devicemanager.data.datasource.request;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.component_devicemanager.domain.model.DeviceManagerData;
import com.bbva.component_devicemanager.domain.model.DeviceManagerRequestConfig;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkRequestBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/component_devicemanager/data/datasource/request/NetworkRequestBuilder;", "", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerData;", "data", "Lcom/bbva/network/model/NetworkRequest;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerRequestConfig;", "deviceManagerRequestConfig", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/component_devicemanager/domain/model/DeviceManagerRequestConfig;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class NetworkRequestBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f28886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceManagerRequestConfig f28887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gson f28888c;

    /* JADX INFO: compiled from: NetworkRequestBuilder.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DeviceManagerData f28890q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceManagerData deviceManagerData) {
            super(1);
            this.f28890q0 = deviceManagerData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            NetworkRequestBuilder networkRequestBuilder = NetworkRequestBuilder.this;
            request.setUrl(NetworkRequestBuilder.access$buildUrl(networkRequestBuilder));
            request.setHeaders(networkRequestBuilder.f28887b.getHeaders());
            request.setMethod(networkRequestBuilder.f28887b.getMethod());
            request.setBody(NetworkRequestBuilder.access$buildBody(networkRequestBuilder, this.f28890q0));
            return Unit.INSTANCE;
        }
    }

    public NetworkRequestBuilder(@NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull DeviceManagerRequestConfig deviceManagerRequestConfig) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(deviceManagerRequestConfig, "deviceManagerRequestConfig");
        this.f28886a = rememberedUserDataSource;
        this.f28887b = deviceManagerRequestConfig;
        this.f28888c = new Gson();
    }

    public static final NetworkRequestBody.RequestBody access$buildBody(NetworkRequestBuilder networkRequestBuilder, DeviceManagerData deviceManagerData) {
        byte[] bytes = networkRequestBuilder.f28888c.toJson(deviceManagerData).toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new NetworkRequestBody.RequestBody(bytes, "application/json");
    }

    public static final String access$buildUrl(NetworkRequestBuilder networkRequestBuilder) {
        String document = networkRequestBuilder.f28886a.getDocument();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        DeviceManagerRequestConfig deviceManagerRequestConfig = networkRequestBuilder.f28887b;
        return u.f(deviceManagerRequestConfig.getUrlHost(), ai.a.i(new Object[]{document}, 1, deviceManagerRequestConfig.getUrlPath(), "format(format, *args)"));
    }

    @NotNull
    public final NetworkRequest build(@NotNull DeviceManagerData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return MutableNetworkRequestKt.request(new a(data));
    }
}
