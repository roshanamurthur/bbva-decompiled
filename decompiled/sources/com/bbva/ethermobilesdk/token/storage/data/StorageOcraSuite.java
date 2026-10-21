package com.bbva.ethermobilesdk.token.storage.data;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.ocra.OtpChallengeType;
import com.bbva.ethermobilesdk.token.ocra.OtpFunction;
import com.bbva.ethermobilesdk.token.ocra.OtpLength;
import com.bbva.ethermobilesdk.token.ocra.OtpTimeStep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "", "version", "", "function", "Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;", "otpLength", "Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;", "timeStep", "Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;", "challengeType", "Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;", "challengeLength", "", "hasCounter", "", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;IZ)V", "getChallengeLength", "()I", "getChallengeType", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;", "getFunction", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;", "getHasCounter", "()Z", "getOtpLength", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;", "getTimeStep", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StorageOcraSuite {

    @SerializedName("challengeLength")
    private final int challengeLength;

    @SerializedName("challengeType")
    @NotNull
    private final OtpChallengeType challengeType;

    @SerializedName("function")
    @NotNull
    private final OtpFunction function;

    @SerializedName("hasCounter")
    private final boolean hasCounter;

    @SerializedName("otpLength")
    @NotNull
    private final OtpLength otpLength;

    @SerializedName("timeStep")
    @NotNull
    private final OtpTimeStep timeStep;

    @SerializedName("version")
    @NotNull
    private final String version;

    public StorageOcraSuite(@NotNull String version, @NotNull OtpFunction function, @NotNull OtpLength otpLength, @NotNull OtpTimeStep timeStep, @NotNull OtpChallengeType challengeType, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(otpLength, "otpLength");
        Intrinsics.checkNotNullParameter(timeStep, "timeStep");
        Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        this.version = version;
        this.function = function;
        this.otpLength = otpLength;
        this.timeStep = timeStep;
        this.challengeType = challengeType;
        this.challengeLength = i10;
        this.hasCounter = z10;
    }

    public static /* synthetic */ StorageOcraSuite copy$default(StorageOcraSuite storageOcraSuite, String str, OtpFunction otpFunction, OtpLength otpLength, OtpTimeStep otpTimeStep, OtpChallengeType otpChallengeType, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storageOcraSuite.version;
        }
        if ((i11 & 2) != 0) {
            otpFunction = storageOcraSuite.function;
        }
        OtpFunction otpFunction2 = otpFunction;
        if ((i11 & 4) != 0) {
            otpLength = storageOcraSuite.otpLength;
        }
        OtpLength otpLength2 = otpLength;
        if ((i11 & 8) != 0) {
            otpTimeStep = storageOcraSuite.timeStep;
        }
        OtpTimeStep otpTimeStep2 = otpTimeStep;
        if ((i11 & 16) != 0) {
            otpChallengeType = storageOcraSuite.challengeType;
        }
        OtpChallengeType otpChallengeType2 = otpChallengeType;
        if ((i11 & 32) != 0) {
            i10 = storageOcraSuite.challengeLength;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            z10 = storageOcraSuite.hasCounter;
        }
        return storageOcraSuite.copy(str, otpFunction2, otpLength2, otpTimeStep2, otpChallengeType2, i12, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OtpFunction getFunction() {
        return this.function;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OtpLength getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OtpTimeStep getTimeStep() {
        return this.timeStep;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OtpChallengeType getChallengeType() {
        return this.challengeType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getChallengeLength() {
        return this.challengeLength;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasCounter() {
        return this.hasCounter;
    }

    @NotNull
    public final StorageOcraSuite copy(@NotNull String version, @NotNull OtpFunction function, @NotNull OtpLength otpLength, @NotNull OtpTimeStep timeStep, @NotNull OtpChallengeType challengeType, int challengeLength, boolean hasCounter) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(otpLength, "otpLength");
        Intrinsics.checkNotNullParameter(timeStep, "timeStep");
        Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        return new StorageOcraSuite(version, function, otpLength, timeStep, challengeType, challengeLength, hasCounter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageOcraSuite)) {
            return false;
        }
        StorageOcraSuite storageOcraSuite = (StorageOcraSuite) other;
        return Intrinsics.areEqual(this.version, storageOcraSuite.version) && this.function == storageOcraSuite.function && Intrinsics.areEqual(this.otpLength, storageOcraSuite.otpLength) && Intrinsics.areEqual(this.timeStep, storageOcraSuite.timeStep) && this.challengeType == storageOcraSuite.challengeType && this.challengeLength == storageOcraSuite.challengeLength && this.hasCounter == storageOcraSuite.hasCounter;
    }

    public final int getChallengeLength() {
        return this.challengeLength;
    }

    @NotNull
    public final OtpChallengeType getChallengeType() {
        return this.challengeType;
    }

    @NotNull
    public final OtpFunction getFunction() {
        return this.function;
    }

    public final boolean getHasCounter() {
        return this.hasCounter;
    }

    @NotNull
    public final OtpLength getOtpLength() {
        return this.otpLength;
    }

    @NotNull
    public final OtpTimeStep getTimeStep() {
        return this.timeStep;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    public int hashCode() {
        int iHashCode = (((this.challengeType.hashCode() + ((this.timeStep.hashCode() + ((this.otpLength.hashCode() + ((this.function.hashCode() + (this.version.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.challengeLength) * 31;
        boolean z10 = this.hasCounter;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        String str = this.version;
        OtpFunction otpFunction = this.function;
        OtpLength otpLength = this.otpLength;
        OtpTimeStep otpTimeStep = this.timeStep;
        OtpChallengeType otpChallengeType = this.challengeType;
        int i10 = this.challengeLength;
        boolean z10 = this.hasCounter;
        StringBuilder sb2 = new StringBuilder("StorageOcraSuite(version=");
        sb2.append(str);
        sb2.append(", function=");
        sb2.append(otpFunction);
        sb2.append(", otpLength=");
        sb2.append(otpLength);
        sb2.append(", timeStep=");
        sb2.append(otpTimeStep);
        sb2.append(", challengeType=");
        sb2.append(otpChallengeType);
        sb2.append(", challengeLength=");
        sb2.append(i10);
        sb2.append(", hasCounter=");
        return i.c(sb2, z10, ")");
    }
}
