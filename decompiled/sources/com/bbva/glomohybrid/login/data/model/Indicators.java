package com.bbva.glomohybrid.login.data.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Indicators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/Indicators;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "indicatorId", "name", "isActive", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/glomohybrid/login/data/model/Indicators;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getIndicatorId", "()Ljava/lang/String;", "b", "getName", "c", "Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Indicators {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String indicatorId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean isActive;

    public Indicators(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.indicatorId = str;
        this.name = str2;
        this.isActive = bool;
    }

    public static /* synthetic */ Indicators copy$default(Indicators indicators, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = indicators.indicatorId;
        }
        if ((i10 & 2) != 0) {
            str2 = indicators.name;
        }
        if ((i10 & 4) != 0) {
            bool = indicators.isActive;
        }
        return indicators.copy(str, str2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIndicatorId() {
        return this.indicatorId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final Indicators copy(@Nullable String indicatorId, @Nullable String name, @Nullable Boolean isActive) {
        return new Indicators(indicatorId, name, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Indicators)) {
            return false;
        }
        Indicators indicators = (Indicators) other;
        return Intrinsics.areEqual(this.indicatorId, indicators.indicatorId) && Intrinsics.areEqual(this.name, indicators.name) && Intrinsics.areEqual(this.isActive, indicators.isActive);
    }

    @Nullable
    public final String getIndicatorId() {
        return this.indicatorId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.indicatorId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isActive;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "Indicators(indicatorId=" + this.indicatorId + ", name=" + this.name + ", isActive=" + this.isActive + ")";
    }
}
