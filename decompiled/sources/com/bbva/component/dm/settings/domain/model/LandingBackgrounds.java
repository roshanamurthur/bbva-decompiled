package com.bbva.component.dm.settings.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoconfig.constants.RouteConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LandingBackgrounds;", "", "", "component1", "component2", "component3", "landing", "login", RouteConstants.DASHBOARD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getLanding", "()Ljava/lang/String;", "b", "getLogin", "c", "getDashboard", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingBackgrounds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String landing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String login;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String dashboard;

    public LandingBackgrounds(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.landing = str;
        this.login = str2;
        this.dashboard = str3;
    }

    public static /* synthetic */ LandingBackgrounds copy$default(LandingBackgrounds landingBackgrounds, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingBackgrounds.landing;
        }
        if ((i10 & 2) != 0) {
            str2 = landingBackgrounds.login;
        }
        if ((i10 & 4) != 0) {
            str3 = landingBackgrounds.dashboard;
        }
        return landingBackgrounds.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanding() {
        return this.landing;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDashboard() {
        return this.dashboard;
    }

    @NotNull
    public final LandingBackgrounds copy(@Nullable String landing, @Nullable String login, @Nullable String dashboard) {
        return new LandingBackgrounds(landing, login, dashboard);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingBackgrounds)) {
            return false;
        }
        LandingBackgrounds landingBackgrounds = (LandingBackgrounds) other;
        return Intrinsics.areEqual(this.landing, landingBackgrounds.landing) && Intrinsics.areEqual(this.login, landingBackgrounds.login) && Intrinsics.areEqual(this.dashboard, landingBackgrounds.dashboard);
    }

    @Nullable
    public final String getDashboard() {
        return this.dashboard;
    }

    @Nullable
    public final String getLanding() {
        return this.landing;
    }

    @Nullable
    public final String getLogin() {
        return this.login;
    }

    public int hashCode() {
        String str = this.landing;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.login;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dashboard;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingBackgrounds(landing=");
        sb2.append(this.landing);
        sb2.append(", login=");
        sb2.append(this.login);
        sb2.append(", dashboard=");
        return d.f(sb2, this.dashboard, ")");
    }
}
