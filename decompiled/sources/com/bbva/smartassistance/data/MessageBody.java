package com.bbva.smartassistance.data;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: MessageBody.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÇ\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010J\u001a\u00020\u00112\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001a¨\u0006O"}, d2 = {"Lcom/bbva/smartassistance/data/MessageBody;", "", "messageId", "", "sourceClass", "messageText", "responsePool", "emoticon", "fromUserDisplayName", "sourceSessionId", "messageType", "conversationId", "inResponseToMessageId", "id", "voice", "hintText", "translated", "", "integrationMessageData", "Lorg/json/JSONObject;", "formInputData", "Lcom/bbva/smartassistance/data/FormInputData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lcom/bbva/smartassistance/data/FormInputData;)V", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "getEmoticon", "setEmoticon", "getFormInputData", "()Lcom/bbva/smartassistance/data/FormInputData;", "getFromUserDisplayName", "setFromUserDisplayName", "getHintText", "setHintText", "getId", "setId", "getInResponseToMessageId", "setInResponseToMessageId", "getIntegrationMessageData", "()Lorg/json/JSONObject;", "getMessageId", "setMessageId", "getMessageText", "setMessageText", "getMessageType", "setMessageType", "getResponsePool", "setResponsePool", "getSourceClass", "setSourceClass", "getSourceSessionId", "setSourceSessionId", "getTranslated", "()Z", "getVoice", "setVoice", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MessageBody {

    @Nullable
    private String conversationId;

    @Nullable
    private String emoticon;

    @Nullable
    private final FormInputData formInputData;

    @Nullable
    private String fromUserDisplayName;

    @Nullable
    private String hintText;

    @Nullable
    private String id;

    @Nullable
    private String inResponseToMessageId;

    @Nullable
    private final JSONObject integrationMessageData;

    @Nullable
    private String messageId;

    @Nullable
    private String messageText;

    @Nullable
    private String messageType;

    @Nullable
    private String responsePool;

    @Nullable
    private String sourceClass;

    @Nullable
    private String sourceSessionId;
    private final boolean translated;

    @Nullable
    private String voice;

    public MessageBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 65535, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInResponseToMessageId() {
        return this.inResponseToMessageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVoice() {
        return this.voice;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getTranslated() {
        return this.translated;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final JSONObject getIntegrationMessageData() {
        return this.integrationMessageData;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final FormInputData getFormInputData() {
        return this.formInputData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceClass() {
        return this.sourceClass;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResponsePool() {
        return this.responsePool;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmoticon() {
        return this.emoticon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFromUserDisplayName() {
        return this.fromUserDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final MessageBody copy(@Nullable String messageId, @Nullable String sourceClass, @Nullable String messageText, @Nullable String responsePool, @Nullable String emoticon, @Nullable String fromUserDisplayName, @Nullable String sourceSessionId, @Nullable String messageType, @Nullable String conversationId, @Nullable String inResponseToMessageId, @Nullable String id, @Nullable String voice, @Nullable String hintText, boolean translated, @Nullable JSONObject integrationMessageData, @Nullable FormInputData formInputData) {
        return new MessageBody(messageId, sourceClass, messageText, responsePool, emoticon, fromUserDisplayName, sourceSessionId, messageType, conversationId, inResponseToMessageId, id, voice, hintText, translated, integrationMessageData, formInputData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBody)) {
            return false;
        }
        MessageBody messageBody = (MessageBody) other;
        return Intrinsics.areEqual(this.messageId, messageBody.messageId) && Intrinsics.areEqual(this.sourceClass, messageBody.sourceClass) && Intrinsics.areEqual(this.messageText, messageBody.messageText) && Intrinsics.areEqual(this.responsePool, messageBody.responsePool) && Intrinsics.areEqual(this.emoticon, messageBody.emoticon) && Intrinsics.areEqual(this.fromUserDisplayName, messageBody.fromUserDisplayName) && Intrinsics.areEqual(this.sourceSessionId, messageBody.sourceSessionId) && Intrinsics.areEqual(this.messageType, messageBody.messageType) && Intrinsics.areEqual(this.conversationId, messageBody.conversationId) && Intrinsics.areEqual(this.inResponseToMessageId, messageBody.inResponseToMessageId) && Intrinsics.areEqual(this.id, messageBody.id) && Intrinsics.areEqual(this.voice, messageBody.voice) && Intrinsics.areEqual(this.hintText, messageBody.hintText) && this.translated == messageBody.translated && Intrinsics.areEqual(this.integrationMessageData, messageBody.integrationMessageData) && Intrinsics.areEqual(this.formInputData, messageBody.formInputData);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getEmoticon() {
        return this.emoticon;
    }

    @Nullable
    public final FormInputData getFormInputData() {
        return this.formInputData;
    }

    @Nullable
    public final String getFromUserDisplayName() {
        return this.fromUserDisplayName;
    }

    @Nullable
    public final String getHintText() {
        return this.hintText;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getInResponseToMessageId() {
        return this.inResponseToMessageId;
    }

    @Nullable
    public final JSONObject getIntegrationMessageData() {
        return this.integrationMessageData;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMessageText() {
        return this.messageText;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final String getResponsePool() {
        return this.responsePool;
    }

    @Nullable
    public final String getSourceClass() {
        return this.sourceClass;
    }

    @Nullable
    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public final boolean getTranslated() {
        return this.translated;
    }

    @Nullable
    public final String getVoice() {
        return this.voice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v56 */
    public int hashCode() {
        String str = this.messageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceClass;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responsePool;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.emoticon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromUserDisplayName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sourceSessionId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.messageType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.conversationId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.inResponseToMessageId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.id;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.voice;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.hintText;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        boolean z10 = this.translated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode13 + r3) * 31;
        JSONObject jSONObject = this.integrationMessageData;
        int iHashCode14 = (i10 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        FormInputData formInputData = this.formInputData;
        return iHashCode14 + (formInputData != null ? formInputData.hashCode() : 0);
    }

    public final void setConversationId(@Nullable String str) {
        this.conversationId = str;
    }

    public final void setEmoticon(@Nullable String str) {
        this.emoticon = str;
    }

    public final void setFromUserDisplayName(@Nullable String str) {
        this.fromUserDisplayName = str;
    }

    public final void setHintText(@Nullable String str) {
        this.hintText = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setInResponseToMessageId(@Nullable String str) {
        this.inResponseToMessageId = str;
    }

    public final void setMessageId(@Nullable String str) {
        this.messageId = str;
    }

    public final void setMessageText(@Nullable String str) {
        this.messageText = str;
    }

    public final void setMessageType(@Nullable String str) {
        this.messageType = str;
    }

    public final void setResponsePool(@Nullable String str) {
        this.responsePool = str;
    }

    public final void setSourceClass(@Nullable String str) {
        this.sourceClass = str;
    }

    public final void setSourceSessionId(@Nullable String str) {
        this.sourceSessionId = str;
    }

    public final void setVoice(@Nullable String str) {
        this.voice = str;
    }

    @NotNull
    public String toString() {
        String str = this.messageId;
        String str2 = this.sourceClass;
        String str3 = this.messageText;
        String str4 = this.responsePool;
        String str5 = this.emoticon;
        String str6 = this.fromUserDisplayName;
        String str7 = this.sourceSessionId;
        String str8 = this.messageType;
        String str9 = this.conversationId;
        String str10 = this.inResponseToMessageId;
        String str11 = this.id;
        String str12 = this.voice;
        String str13 = this.hintText;
        boolean z10 = this.translated;
        JSONObject jSONObject = this.integrationMessageData;
        FormInputData formInputData = this.formInputData;
        StringBuilder sbC = a.c("MessageBody(messageId=", str, ", sourceClass=", str2, ", messageText=");
        k.e(sbC, str3, ", responsePool=", str4, ", emoticon=");
        k.e(sbC, str5, ", fromUserDisplayName=", str6, ", sourceSessionId=");
        k.e(sbC, str7, ", messageType=", str8, ", conversationId=");
        k.e(sbC, str9, ", inResponseToMessageId=", str10, ", id=");
        k.e(sbC, str11, ", voice=", str12, ", hintText=");
        sbC.append(str13);
        sbC.append(", translated=");
        sbC.append(z10);
        sbC.append(", integrationMessageData=");
        sbC.append(jSONObject);
        sbC.append(", formInputData=");
        sbC.append(formInputData);
        sbC.append(")");
        return sbC.toString();
    }

    public MessageBody(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, boolean z10, @Nullable JSONObject jSONObject, @Nullable FormInputData formInputData) {
        this.messageId = str;
        this.sourceClass = str2;
        this.messageText = str3;
        this.responsePool = str4;
        this.emoticon = str5;
        this.fromUserDisplayName = str6;
        this.sourceSessionId = str7;
        this.messageType = str8;
        this.conversationId = str9;
        this.inResponseToMessageId = str10;
        this.id = str11;
        this.voice = str12;
        this.hintText = str13;
        this.translated = z10;
        this.integrationMessageData = jSONObject;
        this.formInputData = formInputData;
    }

    public /* synthetic */ MessageBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z10, JSONObject jSONObject, FormInputData formInputData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) != 0 ? null : str12, (i10 & 4096) != 0 ? null : str13, (i10 & 8192) != 0 ? false : z10, (i10 & 16384) != 0 ? null : jSONObject, (i10 & 32768) != 0 ? null : formInputData);
    }
}
