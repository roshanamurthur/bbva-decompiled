package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnyValue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lokhttp3/tls/internal/der/AnyValue;", "", "", GenerateActivationFormCommand.HASH_CODE, "component1", "", "component2", "", "component3", "component4", "Lokio/ByteString;", "component5", "tagClass", LogKeysKt.TAG, "constructed", "length", "bytes", "copy", "", "toString", "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTagClass", "()I", "setTagClass", "(I)V", "b", "J", "getTag", "()J", "setTag", "(J)V", "c", "Z", "getConstructed", "()Z", "setConstructed", "(Z)V", "d", "getLength", "setLength", "e", "Lokio/ByteString;", "getBytes", "()Lokio/ByteString;", "<init>", "(IJZJLokio/ByteString;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AnyValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int tagClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean constructed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long length;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ByteString bytes;

    public AnyValue(int i10, long j10, boolean z10, long j11, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.tagClass = i10;
        this.tag = j10;
        this.constructed = z10;
        this.length = j11;
        this.bytes = bytes;
    }

    public static /* synthetic */ AnyValue copy$default(AnyValue anyValue, int i10, long j10, boolean z10, long j11, ByteString byteString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = anyValue.tagClass;
        }
        if ((i11 & 2) != 0) {
            j10 = anyValue.tag;
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            z10 = anyValue.constructed;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            j11 = anyValue.length;
        }
        long j13 = j11;
        if ((i11 & 16) != 0) {
            byteString = anyValue.bytes;
        }
        return anyValue.copy(i10, j12, z11, j13, byteString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getConstructed() {
        return this.constructed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    @NotNull
    public final AnyValue copy(int tagClass, long tag, boolean constructed, long length, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new AnyValue(tagClass, tag, constructed, length, bytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnyValue)) {
            return false;
        }
        AnyValue anyValue = (AnyValue) other;
        return this.tagClass == anyValue.tagClass && this.tag == anyValue.tag && this.constructed == anyValue.constructed && this.length == anyValue.length && Intrinsics.areEqual(this.bytes, anyValue.bytes);
    }

    @NotNull
    public final ByteString getBytes() {
        return this.bytes;
    }

    public final boolean getConstructed() {
        return this.constructed;
    }

    public final long getLength() {
        return this.length;
    }

    public final long getTag() {
        return this.tag;
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public int hashCode() {
        return this.bytes.hashCode() + (((((((this.tagClass * 31) + ((int) this.tag)) * 31) + (!this.constructed ? 1 : 0)) * 31) + ((int) this.length)) * 31);
    }

    public final void setConstructed(boolean z10) {
        this.constructed = z10;
    }

    public final void setLength(long j10) {
        this.length = j10;
    }

    public final void setTag(long j10) {
        this.tag = j10;
    }

    public final void setTagClass(int i10) {
        this.tagClass = i10;
    }

    @NotNull
    public String toString() {
        return "AnyValue(tagClass=" + this.tagClass + ", tag=" + this.tag + ", constructed=" + this.constructed + ", length=" + this.length + ", bytes=" + this.bytes + ")";
    }

    public /* synthetic */ AnyValue(int i10, long j10, boolean z10, long j11, ByteString byteString, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, j10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? -1L : j11, byteString);
    }
}
