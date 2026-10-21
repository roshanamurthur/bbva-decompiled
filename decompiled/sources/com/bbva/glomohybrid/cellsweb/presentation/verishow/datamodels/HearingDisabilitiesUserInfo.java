package com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels;

import androidx.constraintlayout.core.parser.a;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HearingDisabilitiesUserInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesUserInfo;", "", "id", "", CustomerLoginsParser.FIRST_NAME, "controlOnlyInfo", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesControlOnlyInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesControlOnlyInfo;)V", "getControlOnlyInfo", "()Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesControlOnlyInfo;", "getFirstName", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HearingDisabilitiesUserInfo {

    @Nullable
    private final HearingDisabilitiesControlOnlyInfo controlOnlyInfo;

    @Nullable
    private final String firstName;

    @Nullable
    private final String id;

    public HearingDisabilitiesUserInfo(@Nullable String str, @Nullable String str2, @Nullable HearingDisabilitiesControlOnlyInfo hearingDisabilitiesControlOnlyInfo) {
        this.id = str;
        this.firstName = str2;
        this.controlOnlyInfo = hearingDisabilitiesControlOnlyInfo;
    }

    public static /* synthetic */ HearingDisabilitiesUserInfo copy$default(HearingDisabilitiesUserInfo hearingDisabilitiesUserInfo, String str, String str2, HearingDisabilitiesControlOnlyInfo hearingDisabilitiesControlOnlyInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hearingDisabilitiesUserInfo.id;
        }
        if ((i10 & 2) != 0) {
            str2 = hearingDisabilitiesUserInfo.firstName;
        }
        if ((i10 & 4) != 0) {
            hearingDisabilitiesControlOnlyInfo = hearingDisabilitiesUserInfo.controlOnlyInfo;
        }
        return hearingDisabilitiesUserInfo.copy(str, str2, hearingDisabilitiesControlOnlyInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HearingDisabilitiesControlOnlyInfo getControlOnlyInfo() {
        return this.controlOnlyInfo;
    }

    @NotNull
    public final HearingDisabilitiesUserInfo copy(@Nullable String id, @Nullable String firstName, @Nullable HearingDisabilitiesControlOnlyInfo controlOnlyInfo) {
        return new HearingDisabilitiesUserInfo(id, firstName, controlOnlyInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingDisabilitiesUserInfo)) {
            return false;
        }
        HearingDisabilitiesUserInfo hearingDisabilitiesUserInfo = (HearingDisabilitiesUserInfo) other;
        return Intrinsics.areEqual(this.id, hearingDisabilitiesUserInfo.id) && Intrinsics.areEqual(this.firstName, hearingDisabilitiesUserInfo.firstName) && Intrinsics.areEqual(this.controlOnlyInfo, hearingDisabilitiesUserInfo.controlOnlyInfo);
    }

    @Nullable
    public final HearingDisabilitiesControlOnlyInfo getControlOnlyInfo() {
        return this.controlOnlyInfo;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HearingDisabilitiesControlOnlyInfo hearingDisabilitiesControlOnlyInfo = this.controlOnlyInfo;
        return iHashCode2 + (hearingDisabilitiesControlOnlyInfo != null ? hearingDisabilitiesControlOnlyInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.firstName;
        HearingDisabilitiesControlOnlyInfo hearingDisabilitiesControlOnlyInfo = this.controlOnlyInfo;
        StringBuilder sbC = a.c("HearingDisabilitiesUserInfo(id=", str, ", firstName=", str2, ", controlOnlyInfo=");
        sbC.append(hearingDisabilitiesControlOnlyInfo);
        sbC.append(")");
        return sbC.toString();
    }
}
