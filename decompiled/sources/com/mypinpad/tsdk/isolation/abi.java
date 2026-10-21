package com.mypinpad.tsdk.isolation;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class abi implements abg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52297c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52298d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setY f52299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public abg f52300b;

    public interface setY {
        boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket);

        @NotNull
        abg setY(@NotNull SSLSocket sSLSocket);
    }

    public abi(@NotNull setY sety) {
        Intrinsics.checkNotNullParameter(sety, "");
        this.f52299a = sety;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-475)) + (i10 * 477);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10 | i12);
        int i17 = (~(i10 | i15 | (~i12))) * 476;
        int i18 = i17 + (i16 * 952) + ((i14 | i16) * (-476)) + i13;
        if (i18 == 1) {
            abi abiVar = (abi) objArr[0];
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            String str = (String) objArr[2];
            List<? extends yi> list = (List) objArr[3];
            int i19 = f52297c;
            int i20 = (i19 & 43) + (i19 | 43);
            f52298d = i20 % 128;
            if (i20 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                Intrinsics.checkNotNullParameter(list, "");
                abiVar.a(sSLSocket);
                throw null;
            }
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            Intrinsics.checkNotNullParameter(list, "");
            abg abgVarA = abiVar.a(sSLSocket);
            if (abgVarA != null) {
                abgVarA.setY(sSLSocket, str, list);
                int i21 = f52298d;
                int i22 = (i21 ^ 123) + ((i21 & 123) << 1);
                f52297c = i22 % 128;
                int i23 = i22 % 2;
                return null;
            }
            int i24 = f52298d;
            int i25 = i24 ^ 83;
            int i26 = (i24 & 83) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f52297c = i27 % 128;
            if (i27 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i18 == 2) {
            abi abiVar2 = (abi) objArr[0];
            SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
            int i28 = f52298d;
            int i29 = i28 & 49;
            int i30 = i29 + ((i28 ^ 49) | i29);
            f52297c = i30 % 128;
            int i31 = i30 % 2;
            Intrinsics.checkNotNullParameter(sSLSocket2, "");
            boolean onFocusChangeListener = abiVar2.f52299a.setOnFocusChangeListener(sSLSocket2);
            int i32 = f52298d;
            int i33 = i32 & 39;
            int i34 = (((i32 ^ 39) | i33) << 1) - ((i32 | 39) & (~i33));
            f52297c = i34 % 128;
            int i35 = i34 % 2;
            return Boolean.valueOf(onFocusChangeListener);
        }
        if (i18 != 3) {
            int i36 = f52297c;
            int i37 = ((i36 | 49) << 1) - (i36 ^ 49);
            f52298d = i37 % 128;
            int i38 = i37 % 2;
            int i39 = (i36 & (-108)) | ((~i36) & 107);
            int i40 = (i36 & 107) << 1;
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            f52298d = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 92 / 0;
            }
            return Boolean.TRUE;
        }
        abi abiVar3 = (abi) objArr[0];
        SSLSocket sSLSocket3 = (SSLSocket) objArr[1];
        int i43 = f52297c;
        int i44 = i43 ^ 117;
        int i45 = ((i43 & 117) | i44) << 1;
        int i46 = -i44;
        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
        f52298d = i47 % 128;
        if (i47 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sSLSocket3, "");
            abiVar3.a(sSLSocket3);
            throw null;
        }
        Intrinsics.checkNotNullParameter(sSLSocket3, "");
        abg abgVarA2 = abiVar3.a(sSLSocket3);
        if (abgVarA2 != null) {
            String x4 = abgVarA2.setX(sSLSocket3);
            int i48 = f52297c + 89;
            f52298d = i48 % 128;
            int i49 = i48 % 2;
            return x4;
        }
        int i50 = f52298d;
        int i51 = (-2) - (((i50 ^ 122) + ((i50 & 122) << 1)) ^ (-1));
        f52297c = i51 % 128;
        if (i51 % 2 == 0) {
            return null;
        }
        int i52 = 49 / 0;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:5:0x0012, B:30:0x0068, B:16:0x0023, B:18:0x0034, B:29:0x004e, B:25:0x0043, B:26:0x0044, B:11:0x001c, B:14:0x001f, B:20:0x003c, B:7:0x0016), top: B:39:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:5:0x0012, B:30:0x0068, B:16:0x0023, B:18:0x0034, B:29:0x004e, B:25:0x0043, B:26:0x0044, B:11:0x001c, B:14:0x001f, B:20:0x003c, B:7:0x0016), top: B:39:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:5:0x0012, B:30:0x0068, B:16:0x0023, B:18:0x0034, B:29:0x004e, B:25:0x0043, B:26:0x0044, B:11:0x001c, B:14:0x001f, B:20:0x003c, B:7:0x0016), top: B:39:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:5:0x0012, B:30:0x0068, B:16:0x0023, B:18:0x0034, B:29:0x004e, B:25:0x0043, B:26:0x0044, B:11:0x001c, B:14:0x001f, B:20:0x003c, B:7:0x0016), top: B:39:0x0001, inners: #0, #1 }] */
    public final synchronized abg a(SSLSocket sSLSocket) {
        int i10;
        abg abgVar;
        try {
            int i11 = f52298d;
            int i12 = i11 + 34;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            f52297c = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 32 / 0;
                if (this.f52300b == null) {
                    i10 = (-2) - (((i11 & 38) + (i11 | 38)) ^ (-1));
                    f52297c = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i15 = 50 / 0;
                        if (!(!this.f52299a.setOnFocusChangeListener(sSLSocket))) {
                            this.f52300b = this.f52299a.setY(sSLSocket);
                            int i16 = f52297c;
                            int i17 = (i16 ^ 78) + ((i16 & 78) << 1);
                            int i18 = (i17 ^ (-1)) + (i17 << 1);
                            f52298d = i18 % 128;
                            int i19 = i18 % 2;
                        }
                    } else if (!this.f52299a.setOnFocusChangeListener(sSLSocket)) {
                        this.f52300b = this.f52299a.setY(sSLSocket);
                        int i110 = f52297c;
                        int i111 = (i110 ^ 78) + ((i110 & 78) << 1);
                        int i112 = (i111 ^ (-1)) + (i111 << 1);
                        f52298d = i112 % 128;
                        int i113 = i112 % 2;
                    }
                }
            } else if (this.f52300b == null) {
                i10 = (-2) - (((i11 & 38) + (i11 | 38)) ^ (-1));
                f52297c = i10 % 128;
                if (i10 % 2 != 0) {
                    int i114 = 50 / 0;
                    if (!(!this.f52299a.setOnFocusChangeListener(sSLSocket))) {
                        this.f52300b = this.f52299a.setY(sSLSocket);
                        int i115 = f52297c;
                        int i116 = (i115 ^ 78) + ((i115 & 78) << 1);
                        int i117 = (i116 ^ (-1)) + (i116 << 1);
                        f52298d = i117 % 128;
                        int i118 = i117 % 2;
                    }
                } else if (!this.f52299a.setOnFocusChangeListener(sSLSocket)) {
                    this.f52300b = this.f52299a.setY(sSLSocket);
                    int i119 = f52297c;
                    int i1110 = (i119 ^ 78) + ((i119 & 78) << 1);
                    int i1111 = (i1110 ^ (-1)) + (i1110 << 1);
                    f52298d = i1111 % 128;
                    int i1112 = i1111 % 2;
                }
            }
            abgVar = this.f52300b;
            int i20 = f52298d + 119;
            f52297c = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return abgVar;
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket) {
        return ((Boolean) setDividerPadding(new Object[]{this, sSLSocket}, -1962919382, 1962919384, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @Nullable
    public final String setX(@NotNull SSLSocket sSLSocket) {
        return (String) setDividerPadding(new Object[]{this, sSLSocket}, 1833088140, -1833088137, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final void setY(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends yi> list) {
        setDividerPadding(new Object[]{this, sSLSocket, str, list}, -1335478906, 1335478907, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1735295281, -1735295281, System.identityHashCode(this))).booleanValue();
    }
}
