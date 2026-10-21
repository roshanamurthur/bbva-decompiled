package mx.openpay.library.domain.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TerminalKeys.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "", "", "component1", "component2", "component3", "component4", "component5", "newKey", "ksn", "crc32", "originalCheckValue", "checkValue", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getNewKey", "()Ljava/lang/String;", "b", "getKsn", "c", "getCrc32", "d", "getOriginalCheckValue", "e", "getCheckValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TerminalKeysResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String newKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ksn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String crc32;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String originalCheckValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String checkValue;

    public TerminalKeysResponse(@NotNull String newKey, @NotNull String ksn, @NotNull String crc32, @NotNull String originalCheckValue, @NotNull String checkValue) {
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        Intrinsics.checkNotNullParameter(ksn, "ksn");
        Intrinsics.checkNotNullParameter(crc32, "crc32");
        Intrinsics.checkNotNullParameter(originalCheckValue, "originalCheckValue");
        Intrinsics.checkNotNullParameter(checkValue, "checkValue");
        this.newKey = newKey;
        this.ksn = ksn;
        this.crc32 = crc32;
        this.originalCheckValue = originalCheckValue;
        this.checkValue = checkValue;
    }

    public static /* synthetic */ TerminalKeysResponse copy$default(TerminalKeysResponse terminalKeysResponse, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalKeysResponse.newKey;
        }
        if ((i10 & 2) != 0) {
            str2 = terminalKeysResponse.ksn;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = terminalKeysResponse.crc32;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = terminalKeysResponse.originalCheckValue;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = terminalKeysResponse.checkValue;
        }
        return terminalKeysResponse.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNewKey() {
        return this.newKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKsn() {
        return this.ksn;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCrc32() {
        return this.crc32;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalCheckValue() {
        return this.originalCheckValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCheckValue() {
        return this.checkValue;
    }

    @NotNull
    public final TerminalKeysResponse copy(@NotNull String newKey, @NotNull String ksn, @NotNull String crc32, @NotNull String originalCheckValue, @NotNull String checkValue) {
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        Intrinsics.checkNotNullParameter(ksn, "ksn");
        Intrinsics.checkNotNullParameter(crc32, "crc32");
        Intrinsics.checkNotNullParameter(originalCheckValue, "originalCheckValue");
        Intrinsics.checkNotNullParameter(checkValue, "checkValue");
        return new TerminalKeysResponse(newKey, ksn, crc32, originalCheckValue, checkValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminalKeysResponse)) {
            return false;
        }
        TerminalKeysResponse terminalKeysResponse = (TerminalKeysResponse) other;
        return Intrinsics.areEqual(this.newKey, terminalKeysResponse.newKey) && Intrinsics.areEqual(this.ksn, terminalKeysResponse.ksn) && Intrinsics.areEqual(this.crc32, terminalKeysResponse.crc32) && Intrinsics.areEqual(this.originalCheckValue, terminalKeysResponse.originalCheckValue) && Intrinsics.areEqual(this.checkValue, terminalKeysResponse.checkValue);
    }

    @NotNull
    public final String getCheckValue() {
        return this.checkValue;
    }

    @NotNull
    public final String getCrc32() {
        return this.crc32;
    }

    @NotNull
    public final String getKsn() {
        return this.ksn;
    }

    @NotNull
    public final String getNewKey() {
        return this.newKey;
    }

    @NotNull
    public final String getOriginalCheckValue() {
        return this.originalCheckValue;
    }

    public int hashCode() {
        return this.checkValue.hashCode() + n1.c(this.originalCheckValue, n1.c(this.crc32, n1.c(this.ksn, this.newKey.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TerminalKeysResponse(newKey=");
        sb2.append(this.newKey);
        sb2.append(", ksn=");
        sb2.append(this.ksn);
        sb2.append(", crc32=");
        sb2.append(this.crc32);
        sb2.append(", originalCheckValue=");
        sb2.append(this.originalCheckValue);
        sb2.append(", checkValue=");
        return d.f(sb2, this.checkValue, ")");
    }
}
