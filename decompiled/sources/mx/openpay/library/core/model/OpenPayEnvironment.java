package mx.openpay.library.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\""}, d2 = {"Lmx/openpay/library/core/model/OpenPayEnvironment;", "Landroid/os/Parcelable;", "name", "", "apiBaseUrl", "connectTimeoutSeconds", "", "logsEnabled", "", "(Ljava/lang/String;Ljava/lang/String;JZ)V", "getApiBaseUrl", "()Ljava/lang/String;", "getConnectTimeoutSeconds", "()J", "getLogsEnabled", "()Z", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayEnvironment implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayEnvironment> CREATOR = new Creator();

    @NotNull
    private final String apiBaseUrl;
    private final long connectTimeoutSeconds;
    private final boolean logsEnabled;

    @NotNull
    private final String name;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayEnvironment> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayEnvironment createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayEnvironment(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayEnvironment[] newArray(int i10) {
            return new OpenPayEnvironment[i10];
        }
    }

    public OpenPayEnvironment(@NotNull String name, @NotNull String apiBaseUrl, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        this.name = name;
        this.apiBaseUrl = apiBaseUrl;
        this.connectTimeoutSeconds = j10;
        this.logsEnabled = z10;
    }

    public static /* synthetic */ OpenPayEnvironment copy$default(OpenPayEnvironment openPayEnvironment, String str, String str2, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayEnvironment.name;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayEnvironment.apiBaseUrl;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = openPayEnvironment.connectTimeoutSeconds;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = openPayEnvironment.logsEnabled;
        }
        return openPayEnvironment.copy(str, str3, j11, z10);
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
    public final OpenPayEnvironment copy(@NotNull String name, @NotNull String apiBaseUrl, long connectTimeoutSeconds, boolean logsEnabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        return new OpenPayEnvironment(name, apiBaseUrl, connectTimeoutSeconds, logsEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayEnvironment)) {
            return false;
        }
        OpenPayEnvironment openPayEnvironment = (OpenPayEnvironment) other;
        return Intrinsics.areEqual(this.name, openPayEnvironment.name) && Intrinsics.areEqual(this.apiBaseUrl, openPayEnvironment.apiBaseUrl) && this.connectTimeoutSeconds == openPayEnvironment.connectTimeoutSeconds && this.logsEnabled == openPayEnvironment.logsEnabled;
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
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public int hashCode() {
        int iA = a.a(this.apiBaseUrl, this.name.hashCode() * 31, 31);
        long j10 = this.connectTimeoutSeconds;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + iA) * 31;
        boolean z10 = this.logsEnabled;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return i10 + r1;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.apiBaseUrl;
        long j10 = this.connectTimeoutSeconds;
        boolean z10 = this.logsEnabled;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OpenPayEnvironment(name=", str, ", apiBaseUrl=", str2, ", connectTimeoutSeconds=");
        sbC.append(j10);
        sbC.append(", logsEnabled=");
        sbC.append(z10);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.apiBaseUrl);
        parcel.writeLong(this.connectTimeoutSeconds);
        parcel.writeInt(this.logsEnabled ? 1 : 0);
    }

    public /* synthetic */ OpenPayEnvironment(String str, String str2, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? 35L : j10, (i10 & 8) != 0 ? false : z10);
    }
}
