package com.bbva.ethermobilesdk.token.model;

import ai.a;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.ocra.OtpChallengeType;
import com.bbva.ethermobilesdk.token.ocra.OtpFunction;
import com.bbva.ethermobilesdk.token.ocra.OtpLength;
import com.bbva.ethermobilesdk.token.ocra.OtpTimeStep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\rH\u0002J\t\u0010+\u001a\u00020\rHÖ\u0001J\b\u0010,\u001a\u00020\u0003H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "", "version", "", "function", "Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;", "otpLength", "Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;", "timeStep", "Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;", "challengeType", "Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;", "challengeLength", "", "hasCounter", "", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;IZ)V", "getChallengeLength", "()I", "getChallengeType", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpChallengeType;", "getFunction", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpFunction;", "getHasCounter", "()Z", "getOtpLength", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;", "getTimeStep", "()Lcom/bbva/ethermobilesdk/token/ocra/OtpTimeStep;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "formatInt", "value", GenerateActivationFormCommand.HASH_CODE, "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OcraSuite {
    private final int challengeLength;

    @NotNull
    private final OtpChallengeType challengeType;

    @NotNull
    private final OtpFunction function;
    private final boolean hasCounter;

    @NotNull
    private final OtpLength otpLength;

    @NotNull
    private final OtpTimeStep timeStep;

    @NotNull
    private final String version;

    public OcraSuite(@NotNull String version, @NotNull OtpFunction function, @NotNull OtpLength otpLength, @NotNull OtpTimeStep timeStep, @NotNull OtpChallengeType challengeType, int i10, boolean z10) {
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

    public static /* synthetic */ OcraSuite copy$default(OcraSuite ocraSuite, String str, OtpFunction otpFunction, OtpLength otpLength, OtpTimeStep otpTimeStep, OtpChallengeType otpChallengeType, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ocraSuite.version;
        }
        if ((i11 & 2) != 0) {
            otpFunction = ocraSuite.function;
        }
        OtpFunction otpFunction2 = otpFunction;
        if ((i11 & 4) != 0) {
            otpLength = ocraSuite.otpLength;
        }
        OtpLength otpLength2 = otpLength;
        if ((i11 & 8) != 0) {
            otpTimeStep = ocraSuite.timeStep;
        }
        OtpTimeStep otpTimeStep2 = otpTimeStep;
        if ((i11 & 16) != 0) {
            otpChallengeType = ocraSuite.challengeType;
        }
        OtpChallengeType otpChallengeType2 = otpChallengeType;
        if ((i11 & 32) != 0) {
            i10 = ocraSuite.challengeLength;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            z10 = ocraSuite.hasCounter;
        }
        return ocraSuite.copy(str, otpFunction2, otpLength2, otpTimeStep2, otpChallengeType2, i12, z10);
    }

    private final String formatInt(int value) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return a.i(new Object[]{Integer.valueOf(value)}, 1, "%02d", "format(format, *args)");
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
    public final OcraSuite copy(@NotNull String version, @NotNull OtpFunction function, @NotNull OtpLength otpLength, @NotNull OtpTimeStep timeStep, @NotNull OtpChallengeType challengeType, int challengeLength, boolean hasCounter) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(otpLength, "otpLength");
        Intrinsics.checkNotNullParameter(timeStep, "timeStep");
        Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        return new OcraSuite(version, function, otpLength, timeStep, challengeType, challengeLength, hasCounter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcraSuite)) {
            return false;
        }
        OcraSuite ocraSuite = (OcraSuite) other;
        return Intrinsics.areEqual(this.version, ocraSuite.version) && this.function == ocraSuite.function && Intrinsics.areEqual(this.otpLength, ocraSuite.otpLength) && Intrinsics.areEqual(this.timeStep, ocraSuite.timeStep) && this.challengeType == ocraSuite.challengeType && this.challengeLength == ocraSuite.challengeLength && this.hasCounter == ocraSuite.hasCounter;
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.version);
        arrayList.add(this.function.getValue() + Constant.DASH_STRING + this.otpLength.getValue());
        if (this.hasCounter) {
            arrayList.add("C-" + this.challengeType + formatInt(this.challengeLength) + "-T" + formatInt(this.timeStep.getValue()) + this.timeStep.getUnit());
        } else {
            arrayList.add(this.challengeType + formatInt(this.challengeLength) + "-T" + formatInt(this.timeStep.getValue()) + this.timeStep.getUnit());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, null, null, 0, null, null, 62, null);
    }
}
