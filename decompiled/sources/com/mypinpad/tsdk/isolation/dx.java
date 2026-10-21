package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import bk.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J]\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0014\u001a\u0004\u0018\u00010\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/dx;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/ew;", "p2", "Lcom/mypinpad/tsdk/i/setRotationX;", "p3", "Lcom/mypinpad/tsdk/i/ds;", "p4", "Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "p5", "Lkotlin/Pair;", "Lcom/mypinpad/tsdk/i/fk;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/setRotationX;Lcom/mypinpad/tsdk/i/ds;Lcom/mypinpad/tsdk/i/setFitsSystemWindows;)Lkotlin/Pair;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/setRotationX;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/ds;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class dx {

    @NotNull
    public static final dx INSTANCE = new dx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55273a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55274b = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55275p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55276q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55277r0 = 1;

        static {
            int i10 = f55276q0;
            int i11 = ((i10 | 117) << 1) - (i10 ^ 117);
            f55277r0 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 11 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 334) + (i10 * (-665));
            int i14 = ~i10;
            int i15 = (i14 * (-333)) + i13;
            int i16 = ~i12;
            if ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i17 = f55277r0 + 121;
                f55276q0 = i17 % 128;
                int i18 = i17 % 2;
                a(new Object[]{aVar, (cv) obj}, -1073111230, 1073111230, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i19 = f55276q0 + 73;
                f55277r0 = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            }
            a aVar2 = (a) objArr[0];
            cv cvVar = (cv) objArr[1];
            System.identityHashCode(aVar2);
            System.identityHashCode(aVar2);
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            int i21 = f55277r0;
            int i22 = (i21 | 123) << 1;
            int i23 = -(i21 ^ 123);
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f55276q0 = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -926393452, 926393453, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/dc;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f55278p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55279q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55280r0 = 1;

        static {
            int i10 = f55280r0;
            int i11 = i10 & 35;
            int i12 = ((((i10 ^ 35) | i11) << 1) - (~(-((i10 | 35) & (~i11))))) - 1;
            f55279q0 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 12 / 0;
            }
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (~(i13 | i14)) | (~(i14 | i12));
            int i16 = ~i12;
            int i17 = i16 | i10;
            if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
                dc dcVar = (dc) objArr[1];
                int i18 = f55279q0;
                int i19 = ((i18 & 126) + (i18 | 126)) - 1;
                f55280r0 = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar}, -1928700375, 1928700378, System.identityHashCode(dcVar));
                int i21 = f55280r0;
                int i22 = ((i21 | 113) << 1) - (((~i21) & 113) | (i21 & (-114)));
                f55279q0 = i22 % 128;
                int i23 = i22 % 2;
                return null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i24 = f55279q0;
            int i25 = (i24 & (-2)) | ((~i24) & 1);
            int i26 = (i24 & 1) << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f55280r0 = i27 % 128;
            int i28 = i27 % 2;
            a(new Object[]{bVar, (dc) obj}, -266561691, 266561691, System.identityHashCode(bVar));
            Unit unit = Unit.INSTANCE;
            int i29 = f55279q0;
            int i30 = ((i29 ^ 58) + ((i29 & 58) << 1)) - 1;
            f55280r0 = i30 % 128;
            if (i30 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, 1987562864, -1987562863, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/dc;", "", "setY", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f55281p0 = new c();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55282q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55283r0 = 1;

        static {
            int i10 = f55282q0;
            int i11 = (i10 ^ 62) + ((i10 & 62) << 1);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            f55283r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public c() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (~i10) | (~i12);
            if (((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) != 1) {
                c cVar = (c) objArr[0];
                Object obj = objArr[1];
                int i14 = f55283r0;
                int i15 = i14 ^ 47;
                int i16 = -(-((i14 & 47) << 1));
                int i17 = (i15 & i16) + (i16 | i15);
                f55282q0 = i17 % 128;
                int i18 = i17 % 2;
                a(new Object[]{cVar, (dc) obj}, 2130141127, -2130141126, System.identityHashCode(cVar));
                Unit unit = Unit.INSTANCE;
                int i19 = f55282q0;
                int i20 = ((((i19 ^ 69) | (i19 & 69)) << 1) - (~(-(((~i19) & 69) | (i19 & (-70)))))) - 1;
                f55283r0 = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            }
            dc dcVar = (dc) objArr[1];
            int i22 = f55283r0;
            int i23 = i22 ^ 21;
            int i24 = -(-((i22 & 21) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            f55282q0 = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(dcVar, "");
            dc.setDividerPadding(new Object[]{dcVar}, -1087540522, 1087540523, System.identityHashCode(dcVar));
            int i27 = f55282q0;
            int i28 = (-2) - (((i27 & 42) + (i27 | 42)) ^ (-1));
            f55283r0 = i28 % 128;
            if (i28 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, -2146835108, 2146835108, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setFitsSystemWindows.values().length];
            iArr[setFitsSystemWindows.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setFitsSystemWindows.setDividerPadding.ordinal()] = 2;
            iArr[setFitsSystemWindows.setX.ordinal()] = 3;
            iArr[setFitsSystemWindows.setCompoundDrawableTintBlendMode.ordinal()] = 4;
            setY = iArr;
            int i10 = (101 << 1) - 101;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        int i10 = f55273a;
        int i11 = (i10 | 57) << 1;
        int i12 = -(((~i10) & 57) | (i10 & (-58)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55274b = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x02a0  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        List listListOf;
        setRotationX setrotationx = (setRotationX) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f55274b;
        int i11 = i10 & 9;
        int i12 = ((i10 ^ 9) | i11) << 1;
        int i13 = -((i10 | 9) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f55273a = i14 % 128;
        if (i14 % 2 != 0) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
            setAnimation setanimation = setAnimation.INSTANCE;
            throw null;
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
        setAnimation setanimation2 = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
        if (getbeeponfailure3 == null) {
            int i15 = f55273a;
            int i16 = ((i15 | 48) << 1) - (i15 ^ 48);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            f55274b = i17 % 128;
            int i18 = i17 % 2;
            return Boolean.FALSE;
        }
        if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 610902136, -610902111, System.identityHashCode(getbeeponfailure3))).booleanValue()) {
            int i19 = f55274b + 97;
            f55273a = i19 % 128;
            if (i19 % 2 != 0) {
                ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -32940825, 32940851, System.identityHashCode(getbeeponfailure3))).booleanValue();
                throw null;
            }
            if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -32940825, 32940851, System.identityHashCode(getbeeponfailure3))).booleanValue()) {
                bd bdVar = new bd(getbeeponfailure3);
                bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
                if (((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar))) == setFitsSystemWindows.setCompoundDrawableTintBlendMode) {
                    int i20 = f55274b;
                    int i21 = ((i20 ^ 99) | (i20 & 99)) << 1;
                    int i22 = -(((~i20) & 99) | (i20 & (-100)));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    f55273a = i23 % 128;
                    int i24 = i23 % 2;
                    return Boolean.FALSE;
                }
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                List<getBeepOnFailure> list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                int i25 = f55274b;
                int i26 = ((i25 | 85) << 1) - (i25 ^ 85);
                f55273a = i26 % 128;
                int i27 = i26 % 2;
                for (getBeepOnFailure getbeeponfailure5 : list) {
                    int i28 = f55274b;
                    int i29 = i28 & 113;
                    int i30 = ((i28 ^ 113) | i29) << 1;
                    int i31 = -((i28 | 113) & (~i29));
                    int i32 = (i30 & i31) + (i31 | i30);
                    f55273a = i32 % 128;
                    int i33 = i32 % 2;
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 865402441, -865402437, System.identityHashCode(getbeeponfailure5));
                    arrayList.add((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)));
                    int i34 = f55274b;
                    int i35 = ((i34 ^ 103) | (i34 & 103)) << 1;
                    int i36 = -(((~i34) & 103) | (i34 & (-104)));
                    int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                    f55273a = i37 % 128;
                    int i38 = i37 % 2;
                }
                List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
                setAnimation setanimation3 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis());
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis());
                List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))});
                if (zBooleanValue) {
                    bd bdVar2 = new bd(getbeeponfailure3);
                    bb bbVar2 = (bb) ((setImageTintList) w.setX(new Object[]{bdVar2}, 1693919772, -1693919769, System.identityHashCode(bdVar2)));
                    if (((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar2}, -1171807076, 1171807076, System.identityHashCode(bbVar2))) != setFitsSystemWindows.setOnFocusChangeListener) {
                        int i39 = f55273a + 39;
                        f55274b = i39 % 128;
                        if (i39 % 2 == 0) {
                            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                            d.listOf((String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)));
                            throw null;
                        }
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis());
                        listListOf = d.listOf((String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)));
                        int i40 = f55273a;
                        int i41 = ((i40 ^ 37) | (i40 & 37)) << 1;
                        int i42 = -(((~i40) & 37) | (i40 & (-38)));
                        int i43 = (i41 & i42) + (i42 | i41);
                        f55274b = i43 % 128;
                        int i44 = i43 % 2;
                    } else {
                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        listListOf = d.listOf((String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)));
                        int i45 = f55274b;
                        int i46 = i45 & 53;
                        int i47 = i46 + ((i45 ^ 53) | i46);
                        f55273a = i47 % 128;
                        int i48 = i47 % 2;
                    }
                } else {
                    TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                    listListOf = d.listOf((String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6)));
                    int i49 = f55274b;
                    int i410 = i49 & 53;
                    int i411 = i410 + ((i49 ^ 53) | i410);
                    f55273a = i411 % 128;
                    int i412 = i411 % 2;
                }
                boolean zContainsAll = list2.containsAll(CollectionsKt___CollectionsKt.plus((Collection) listListOf2, (Iterable) listListOf));
                int i50 = f55274b;
                int i51 = i50 & 119;
                int i52 = -(-((i50 ^ 119) | i51));
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                f55273a = i53 % 128;
                int i54 = i53 % 2;
                return Boolean.valueOf(zContainsAll);
            }
        }
        int i55 = f55274b;
        int i56 = i55 & 115;
        int i57 = (i56 - (~(-(-((i55 ^ 115) | i56))))) - 1;
        f55273a = i57 % 128;
        if (i57 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Pair b(Object[] objArr) {
        dx dxVar = (dx) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        ew ewVar = (ew) objArr[3];
        setRotationX setrotationx = (setRotationX) objArr[4];
        ds dsVar = (ds) objArr[5];
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[6];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ewVar, "");
        Intrinsics.checkNotNullParameter(setrotationx, "");
        Intrinsics.checkNotNullParameter(dsVar, "");
        Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{20020, new TerminalLogger(new getDetailsFieldTextSizeSp[]{getCause.setDividerPadding(dsVar), getCause.setDividerPadding(setfitssystemwindows)}, null, 2, null), 4}, 1336485880, -1336485874, 20020);
        fk fkVar = (fk) setY(new Object[]{dxVar, setscrollbardefaultdelaybeforefade, settextkeepstate, setrotationx, ewVar, dsVar}, -25863307, 25863307, System.identityHashCode(dxVar));
        if (fkVar != null) {
            int i10 = f55273a;
            int i11 = i10 & 109;
            int i12 = ((((i10 ^ 109) | i11) << 1) - (~(-((i10 | 109) & (~i11))))) - 1;
            f55274b = i12 % 128;
            if (i12 % 2 != 0) {
                return (Pair) setY(new Object[]{fkVar}, 1112024657, -1112024650, (int) System.currentTimeMillis());
            }
            throw null;
        }
        cy cyVar = new cy(setscrollbardefaultdelaybeforefade);
        bd bdVar = new bd(setscrollbardefaultdelaybeforefade);
        bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
        int i13 = setCompoundDrawableTintBlendMode.setY[((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar))).ordinal()];
        if (i13 == 1) {
            Pair pair = (Pair) setY(new Object[0], 205948826, -205948821, (int) System.currentTimeMillis());
            int i14 = f55274b;
            int i15 = i14 ^ 39;
            int i16 = ((i14 & 39) | i15) << 1;
            int i17 = -i15;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            f55273a = i18 % 128;
            int i19 = i18 % 2;
            return pair;
        }
        if (i13 == 2) {
            Pair pair2 = (Pair) setY(new Object[0], 205948826, -205948821, (int) System.currentTimeMillis());
            int i20 = f55273a;
            int i21 = ((i20 & 66) + (i20 | 66)) - 1;
            f55274b = i21 % 128;
            if (i21 % 2 != 0) {
                return pair2;
            }
            throw null;
        }
        if (i13 != 3) {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair3 = (Pair) setY(new Object[]{ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade, settextkeepstate)}, 1112024657, -1112024650, (int) System.currentTimeMillis());
            int i22 = f55274b + 69;
            f55273a = i22 % 128;
            int i23 = i22 % 2;
            return pair3;
        }
        if (((Boolean) setY(new Object[]{dsVar, setscrollbardefaultdelaybeforefade}, 160052460, -160052454, (int) System.currentTimeMillis())).booleanValue()) {
            du duVar = du.INSTANCE;
            boolean zBooleanValue = ((Boolean) du.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, (byte[]) du.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, setrotationx}, 895823171, -895823170, (int) System.currentTimeMillis())}, -597819605, 597819611, (int) System.currentTimeMillis())).booleanValue();
            cy cyVar2 = new cy(setscrollbardefaultdelaybeforefade);
            if (!zBooleanValue) {
                cz czVar = new cz(setscrollbardefaultdelaybeforefade);
                Pair pair4 = (Pair) setY(new Object[0], 205948826, -205948821, (int) System.currentTimeMillis());
                int i24 = f55274b;
                int i25 = ((i24 & (-74)) | ((~i24) & 73)) + ((i24 & 73) << 1);
                f55273a = i25 % 128;
                if (i25 % 2 == 0) {
                    return pair4;
                }
                throw null;
            }
        }
        if (setfitssystemwindows == setFitsSystemWindows.setX) {
            Pair pair5 = (Pair) setY(new Object[0], 1847182979, -1847182977, (int) System.currentTimeMillis());
            int i26 = f55274b;
            int i27 = ((i26 | 39) << 1) - (i26 ^ 39);
            f55273a = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 91 / 0;
            }
            return pair5;
        }
        int i29 = f55274b;
        int i30 = i29 & 103;
        int i31 = (i29 ^ 103) | i30;
        int i32 = (i30 & i31) + (i31 | i30);
        f55273a = i32 % 128;
        int i33 = i32 % 2;
        Pair pair6 = (Pair) setY(new Object[0], 205948826, -205948821, (int) System.currentTimeMillis());
        int i34 = f55274b + 41;
        f55273a = i34 % 128;
        int i35 = i34 % 2;
        return pair6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:13:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:16:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:17:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:19:0x0117  */
    /* JADX WARN: Code duplicated, block: B:21:0x0131  */
    /* JADX WARN: Code duplicated, block: B:23:0x0148  */
    /* JADX WARN: Code duplicated, block: B:36:0x0202  */
    /* JADX WARN: Code duplicated, block: B:38:0x0213  */
    /* JADX WARN: Code duplicated, block: B:39:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x084d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0877  */
    /* JADX WARN: Code duplicated, block: B:99:0x088b  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        Object objValueOf;
        int i14;
        fk dividerPadding;
        int i15;
        int i16;
        int i17;
        fk y7;
        int i18 = ~i10;
        int i19 = (i18 * 677) + (i11 * (-676)) + (i10 * 678);
        int i20 = ~i11;
        boolean z10 = false;
        switch (((~(i10 | i20)) * 677) + ((i18 | i20) * (-677)) + i19) {
            case 1:
                return b(objArr);
            case 2:
                Pair pair = new Pair(null, Boolean.TRUE);
                int i21 = f55273a;
                int i22 = (((i21 & (-14)) | ((~i21) & 13)) - (~((i21 & 13) << 1))) - 1;
                f55274b = i22 % 128;
                if (i22 % 2 != 0) {
                    return pair;
                }
                int i23 = 46 / 0;
                return pair;
            case 3:
                return a(objArr);
            case 4:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                setRotationX setrotationx = (setRotationX) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i24 = f55274b;
                int i25 = (i24 & (-22)) | (21 & (~i24));
                int i26 = -(-((i24 & 21) << 1));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f55273a = i27 % 128;
                int i28 = i27 % 2;
                if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length == 0) {
                    int i29 = f55274b;
                    int i30 = (i29 ^ 53) + ((i29 & 53) << 1);
                    f55273a = i30 % 128;
                    int i31 = i30 % 2;
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    int i32 = f55274b;
                    int i33 = ((i32 | 41) << 1) - (i32 ^ 41);
                    int i34 = i33 % 128;
                    f55273a = i34;
                    int i35 = i33 % 2;
                    int i36 = (((i34 | 3) << 1) - (~(-(((~i34) & 3) | (i34 & (-4)))))) - 1;
                    f55274b = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    int i38 = f55273a;
                    int i39 = i38 & 117;
                    int i40 = (((i38 | 117) & (~i39)) - (~(-(-(i39 << 1))))) - 1;
                    f55274b = i40 % 128;
                    int i41 = i40 % 2;
                    getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                        int iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
                        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                        if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 610902136, -610902111, System.identityHashCode(getbeeponfailure3))).booleanValue()) {
                            int i42 = f55273a;
                            int i43 = ((i42 | 62) << 1) - (i42 ^ 62);
                            int i44 = (i43 ^ (-1)) + (i43 << 1);
                            f55274b = i44 % 128;
                            int i45 = i44 % 2;
                            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                            if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -32940825, 32940851, System.identityHashCode(getbeeponfailure4))).booleanValue()) {
                                int i46 = f55273a;
                                int i47 = (((i46 | 90) << 1) - (i46 ^ 90)) - 1;
                                f55274b = i47 % 128;
                                if (i47 % 2 != 0 ? iIntValue >= 11 : iIntValue >= 43) {
                                    int i48 = (i46 & (-38)) | (37 & (~i46));
                                    int i49 = -(-((i46 & 37) << 1));
                                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                                    f55274b = i50 % 128;
                                    if (i50 % 2 != 0 ? iIntValue <= 43 : iIntValue <= 127) {
                                        getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 252497730, -252497710, System.identityHashCode(getbeeponfailure5));
                                        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis());
                                        String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
                                        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, kotlin.ranges.c.until(0, 1));
                                        Boolean bool = Boolean.FALSE;
                                        getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str2, bArrSliceArray, null, bool, 28}, -976227287, 976227290, 28);
                                        bd bdVar = new bd(getbeeponfailure6);
                                        bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
                                        if (!(!zBooleanValue)) {
                                            int i51 = f55273a;
                                            int i52 = (i51 & 5) + (i51 | 5);
                                            f55274b = i52 % 128;
                                            int i53 = i52 % 2;
                                            if (((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar))) != setFitsSystemWindows.setOnFocusChangeListener) {
                                                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                                SouthPacificEndpoint.setX(new Object[]{20022, new TerminalLogger(new getDetailsFieldTextSizeSp[]{(getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), getCause.setDividerPadding(bbVar.setLayoutAnimation())}, null, 2, null), 4}, 1336485880, -1336485874, 20022);
                                                int i54 = f55274b;
                                                int i55 = (i54 | 61) << 1;
                                                int i56 = -(i54 ^ 61);
                                                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                                                f55273a = i57 % 128;
                                                int i58 = i57 % 2;
                                                return bool;
                                            }
                                        }
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure6}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis());
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), ArraysKt___ArraysKt.sliceArray(bArr, kotlin.ranges.c.until(1, 3)), null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)), ArraysKt___ArraysKt.sliceArray(bArr, kotlin.ranges.c.until(3, 11)), null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                        if (bArr.length > 11) {
                                            int i59 = f55273a;
                                            int i60 = (-2) - ((((i59 | 106) << 1) - (i59 ^ 106)) ^ (-1));
                                            f55274b = i60 % 128;
                                            if (i60 % 2 == 0) {
                                                TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis());
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)), ArraysKt___ArraysKt.sliceArray(bArr, kotlin.ranges.c.until(4, bArr.length)), null, bool, 15}, -976227287, 976227290, 15)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                            } else {
                                                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis());
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6)), ArraysKt___ArraysKt.sliceArray(bArr, kotlin.ranges.c.until(11, bArr.length)), null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                            }
                                        }
                                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                                        int i61 = ~iCurrentTimeMillis;
                                        int i62 = (-1083179681) ^ i61;
                                        int i63 = i61 & (-1083179681);
                                        int i64 = ~((i63 & i62) | (i62 ^ i63));
                                        int i65 = ((-708870173) & iCurrentTimeMillis) | ((-708870173) ^ iCurrentTimeMillis);
                                        int i66 = ~i65;
                                        int i67 = (i65 | i66) & i66;
                                        int i68 = ((~i67) & i64) | ((~i64) & i67);
                                        int i69 = i64 & i67;
                                        int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * (-272)));
                                        int i71 = (-2025131597) & i70;
                                        int i72 = -(-((i70 ^ (-2025131597)) | i71));
                                        int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                                        int i74 = 977844572 & iCurrentTimeMillis;
                                        int i75 = (977844572 | iCurrentTimeMillis) & (~i74);
                                        int i76 = ~((i75 & i74) | (i75 ^ i74));
                                        int i77 = (-2061024253) ^ i76;
                                        int i78 = i76 & (-2061024253);
                                        int i79 = (((i78 & i77) | (i77 ^ i78)) * (-272)) + i73;
                                        int i80 = (-977844573) & iCurrentTimeMillis;
                                        int i81 = ~(((iCurrentTimeMillis | (-977844573)) & (~i80)) | i80);
                                        int i82 = ((~i81) & 1352154080) | ((-1352154081) & i81);
                                        int i83 = i81 & 1352154080;
                                        int i84 = ((i83 & i82) | (i82 ^ i83)) * 272;
                                        int i85 = i79 & i84;
                                        int i86 = ((i79 ^ i84) | i85) << 1;
                                        int i87 = -((i84 | i79) & (~i85));
                                        int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                                        int i89 = ~iCurrentTimeMillis2;
                                        int i90 = (-1724019935) & i89;
                                        int i91 = (i89 | (-1724019935)) & (~i90);
                                        int i92 = (i91 & i90) | (i91 ^ i90);
                                        int i93 = i92 & 1696579396;
                                        int i94 = (i92 | 1696579396) & (~i93);
                                        int i95 = -(-((~((i94 & i93) | (i94 ^ i93))) * 130));
                                        int i96 = (-1602065322) & i95;
                                        int i97 = (i95 ^ (-1602065322)) | i96;
                                        int i98 = (i96 & i97) + (i97 | i96);
                                        int i99 = i98 & 884892568;
                                        int i100 = (884892568 ^ i98) | i99;
                                        int i101 = (i99 & i100) + (i100 | i99);
                                        int i102 = ~((iCurrentTimeMillis2 & (-46153883)) | ((-46153883) ^ iCurrentTimeMillis2));
                                        int i103 = 18713344 & i102;
                                        int i104 = (i102 | 18713344) & (~i103);
                                        int i105 = ((i104 & i103) | (i104 ^ i103)) * 130;
                                        int i106 = i101 & i105;
                                        int i107 = (i105 | i101) & (~i106);
                                        int i108 = i106 << 1;
                                        if (i88 <= ((i107 | i108) << 1) - (i107 ^ i108)) {
                                            throw null;
                                        }
                                        objValueOf = Boolean.TRUE;
                                    }
                                }
                            }
                        }
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20021, (getDetailsFieldTextSizeSp) getCancelButtonIconDrawableId.setY(new Object[]{Integer.valueOf(iIntValue)}, -2102169182, 2102169182, iIntValue), 4}, 1336485880, -1336485874, 20021);
                        int i109 = f55273a;
                        int i110 = i109 & 33;
                        int i111 = (i109 | 33) & (~i110);
                        int i112 = -(-(i110 << 1));
                        int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                        f55274b = i113 % 128;
                        if (i113 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                        if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7)))) {
                            int i114 = f55274b + 55;
                            f55273a = i114 % 128;
                            if (i114 % 2 != 0) {
                                int i115 = 3 / 0;
                                if (!((Boolean) setY(new Object[]{setrotationx, Boolean.valueOf(zBooleanValue)}, -192095243, 192095246, (int) System.currentTimeMillis())).booleanValue()) {
                                    int i116 = f55273a;
                                    int i117 = i116 & 1;
                                    i13 = (((i116 | 1) & (~i117)) - (~(-(-(i117 << 1))))) - 1;
                                    f55274b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                                        SouthPacificEndpoint.setX(new Object[]{24030, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 24030);
                                        z10 = true;
                                    } else {
                                        SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                                        SouthPacificEndpoint.setX(new Object[]{20023, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20023);
                                    }
                                    objValueOf = Boolean.valueOf(z10);
                                } else {
                                    boolean dividerPadding2 = setscrollbardefaultdelaybeforefade.setDividerPadding((getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx)), TerminalCreationFailure.setLayoutAnimation);
                                    int i118 = f55274b;
                                    int i119 = i118 ^ 81;
                                    int i120 = (i118 & 81) << 1;
                                    int i121 = (i119 & i120) + (i120 | i119);
                                    f55273a = i121 % 128;
                                    int i122 = i121 % 2;
                                    objValueOf = Boolean.valueOf(dividerPadding2);
                                }
                            } else if (!((Boolean) setY(new Object[]{setrotationx, Boolean.valueOf(zBooleanValue)}, -192095243, 192095246, (int) System.currentTimeMillis())).booleanValue()) {
                                int i1110 = f55273a;
                                int i1111 = i1110 & 1;
                                i13 = (((i1110 | 1) & (~i1111)) - (~(-(-(i1111 << 1))))) - 1;
                                f55274b = i13 % 128;
                                if (i13 % 2 == 0) {
                                    SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                                    SouthPacificEndpoint.setX(new Object[]{24030, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 24030);
                                    z10 = true;
                                } else {
                                    SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                                    SouthPacificEndpoint.setX(new Object[]{20023, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20023);
                                }
                                objValueOf = Boolean.valueOf(z10);
                            } else {
                                boolean dividerPadding3 = setscrollbardefaultdelaybeforefade.setDividerPadding((getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx)), TerminalCreationFailure.setLayoutAnimation);
                                int i1112 = f55274b;
                                int i1113 = i1112 ^ 81;
                                int i123 = (i1112 & 81) << 1;
                                int i124 = (i1113 & i123) + (i123 | i1113);
                                f55273a = i124 % 128;
                                int i125 = i124 % 2;
                                objValueOf = Boolean.valueOf(dividerPadding3);
                            }
                        } else {
                            int i126 = f55274b;
                            int i127 = i126 & 101;
                            int i128 = -(-((i126 ^ 101) | i127));
                            int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                            f55273a = i129 % 128;
                            int i130 = i129 % 2;
                        }
                    }
                }
                objValueOf = Boolean.FALSE;
                break;
            case 5:
                objValueOf = new Pair(null, Boolean.FALSE);
                int i131 = f55273a;
                int i132 = i131 ^ 13;
                int i133 = (((i131 & 13) | i132) << 1) - i132;
                f55274b = i133 % 128;
                if (i133 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                ds dsVar = (ds) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                cz czVar = new cz(setscrollbardefaultdelaybeforefade2);
                cv cvVar = (cv) ((setImageTintList) w.setX(new Object[]{czVar}, 1693919772, -1693919769, System.identityHashCode(czVar)));
                boolean zBooleanValue2 = ((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 1554941971, -1554941959, System.identityHashCode(cvVar))).booleanValue();
                if (dsVar == ds.setY) {
                    int i134 = f55274b;
                    int i135 = (i134 & (-18)) | ((~i134) & 17);
                    int i136 = (i134 & 17) << 1;
                    int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                    f55273a = i137 % 128;
                    int i138 = i137 % 2;
                    if (setscrollbardefaultdelaybeforefade2.setDividerPadding() != Terminal.KERNEL_4) {
                        int i139 = f55274b;
                        int i140 = i139 & 83;
                        int i141 = -(-(i139 | 83));
                        int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                        f55273a = i142 % 128;
                        if (i142 % 2 != 0) {
                            throw null;
                        }
                        if (zBooleanValue2) {
                            int i143 = f55273a;
                            int i144 = i143 & 99;
                            i14 = ((i143 | 99) & (~i144)) + (i144 << 1);
                            f55274b = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                            objValueOf = Boolean.FALSE;
                            break;
                        }
                    }
                    int i145 = f55274b;
                    int i146 = i145 & 41;
                    int i147 = (((i145 ^ 41) | i146) << 1) - ((i145 | 41) & (~i146));
                    f55273a = i147 % 128;
                    int i148 = i147 % 2;
                    objValueOf = Boolean.TRUE;
                } else {
                    int i149 = f55273a;
                    int i1410 = i149 & 99;
                    i14 = ((i149 | 99) & (~i1410)) + (i1410 << 1);
                    f55274b = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 7:
                Pair pair2 = new Pair((fk) objArr[0], Boolean.FALSE);
                int i150 = f55273a;
                int i151 = ((i150 & 40) + (i150 | 40)) - 1;
                f55274b = i151 % 128;
                int i152 = i151 % 2;
                return pair2;
            default:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                setRotationX setrotationx2 = (setRotationX) objArr[3];
                ew ewVar = (ew) objArr[4];
                ds dsVar2 = (ds) objArr[5];
                int i153 = f55274b;
                int i154 = (i153 ^ 99) + ((i153 & 99) << 1);
                f55273a = i154 % 128;
                if (i154 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade3, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    Intrinsics.checkNotNullParameter(setrotationx2, "");
                    Intrinsics.checkNotNullParameter(ewVar, "");
                    Intrinsics.checkNotNullParameter(dsVar2, "");
                    int i155 = 3 / 0;
                    if (!((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                        int i156 = f55274b;
                        int i157 = i156 & 123;
                        int i158 = -(-(i156 | 123));
                        i17 = ((i157 | i158) << 1) - (i158 ^ i157);
                        f55273a = i17 % 128;
                        if (i17 % 2 != 0) {
                            y7 = ewVar.setY(setscrollbardefaultdelaybeforefade3, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2)));
                            int i159 = 50 / 0;
                        } else {
                            y7 = ewVar.setY(setscrollbardefaultdelaybeforefade3, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2)));
                        }
                        dividerPadding = y7;
                        i15 = f55274b + 71;
                        f55273a = i15 % 128;
                    } else {
                        if (((Boolean) setY(new Object[]{setscrollbardefaultdelaybeforefade3, setrotationx2, Boolean.valueOf(((Boolean) setY(new Object[]{dsVar2, setscrollbardefaultdelaybeforefade3}, 160052460, -160052454, (int) System.currentTimeMillis())).booleanValue())}, 72247900, -72247896, (int) System.currentTimeMillis())).booleanValue()) {
                            int i160 = f55273a;
                            int i161 = i160 ^ 51;
                            int i162 = ((i160 & 51) | i161) << 1;
                            int i163 = -i161;
                            i16 = (i162 ^ i163) + ((i162 & i163) << 1);
                            f55274b = i16 % 128;
                            if (i16 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i164 = (-2) - ((f55273a + 98) ^ (-1));
                        f55274b = i164 % 128;
                        int i165 = i164 % 2;
                        dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade3, settextkeepstate);
                        i15 = f55273a + 1;
                        f55274b = i15 % 128;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade3, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    Intrinsics.checkNotNullParameter(setrotationx2, "");
                    Intrinsics.checkNotNullParameter(ewVar, "");
                    Intrinsics.checkNotNullParameter(dsVar2, "");
                    if (!((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                        int i1510 = f55274b;
                        int i1511 = i1510 & 123;
                        int i1512 = -(-(i1510 | 123));
                        i17 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                        f55273a = i17 % 128;
                        if (i17 % 2 != 0) {
                            y7 = ewVar.setY(setscrollbardefaultdelaybeforefade3, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2)));
                            int i1513 = 50 / 0;
                        } else {
                            y7 = ewVar.setY(setscrollbardefaultdelaybeforefade3, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2)));
                        }
                        dividerPadding = y7;
                        i15 = f55274b + 71;
                        f55273a = i15 % 128;
                    } else {
                        if (((Boolean) setY(new Object[]{setscrollbardefaultdelaybeforefade3, setrotationx2, Boolean.valueOf(((Boolean) setY(new Object[]{dsVar2, setscrollbardefaultdelaybeforefade3}, 160052460, -160052454, (int) System.currentTimeMillis())).booleanValue())}, 72247900, -72247896, (int) System.currentTimeMillis())).booleanValue()) {
                            int i166 = f55273a;
                            int i167 = i166 ^ 51;
                            int i168 = ((i166 & 51) | i167) << 1;
                            int i169 = -i167;
                            i16 = (i168 ^ i169) + ((i168 & i169) << 1);
                            f55274b = i16 % 128;
                            if (i16 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i1610 = (-2) - ((f55273a + 98) ^ (-1));
                        f55274b = i1610 % 128;
                        int i1611 = i1610 % 2;
                        dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade3, settextkeepstate);
                        i15 = f55273a + 1;
                        f55274b = i15 % 128;
                    }
                }
                int i170 = i15 % 2;
                return dividerPadding;
        }
        return objValueOf;
    }

    @Nullable
    public final <T extends setScrollBarDefaultDelayBeforeFade> fk setCompoundDrawableTintBlendMode(@NotNull T p4, @NotNull setTextKeepState p10, @NotNull setRotationX p11, @NotNull ew<T> p12, @NotNull ds p13) {
        return (fk) setY(new Object[]{this, p4, p10, p11, p12, p13}, -25863307, 25863307, System.identityHashCode(this));
    }

    @NotNull
    public final <T extends setScrollBarDefaultDelayBeforeFade> Pair<fk, Boolean> setOnFocusChangeListener(@NotNull T p4, @NotNull setTextKeepState p10, @NotNull ew<T> p11, @NotNull setRotationX p12, @NotNull ds p13, @NotNull setFitsSystemWindows p14) {
        return (Pair) setY(new Object[]{this, p4, p10, p11, p12, p13, p14}, 2109200881, -2109200880, System.identityHashCode(this));
    }
}
