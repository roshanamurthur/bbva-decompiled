package m0;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.KeyInfo;
import androidx.compose.runtime.PreconditionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,4584:1\n33#2,7:4585\n408#3,3:4592\n354#3,6:4595\n364#3,3:4602\n367#3,2:4606\n412#3,2:4608\n370#3,6:4610\n414#3:4616\n408#3,3:4617\n354#3,6:4620\n364#3,3:4627\n367#3,2:4631\n412#3,2:4633\n370#3,6:4635\n414#3:4641\n408#3,3:4642\n354#3,6:4645\n364#3,3:4652\n367#3,2:4656\n412#3,2:4658\n370#3,6:4660\n414#3:4666\n408#3,3:4667\n354#3,6:4670\n364#3,3:4677\n367#3,2:4681\n412#3,2:4683\n370#3,6:4685\n414#3:4691\n408#3,3:4692\n354#3,6:4695\n364#3,3:4702\n367#3,2:4706\n412#3,2:4708\n370#3,6:4710\n414#3:4716\n1810#4:4601\n1672#4:4605\n1810#4:4626\n1672#4:4630\n1810#4:4651\n1672#4:4655\n1810#4:4676\n1672#4:4680\n1810#4:4701\n1672#4:4705\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n126#1:4585,7\n173#1:4592,3\n173#1:4595,6\n173#1:4602,3\n173#1:4606,2\n173#1:4608,2\n173#1:4610,6\n173#1:4616\n179#1:4617,3\n179#1:4620,6\n179#1:4627,3\n179#1:4631,2\n179#1:4633,2\n179#1:4635,6\n179#1:4641\n189#1:4642,3\n189#1:4645,6\n189#1:4652,3\n189#1:4656,2\n189#1:4658,2\n189#1:4660,6\n189#1:4666\n195#1:4667,3\n195#1:4670,6\n195#1:4677,3\n195#1:4681,2\n195#1:4683,2\n195#1:4685,6\n195#1:4691\n215#1:4692,3\n215#1:4695,6\n215#1:4702,3\n215#1:4706,2\n215#1:4708,2\n215#1:4710,6\n215#1:4716\n173#1:4601\n173#1:4605\n179#1:4626\n179#1:4630\n189#1:4651\n189#1:4655\n195#1:4676\n195#1:4680\n215#1:4701\n215#1:4705\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<KeyInfo> f83327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList f83330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableIntObjectMap<i> f83331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f83332f;

    /* JADX INFO: compiled from: Composer.kt */
    public static final class a extends Lambda implements Function0<t<Object, KeyInfo>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.KeyInfo, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object[]] */
        @Override // kotlin.jvm.functions.Function0
        public final t<Object, KeyInfo> invoke() {
            v vVar = v.this;
            MutableScatterMap mutableScatterMapAccess$multiMap = ComposerKt.access$multiMap(vVar.f83327a.size());
            List<KeyInfo> list = vVar.f83327a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                KeyInfo keyInfoMutableListOf = list.get(i10);
                Object objAccess$getJoinedKey = ComposerKt.access$getJoinedKey(keyInfoMutableListOf);
                int iFindInsertIndex = mutableScatterMapAccess$multiMap.findInsertIndex(objAccess$getJoinedKey);
                boolean z10 = iFindInsertIndex < 0;
                Object obj = z10 ? null : mutableScatterMapAccess$multiMap.values[iFindInsertIndex];
                if (obj != null) {
                    if (TypeIntrinsics.isMutableList(obj)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                        List listAsMutableList = TypeIntrinsics.asMutableList(obj);
                        listAsMutableList.add(keyInfoMutableListOf);
                        keyInfoMutableListOf = listAsMutableList;
                    } else {
                        keyInfoMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new Object[]{obj, keyInfoMutableListOf});
                    }
                }
                if (z10) {
                    int i11 = ~iFindInsertIndex;
                    mutableScatterMapAccess$multiMap.keys[i11] = objAccess$getJoinedKey;
                    mutableScatterMapAccess$multiMap.values[i11] = keyInfoMutableListOf;
                } else {
                    mutableScatterMapAccess$multiMap.values[iFindInsertIndex] = keyInfoMutableListOf;
                }
            }
            return new t<>(mutableScatterMapAccess$multiMap);
        }
    }

    public v(@NotNull List<KeyInfo> list, int i10) {
        this.f83327a = list;
        this.f83328b = i10;
        if (i10 < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.f83330d = new ArrayList();
        MutableIntObjectMap<i> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i11 = 0; i11 < size; i11++) {
            KeyInfo keyInfo = this.f83327a.get(i11);
            mutableIntObjectMap.set(keyInfo.getLocation(), new i(i11, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.f83331e = mutableIntObjectMap;
        this.f83332f = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final int a(@NotNull KeyInfo keyInfo) {
        i iVar = this.f83331e.get(keyInfo.getLocation());
        if (iVar != null) {
            return iVar.f83256b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        MutableIntObjectMap<i> mutableIntObjectMap = this.f83331e;
        i iVar = mutableIntObjectMap.get(i10);
        if (iVar == null) {
            return false;
        }
        int i13 = iVar.f83256b;
        int i14 = i11 - iVar.f83257c;
        iVar.f83257c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        i iVar2 = (i) objArr[(i15 << 3) + i17];
                        if (iVar2.f83256b >= i13 && !Intrinsics.areEqual(iVar2, iVar) && (i12 = iVar2.f83256b + i14) >= 0) {
                            iVar2.f83256b = i12;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
