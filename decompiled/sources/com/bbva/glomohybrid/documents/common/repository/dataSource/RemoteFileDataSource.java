package com.bbva.glomohybrid.documents.common.repository.dataSource;

import androidx.camera.core.impl.utils.a;
import bk.p;
import bk.q;
import com.bbva.glomohybrid.documents.common.model.FileResponse;
import com.bbva.glomohybrid.documents.common.model.GenericOpenDocumentException;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.Body;
import com.bbva.network.multipart_extensions.response.MultipartBody;
import com.bbva.network.multipart_extensions.response.MultipartNetworkResponse;
import com.bbva.network.multipart_extensions.response.NetworkBodyPart;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import o8.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: RemoteFileDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/RemoteFileDataSource;", "", "Lcom/bbva/network/constant/Method;", "requestMethod", "", "requestUrl", "", "requestHeaders", "requestQueryParams", "requestBody", "Lcom/bbva/glomohybrid/documents/common/model/FileResponse;", FetchCommand.ID, "Lcom/bbva/network/NetworkWorker;", "networkWorker", "defaultHeaders", "<init>", "(Lcom/bbva/network/NetworkWorker;Ljava/util/Map;)V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRemoteFileDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteFileDataSource.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/RemoteFileDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,97:1\n1#2:98\n125#3:99\n152#3,3:100\n*S KotlinDebug\n*F\n+ 1 RemoteFileDataSource.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/RemoteFileDataSource\n*L\n60#1:99\n60#1:100,3\n*E\n"})
public final class RemoteFileDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f32086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f32087b;

    public RemoteFileDataSource(@NotNull NetworkWorker networkWorker, @NotNull Map<String, String> defaultHeaders) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(defaultHeaders, "defaultHeaders");
        this.f32086a = networkWorker;
        this.f32087b = defaultHeaders;
    }

    public static InputStream a(NetworkResponse networkResponse) {
        String str = networkResponse.getRequest().getHeaders().get(DigipassManagerConstants.KEY_CONTENT_TYPE);
        if (str == null) {
            str = DiskFileDataSource.APPLICATION_PDF;
        }
        if (!Intrinsics.areEqual(str, DiskFileDataSource.APPLICATION_PDF)) {
            byte[] bytes = ((NetworkBodyPart) MultipartBody.parts$default(new MultipartNetworkResponse(networkResponse).getMultipartBody(), str, false, 2, null).get(0)).getString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        InputStream inputStream = networkResponse.getBody().inputStream();
        if (inputStream != null) {
            return inputStream;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final String access$formatUrlWithQueryParams(RemoteFileDataSource remoteFileDataSource, String str, Map map) {
        remoteFileDataSource.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null);
        return strJoinToString$default.length() > 0 ? a.b(str, "?", strJoinToString$default) : str;
    }

    public static final NetworkRequestBody access$getNetworkRequestBody(RemoteFileDataSource remoteFileDataSource, Map map) {
        remoteFileDataSource.getClass();
        String string = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new NetworkRequestBody.RequestBody(bytes, "application/json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileResponse fetch$default(RemoteFileDataSource remoteFileDataSource, Method method, String str, Map map, Map map2, Map map3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = q.emptyMap();
        }
        Map map4 = map;
        if ((i10 & 8) != 0) {
            map2 = q.emptyMap();
        }
        return remoteFileDataSource.fetch(method, str, map4, map2, map3);
    }

    @NotNull
    public final FileResponse fetch(@NotNull Method requestMethod, @NotNull String requestUrl, @NotNull Map<String, String> requestHeaders, @NotNull Map<String, String> requestQueryParams, @Nullable Map<String, ? extends Object> requestBody) {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        String strString;
        Map<String, String> mapEmptyMap;
        Body body;
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(requestQueryParams, "requestQueryParams");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f32086a.execute(new b(this, requestUrl, requestQueryParams, requestHeaders, requestMethod, requestBody)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                NetworkResponse networkResponse = (NetworkResponse) objM5535constructorimpl;
                String str = networkResponse.getRequest().getHeaders().get(DigipassManagerConstants.KEY_CONTENT_TYPE);
                if (str == null) {
                    str = DiskFileDataSource.APPLICATION_PDF;
                }
                objM5535constructorimpl2 = Result.m5535constructorimpl(new FileResponse(str, a(networkResponse)));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl == null) {
            ResultKt.throwOnFailure(objM5535constructorimpl2);
            return (FileResponse) objM5535constructorimpl2;
        }
        Intrinsics.checkNotNull(thM5538exceptionOrNullimpl, "null cannot be cast to non-null type com.bbva.network.exceptions.ConnectionException");
        ConnectionException connectionException = (ConnectionException) thM5538exceptionOrNullimpl;
        NetworkResponse networkResponse2 = connectionException.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        int code = networkResponse2 != null ? networkResponse2.getCode() : -1;
        NetworkResponse networkResponse3 = connectionException.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        if (networkResponse3 == null || (body = networkResponse3.getBody()) == null || (strString = body.string()) == null) {
            strString = "Empty body";
        }
        NetworkResponse networkResponse4 = connectionException.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        if (networkResponse4 == null || (mapEmptyMap = networkResponse4.getHeaders()) == null) {
            mapEmptyMap = q.emptyMap();
        }
        throw new GenericOpenDocumentException(code, strString, mapEmptyMap);
    }

    public /* synthetic */ RemoteFileDataSource(NetworkWorker networkWorker, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkWorker, (i10 & 2) != 0 ? p.mapOf(TuplesKt.to("enabled", "true")) : map);
    }
}
