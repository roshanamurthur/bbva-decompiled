package com.bbva.ethermobilesdk.passchecker.model.api.output;

import androidx.annotation.Keep;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QualityResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/QualityResult;", "", "password", "", FirebaseAnalytics.Param.SCORE, "", "crackTimesSeconds", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/CrackTimesSeconds;", "calcTime", "", "sequence", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/Sequence;", "(Ljava/lang/String;ILcom/bbva/ethermobilesdk/passchecker/model/api/output/CrackTimesSeconds;JLjava/util/List;)V", "getCalcTime", "()J", "getCrackTimesSeconds", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/output/CrackTimesSeconds;", "getPassword", "()Ljava/lang/String;", "getScore", "()I", "getSequence", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QualityResult {
    private final long calcTime;

    @NotNull
    private final CrackTimesSeconds crackTimesSeconds;

    @NotNull
    private final String password;
    private final int score;

    @NotNull
    private final List<Sequence> sequence;

    public QualityResult(@NotNull String password, int i10, @NotNull CrackTimesSeconds crackTimesSeconds, long j10, @NotNull List<Sequence> sequence) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(crackTimesSeconds, "crackTimesSeconds");
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.password = password;
        this.score = i10;
        this.crackTimesSeconds = crackTimesSeconds;
        this.calcTime = j10;
        this.sequence = sequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QualityResult copy$default(QualityResult qualityResult, String str, int i10, CrackTimesSeconds crackTimesSeconds, long j10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qualityResult.password;
        }
        if ((i11 & 2) != 0) {
            i10 = qualityResult.score;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            crackTimesSeconds = qualityResult.crackTimesSeconds;
        }
        CrackTimesSeconds crackTimesSeconds2 = crackTimesSeconds;
        if ((i11 & 8) != 0) {
            j10 = qualityResult.calcTime;
        }
        long j11 = j10;
        if ((i11 & 16) != 0) {
            list = qualityResult.sequence;
        }
        return qualityResult.copy(str, i12, crackTimesSeconds2, j11, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CrackTimesSeconds getCrackTimesSeconds() {
        return this.crackTimesSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCalcTime() {
        return this.calcTime;
    }

    @NotNull
    public final List<Sequence> component5() {
        return this.sequence;
    }

    @NotNull
    public final QualityResult copy(@NotNull String password, int score, @NotNull CrackTimesSeconds crackTimesSeconds, long calcTime, @NotNull List<Sequence> sequence) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(crackTimesSeconds, "crackTimesSeconds");
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        return new QualityResult(password, score, crackTimesSeconds, calcTime, sequence);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualityResult)) {
            return false;
        }
        QualityResult qualityResult = (QualityResult) other;
        return Intrinsics.areEqual(this.password, qualityResult.password) && this.score == qualityResult.score && Intrinsics.areEqual(this.crackTimesSeconds, qualityResult.crackTimesSeconds) && this.calcTime == qualityResult.calcTime && Intrinsics.areEqual(this.sequence, qualityResult.sequence);
    }

    public final long getCalcTime() {
        return this.calcTime;
    }

    @NotNull
    public final CrackTimesSeconds getCrackTimesSeconds() {
        return this.crackTimesSeconds;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final List<Sequence> getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        int iHashCode = (this.crackTimesSeconds.hashCode() + (((this.password.hashCode() * 31) + this.score) * 31)) * 31;
        long j10 = this.calcTime;
        return this.sequence.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QualityResult(password=");
        sb2.append(this.password);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", crackTimesSeconds=");
        sb2.append(this.crackTimesSeconds);
        sb2.append(", calcTime=");
        sb2.append(this.calcTime);
        sb2.append(", sequence=");
        return a.c(sb2, this.sequence, RootService.CLOSE_BRACKET);
    }
}
