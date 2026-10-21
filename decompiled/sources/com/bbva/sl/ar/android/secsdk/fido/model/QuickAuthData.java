package com.bbva.sl.ar.android.secsdk.fido.model;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QuickAuthData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/model/QuickAuthData;", "", "algorithm", "Lcom/bbva/sl/ar/android/secsdk/fido/model/Algorithm;", "keyLength", "", "saltSuffix", "", "<init>", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/Algorithm;ILjava/lang/String;)V", "getAlgorithm", "()Lcom/bbva/sl/ar/android/secsdk/fido/model/Algorithm;", "getKeyLength", "()I", "getSaltSuffix", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickAuthData {

    @NotNull
    private final Algorithm algorithm;
    private final int keyLength;

    @NotNull
    private final String saltSuffix;

    public QuickAuthData(@NotNull Algorithm algorithm, int i10, @NotNull String saltSuffix) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(saltSuffix, "saltSuffix");
        this.algorithm = algorithm;
        this.keyLength = i10;
        this.saltSuffix = saltSuffix;
    }

    public static /* synthetic */ QuickAuthData copy$default(QuickAuthData quickAuthData, Algorithm algorithm, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            algorithm = quickAuthData.algorithm;
        }
        if ((i11 & 2) != 0) {
            i10 = quickAuthData.keyLength;
        }
        if ((i11 & 4) != 0) {
            str = quickAuthData.saltSuffix;
        }
        return quickAuthData.copy(algorithm, i10, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getKeyLength() {
        return this.keyLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSaltSuffix() {
        return this.saltSuffix;
    }

    @NotNull
    public final QuickAuthData copy(@NotNull Algorithm algorithm, int keyLength, @NotNull String saltSuffix) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(saltSuffix, "saltSuffix");
        return new QuickAuthData(algorithm, keyLength, saltSuffix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAuthData)) {
            return false;
        }
        QuickAuthData quickAuthData = (QuickAuthData) other;
        return Intrinsics.areEqual(this.algorithm, quickAuthData.algorithm) && this.keyLength == quickAuthData.keyLength && Intrinsics.areEqual(this.saltSuffix, quickAuthData.saltSuffix);
    }

    @NotNull
    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final int getKeyLength() {
        return this.keyLength;
    }

    @NotNull
    public final String getSaltSuffix() {
        return this.saltSuffix;
    }

    public int hashCode() {
        return this.saltSuffix.hashCode() + (((this.algorithm.hashCode() * 31) + this.keyLength) * 31);
    }

    @NotNull
    public String toString() {
        Algorithm algorithm = this.algorithm;
        int i10 = this.keyLength;
        String str = this.saltSuffix;
        StringBuilder sb2 = new StringBuilder("QuickAuthData(algorithm=");
        sb2.append(algorithm);
        sb2.append(", keyLength=");
        sb2.append(i10);
        sb2.append(", saltSuffix=");
        return d.f(sb2, str, ")");
    }
}
