package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/fs;", "Lcom/mypinpad/tsdk/i/do;", "", "p0", "<init>", "([B)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class fs extends Cdo {

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.fs$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/fs$setOnFocusChangeListener;", "", "", "p0", "", "setY", "([B)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55577a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55578b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr = (byte[]) objArr[0];
            int i13 = f55577a;
            int i14 = i13 & 97;
            int i15 = (i14 - (~((i13 ^ 97) | i14))) - 1;
            f55578b = i15 % 128;
            int i16 = i15 % 2;
            if (bArr != null) {
                int i17 = (((i13 & (-82)) | ((~i13) & 81)) - (~(-(-((i13 & 81) << 1))))) - 1;
                int i18 = i17 % 128;
                f55578b = i18;
                int i19 = i17 % 2;
                if (bArr.length == 0) {
                    int i20 = i18 & 107;
                    int i21 = ((i18 ^ 107) | i20) << 1;
                    int i22 = -((i18 | 107) & (~i20));
                    int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                    f55577a = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = f55578b;
                    int i26 = i25 & 103;
                    int i27 = i25 | 103;
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    f55577a = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    int i30 = i18 & 59;
                    int i31 = -(-((i18 ^ 59) | i30));
                    int i32 = (i30 & i31) + (i30 | i31);
                    f55577a = i32 % 128;
                    int i33 = i32 % 2;
                    if (bArr.length == 25) {
                        int i34 = ((i18 ^ 99) - (~((i18 & 99) << 1))) - 1;
                        f55577a = i34 % 128;
                        int i35 = i34 % 2;
                        return Boolean.TRUE;
                    }
                    int i36 = ((i18 & 85) - (~(-(-(i18 | 85))))) - 1;
                    f55577a = i36 % 128;
                    if (i36 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                int i210 = f55578b;
                int i211 = i210 & 103;
                int i212 = i210 | 103;
                int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                f55577a = i213 % 128;
                int i214 = i213 % 2;
            }
            return Boolean.FALSE;
        }

        public static boolean setY(@Nullable byte[] p4) {
            return ((Boolean) setX(new Object[]{p4}, 13367737, -13367737, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    static {
        int i10 = (73 << 1) - 73;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public fs(@Nullable byte[] bArr) {
        super(bArr);
    }
}
