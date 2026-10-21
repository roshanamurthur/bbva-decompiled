package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class AuthorizationGrant {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51742e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51743f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f51744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f51745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f51746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UUID f51747d;

    public AuthorizationGrant(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f51744a = bArr;
        this.f51745b = bArr2;
        this.f51746c = bArr3;
        this.f51747d = uuid;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13;
        if (i18 == 1) {
            AuthorizationGrant authorizationGrant = (AuthorizationGrant) objArr[0];
            int i19 = f51742e;
            int i20 = ((i19 ^ 27) - (~((i19 & 27) << 1))) - 1;
            int i21 = i20 % 128;
            f51743f = i21;
            int i22 = i20 % 2;
            UUID uuid = authorizationGrant.f51747d;
            int i23 = ((i21 ^ 121) | (i21 & 121)) << 1;
            int i24 = -(((~i21) & 121) | (i21 & (-122)));
            int i25 = (i23 & i24) + (i24 | i23);
            f51742e = i25 % 128;
            int i26 = i25 % 2;
            return uuid;
        }
        if (i18 == 2) {
            AuthorizationGrant authorizationGrant2 = (AuthorizationGrant) objArr[0];
            int i27 = f51743f;
            int i28 = i27 | 45;
            int i29 = i28 << 1;
            int i30 = -(i28 & (~(i27 & 45)));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f51742e = i31 % 128;
            int i32 = i31 % 2;
            byte[] bArr = authorizationGrant2.f51744a;
            int i33 = (i27 & (-26)) | ((~i27) & 25);
            int i34 = -(-((i27 & 25) << 1));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f51742e = i35 % 128;
            if (i35 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        if (i18 == 3) {
            AuthorizationGrant authorizationGrant3 = (AuthorizationGrant) objArr[0];
            int i36 = f51743f;
            int i37 = ((i36 | 41) << 1) - (i36 ^ 41);
            f51742e = i37 % 128;
            int i38 = i37 % 2;
            byte[] bArr2 = authorizationGrant3.f51746c;
            int i39 = i36 + 13;
            f51742e = i39 % 128;
            if (i39 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
        AuthorizationGrant authorizationGrant4 = (AuthorizationGrant) objArr[0];
        int i40 = f51742e + 11;
        int i41 = i40 % 128;
        f51743f = i41;
        int i42 = i40 % 2;
        byte[] bArr3 = authorizationGrant4.f51745b;
        if (i42 == 0) {
            throw null;
        }
        int i43 = ((i41 ^ 97) | (i41 & 97)) << 1;
        int i44 = -((i41 & (-98)) | ((~i41) & 97));
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        f51742e = i45 % 128;
        if (i45 % 2 == 0) {
            return bArr3;
        }
        int i46 = 52 / 0;
        return bArr3;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1916864640, -1916864637, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1939688577, -1939688575, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1656898012, -1656898012, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setOnFocusChangeListener() {
        return (UUID) setOnFocusChangeListener(new Object[]{this}, 1410255014, -1410255013, System.identityHashCode(this));
    }
}
