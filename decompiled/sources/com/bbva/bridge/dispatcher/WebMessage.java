package com.bbva.bridge.dispatcher;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebMessage.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/bridge/dispatcher/WebMessage;", "", "", "component1", "component2", "channelName", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getChannelName", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class WebMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object payload;

    public WebMessage(@NotNull String channelName, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        this.channelName = channelName;
        this.payload = obj;
    }

    public static /* synthetic */ WebMessage copy$default(WebMessage webMessage, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = webMessage.channelName;
        }
        if ((i10 & 2) != 0) {
            obj = webMessage.payload;
        }
        return webMessage.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final WebMessage copy(@NotNull String channelName, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        return new WebMessage(channelName, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebMessage)) {
            return false;
        }
        WebMessage webMessage = (WebMessage) other;
        return Intrinsics.areEqual(this.channelName, webMessage.channelName) && Intrinsics.areEqual(this.payload, webMessage.payload);
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    public final Object getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int iHashCode = this.channelName.hashCode() * 31;
        Object obj = this.payload;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "WebMessage(channelName=" + this.channelName + ", payload=" + this.payload + ")";
    }
}
