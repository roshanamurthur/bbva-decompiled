package com.bbva.ethermobilesdk.passchecker.model.api.output;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequence.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016¨\u0006-"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/Sequence;", "", "graph", "", "guesses", "", "guessesLog10", "i", "", "j", "pattern", "shiftedCount", "token", "turns", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getGraph", "()Ljava/lang/String;", "getGuesses", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGuessesLog10", "getI", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJ", "getPattern", "getShiftedCount", "getToken", "getTurns", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/passchecker/model/api/output/Sequence;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Sequence {

    @Nullable
    private final String graph;

    @Nullable
    private final Double guesses;

    @Nullable
    private final Double guessesLog10;

    @Nullable
    private final Integer i;

    @Nullable
    private final Integer j;

    @Nullable
    private final String pattern;

    @Nullable
    private final Integer shiftedCount;

    @Nullable
    private final String token;

    @Nullable
    private final Integer turns;

    public Sequence() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGraph() {
        return this.graph;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getGuesses() {
        return this.guesses;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getGuessesLog10() {
        return this.guessesLog10;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getI() {
        return this.i;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getJ() {
        return this.j;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getShiftedCount() {
        return this.shiftedCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTurns() {
        return this.turns;
    }

    @NotNull
    public final Sequence copy(@Nullable String graph, @Nullable Double guesses, @Nullable Double guessesLog10, @Nullable Integer i10, @Nullable Integer j10, @Nullable String pattern, @Nullable Integer shiftedCount, @Nullable String token, @Nullable Integer turns) {
        return new Sequence(graph, guesses, guessesLog10, i10, j10, pattern, shiftedCount, token, turns);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sequence)) {
            return false;
        }
        Sequence sequence = (Sequence) other;
        return Intrinsics.areEqual(this.graph, sequence.graph) && Intrinsics.areEqual((Object) this.guesses, (Object) sequence.guesses) && Intrinsics.areEqual((Object) this.guessesLog10, (Object) sequence.guessesLog10) && Intrinsics.areEqual(this.i, sequence.i) && Intrinsics.areEqual(this.j, sequence.j) && Intrinsics.areEqual(this.pattern, sequence.pattern) && Intrinsics.areEqual(this.shiftedCount, sequence.shiftedCount) && Intrinsics.areEqual(this.token, sequence.token) && Intrinsics.areEqual(this.turns, sequence.turns);
    }

    @Nullable
    public final String getGraph() {
        return this.graph;
    }

    @Nullable
    public final Double getGuesses() {
        return this.guesses;
    }

    @Nullable
    public final Double getGuessesLog10() {
        return this.guessesLog10;
    }

    @Nullable
    public final Integer getI() {
        return this.i;
    }

    @Nullable
    public final Integer getJ() {
        return this.j;
    }

    @Nullable
    public final String getPattern() {
        return this.pattern;
    }

    @Nullable
    public final Integer getShiftedCount() {
        return this.shiftedCount;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Integer getTurns() {
        return this.turns;
    }

    public int hashCode() {
        String str = this.graph;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d2 = this.guesses;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.guessesLog10;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.pattern;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.shiftedCount;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.turns;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Sequence(graph=" + this.graph + ", guesses=" + this.guesses + ", guessesLog10=" + this.guessesLog10 + ", i=" + this.i + ", j=" + this.j + ", pattern=" + this.pattern + ", shiftedCount=" + this.shiftedCount + ", token=" + this.token + ", turns=" + this.turns + RootService.CLOSE_BRACKET;
    }

    public Sequence(@Nullable String str, @Nullable Double d2, @Nullable Double d3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable String str3, @Nullable Integer num4) {
        this.graph = str;
        this.guesses = d2;
        this.guessesLog10 = d3;
        this.i = num;
        this.j = num2;
        this.pattern = str2;
        this.shiftedCount = num3;
        this.token = str3;
        this.turns = num4;
    }

    public /* synthetic */ Sequence(String str, Double d2, Double d3, Integer num, Integer num2, String str2, Integer num3, String str3, Integer num4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d2, (i10 & 4) != 0 ? null : d3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : num3, (i10 & 128) != 0 ? null : str3, (i10 & 256) == 0 ? num4 : null);
    }
}
