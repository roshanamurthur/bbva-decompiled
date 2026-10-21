package com.mastercard.sonic.hapticsmanager.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000b¨\u0006,"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/Event;", "", "", "Lcom/mastercard/sonic/hapticsmanager/model/EventParameter;", "component1", "", "component2", "component3", "", "component4", "component5", "()Ljava/lang/Double;", "eventParameters", "eventType", "name", "time", "eventDuration", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;)Lcom/mastercard/sonic/hapticsmanager/model/Event;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getEventParameters", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "c", "getName", "d", "D", "getTime", "()D", "e", "Ljava/lang/Double;", "getEventDuration", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EventParameters")
    @NotNull
    private final List<EventParameter> eventParameters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EventType")
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Time")
    private final double time;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EventDuration")
    @Nullable
    private final Double eventDuration;

    public Event(@NotNull List<EventParameter> eventParameters, @NotNull String eventType, @NotNull String name, double d2, @Nullable Double d3) {
        Intrinsics.checkNotNullParameter(eventParameters, "eventParameters");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.eventParameters = eventParameters;
        this.eventType = eventType;
        this.name = name;
        this.time = d2;
        this.eventDuration = d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Event copy$default(Event event, List list, String str, String str2, double d2, Double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = event.eventParameters;
        }
        if ((i10 & 2) != 0) {
            str = event.eventType;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = event.name;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            d2 = event.time;
        }
        double d7 = d2;
        if ((i10 & 16) != 0) {
            d3 = event.eventDuration;
        }
        return event.copy(list, str3, str4, d7, d3);
    }

    @NotNull
    public final List<EventParameter> component1() {
        return this.eventParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getEventDuration() {
        return this.eventDuration;
    }

    @NotNull
    public final Event copy(@NotNull List<EventParameter> eventParameters, @NotNull String eventType, @NotNull String name, double time, @Nullable Double eventDuration) {
        Intrinsics.checkNotNullParameter(eventParameters, "eventParameters");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Event(eventParameters, eventType, name, time, eventDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(this.eventParameters, event.eventParameters) && Intrinsics.areEqual(this.eventType, event.eventType) && Intrinsics.areEqual(this.name, event.name) && Double.compare(this.time, event.time) == 0 && Intrinsics.areEqual((Object) this.eventDuration, (Object) event.eventDuration);
    }

    @Nullable
    public final Double getEventDuration() {
        return this.eventDuration;
    }

    @NotNull
    public final List<EventParameter> getEventParameters() {
        return this.eventParameters;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getTime() {
        return this.time;
    }

    public int hashCode() {
        int iC = n1.c(this.name, n1.c(this.eventType, this.eventParameters.hashCode() * 31, 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.time);
        int i10 = (iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        Double d2 = this.eventDuration;
        return i10 + (d2 == null ? 0 : d2.hashCode());
    }

    @NotNull
    public String toString() {
        return "Event(eventParameters=" + this.eventParameters + ", eventType=" + this.eventType + ", name=" + this.name + ", time=" + this.time + ", eventDuration=" + this.eventDuration + ")";
    }
}
