package com.bbva.glomohybrid.userAgent;

import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.glomohybrid.cellsweb.presentation.channels.CellsWebChannels;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: UserAgentWebDispatcher.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/userAgent/UserAgentWebDispatcher;", "Lcom/bbva/bridge/WebAwareComponent;", "Lcom/bbva/bridge/webcontroller/WebState;", "state", "", "onWebReady", "", "userAgent", "<init>", "(Ljava/lang/String;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class UserAgentWebDispatcher implements WebAwareComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f34726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f34727b;

    public UserAgentWebDispatcher(@NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f34726a = userAgent;
        this.f34727b = KoinJavaComponent.inject$default(MessageDispatcher.class, null, null, 6, null);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onPageLoaded(@NotNull String str) {
        WebAwareComponent.DefaultImpls.onPageLoaded(this, str);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onWebReady(@NotNull WebState state) {
        MessageDispatcher messageDispatcher;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state != WebState.READY || (messageDispatcher = (MessageDispatcher) this.f34727b.getValue()) == null) {
            return;
        }
        String name = CellsWebChannels.INSTANCE.getGlobalNativeUserAgentChannel().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        messageDispatcher.sendMessage(name, this.f34726a);
    }
}
