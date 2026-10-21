package com.bbva.networkplugin.command.params;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RequestParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/bbva/networkplugin/command/params/RequestParams;", "", "url", "", "params", "Lcom/google/gson/JsonElement;", "headers", "", "multipart", "Lcom/bbva/networkplugin/command/params/Multipart;", "timeout", "", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Ljava/util/Map;Lcom/bbva/networkplugin/command/params/Multipart;Ljava/lang/Integer;)V", "getHeaders", "()Ljava/util/Map;", "getMultipart", "()Lcom/bbva/networkplugin/command/params/Multipart;", "getParams", "()Lcom/google/gson/JsonElement;", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "()Ljava/lang/String;", "network-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestParams {

    @Nullable
    private final Map<String, String> headers;

    @Nullable
    private final Multipart multipart;

    @Nullable
    private final JsonElement params;

    @Nullable
    private final Integer timeout;

    @NotNull
    private final String url;

    public RequestParams(@NotNull String url, @Nullable JsonElement jsonElement, @Nullable Map<String, String> map, @Nullable Multipart multipart, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.params = jsonElement;
        this.headers = map;
        this.multipart = multipart;
        this.timeout = num;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final Multipart getMultipart() {
        return this.multipart;
    }

    @Nullable
    public final JsonElement getParams() {
        return this.params;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ RequestParams(String str, JsonElement jsonElement, Map map, Multipart multipart, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonElement, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : multipart, (i10 & 16) != 0 ? null : num);
    }
}
