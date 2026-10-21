package com.mypinpad.tsdk.isolation;

import androidx.annotation.VisibleForTesting;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface setPrivateImeOptions extends Closeable {
    void setCompoundDrawableTintBlendMode();

    @VisibleForTesting
    void setCompoundDrawableTintBlendMode(@NotNull char[] cArr);

    @NotNull
    char[] setX();

    boolean setY();

    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60335a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60336b = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i13 | (~(i14 | i15));
            int i17 = ~(i10 | i11);
            if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) != 1) {
                setPrivateImeOptions setprivateimeoptions = (setPrivateImeOptions) objArr[0];
                char[] cArr = (char[]) objArr[1];
                int i18 = f60335a + 69;
                f60336b = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(setprivateimeoptions, "");
                Intrinsics.checkNotNullParameter(cArr, "");
                int i20 = f60335a;
                int i21 = i20 & 57;
                int i22 = (i21 - (~((i20 ^ 57) | i21))) - 1;
                f60336b = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            } else {
                setPrivateImeOptions setprivateimeoptions2 = (setPrivateImeOptions) objArr[0];
                int i23 = f60335a + 69;
                f60336b = i23 % 128;
                if (i23 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setprivateimeoptions2, "");
                    setprivateimeoptions2.setY();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setprivateimeoptions2, "");
                if (setprivateimeoptions2.setY()) {
                    int i24 = f60336b;
                    int i25 = ((i24 | 83) << 1) - (i24 ^ 83);
                    f60335a = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    setprivateimeoptions2.setCompoundDrawableTintBlendMode(setprivateimeoptions2.setX());
                    char[] x4 = setprivateimeoptions2.setX();
                    Iterator<Integer> it = ArraysKt___ArraysKt.getIndices(x4).iterator();
                    int i27 = f60335a;
                    int i28 = i27 & 97;
                    int i29 = -(-((i27 ^ 97) | i28));
                    int i30 = (i28 & i29) + (i29 | i28);
                    f60336b = i30 % 128;
                    int i31 = i30 % 2;
                    while (it.hasNext()) {
                        int i32 = f60335a;
                        int i33 = i32 ^ 75;
                        int i34 = (i32 & 75) << 1;
                        int i35 = (i33 & i34) + (i34 | i33);
                        f60336b = i35 % 128;
                        int i36 = i35 % 2;
                        x4[((IntIterator) it).nextInt()] = (char) Random.INSTANCE.nextInt();
                        int i37 = f60335a;
                        int i38 = ((i37 | 59) << 1) - (i37 ^ 59);
                        f60336b = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    setprivateimeoptions2.setCompoundDrawableTintBlendMode();
                    int i40 = f60335a;
                    int i41 = i40 | 1;
                    int i42 = ((i41 << 1) - (~(-((~(i40 & 1)) & i41)))) - 1;
                    f60336b = i42 % 128;
                    if (i42 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return null;
        }

        public static void setX(@NotNull setPrivateImeOptions setprivateimeoptions) {
            setDividerPadding(new Object[]{setprivateimeoptions}, -1381812867, 1381812868, (int) System.currentTimeMillis());
        }

        @VisibleForTesting
        public static void setDividerPadding(@NotNull setPrivateImeOptions setprivateimeoptions, @NotNull char[] cArr) {
            setDividerPadding(new Object[]{setprivateimeoptions, cArr}, -1264263145, 1264263145, (int) System.currentTimeMillis());
        }
    }
}
