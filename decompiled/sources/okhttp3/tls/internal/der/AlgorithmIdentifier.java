package okhttp3.tls.internal.der;

import androidx.camera.core.impl.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "", "", "component1", "component2", "algorithm", "parameters", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getParameters", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AlgorithmIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object parameters;

    public AlgorithmIdentifier(@NotNull String algorithm, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.algorithm = algorithm;
        this.parameters = obj;
    }

    public static /* synthetic */ AlgorithmIdentifier copy$default(AlgorithmIdentifier algorithmIdentifier, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = algorithmIdentifier.algorithm;
        }
        if ((i10 & 2) != 0) {
            obj = algorithmIdentifier.parameters;
        }
        return algorithmIdentifier.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getParameters() {
        return this.parameters;
    }

    @NotNull
    public final AlgorithmIdentifier copy(@NotNull String algorithm, @Nullable Object parameters) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        return new AlgorithmIdentifier(algorithm, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlgorithmIdentifier)) {
            return false;
        }
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) other;
        return Intrinsics.areEqual(this.algorithm, algorithmIdentifier.algorithm) && Intrinsics.areEqual(this.parameters, algorithmIdentifier.parameters);
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Nullable
    public final Object getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        String str = this.algorithm;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.parameters;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlgorithmIdentifier(algorithm=");
        sb2.append(this.algorithm);
        sb2.append(", parameters=");
        return a.e(sb2, this.parameters, ")");
    }
}
