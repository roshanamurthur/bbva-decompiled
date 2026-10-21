package com.bbva.ethermobilesdk.passchecker.extension;

import com.bbva.ethermobilesdk.passchecker.model.api.input.QualityMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QualityMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"qualityLevel", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/QualityMap;", "qualityScore", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class QualityMapKt {
    public static final int qualityLevel(@NotNull QualityMap qualityMap, int i10) {
        Intrinsics.checkNotNullParameter(qualityMap, "<this>");
        if (qualityMap.getLevel1().contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (qualityMap.getLevel2().contains(Integer.valueOf(i10))) {
            return 2;
        }
        return qualityMap.getLevel3().contains(Integer.valueOf(i10)) ? 3 : 0;
    }
}
