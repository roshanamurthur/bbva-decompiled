package okhttp3.tls.internal.der;

import androidx.collection.h;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/tls/internal/der/Validity;", "", "", GenerateActivationFormCommand.HASH_CODE, "", "component1", "component2", "notBefore", "notAfter", "copy", "", "toString", "other", "", "equals", "a", "J", "getNotBefore", "()J", "b", "getNotAfter", "<init>", "(JJ)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Validity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long notBefore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long notAfter;

    public Validity(long j10, long j11) {
        this.notBefore = j10;
        this.notAfter = j11;
    }

    public static /* synthetic */ Validity copy$default(Validity validity, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = validity.notBefore;
        }
        if ((i10 & 2) != 0) {
            j11 = validity.notAfter;
        }
        return validity.copy(j10, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getNotBefore() {
        return this.notBefore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getNotAfter() {
        return this.notAfter;
    }

    @NotNull
    public final Validity copy(long notBefore, long notAfter) {
        return new Validity(notBefore, notAfter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validity)) {
            return false;
        }
        Validity validity = (Validity) other;
        return this.notBefore == validity.notBefore && this.notAfter == validity.notAfter;
    }

    public final long getNotAfter() {
        return this.notAfter;
    }

    public final long getNotBefore() {
        return this.notBefore;
    }

    public int hashCode() {
        return (((int) this.notBefore) * 31) + ((int) this.notAfter);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Validity(notBefore=");
        sb2.append(this.notBefore);
        sb2.append(", notAfter=");
        return h.d(sb2, this.notAfter, ")");
    }
}
