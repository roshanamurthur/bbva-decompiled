package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class ed implements eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55347a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55348b = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55349p0 = new a();

        static {
            int i10 = 114 - 1;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~(i13 | i14);
            int i16 = ~i12;
            int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
            int i18 = i10 | i11;
            int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
            int i20 = i10 | (~(i12 | i14));
            int i21 = ~(i11 | i16);
            if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 == 1) {
                a aVar = (a) objArr[0];
                a(new Object[]{aVar, (cv) objArr[1]}, 1854098150, -1854098150, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            cv cvVar = (cv) objArr[1];
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1728527861, 1728527862, System.identityHashCode(cvVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1216690039, 1216690040, System.identityHashCode(this));
        }
    }

    @Override // com.mypinpad.tsdk.isolation.eg
    public void setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        cz czVar = new cz(setscrollbardefaultdelaybeforefade);
        int i10 = f55348b;
        int i11 = (((i10 | 34) << 1) - (i10 ^ 34)) - 1;
        f55347a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.eg
    public boolean setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull ca caVar, long j10, long j11) {
        int i10 = f55347a;
        int i11 = ((i10 & 55) - (~(-(-(i10 | 55))))) - 1;
        f55348b = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(caVar, "");
            ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, Long.valueOf(j10), Long.valueOf(j11)}, -1335075487, 1335075493, System.identityHashCode(caVar))).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(caVar, "");
        boolean zBooleanValue = ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, Long.valueOf(j10), Long.valueOf(j11)}, -1335075487, 1335075493, System.identityHashCode(caVar))).booleanValue();
        int i12 = f55347a;
        int i13 = ((i12 ^ 32) + ((i12 & 32) << 1)) - 1;
        f55348b = i13 % 128;
        int i14 = i13 % 2;
        return zBooleanValue;
    }
}
