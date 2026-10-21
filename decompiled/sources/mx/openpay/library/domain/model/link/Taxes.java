package mx.openpay.library.domain.model.link;

import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Taxes.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lmx/openpay/library/domain/model/link/Taxes;", "", "", "a", "D", "getAmount", "()D", PushConstants.AMOUNT, "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "<init>", "(DLjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class Taxes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    public Taxes(double d2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = d2;
        this.description = description;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}
