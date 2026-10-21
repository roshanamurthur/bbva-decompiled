package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public interface IConversationListener {
    void onChatHistoryClear(BaseConversation baseConversation);

    void onConnect(BaseConversation baseConversation);

    void onDisconnect(BaseConversation baseConversation);

    void onErrorInputBlocked(BaseConversation baseConversation);

    void onInputEnabledChanged(BaseConversation baseConversation, boolean z10, String str, IAmeliaChat.InputStateChangeReason inputStateChangeReason);

    void onMessageReceived(BaseConversation baseConversation, String str);

    void onMoodChange(BaseConversation baseConversation, String str, String str2);

    void onReconnect(BaseConversation baseConversation);

    void onSecureInputEnabledChanged(BaseConversation baseConversation, boolean z10);

    void onSpeakEnd();

    void onSpeakStart();

    void onUploadFailed(BaseConversation baseConversation, String str, String str2);

    void onUploadRequest(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void onUploadSuccess(BaseConversation baseConversation, String str, String str2, String str3);

    void outboundAckRequestMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundAgentSessionChangedMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundAmeliaMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundAmeliaReadyMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundBpnExecutionEventMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundConversationClosedMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundEchoMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundEscalationStartedMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundFinalErrorMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundFormInputMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundIdleTalkMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundIntegrationMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundMmoDownloadMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundNoIdleTalkMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundProgressTextMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundReplayFinishedMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundSessionClosedMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void outboundTextMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);

    void wolframAlphaFinalMessage(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage);
}
