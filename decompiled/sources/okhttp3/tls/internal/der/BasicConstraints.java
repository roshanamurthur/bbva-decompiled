package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001a"}, d2 = {"Lokhttp3/tls/internal/der/BasicConstraints;", "", "", "component1", "", "component2", "()Ljava/lang/Long;", "ca", "maxIntermediateCas", "copy", "(ZLjava/lang/Long;)Lokhttp3/tls/internal/der/BasicConstraints;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getCa", "()Z", "b", "Ljava/lang/Long;", "getMaxIntermediateCas", "<init>", "(ZLjava/lang/Long;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BasicConstraints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean ca;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long maxIntermediateCas;

    public BasicConstraints(boolean z10, @Nullable Long l6) {
        this.ca = z10;
        this.maxIntermediateCas = l6;
    }

    public static /* synthetic */ BasicConstraints copy$default(BasicConstraints basicConstraints, boolean z10, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = basicConstraints.ca;
        }
        if ((i10 & 2) != 0) {
            l6 = basicConstraints.maxIntermediateCas;
        }
        return basicConstraints.copy(z10, l6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCa() {
        return this.ca;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    @NotNull
    public final BasicConstraints copy(boolean ca2, @Nullable Long maxIntermediateCas) {
        return new BasicConstraints(ca2, maxIntermediateCas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicConstraints)) {
            return false;
        }
        BasicConstraints basicConstraints = (BasicConstraints) other;
        return this.ca == basicConstraints.ca && Intrinsics.areEqual(this.maxIntermediateCas, basicConstraints.maxIntermediateCas);
    }

    public final boolean getCa() {
        return this.ca;
    }

    @Nullable
    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.ca;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        Long l6 = this.maxIntermediateCas;
        return i10 + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasicConstraints(ca=" + this.ca + ", maxIntermediateCas=" + this.maxIntermediateCas + ")";
    }
}
