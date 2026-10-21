package com.bbva.smartassistance.extensions;

import com.bbva.smartassistance.data.FormInputData;
import com.bbva.smartassistance.data.MessageBody;
import com.bbva.smartassistance.data.SmartAssistanceResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.ipsoft.amelia.sdk.IAmeliaOutboundMessage;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: IAmeliaOutboundMessageExtension.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getSmartResponse", "Lcom/bbva/smartassistance/data/SmartAssistanceResponse;", "Lnet/ipsoft/amelia/sdk/IAmeliaOutboundMessage;", "gl-smart-assistance_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIAmeliaOutboundMessageExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IAmeliaOutboundMessageExtension.kt\ncom/bbva/smartassistance/extensions/IAmeliaOutboundMessageExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class IAmeliaOutboundMessageExtensionKt {
    @NotNull
    public static final SmartAssistanceResponse getSmartResponse(@NotNull IAmeliaOutboundMessage iAmeliaOutboundMessage) {
        Intrinsics.checkNotNullParameter(iAmeliaOutboundMessage, "<this>");
        String messageType = iAmeliaOutboundMessage.getMessageType();
        String conversationId = iAmeliaOutboundMessage.getConversationId();
        String sourceClass = iAmeliaOutboundMessage.getSourceClass();
        String messageText = iAmeliaOutboundMessage.getMessageText();
        String mood = iAmeliaOutboundMessage.getMood();
        String fromUserDisplayName = iAmeliaOutboundMessage.getFromUserDisplayName();
        String sourceSessionId = iAmeliaOutboundMessage.getSourceSessionId();
        String messageType2 = iAmeliaOutboundMessage.getMessageType();
        String conversationId2 = iAmeliaOutboundMessage.getConversationId();
        String inResponseToMessageId = iAmeliaOutboundMessage.getInResponseToMessageId();
        String id = iAmeliaOutboundMessage.getId();
        String voice = iAmeliaOutboundMessage.getVoice();
        String integrationMessageData = iAmeliaOutboundMessage.getIntegrationMessageData();
        return new SmartAssistanceResponse(null, messageType, new MessageBody(conversationId, sourceClass, messageText, "", mood, fromUserDisplayName, sourceSessionId, messageType2, conversationId2, inResponseToMessageId, id, voice, iAmeliaOutboundMessage.getHintText(), false, integrationMessageData != null ? new JSONObject(integrationMessageData) : null, new FormInputData(iAmeliaOutboundMessage.getFormInputData())), iAmeliaOutboundMessage.getHeaders());
    }
}
