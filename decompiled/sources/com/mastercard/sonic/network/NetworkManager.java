package com.mastercard.sonic.network;

import androidx.webkit.ProxyConfig;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/mastercard/sonic/network/NetworkManager;", "", "", "url", "Lcom/mastercard/sonic/network/NetworkManager$RequestCallback;", "callback", "", "getRequest", "requestBody", "postRequest", "urlString", "Ljava/io/File;", "destination", "", "downloadFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "RequestCallback", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkManager.kt\ncom/mastercard/sonic/network/NetworkManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class NetworkManager {

    @NotNull
    public static final NetworkManager INSTANCE = new NetworkManager();

    /* JADX INFO: compiled from: NetworkManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/network/NetworkManager$RequestCallback;", "", "onError", "", "error", "", "onSuccess", DigipassManagerConstants.KEY_RESPONSE, "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface RequestCallback {
        void onError(@NotNull String error);

        void onSuccess(@NotNull String response);
    }

    /* JADX INFO: compiled from: NetworkManager.kt */
    @DebugMetadata(c = "com.mastercard.sonic.network.NetworkManager$downloadFile$2", f = "NetworkManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nNetworkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkManager.kt\ncom/mastercard/sonic/network/NetworkManager$downloadFile$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f51523p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ File f51524q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f51523p0 = str;
            this.f51524q0 = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f51523p0, this.f51524q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean z10 = false;
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.f51523p0).openConnection();
                uRLConnectionOpenConnection.connect();
                InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(this.f51524q0);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
                fileOutputStream.close();
                inputStream.close();
                z10 = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public static final String access$executeRequest(NetworkManager networkManager, String str, String str2, String str3) throws IOException {
        HttpURLConnection httpURLConnection;
        networkManager.getClass();
        URL url = new URL(str);
        if (Intrinsics.areEqual(url.getProtocol(), ProxyConfig.MATCH_HTTPS)) {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        } else {
            URLConnection uRLConnectionOpenConnection2 = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(10000);
            if (str3 != null) {
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(str3);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
            }
            if (httpURLConnection.getResponseCode() != 200) {
                throw new IOException("HTTP Error: " + httpURLConnection.getResponseCode());
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "response.toString()");
                    bufferedInputStream.close();
                    httpURLConnection.disconnect();
                    return string;
                }
                sb2.append(line);
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    @Nullable
    public final Object downloadFile(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(str, file, null), continuation);
    }

    public final void getRequest(@NotNull String url, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new com.mastercard.sonic.network.a(url, "GET", null, callback, null), 3, null);
    }

    public final void postRequest(@NotNull String url, @NotNull String requestBody, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new com.mastercard.sonic.network.a(url, "POST", requestBody, callback, null), 3, null);
    }
}
