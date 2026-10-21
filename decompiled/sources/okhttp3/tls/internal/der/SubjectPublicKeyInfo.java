package okhttp3.tls.internal.der;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component1", "Lokhttp3/tls/internal/der/BitString;", "component2", "algorithm", "subjectPublicKey", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getAlgorithm", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "b", "Lokhttp3/tls/internal/der/BitString;", "getSubjectPublicKey", "()Lokhttp3/tls/internal/der/BitString;", "<init>", "(Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SubjectPublicKeyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlgorithmIdentifier algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BitString subjectPublicKey;

    public SubjectPublicKeyInfo(@NotNull AlgorithmIdentifier algorithm, @NotNull BitString subjectPublicKey) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(subjectPublicKey, "subjectPublicKey");
        this.algorithm = algorithm;
        this.subjectPublicKey = subjectPublicKey;
    }

    public static /* synthetic */ SubjectPublicKeyInfo copy$default(SubjectPublicKeyInfo subjectPublicKeyInfo, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            algorithmIdentifier = subjectPublicKeyInfo.algorithm;
        }
        if ((i10 & 2) != 0) {
            bitString = subjectPublicKeyInfo.subjectPublicKey;
        }
        return subjectPublicKeyInfo.copy(algorithmIdentifier, bitString);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    @NotNull
    public final SubjectPublicKeyInfo copy(@NotNull AlgorithmIdentifier algorithm, @NotNull BitString subjectPublicKey) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(subjectPublicKey, "subjectPublicKey");
        return new SubjectPublicKeyInfo(algorithm, subjectPublicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubjectPublicKeyInfo)) {
            return false;
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) other;
        return Intrinsics.areEqual(this.algorithm, subjectPublicKeyInfo.algorithm) && Intrinsics.areEqual(this.subjectPublicKey, subjectPublicKeyInfo.subjectPublicKey);
    }

    @NotNull
    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public int hashCode() {
        AlgorithmIdentifier algorithmIdentifier = this.algorithm;
        int iHashCode = (algorithmIdentifier != null ? algorithmIdentifier.hashCode() : 0) * 31;
        BitString bitString = this.subjectPublicKey;
        return iHashCode + (bitString != null ? bitString.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.algorithm + ", subjectPublicKey=" + this.subjectPublicKey + ")";
    }
}
