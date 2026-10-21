package com.mastercard.sonic.hapticsmanager.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PatternItem.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/PatternItem;", "", "Lcom/mastercard/sonic/hapticsmanager/model/Event;", "component1", "Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurve;", "component2", "event", "parameterCurve", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/mastercard/sonic/hapticsmanager/model/Event;", "getEvent", "()Lcom/mastercard/sonic/hapticsmanager/model/Event;", "b", "Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurve;", "getParameterCurve", "()Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurve;", "<init>", "(Lcom/mastercard/sonic/hapticsmanager/model/Event;Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurve;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PatternItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Event")
    @NotNull
    private final Event event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterCurve")
    @Nullable
    private final ParameterCurve parameterCurve;

    public PatternItem(@NotNull Event event, @Nullable ParameterCurve parameterCurve) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
        this.parameterCurve = parameterCurve;
    }

    public static /* synthetic */ PatternItem copy$default(PatternItem patternItem, Event event, ParameterCurve parameterCurve, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            event = patternItem.event;
        }
        if ((i10 & 2) != 0) {
            parameterCurve = patternItem.parameterCurve;
        }
        return patternItem.copy(event, parameterCurve);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ParameterCurve getParameterCurve() {
        return this.parameterCurve;
    }

    @NotNull
    public final PatternItem copy(@NotNull Event event, @Nullable ParameterCurve parameterCurve) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new PatternItem(event, parameterCurve);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) other;
        return Intrinsics.areEqual(this.event, patternItem.event) && Intrinsics.areEqual(this.parameterCurve, patternItem.parameterCurve);
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    public final ParameterCurve getParameterCurve() {
        return this.parameterCurve;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        ParameterCurve parameterCurve = this.parameterCurve;
        return iHashCode + (parameterCurve == null ? 0 : parameterCurve.hashCode());
    }

    @NotNull
    public String toString() {
        return "PatternItem(event=" + this.event + ", parameterCurve=" + this.parameterCurve + ")";
    }
}
