package com.bbva.plugin.appsflyer.models;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.config.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/appsflyer/models/TrackEventDTO;", "", a.f64108s, "", "eventValue", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "getEventValue", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrackEventDTO {

    @NotNull
    private final String eventName;

    @NotNull
    private final Map<String, Object> eventValue;

    public TrackEventDTO(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventValue) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        this.eventName = eventName;
        this.eventValue = eventValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackEventDTO copy$default(TrackEventDTO trackEventDTO, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = trackEventDTO.eventName;
        }
        if ((i10 & 2) != 0) {
            map = trackEventDTO.eventValue;
        }
        return trackEventDTO.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.eventValue;
    }

    @NotNull
    public final TrackEventDTO copy(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventValue) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        return new TrackEventDTO(eventName, eventValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackEventDTO)) {
            return false;
        }
        TrackEventDTO trackEventDTO = (TrackEventDTO) other;
        return Intrinsics.areEqual(this.eventName, trackEventDTO.eventName) && Intrinsics.areEqual(this.eventValue, trackEventDTO.eventValue);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Map<String, Object> getEventValue() {
        return this.eventValue;
    }

    public int hashCode() {
        return this.eventValue.hashCode() + (this.eventName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TrackEventDTO(eventName=" + this.eventName + ", eventValue=" + this.eventValue + ")";
    }
}
