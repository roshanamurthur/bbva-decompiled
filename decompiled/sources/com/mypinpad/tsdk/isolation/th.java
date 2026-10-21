package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001a"}, d2 = {"Lcom/mypinpad/tsdk/i/th;", "Lcom/mypinpad/tsdk/i/un;", "", "junkify", "()V", "", "p0", "[B", "setX", "()[B", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/so;", "q0", "Lcom/mypinpad/tsdk/i/so;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/so;", "", "r0", "Ljava/lang/String;", "setY", "()Ljava/lang/String;", "s0", "setDividerPadding", "Ljava/util/UUID;", "t0", "Ljava/util/UUID;", "()Ljava/util/UUID;", "p1", "p2", "p3", "p4", "<init>", "([BLcom/mypinpad/tsdk/i/so;Ljava/lang/String;[BLjava/util/UUID;)V"}, k = 1, mv = {1, 8, 0})
public final class th implements un {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f61058u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final so setX;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UUID setY;

    public th(@NotNull byte[] bArr, @NotNull so soVar, @NotNull String str, @NotNull byte[] bArr2, @Nullable UUID uuid) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(soVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.setOnFocusChangeListener = bArr;
        this.setX = soVar;
        this.setCompoundDrawableTintBlendMode = str;
        this.setDividerPadding = bArr2;
        this.setY = uuid;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        int i17 = (((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15;
        if (i17 == 1) {
            th thVar = (th) objArr[0];
            int i18 = v0 + 19;
            f61058u0 = i18 % 128;
            if (i18 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i17 == 2) {
            th thVar2 = (th) objArr[0];
            int i19 = v0;
            int i20 = (i19 & (-68)) | ((~i19) & 67);
            int i21 = -(-((i19 & 67) << 1));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            int i23 = i22 % 128;
            f61058u0 = i23;
            int i24 = i22 % 2;
            byte[] bArr = thVar2.setOnFocusChangeListener;
            int i25 = i23 & 97;
            int i26 = (i25 - (~((i23 ^ 97) | i25))) - 1;
            v0 = i26 % 128;
            int i27 = i26 % 2;
            return bArr;
        }
        if (i17 == 3) {
            th thVar3 = (th) objArr[0];
            int i28 = f61058u0;
            int i29 = ((i28 | 17) << 1) - (i28 ^ 17);
            int i30 = i29 % 128;
            v0 = i30;
            int i31 = i29 % 2;
            so soVar = thVar3.setX;
            int i32 = ((i30 ^ 22) + ((i30 & 22) << 1)) - 1;
            f61058u0 = i32 % 128;
            int i33 = i32 % 2;
            return soVar;
        }
        if (i17 == 4) {
            th thVar4 = (th) objArr[0];
            int i34 = v0;
            int i35 = i34 & 19;
            int i36 = (~i35) & (i34 | 19);
            int i37 = -(-(i35 << 1));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            f61058u0 = i38 % 128;
            int i39 = i38 % 2;
            String str = thVar4.setCompoundDrawableTintBlendMode;
            int i40 = i34 + 89;
            f61058u0 = i40 % 128;
            int i41 = i40 % 2;
            return str;
        }
        if (i17 != 5) {
            th thVar5 = (th) objArr[0];
            int i42 = f61058u0;
            int i43 = ((i42 ^ 106) + ((i42 & 106) << 1)) - 1;
            int i44 = i43 % 128;
            v0 = i44;
            int i45 = i43 % 2;
            UUID uuid = thVar5.setY;
            int i46 = i44 & 63;
            int i47 = (((i44 | 63) & (~i46)) - (~(i46 << 1))) - 1;
            f61058u0 = i47 % 128;
            if (i47 % 2 == 0) {
                return uuid;
            }
            throw null;
        }
        th thVar6 = (th) objArr[0];
        int i48 = f61058u0;
        int i49 = (i48 & (-118)) | ((~i48) & 117);
        int i50 = (i48 & 117) << 1;
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        int i52 = i51 % 128;
        v0 = i52;
        int i53 = i51 % 2;
        byte[] bArr2 = thVar6.setDividerPadding;
        int i54 = i52 & 1;
        int i55 = ((i52 | 1) & (~i54)) + (i54 << 1);
        f61058u0 = i55 % 128;
        int i56 = i55 % 2;
        return bArr2;
    }

    @Override // com.mypinpad.tsdk.isolation.un
    public final void junkify() {
        setX(new Object[]{this}, -1983854825, 1983854826, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final so setCompoundDrawableTintBlendMode() {
        return (so) setX(new Object[]{this}, -1103467503, 1103467506, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1109730590, 1109730595, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final UUID setOnFocusChangeListener() {
        return (UUID) setX(new Object[]{this}, -464429737, 464429737, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, -969777703, 969777707, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        return (byte[]) setX(new Object[]{this}, 1654300703, -1654300701, System.identityHashCode(this));
    }
}
