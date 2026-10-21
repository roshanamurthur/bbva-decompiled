package com.bbva.glomohybrid.base.deeplink.usecase;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SendGlobalProcessingDeepLinkUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/usecase/SendGlobalProcessingDeepLinkUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/base/handler/DeepLinkHandler;", "", "params", "execute", "(Lcom/bbva/glomohybrid/base/handler/DeepLinkHandler;)Ljava/lang/Boolean;", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class SendGlobalProcessingDeepLinkUseCase implements UseCaseWithParams<DeepLinkHandler, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f31290a;

    public SendGlobalProcessingDeepLinkUseCase(@Nullable MessageDispatcher messageDispatcher) {
        this.f31290a = messageDispatcher;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@Nullable DeepLinkHandler params) {
        MessageDispatcher messageDispatcher;
        boolean z10 = false;
        if (params != null && (messageDispatcher = this.f31290a) != null) {
            messageDispatcher.sendMessage(new WebMessage(CellsDeepLinkChannels.CELLS_DEEP_LINK_LOGIN_FLAG_CHANNEL_NAME, Boolean.valueOf(params.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String() != null)));
            if (params.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.DEEP_LINK java.lang.String() != null) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
