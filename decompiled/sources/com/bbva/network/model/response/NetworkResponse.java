package com.bbva.network.model.response;

import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.body.Body;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'2\u0006\u0010%\u001a\u00020\fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR:\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f`\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001b¨\u0006("}, d2 = {"Lcom/bbva/network/model/response/NetworkResponse;", "", "body", "Lcom/bbva/network/model/response/body/Body;", "getBody", "()Lcom/bbva/network/model/response/body/Body;", "code", "", "getCode", "()I", "header", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getHeader$annotations", "()V", "getHeader", "()Ljava/util/HashMap;", "headers", "", "getHeaders", "()Ljava/util/Map;", "isSuccessful", "", "()Z", "message", "getMessage", "()Ljava/lang/String;", "request", "Lcom/bbva/network/model/NetworkRequest;", "getRequest", "()Lcom/bbva/network/model/NetworkRequest;", "url", "getUrl", "handshake", "Lcom/bbva/network/model/response/NetworkHandshake;", "isMultiHeader", "name", "multiHeader", "", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkResponse {
    @NotNull
    Body getBody();

    int getCode();

    @NotNull
    HashMap<String, String> getHeader();

    @NotNull
    Map<String, String> getHeaders();

    @NotNull
    String getMessage();

    @NotNull
    NetworkRequest getRequest();

    @NotNull
    String getUrl();

    @NotNull
    NetworkHandshake handshake();

    boolean isMultiHeader(@NotNull String name);

    boolean isSuccessful();

    @Nullable
    List<String> multiHeader(@NotNull String name);

    /* JADX INFO: compiled from: NetworkResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isMultiHeader(@NotNull NetworkResponse networkResponse, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return false;
        }

        @Nullable
        public static List<String> multiHeader(@NotNull NetworkResponse networkResponse, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "we are going to replace with the headers field", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        public static /* synthetic */ void getHeader$annotations() {
        }
    }
}
