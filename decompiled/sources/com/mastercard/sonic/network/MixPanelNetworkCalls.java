package com.mastercard.sonic.network;

import android.os.StrictMode;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MixPanelNetworkCalls.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/network/MixPanelNetworkCalls;", "", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MixPanelNetworkCalls {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MixPanelNetworkCalls.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/mastercard/sonic/network/MixPanelNetworkCalls$Companion;", "", "", "mixPanelUrl", "mixPanelRequestText", "", "syncMixPanelData", "Ljava/net/URL;", "url", "httpMethod", "Ljava/net/HttpURLConnection;", "setupHttpConnection", "DEFAULT_CONNECTION_TIMEOUT", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "DEFAULT_READ_TIMEOUT", "HTTP_METHOD_POST", "Ljava/lang/String;", "KEY_CONTENT_TYPE", "PREFIX_TO_ADD_BEFORE_SYNC", "TAG", "VALUE_APPLICATION_JSON", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMixPanelNetworkCalls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MixPanelNetworkCalls.kt\ncom/mastercard/sonic/network/MixPanelNetworkCalls$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HttpURLConnection setupHttpConnection(@NotNull URL url, @NotNull String httpMethod) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod(httpMethod);
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
            return httpURLConnection;
        }

        @JvmStatic
        public final int syncMixPanelData(@NotNull String mixPanelUrl, @NotNull String mixPanelRequestText) {
            Intrinsics.checkNotNullParameter(mixPanelUrl, "mixPanelUrl");
            Intrinsics.checkNotNullParameter(mixPanelRequestText, "mixPanelRequestText");
            int responseCode = 0;
            try {
                HttpURLConnection httpURLConnection = setupHttpConnection(new URL(mixPanelUrl), "POST");
                httpURLConnection.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.UTF_8));
                bufferedWriter.write("data=" + mixPanelRequestText);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    while (new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())).readLine() != null) {
                    }
                } else {
                    httpURLConnection.getResponseMessage();
                }
            } catch (Exception e5) {
                e5.getMessage();
            }
            return responseCode;
        }
    }

    @JvmStatic
    @NotNull
    public static final HttpURLConnection setupHttpConnection(@NotNull URL url, @NotNull String str) {
        return INSTANCE.setupHttpConnection(url, str);
    }

    @JvmStatic
    public static final int syncMixPanelData(@NotNull String str, @NotNull String str2) {
        return INSTANCE.syncMixPanelData(str, str2);
    }
}
