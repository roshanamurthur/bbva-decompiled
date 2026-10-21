package okhttp3.tls.internal.der;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BitString.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/tls/internal/der/BitString;", "", "", GenerateActivationFormCommand.HASH_CODE, "Lokio/ByteString;", "component1", "component2", "byteString", "unusedBitsCount", "copy", "", "toString", "other", "", "equals", "a", "Lokio/ByteString;", "getByteString", "()Lokio/ByteString;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnusedBitsCount", "()I", "<init>", "(Lokio/ByteString;I)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BitString {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ByteString byteString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int unusedBitsCount;

    public BitString(@NotNull ByteString byteString, int i10) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        this.byteString = byteString;
        this.unusedBitsCount = i10;
    }

    public static /* synthetic */ BitString copy$default(BitString bitString, ByteString byteString, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteString = bitString.byteString;
        }
        if ((i11 & 2) != 0) {
            i10 = bitString.unusedBitsCount;
        }
        return bitString.copy(byteString, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteString getByteString() {
        return this.byteString;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    @NotNull
    public final BitString copy(@NotNull ByteString byteString, int unusedBitsCount) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        return new BitString(byteString, unusedBitsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitString)) {
            return false;
        }
        BitString bitString = (BitString) other;
        return Intrinsics.areEqual(this.byteString, bitString.byteString) && this.unusedBitsCount == bitString.unusedBitsCount;
    }

    @NotNull
    public final ByteString getByteString() {
        return this.byteString;
    }

    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    public int hashCode() {
        return (this.byteString.hashCode() * 31) + this.unusedBitsCount;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitString(byteString=");
        sb2.append(this.byteString);
        sb2.append(", unusedBitsCount=");
        return a.c(sb2, this.unusedBitsCount, ")");
    }
}
