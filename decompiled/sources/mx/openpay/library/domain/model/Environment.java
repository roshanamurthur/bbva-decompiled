package mx.openpay.library.domain.model;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Environment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lmx/openpay/library/domain/model/Environment;", "", "", "component1", "component2", "", "component3", "", "component4", "name", "apiBaseUrl", "connectTimeoutSeconds", "logsEnabled", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getApiBaseUrl", "c", "J", "getConnectTimeoutSeconds", "()J", "d", "Z", "getLogsEnabled", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZ)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Environment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String apiBaseUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long connectTimeoutSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean logsEnabled;

    public Environment(@NotNull String name, @NotNull String apiBaseUrl, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        this.name = name;
        this.apiBaseUrl = apiBaseUrl;
        this.connectTimeoutSeconds = j10;
        this.logsEnabled = z10;
    }

    public static /* synthetic */ Environment copy$default(Environment environment, String str, String str2, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = environment.name;
        }
        if ((i10 & 2) != 0) {
            str2 = environment.apiBaseUrl;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = environment.connectTimeoutSeconds;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = environment.logsEnabled;
        }
        return environment.copy(str, str3, j11, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getConnectTimeoutSeconds() {
        return this.connectTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getLogsEnabled() {
        return this.logsEnabled;
    }

    @NotNull
    public final Environment copy(@NotNull String name, @NotNull String apiBaseUrl, long connectTimeoutSeconds, boolean logsEnabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        return new Environment(name, apiBaseUrl, connectTimeoutSeconds, logsEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return Intrinsics.areEqual(this.name, environment.name) && Intrinsics.areEqual(this.apiBaseUrl, environment.apiBaseUrl) && this.connectTimeoutSeconds == environment.connectTimeoutSeconds && this.logsEnabled == environment.logsEnabled;
    }

    @NotNull
    public final String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    public final long getConnectTimeoutSeconds() {
        return this.connectTimeoutSeconds;
    }

    public final boolean getLogsEnabled() {
        return this.logsEnabled;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.apiBaseUrl, this.name.hashCode() * 31, 31);
        long j10 = this.connectTimeoutSeconds;
        int i10 = (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z10 = this.logsEnabled;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return i10 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Environment(name=");
        sb2.append(this.name);
        sb2.append(", apiBaseUrl=");
        sb2.append(this.apiBaseUrl);
        sb2.append(", connectTimeoutSeconds=");
        sb2.append(this.connectTimeoutSeconds);
        sb2.append(", logsEnabled=");
        return i.c(sb2, this.logsEnabled, ")");
    }

    public /* synthetic */ Environment(String str, String str2, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? 35L : j10, (i10 & 8) != 0 ? false : z10);
    }
}
