package mx.openpay.library.domain.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmvTerminalData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "", "", "component1", "component2", "component3", "component4", "component5", "affiliationNumber", "issuerAuthData", "issuerScript71", "issuerScript72", "requiresNewKey", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAffiliationNumber", "()Ljava/lang/String;", "b", "getIssuerAuthData", "c", "getIssuerScript71", "d", "getIssuerScript72", "e", "getRequiresNewKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EmvTerminalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String affiliationNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String issuerAuthData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String issuerScript71;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String issuerScript72;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String requiresNewKey;

    public EmvTerminalData(@NotNull String affiliationNumber, @NotNull String issuerAuthData, @NotNull String issuerScript71, @NotNull String issuerScript72, @NotNull String requiresNewKey) {
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

    public static /* synthetic */ EmvTerminalData copy$default(EmvTerminalData emvTerminalData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emvTerminalData.affiliationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = emvTerminalData.issuerAuthData;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = emvTerminalData.issuerScript71;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = emvTerminalData.issuerScript72;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = emvTerminalData.requiresNewKey;
        }
        return emvTerminalData.copy(str, str6, str7, str8, str5);
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
    public final EmvTerminalData copy(@NotNull String affiliationNumber, @NotNull String issuerAuthData, @NotNull String issuerScript71, @NotNull String issuerScript72, @NotNull String requiresNewKey) {
        Intrinsics.checkNotNullParameter(affiliationNumber, "affiliationNumber");
        Intrinsics.checkNotNullParameter(issuerAuthData, "issuerAuthData");
        Intrinsics.checkNotNullParameter(issuerScript71, "issuerScript71");
        Intrinsics.checkNotNullParameter(issuerScript72, "issuerScript72");
        Intrinsics.checkNotNullParameter(requiresNewKey, "requiresNewKey");
        return new EmvTerminalData(affiliationNumber, issuerAuthData, issuerScript71, issuerScript72, requiresNewKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmvTerminalData)) {
            return false;
        }
        EmvTerminalData emvTerminalData = (EmvTerminalData) other;
        return Intrinsics.areEqual(this.affiliationNumber, emvTerminalData.affiliationNumber) && Intrinsics.areEqual(this.issuerAuthData, emvTerminalData.issuerAuthData) && Intrinsics.areEqual(this.issuerScript71, emvTerminalData.issuerScript71) && Intrinsics.areEqual(this.issuerScript72, emvTerminalData.issuerScript72) && Intrinsics.areEqual(this.requiresNewKey, emvTerminalData.requiresNewKey);
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
        return this.requiresNewKey.hashCode() + n1.c(this.issuerScript72, n1.c(this.issuerScript71, n1.c(this.issuerAuthData, this.affiliationNumber.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmvTerminalData(affiliationNumber=");
        sb2.append(this.affiliationNumber);
        sb2.append(", issuerAuthData=");
        sb2.append(this.issuerAuthData);
        sb2.append(", issuerScript71=");
        sb2.append(this.issuerScript71);
        sb2.append(", issuerScript72=");
        sb2.append(this.issuerScript72);
        sb2.append(", requiresNewKey=");
        return d.f(sb2, this.requiresNewKey, ")");
    }
}
