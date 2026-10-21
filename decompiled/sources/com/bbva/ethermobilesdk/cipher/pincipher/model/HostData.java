package com.bbva.ethermobilesdk.cipher.pincipher.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HostData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/model/HostData;", "", "", "component1", "component2", "component3", "component4", FirebaseAnalytics.Param.INDEX, "version", "firstSegment", "secondSegment", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getIndex", "()Ljava/lang/String;", "b", "getVersion", "c", "getFirstSegment", "d", "getSecondSegment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HostData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String firstSegment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String secondSegment;

    public HostData(@NotNull String index, @NotNull String version, @NotNull String firstSegment, @NotNull String secondSegment) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(firstSegment, "firstSegment");
        Intrinsics.checkNotNullParameter(secondSegment, "secondSegment");
        this.index = index;
        this.version = version;
        this.firstSegment = firstSegment;
        this.secondSegment = secondSegment;
    }

    public static /* synthetic */ HostData copy$default(HostData hostData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hostData.index;
        }
        if ((i10 & 2) != 0) {
            str2 = hostData.version;
        }
        if ((i10 & 4) != 0) {
            str3 = hostData.firstSegment;
        }
        if ((i10 & 8) != 0) {
            str4 = hostData.secondSegment;
        }
        return hostData.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstSegment() {
        return this.firstSegment;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondSegment() {
        return this.secondSegment;
    }

    @NotNull
    public final HostData copy(@NotNull String index, @NotNull String version, @NotNull String firstSegment, @NotNull String secondSegment) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(firstSegment, "firstSegment");
        Intrinsics.checkNotNullParameter(secondSegment, "secondSegment");
        return new HostData(index, version, firstSegment, secondSegment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostData)) {
            return false;
        }
        HostData hostData = (HostData) other;
        return Intrinsics.areEqual(this.index, hostData.index) && Intrinsics.areEqual(this.version, hostData.version) && Intrinsics.areEqual(this.firstSegment, hostData.firstSegment) && Intrinsics.areEqual(this.secondSegment, hostData.secondSegment);
    }

    @NotNull
    public final String getFirstSegment() {
        return this.firstSegment;
    }

    @NotNull
    public final String getIndex() {
        return this.index;
    }

    @NotNull
    public final String getSecondSegment() {
        return this.secondSegment;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.secondSegment.hashCode() + n1.c(this.firstSegment, n1.c(this.version, this.index.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HostData(index=");
        sb2.append(this.index);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", firstSegment=");
        sb2.append(this.firstSegment);
        sb2.append(", secondSegment=");
        return d.f(sb2, this.secondSegment, ")");
    }
}
