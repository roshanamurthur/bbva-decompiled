package com.mypinpad.tsdk.isolation;

import androidx.compose.animation.core.AnimationKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0003\t\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\t\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/zd;", "", "Lcom/mypinpad/tsdk/i/ze;", "p0", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/ze;)V", "Lcom/mypinpad/tsdk/i/zb;", "()Lcom/mypinpad/tsdk/i/zb;", "setY", "()Lcom/mypinpad/tsdk/i/ze;", "Lcom/mypinpad/tsdk/i/zd$setY;", "a", "Lcom/mypinpad/tsdk/i/zd$setY;", "setX", "()Lcom/mypinpad/tsdk/i/zd$setY;", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class zd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Logger f62307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f62308i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f62309j = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final zd setY = new zd(new setX(yt.setX(Intrinsics.stringPlus(yt.setOnDragListener, " TaskRunner"), true)));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setY setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f62314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f62315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintBlendMode f62316g;

    public final class setCompoundDrawableTintBlendMode implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ zd f62317p0;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            zb zbVar;
            long compoundDrawableTintBlendMode;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            while (true) {
                zd zdVar = setcompounddrawabletintblendmode.f62317p0;
                synchronized (zdVar) {
                    zbVar = (zb) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1371855915, 1371855918, System.identityHashCode(zdVar));
                }
                if (zbVar == null) {
                    return null;
                }
                ze zeVar = (ze) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar}, -216783788, 216783793, System.identityHashCode(zbVar));
                Intrinsics.checkNotNull(zeVar);
                zd zdVar2 = setcompounddrawabletintblendmode.f62317p0;
                boolean zIsLoggable = ((Logger) Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE);
                if (zIsLoggable) {
                    zd zdVar3 = (zd) ze.setY(new Object[]{zeVar}, -193710573, 193710580, System.identityHashCode(zeVar));
                    compoundDrawableTintBlendMode = ((setY) zd.setOnFocusChangeListener(new Object[]{zdVar3}, 564604112, -564604104, System.identityHashCode(zdVar3))).setCompoundDrawableTintBlendMode();
                    za.setX(new Object[]{zbVar, zeVar, "starting"}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                } else {
                    compoundDrawableTintBlendMode = -1;
                }
                try {
                    zd.setOnFocusChangeListener(new Object[]{zdVar2, zbVar}, -921431148, 921431150, (int) System.currentTimeMillis());
                    try {
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            zd zdVar4 = (zd) ze.setY(new Object[]{zeVar}, -193710573, 193710580, System.identityHashCode(zeVar));
                            za.setX(new Object[]{zbVar, zeVar, Intrinsics.stringPlus("finished run in ", (String) za.setX(new Object[]{Long.valueOf(((setY) zd.setOnFocusChangeListener(new Object[]{zdVar4}, 564604112, -564604104, System.identityHashCode(zdVar4))).setCompoundDrawableTintBlendMode() - compoundDrawableTintBlendMode)}, 2036943663, -2036943663, (int) System.currentTimeMillis()))}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            zd zdVar5 = (zd) ze.setY(new Object[]{zeVar}, -193710573, 193710580, System.identityHashCode(zeVar));
                            za.setX(new Object[]{zbVar, zeVar, Intrinsics.stringPlus("failed a run in ", (String) za.setX(new Object[]{Long.valueOf(((setY) zd.setOnFocusChangeListener(new Object[]{zdVar5}, 564604112, -564604104, System.identityHashCode(zdVar5))).setCompoundDrawableTintBlendMode() - compoundDrawableTintBlendMode)}, 2036943663, -2036943663, (int) System.currentTimeMillis()))}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ((setY) zd.setOnFocusChangeListener(new Object[]{zdVar2}, 564604112, -564604104, System.identityHashCode(zdVar2))).setOnFocusChangeListener(setcompounddrawabletintblendmode);
                    throw th3;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, 239932901, -239932901, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.zd$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/zd$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/zd;", "setY", "Lcom/mypinpad/tsdk/i/zd;", "setCompoundDrawableTintBlendMode", "Ljava/util/logging/Logger;", "setOnDragListener", "Ljava/util/logging/Logger;", "setOnFocusChangeListener", "()Ljava/util/logging/Logger;", "setX", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static Logger setOnFocusChangeListener() {
            return (Logger) setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return (Logger) zd.setOnFocusChangeListener(new Object[0], 500226043, -500226042, (int) System.currentTimeMillis());
        }
    }

    public interface setY {
        long setCompoundDrawableTintBlendMode();

        void setDividerPadding(@NotNull zd zdVar, long j10);

        void setOnFocusChangeListener(@NotNull Runnable runnable);

        void setX(@NotNull zd zdVar);
    }

    static {
        Logger logger = Logger.getLogger(zd.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "");
        f62307h = logger;
        int i10 = f62308i;
        int i11 = i10 & 103;
        int i12 = (i10 | 103) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f62309j = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public zd(@NotNull setX setx) {
        Intrinsics.checkNotNullParameter(setx, "");
        this.setY = setx;
        this.f62311b = 10000;
        this.f62314e = new ArrayList();
        this.f62315f = new ArrayList();
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        setcompounddrawabletintblendmode.f62317p0 = this;
        this.f62316g = setcompounddrawabletintblendmode;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0180 A[EDGE_INSN: B:38:0x0180->B:40:0x0183 BREAK  A[LOOP:1: B:23:0x00ae->B:105:0x00ae]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0182 A[EDGE_INSN: B:39:0x0182->B:40:0x0183 BREAK  A[LOOP:1: B:23:0x00ae->B:105:0x00ae]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01d6 A[PHI: r1
      0x01d6: PHI (r1v29 com.mypinpad.tsdk.i.zd) = (r1v28 com.mypinpad.tsdk.i.zd), (r1v35 com.mypinpad.tsdk.i.zd) binds: [B:49:0x01d4, B:46:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.mypinpad.tsdk.i.zb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.mypinpad.tsdk.i.zb, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static /* synthetic */ zb a(Object[] objArr) throws Throwable {
        zd zdVar;
        zd zdVar2;
        boolean z10;
        zb zbVar;
        long jMax;
        int i10;
        char c10 = 0;
        zd zdVar3 = (zd) objArr[0];
        int i11 = f62309j;
        int i12 = ((i11 & 8) + (i11 | 8)) - 1;
        f62308i = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        ?? r10 = 0;
        if (yt.setOnFocusChangeListener) {
            int i15 = f62308i;
            int i16 = i15 & 35;
            int i17 = -(-((i15 ^ 35) | i16));
            int i18 = (i16 & i17) + (i17 | i16);
            f62309j = i18 % 128;
            if (i18 % 2 == 0) {
                Thread.holdsLock(zdVar3);
                throw null;
            }
            if (!Thread.holdsLock(zdVar3)) {
                StringBuilder sb2 = new StringBuilder("Thread ");
                sb2.append((Object) Thread.currentThread().getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(zdVar3);
                throw new AssertionError(sb2.toString());
            }
        }
        while (!zdVar3.f62315f.isEmpty()) {
            setY sety = zdVar3.setY;
            long compoundDrawableTintBlendMode = sety.setCompoundDrawableTintBlendMode();
            ArrayList arrayList = zdVar3.f62315f;
            Iterator it = arrayList.iterator();
            int i19 = f62308i;
            int i20 = i19 & 23;
            int i21 = -(-((i19 ^ 23) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            f62309j = i22 % 128;
            int i23 = i22 % i13;
            long jMin = Long.MAX_VALUE;
            ?? r12 = r10;
            while (true) {
                if (!it.hasNext()) {
                    zdVar = zdVar3;
                    break;
                }
                int i24 = f62308i;
                int i25 = i24 & 77;
                int i26 = ((((i24 ^ 77) | i25) << 1) - (~(-((i24 | 77) & (~i25))))) - 1;
                f62309j = i26 % 128;
                if (i26 % i13 == 0) {
                    ze zeVar = (ze) it.next();
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = zeVar;
                    zbVar = (zb) ((List) ze.setY(objArr2, 78938910, -78938909, System.identityHashCode(zeVar))).get(1);
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = zbVar;
                    zdVar = zdVar3;
                    jMax = Math.max(1L, ((Long) zb.setCompoundDrawableTintBlendMode(objArr3, -137883736, 137883738, System.identityHashCode(zbVar))).longValue() + compoundDrawableTintBlendMode);
                    if (jMax > 1) {
                        jMin = Math.min(jMax, jMin);
                        int i27 = f62308i + 79;
                        f62309j = i27 % 128;
                        int i28 = i27 % 2;
                        zdVar3 = zdVar;
                        c10 = 0;
                        i13 = 2;
                    } else {
                        if (r12 != 0) {
                            int i29 = f62308i;
                            int i30 = i29 & 59;
                            int i31 = (i29 ^ 59) | i30;
                            i10 = ((i30 | i31) << 1) - (i31 ^ i30);
                            f62309j = i10 % 128;
                            if (i10 % 2 == 0) {
                                c10 = 1;
                                break;
                            }
                            c10 = 0;
                            break;
                        }
                        int i32 = f62308i;
                        int i33 = i32 & 105;
                        int i34 = (i32 | 105) & (~i33);
                        int i35 = i33 << 1;
                        int i36 = (i34 & i35) + (i34 | i35);
                        f62309j = i36 % 128;
                        int i37 = i36 % 2;
                        zdVar3 = zdVar;
                        c10 = 0;
                        r12 = zbVar;
                        i13 = 2;
                    }
                } else {
                    zdVar = zdVar3;
                    ze zeVar2 = (ze) it.next();
                    zbVar = (zb) ((List) ze.setY(new Object[]{zeVar2}, 78938910, -78938909, System.identityHashCode(zeVar2))).get(0);
                    long jMax2 = Math.max(0L, ((Long) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar}, -137883736, 137883738, System.identityHashCode(zbVar))).longValue() - compoundDrawableTintBlendMode);
                    if (jMax2 > 0) {
                        jMax = jMax2;
                        jMin = Math.min(jMax, jMin);
                        int i210 = f62308i + 79;
                        f62309j = i210 % 128;
                        int i211 = i210 % 2;
                        zdVar3 = zdVar;
                        c10 = 0;
                        i13 = 2;
                    } else {
                        if (r12 != 0) {
                            int i212 = f62308i;
                            int i38 = i212 & 59;
                            int i39 = (i212 ^ 59) | i38;
                            i10 = ((i38 | i39) << 1) - (i39 ^ i38);
                            f62309j = i10 % 128;
                            if (i10 % 2 == 0) {
                                c10 = 1;
                                break;
                            }
                            c10 = 0;
                            break;
                        }
                        int i310 = f62308i;
                        int i311 = i310 & 105;
                        int i312 = (i310 | 105) & (~i311);
                        int i313 = i311 << 1;
                        int i314 = (i312 & i313) + (i312 | i313);
                        f62309j = i314 % 128;
                        int i315 = i314 % 2;
                        zdVar3 = zdVar;
                        c10 = 0;
                        r12 = zbVar;
                        i13 = 2;
                    }
                }
            }
            if (r12 != 0) {
                int i40 = f62309j;
                int i41 = i40 & 103;
                int i42 = -(-((i40 ^ 103) | i41));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f62308i = i43 % 128;
                int i44 = i43 % 2;
                setOnFocusChangeListener(new Object[]{zdVar, r12}, 1418698878, -1418698878, System.identityHashCode(zdVar));
                if (c10 == 0) {
                    int i45 = f62308i;
                    int i46 = (((i45 & (-90)) | ((~i45) & 89)) - (~((i45 & 89) << 1))) - 1;
                    f62309j = i46 % 128;
                    if (i46 % 2 == 0) {
                        zdVar2 = zdVar;
                        int i47 = 41 / 0;
                        if (!zdVar2.f62312c) {
                            if (arrayList.isEmpty()) {
                                int i48 = f62309j;
                                int i49 = (i48 ^ 113) + ((i48 & 113) << 1);
                                f62308i = i49 % 128;
                                int i50 = i49 % 2;
                            } else {
                                int i51 = f62308i;
                                int i52 = ((i51 | 29) << 1) - (i51 ^ 29);
                                int i53 = i52 % 128;
                                f62309j = i53;
                                int i54 = i52 % 2;
                                int i55 = ((i53 & (-96)) | ((~i53) & 95)) + ((i53 & 95) << 1);
                                f62308i = i55 % 128;
                                int i56 = i55 % 2;
                            }
                        }
                    } else {
                        zdVar2 = zdVar;
                        if (!zdVar2.f62312c) {
                            if (arrayList.isEmpty()) {
                                int i57 = f62308i;
                                int i58 = ((i57 | 29) << 1) - (i57 ^ 29);
                                int i59 = i58 % 128;
                                f62309j = i59;
                                int i510 = i58 % 2;
                                int i511 = ((i59 & (-96)) | ((~i59) & 95)) + ((i59 & 95) << 1);
                                f62308i = i511 % 128;
                                int i512 = i511 % 2;
                            } else {
                                int i410 = f62309j;
                                int i411 = (i410 ^ 113) + ((i410 & 113) << 1);
                                f62308i = i411 % 128;
                                int i513 = i411 % 2;
                            }
                        }
                    }
                    int i60 = f62308i;
                    int i61 = (i60 ^ 123) + ((i60 & 123) << 1);
                    f62309j = i61 % 128;
                    int i62 = i61 % 2;
                    return r12;
                }
                zdVar2 = zdVar;
                sety.setOnFocusChangeListener(zdVar2.f62316g);
                int i63 = f62309j;
                int i64 = i63 & 123;
                int i65 = ((i63 | 123) & (~i64)) + (i64 << 1);
                f62308i = i65 % 128;
                int i66 = i65 % 2;
                int i67 = f62308i;
                int i68 = (i67 ^ 123) + ((i67 & 123) << 1);
                f62309j = i68 % 128;
                int i69 = i68 % 2;
                return r12;
            }
            zdVar3 = zdVar;
            if (zdVar3.f62312c) {
                int i70 = f62309j;
                int i71 = i70 & 71;
                int i72 = i71 + ((i70 ^ 71) | i71);
                f62308i = i72 % 128;
                if (i72 % 2 == 0 ? jMin < zdVar3.f62313d - compoundDrawableTintBlendMode : jMin < (zdVar3.f62313d ^ compoundDrawableTintBlendMode)) {
                    int i73 = i70 & 55;
                    int i74 = ((i70 ^ 55) | i73) << 1;
                    int i75 = -((i70 | 55) & (~i73));
                    int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                    f62308i = i76 % 128;
                    if (i76 % 2 != 0) {
                        sety.setX(zdVar3);
                        throw null;
                    }
                    sety.setX(zdVar3);
                    int i77 = f62308i + 23;
                    f62309j = i77 % 128;
                    int i78 = i77 % 2;
                }
                int i79 = f62309j;
                int i80 = i79 & 65;
                int i81 = ((i79 ^ 65) | i80) << 1;
                int i82 = -((i79 | 65) & (~i80));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f62308i = i83 % 128;
                int i84 = i83 % 2;
                return null;
            }
            zdVar3.f62312c = true;
            zdVar3.f62313d = compoundDrawableTintBlendMode + jMin;
            try {
                try {
                    sety.setDividerPadding(zdVar3, jMin);
                    zdVar3.f62312c = false;
                    int i85 = f62308i + 97;
                    f62309j = i85 % 128;
                    int i86 = i85 % 2;
                    r10 = 0;
                    i13 = 2;
                    c10 = 0;
                } catch (InterruptedException unused) {
                    Object[] objArr4 = new Object[1];
                    z10 = false;
                    try {
                        objArr4[0] = zdVar3;
                        setOnFocusChangeListener(objArr4, 1407828598, -1407828589, System.identityHashCode(zdVar3));
                        zdVar3.f62312c = false;
                        i13 = 2;
                        c10 = 0;
                        r10 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        zdVar3.f62312c = z10;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
                zdVar3.f62312c = z10;
                throw th;
            }
        }
        int i87 = f62309j;
        int i88 = i87 ^ 71;
        int i89 = -(-((i87 & 71) << 1));
        int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
        int i91 = i90 % 128;
        f62308i = i91;
        if (i90 % i13 != 0) {
            throw r10;
        }
        int i92 = ((i91 & 70) + (i91 | 70)) - 1;
        f62309j = i92 % 128;
        if (i92 % i13 != 0) {
            return r10;
        }
        throw r10;
    }

    public static /* synthetic */ ze b(Object[] objArr) {
        int i10;
        zd zdVar = (zd) objArr[0];
        synchronized (zdVar) {
            i10 = zdVar.f62311b;
            int i11 = i10 & 1;
            zdVar.f62311b = i11 + ((i10 ^ 1) | i11);
        }
        return new ze(zdVar, Intrinsics.stringPlus(TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, Integer.valueOf(i10)));
    }

    public static final /* synthetic */ Logger setDividerPadding() {
        return (Logger) setOnFocusChangeListener(new Object[0], 500226043, -500226042, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0307  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int i13;
        int i14;
        int i15;
        int size;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = (~(i16 | i17)) | (~(i17 | i12));
        int i19 = ~i12;
        int i20 = i19 | i10;
        switch (((~i20) * 886) + ((i10 | (~(i11 | i19))) * (-1772)) + ((i18 | (~(i20 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773)) {
            case 1:
                int i21 = f62309j;
                int i22 = ((i21 ^ 29) | (i21 & 29)) << 1;
                int i23 = -(((~i21) & 29) | (i21 & (-30)));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = i24 % 128;
                f62308i = i25;
                if (i24 % 2 != 0) {
                    throw null;
                }
                int i26 = i25 & 95;
                int i27 = (i26 - (~(-(-((i25 ^ 95) | i26))))) - 1;
                f62309j = i27 % 128;
                if (i27 % 2 != 0) {
                    return f62307h;
                }
                throw null;
            case 2:
                zd zdVar = (zd) objArr[0];
                zb zbVar = (zb) objArr[1];
                int i28 = f62308i;
                int i29 = ((i28 | 19) << 1) - (((~i28) & 19) | (i28 & (-20)));
                f62309j = i29 % 128;
                if (i29 % 2 == 0) {
                    setOnFocusChangeListener(new Object[]{zdVar, zbVar}, -1070996498, 1070996505, System.identityHashCode(zdVar));
                    int i30 = 54 / 0;
                } else {
                    setOnFocusChangeListener(new Object[]{zdVar, zbVar}, -1070996498, 1070996505, System.identityHashCode(zdVar));
                }
                int i31 = f62309j;
                int i32 = i31 & 99;
                int i33 = (i32 - (~(-(-((i31 ^ 99) | i32))))) - 1;
                f62308i = i33 % 128;
                if (i33 % 2 == 0) {
                    return null;
                }
                int i34 = 95 / 0;
                return null;
            case 3:
                return a(objArr);
            case 4:
                zd zdVar2 = (zd) objArr[0];
                ze zeVar = (ze) objArr[1];
                int i35 = f62308i;
                int i36 = (i35 & (-70)) | ((~i35) & 69);
                int i37 = (i35 & 69) << 1;
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f62309j = i38 % 128;
                int i39 = i38 % 2;
                Intrinsics.checkNotNullParameter(zeVar, "");
                if (yt.setOnFocusChangeListener) {
                    int i40 = f62308i;
                    int i41 = i40 & 73;
                    int i42 = ((i40 | 73) & (~i41)) + (i41 << 1);
                    f62309j = i42 % 128;
                    int i43 = i42 % 2;
                    if (!Thread.holdsLock(zdVar2)) {
                        StringBuilder sb2 = new StringBuilder("Thread ");
                        sb2.append((Object) Thread.currentThread().getName());
                        sb2.append(" MUST hold lock on ");
                        sb2.append(zdVar2);
                        throw new AssertionError(sb2.toString());
                    }
                }
                if (((zb) ze.setY(new Object[]{zeVar}, -605751423, 605751426, System.identityHashCode(zeVar))) == null) {
                    int i44 = f62308i;
                    int i45 = i44 ^ 63;
                    int i46 = (i44 & 63) << 1;
                    int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                    f62309j = i47 % 128;
                    int i48 = i47 % 2;
                    if (((List) ze.setY(new Object[]{zeVar}, 78938910, -78938909, System.identityHashCode(zeVar))).isEmpty()) {
                        int i49 = f62309j;
                        int i50 = (((i49 & (-52)) | ((~i49) & 51)) - (~(-(-((i49 & 51) << 1))))) - 1;
                        f62308i = i50 % 128;
                        int i51 = i50 % 2;
                        zdVar2.f62315f.remove(zeVar);
                        int i52 = f62309j;
                        i13 = i52 ^ 9;
                        i14 = i52 & 9;
                    } else {
                        int i53 = f62308i;
                        int i54 = (-2) - ((((i53 | 118) << 1) - (i53 ^ 118)) ^ (-1));
                        f62309j = i54 % 128;
                        int i55 = i54 % 2;
                        int i56 = (((i53 | 124) << 1) - (i53 ^ 124)) - 1;
                        f62309j = i56 % 128;
                        int i57 = i56 % 2;
                        int i58 = ((i53 & 96) + (i53 | 96)) - 1;
                        f62309j = i58 % 128;
                        int i59 = i58 % 2;
                        yt.setDividerPadding(zdVar2.f62315f, zeVar);
                        int i60 = f62309j;
                        i13 = i60 ^ 5;
                        i14 = i60 & 5;
                    }
                    int i61 = i13 + (i14 << 1);
                    f62308i = i61 % 128;
                    int i62 = i61 % 2;
                }
                boolean z10 = zdVar2.f62312c;
                setY sety = zdVar2.setY;
                if (!z10) {
                    sety.setOnFocusChangeListener(zdVar2.f62316g);
                    int i63 = f62308i;
                    int i64 = (i63 & (-66)) | ((~i63) & 65);
                    int i65 = -(-((i63 & 65) << 1));
                    int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                    f62309j = i66 % 128;
                    if (i66 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i67 = f62309j;
                int i68 = i67 & 3;
                int i69 = i68 + ((i67 ^ 3) | i68);
                f62308i = i69 % 128;
                if (i69 % 2 != 0) {
                    sety.setX(zdVar2);
                    throw null;
                }
                sety.setX(zdVar2);
                int i70 = f62308i;
                int i71 = (-2) - (((i70 ^ 52) + ((i70 & 52) << 1)) ^ (-1));
                f62309j = i71 % 128;
                if (i71 % 2 != 0) {
                    return null;
                }
                throw null;
            case 5:
                return b(objArr);
            case 6:
                zd zdVar3 = (zd) objArr[0];
                zb zbVar2 = (zb) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                int i72 = f62308i + 49;
                f62309j = i72 % 128;
                if (i72 % 2 == 0) {
                    int i73 = 99 / 0;
                    if (yt.setOnFocusChangeListener) {
                        int i74 = f62309j;
                        i15 = ((i74 ^ 24) + ((i74 & 24) << 1)) - 1;
                        f62308i = i15 % 128;
                        if (i15 % 2 == 0) {
                            Thread.holdsLock(zdVar3);
                            throw null;
                        }
                        if (!Thread.holdsLock(zdVar3)) {
                            StringBuilder sb3 = new StringBuilder("Thread ");
                            sb3.append((Object) Thread.currentThread().getName());
                            sb3.append(" MUST hold lock on ");
                            sb3.append(zdVar3);
                            throw new AssertionError(sb3.toString());
                        }
                    }
                } else if (yt.setOnFocusChangeListener) {
                    int i75 = f62309j;
                    i15 = ((i75 ^ 24) + ((i75 & 24) << 1)) - 1;
                    f62308i = i15 % 128;
                    if (i15 % 2 == 0) {
                        Thread.holdsLock(zdVar3);
                        throw null;
                    }
                    if (!Thread.holdsLock(zdVar3)) {
                        StringBuilder sb4 = new StringBuilder("Thread ");
                        sb4.append((Object) Thread.currentThread().getName());
                        sb4.append(" MUST hold lock on ");
                        sb4.append(zdVar3);
                        throw new AssertionError(sb4.toString());
                    }
                }
                ze zeVar2 = (ze) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar2}, -216783788, 216783793, System.identityHashCode(zbVar2));
                Intrinsics.checkNotNull(zeVar2);
                if (((zb) ze.setY(new Object[]{zeVar2}, -605751423, 605751426, System.identityHashCode(zeVar2))) != zbVar2) {
                    int i76 = f62308i;
                    int i77 = i76 & 113;
                    int i78 = (((i76 | 113) & (~i77)) - (~(i77 << 1))) - 1;
                    f62309j = i78 % 128;
                    int i79 = i78 % 2;
                    throw new IllegalStateException("Check failed.".toString());
                }
                int i80 = f62308i;
                int i81 = i80 + 93;
                f62309j = i81 % 128;
                int i82 = i81 % 2;
                int i83 = i80 + 69;
                f62309j = i83 % 128;
                int i84 = i83 % 2;
                boolean zBooleanValue = ((Boolean) ze.setY(new Object[]{zeVar2}, 1530575414, -1530575414, System.identityHashCode(zeVar2))).booleanValue();
                ze.setY(new Object[]{zeVar2}, 669869495, -669869482, System.identityHashCode(zeVar2));
                ze.setY(new Object[]{zeVar2, null}, -1158651089, 1158651095, System.identityHashCode(zeVar2));
                zdVar3.f62314e.remove(zeVar2);
                if (jLongValue != -1) {
                    System.identityHashCode(zdVar3);
                    System.identityHashCode(zdVar3);
                    if (!zBooleanValue) {
                        int i85 = f62308i;
                        int i86 = i85 & 69;
                        int i87 = ((i85 ^ 69) | i86) << 1;
                        int i88 = -((i85 | 69) & (~i86));
                        int i89 = (i87 & i88) + (i88 | i87);
                        f62309j = i89 % 128;
                        int i90 = i89 % 2;
                        if (!((Boolean) ze.setY(new Object[]{zeVar2}, 573729319, -573729315, System.identityHashCode(zeVar2))).booleanValue()) {
                            int iIdentityHashCode = System.identityHashCode(zdVar3);
                            int i91 = ~iIdentityHashCode;
                            int i92 = ((-1075959974) & i91) | (iIdentityHashCode & 1075959973);
                            int i93 = (-1075959974) & iIdentityHashCode;
                            int i94 = (i92 & i93) | (i92 ^ i93);
                            int i95 = ~i94;
                            int i96 = (i94 | i95) & i95;
                            int i97 = 118817 & i96;
                            int i98 = (i96 | 118817) & (~i97);
                            int i99 = -(~(-(-(((i98 & i97) | (i98 ^ i97)) * 104))));
                            int i100 = ((-1151331034) ^ i99) + ((i99 & (-1151331034)) << 1);
                            int i101 = (i91 | iIdentityHashCode) & i91;
                            int i102 = i101 & 352974193;
                            int i103 = (i101 | 352974193) & (~i102);
                            int i104 = (i103 & i102) | (i103 ^ i102);
                            int i105 = ((-1075959974) & i104) | ((~i104) & 1075959973);
                            int i106 = 1075959973 & i104;
                            int i107 = (i91 & 352974193) | ((-352974194) & iIdentityHashCode);
                            int i108 = iIdentityHashCode & 352974193;
                            int i109 = (((((i100 ^ (-1)) + (i100 << 1)) - (~((~((i105 & i106) | (i105 ^ i106))) * (-104)))) - 1) - (~(-(-(((i108 & i107) | (i107 ^ i108)) * 104))))) - 1;
                            int i110 = ~System.identityHashCode(zdVar3);
                            int i111 = ((-96015591) & i110) | ((~i110) & 96015590);
                            int i112 = i110 & 96015590;
                            int i113 = (i111 & i112) | (i111 ^ i112);
                            int i114 = ~i113;
                            int i115 = (i113 | i114) & i114;
                            int i116 = ((~i115) & (-2123211718)) | (2123211717 & i115);
                            int i117 = i115 & (-2123211718);
                            int i118 = -(-(((i117 & i116) | (i116 ^ i117)) * 764));
                            int i119 = (-118532776) & i118;
                            int i120 = -(-(i118 | (-118532776)));
                            int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
                            int i122 = i110 ^ (-2123211718);
                            int i123 = i110 & (-2123211718);
                            int i124 = ~((i123 & i122) | (i122 ^ i123));
                            int i125 = (i121 - (~(-(-(((i124 & 76087492) | (((~i124) & 76087492) | ((-76087493) & i124))) * (-1528)))))) - 1;
                            int i126 = ((~i114) & (-2067052324)) | (2067052323 & i114);
                            int i127 = (-2067052324) & i114;
                            ((Boolean) (i109 <= (-2) - (((i125 - (~(-(~(-(-(((i126 & i127) | (i126 ^ i127)) * 764))))))) - 1) ^ (-1)) ? ze.setY(new Object[]{zeVar2, zbVar2, Long.valueOf(jLongValue), Boolean.FALSE}, -1963752086, 1963752100, System.identityHashCode(zeVar2)) : ze.setY(new Object[]{zeVar2, zbVar2, Long.valueOf(jLongValue), Boolean.TRUE}, -1963752086, 1963752100, System.identityHashCode(zeVar2)))).booleanValue();
                        }
                    }
                }
                if (((List) ze.setY(new Object[]{zeVar2}, 78938910, -78938909, System.identityHashCode(zeVar2))).isEmpty()) {
                    int i128 = f62308i;
                    int i129 = i128 ^ 43;
                    int i130 = (i128 & 43) << 1;
                    int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                    f62309j = i131 % 128;
                    int i132 = i131 % 2;
                } else {
                    int i133 = f62309j;
                    int i134 = i133 & 11;
                    int i135 = (((i133 ^ 11) | i134) << 1) - ((i133 | 11) & (~i134));
                    int i136 = i135 % 128;
                    f62308i = i136;
                    boolean z11 = i135 % 2 == 0;
                    int i137 = i136 & 31;
                    int i138 = (i137 - (~((i136 ^ 31) | i137))) - 1;
                    f62309j = i138 % 128;
                    int i139 = i138 % 2;
                    if (z11) {
                        int i140 = i136 + 65;
                        f62309j = i140 % 128;
                        int i141 = i140 % 2;
                        zdVar3.f62315f.add(zeVar2);
                        int i142 = f62309j;
                        int i143 = i142 ^ 51;
                        int i144 = ((i142 & 51) | i143) << 1;
                        int i145 = -i143;
                        int i146 = ((i144 | i145) << 1) - (i144 ^ i145);
                        f62308i = i146 % 128;
                        int i147 = i146 % 2;
                    }
                }
                int i148 = f62309j;
                int i149 = i148 & 111;
                int i150 = ((i148 ^ 111) | i149) << 1;
                int i151 = -((i148 | 111) & (~i149));
                int i152 = (i150 & i151) + (i151 | i150);
                f62308i = i152 % 128;
                if (i152 % 2 == 0) {
                    return null;
                }
                int i153 = 71 / 0;
                return null;
            case 7:
                zd zdVar4 = (zd) objArr[0];
                zb zbVar3 = (zb) objArr[1];
                if (yt.setOnFocusChangeListener && Thread.holdsLock(zdVar4)) {
                    StringBuilder sb5 = new StringBuilder("Thread ");
                    sb5.append((Object) Thread.currentThread().getName());
                    sb5.append(" MUST NOT hold lock on ");
                    sb5.append(zdVar4);
                    throw new AssertionError(sb5.toString());
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                threadCurrentThread.setName((String) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar3}, -144211769, 144211772, System.identityHashCode(zbVar3)));
                try {
                    long y7 = zbVar3.setY();
                    synchronized (zdVar4) {
                        setOnFocusChangeListener(new Object[]{zdVar4, zbVar3, Long.valueOf(y7)}, -957059472, 957059478, System.identityHashCode(zdVar4));
                        Unit unit = Unit.INSTANCE;
                    }
                    return null;
                } finally {
                    synchronized (zdVar4) {
                        setOnFocusChangeListener(new Object[]{zdVar4, zbVar3, -1L}, -957059472, 957059478, System.identityHashCode(zdVar4));
                        Unit unit2 = Unit.INSTANCE;
                        threadCurrentThread.setName(name);
                    }
                }
            case 8:
                zd zdVar5 = (zd) objArr[0];
                int i154 = f62309j;
                int i155 = (i154 & (-64)) | ((~i154) & 63);
                int i156 = (i154 & 63) << 1;
                int i157 = (i155 ^ i156) + ((i155 & i156) << 1);
                f62308i = i157 % 128;
                int i158 = i157 % 2;
                setY sety2 = zdVar5.setY;
                if (i158 != 0) {
                    throw null;
                }
                int i159 = i154 & 93;
                int i160 = i154 | 93;
                int i161 = (i159 & i160) + (i160 | i159);
                f62308i = i161 % 128;
                if (i161 % 2 == 0) {
                    return sety2;
                }
                throw null;
            case 9:
                zd zdVar6 = (zd) objArr[0];
                int i162 = f62308i;
                int i163 = (i162 ^ 59) + ((i162 & 59) << 1);
                f62309j = i163 % 128;
                if (i163 % 2 != 0 ? (size = zdVar6.f62314e.size() - 1) >= 0 : (size = zdVar6.f62314e.size()) >= 0) {
                    while (true) {
                        int i164 = (((size & 80) | ((~size) & (-81))) - (~((size & (-81)) << 1))) + 79;
                        ze zeVar3 = (ze) zdVar6.f62314e.get(size);
                        ((Boolean) ze.setY(new Object[]{zeVar3}, 1716465180, -1716465170, System.identityHashCode(zeVar3))).booleanValue();
                        if (i164 >= 0) {
                            size = i164;
                        }
                    }
                }
                int size2 = zdVar6.f62315f.size();
                int i165 = (~size2) + (size2 << 1);
                if (i165 >= 0) {
                    while (true) {
                        int i166 = ((~i165) - (~(i165 << 1))) - 1;
                        ArrayList arrayList = zdVar6.f62315f;
                        ze zeVar4 = (ze) arrayList.get(i165);
                        ((Boolean) ze.setY(new Object[]{zeVar4}, 1716465180, -1716465170, System.identityHashCode(zeVar4))).booleanValue();
                        if (((List) ze.setY(new Object[]{zeVar4}, 78938910, -78938909, System.identityHashCode(zeVar4))).isEmpty()) {
                            int i167 = f62308i;
                            int i168 = i167 & 87;
                            int i169 = (((i167 | 87) & (~i168)) - (~(-(-(i168 << 1))))) - 1;
                            f62309j = i169 % 128;
                            if (i169 % 2 == 0) {
                                arrayList.remove(i165);
                                throw null;
                            }
                            arrayList.remove(i165);
                            int i170 = f62308i;
                            int i171 = (i170 | 45) << 1;
                            int i172 = -(((~i170) & 45) | (i170 & (-46)));
                            int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                            f62309j = i173 % 128;
                            int i174 = i173 % 2;
                        }
                        if (i166 >= 0) {
                            i165 = i166;
                        }
                    }
                }
                int i175 = f62309j;
                int i176 = (-2) - (((i175 & 108) + (i175 | 108)) ^ (-1));
                f62308i = i176 % 128;
                if (i176 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                zd zdVar7 = (zd) objArr[0];
                zb zbVar4 = (zb) objArr[1];
                int i177 = f62308i;
                int i178 = i177 & 83;
                int i179 = i178 + ((i177 ^ 83) | i178);
                f62309j = i179 % 128;
                int i180 = i179 % 2;
                if (yt.setOnFocusChangeListener) {
                    int i181 = f62308i + 21;
                    f62309j = i181 % 128;
                    int i182 = i181 % 2;
                    if (!Thread.holdsLock(zdVar7)) {
                        StringBuilder sb6 = new StringBuilder("Thread ");
                        sb6.append((Object) Thread.currentThread().getName());
                        sb6.append(" MUST hold lock on ");
                        sb6.append(zdVar7);
                        throw new AssertionError(sb6.toString());
                    }
                }
                zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar4, -1L}, -737772585, 737772586, System.identityHashCode(zbVar4));
                ze zeVar5 = (ze) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar4}, -216783788, 216783793, System.identityHashCode(zbVar4));
                Intrinsics.checkNotNull(zeVar5);
                ((List) ze.setY(new Object[]{zeVar5}, 78938910, -78938909, System.identityHashCode(zeVar5))).remove(zbVar4);
                zdVar7.f62315f.remove(zeVar5);
                ze.setY(new Object[]{zeVar5, zbVar4}, -1158651089, 1158651095, System.identityHashCode(zeVar5));
                zdVar7.f62314e.add(zeVar5);
                int i183 = f62308i;
                int i184 = i183 ^ 31;
                int i185 = (i183 & 31) << 1;
                int i186 = (i184 ^ i185) + ((i185 & i184) << 1);
                f62309j = i186 % 128;
                int i187 = i186 % 2;
                return null;
        }
    }

    @Nullable
    public final zb setCompoundDrawableTintBlendMode() {
        return (zb) setOnFocusChangeListener(new Object[]{this}, -1371855915, 1371855918, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final setY setX() {
        return (setY) setOnFocusChangeListener(new Object[]{this}, 564604112, -564604104, System.identityHashCode(this));
    }

    @NotNull
    public final ze setY() {
        return (ze) setOnFocusChangeListener(new Object[]{this}, -1673899270, 1673899275, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull ze p4) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setOnFocusChangeListener(new Object[]{this, p4}, -386859593, 386859597, System.identityHashCode(this));
    }

    public static final class setX implements setY {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62318b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f62319c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ThreadPoolExecutor f62320a;

        public setX(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "");
            this.f62320a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0101 A[PHI: r2 r11
          0x0101: PHI (r2v3 long) = (r2v2 long), (r2v11 long) binds: [B:19:0x00ff, B:16:0x00f2] A[DONT_GENERATE, DONT_INLINE]
          0x0101: PHI (r11v3 long) = (r11v2 long), (r11v6 long) binds: [B:19:0x00ff, B:16:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws InterruptedException {
            long j10;
            long j11;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ((~(i15 | i12)) * 345) + (((~(i10 | i14)) | (~(i13 | (~i12)))) * 345) + (((~i15) | (~(i13 | i12))) * 345) + (i11 * (-344)) + (i10 * (-344));
            if (i16 != 1) {
                if (i16 == 2) {
                    zd zdVar = (zd) objArr[1];
                    int i17 = f62319c;
                    int i18 = i17 & 59;
                    int i19 = -(-(i17 | 59));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    f62318b = i20 % 128;
                    if (i20 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(zdVar, "");
                        zdVar.notify();
                        return null;
                    }
                    Intrinsics.checkNotNullParameter(zdVar, "");
                    zdVar.notify();
                    int i21 = 57 / 0;
                    return null;
                }
                if (i16 != 3) {
                    int i22 = f62319c + 61;
                    f62318b = i22 % 128;
                    int i23 = i22 % 2;
                    long jNanoTime = System.nanoTime();
                    int i24 = f62318b;
                    int i25 = ((i24 ^ 92) + ((i24 & 92) << 1)) - 1;
                    f62319c = i25 % 128;
                    int i26 = i25 % 2;
                    return Long.valueOf(jNanoTime);
                }
                setX setx = (setX) objArr[0];
                Runnable runnable = (Runnable) objArr[1];
                int i27 = f62319c;
                int i28 = i27 & 123;
                int i29 = ((((i27 ^ 123) | i28) << 1) - (~(-((i27 | 123) & (~i28))))) - 1;
                f62318b = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(runnable, "");
                setx.f62320a.execute(runnable);
                int i31 = f62319c;
                int i32 = i31 | 63;
                int i33 = ((i32 << 1) - (~(-((~(i31 & 63)) & i32)))) - 1;
                f62318b = i33 % 128;
                int i34 = i33 % 2;
                return null;
            }
            zd zdVar2 = (zd) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i35 = ((-1) << 1) - ((f62318b + 82) ^ (-1));
            f62319c = i35 % 128;
            if (i35 % 2 == 0) {
                Intrinsics.checkNotNullParameter(zdVar2, "");
                j10 = jLongValue % AnimationKt.MillisToNanos;
                j11 = (j10 / AnimationKt.MillisToNanos) ^ jLongValue;
                if (j10 <= 1) {
                    if (jLongValue > 0) {
                    }
                }
                int i36 = f62318b;
                int i37 = i36 & 45;
                int i38 = ((i36 ^ 45) | i37) << 1;
                int i39 = -((i36 | 45) & (~i37));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f62319c = i40 % 128;
                int i41 = i40 % 2;
                return null;
            }
            Intrinsics.checkNotNullParameter(zdVar2, "");
            j10 = jLongValue / AnimationKt.MillisToNanos;
            j11 = jLongValue - (AnimationKt.MillisToNanos * j10);
            if (j10 <= 0) {
                if (jLongValue > 0) {
                }
            }
            int i310 = f62318b;
            int i311 = i310 & 45;
            int i312 = ((i310 ^ 45) | i311) << 1;
            int i313 = -((i310 | 45) & (~i311));
            int i42 = (i312 ^ i313) + ((i313 & i312) << 1);
            f62319c = i42 % 128;
            int i43 = i42 % 2;
            return null;
            zdVar2.wait(j10, (int) j11);
            int i44 = f62318b;
            int i45 = (i44 ^ 95) + ((i44 & 95) << 1);
            f62319c = i45 % 128;
            int i46 = i45 % 2;
            int i314 = f62318b;
            int i315 = i314 & 45;
            int i316 = ((i314 ^ 45) | i315) << 1;
            int i317 = -((i314 | 45) & (~i315));
            int i47 = (i316 ^ i317) + ((i317 & i316) << 1);
            f62319c = i47 % 128;
            int i48 = i47 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.i.zd.setY
        public final long setCompoundDrawableTintBlendMode() {
            return ((Long) setOnFocusChangeListener(new Object[]{this}, -242687914, 242687914, System.identityHashCode(this))).longValue();
        }

        @Override // com.mypinpad.tsdk.i.zd.setY
        public final void setDividerPadding(@NotNull zd zdVar, long j10) throws InterruptedException {
            setOnFocusChangeListener(new Object[]{this, zdVar, Long.valueOf(j10)}, 487097549, -487097548, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.zd.setY
        public final void setX(@NotNull zd zdVar) throws InterruptedException {
            setOnFocusChangeListener(new Object[]{this, zdVar}, 1406906490, -1406906488, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.zd.setY
        public final void setOnFocusChangeListener(@NotNull Runnable runnable) throws InterruptedException {
            setOnFocusChangeListener(new Object[]{this, runnable}, -963275641, 963275644, System.identityHashCode(this));
        }
    }
}
