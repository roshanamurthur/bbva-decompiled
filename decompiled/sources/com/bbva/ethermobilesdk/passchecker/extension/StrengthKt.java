package com.bbva.ethermobilesdk.passchecker.extension;

import com.bbva.ethermobilesdk.passchecker.model.api.output.CrackTimesSeconds;
import com.bbva.ethermobilesdk.passchecker.model.api.output.QualityResult;
import com.bbva.ethermobilesdk.passchecker.model.api.output.Sequence;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Strength.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"map", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/QualityResult;", "Lcom/nulabinc/zxcvbn/Strength;", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrength.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strength.kt\ncom/bbva/ethermobilesdk/passchecker/extension/StrengthKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n*S KotlinDebug\n*F\n+ 1 Strength.kt\ncom/bbva/ethermobilesdk/passchecker/extension/StrengthKt\n*L\n21#1:37\n21#1:38,3\n*E\n"})
public final class StrengthKt {
    @NotNull
    public static final QualityResult map(@NotNull Strength strength) {
        Intrinsics.checkNotNullParameter(strength, "<this>");
        String string = strength.getPassword().toString();
        int score = strength.getScore();
        CrackTimesSeconds crackTimesSeconds = new CrackTimesSeconds(strength.getCrackTimeSeconds().getOfflineFastHashing1e10PerSecond(), strength.getCrackTimeSeconds().getOfflineSlowHashing1e4perSecond(), strength.getCrackTimeSeconds().getOnlineNoThrottling10perSecond(), strength.getCrackTimeSeconds().getOnlineThrottling100perHour());
        long calcTime = strength.getCalcTime();
        List<Match> sequence = strength.getSequence();
        Intrinsics.checkNotNullExpressionValue(sequence, "sequence");
        List<Match> list = sequence;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            Match match = (Match) it.next();
            arrayList.add(new Sequence(match.graph, match.guesses, match.guessesLog10, Integer.valueOf(match.f63691i), Integer.valueOf(match.f63692j), match.pattern.value(), match.shiftedCount, match.token.toString(), Integer.valueOf(match.turns)));
        }
        return new QualityResult(string, score, crackTimesSeconds, calcTime, arrayList);
    }
}
