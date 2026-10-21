package com.bbva.glomohybrid.base.session;

import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthTokenDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/base/session/AuthTokenDispatcher;", "Lcom/bbva/bridge/WebAwareComponent;", "Lcom/bbva/bridge/webcontroller/WebState;", "state", "", "onWebReady", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "accessToken", "sendAccessTokenToWeb", "Lcom/bbva/glomohybrid/base/session/Session;", "session", "Lcom/bbva/cellscore/web/WebController;", "webController", "<init>", "(Lcom/bbva/glomohybrid/base/session/Session;Lcom/bbva/cellscore/web/WebController;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAuthTokenDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokenDispatcher.kt\ncom/bbva/glomohybrid/base/session/AuthTokenDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1855#2,2:34\n*S KotlinDebug\n*F\n+ 1 AuthTokenDispatcher.kt\ncom/bbva/glomohybrid/base/session/AuthTokenDispatcher\n*L\n20#1:34,2\n*E\n"})
public final class AuthTokenDispatcher implements WebAwareComponent {

    @NotNull
    public static final String DOMAIN_AUTH_TOKEN_CHANNEL = "domain-auth-token";

    @NotNull
    public static final String ID = "AuthTokenDispatcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Session f31498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebController f31499b;

    public AuthTokenDispatcher(@NotNull Session session, @NotNull WebController webController) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(webController, "webController");
        this.f31498a = session;
        this.f31499b = webController;
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onPageLoaded(@NotNull String str) {
        WebAwareComponent.DefaultImpls.onPageLoaded(this, str);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onWebReady(@NotNull WebState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        WebAwareComponent.DefaultImpls.onWebReady(this, state);
        Iterator<T> it = this.f31498a.getAccessTokens().iterator();
        while (it.hasNext()) {
            sendAccessTokenToWeb((AccessToken) it.next());
        }
    }

    public final void sendAccessTokenToWeb(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f31499b.sendMessageToWeb(Intrinsics.areEqual(accessToken.getId(), AuthTokenInterceptorsIds.TENANT.toString()) ? DOMAIN_AUTH_TOKEN_CHANNEL : CellsChannels.INSTANCE.getAccessTokenChannel().getName(), accessToken);
    }
}
