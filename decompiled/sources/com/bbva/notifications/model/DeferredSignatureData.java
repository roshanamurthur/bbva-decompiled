package com.bbva.notifications.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VariablesMessageData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lcom/bbva/notifications/model/DeferredSignatureData;", "", "contractNumber", "", "station", DigipassManagerConstants.KEY_SERIAL_NUMBER, "streamInd", "processId", "noteType", "iProfileQuizIndicator", "deadline", "iProfile", "razIndicator", "eventId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContractNumber", "()Ljava/lang/String;", "getDeadline", "getEventId", "getIProfile", "getIProfileQuizIndicator", "getNoteType", "getProcessId", "getRazIndicator", "getSerialNumber", "getStation", "getStreamInd", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeferredSignatureData {

    @Nullable
    private final String contractNumber;

    @Nullable
    private final String deadline;

    @Nullable
    private final String eventId;

    @Nullable
    private final String iProfile;

    @Nullable
    private final String iProfileQuizIndicator;

    @Nullable
    private final String noteType;

    @Nullable
    private final String processId;

    @Nullable
    private final String razIndicator;

    @SerializedName("serie")
    @Nullable
    private final String serialNumber;

    @Nullable
    private final String station;

    @Nullable
    private final String streamInd;

    public DeferredSignatureData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContractNumber() {
        return this.contractNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRazIndicator() {
        return this.razIndicator;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStation() {
        return this.station;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStreamInd() {
        return this.streamInd;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNoteType() {
        return this.noteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIProfileQuizIndicator() {
        return this.iProfileQuizIndicator;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeadline() {
        return this.deadline;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIProfile() {
        return this.iProfile;
    }

    @NotNull
    public final DeferredSignatureData copy(@Nullable String contractNumber, @Nullable String station, @Nullable String serialNumber, @Nullable String streamInd, @Nullable String processId, @Nullable String noteType, @Nullable String iProfileQuizIndicator, @Nullable String deadline, @Nullable String iProfile, @Nullable String razIndicator, @Nullable String eventId) {
        return new DeferredSignatureData(contractNumber, station, serialNumber, streamInd, processId, noteType, iProfileQuizIndicator, deadline, iProfile, razIndicator, eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeferredSignatureData)) {
            return false;
        }
        DeferredSignatureData deferredSignatureData = (DeferredSignatureData) other;
        return Intrinsics.areEqual(this.contractNumber, deferredSignatureData.contractNumber) && Intrinsics.areEqual(this.station, deferredSignatureData.station) && Intrinsics.areEqual(this.serialNumber, deferredSignatureData.serialNumber) && Intrinsics.areEqual(this.streamInd, deferredSignatureData.streamInd) && Intrinsics.areEqual(this.processId, deferredSignatureData.processId) && Intrinsics.areEqual(this.noteType, deferredSignatureData.noteType) && Intrinsics.areEqual(this.iProfileQuizIndicator, deferredSignatureData.iProfileQuizIndicator) && Intrinsics.areEqual(this.deadline, deferredSignatureData.deadline) && Intrinsics.areEqual(this.iProfile, deferredSignatureData.iProfile) && Intrinsics.areEqual(this.razIndicator, deferredSignatureData.razIndicator) && Intrinsics.areEqual(this.eventId, deferredSignatureData.eventId);
    }

    @Nullable
    public final String getContractNumber() {
        return this.contractNumber;
    }

    @Nullable
    public final String getDeadline() {
        return this.deadline;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getIProfile() {
        return this.iProfile;
    }

    @Nullable
    public final String getIProfileQuizIndicator() {
        return this.iProfileQuizIndicator;
    }

    @Nullable
    public final String getNoteType() {
        return this.noteType;
    }

    @Nullable
    public final String getProcessId() {
        return this.processId;
    }

    @Nullable
    public final String getRazIndicator() {
        return this.razIndicator;
    }

    @Nullable
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public final String getStation() {
        return this.station;
    }

    @Nullable
    public final String getStreamInd() {
        return this.streamInd;
    }

    public int hashCode() {
        String str = this.contractNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.station;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serialNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streamInd;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.processId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.noteType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iProfileQuizIndicator;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deadline;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.iProfile;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.razIndicator;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.eventId;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.contractNumber;
        String str2 = this.station;
        String str3 = this.serialNumber;
        String str4 = this.streamInd;
        String str5 = this.processId;
        String str6 = this.noteType;
        String str7 = this.iProfileQuizIndicator;
        String str8 = this.deadline;
        String str9 = this.iProfile;
        String str10 = this.razIndicator;
        String str11 = this.eventId;
        StringBuilder sbC = a.c("DeferredSignatureData(contractNumber=", str, ", station=", str2, ", serialNumber=");
        k.e(sbC, str3, ", streamInd=", str4, ", processId=");
        k.e(sbC, str5, ", noteType=", str6, ", iProfileQuizIndicator=");
        k.e(sbC, str7, ", deadline=", str8, ", iProfile=");
        k.e(sbC, str9, ", razIndicator=", str10, ", eventId=");
        return d.f(sbC, str11, ")");
    }

    public DeferredSignatureData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.contractNumber = str;
        this.station = str2;
        this.serialNumber = str3;
        this.streamInd = str4;
        this.processId = str5;
        this.noteType = str6;
        this.iProfileQuizIndicator = str7;
        this.deadline = str8;
        this.iProfile = str9;
        this.razIndicator = str10;
        this.eventId = str11;
    }

    public /* synthetic */ DeferredSignatureData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) == 0 ? str11 : null);
    }
}
