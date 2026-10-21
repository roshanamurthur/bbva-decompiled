package com.mypinpad.tsdk.isolation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tJ$\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mypinpad/tsdk/internal/utils/threading/SdkThreads;", "", "()V", "cachedThreadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "getCachedThreadPool", "()Lcom/mypinpad/common/threading/ThreadPool;", "newCachedThreadPool", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "newCpuBoundCachedThreadPool", "threadIdleLifeSeconds", "", "maxThreadCount", "", "newSingleThreadThreadPool", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61557b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61558c = 1;

    @NotNull
    public static final vi setDividerPadding = new vi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TerminalCallbackKt f61556a = (TerminalCallbackKt) setOnFocusChangeListener(new Object[0], 665063867, -665063864, (int) System.currentTimeMillis());

    static {
        int i10 = f61557b;
        int i11 = i10 & 111;
        int i12 = i11 + ((i10 ^ 111) | i11);
        f61558c = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 26 / 0;
        }
    }

    public static /* synthetic */ TerminalCallbackKt setDividerPadding() {
        return (TerminalCallbackKt) setOnFocusChangeListener(new Object[0], -294985573, 294985579, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        vh vhVar;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
        int i16 = i11 | (~(i13 | (~i12)));
        int i17 = ~(i10 | i12);
        switch ((i17 * 880) + ((i16 | i17) * (-880)) + i15) {
            case 1:
                ThreadFactory threadFactory = (ThreadFactory) objArr[0];
                Intrinsics.checkNotNullParameter(threadFactory, "");
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(threadFactory);
                Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
                vhVar = new vh(executorServiceNewSingleThreadExecutor);
                int i18 = f61557b;
                int i19 = ((i18 ^ 88) + ((i18 & 88) << 1)) - 1;
                f61558c = i19 % 128;
                int i20 = i19 % 2;
                break;
            case 2:
                ThreadFactory threadFactory2 = (ThreadFactory) objArr[0];
                Intrinsics.checkNotNullParameter(threadFactory2, "");
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactory2);
                Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "");
                vhVar = new vh(executorServiceNewCachedThreadPool);
                int i21 = f61557b;
                int i22 = ((i21 | 48) << 1) - (i21 ^ 48);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f61558c = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                TerminalCallbackKt terminalCallbackKt = (TerminalCallbackKt) setOnFocusChangeListener(new Object[]{new ve(null, 1, null)}, -742296784, 742296786, (int) System.currentTimeMillis());
                int i24 = f61558c;
                int i25 = i24 & 89;
                int i26 = (i24 ^ 89) | i25;
                int i27 = (i25 & i26) + (i26 | i25);
                f61557b = i27 % 128;
                if (i27 % 2 == 0) {
                    return terminalCallbackKt;
                }
                throw null;
            case 4:
                int i28 = f61558c + 87;
                int i29 = i28 % 128;
                f61557b = i29;
                if (i28 % 2 != 0) {
                    throw null;
                }
                int i30 = i29 & 75;
                int i31 = (i30 - (~(-(-((i29 ^ 75) | i30))))) - 1;
                f61558c = i31 % 128;
                if (i31 % 2 != 0) {
                    return f61556a;
                }
                throw null;
            case 5:
                ((Number) objArr[0]).longValue();
                int iIntValue = ((Number) objArr[1]).intValue();
                ThreadFactory threadFactory3 = (ThreadFactory) objArr[2];
                Intrinsics.checkNotNullParameter(threadFactory3, "");
                vh vhVar2 = new vh(new ThreadPoolExecutor(0, iIntValue, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory3));
                int i32 = f61558c;
                int i33 = (i32 & 57) + (i32 | 57);
                f61557b = i33 % 128;
                int i34 = i33 % 2;
                return vhVar2;
            case 6:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                TerminalCallbackKt terminalCallbackKt2 = (TerminalCallbackKt) setOnFocusChangeListener(new Object[]{30L, Integer.valueOf(iAvailableProcessors), new ve(null, 1, null)}, 1877902417, -1877902412, iAvailableProcessors);
                int i35 = f61557b;
                int i36 = ((i35 & 109) - (~(i35 | 109))) - 1;
                f61558c = i36 % 128;
                int i37 = i36 % 2;
                return terminalCallbackKt2;
            default:
                TerminalCallbackKt terminalCallbackKt3 = (TerminalCallbackKt) setOnFocusChangeListener(new Object[]{new ve(null, 1, null)}, -462708157, 462708158, (int) System.currentTimeMillis());
                int i38 = f61557b + 61;
                f61558c = i38 % 128;
                int i39 = i38 % 2;
                return terminalCallbackKt3;
        }
        return vhVar;
    }

    public static /* synthetic */ TerminalCallbackKt setX() {
        return (TerminalCallbackKt) setOnFocusChangeListener(new Object[0], 486117644, -486117644, (int) System.currentTimeMillis());
    }

    @JvmName(name = "getCachedThreadPool")
    @NotNull
    public static TerminalCallbackKt setOnFocusChangeListener() {
        return (TerminalCallbackKt) setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis());
    }
}
