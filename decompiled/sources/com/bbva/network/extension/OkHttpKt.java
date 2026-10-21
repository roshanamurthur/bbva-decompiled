package com.bbva.network.extension;

import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.network.constant.Method;
import com.bbva.network.constant.NetworkProtocol;
import com.bbva.network.model.NetworkConnection;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.SpeedEvent;
import com.bbva.network.model.multipart.NetworkMultiPartBody;
import com.bbva.network.model.multipart.Part;
import com.bbva.network.model.multipart.PartBody;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.DefaultNetworkHandshake;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.bbva.network.model.response.NetworkHandshake;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.model.response.body.impl.OkHttpBody;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.FormBody;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttp.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001e\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0000\u001a\u001a\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011*\u00020\u0018H\u0000\u001a\u001e\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b0\u0011*\u00020\u0018H\u0000\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001dH\u0000\u001a\f\u0010 \u001a\u00020!*\u00020\"H\u0000\u001a\"\u0010#\u001a\u00020$*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020&\u001a\f\u0010)\u001a\u00020**\u00020+H\u0000\u001a\u0014\u0010,\u001a\u00020\u0017*\u00020-2\u0006\u0010.\u001a\u00020/H\u0000\u001a\f\u00100\u001a\u000201*\u000202H\u0000\u001a\u0014\u00103\u001a\u000204*\u00020\u00182\u0006\u00105\u001a\u00020!H\u0000\u001a\u0014\u00106\u001a\u000207*\u00020\u00182\u0006\u00108\u001a\u000204H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"TYPE_JSON", "", "createBody", "Lokhttp3/RequestBody;", "contentType", "body", "", "createFormBody", "reqBody", "Lcom/bbva/network/model/request/NetworkRequestBody$FormBody;", "createMultiPartBody", "multiBody", "Lcom/bbva/network/model/multipart/NetworkMultiPartBody;", "addHeaders", "", "Lokhttp3/Request$Builder;", "headers", "", "addMethodWithBody", "method", "Lcom/bbva/network/constant/Method;", "Lcom/bbva/network/model/request/NetworkRequestBody;", "extractHandshake", "Lcom/bbva/network/model/response/NetworkHandshake;", "Lokhttp3/Response;", "mapHeaders", "mapMultimapHeaders", "", "networkClientFromTimeout", "Lokhttp3/OkHttpClient;", "", "client", "networkRequest", "Lcom/bbva/network/model/NetworkRequest;", "Lokhttp3/Call;", "sslSocketFactory", "Lokhttp3/OkHttpClient$Builder;", "p12", "Ljava/io/InputStream;", "password", "certificate", "toNetWorkConnection", "Lcom/bbva/network/model/NetworkConnection;", "Lokhttp3/Connection;", "toNetworkHandshake", "Lokhttp3/Handshake;", "url", "Ljava/net/URL;", "toNetworkProtocol", "Lcom/bbva/network/constant/NetworkProtocol;", "Lokhttp3/Protocol;", "toNetworkResponse", "Lcom/bbva/network/model/response/NetworkResponse;", "request", "toSpeedEvent", "Lcom/bbva/network/model/SpeedEvent;", "networkResponse", "network_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttp.kt\ncom/bbva/network/extension/OkHttpKt\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,215:1\n32#2,2:216\n32#2,2:231\n1271#3,2:218\n1285#3,4:220\n1271#3,2:233\n1285#3,4:235\n526#4:224\n511#4,6:225\n*S KotlinDebug\n*F\n+ 1 OkHttp.kt\ncom/bbva/network/extension/OkHttpKt\n*L\n50#1:216,2\n104#1:231,2\n74#1:218,2\n74#1:220,4\n142#1:233,2\n142#1:235,4\n83#1:224\n83#1:225,6\n*E\n"})
public final class OkHttpKt {

    @NotNull
    public static final String TYPE_JSON = "application/json";

    /* JADX INFO: compiled from: OkHttp.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Method.values().length];
            try {
                iArr[Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Method.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Method.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Method.PATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Method.HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Method.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addHeaders(@NotNull Request.Builder builder, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void addMethodWithBody(@NotNull Request.Builder builder, @NotNull Method method, @NotNull NetworkRequestBody reqBody) {
        RequestBody requestBodyCreateFormBody;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(reqBody, "reqBody");
        if (reqBody instanceof NetworkRequestBody.RequestBody) {
            NetworkRequestBody.RequestBody requestBody = (NetworkRequestBody.RequestBody) reqBody;
            requestBodyCreateFormBody = createBody(requestBody.getContentType(), requestBody.getBody());
        } else if (reqBody instanceof NetworkRequestBody.MultipartBody) {
            requestBodyCreateFormBody = createMultiPartBody((NetworkMultiPartBody) reqBody);
        } else {
            if (!(reqBody instanceof NetworkRequestBody.FormBody)) {
                throw new NoWhenBranchMatchedException();
            }
            requestBodyCreateFormBody = createFormBody((NetworkRequestBody.FormBody) reqBody);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[method.ordinal()]) {
            case 1:
                builder.get();
                return;
            case 2:
                builder.post(requestBodyCreateFormBody);
                return;
            case 3:
                builder.put(requestBodyCreateFormBody);
                return;
            case 4:
                builder.patch(requestBodyCreateFormBody);
                return;
            case 5:
                builder.head();
                return;
            case 6:
                builder.delete(requestBodyCreateFormBody);
                return;
            default:
                return;
        }
    }

    @NotNull
    public static final RequestBody createBody(@Nullable String str, @Nullable byte[] bArr) {
        if (str == null) {
            str = "application/json";
        }
        MediaType mediaType = MediaType.INSTANCE.parse(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        return RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final RequestBody createFormBody(@NotNull NetworkRequestBody.FormBody reqBody) {
        Intrinsics.checkNotNullParameter(reqBody, "reqBody");
        FormBody.Builder builder = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
        for (Map.Entry<String, String> entry : reqBody.getValues().entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final RequestBody createMultiPartBody(@NotNull NetworkMultiPartBody multiBody) {
        RequestBody requestBodyCreate;
        Intrinsics.checkNotNullParameter(multiBody, "multiBody");
        MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, 0 == true ? 1 : 0);
        MediaType mediaType = MediaType.INSTANCE.parse(multiBody.getType().getRawType());
        Intrinsics.checkNotNull(mediaType);
        builder.setType(mediaType);
        for (Part part : multiBody.getParts()) {
            Headers headersOf = Headers.INSTANCE.of(part.getHeaders());
            MediaType mediaType2 = part.getBody().getContentType() != null ? MediaType.INSTANCE.parse(part.getBody().getContentType()) : null;
            PartBody body = part.getBody();
            if (body instanceof PartBody.ByteArrayBody) {
                requestBodyCreate = RequestBody.Companion.create$default(RequestBody.INSTANCE, ((PartBody.ByteArrayBody) part.getBody()).getContent(), mediaType2, 0, 0, 6, (Object) null);
            } else {
                if (!(body instanceof PartBody.FileBody)) {
                    throw new NoWhenBranchMatchedException();
                }
                requestBodyCreate = RequestBody.INSTANCE.create(((PartBody.FileBody) part.getBody()).getFile(), mediaType2);
            }
            builder.addPart(headersOf, requestBodyCreate);
        }
        return builder.build();
    }

    @NotNull
    public static final NetworkHandshake extractHandshake(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Handshake handshake = response.handshake();
        return handshake == null ? new DefaultNetworkHandshake(CollectionsKt__CollectionsKt.emptyList(), "", null) : toNetworkHandshake(handshake, response.request().url().url());
    }

    @NotNull
    public static final Map<String, String> mapHeaders(@NotNull Response response) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(response, "<this>");
        Headers headers = response.headers();
        Map<String, List<String>> multimap = headers.toMultimap();
        Set<String> setNames = headers.names();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(setNames, 10, 16));
        for (Object obj : setNames) {
            String str = (String) obj;
            if (multimap.containsKey(str)) {
                List<String> list = multimap.get(str);
                Intrinsics.checkNotNull(list);
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
            } else {
                strJoinToString$default = headers.get(str);
            }
            linkedHashMap.put(obj, strJoinToString$default);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, List<String>> mapMultimapHeaders(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Map<String, List<String>> multimap = response.headers().toMultimap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : multimap.entrySet()) {
            if (entry.getValue().size() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final OkHttpClient networkClientFromTimeout(long j10, @NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        OkHttpClient.Builder builderNewBuilder = client.newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderNewBuilder.callTimeout(j10, timeUnit).connectTimeout(j10, timeUnit).readTimeout(j10, timeUnit).writeTimeout(j10, timeUnit).build();
    }

    @NotNull
    public static final NetworkRequest networkRequest(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "<this>");
        Request request = call.request();
        Set<String> setNames = request.headers().names();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(setNames, 10, 16));
        for (Object obj : setNames) {
            String str = request.headers().get((String) obj);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put(obj, str);
        }
        MutableNetworkRequest mutableNetworkRequest = new MutableNetworkRequest();
        mutableNetworkRequest.setHeaders(linkedHashMap);
        mutableNetworkRequest.setUrl(request.url().getF85562i());
        mutableNetworkRequest.setMethod(Method.valueOf(request.method()));
        return mutableNetworkRequest;
    }

    @NotNull
    public static final OkHttpClient.Builder sslSocketFactory(@NotNull OkHttpClient.Builder builder, @NotNull InputStream p12, @NotNull String password, @NotNull InputStream certificate) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(p12, "p12");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        char[] charArray = password.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        keyStore.load(p12, charArray);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        char[] charArray2 = password.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
        keyManagerFactory.init(keyStore, charArray2);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\").apply…nagers, null, null)\n    }");
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(certificate);
        Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
        KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore2.load(null);
        keyStore2.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName(), x509Certificate);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore2);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslContext.socketFactory");
        TrustManager trustManager = trustManagerFactory.getTrustManagers()[0];
        Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        builder.sslSocketFactory(socketFactory, (X509TrustManager) trustManager);
        return builder;
    }

    @NotNull
    public static final NetworkConnection toNetWorkConnection(@NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(connection, "<this>");
        URL url = connection.getF85830b().address().url().url();
        Handshake f85833e = connection.getF85833e();
        return new NetworkConnection(connection.socket(), connection.getF85830b().socketAddress(), url, f85833e != null ? toNetworkHandshake(f85833e, url) : null, toNetworkProtocol(connection.protocol()));
    }

    @NotNull
    public static final NetworkHandshake toNetworkHandshake(@NotNull Handshake handshake, @NotNull URL url) {
        Intrinsics.checkNotNullParameter(handshake, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return new DefaultNetworkHandshake(handshake.peerCertificates(), handshake.cipherSuite().toString(), url);
    }

    @NotNull
    public static final NetworkProtocol toNetworkProtocol(@NotNull Protocol protocol) {
        Intrinsics.checkNotNullParameter(protocol, "<this>");
        return NetworkProtocol.INSTANCE.from$network_release(protocol);
    }

    @NotNull
    public static final NetworkResponse toNetworkResponse(@NotNull Response response, @NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        OkHttpBody okHttpBody = new OkHttpBody(response.body());
        NetworkHandshake networkHandshakeExtractHandshake = extractHandshake(response);
        MutableNetworkResponse mutableNetworkResponse = new MutableNetworkResponse(okHttpBody, mapHeaders(response), response.code(), request, response.message(), mapMultimapHeaders(response), response.request().url().getF85562i());
        mutableNetworkResponse.setHandshake(networkHandshakeExtractHandshake);
        return mutableNetworkResponse;
    }

    @NotNull
    public static final SpeedEvent toSpeedEvent(@NotNull Response response, @NotNull NetworkResponse networkResponse) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        String strHeader$default = Response.header$default(response, "Content-Length", null, 2, null);
        return new SpeedEvent(jReceivedResponseAtMillis, jSentRequestAtMillis, strHeader$default != null ? Long.valueOf(Long.parseLong(strHeader$default)) : null, response.cacheResponse() != null, networkResponse.getRequest(), networkResponse);
    }
}
