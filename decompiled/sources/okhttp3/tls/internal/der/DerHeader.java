package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DerHeader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+B'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006,"}, d2 = {"Lokhttp3/tls/internal/der/DerHeader;", "", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component1", "", "component2", "", "component3", "component4", "tagClass", LogKeysKt.TAG, "constructed", "length", "copy", "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTagClass", "()I", "setTagClass", "(I)V", "b", "J", "getTag", "()J", "setTag", "(J)V", "c", "Z", "getConstructed", "()Z", "setConstructed", "(Z)V", "d", "getLength", "setLength", "isEndOfData", "<init>", "(IJZJ)V", "Companion", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DerHeader {
    public static final int TAG_CLASS_APPLICATION = 64;
    public static final int TAG_CLASS_CONTEXT_SPECIFIC = 128;
    public static final int TAG_CLASS_PRIVATE = 192;
    public static final int TAG_CLASS_UNIVERSAL = 0;
    public static final long TAG_END_OF_CONTENTS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int tagClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean constructed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long length;

    public DerHeader(int i10, long j10, boolean z10, long j11) {
        this.tagClass = i10;
        this.tag = j10;
        this.constructed = z10;
        this.length = j11;
    }

    public static /* synthetic */ DerHeader copy$default(DerHeader derHeader, int i10, long j10, boolean z10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = derHeader.tagClass;
        }
        if ((i11 & 2) != 0) {
            j10 = derHeader.tag;
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            z10 = derHeader.constructed;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            j11 = derHeader.length;
        }
        return derHeader.copy(i10, j12, z11, j11);
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
    public final DerHeader copy(int tagClass, long tag, boolean constructed, long length) {
        return new DerHeader(tagClass, tag, constructed, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DerHeader)) {
            return false;
        }
        DerHeader derHeader = (DerHeader) other;
        return this.tagClass == derHeader.tagClass && this.tag == derHeader.tag && this.constructed == derHeader.constructed && this.length == derHeader.length;
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
        return (((((this.tagClass * 31) + ((int) this.tag)) * 31) + (!this.constructed ? 1 : 0)) * 31) + ((int) this.length);
    }

    public final boolean isEndOfData() {
        return this.tagClass == 0 && this.tag == 0;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tagClass);
        sb2.append(JsonPointer.SEPARATOR);
        sb2.append(this.tag);
        return sb2.toString();
    }
}
