package com.bbva.ethermobilesdk.passchecker.util;

import com.bbva.ethermobilesdk.passchecker.model.api.output.PassCheckerError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a&\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00010\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0001H\u0000\u001a2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00010\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000¨\u0006\r"}, d2 = {"evaluate", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "passCheckerError", "validEvaluation", "Lkotlin/Function0;", "", "getConsecutiveNumbers", "", "sourceList", "getConsecutiveNumbersByRange", "rangeMin", "rangeMax", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\ncom/bbva/ethermobilesdk/passchecker/util/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1785#2,3:46\n1785#2,3:49\n*S KotlinDebug\n*F\n+ 1 Util.kt\ncom/bbva/ethermobilesdk/passchecker/util/UtilKt\n*L\n10#1:46,3\n23#1:49,3\n*E\n"})
public final class UtilKt {
    @Nullable
    public static final List<PassCheckerError> evaluate(@NotNull PassCheckerError passCheckerError, @NotNull Function0<Boolean> validEvaluation) {
        Intrinsics.checkNotNullParameter(passCheckerError, "passCheckerError");
        Intrinsics.checkNotNullParameter(validEvaluation, "validEvaluation");
        if (validEvaluation.invoke().booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(passCheckerError);
        return arrayList;
    }

    @NotNull
    public static final List<List<Integer>> getConsecutiveNumbers(@NotNull List<Integer> sourceList) {
        Intrinsics.checkNotNullParameter(sourceList, "sourceList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sourceList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (arrayList.isEmpty() || ((Number) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last((List) arrayList))).intValue() != iIntValue - 1) {
                arrayList.add(CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(iIntValue)));
            } else {
                ((List) CollectionsKt___CollectionsKt.last((List) arrayList)).add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<List<Integer>> getConsecutiveNumbersByRange(@NotNull List<Integer> sourceList, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sourceList, "sourceList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sourceList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (i10 <= iIntValue && iIntValue <= i11) {
                if (arrayList.isEmpty() || ((Number) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last((List) arrayList))).intValue() != iIntValue - 1) {
                    arrayList.add(CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(iIntValue)));
                } else {
                    ((List) CollectionsKt___CollectionsKt.last((List) arrayList)).add(Integer.valueOf(iIntValue));
                }
            }
        }
        return arrayList;
    }
}
