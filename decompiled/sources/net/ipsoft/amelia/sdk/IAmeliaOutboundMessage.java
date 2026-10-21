package net.ipsoft.amelia.sdk;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface IAmeliaOutboundMessage {
    String getAvatarVoice();

    BpnExecutionEvent getBpnExecutionEvent();

    String getContextId();

    String getConversationId();

    IDownloadMessage getDownloadMessage();

    FormInputData getFormInputData();

    String getFromUserDisplayName();

    String getHeader(String str);

    Map<String, String> getHeaders();

    String getHintText();

    String getId();

    String getInResponseToMessageId();

    String getIntegrationMessageData();

    String getMessageText();

    String getMessageType();

    String getMood();

    IResourceToDisplay getResourceToDisplay();

    IResourceToRequest getResourceToRequest();

    boolean getRetry();

    String getSourceClass();

    String getSourceSessionId();

    List<String> getSpeech();

    UploadMessage getUploadMessage();

    String getVoice();

    boolean isCancellable();

    boolean isMultiple();

    boolean isSelfEcho();

    boolean shouldSecureInput();
}
