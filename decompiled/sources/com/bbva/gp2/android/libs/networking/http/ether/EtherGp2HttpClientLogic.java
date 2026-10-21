package com.bbva.gp2.android.libs.networking.http.ether;

import bk.q;
import com.bbva.gp2.android.libs.networking.http.Gp2HttpClient;
import com.bbva.gp2.android.libs.networking.http.ether.responses.EtherResponseBody;
import com.bbva.gp2.android.libs.networking.http.exceptions.HttpConnectionException;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequest;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequestBody;
import com.bbva.gp2.android.libs.networking.http.requests.HttpRequestExtensionKt;
import com.bbva.gp2.android.libs.networking.http.requests.StringBody;
import com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse;
import com.bbva.gp2.android.libs.networking.http.responses.HttpResponse;
import com.bbva.gp2.android.libs.networking.http.responses.ImmutableHttpMultipartResponse;
import com.bbva.gp2.android.libs.networking.http.responses.ImmutableHttpResponse;
import com.bbva.gp2.android.libs.networking.http.responses.ResponseBodyPart;
import com.bbva.gp2.android.libs.networking.http.responses.ResponseUtilsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.multipart_extensions.ExtensionsKt;
import com.bbva.network.multipart_extensions.response.MultipartNetworkResponse;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherGp2HttpClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u001e\u0010\u001b\u001a\u00020\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0014\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/ether/EtherGp2HttpClientLogic;", "Lcom/bbva/gp2/android/libs/networking/http/Gp2HttpClient;", "worker", "Lcom/bbva/network/NetworkWorker;", "(Lcom/bbva/network/NetworkWorker;)V", "createBody", "Lcom/bbva/network/model/request/NetworkRequestBody;", "body", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestBody;", "contentType", "", "createEtherRequest", "Lcom/bbva/network/model/NetworkRequest;", "request", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequest;", "execute", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpResponse;", "executeMultipartMixed", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpMultipartResponse;", "executeMultipartOrThrow", "Lcom/bbva/network/multipart_extensions/response/MultipartNetworkResponse;", "executeOrThrow", "Lcom/bbva/network/model/response/NetworkResponse;", "getBodyPartList", "", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBodyPart;", "etherResponse", "getBoundaryFromResponse", "responseMap", "", "getResponseType", "createMutableNetworkRequest", "", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EtherGp2HttpClientLogic implements Gp2HttpClient {

    @NotNull
    private final NetworkWorker worker;

    public EtherGp2HttpClientLogic(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.worker = worker;
    }

    private final NetworkRequestBody createBody(HttpRequestBody body, String contentType) {
        if (body instanceof StringBody) {
            return new NetworkRequestBody.RequestBody(((StringBody) body).bytes(), contentType);
        }
        if (body == null) {
            return new NetworkRequestBody.RequestBody(null, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ NetworkRequestBody createBody$default(EtherGp2HttpClientLogic etherGp2HttpClientLogic, HttpRequestBody httpRequestBody, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return etherGp2HttpClientLogic.createBody(httpRequestBody, str);
    }

    private final NetworkRequest createEtherRequest(final HttpRequest request) {
        return MutableNetworkRequestKt.request(new Function1<MutableNetworkRequest, Unit>() { // from class: com.bbva.gp2.android.libs.networking.http.ether.EtherGp2HttpClientLogic.createEtherRequest.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
                invoke2(mutableNetworkRequest);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull MutableNetworkRequest request2) {
                Intrinsics.checkNotNullParameter(request2, "$this$request");
                request2.setUrl(request.getHttpRequestServerURI().getUrl());
                request2.setMethod(HttpRequestExtensionKt.mapMethod(request));
                Map<String, String> headers = request.getHeaders();
                if (headers == null) {
                    headers = q.emptyMap();
                }
                request2.setHeaders(headers);
                request2.setBody(EtherGp2HttpClientLogic.createBody$default(this, request.getBody(), null, 2, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createMutableNetworkRequest(MutableNetworkRequest mutableNetworkRequest, HttpRequest httpRequest) {
        mutableNetworkRequest.setMethod(HttpRequestExtensionKt.mapMethod(httpRequest));
        mutableNetworkRequest.setUrl(httpRequest.getHttpRequestServerURI().getUrl());
        Map<String, String> headers = httpRequest.getHeaders();
        if (headers == null) {
            headers = q.emptyMap();
        }
        mutableNetworkRequest.setHeaders(headers);
        mutableNetworkRequest.setBody(createBody(httpRequest.getBody(), "application/json"));
    }

    private final MultipartNetworkResponse executeMultipartOrThrow(final HttpRequest request) throws HttpConnectionException {
        try {
            return ExtensionsKt.fetchMultipart(this.worker, new Function1<MutableNetworkRequest, Unit>() { // from class: com.bbva.gp2.android.libs.networking.http.ether.EtherGp2HttpClientLogic.executeMultipartOrThrow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
                    invoke2(mutableNetworkRequest);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MutableNetworkRequest fetchMultipart) {
                    Intrinsics.checkNotNullParameter(fetchMultipart, "$this$fetchMultipart");
                    EtherGp2HttpClientLogic.this.createMutableNetworkRequest(fetchMultipart, request);
                }
            });
        } catch (ConnectionException e5) {
            NetworkResponse networkResponse = e5.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
            if (networkResponse == null) {
                networkResponse = null;
            }
            MultipartNetworkResponse multipartNetworkResponse = (MultipartNetworkResponse) networkResponse;
            if (multipartNetworkResponse != null) {
                return multipartNetworkResponse;
            }
            throw new HttpConnectionException(e5);
        } catch (Exception e7) {
            throw new HttpConnectionException(e7);
        }
    }

    private final NetworkResponse executeOrThrow(HttpRequest request) throws HttpConnectionException {
        try {
            return this.worker.execute(createEtherRequest(request));
        } catch (ConnectionException e5) {
            NetworkResponse networkResponse = e5.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
            if (networkResponse != null) {
                return networkResponse;
            }
            throw new HttpConnectionException(e5);
        } catch (Exception e7) {
            throw new HttpConnectionException(e7);
        }
    }

    private final List<ResponseBodyPart> getBodyPartList(MultipartNetworkResponse etherResponse) {
        return ResponseUtilsKt.networkBodyPartsToResponseBodyParts(etherResponse.getMultipartBody().parts(getResponseType(etherResponse), true));
    }

    private final String getBoundaryFromResponse(Map<String, String> responseMap) {
        String str = responseMap.get(DigipassManagerConstants.KEY_CONTENT_TYPE);
        String strReplace$default = "";
        if (str != null) {
            for (String str2 : StringsKt__StringsKt.split$default((CharSequence) str, new String[]{ReplenishLogic.ID_SEPARATOR}, false, 0, 6, (Object) null)) {
                if (l.startsWith$default(str2, " boundary", false, 2, null)) {
                    strReplace$default = l.replace$default((String) StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null).get(1), "\"", "", false, 4, (Object) null);
                }
            }
        }
        return strReplace$default;
    }

    private final String getResponseType(MultipartNetworkResponse etherResponse) {
        Map<String, String> headers = etherResponse.getHeaders();
        Intrinsics.checkNotNull(headers, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
        return ResponseUtilsKt.createMultiPartMixedOf(getBoundaryFromResponse(headers));
    }

    @Override // com.bbva.gp2.android.libs.networking.http.Gp2HttpClient
    @NotNull
    public HttpResponse execute(@NotNull HttpRequest request) throws HttpConnectionException {
        Intrinsics.checkNotNullParameter(request, "request");
        NetworkResponse networkResponseExecuteOrThrow = executeOrThrow(request);
        return new ImmutableHttpResponse(networkResponseExecuteOrThrow.getCode(), new EtherResponseBody(networkResponseExecuteOrThrow.getBody()), networkResponseExecuteOrThrow.getHeaders());
    }

    @Override // com.bbva.gp2.android.libs.networking.http.Gp2HttpClient
    @NotNull
    public HttpMultipartResponse executeMultipartMixed(@NotNull HttpRequest request) throws HttpConnectionException {
        Intrinsics.checkNotNullParameter(request, "request");
        MultipartNetworkResponse multipartNetworkResponseExecuteMultipartOrThrow = executeMultipartOrThrow(request);
        return new ImmutableHttpMultipartResponse(multipartNetworkResponseExecuteMultipartOrThrow.getCode(), getBodyPartList(multipartNetworkResponseExecuteMultipartOrThrow), multipartNetworkResponseExecuteMultipartOrThrow.getHeaders());
    }
}
