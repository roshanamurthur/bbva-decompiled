package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "", GenerateActivationFormCommand.HASH_CODE, "", "component1", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component2", "Lokio/ByteString;", "component3", "version", "algorithmIdentifier", "privateKey", "copy", "", "toString", "other", "", "equals", "a", "J", "getVersion", "()J", "b", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getAlgorithmIdentifier", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "c", "Lokio/ByteString;", "getPrivateKey", "()Lokio/ByteString;", "<init>", "(JLokhttp3/tls/internal/der/AlgorithmIdentifier;Lokio/ByteString;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PrivateKeyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlgorithmIdentifier algorithmIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ByteString privateKey;

    public PrivateKeyInfo(long j10, @NotNull AlgorithmIdentifier algorithmIdentifier, @NotNull ByteString privateKey) {
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "algorithmIdentifier");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        this.version = j10;
        this.algorithmIdentifier = algorithmIdentifier;
        this.privateKey = privateKey;
    }

    public static /* synthetic */ PrivateKeyInfo copy$default(PrivateKeyInfo privateKeyInfo, long j10, AlgorithmIdentifier algorithmIdentifier, ByteString byteString, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = privateKeyInfo.version;
        }
        if ((i10 & 2) != 0) {
            algorithmIdentifier = privateKeyInfo.algorithmIdentifier;
        }
        if ((i10 & 4) != 0) {
            byteString = privateKeyInfo.privateKey;
        }
        return privateKeyInfo.copy(j10, algorithmIdentifier, byteString);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ByteString getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    public final PrivateKeyInfo copy(long version, @NotNull AlgorithmIdentifier algorithmIdentifier, @NotNull ByteString privateKey) {
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "algorithmIdentifier");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        return new PrivateKeyInfo(version, algorithmIdentifier, privateKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateKeyInfo)) {
            return false;
        }
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) other;
        return this.version == privateKeyInfo.version && Intrinsics.areEqual(this.algorithmIdentifier, privateKeyInfo.algorithmIdentifier) && Intrinsics.areEqual(this.privateKey, privateKeyInfo.privateKey);
    }

    @NotNull
    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @NotNull
    public final ByteString getPrivateKey() {
        return this.privateKey;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.privateKey.hashCode() + ((this.algorithmIdentifier.hashCode() + (((int) this.version) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PrivateKeyInfo(version=" + this.version + ", algorithmIdentifier=" + this.algorithmIdentifier + ", privateKey=" + this.privateKey + ")";
    }
}
