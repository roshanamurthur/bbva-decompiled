package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TerminalKeysResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/TerminalKeysResponseDto;", "", "newKey", "", "ksn", "crc32", "originalCheckValue", "checkValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckValue", "()Ljava/lang/String;", "getCrc32", "getKsn", "getNewKey", "getOriginalCheckValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TerminalKeysResponseDto {

    @SerializedName("check_value")
    @NotNull
    private final String checkValue;

    @SerializedName("crc32")
    @NotNull
    private final String crc32;

    @SerializedName("ksn")
    @NotNull
    private final String ksn;

    @SerializedName("new_key")
    @NotNull
    private final String newKey;

    @SerializedName("original_check_value")
    @NotNull
    private final String originalCheckValue;

    public TerminalKeysResponseDto(@NotNull String newKey, @NotNull String ksn, @NotNull String crc32, @NotNull String originalCheckValue, @NotNull String checkValue) {
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

    public static /* synthetic */ TerminalKeysResponseDto copy$default(TerminalKeysResponseDto terminalKeysResponseDto, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalKeysResponseDto.newKey;
        }
        if ((i10 & 2) != 0) {
            str2 = terminalKeysResponseDto.ksn;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = terminalKeysResponseDto.crc32;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = terminalKeysResponseDto.originalCheckValue;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = terminalKeysResponseDto.checkValue;
        }
        return terminalKeysResponseDto.copy(str, str6, str7, str8, str5);
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
    public final TerminalKeysResponseDto copy(@NotNull String newKey, @NotNull String ksn, @NotNull String crc32, @NotNull String originalCheckValue, @NotNull String checkValue) {
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        Intrinsics.checkNotNullParameter(ksn, "ksn");
        Intrinsics.checkNotNullParameter(crc32, "crc32");
        Intrinsics.checkNotNullParameter(originalCheckValue, "originalCheckValue");
        Intrinsics.checkNotNullParameter(checkValue, "checkValue");
        return new TerminalKeysResponseDto(newKey, ksn, crc32, originalCheckValue, checkValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminalKeysResponseDto)) {
            return false;
        }
        TerminalKeysResponseDto terminalKeysResponseDto = (TerminalKeysResponseDto) other;
        return Intrinsics.areEqual(this.newKey, terminalKeysResponseDto.newKey) && Intrinsics.areEqual(this.ksn, terminalKeysResponseDto.ksn) && Intrinsics.areEqual(this.crc32, terminalKeysResponseDto.crc32) && Intrinsics.areEqual(this.originalCheckValue, terminalKeysResponseDto.originalCheckValue) && Intrinsics.areEqual(this.checkValue, terminalKeysResponseDto.checkValue);
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
        String str = this.newKey;
        String str2 = this.ksn;
        String str3 = this.crc32;
        String str4 = this.originalCheckValue;
        String str5 = this.checkValue;
        StringBuilder sbC = a.c("TerminalKeysResponseDto(newKey=", str, ", ksn=", str2, ", crc32=");
        k.e(sbC, str3, ", originalCheckValue=", str4, ", checkValue=");
        return d.f(sbC, str5, ")");
    }
}
