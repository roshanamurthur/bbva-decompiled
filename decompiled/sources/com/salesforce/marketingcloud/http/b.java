package com.salesforce.marketingcloud.http;

import android.os.Bundle;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0003\u0004\"\tBI\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b2\u00103J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003JW\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b(\u0010!R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R$\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b/\u0010!\"\u0004\b\u0004\u00100¨\u00064"}, d2 = {"Lcom/salesforce/marketingcloud/http/b;", "", "Ljava/io/InputStream;", "", "a", "Landroid/os/Bundle;", "s", "Lcom/salesforce/marketingcloud/http/d;", "j", "c", "d", "", "e", "f", "g", "", "h", "Lcom/salesforce/marketingcloud/http/a;", "i", "method", "requestBody", "connectionTimeout", "contentType", "url", "headers", "requestId", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", "o", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "k", "()I", "l", "r", "Ljava/util/List;", "m", "()Ljava/util/List;", "Lcom/salesforce/marketingcloud/http/a;", "p", "()Lcom/salesforce/marketingcloud/http/a;", "q", "(Ljava/lang/String;)V", LogKeysKt.TAG, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/salesforce/marketingcloud/http/a;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/salesforce/marketingcloud/http/Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final /* data */ class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f64279j = g.a("Request");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f64280k = "GET";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f64281l = "POST";

    @NotNull
    public static final String m = "PATCH";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64282n = -100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f64283o = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String requestBody;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int connectionTimeout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<String> headers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final com.salesforce.marketingcloud.http.a requestId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private String tag;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b \u0010!J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\b\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/salesforce/marketingcloud/http/b$a;", "", "", "method", "b", "requestBody", "c", "contentType", "a", "url", "d", "Lcom/salesforce/marketingcloud/http/a;", "requestId", "", "connectionTimeout", "", "headers", "", "key", "value", "Lcom/salesforce/marketingcloud/http/b;", "Ljava/lang/String;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "e", "f", "Lcom/salesforce/marketingcloud/http/a;", "", "g", "Ljava/util/Map;", "headersMap", "h", "Ljava/util/List;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/salesforce/marketingcloud/http/Request$Builder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,207:1\n76#2:208\n96#2,5:209\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/salesforce/marketingcloud/http/Request$Builder\n*L\n185#1:208\n185#1:209,5\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String method;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String url;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String requestBody;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String contentType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private com.salesforce.marketingcloud.http.a requestId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private List<String> headers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int connectionTimeout = 30000;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private Map<String, String> headersMap = new LinkedHashMap();

        @NotNull
        public final a a(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        @NotNull
        public final a b(@NotNull String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        @NotNull
        public final a c(@NotNull String requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        @NotNull
        public final a d(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        @NotNull
        public final a a(@NotNull com.salesforce.marketingcloud.http.a requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.requestId = requestId;
            return this;
        }

        @NotNull
        public final a a(@NotNull String contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        @NotNull
        public final a a(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headersMap.put(key, StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        @NotNull
        public final b a() {
            List<String> list;
            List<String> listEmptyList = this.headers;
            if (listEmptyList != null) {
                list = listEmptyList;
            } else if (!this.headersMap.isEmpty()) {
                Map<String, String> map = this.headersMap;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    bk.g.addAll(arrayList, CollectionsKt___CollectionsKt.plus((Collection<? extends String>) bk.d.listOf(entry.getKey()), entry.getValue()));
                }
                list = arrayList;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                list = listEmptyList;
            }
            String str = this.requestBody;
            if (str == null) {
                this.contentType = "";
            }
            String str2 = this.method;
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String str3 = this.url;
            if (str3 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            int i10 = this.connectionTimeout;
            String str4 = this.contentType;
            if (str4 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            com.salesforce.marketingcloud.http.a aVar = this.requestId;
            if (aVar != null) {
                return new b(str2, str, i10, str4, str3, list, aVar);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final void a(@NotNull List<String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.http.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/salesforce/marketingcloud/http/b$b;", "", "Lcom/salesforce/marketingcloud/http/b$a;", "a", "Landroid/os/Bundle;", "data", "Lcom/salesforce/marketingcloud/http/b;", "", "TAG", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "DEFAULT_CONNECTION_TIMEOUT", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "GET", "PATCH", "POST", "RESPONSE_REQUEST_FAILED", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/salesforce/marketingcloud/http/Request$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final a a() {
            return new a();
        }

        @NotNull
        public final String b() {
            return b.f64279j;
        }

        @JvmStatic
        @NotNull
        public final b a(@NotNull Bundle data) {
            Intrinsics.checkNotNullParameter(data, "data");
            a aVarA = b.INSTANCE.a();
            String it = data.getString("method");
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                aVarA.b(it);
            }
            String it2 = data.getString("requestBody");
            if (it2 != null) {
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                aVarA.c(it2);
            }
            aVarA.a(data.getInt("connectionTimeout"));
            String it3 = data.getString("contentType");
            if (it3 != null) {
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                aVarA.a(it3);
            }
            String it4 = data.getString("url");
            if (it4 != null) {
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                aVarA.d(it4);
            }
            ArrayList<String> it5 = data.getStringArrayList("headers");
            if (it5 != null) {
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                aVarA.a(it5);
            }
            aVarA.a(com.salesforce.marketingcloud.http.a.values()[data.getInt("mcRequestId", 0)]);
            b bVarA = aVarA.a();
            bVarA.a(data.getString(LogKeysKt.TAG));
            return bVarA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/http/b$c;", "", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface c {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f64300a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to complete request";
        }
    }

    public b(@NotNull String method, @Nullable String str, int i10, @NotNull String contentType, @NotNull String url, @NotNull List<String> headers, @NotNull com.salesforce.marketingcloud.http.a requestId) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.method = method;
        this.requestBody = str;
        this.connectionTimeout = i10;
        this.contentType = contentType;
        this.url = url;
        this.headers = headers;
        this.requestId = requestId;
    }

    @JvmStatic
    @NotNull
    public static final b a(@NotNull Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @JvmStatic
    @NotNull
    public static final a b() {
        return INSTANCE.a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.areEqual(this.method, bVar.method) && Intrinsics.areEqual(this.requestBody, bVar.requestBody) && this.connectionTimeout == bVar.connectionTimeout && Intrinsics.areEqual(this.contentType, bVar.contentType) && Intrinsics.areEqual(this.url, bVar.url) && Intrinsics.areEqual(this.headers, bVar.headers) && this.requestId == bVar.requestId;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final List<String> h() {
        return this.headers;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        String str = this.requestBody;
        return this.requestId.hashCode() + com.google.android.gms.measurement.internal.a.a(this.headers, n1.c(this.url, n1.c(this.contentType, (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.connectionTimeout) * 31, 31), 31), 31);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.salesforce.marketingcloud.http.a getRequestId() {
        return this.requestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @NotNull
    public final com.salesforce.marketingcloud.http.d j() throws Throwable {
        com.salesforce.marketingcloud.http.d dVarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r3 = 0;
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.url).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnectionOpenConnection;
                try {
                    httpsURLConnection2.setRequestMethod(this.method);
                    httpsURLConnection2.setDoInput(true);
                    httpsURLConnection2.setUseCaches(false);
                    httpsURLConnection2.setAllowUserInteraction(false);
                    httpsURLConnection2.setConnectTimeout(this.connectionTimeout);
                    IntProgression intProgressionStep = kotlin.ranges.c.step(kotlin.ranges.c.until(0, this.headers.size()), 2);
                    int first = intProgressionStep.getFirst();
                    int last = intProgressionStep.getLast();
                    int step = intProgressionStep.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        while (true) {
                            httpsURLConnection2.setRequestProperty(this.headers.get(first), this.headers.get(first + 1));
                            if (first == last) {
                                break;
                            }
                            first += step;
                        }
                    }
                    String str = this.requestBody;
                    if (str != null) {
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, this.contentType);
                        OutputStream outputStream = httpsURLConnection2.getOutputStream();
                        try {
                            byte[] bytes = str.getBytes(m.b());
                            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                            outputStream.write(bytes);
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(outputStream, th2);
                                throw th3;
                            }
                        }
                    }
                    com.salesforce.marketingcloud.http.d.a aVarA = com.salesforce.marketingcloud.http.d.INSTANCE.a();
                    aVarA.a(httpsURLConnection2.getResponseCode());
                    String responseMessage = httpsURLConnection2.getResponseMessage();
                    Intrinsics.checkNotNullExpressionValue(responseMessage, "connection.responseMessage");
                    aVarA.b(responseMessage);
                    Map<String, List<String>> headerFields = httpsURLConnection2.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
                    aVarA.a(headerFields);
                    try {
                        String strA = a(httpsURLConnection2.getInputStream());
                        if (strA != null) {
                            aVarA.a(strA);
                        }
                    } catch (IOException unused) {
                        String strA2 = a(httpsURLConnection2.getErrorStream());
                        if (strA2 != null) {
                            aVarA.a(strA2);
                        }
                    }
                    aVarA.b(jCurrentTimeMillis);
                    aVarA.a(System.currentTimeMillis());
                    dVarA = aVarA.a();
                    httpsURLConnection2.disconnect();
                    r3 = aVarA;
                } catch (Exception e5) {
                    e = e5;
                    httpsURLConnection = httpsURLConnection2;
                    g.f64223a.b(f64279j, e, d.f64300a);
                    dVarA = com.salesforce.marketingcloud.http.d.INSTANCE.a("ERROR", -100);
                    r3 = httpsURLConnection;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                        r3 = httpsURLConnection;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r3 = httpsURLConnection2;
                    if (r3 != 0) {
                        r3.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e7) {
            e = e7;
        }
        return dVarA;
    }

    public final int k() {
        return this.connectionTimeout;
    }

    @NotNull
    public final String l() {
        return this.contentType;
    }

    @NotNull
    public final List<String> m() {
        return this.headers;
    }

    @NotNull
    public final String n() {
        return this.method;
    }

    @Nullable
    public final String o() {
        return this.requestBody;
    }

    @NotNull
    public final com.salesforce.marketingcloud.http.a p() {
        return this.requestId;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String r() {
        return this.url;
    }

    @NotNull
    public final Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putString("method", this.method);
        bundle.putString("requestBody", this.requestBody);
        bundle.putInt("connectionTimeout", this.connectionTimeout);
        bundle.putString("contentType", this.contentType);
        bundle.putString("url", this.url);
        List<String> list = this.headers;
        bundle.putStringArrayList("headers", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(this.headers));
        bundle.putInt("mcRequestId", this.requestId.ordinal());
        bundle.putString(LogKeysKt.TAG, this.tag);
        return bundle;
    }

    @NotNull
    public String toString() {
        return "Request(method=" + this.method + ", requestBody=" + this.requestBody + ", connectionTimeout=" + this.connectionTimeout + ", contentType=" + this.contentType + ", url=" + this.url + ", headers=" + this.headers + ", requestId=" + this.requestId + RootService.CLOSE_BRACKET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b a(b bVar, String str, String str2, int i10, String str3, String str4, List list, com.salesforce.marketingcloud.http.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.method;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.requestBody;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            i10 = bVar.connectionTimeout;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = bVar.contentType;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            str4 = bVar.url;
        }
        String str7 = str4;
        if ((i11 & 32) != 0) {
            list = bVar.headers;
        }
        List list2 = list;
        if ((i11 & 64) != 0) {
            aVar = bVar.requestId;
        }
        return bVar.a(str, str5, i12, str6, str7, list2, aVar);
    }

    @NotNull
    public final b a(@NotNull String method, @Nullable String requestBody, int connectionTimeout, @NotNull String contentType, @NotNull String url, @NotNull List<String> headers, @NotNull com.salesforce.marketingcloud.http.a requestId) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new b(method, requestBody, connectionTimeout, contentType, url, headers, requestId);
    }

    private final String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, m.b()));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb2.toString();
                    CloseableKt.closeFinally(bufferedReader, null);
                    return string;
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public final void a(@Nullable String str) {
        this.tag = str;
    }
}
