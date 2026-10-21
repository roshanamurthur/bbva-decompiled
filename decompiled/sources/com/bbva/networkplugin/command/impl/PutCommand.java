package com.bbva.networkplugin.command.impl;

import android.app.Application;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.networkplugin.command.HttpOperationCommand;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.command.request.RequestCreator;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.networkplugin.utils.FileActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: PutCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/bbva/networkplugin/command/impl/PutCommand;", "Lcom/bbva/networkplugin/command/HttpOperationCommand;", "Lcom/bbva/networkplugin/command/params/RequestParams;", "req", "Lorg/json/JSONObject;", "executeHttpCommand", "Lcom/bbva/networkplugin/net/EndPoint;", "endPoint", "Lcom/bbva/networkplugin/utils/FileActions;", "fileActions", "Lcom/bbva/networkplugin/command/request/RequestCreator;", "requestCreator", "<init>", "(Lcom/bbva/networkplugin/net/EndPoint;Lcom/bbva/networkplugin/utils/FileActions;Lcom/bbva/networkplugin/command/request/RequestCreator;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PutCommand extends HttpOperationCommand {

    @NotNull
    public static final String ID = "put";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final EndPoint f35243p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final FileActions f35244q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final RequestCreator f35245r0;

    public /* synthetic */ PutCommand(EndPoint endPoint, FileActions fileActions, RequestCreator requestCreator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPoint, fileActions, (i10 & 4) != 0 ? new RequestCreator(fileActions) : requestCreator);
    }

    @Override // com.bbva.networkplugin.command.HttpOperationCommand
    @NotNull
    public JSONObject executeHttpCommand(@NotNull RequestParams req) {
        FileActions fileActions = this.f35244q0;
        Intrinsics.checkNotNullParameter(req, "req");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        NetworkRequest networkRequestCreate = this.f35245r0.create(mApplication, Method.PUT, req);
        try {
            return this.f35243p0.execute(networkRequestCreate);
        } finally {
            fileActions.delete$network_plugin_release(networkRequestCreate);
        }
    }

    public PutCommand(@NotNull EndPoint endPoint, @NotNull FileActions fileActions, @NotNull RequestCreator requestCreator) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(fileActions, "fileActions");
        Intrinsics.checkNotNullParameter(requestCreator, "requestCreator");
        this.f35243p0 = endPoint;
        this.f35244q0 = fileActions;
        this.f35245r0 = requestCreator;
    }
}
