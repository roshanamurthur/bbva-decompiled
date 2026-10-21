package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardPointsResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "", PushConstants.AMOUNT, "", "remaining", "", "used", "(Ljava/lang/Double;II)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRemaining", "()I", "getUsed", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;II)Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardPointsResponseDto;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardPointsResponseDto {

    @SerializedName(PushConstants.AMOUNT)
    @Nullable
    private final Double amount;

    @SerializedName("remaining")
    private final int remaining;

    @SerializedName("used")
    private final int used;

    public CardPointsResponseDto(@Nullable Double d2, int i10, int i11) {
        this.amount = d2;
        this.remaining = i10;
        this.used = i11;
    }

    public static /* synthetic */ CardPointsResponseDto copy$default(CardPointsResponseDto cardPointsResponseDto, Double d2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d2 = cardPointsResponseDto.amount;
        }
        if ((i12 & 2) != 0) {
            i10 = cardPointsResponseDto.remaining;
        }
        if ((i12 & 4) != 0) {
            i11 = cardPointsResponseDto.used;
        }
        return cardPointsResponseDto.copy(d2, i10, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUsed() {
        return this.used;
    }

    @NotNull
    public final CardPointsResponseDto copy(@Nullable Double amount, int remaining, int used) {
        return new CardPointsResponseDto(amount, remaining, used);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPointsResponseDto)) {
            return false;
        }
        CardPointsResponseDto cardPointsResponseDto = (CardPointsResponseDto) other;
        return Intrinsics.areEqual((Object) this.amount, (Object) cardPointsResponseDto.amount) && this.remaining == cardPointsResponseDto.remaining && this.used == cardPointsResponseDto.used;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final int getUsed() {
        return this.used;
    }

    public int hashCode() {
        Double d2 = this.amount;
        return ((((d2 == null ? 0 : d2.hashCode()) * 31) + this.remaining) * 31) + this.used;
    }

    @NotNull
    public String toString() {
        Double d2 = this.amount;
        int i10 = this.remaining;
        int i11 = this.used;
        StringBuilder sb2 = new StringBuilder("CardPointsResponseDto(amount=");
        sb2.append(d2);
        sb2.append(", remaining=");
        sb2.append(i10);
        sb2.append(", used=");
        return a.c(sb2, i11, ")");
    }
}
