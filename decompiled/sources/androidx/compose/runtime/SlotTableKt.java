package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.text.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n82#2,3:4152\n33#2,4:4155\n85#2,2:4159\n38#2:4161\n87#2:4162\n1#3:4163\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3941#1:4152,3\n3941#1:4155,4\n3941#1:4159,2\n3941#1:4161\n3941#1:4162\n*E\n"})
public final class SlotTableKt {
    public static final int a(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$add(MutableIntObjectMap mutableIntObjectMap, int i10, int i11) {
        MutableIntSet mutableIntSet = (MutableIntSet) mutableIntObjectMap.get(i10);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i10, mutableIntSet);
        }
        mutableIntSet.add(i11);
    }

    public static final void access$addAux(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    public static final int access$auxIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return a(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    public static final boolean access$containsAnyMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    public static final boolean access$containsMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public static final int access$dataAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static final Anchor access$find(ArrayList arrayList, int i10, int i11) {
        int iB = b(arrayList, i10, i11);
        if (iB >= 0) {
            return (Anchor) arrayList.get(iB);
        }
        return null;
    }

    public static final int access$groupInfo(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    public static final int access$groupSize(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final boolean access$hasAux(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean access$hasMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 134217728) != 0;
    }

    public static final boolean access$hasObjectKey(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public static final void access$initGroup(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = z10 ? 1073741824 : 0;
        int i15 = z11 ? PKIFailureInfo.duplicateCertReq : 0;
        int i16 = z12 ? 268435456 : 0;
        int i17 = i10 * 5;
        iArr[i17] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    public static final boolean access$isNode(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public static final int access$key(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    public static final int access$locationOf(ArrayList arrayList, int i10, int i11) {
        int iB = b(arrayList, i10, i11);
        return iB >= 0 ? iB : -(iB + 1);
    }

    public static final int access$nodeCount(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    public static final List access$nodeCounts(int[] iArr, int i10) {
        ArrayList arrayListC = c(iArr, kotlin.ranges.c.step(kotlin.ranges.c.until(1, i10), 5));
        ArrayList arrayList = new ArrayList(arrayListC.size());
        int size = arrayListC.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(((Number) arrayListC.get(i11)).intValue() & 67108863));
        }
        return arrayList;
    }

    public static final int access$nodeIndex(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static final int access$objectKeyIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return a(iArr[i11 + 1] >> 30) + iArr[i11 + 4];
    }

    public static final int access$parentAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    public static final int access$slotAnchor(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return a(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final String access$summarize(String str, int i10) {
        String strReplace$default = l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(l.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i10, strReplace$default.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void access$updateContainsMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            iArr[i11] = iArr[i11] & (-67108865);
        }
    }

    public static final void access$updateDataAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    public static final void access$updateGroupKey(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    public static final void access$updateGroupSize(int[] iArr, int i10, int i11) {
        ComposerKt.runtimeCheck(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    public static final void access$updateMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 134217728;
        } else {
            iArr[i11] = iArr[i11] & (-134217729);
        }
    }

    public static final void access$updateNodeCount(int[] iArr, int i10, int i11) {
        ComposerKt.runtimeCheck(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final void access$updateParentAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }

    public static final int b(ArrayList<Anchor> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int location$runtime_release = arrayList.get(i13).getLocation();
            if (location$runtime_release < 0) {
                location$runtime_release += i11;
            }
            int iCompare = Intrinsics.compare(location$runtime_release, i10);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final ArrayList c(int[] iArr, IntProgression intProgression) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intProgression.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }
}
