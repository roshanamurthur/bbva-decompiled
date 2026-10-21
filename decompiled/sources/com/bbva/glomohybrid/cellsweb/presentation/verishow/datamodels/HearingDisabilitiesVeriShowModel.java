package com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HearingDisabilitiesVeriShowModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesVeriShowModel;", "", "userInfo", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesUserInfo;", "assignmentInfo", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesAssigmentInfo;", "(Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesUserInfo;Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesAssigmentInfo;)V", "getAssignmentInfo", "()Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesAssigmentInfo;", "getUserInfo", "()Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesUserInfo;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HearingDisabilitiesVeriShowModel {

    @Nullable
    private final HearingDisabilitiesAssigmentInfo assignmentInfo;

    @Nullable
    private final HearingDisabilitiesUserInfo userInfo;

    public HearingDisabilitiesVeriShowModel(@Nullable HearingDisabilitiesUserInfo hearingDisabilitiesUserInfo, @Nullable HearingDisabilitiesAssigmentInfo hearingDisabilitiesAssigmentInfo) {
        this.userInfo = hearingDisabilitiesUserInfo;
        this.assignmentInfo = hearingDisabilitiesAssigmentInfo;
    }

    public static /* synthetic */ HearingDisabilitiesVeriShowModel copy$default(HearingDisabilitiesVeriShowModel hearingDisabilitiesVeriShowModel, HearingDisabilitiesUserInfo hearingDisabilitiesUserInfo, HearingDisabilitiesAssigmentInfo hearingDisabilitiesAssigmentInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hearingDisabilitiesUserInfo = hearingDisabilitiesVeriShowModel.userInfo;
        }
        if ((i10 & 2) != 0) {
            hearingDisabilitiesAssigmentInfo = hearingDisabilitiesVeriShowModel.assignmentInfo;
        }
        return hearingDisabilitiesVeriShowModel.copy(hearingDisabilitiesUserInfo, hearingDisabilitiesAssigmentInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HearingDisabilitiesUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HearingDisabilitiesAssigmentInfo getAssignmentInfo() {
        return this.assignmentInfo;
    }

    @NotNull
    public final HearingDisabilitiesVeriShowModel copy(@Nullable HearingDisabilitiesUserInfo userInfo, @Nullable HearingDisabilitiesAssigmentInfo assignmentInfo) {
        return new HearingDisabilitiesVeriShowModel(userInfo, assignmentInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingDisabilitiesVeriShowModel)) {
            return false;
        }
        HearingDisabilitiesVeriShowModel hearingDisabilitiesVeriShowModel = (HearingDisabilitiesVeriShowModel) other;
        return Intrinsics.areEqual(this.userInfo, hearingDisabilitiesVeriShowModel.userInfo) && Intrinsics.areEqual(this.assignmentInfo, hearingDisabilitiesVeriShowModel.assignmentInfo);
    }

    @Nullable
    public final HearingDisabilitiesAssigmentInfo getAssignmentInfo() {
        return this.assignmentInfo;
    }

    @Nullable
    public final HearingDisabilitiesUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        HearingDisabilitiesUserInfo hearingDisabilitiesUserInfo = this.userInfo;
        int iHashCode = (hearingDisabilitiesUserInfo == null ? 0 : hearingDisabilitiesUserInfo.hashCode()) * 31;
        HearingDisabilitiesAssigmentInfo hearingDisabilitiesAssigmentInfo = this.assignmentInfo;
        return iHashCode + (hearingDisabilitiesAssigmentInfo != null ? hearingDisabilitiesAssigmentInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HearingDisabilitiesVeriShowModel(userInfo=" + this.userInfo + ", assignmentInfo=" + this.assignmentInfo + ")";
    }
}
