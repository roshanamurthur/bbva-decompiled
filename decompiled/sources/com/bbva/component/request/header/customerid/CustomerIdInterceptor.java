package com.bbva.component.request.header.customerid;

import bk.q;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: CustomerIdInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/request/header/customerid/CustomerIdInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/request/header/customerid/CustomerIdInterceptorConfig;", "config", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "", "host", "anonymousCustomerId", "<init>", "(Lcom/bbva/component/request/header/customerid/CustomerIdInterceptorConfig;Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "request-header-customerid_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomerIdInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIdInterceptor.kt\ncom/bbva/component/request/header/customerid/CustomerIdInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1747#2,3:155\n1#3:158\n*S KotlinDebug\n*F\n+ 1 CustomerIdInterceptor.kt\ncom/bbva/component/request/header/customerid/CustomerIdInterceptor\n*L\n130#1:155,3\n*E\n"})
public final class CustomerIdInterceptor implements NetworkInterceptor {

    @NotNull
    public static final String BACKEND_USER_RESPONSE = "backendUserResponse";

    @NotNull
    public static final String CLIENT_ID = "clientId";

    @NotNull
    public static final String FAKE_CUSTOMER_ID = "customerId";

    @NotNull
    public static final String GRANTING_TICKET_USER_ID = "grantingTicketUserId";

    @NotNull
    public static final String GT_BODY_AUTHENTICATION = "authentication";

    @NotNull
    public static final String GT_BODY_CONSUMER_ID = "consumerID";

    @NotNull
    public static final String GT_METHOD_INSERT = "POST";

    @NotNull
    public static final String HEADER_CUSTOMER_ID = "customer-id";

    @NotNull
    public static final String LOCAL_STORAGE_CLIENT_ID = "localStorageClientId";

    @NotNull
    public static final String LOGIN_DATA = "loginData";

    @NotNull
    public static final String MULTISTEP_PROCESS_ID = "multistepProcessId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CustomerIdInterceptorConfig f28194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f28195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f28196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f28197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f28199f;

    public CustomerIdInterceptor(@NotNull CustomerIdInterceptorConfig config, @NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull String host, @NotNull String anonymousCustomerId) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(anonymousCustomerId, "anonymousCustomerId");
        this.f28194a = config;
        this.f28195b = rememberedUserDataSource;
        this.f28196c = host;
        this.f28197d = anonymousCustomerId;
        this.f28199f = KoinJavaComponent.inject$default(MainStorage.class, null, null, 6, null);
    }

    public static boolean a(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        String customerId;
        byte[] body;
        Intrinsics.checkNotNullParameter(request, "request");
        String url = request.getUrl();
        CustomerIdInterceptorConfig customerIdInterceptorConfig = this.f28194a;
        String str = null;
        if (a(url, customerIdInterceptorConfig.getGrantingList()) && l.equals(request.getMethod().name(), "POST", true)) {
            NetworkRequestBody body2 = request.getBody();
            String str2 = (!(body2 instanceof NetworkRequestBody.RequestBody) || (body = ((NetworkRequestBody.RequestBody) body2).getBody()) == null) ? null : new String(body, Charsets.UTF_8);
            this.f28198e = !l.equals$default(str2 != null ? JsonParser.parseString(str2).getAsJsonObject().getAsJsonObject("authentication").get("consumerID").getAsString() : null, this.f28197d, false, 2, null);
        }
        if (!a(url, customerIdInterceptorConfig.getDenyList()) && l.startsWith$default(url, this.f28196c, false, 2, null) && this.f28198e) {
            RememberedUser rememberedUser = this.f28195b.get();
            if (rememberedUser != null && (customerId = rememberedUser.getCustomerId()) != null && (!StringsKt__StringsKt.contains((CharSequence) customerId, (CharSequence) FAKE_CUSTOMER_ID, true))) {
                str = customerId;
            }
            if (str != null) {
                request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to(HEADER_CUSTOMER_ID, str)));
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) throws IOException {
        byte[] body;
        Intrinsics.checkNotNullParameter(response, "response");
        if (a(response.getRequest().getUrl(), this.f28194a.getGrantingList()) && l.equals(response.getRequest().getMethod().name(), "POST", true) && response.isSuccessful()) {
            Lazy lazy = this.f28199f;
            String string$default = MainStorage.getString$default((MainStorage) lazy.getValue(), "localStorageClientId", null, false, null, 14, null);
            if (string$default == null || string$default.length() == 0) {
                JsonElement jsonElement = MainStorage.getJson$default((MainStorage) lazy.getValue(), "loginData", false, null, 6, null).get(GRANTING_TICKET_USER_ID);
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                if (asString != null && asString.length() != 0) {
                    ((MainStorage) lazy.getValue()).put("localStorageClientId", asString, true, TargetStorage.Local);
                }
            }
            String string$default2 = MainStorage.getString$default((MainStorage) lazy.getValue(), "localStorageClientId", null, true, null, 10, null);
            if (string$default2 == null || string$default2.length() == 0) {
                NetworkRequestBody body2 = response.getRequest().getBody();
                if ((body2 instanceof NetworkRequestBody.RequestBody) && (body = ((NetworkRequestBody.RequestBody) body2).getBody()) != null && JsonParser.parseString(new String(body, Charsets.UTF_8)).getAsJsonObject().getAsJsonObject("authentication").has("multistepProcessId")) {
                    String strString = response.getBody().string();
                    JsonObject asJsonObject = strString != null ? JsonParser.parseString(strString).getAsJsonObject().getAsJsonObject(BACKEND_USER_RESPONSE) : null;
                    if (asJsonObject != null) {
                        JsonElement jsonElement2 = asJsonObject.get(CLIENT_ID);
                        String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        if (asString2 == null) {
                            asString2 = "";
                        } else {
                            Intrinsics.checkNotNull(asString2);
                        }
                        if (asString2.length() > 0) {
                            ((MainStorage) lazy.getValue()).put("localStorageClientId", asString2, true, TargetStorage.Local);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
