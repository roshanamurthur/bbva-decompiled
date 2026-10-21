package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u007f\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u0004*\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-dSVRQoE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "", "minBound", "indexOfMinValue", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1158:1\n50#1,9:1169\n72#1,4:1178\n912#1:1195\n913#1,3:1200\n72#1,4:1203\n72#1,4:1207\n72#1,4:1211\n912#1:1222\n913#1,3:1227\n72#1,4:1238\n72#1,4:1242\n912#1:1263\n913#1,3:1268\n72#1,4:1273\n72#1,4:1279\n72#1,4:1283\n912#1:1304\n913#1,3:1309\n72#1,4:1312\n72#1,4:1316\n972#1,4:1320\n72#1,4:1324\n72#1,4:1328\n885#1,3:1332\n888#1:1339\n889#1,9:1342\n899#1:1352\n885#1,3:1353\n888#1:1360\n889#1,9:1363\n899#1:1373\n72#1,4:1374\n60#1:1382\n945#1,11:1386\n912#1:1397\n913#1,3:1402\n912#1:1415\n913#1,3:1420\n495#2,4:1159\n500#2:1168\n129#3,5:1163\n234#4:1182\n231#4:1183\n231#4:1189\n234#4:1215\n231#4:1216\n231#4:1232\n234#4:1250\n231#4:1251\n231#4:1257\n234#4:1291\n231#4:1292\n231#4:1298\n908#5:1184\n907#5:1185\n906#5:1187\n908#5:1190\n907#5:1191\n906#5:1193\n906#5:1196\n907#5:1198\n908#5:1217\n907#5:1218\n906#5:1220\n906#5:1223\n907#5:1225\n906#5:1230\n908#5:1233\n907#5:1234\n906#5:1236\n908#5:1252\n907#5:1253\n906#5:1255\n908#5:1258\n907#5:1259\n906#5:1261\n906#5:1264\n907#5:1266\n906#5:1271\n908#5:1293\n907#5:1294\n906#5:1296\n908#5:1299\n907#5:1300\n906#5:1302\n906#5:1305\n907#5:1307\n906#5:1398\n907#5:1400\n906#5:1411\n907#5:1413\n906#5:1416\n907#5:1418\n62#6:1186\n55#6:1188\n62#6:1192\n55#6:1194\n55#6:1197\n62#6:1199\n62#6:1219\n55#6:1221\n55#6:1224\n62#6:1226\n55#6:1231\n62#6:1235\n55#6:1237\n62#6:1254\n55#6:1256\n62#6:1260\n55#6:1262\n55#6:1265\n62#6:1267\n55#6:1272\n62#6:1295\n55#6:1297\n62#6:1301\n55#6:1303\n55#6:1306\n62#6:1308\n55#6:1399\n62#6:1401\n55#6:1412\n62#6:1414\n55#6:1417\n62#6:1419\n12774#7,2:1246\n12541#7,2:1248\n12774#7,2:1277\n12583#7,2:1287\n12774#7,2:1289\n12583#7,2:1340\n12583#7,2:1361\n12774#7,2:1378\n12583#7,2:1380\n12744#7,2:1384\n33#8,4:1335\n38#8:1351\n33#8,4:1356\n38#8:1372\n33#8,6:1405\n1#9:1383\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n244#1:1169,9\n302#1:1178,4\n347#1:1195\n347#1:1200,3\n353#1:1203,4\n395#1:1207,4\n433#1:1211,4\n461#1:1222\n461#1:1227,3\n478#1:1238,4\n481#1:1242,4\n514#1:1263\n514#1:1268,3\n532#1:1273,4\n554#1:1279,4\n557#1:1283,4\n621#1:1304\n621#1:1309,3\n659#1:1312,4\n662#1:1316,4\n679#1:1320,4\n683#1:1324,4\n705#1:1328,4\n735#1:1332,3\n735#1:1339\n735#1:1342,9\n735#1:1352\n764#1:1353,3\n764#1:1360\n764#1:1363,9\n764#1:1373\n794#1:1374,4\n244#1:1382\n850#1:1386,11\n873#1:1397\n873#1:1402,3\n925#1:1415\n925#1:1420,3\n111#1:1159,4\n111#1:1168\n111#1:1163,5\n339#1:1182\n339#1:1183\n346#1:1189\n459#1:1215\n459#1:1216\n471#1:1232\n505#1:1250\n505#1:1251\n509#1:1257\n613#1:1291\n613#1:1292\n620#1:1298\n339#1:1184\n339#1:1185\n339#1:1187\n346#1:1190\n346#1:1191\n346#1:1193\n347#1:1196\n347#1:1198\n459#1:1217\n459#1:1218\n459#1:1220\n461#1:1223\n461#1:1225\n467#1:1230\n471#1:1233\n471#1:1234\n471#1:1236\n505#1:1252\n505#1:1253\n505#1:1255\n509#1:1258\n509#1:1259\n509#1:1261\n514#1:1264\n514#1:1266\n524#1:1271\n613#1:1293\n613#1:1294\n613#1:1296\n620#1:1299\n620#1:1300\n620#1:1302\n621#1:1305\n621#1:1307\n873#1:1398\n873#1:1400\n912#1:1411\n912#1:1413\n925#1:1416\n925#1:1418\n339#1:1186\n339#1:1188\n346#1:1192\n346#1:1194\n347#1:1197\n347#1:1199\n459#1:1219\n459#1:1221\n461#1:1224\n461#1:1226\n467#1:1231\n471#1:1235\n471#1:1237\n505#1:1254\n505#1:1256\n509#1:1260\n509#1:1262\n514#1:1265\n514#1:1267\n524#1:1272\n613#1:1295\n613#1:1297\n620#1:1301\n620#1:1303\n621#1:1306\n621#1:1308\n873#1:1399\n873#1:1401\n912#1:1412\n912#1:1414\n925#1:1417\n925#1:1419\n490#1:1246,2\n493#1:1248,2\n550#1:1277,2\n564#1:1287,2\n572#1:1289,2\n748#1:1340,2\n780#1:1361,2\n813#1:1378,2\n814#1:1380,2\n848#1:1384,2\n735#1:1335,4\n735#1:1351\n764#1:1356,4\n764#1:1372\n887#1:1405,6\n*E\n"})
public final class LazyStaggeredGridMeasureKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5230p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1158:1\n33#2,6:1159\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n*L\n821#1:1159,6\n*E\n"})
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<LazyStaggeredGridMeasuredItem> f5231p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridMeasureContext f5232q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
            super(1);
            this.f5231p0 = arrayList;
            this.f5232q0 = lazyStaggeredGridMeasureContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<LazyStaggeredGridMeasuredItem> list = this.f5231p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).place(layout, this.f5232q0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    public static final int b(int[] iArr, long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:270:0x05d2  */
    @ExperimentalFoundationApi
    public static final LazyStaggeredGridMeasureResult c(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i10, int[] iArr, int[] iArr2, boolean z10) {
        int iIndexOf;
        int i11;
        int i12;
        int[] iArr3;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2;
        int[] iArr4;
        int i13;
        int[] iArr5;
        boolean z11;
        int[] iArr6;
        int i14;
        int[] gaps;
        int i15;
        LazyLayoutMeasureScope lazyLayoutMeasureScope;
        String str;
        int[] iArr7;
        int[] iArr8;
        lazyStaggeredGridMeasureContext = lazyStaggeredGridMeasureContext;
        int i16 = i10;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.CC.q(measureScope, Constraints.m4359getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m4358getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()), null, a.f5230p0, 4, null), false, false, lazyStaggeredGridMeasureContext.getIsVertical(), itemCount, CollectionsKt__CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m4359getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m4358getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getMainAxisAvailableSize(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str2 = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, size)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(this, size)");
        int length = iArrCopyOf.length - 1;
        if (length >= 0) {
            while (true) {
                int i17 = length - 1;
                while (true) {
                    if (iArrCopyOf[length] < itemCount && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArrCopyOf[length], length)) {
                        break;
                    }
                    iArrCopyOf[length] = lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(iArrCopyOf[length], length);
                }
                if (iArrCopyOf[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArrCopyOf[length])) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArrCopyOf[length], length);
                }
                if (i17 < 0) {
                    break;
                }
                length = i17;
            }
        }
        e(-i16, iArrCopyOf2);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        int i18 = 0;
        for (int i19 = 0; i19 < laneCount; i19++) {
            arrayDequeArr[i19] = new ArrayDeque(16);
        }
        e(-lazyStaggeredGridMeasureContext.getBeforeContentPadding(), iArrCopyOf2);
        loop3: while (true) {
            int length2 = iArrCopyOf.length;
            int i20 = i18;
            while (true) {
                if (i20 >= length2) {
                    iIndexOf = -1;
                    break loop3;
                }
                int i21 = iArrCopyOf[i20];
                if (iArrCopyOf2[i20] >= Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), i18) || i21 <= 0) {
                    i20++;
                    itemCount = itemCount;
                    i18 = 0;
                }
            }
            iIndexOf = a(iArrCopyOf);
            int i22 = iArrCopyOf[iIndexOf];
            int length3 = iArrCopyOf2.length;
            for (int i23 = i18; i23 < length3; i23++) {
                if (iArrCopyOf[i23] != iArrCopyOf[iIndexOf]) {
                    int i24 = iArrCopyOf2[i23];
                    int i25 = iArrCopyOf2[iIndexOf];
                    if (i24 < i25) {
                        iArrCopyOf2[i23] = i25;
                    }
                }
            }
            int iFindPreviousItemIndex = lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i22, iIndexOf);
            if (iFindPreviousItemIndex < 0) {
                break;
            }
            long jM427getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
            int i26 = itemCount;
            int i27 = (int) (jM427getSpanRangelOCCd4c & 4294967295L);
            int i28 = (int) (jM427getSpanRangelOCCd4c >> 32);
            int i29 = i27 - i28;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex, i29 != 1 ? -2 : i28);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM427getSpanRangelOCCd4c);
            int iB = b(iArrCopyOf2, jM427getSpanRangelOCCd4c);
            int[] gaps2 = i29 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
            while (i28 < i27) {
                iArrCopyOf[i28] = iFindPreviousItemIndex;
                iArrCopyOf2[i28] = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ.getSizeWithSpacings() + iB + (gaps2 == null ? 0 : gaps2[i28]);
                i28++;
            }
            itemCount = i26;
            i18 = 0;
        }
        int i30 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i31 = iArrCopyOf2[0];
        if (i31 < i30) {
            i16 += i31;
            e(i30 - i31, iArrCopyOf2);
        }
        e(lazyStaggeredGridMeasureContext.getBeforeContentPadding(), iArrCopyOf2);
        int i32 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt___ArraysKt.indexOf(iArrCopyOf, 0);
        }
        if (iIndexOf != -1 && d(iArrCopyOf, lazyStaggeredGridMeasureContext, iArrCopyOf2, iIndexOf) && z10) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length4 = iArrCopyOf.length;
            int[] iArr9 = new int[length4];
            int i33 = 0;
            while (i33 < length4) {
                iArr9[i33] = i32;
                i33++;
                i32 = -1;
            }
            int length5 = iArrCopyOf2.length;
            int[] iArr10 = new int[length5];
            for (int i34 = 0; i34 < length5; i34++) {
                iArr10[i34] = iArrCopyOf2[iIndexOf];
            }
            return c(lazyStaggeredGridMeasureContext, i16, iArr9, iArr10, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(this, size)");
        int length6 = iArrCopyOf2.length;
        int[] iArr11 = new int[length6];
        for (int i35 = 0; i35 < length6; i35++) {
            iArr11[i35] = -iArrCopyOf2[i35];
        }
        int iCoerceAtLeast = c.coerceAtLeast(lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getMainAxisAvailableSize(), 0);
        int iIndexOfMinValue$default = indexOfMinValue$default(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        while (iIndexOfMinValue$default != -1 && laneCount2 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i36 = iArrCopyOf3[iIndexOfMinValue$default];
            int iIndexOfMinValue = indexOfMinValue(iArrCopyOf3, i36);
            int i37 = laneCount2 + 1;
            if (i36 >= 0) {
                long jM427getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i36, iIndexOfMinValue$default);
                lazyLayoutMeasureScope = measureScope;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(i36, jM427getSpanRangelOCCd4c2);
                str = str2;
                i15 = i16;
                int i38 = (int) (jM427getSpanRangelOCCd4c2 & 4294967295L);
                iArr7 = iArrCopyOf;
                iArr8 = iArrCopyOf2;
                int i39 = (int) (jM427getSpanRangelOCCd4c2 >> 32);
                int i40 = i38 - i39;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i36, i40 != 1 ? -2 : i39);
                int sizeWithSpacings = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ2.getSizeWithSpacings() + b(iArr11, jM427getSpanRangelOCCd4c2);
                for (int i41 = i39; i41 < i38; i41++) {
                    iArr11[i41] = sizeWithSpacings;
                    iArrCopyOf3[i41] = i36;
                    arrayDequeArr[i41].addLast(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ2);
                }
                if (iArr11[i39] <= lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i30) {
                    lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ2.setVisible(false);
                }
                if (i40 != 1) {
                    laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                }
                iIndexOfMinValue$default = iIndexOfMinValue;
                measureScope = lazyLayoutMeasureScope;
                str2 = str;
                i16 = i15;
                iArrCopyOf = iArr7;
                iArrCopyOf2 = iArr8;
            } else {
                i15 = i16;
                lazyLayoutMeasureScope = measureScope;
                str = str2;
                iArr7 = iArrCopyOf;
                iArr8 = iArrCopyOf2;
            }
            laneCount2 = i37;
            iIndexOfMinValue$default = iIndexOfMinValue;
            measureScope = lazyLayoutMeasureScope;
            str2 = str;
            i16 = i15;
            iArrCopyOf = iArr7;
            iArrCopyOf2 = iArr8;
        }
        int i42 = i16;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        String str3 = str2;
        int[] iArr12 = iArrCopyOf;
        int[] iArr13 = iArrCopyOf2;
        loop12: while (true) {
            int i43 = 0;
            while (true) {
                if (i43 >= length6) {
                    for (int i44 = 0; i44 < laneCount; i44++) {
                        if (!arrayDequeArr[i44].isEmpty()) {
                            i11 = itemCount;
                            i12 = 1;
                            break loop12;
                        }
                    }
                    break;
                }
                int i45 = iArr11[i43];
                if (i45 < iCoerceAtLeast || i45 <= 0) {
                    break;
                }
                i43++;
            }
            i12 = 1;
            int iIndexOfMinValue$default2 = indexOfMinValue$default(iArr11, 0, 1, null);
            int iMaxOrThrow = ArraysKt___ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            i11 = itemCount;
            if (iMaxOrThrow >= i11) {
                break;
            }
            int i46 = length6;
            int i47 = i30;
            int i48 = i42;
            int[] iArr14 = iArr13;
            int i49 = iCoerceAtLeast;
            int i50 = laneCount;
            int[] iArr15 = iArrCopyOf3;
            String str4 = str3;
            int[] iArr16 = iArr11;
            long jM427getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default2);
            int i51 = (int) (jM427getSpanRangelOCCd4c3 & 4294967295L);
            int i52 = (int) (jM427getSpanRangelOCCd4c3 >> 32);
            int i53 = i51 - i52;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iMaxOrThrow, i53 != 1 ? -2 : i52);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iMaxOrThrow, jM427getSpanRangelOCCd4c3);
            int iB2 = b(iArr16, jM427getSpanRangelOCCd4c3);
            if (i53 != 1) {
                gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                if (gaps == null) {
                    gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                gaps = null;
            }
            for (int i54 = i52; i54 < i51; i54++) {
                if (gaps != null) {
                    gaps[i54] = iB2 - iArr16[i54];
                }
                iArr15[i54] = iMaxOrThrow;
                iArr16[i54] = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ3.getSizeWithSpacings() + iB2;
                arrayDequeArr[i54].addLast(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
            if (iArr16[i52] <= lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i47) {
                lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ3.setVisible(false);
            }
            iArrCopyOf3 = iArr15;
            str3 = str4;
            iArr11 = iArr16;
            laneCount = i50;
            length6 = i46;
            i30 = i47;
            itemCount = i11;
            iCoerceAtLeast = i49;
            iArr13 = iArr14;
            i42 = i48;
        }
        int i55 = 0;
        while (i55 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr[i55];
            while (arrayDeque.size() > i12 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps3 = lazyStaggeredGridMeasuredItem.getSpan() != i12 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr13[i55] = iArr13[i55] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i55]));
                i12 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr12[i55] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i55++;
            i12 = 1;
        }
        for (int i56 : iArrCopyOf3) {
            if (i56 == i11 - 1) {
                e(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), iArr11);
                break;
            }
        }
        int i57 = 0;
        while (true) {
            if (i57 >= length6) {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr11[a(iArr11)];
                iArr3 = iArr13;
                e(-mainAxisAvailableSize, iArr3);
                e(mainAxisAvailableSize, iArr11);
                boolean z12 = false;
                loop33: while (true) {
                    int length7 = iArr3.length;
                    int i58 = 0;
                    while (true) {
                        if (i58 >= length7) {
                            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                            iArr4 = iArr12;
                            break loop33;
                        }
                        if (iArr3[i58] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i58++;
                        laneCount = laneCount;
                        i42 = i42;
                        iArr12 = iArr12;
                    }
                    int iIndexOfMinValue$default3 = indexOfMinValue$default(iArr3, 0, 1, null);
                    if (iIndexOfMinValue$default3 != a(iArr12)) {
                        z12 = true;
                    }
                    int i59 = iArr12[iIndexOfMinValue$default3];
                    if (i59 == -1) {
                        i59 = i11;
                    }
                    int iFindPreviousItemIndex2 = lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i59, iIndexOfMinValue$default3);
                    if (iFindPreviousItemIndex2 < 0) {
                        lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                        iArr4 = iArr12;
                        if ((!z12 && !d(iArr4, lazyStaggeredGridMeasureContext2, iArr3, iIndexOfMinValue$default3)) || !z10) {
                            break;
                        }
                        lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                        int length8 = iArr4.length;
                        int[] iArr17 = new int[length8];
                        for (int i60 = 0; i60 < length8; i60++) {
                            iArr17[i60] = -1;
                        }
                        int length9 = iArr3.length;
                        int[] iArr18 = new int[length9];
                        for (int i61 = 0; i61 < length9; i61++) {
                            iArr18[i61] = iArr3[iIndexOfMinValue$default3];
                        }
                        return c(lazyStaggeredGridMeasureContext2, i42, iArr17, iArr18, false);
                    }
                    boolean z13 = z12;
                    int i62 = i42;
                    int[] iArr19 = iArr12;
                    int i63 = iCoerceAtLeast;
                    int i64 = i30;
                    long jM427getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex2, iIndexOfMinValue$default3);
                    int[] iArr20 = iArrCopyOf3;
                    int i65 = laneCount;
                    int i66 = (int) (jM427getSpanRangelOCCd4c4 & 4294967295L);
                    int i67 = length6;
                    int[] iArr21 = iArr11;
                    int i68 = (int) (jM427getSpanRangelOCCd4c4 >> 32);
                    int i69 = i66 - i68;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex2, i69 != 1 ? -2 : i68);
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iFindPreviousItemIndex2, jM427getSpanRangelOCCd4c4);
                    int iB3 = b(iArr3, jM427getSpanRangelOCCd4c4);
                    int[] gaps4 = i69 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex2) : null;
                    boolean z14 = z13;
                    for (int i70 = i68; i70 < i66; i70++) {
                        if (iArr3[i70] != iB3) {
                            z14 = true;
                        }
                        arrayDequeArr[i70].addFirst(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ4);
                        iArr19[i70] = iFindPreviousItemIndex2;
                        iArr3[i70] = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ4.getSizeWithSpacings() + iB3 + (gaps4 == null ? 0 : gaps4[i70]);
                    }
                    iCoerceAtLeast = i63;
                    z12 = z14;
                    length6 = i67;
                    i30 = i64;
                    laneCount = i65;
                    iArrCopyOf3 = iArr20;
                    iArr11 = iArr21;
                    i42 = i62;
                    iArr12 = iArr19;
                }
                if (!z12 || !z10) {
                    i13 = mainAxisAvailableSize + i42;
                    int i71 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                    if (i71 >= 0) {
                        iArr5 = iArr11;
                        break;
                    }
                    i13 += i71;
                    iArr5 = iArr11;
                    e(i71, iArr5);
                    e(-i71, iArr3);
                    break;
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                return c(lazyStaggeredGridMeasureContext2, i42, iArr4, iArr3, false);
            }
            if (iArr11[i57] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                laneCount = laneCount;
                length6 = length6;
                iArr5 = iArr11;
                iCoerceAtLeast = iCoerceAtLeast;
                i30 = i30;
                i13 = i42;
                iArr4 = iArr12;
                iArr3 = iArr13;
                iArrCopyOf3 = iArrCopyOf3;
                break;
            }
            i57++;
        }
        float scrollToBeConsumed = (mk.c.getSign(mk.c.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != mk.c.getSign(i13) || Math.abs(mk.c.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i13)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i13;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length10 = iArrCopyOf4.length;
        for (int i72 = 0; i72 < length10; i72++) {
            iArrCopyOf4[i72] = -iArrCopyOf4[i72];
        }
        int i73 = laneCount;
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i74 = 0; i74 < i73; i74++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i74];
                int size = arrayDeque2.size();
                int i75 = 0;
                while (i75 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i75);
                    int i76 = size;
                    int[] gaps5 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps5 == null ? 0 : gaps5[i74]);
                    if (i75 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque2) || (i14 = iArr3[i74]) == 0 || i14 < sizeWithSpacings2) {
                        break;
                    }
                    iArr3[i74] = i14 - sizeWithSpacings2;
                    i75++;
                    iArr4[i74] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i75)).getIndex();
                    size = i76;
                }
            }
        }
        int afterContentPadding = lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int iM4357getMaxWidthimpl = lazyStaggeredGridMeasureContext.getIsVertical() ? Constraints.m4357getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()) : ConstraintsKt.m4371constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt___ArraysKt.maxOrThrow(iArr5) + afterContentPadding);
        int iM4370constrainHeightK40F9xA = lazyStaggeredGridMeasureContext.getIsVertical() ? ConstraintsKt.m4370constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt___ArraysKt.maxOrThrow(iArr5) + afterContentPadding) : Constraints.m4356getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        int afterContentPadding2 = lazyStaggeredGridMeasureContext.getAfterContentPadding() + (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? iM4370constrainHeightK40F9xA : iM4357getMaxWidthimpl, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int sizeWithSpacings3 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size();
        int i77 = length6;
        int i78 = 0;
        List listEmptyList = null;
        while (i78 < size2) {
            List<Integer> list = pinnedItems;
            int iIntValue = pinnedItems.get(i78).intValue();
            int i79 = size2;
            int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue);
            int[] iArr22 = iArr5;
            if (lane == -2 || lane == -1) {
                int length11 = iArr4.length;
                int i80 = 0;
                while (true) {
                    if (i80 < length11) {
                        int i81 = length11;
                        if (iArr4[i80] > iIntValue) {
                            i80++;
                            length11 = i81;
                        }
                    } else {
                        long jM427getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (listEmptyList == null) {
                            listEmptyList = new ArrayList();
                        }
                        List list2 = listEmptyList;
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iIntValue, jM427getSpanRangelOCCd4c5);
                        sizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ5.getSizeWithSpacings();
                        lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ5.position(sizeWithSpacings3, 0, afterContentPadding2);
                        list2.add(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ5);
                        listEmptyList = list2;
                    }
                }
            } else if (iArr4[lane] > iIntValue) {
                long jM427getSpanRangelOCCd4c6 = lazyStaggeredGridMeasureContext2.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list3 = listEmptyList;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iIntValue, jM427getSpanRangelOCCd4c6);
                sizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ6.getSizeWithSpacings();
                lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ6.position(sizeWithSpacings3, 0, afterContentPadding2);
                list3.add(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ6);
                listEmptyList = list3;
            }
            i78++;
            pinnedItems = list;
            size2 = i79;
            iArr5 = iArr22;
            iArr4 = iArr4;
        }
        int[] iArr23 = iArr4;
        int[] iArr24 = iArr5;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        int size3 = 0;
        for (int i82 = 0; i82 < i73; i82++) {
            size3 += arrayDequeArr[i82].size();
        }
        ArrayList arrayList = new ArrayList(size3);
        loop25: while (true) {
            int i83 = 0;
            while (true) {
                if (i83 >= i73) {
                    break loop25;
                }
                if (!arrayDequeArr[i83].isEmpty()) {
                    break;
                }
                i83++;
            }
            int i84 = Integer.MAX_VALUE;
            int i85 = -1;
            for (int i86 = 0; i86 < i73; i86++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i86].firstOrNull();
                int index = lazyStaggeredGridMeasuredItem4 != null ? lazyStaggeredGridMeasuredItem4.getIndex() : Integer.MAX_VALUE;
                if (i84 > index) {
                    i85 = i86;
                    i84 = index;
                }
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i85].removeFirst();
            if (lazyStaggeredGridMeasuredItem5.getLane() == i85) {
                long jM433constructorimpl = SpanRange.m433constructorimpl(lazyStaggeredGridMeasuredItem5.getLane(), lazyStaggeredGridMeasuredItem5.getSpan());
                int iB4 = b(iArrCopyOf4, jM433constructorimpl);
                int i87 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i85];
                if (lazyStaggeredGridMeasuredItem5.getPlaceablesCount() != 0) {
                    lazyStaggeredGridMeasuredItem5.position(iB4, i87, afterContentPadding2);
                    arrayList.add(lazyStaggeredGridMeasuredItem5);
                    int i88 = iM4370constrainHeightK40F9xA;
                    int[] iArr25 = iArr3;
                    int i89 = (int) (jM433constructorimpl & 4294967295L);
                    for (int i90 = (int) (jM433constructorimpl >> 32); i90 < i89; i90++) {
                        iArrCopyOf4[i90] = lazyStaggeredGridMeasuredItem5.getSizeWithSpacings() + iB4;
                    }
                    iM4370constrainHeightK40F9xA = i88;
                    iArr3 = iArr25;
                }
            }
        }
        int i91 = iM4370constrainHeightK40F9xA;
        int[] iArr26 = iArr3;
        int i92 = iArrCopyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size4 = pinnedItems2.size();
        int i93 = 0;
        List listEmptyList2 = null;
        while (i93 < size4) {
            int iIntValue2 = pinnedItems2.get(i93).intValue();
            if (iIntValue2 < i11) {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue2);
                if (lane2 == -2 || lane2 == -1) {
                    iArr6 = iArrCopyOf3;
                    int length12 = iArr6.length;
                    int i94 = 0;
                    while (true) {
                        if (i94 < length12) {
                            if (iArr6[i94] < iIntValue2) {
                                i94++;
                            }
                        }
                    }
                } else {
                    if (iArrCopyOf3[lane2] < iIntValue2) {
                        iArr6 = iArrCopyOf3;
                    }
                    iArr6 = iArrCopyOf3;
                }
                long jM427getSpanRangelOCCd4c7 = lazyStaggeredGridMeasureContext2.m427getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ7 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m431getAndMeasurejy6DScQ(iIntValue2, jM427getSpanRangelOCCd4c7);
                lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ7.position(i92, 0, afterContentPadding2);
                int sizeWithSpacings4 = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ7.getSizeWithSpacings() + i92;
                listEmptyList2.add(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ7);
                i92 = sizeWithSpacings4;
            } else {
                iArr6 = iArrCopyOf3;
            }
            i93++;
            pinnedItems2 = pinnedItems2;
            iArrCopyOf3 = iArr6;
            i11 = i11;
        }
        int i95 = i11;
        int[] iArr27 = iArrCopyOf3;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listEmptyList);
        arrayList2.addAll(arrayList);
        arrayList2.addAll(listEmptyList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator().onMeasured((int) scrollToBeConsumed, iM4357getMaxWidthimpl, i91, arrayList2, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getLaneCount());
        boolean z15 = iArr23[0] != 0 || iArr26[0] > 0;
        int i96 = 0;
        while (true) {
            if (i96 >= i77) {
                for (int i97 : iArr27) {
                    if (i97 >= i95 - 1) {
                        z11 = false;
                        return new LazyStaggeredGridMeasureResult(iArr23, iArr26, scrollToBeConsumed, MeasureScope.CC.q(lazyLayoutMeasureScope2, iM4357getMaxWidthimpl, i91, null, new b(arrayList2, lazyStaggeredGridMeasureContext2), 4, null), z11, z15, lazyStaggeredGridMeasureContext.getIsVertical(), i95, arrayList, IntSizeKt.IntSize(iM4357getMaxWidthimpl, i91), i30, iCoerceAtLeast, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
                    }
                }
                break;
            }
            if (iArr24[i96] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                break;
            }
            i96++;
        }
        z11 = true;
        return new LazyStaggeredGridMeasureResult(iArr23, iArr26, scrollToBeConsumed, MeasureScope.CC.q(lazyLayoutMeasureScope2, iM4357getMaxWidthimpl, i91, null, new b(arrayList2, lazyStaggeredGridMeasureContext2), 4, null), z11, z15, lazyStaggeredGridMeasureContext.getIsVertical(), i95, arrayList, IntSizeKt.IntSize(iM4357getMaxWidthimpl, i91), i30, iCoerceAtLeast, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    public static final boolean d(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    public static final void e(int i10, int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    public static final int indexOfMinValue(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i10 + 1;
            int i15 = iArr[i13];
            if (i14 <= i15 && i15 < i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        return i11;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: measureStaggeredGrid-dSVRQoE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m429measureStaggeredGriddSVRQoE(@NotNull LazyLayoutMeasureScope measureStaggeredGrid, @NotNull LazyStaggeredGridState state, @NotNull List<Integer> pinnedItems, @NotNull LazyStaggeredGridItemProvider itemProvider, @NotNull LazyStaggeredGridSlots resolvedSlots, long j10, boolean z10, boolean z11, long j11, int i10, int i11, int i12, int i13) {
        T t10;
        int iB;
        T t11;
        int i14;
        Intrinsics.checkNotNullParameter(measureStaggeredGrid, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, pinnedItems, itemProvider, resolvedSlots, j10, z10, measureStaggeredGrid, i10, j11, i12, i13, z11, i11, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(itemProvider, state.getScrollPosition().getIndices());
                int[] offsets = state.getScrollPosition().getOffsets();
                if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t10 = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i15 = 0;
                    while (i15 < laneCount) {
                        if (i15 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iB = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i15]) == -1) {
                            iB = i15 == 0 ? 0 : b(iArr, SpanRange.m433constructorimpl(0, i15)) + 1;
                        }
                        iArr[i15] = iB;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i15], i15);
                        i15++;
                    }
                    t10 = iArr;
                }
                objectRef.element = t10;
                if (offsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t11 = offsets;
                } else {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    int i16 = 0;
                    while (i16 < laneCount2) {
                        if (i16 < offsets.length) {
                            i14 = offsets[i16];
                        } else {
                            i14 = i16 == 0 ? 0 : iArr2[i16 - 1];
                        }
                        iArr2[i16] = i14;
                        i16++;
                    }
                    t11 = iArr2;
                }
                objectRef2.element = t11;
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                return c(lazyStaggeredGridMeasureContext, mk.c.roundToInt(state.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }
}
