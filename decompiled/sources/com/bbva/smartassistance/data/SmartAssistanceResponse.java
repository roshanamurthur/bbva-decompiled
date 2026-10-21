package com.bbva.smartassistance.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmartAssistanceResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u001b\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u0015\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bbva/smartassistance/data/SmartAssistanceResponse;", "", "source", "", "", "messageType", PushConstants.GE_MESSAGE_BODY, "Lcom/bbva/smartassistance/data/MessageBody;", "headers", "(Ljava/util/Map;Ljava/lang/String;Lcom/bbva/smartassistance/data/MessageBody;Ljava/util/Map;)V", "getHeaders", "()Ljava/util/Map;", "getMessageBody", "()Lcom/bbva/smartassistance/data/MessageBody;", "getMessageType", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SmartAssistanceResponse {

    @Nullable
    private final Map<String, String> headers;

    @Nullable
    private final MessageBody messageBody;

    @Nullable
    private final String messageType;

    @Nullable
    private final Map<String, String> source;

    public SmartAssistanceResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartAssistanceResponse copy$default(SmartAssistanceResponse smartAssistanceResponse, Map map, String str, MessageBody messageBody, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = smartAssistanceResponse.source;
        }
        if ((i10 & 2) != 0) {
            str = smartAssistanceResponse.messageType;
        }
        if ((i10 & 4) != 0) {
            messageBody = smartAssistanceResponse.messageBody;
        }
        if ((i10 & 8) != 0) {
            map2 = smartAssistanceResponse.headers;
        }
        return smartAssistanceResponse.copy(map, str, messageBody, map2);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.headers;
    }

    @NotNull
    public final SmartAssistanceResponse copy(@Nullable Map<String, String> source, @Nullable String messageType, @Nullable MessageBody messageBody, @Nullable Map<String, String> headers) {
        return new SmartAssistanceResponse(source, messageType, messageBody, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartAssistanceResponse)) {
            return false;
        }
        SmartAssistanceResponse smartAssistanceResponse = (SmartAssistanceResponse) other;
        return Intrinsics.areEqual(this.source, smartAssistanceResponse.source) && Intrinsics.areEqual(this.messageType, smartAssistanceResponse.messageType) && Intrinsics.areEqual(this.messageBody, smartAssistanceResponse.messageBody) && Intrinsics.areEqual(this.headers, smartAssistanceResponse.headers);
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final MessageBody getMessageBody() {
        return this.messageBody;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final Map<String, String> getSource() {
        return this.source;
    }

    public int hashCode() {
        Map<String, String> map = this.source;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.messageType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MessageBody messageBody = this.messageBody;
        int iHashCode3 = (iHashCode2 + (messageBody == null ? 0 : messageBody.hashCode())) * 31;
        Map<String, String> map2 = this.headers;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SmartAssistanceResponse(source=" + this.source + ", messageType=" + this.messageType + ", messageBody=" + this.messageBody + ", headers=" + this.headers + ")";
    }

    public SmartAssistanceResponse(@Nullable Map<String, String> map, @Nullable String str, @Nullable MessageBody messageBody, @Nullable Map<String, String> map2) {
        this.source = map;
        this.messageType = str;
        this.messageBody = messageBody;
        this.headers = map2;
    }

    public /* synthetic */ SmartAssistanceResponse(Map map, String str, MessageBody messageBody, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : messageBody, (i10 & 8) != 0 ? null : map2);
    }
}
