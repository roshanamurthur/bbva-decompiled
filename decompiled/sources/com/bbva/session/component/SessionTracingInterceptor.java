package com.bbva.session.component;

import androidx.camera.core.impl.v;
import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.bbva.session.domain.observers.SessionTokenObserver;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionTracingInterceptor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B#\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/session/component/SessionTracingInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/session/domain/observers/SessionTokenObserver;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "token", "onNewToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "host", "headerName", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "header-session-tracing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSessionTracingInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionTracingInterceptor.kt\ncom/bbva/session/component/SessionTracingInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class SessionTracingInterceptor implements NetworkInterceptor, SessionTokenObserver {

    @NotNull
    public static final String DEFAULT_HEADER_NAME = "ContactId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f36465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f36466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f36467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f36468d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f36464e = v.c("GLOMO-", System.currentTimeMillis());

    /* JADX INFO: compiled from: SessionTracingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/session/component/SessionTracingInterceptor$Companion;", "", "()V", "DEFAULT_HEADER_NAME", "", "DEFAULT_HEADER_VALUE", "getDEFAULT_HEADER_VALUE$header_session_tracing_release", "()Ljava/lang/String;", "header-session-tracing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getDEFAULT_HEADER_VALUE$header_session_tracing_release() {
            return SessionTracingInterceptor.f36464e;
        }
    }

    public SessionTracingInterceptor(@NotNull String host, @NotNull String headerName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f36465a = host;
        this.f36466b = headerName;
        this.f36467c = defaultValue;
        this.f36468d = defaultValue;
    }

    @Override // com.bbva.session.domain.observers.SessionTokenObserver
    @Nullable
    public Object onNewToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        if (!(!l.isBlank(str))) {
            str = null;
        }
        if (str == null) {
            str = this.f36467c;
        }
        this.f36468d = str;
        return Unit.INSTANCE;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (l.startsWith$default(request.getUrl(), StringsKt___StringsKt.dropLast(this.f36465a, 1), false, 2, null)) {
            request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to(this.f36466b, this.f36468d)));
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }

    public /* synthetic */ SessionTracingInterceptor(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? DEFAULT_HEADER_NAME : str2, (i10 & 4) != 0 ? f36464e : str3);
    }
}
