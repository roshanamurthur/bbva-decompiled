package mx.openpay.library.core.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayEmvTerminalData;", "", "affiliationNumber", "", "issuerAuthData", "issuerScript71", "issuerScript72", "requiresNewKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAffiliationNumber", "()Ljava/lang/String;", "getIssuerAuthData", "getIssuerScript71", "getIssuerScript72", "getRequiresNewKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayEmvTerminalData {
    public static final int $stable = 0;

    @NotNull
    private final String affiliationNumber;

    @NotNull
    private final String issuerAuthData;

    @NotNull
    private final String issuerScript71;

    @NotNull
    private final String issuerScript72;

    @NotNull
    private final String requiresNewKey;

    public OpenPayEmvTerminalData(@NotNull String affiliationNumber, @NotNull String issuerAuthData, @NotNull String issuerScript71, @NotNull String issuerScript72, @NotNull String requiresNewKey) {
        Intrinsics.checkNotNullParameter(affiliationNumber, "affiliationNumber");
        Intrinsics.checkNotNullParameter(issuerAuthData, "issuerAuthData");
        Intrinsics.checkNotNullParameter(issuerScript71, "issuerScript71");
        Intrinsics.checkNotNullParameter(issuerScript72, "issuerScript72");
        Intrinsics.checkNotNullParameter(requiresNewKey, "requiresNewKey");
        this.affiliationNumber = affiliationNumber;
        this.issuerAuthData = issuerAuthData;
        this.issuerScript71 = issuerScript71;
        this.issuerScript72 = issuerScript72;
        this.requiresNewKey = requiresNewKey;
    }

    public static /* synthetic */ OpenPayEmvTerminalData copy$default(OpenPayEmvTerminalData openPayEmvTerminalData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayEmvTerminalData.affiliationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayEmvTerminalData.issuerAuthData;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = openPayEmvTerminalData.issuerScript71;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = openPayEmvTerminalData.issuerScript72;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = openPayEmvTerminalData.requiresNewKey;
        }
        return openPayEmvTerminalData.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAffiliationNumber() {
        return this.affiliationNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuerAuthData() {
        return this.issuerAuthData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssuerScript71() {
        return this.issuerScript71;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIssuerScript72() {
        return this.issuerScript72;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequiresNewKey() {
        return this.requiresNewKey;
    }

    @NotNull
    public final OpenPayEmvTerminalData copy(@NotNull String affiliationNumber, @NotNull String issuerAuthData, @NotNull String issuerScript71, @NotNull String issuerScript72, @NotNull String requiresNewKey) {
        Intrinsics.checkNotNullParameter(affiliationNumber, "affiliationNumber");
        Intrinsics.checkNotNullParameter(issuerAuthData, "issuerAuthData");
        Intrinsics.checkNotNullParameter(issuerScript71, "issuerScript71");
        Intrinsics.checkNotNullParameter(issuerScript72, "issuerScript72");
        Intrinsics.checkNotNullParameter(requiresNewKey, "requiresNewKey");
        return new OpenPayEmvTerminalData(affiliationNumber, issuerAuthData, issuerScript71, issuerScript72, requiresNewKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayEmvTerminalData)) {
            return false;
        }
        OpenPayEmvTerminalData openPayEmvTerminalData = (OpenPayEmvTerminalData) other;
        return Intrinsics.areEqual(this.affiliationNumber, openPayEmvTerminalData.affiliationNumber) && Intrinsics.areEqual(this.issuerAuthData, openPayEmvTerminalData.issuerAuthData) && Intrinsics.areEqual(this.issuerScript71, openPayEmvTerminalData.issuerScript71) && Intrinsics.areEqual(this.issuerScript72, openPayEmvTerminalData.issuerScript72) && Intrinsics.areEqual(this.requiresNewKey, openPayEmvTerminalData.requiresNewKey);
    }

    @NotNull
    public final String getAffiliationNumber() {
        return this.affiliationNumber;
    }

    @NotNull
    public final String getIssuerAuthData() {
        return this.issuerAuthData;
    }

    @NotNull
    public final String getIssuerScript71() {
        return this.issuerScript71;
    }

    @NotNull
    public final String getIssuerScript72() {
        return this.issuerScript72;
    }

    @NotNull
    public final String getRequiresNewKey() {
        return this.requiresNewKey;
    }

    public int hashCode() {
        return this.requiresNewKey.hashCode() + a.a(this.issuerScript72, a.a(this.issuerScript71, a.a(this.issuerAuthData, this.affiliationNumber.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.affiliationNumber;
        String str2 = this.issuerAuthData;
        String str3 = this.issuerScript71;
        String str4 = this.issuerScript72;
        String str5 = this.requiresNewKey;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayEmvTerminalData(affiliationNumber=", str, ", issuerAuthData=", str2, ", issuerScript71=");
        k.e(sbC, str3, ", issuerScript72=", str4, ", requiresNewKey=");
        return d.f(sbC, str5, ")");
    }
}
