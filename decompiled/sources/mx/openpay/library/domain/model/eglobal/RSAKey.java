package mx.openpay.library.domain.model.eglobal;

import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RSAKey.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/RSAKey;", "", "", "component1", "component2", "", "component3", "keyName", JweRSAKeyPairCommand.RSA, "slotKey", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getKeyName", "()Ljava/lang/String;", "b", "getRsa", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSlotKey", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RSAKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String keyName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rsa;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int slotKey;

    public RSAKey(@NotNull String keyName, @NotNull String rsa, int i10) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        this.keyName = keyName;
        this.rsa = rsa;
        this.slotKey = i10;
    }

    public static /* synthetic */ RSAKey copy$default(RSAKey rSAKey, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rSAKey.keyName;
        }
        if ((i11 & 2) != 0) {
            str2 = rSAKey.rsa;
        }
        if ((i11 & 4) != 0) {
            i10 = rSAKey.slotKey;
        }
        return rSAKey.copy(str, str2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRsa() {
        return this.rsa;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final RSAKey copy(@NotNull String keyName, @NotNull String rsa, int slotKey) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        return new RSAKey(keyName, rsa, slotKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RSAKey)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) other;
        return Intrinsics.areEqual(this.keyName, rSAKey.keyName) && Intrinsics.areEqual(this.rsa, rSAKey.rsa) && this.slotKey == rSAKey.slotKey;
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    public final String getRsa() {
        return this.rsa;
    }

    public final int getSlotKey() {
        return this.slotKey;
    }

    public int hashCode() {
        return n1.c(this.rsa, this.keyName.hashCode() * 31, 31) + this.slotKey;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RSAKey(keyName=");
        sb2.append(this.keyName);
        sb2.append(", rsa=");
        sb2.append(this.rsa);
        sb2.append(", slotKey=");
        return a.c(sb2, this.slotKey, ")");
    }
}
