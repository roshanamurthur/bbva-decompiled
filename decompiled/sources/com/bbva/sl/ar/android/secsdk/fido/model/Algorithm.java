package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Algorithm.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/model/Algorithm;", "", "minIterations", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getMinIterations", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Algorithm {
    private final int minIterations;

    @NotNull
    private final String name;

    public Algorithm(int i10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.minIterations = i10;
        this.name = name;
    }

    public static /* synthetic */ Algorithm copy$default(Algorithm algorithm, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = algorithm.minIterations;
        }
        if ((i11 & 2) != 0) {
            str = algorithm.name;
        }
        return algorithm.copy(i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinIterations() {
        return this.minIterations;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Algorithm copy(int minIterations, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Algorithm(minIterations, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Algorithm)) {
            return false;
        }
        Algorithm algorithm = (Algorithm) other;
        return this.minIterations == algorithm.minIterations && Intrinsics.areEqual(this.name, algorithm.name);
    }

    public final int getMinIterations() {
        return this.minIterations;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.minIterations * 31);
    }

    @NotNull
    public String toString() {
        return z1.c("Algorithm(minIterations=", this.minIterations, ", name=", this.name, ")");
    }
}
