package com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels;

import ad.d;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HearingDisabilitiesAssigmentInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesAssigmentInfo;", "", "account", "", "project", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getProject", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HearingDisabilitiesAssigmentInfo {

    @Nullable
    private final String account;

    @Nullable
    private final String project;

    @Nullable
    private final String token;

    public HearingDisabilitiesAssigmentInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.account = str;
        this.project = str2;
        this.token = str3;
    }

    public static /* synthetic */ HearingDisabilitiesAssigmentInfo copy$default(HearingDisabilitiesAssigmentInfo hearingDisabilitiesAssigmentInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hearingDisabilitiesAssigmentInfo.account;
        }
        if ((i10 & 2) != 0) {
            str2 = hearingDisabilitiesAssigmentInfo.project;
        }
        if ((i10 & 4) != 0) {
            str3 = hearingDisabilitiesAssigmentInfo.token;
        }
        return hearingDisabilitiesAssigmentInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProject() {
        return this.project;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final HearingDisabilitiesAssigmentInfo copy(@Nullable String account, @Nullable String project, @Nullable String token) {
        return new HearingDisabilitiesAssigmentInfo(account, project, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingDisabilitiesAssigmentInfo)) {
            return false;
        }
        HearingDisabilitiesAssigmentInfo hearingDisabilitiesAssigmentInfo = (HearingDisabilitiesAssigmentInfo) other;
        return Intrinsics.areEqual(this.account, hearingDisabilitiesAssigmentInfo.account) && Intrinsics.areEqual(this.project, hearingDisabilitiesAssigmentInfo.project) && Intrinsics.areEqual(this.token, hearingDisabilitiesAssigmentInfo.token);
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getProject() {
        return this.project;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.account;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.project;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.account;
        String str2 = this.project;
        return d.f(a.c("HearingDisabilitiesAssigmentInfo(account=", str, ", project=", str2, ", token="), this.token, ")");
    }
}
