package com.mypinpad.tsdk.isolation;

import bk.d;
import bk.i;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import dk.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ev;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "setY", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Lcom/mypinpad/tsdk/i/setMaxWidth;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class ev {

    @NotNull
    public static final ev INSTANCE = new ev();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f55421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55422j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55423k = 1;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionFailed;", "p0", "", "setY", "(Lcom/mypinpad/tsdk/i/TransactionFailed;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<TransactionFailed, Comparable<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55424p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55425q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55426r0 = 1;

        static {
            int i10 = f55425q0;
            int i11 = i10 & 115;
            int i12 = i11 + ((i10 ^ 115) | i11);
            f55426r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Comparable a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = (~((~i11) | i13)) | i12;
            int i15 = ~(i10 | i11);
            if (((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375)) != 1) {
                TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
                int i16 = f55425q0;
                int i17 = i16 & 19;
                int i18 = i16 | 19;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                f55426r0 = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed, "");
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                int i21 = f55425q0 + 71;
                f55426r0 = i21 % 128;
                if (i21 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i22 = f55426r0;
            int i23 = i22 ^ 79;
            int i24 = ((i22 & 79) | i23) << 1;
            int i25 = -i23;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f55425q0 = i26 % 128;
            TransactionFailed transactionFailed2 = (TransactionFailed) obj;
            Object[] objArr2 = new Object[2];
            if (i26 % 2 == 0) {
                objArr2[0] = aVar;
                objArr2[1] = transactionFailed2;
                return a(objArr2, 373343053, -373343053, System.identityHashCode(aVar));
            }
            objArr2[0] = aVar;
            objArr2[1] = transactionFailed2;
            Comparable comparableA = a(objArr2, 373343053, -373343053, System.identityHashCode(aVar));
            int i27 = 94 / 0;
            return comparableA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Comparable<?> invoke(TransactionFailed transactionFailed) {
            return a(new Object[]{this, transactionFailed}, 1906869790, -1906869789, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionFailed;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/TransactionFailed;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<TransactionFailed, Comparable<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f55427p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55428q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55429r0 = 1;

        static {
            int i10 = f55428q0;
            int i11 = ((i10 & (-98)) | ((~i10) & 97)) + ((i10 & 97) << 1);
            f55429r0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Comparable a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            if (((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70) != 1) {
                TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
                int i15 = f55429r0;
                int i16 = (((i15 ^ 83) | (i15 & 83)) << 1) - (((~i15) & 83) | (i15 & (-84)));
                f55428q0 = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed, "");
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                int i18 = f55428q0;
                int i19 = (i18 & 51) + (i18 | 51);
                f55429r0 = i19 % 128;
                int i20 = i19 % 2;
                return str;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i21 = f55428q0 + 13;
            f55429r0 = i21 % 128;
            TransactionFailed transactionFailed2 = (TransactionFailed) obj;
            if (i21 % 2 == 0) {
                a(new Object[]{bVar, transactionFailed2}, 1505066088, -1505066088, System.identityHashCode(bVar));
                throw null;
            }
            Comparable comparableA = a(new Object[]{bVar, transactionFailed2}, 1505066088, -1505066088, System.identityHashCode(bVar));
            int i22 = f55429r0;
            int i23 = (i22 & (-26)) | ((~i22) & 25);
            int i24 = -(-((i22 & 25) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f55428q0 = i25 % 128;
            if (i25 % 2 == 0) {
                return comparableA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Comparable<?> invoke(TransactionFailed transactionFailed) {
            return a(new Object[]{this, transactionFailed}, 1085681341, -1085681340, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_2.ordinal()] = 1;
            iArr[Terminal.KERNEL_3.ordinal()] = 2;
            iArr[Terminal.KERNEL_4.ordinal()] = 3;
            iArr[Terminal.KERNEL_6.ordinal()] = 4;
            iArr[Terminal.KERNEL_13.ordinal()] = 5;
            iArr[Terminal.KERNEL_INTERAC.ordinal()] = 6;
            iArr[Terminal.KERNEL_EFTPOS.ordinal()] = 7;
            iArr[Terminal.OTHER.ordinal()] = 8;
            setOnFocusChangeListener = iArr;
            int i10 = 95 << 1;
            int i11 = -95;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            int i13 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        f55413a = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], -1540796460, 1540796546, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55414b = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 612496157, -612495993, (int) System.currentTimeMillis()), setAnimation.setSubtitle(), (TransactionFailed) setAnimation.setY(new Object[0], 329514556, -329514499, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1597142170, 1597142255, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55415c = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], -1540796460, 1540796546, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.junkify(), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setImportantForContentCapture(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55416d = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), setAnimation.setTransitionName(), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55417e = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55418f = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], -1540796460, 1540796546, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1539173878, 1539174052, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.junkify(), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setImportantForContentCapture(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55419g = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1747217893, -1747217749, (int) System.currentTimeMillis())});
        f55420h = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), setAnimation.setOnCapturedPointerListener(), setAnimation.TransactionErrorCause(), setAnimation.setPersistentDrawingCache(), (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())});
        f55421i = d.listOf(setAnimation.junkify());
        int i10 = f55423k;
        int i11 = (((i10 ^ 43) | (i10 & 43)) << 1) - (((~i10) & 43) | (i10 & (-44)));
        f55422j = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0261  */
    /* JADX WARN: Code duplicated, block: B:40:0x026f A[PHI: r5
      0x026f: PHI (r5v34 com.mypinpad.tsdk.i.getBeepOnFailure) = (r5v18 com.mypinpad.tsdk.i.getBeepOnFailure), (r5v37 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:38:0x025f, B:35:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure navigationOnClickListener;
        List<TransactionFailed> list;
        int i13;
        int i14 = ~((~i10) | i11);
        int i15 = ~i12;
        int i16 = (((~(i15 | i11)) | i14) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i17 = ~i11;
        int i18 = (~(i12 | i17)) | i14;
        int i19 = ~(i15 | i10);
        if ((((~(i10 | i17)) | (~(i17 | i15)) | i19) * 594) + ((i18 | i19) * 594) + i16 == 1) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setMaxWidth setmaxwidth = new setMaxWidth();
            SortedSet sortedSet = i.toSortedSet(CollectionsKt___CollectionsKt.union((List) setY(new Object[]{setscrollbardefaultdelaybeforefade.setDividerPadding()}, 1663524091, -1663524091, (int) System.currentTimeMillis()), f55421i), e.compareBy(a.f55424p0, b.f55427p0));
            ArrayList arrayList = new ArrayList();
            Iterator it = sortedSet.iterator();
            int i20 = f55423k;
            int i21 = ((i20 | 111) << 1) - (i20 ^ 111);
            f55422j = i21 % 128;
            int i22 = i21 % 2;
            while (!(!it.hasNext())) {
                int i23 = f55422j;
                int i24 = ((((i23 ^ 13) | (i23 & 13)) << 1) - (~(-(((~i23) & 13) | (i23 & (-14)))))) - 1;
                f55423k = i24 % 128;
                if (i24 % 2 == 0) {
                    TransactionFailed transactionFailed = (TransactionFailed) it.next();
                    Intrinsics.checkNotNullExpressionValue(transactionFailed, "");
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, transactionFailed}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    int i25 = 25 / 0;
                    if (getbeeponfailure == null) {
                        int i26 = f55422j;
                        int i27 = (i26 & 69) + (i26 | 69);
                        f55423k = i27 % 128;
                        int i28 = i27 % 2;
                        navigationOnClickListener = null;
                    } else {
                        navigationOnClickListener = getbeeponfailure.setNavigationOnClickListener();
                        int i29 = f55422j;
                        int i30 = i29 & 61;
                        int i31 = (i29 ^ 61) | i30;
                        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                        f55423k = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else {
                    TransactionFailed transactionFailed2 = (TransactionFailed) it.next();
                    Intrinsics.checkNotNullExpressionValue(transactionFailed2, "");
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, transactionFailed2}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (getbeeponfailure == null) {
                        int i210 = f55422j;
                        int i211 = (i210 & 69) + (i210 | 69);
                        f55423k = i211 % 128;
                        int i212 = i211 % 2;
                        navigationOnClickListener = null;
                    } else {
                        navigationOnClickListener = getbeeponfailure.setNavigationOnClickListener();
                        int i213 = f55422j;
                        int i34 = i213 & 61;
                        int i35 = (i213 ^ 61) | i34;
                        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                        f55423k = i36 % 128;
                        int i37 = i36 % 2;
                    }
                }
                if (navigationOnClickListener != null) {
                    int i38 = f55422j;
                    int i39 = ((i38 & (-56)) | ((~i38) & 55)) + ((i38 & 55) << 1);
                    f55423k = i39 % 128;
                    int i40 = i39 % 2;
                    arrayList.add(navigationOnClickListener);
                    int i41 = f55423k;
                    int i42 = i41 & 69;
                    int i43 = ((i41 | 69) & (~i42)) + (i42 << 1);
                    f55422j = i43 % 128;
                    int i44 = i43 % 2;
                } else {
                    int i45 = f55422j;
                    int i46 = i45 & 49;
                    int i47 = ((i45 | 49) & (~i46)) + (i46 << 1);
                    f55423k = i47 % 128;
                    int i48 = i47 % 2;
                }
            }
            setmaxwidth.addAll(arrayList);
            int i49 = f55423k;
            int i50 = (i49 & 89) + (i49 | 89);
            f55422j = i50 % 128;
            if (i50 % 2 == 0) {
                return setmaxwidth;
            }
            throw null;
        }
        Terminal terminal = (Terminal) objArr[0];
        int i51 = f55422j;
        int i52 = ((i51 ^ 38) + ((i51 & 38) << 1)) - 1;
        f55423k = i52 % 128;
        int i53 = i52 % 2;
        switch (setX.setOnFocusChangeListener[terminal.ordinal()]) {
            case 1:
                int i54 = f55423k;
                int i55 = i54 & 109;
                int i56 = -(-((i54 ^ 109) | i55));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f55422j = i57 % 128;
                int i58 = i57 % 2;
                return f55413a;
            case 2:
                int i59 = f55422j;
                int i60 = i59 & 19;
                int i61 = i60 + ((i59 ^ 19) | i60);
                f55423k = i61 % 128;
                int i62 = i61 % 2;
                return f55414b;
            case 3:
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i63 = -(-((~(1607323253 | iCurrentTimeMillis)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i64 = (-89711518) & i63;
                int i65 = (i64 - (~(-(-((i63 ^ (-89711518)) | i64))))) - (-1500426094);
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                int i67 = ~iCurrentTimeMillis;
                int i68 = 499402337 & i67;
                int i69 = ((i67 | 499402337) & (~i68)) | i68;
                int i70 = ~((i69 & 1263111253) | (i69 ^ 1263111253));
                int i71 = 155190337 ^ i70;
                int i72 = i70 & 155190337;
                int i73 = -(-(((i72 & i71) | (i71 ^ i72)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i74 = (i66 & i73) + (i73 | i66);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i75 = ~iCurrentTimeMillis2;
                int i76 = (i75 & 674764930) | ((-674764931) & i75) | ((~i75) & 674764930);
                int i77 = ((-1468006950) & i76) | ((~i76) & 1468006949);
                int i78 = i76 & 1468006949;
                int i79 = -(-(((i78 & i77) | (i77 ^ i78)) * 1444));
                int i80 = ((696846052 | i79) << 1) - (i79 ^ 696846052);
                int i81 = 675077578 & iCurrentTimeMillis2;
                int i82 = ~(((675077578 | iCurrentTimeMillis2) & (~i81)) | i81);
                int i83 = 1468006949 & i82;
                int i84 = (i82 | 1468006949) & (~i83);
                int i85 = (i84 & i83) | (i84 ^ i83);
                int i86 = (iCurrentTimeMillis2 & (-1468319598)) | ((-1468319598) ^ iCurrentTimeMillis2);
                int i87 = ~i86;
                int i88 = (i86 | i87) & i87;
                int i89 = i85 ^ i88;
                int i90 = i88 & i85;
                int i91 = -(-(((i90 & i89) | (i89 ^ i90)) * (-1444)));
                int i92 = i80 & i91;
                int i93 = (i92 - (~((i91 ^ i80) | i92))) - 1;
                int i94 = i93 & (-893070800);
                int i95 = ((i93 ^ (-893070800)) | i94) << 1;
                int i96 = -(((-893070800) | i93) & (~i94));
                if (i74 > ((i95 | i96) << 1) - (i96 ^ i95)) {
                    return f55415c;
                }
                throw null;
            case 4:
                int i97 = f55423k;
                int i98 = (i97 & 123) + (i97 | 123);
                f55422j = i98 % 128;
                int i99 = i98 % 2;
                return f55416d;
            case 5:
                int i100 = f55423k;
                int i101 = i100 & 97;
                int i102 = ((i100 | 97) & (~i101)) + (i101 << 1);
                f55422j = i102 % 128;
                if (i102 % 2 == 0) {
                    return f55417e;
                }
                throw null;
            case 6:
                int i103 = f55423k;
                int i104 = i103 & 59;
                int i105 = i104 + ((i103 ^ 59) | i104);
                f55422j = i105 % 128;
                int i106 = i105 % 2;
                list = f55418f;
                if (i106 == 0) {
                    return list;
                }
                i13 = 95;
                break;
                break;
            case 7:
                int i107 = f55423k;
                int i108 = ((i107 ^ 82) + ((i107 & 82) << 1)) - 1;
                f55422j = i108 % 128;
                int i109 = i108 % 2;
                list = f55419g;
                if (i109 == 0) {
                    return list;
                }
                i13 = 42;
                break;
                break;
            case 8:
                int i110 = f55422j;
                int i111 = ((i110 & 86) + (i110 | 86)) - 1;
                f55423k = i111 % 128;
                int i112 = i111 % 2;
                list = f55420h;
                if (i112 != 0) {
                    return list;
                }
                i13 = 58;
                break;
                break;
            default:
                throw new setIndeterminateDrawable(3030, String.valueOf((int) terminal.setY()), null, 4, null);
        }
        int i113 = i13 / 0;
        return list;
    }

    @NotNull
    public static setMaxWidth setY(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return (setMaxWidth) setY(new Object[]{p4}, -508339596, 508339597, (int) System.currentTimeMillis());
    }
}
