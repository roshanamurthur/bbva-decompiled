package mx.openpay.library.domain.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardPoints.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J0\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/domain/model/CardPoints;", "", "", "component1", "()Ljava/lang/Double;", "", "component2", "component3", PushConstants.AMOUNT, "remaining", "used", "copy", "(Ljava/lang/Double;II)Lmx/openpay/library/domain/model/CardPoints;", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Double;", "getAmount", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRemaining", "()I", "c", "getUsed", "<init>", "(Ljava/lang/Double;II)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardPoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int remaining;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int used;

    public CardPoints(@Nullable Double d2, int i10, int i11) {
        this.amount = d2;
        this.remaining = i10;
        this.used = i11;
    }

    public static /* synthetic */ CardPoints copy$default(CardPoints cardPoints, Double d2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d2 = cardPoints.amount;
        }
        if ((i12 & 2) != 0) {
            i10 = cardPoints.remaining;
        }
        if ((i12 & 4) != 0) {
            i11 = cardPoints.used;
        }
        return cardPoints.copy(d2, i10, i11);
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
    public final CardPoints copy(@Nullable Double amount, int remaining, int used) {
        return new CardPoints(amount, remaining, used);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPoints)) {
            return false;
        }
        CardPoints cardPoints = (CardPoints) other;
        return Intrinsics.areEqual((Object) this.amount, (Object) cardPoints.amount) && this.remaining == cardPoints.remaining && this.used == cardPoints.used;
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
        StringBuilder sb2 = new StringBuilder("CardPoints(amount=");
        sb2.append(this.amount);
        sb2.append(", remaining=");
        sb2.append(this.remaining);
        sb2.append(", used=");
        return a.c(sb2, this.used, ")");
    }
}
