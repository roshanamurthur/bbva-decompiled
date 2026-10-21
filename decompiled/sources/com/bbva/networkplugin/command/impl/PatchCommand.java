package com.bbva.networkplugin.command.impl;

import bk.q;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.networkplugin.command.HttpOperationCommand;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.net.EndPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: PatchCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/networkplugin/command/impl/PatchCommand;", "Lcom/bbva/networkplugin/command/HttpOperationCommand;", "Lcom/bbva/networkplugin/command/params/RequestParams;", "req", "Lorg/json/JSONObject;", "executeHttpCommand", "Lcom/bbva/networkplugin/net/EndPoint;", "endPoint", "<init>", "(Lcom/bbva/networkplugin/net/EndPoint;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PatchCommand extends HttpOperationCommand {

    @NotNull
    public static final String ID = "patch";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final EndPoint f35238p0;

    /* JADX INFO: compiled from: PatchCommand.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RequestParams f35239p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RequestParams requestParams) {
            super(1);
            this.f35239p0 = requestParams;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setMethod(Method.PATCH);
            RequestParams requestParams = this.f35239p0;
            request.setUrl(requestParams.getUrl());
            Map<String, String> headers = requestParams.getHeaders();
            if (headers == null) {
                headers = q.emptyMap();
            }
            request.setHeaders(headers);
            request.setTimeout(requestParams.getTimeout());
            MutableNetworkRequest.body$default(request, String.valueOf(requestParams.getParams()), (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public PatchCommand(@NotNull EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        this.f35238p0 = endPoint;
    }

    @Override // com.bbva.networkplugin.command.HttpOperationCommand
    @NotNull
    public JSONObject executeHttpCommand(@NotNull RequestParams req) {
        Intrinsics.checkNotNullParameter(req, "req");
        return this.f35238p0.execute(MutableNetworkRequestKt.request(new a(req)));
    }
}
