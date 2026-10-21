package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import ad.d;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EmvTerminalDataResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "", "affiliationNumber", "", "issuerAuthData", "issuerScript71", "issuerScript72", "requiresNewKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAffiliationNumber", "()Ljava/lang/String;", "getIssuerAuthData", "getIssuerScript71", "getIssuerScript72", "getRequiresNewKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EmvTerminalDataResponseDto {

    @SerializedName("affiliationNumber")
    @Nullable
    private final String affiliationNumber;

    @SerializedName("issuerAuthData")
    @Nullable
    private final String issuerAuthData;

    @SerializedName("issuerScript71")
    @Nullable
    private final String issuerScript71;

    @SerializedName("issuerScript72")
    @Nullable
    private final String issuerScript72;

    @SerializedName("requiresNewKey")
    @Nullable
    private final String requiresNewKey;

    public EmvTerminalDataResponseDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.affiliationNumber = str;
        this.issuerAuthData = str2;
        this.issuerScript71 = str3;
        this.issuerScript72 = str4;
        this.requiresNewKey = str5;
    }

    public static /* synthetic */ EmvTerminalDataResponseDto copy$default(EmvTerminalDataResponseDto emvTerminalDataResponseDto, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emvTerminalDataResponseDto.affiliationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = emvTerminalDataResponseDto.issuerAuthData;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = emvTerminalDataResponseDto.issuerScript71;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = emvTerminalDataResponseDto.issuerScript72;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = emvTerminalDataResponseDto.requiresNewKey;
        }
        return emvTerminalDataResponseDto.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAffiliationNumber() {
        return this.affiliationNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuerAuthData() {
        return this.issuerAuthData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssuerScript71() {
        return this.issuerScript71;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIssuerScript72() {
        return this.issuerScript72;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequiresNewKey() {
        return this.requiresNewKey;
    }

    @NotNull
    public final EmvTerminalDataResponseDto copy(@Nullable String affiliationNumber, @Nullable String issuerAuthData, @Nullable String issuerScript71, @Nullable String issuerScript72, @Nullable String requiresNewKey) {
        return new EmvTerminalDataResponseDto(affiliationNumber, issuerAuthData, issuerScript71, issuerScript72, requiresNewKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmvTerminalDataResponseDto)) {
            return false;
        }
        EmvTerminalDataResponseDto emvTerminalDataResponseDto = (EmvTerminalDataResponseDto) other;
        return Intrinsics.areEqual(this.affiliationNumber, emvTerminalDataResponseDto.affiliationNumber) && Intrinsics.areEqual(this.issuerAuthData, emvTerminalDataResponseDto.issuerAuthData) && Intrinsics.areEqual(this.issuerScript71, emvTerminalDataResponseDto.issuerScript71) && Intrinsics.areEqual(this.issuerScript72, emvTerminalDataResponseDto.issuerScript72) && Intrinsics.areEqual(this.requiresNewKey, emvTerminalDataResponseDto.requiresNewKey);
    }

    @Nullable
    public final String getAffiliationNumber() {
        return this.affiliationNumber;
    }

    @Nullable
    public final String getIssuerAuthData() {
        return this.issuerAuthData;
    }

    @Nullable
    public final String getIssuerScript71() {
        return this.issuerScript71;
    }

    @Nullable
    public final String getIssuerScript72() {
        return this.issuerScript72;
    }

    @Nullable
    public final String getRequiresNewKey() {
        return this.requiresNewKey;
    }

    public int hashCode() {
        String str = this.affiliationNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issuerAuthData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuerScript71;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.issuerScript72;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requiresNewKey;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.affiliationNumber;
        String str2 = this.issuerAuthData;
        String str3 = this.issuerScript71;
        String str4 = this.issuerScript72;
        String str5 = this.requiresNewKey;
        StringBuilder sbC = a.c("EmvTerminalDataResponseDto(affiliationNumber=", str, ", issuerAuthData=", str2, ", issuerScript71=");
        k.e(sbC, str3, ", issuerScript72=", str4, ", requiresNewKey=");
        return d.f(sbC, str5, ")");
    }
}
