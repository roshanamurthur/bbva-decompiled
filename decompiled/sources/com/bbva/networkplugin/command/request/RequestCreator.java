package com.bbva.networkplugin.command.request;

import android.content.Context;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.utils.ExtensionsKt;
import com.bbva.networkplugin.utils.FileActions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import ta.b;
import ta.c;

/* JADX INFO: compiled from: RequestCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/networkplugin/command/request/RequestCreator;", "", "Landroid/content/Context;", "context", "Lcom/bbva/network/constant/Method;", "method", "Lcom/bbva/networkplugin/command/params/RequestParams;", "req", "Lcom/bbva/network/model/NetworkRequest;", "create", "Lcom/bbva/networkplugin/utils/FileActions;", "file", "<init>", "(Lcom/bbva/networkplugin/utils/FileActions;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCreator.kt\ncom/bbva/networkplugin/command/request/RequestCreator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class RequestCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileActions f35253a;

    public RequestCreator(@NotNull FileActions file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f35253a = file;
    }

    @NotNull
    public final NetworkRequest create(@NotNull Context context, @NotNull Method method, @NotNull RequestParams req) {
        NetworkRequest networkRequestRequest;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(req, "req");
        if (req.getMultipart() != null && (networkRequestRequest = MutableNetworkRequestKt.request(new b(method, req, this, context))) != null) {
            return networkRequestRequest;
        }
        Map<String, String> headers = req.getHeaders();
        return MutableNetworkRequestKt.request(new c(method, req, headers != null ? (String) ExtensionsKt.getIgnoreCase(headers, net.ipsoft.amelia.sdk.internal.c.c.f84798c) : null));
    }
}
