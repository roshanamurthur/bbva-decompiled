package com.mypinpad.tsdk.isolation;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface setWidth extends Closeable {
    void setCompoundDrawableTintBlendMode();

    @NotNull
    byte[] setOnFocusChangeListener();

    @VisibleForTesting
    void setX(@NotNull byte[] bArr);

    boolean setY();

    public static final class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60828a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60829b = 1;

        public static void setCompoundDrawableTintBlendMode(@NotNull setWidth setwidth) {
            setX(new Object[]{setwidth}, 444139552, -444139550, (int) System.currentTimeMillis());
        }

        @VisibleForTesting
        public static void setOnFocusChangeListener(@NotNull setWidth setwidth, @NotNull byte[] bArr) {
            setX(new Object[]{setwidth, bArr}, -133223628, 133223628, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
        
            if (r5.setY() != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            if (r5.setY() != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
        
            r5 = com.mypinpad.tsdk.i.setWidth.setX.f60829b + 18;
            r6 = (r5 ^ (-1)) + (r5 << 1);
            com.mypinpad.tsdk.i.setWidth.setX.f60828a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        
            r5.setX(r5.setOnFocusChangeListener());
            kotlin.random.Random.INSTANCE.nextBytes(r5.setOnFocusChangeListener());
            r5.setCompoundDrawableTintBlendMode();
            r5 = com.mypinpad.tsdk.i.setWidth.setX.f60828a + 111;
            com.mypinpad.tsdk.i.setWidth.setX.f60829b = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r5, int r6, int r7, int r8) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setWidth.setX.setX(java.lang.Object[], int, int, int):java.lang.Object");
        }

        public static int setX(@NotNull setWidth setwidth) {
            return ((Integer) setX(new Object[]{setwidth}, 972262101, -972262100, (int) System.currentTimeMillis())).intValue();
        }
    }
}
