package com.bbva.smartassistance.listeners;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.smartassistance.constants.SmartAssistanceConstants;
import com.bbva.smartassistance.extensions.IAmeliaOutboundMessageExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.BaseConversationListener;
import net.ipsoft.amelia.sdk.IAmeliaOutboundMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomBaseConversationListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/bbva/smartassistance/listeners/CustomBaseConversationListener;", "Lnet/ipsoft/amelia/sdk/BaseConversationListener;", "Lnet/ipsoft/amelia/sdk/BaseConversation;", "conversation", "Lnet/ipsoft/amelia/sdk/IAmeliaOutboundMessage;", "ameliaOutboundMessage", "", "outboundBpnExecutionEventMessage", "", "message", BanxicoConstants.UNIFIED_LOG_EVENT_MESSAGE_RECEIVED_VALUE, "outboundFormInputMessage", "outboundEchoMessage", "outboundTextMessage", "outboundIntegrationMessage", "onConnect", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "Lcom/bbva/smartassistance/listeners/CustomBaseConversation;", "baseConversation", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;Lcom/bbva/smartassistance/listeners/CustomBaseConversation;)V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
public final class CustomBaseConversationListener extends BaseConversationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MessageDispatcher f36810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CustomBaseConversation f36811b;

    public CustomBaseConversationListener(@NotNull MessageDispatcher messageDispatcher, @NotNull CustomBaseConversation baseConversation) {
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(baseConversation, "baseConversation");
        this.f36810a = messageDispatcher;
        this.f36811b = baseConversation;
    }

    public final void a(IAmeliaOutboundMessage iAmeliaOutboundMessage) {
        this.f36810a.sendMessage(new WebMessage(SmartAssistanceConstants.GLOBAL_SA_RESPONSE_SUCCESS, IAmeliaOutboundMessageExtensionKt.getSmartResponse(iAmeliaOutboundMessage)));
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void onConnect(@Nullable BaseConversation conversation) {
        super.onConnect(conversation);
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void onMessageReceived(@Nullable BaseConversation conversation, @Nullable String message) {
        super.onMessageReceived(conversation, message);
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void outboundBpnExecutionEventMessage(@Nullable BaseConversation conversation, @Nullable IAmeliaOutboundMessage ameliaOutboundMessage) {
        if (ameliaOutboundMessage != null) {
            a(ameliaOutboundMessage);
        }
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void outboundEchoMessage(@Nullable BaseConversation conversation, @Nullable IAmeliaOutboundMessage ameliaOutboundMessage) {
        super.outboundEchoMessage(conversation, ameliaOutboundMessage);
        BaseConversation baseConversation = this.f36811b.getBaseConversation();
        if (!Intrinsics.areEqual(baseConversation != null ? baseConversation.getConversationId() : null, conversation != null ? conversation.getConversationId() : null) || ameliaOutboundMessage == null) {
            return;
        }
        a(ameliaOutboundMessage);
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void outboundFormInputMessage(@Nullable BaseConversation conversation, @Nullable IAmeliaOutboundMessage ameliaOutboundMessage) {
        super.outboundFormInputMessage(conversation, ameliaOutboundMessage);
        BaseConversation baseConversation = this.f36811b.getBaseConversation();
        if (!Intrinsics.areEqual(baseConversation != null ? baseConversation.getConversationId() : null, conversation != null ? conversation.getConversationId() : null) || ameliaOutboundMessage == null) {
            return;
        }
        a(ameliaOutboundMessage);
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void outboundIntegrationMessage(@Nullable BaseConversation conversation, @Nullable IAmeliaOutboundMessage ameliaOutboundMessage) {
        BaseConversation baseConversation = this.f36811b.getBaseConversation();
        if (!Intrinsics.areEqual(baseConversation != null ? baseConversation.getConversationId() : null, conversation != null ? conversation.getConversationId() : null) || ameliaOutboundMessage == null) {
            return;
        }
        a(ameliaOutboundMessage);
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversationListener, net.ipsoft.amelia.sdk.IConversationListener
    public void outboundTextMessage(@Nullable BaseConversation conversation, @Nullable IAmeliaOutboundMessage ameliaOutboundMessage) {
        BaseConversation baseConversation = this.f36811b.getBaseConversation();
        if (!Intrinsics.areEqual(baseConversation != null ? baseConversation.getConversationId() : null, conversation != null ? conversation.getConversationId() : null) || ameliaOutboundMessage == null) {
            return;
        }
        a(ameliaOutboundMessage);
    }
}
