package com.bbva.component.dm.settings.domain.model;

import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/Exceptions;", "", "", "component1", "component2", "Lcom/bbva/component/dm/settings/domain/model/WhenClause;", "component3", "valueAap", "valueHost", "whenClause", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValueAap", "()Ljava/lang/String;", "b", "getValueHost", "c", "Lcom/bbva/component/dm/settings/domain/model/WhenClause;", "getWhenClause", "()Lcom/bbva/component/dm/settings/domain/model/WhenClause;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/WhenClause;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Exceptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueAAP")
    @Nullable
    private final String valueAap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueHOST")
    @Nullable
    private final String valueHost;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("when")
    @Nullable
    private final WhenClause whenClause;

    public Exceptions(@Nullable String str, @Nullable String str2, @Nullable WhenClause whenClause) {
        this.valueAap = str;
        this.valueHost = str2;
        this.whenClause = whenClause;
    }

    public static /* synthetic */ Exceptions copy$default(Exceptions exceptions, String str, String str2, WhenClause whenClause, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exceptions.valueAap;
        }
        if ((i10 & 2) != 0) {
            str2 = exceptions.valueHost;
        }
        if ((i10 & 4) != 0) {
            whenClause = exceptions.whenClause;
        }
        return exceptions.copy(str, str2, whenClause);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValueAap() {
        return this.valueAap;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueHost() {
        return this.valueHost;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WhenClause getWhenClause() {
        return this.whenClause;
    }

    @NotNull
    public final Exceptions copy(@Nullable String valueAap, @Nullable String valueHost, @Nullable WhenClause whenClause) {
        return new Exceptions(valueAap, valueHost, whenClause);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Exceptions)) {
            return false;
        }
        Exceptions exceptions = (Exceptions) other;
        return Intrinsics.areEqual(this.valueAap, exceptions.valueAap) && Intrinsics.areEqual(this.valueHost, exceptions.valueHost) && Intrinsics.areEqual(this.whenClause, exceptions.whenClause);
    }

    @Nullable
    public final String getValueAap() {
        return this.valueAap;
    }

    @Nullable
    public final String getValueHost() {
        return this.valueHost;
    }

    @Nullable
    public final WhenClause getWhenClause() {
        return this.whenClause;
    }

    public int hashCode() {
        String str = this.valueAap;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.valueHost;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WhenClause whenClause = this.whenClause;
        return iHashCode2 + (whenClause != null ? whenClause.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.valueAap;
        String str2 = this.valueHost;
        WhenClause whenClause = this.whenClause;
        StringBuilder sbC = a.c("Exceptions(valueAap=", str, ", valueHost=", str2, ", whenClause=");
        sbC.append(whenClause);
        sbC.append(")");
        return sbC.toString();
    }
}
