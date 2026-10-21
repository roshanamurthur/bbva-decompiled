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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "", "", "component1", "component2", "component3", "tokenEs", "tokenEw", "slotKey", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTokenEs", "()Ljava/lang/String;", "b", "getTokenEw", "c", "getSlotKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TerminalKeysRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenEs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenEw;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String slotKey;

    public TerminalKeysRequest(@NotNull String tokenEs, @NotNull String tokenEw, @NotNull String slotKey) {
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(tokenEw, "tokenEw");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        this.tokenEs = tokenEs;
        this.tokenEw = tokenEw;
        this.slotKey = slotKey;
    }

    public static /* synthetic */ TerminalKeysRequest copy$default(TerminalKeysRequest terminalKeysRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = terminalKeysRequest.tokenEs;
        }
        if ((i10 & 2) != 0) {
            str2 = terminalKeysRequest.tokenEw;
        }
        if ((i10 & 4) != 0) {
            str3 = terminalKeysRequest.slotKey;
        }
        return terminalKeysRequest.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenEw() {
        return this.tokenEw;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final TerminalKeysRequest copy(@NotNull String tokenEs, @NotNull String tokenEw, @NotNull String slotKey) {
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(tokenEw, "tokenEw");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        return new TerminalKeysRequest(tokenEs, tokenEw, slotKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminalKeysRequest)) {
            return false;
        }
        TerminalKeysRequest terminalKeysRequest = (TerminalKeysRequest) other;
        return Intrinsics.areEqual(this.tokenEs, terminalKeysRequest.tokenEs) && Intrinsics.areEqual(this.tokenEw, terminalKeysRequest.tokenEw) && Intrinsics.areEqual(this.slotKey, terminalKeysRequest.slotKey);
    }

    @NotNull
    public final String getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    public final String getTokenEw() {
        return this.tokenEw;
    }

    public int hashCode() {
        return this.slotKey.hashCode() + n1.c(this.tokenEw, this.tokenEs.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TerminalKeysRequest(tokenEs=");
        sb2.append(this.tokenEs);
        sb2.append(", tokenEw=");
        sb2.append(this.tokenEw);
        sb2.append(", slotKey=");
        return d.f(sb2, this.slotKey, ")");
    }
}
