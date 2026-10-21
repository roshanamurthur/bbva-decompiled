package com.mastercard.sonic.analytics.mixpanel.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MixPanel.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/model/MixPanel;", "", "Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", "a", "Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", "getProperties", "()Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;", LogKeysKt.PROPERTIES, "", "b", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "event", "<init>", "(Lcom/mastercard/sonic/analytics/mixpanel/model/Properties;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class MixPanel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(LogKeysKt.PROPERTIES)
    @NotNull
    private final Properties properties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("event")
    @NotNull
    private final String event;

    public MixPanel(@NotNull Properties properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.properties = properties;
        this.event = u.f(properties.getCueName(), "_played");
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final Properties getProperties() {
        return this.properties;
    }
}
