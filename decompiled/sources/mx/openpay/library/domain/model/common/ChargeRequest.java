package mx.openpay.library.domain.model.common;

import com.bbva.notifications.constants.PushConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ChargeRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lmx/openpay/library/domain/model/common/ChargeRequest;", "", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", PushConstants.AMOUNT, "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public class ChargeRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    public ChargeRequest(@NotNull BigDecimal amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = amount;
        this.description = description;
    }

    @NotNull
    public BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public String getDescription() {
        return this.description;
    }
}
