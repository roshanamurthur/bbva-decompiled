package mx.openpay.library.domain.model.eglobal;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TerminalCapacity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "", "", "component1", "component2", "transactionId", "tc", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTransactionId", "()Ljava/lang/String;", "b", "getTc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TerminalCapacity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tc;

    public TerminalCapacity(@NotNull String transactionId, @NotNull String tc2) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(tc2, "tc");
        this.transactionId = transactionId;
        this.tc = tc2;
    }

    public static /* synthetic */ TerminalCapacity copy$default(TerminalCapacity terminalCapacity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalCapacity.transactionId;
        }
        if ((i10 & 2) != 0) {
            str2 = terminalCapacity.tc;
        }
        return terminalCapacity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTc() {
        return this.tc;
    }

    @NotNull
    public final TerminalCapacity copy(@NotNull String transactionId, @NotNull String tc2) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(tc2, "tc");
        return new TerminalCapacity(transactionId, tc2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminalCapacity)) {
            return false;
        }
        TerminalCapacity terminalCapacity = (TerminalCapacity) other;
        return Intrinsics.areEqual(this.transactionId, terminalCapacity.transactionId) && Intrinsics.areEqual(this.tc, terminalCapacity.tc);
    }

    @NotNull
    public final String getTc() {
        return this.tc;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return this.tc.hashCode() + (this.transactionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TerminalCapacity(transactionId=");
        sb2.append(this.transactionId);
        sb2.append(", tc=");
        return d.f(sb2, this.tc, ")");
    }
}
