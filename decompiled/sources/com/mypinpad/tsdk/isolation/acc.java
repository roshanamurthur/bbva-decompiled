package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class acc implements acp {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52382q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52383r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final acp f52384p0;

    public acc(@NotNull acp acpVar) {
        Intrinsics.checkNotNullParameter(acpVar, "");
        this.f52384p0 = acpVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object y7;
        int i13 = (i11 * (-195)) + (i10 * (-391));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i12 | i11);
        if ((((~((~i10) | i14)) | i16) * 196) + ((i11 | i10) * 392) + ((i15 | i16) * (-196)) + i13 != 1) {
            acc accVar = (acc) objArr[0];
            int i17 = f52382q0;
            int i18 = ((i17 & (-94)) | ((~i17) & 93)) + ((i17 & 93) << 1);
            f52383r0 = i18 % 128;
            int i19 = i18 % 2;
            y7 = accVar.f52384p0;
            int iIdentityHashCode = System.identityHashCode(accVar);
            int i20 = ~iIdentityHashCode;
            int i21 = 1360782715 ^ i20;
            int i22 = 1360782715 & i20;
            int i23 = (i21 & i22) | (i21 ^ i22);
            int i24 = ~i23;
            int i25 = (i23 | i24) & i24;
            int i26 = (i25 & (-1003795235)) | ((~i25) & (-1003795235)) | (i25 & 1003795234);
            int i27 = (1360782715 & iIdentityHashCode) | ((-1360782716) & i20);
            int i28 = (-1360782716) & iIdentityHashCode;
            int i29 = ~((i27 & i28) | (i27 ^ i28));
            int i30 = -(-(((i29 & i26) | (i26 ^ i29)) * (-564)));
            int i31 = ((((1755877774 ^ i30) | (1755877774 & i30)) << 1) - (~(-((i30 & (-1755877775)) | (1755877774 & (~i30)))))) - 1;
            int i32 = (-286302499) & iIdentityHashCode;
            int i33 = (iIdentityHashCode | (-286302499)) & (~i32);
            int i34 = (i33 & i32) | (i33 ^ i32);
            int i35 = ~i34;
            int i36 = -(-(((i34 | i35) & i35) * 1128));
            int i37 = (((i31 ^ i36) | (i31 & i36)) << 1) - ((i36 & (~i31)) | ((~i36) & i31));
            int i38 = ((~i20) & (-1003795235)) | (i20 & 1003795234);
            int i39 = i20 & (-1003795235);
            int i40 = (i38 & i39) | (i38 ^ i39);
            int i41 = ~i40;
            int i42 = (i40 | i41) & i41;
            int i43 = (((i42 & 1074480217) | (i42 ^ 1074480217)) * 564) + i37;
            int iIdentityHashCode2 = System.identityHashCode(accVar);
            int i44 = ~iIdentityHashCode2;
            int i45 = ((-412396647) & i44) | (412396646 & iIdentityHashCode2);
            int i46 = (-412396647) & iIdentityHashCode2;
            int i47 = ~((i46 & i45) | (i45 ^ i46));
            int i48 = ~(((-33701889) & iIdentityHashCode2) | ((-33701889) ^ iIdentityHashCode2));
            int i49 = ((~i48) & i47) | ((~i47) & i48);
            int i50 = i47 & i48;
            int i51 = -(-(((i50 & i49) | (i49 ^ i50)) * 69));
            int i52 = 1569461410 & i51;
            int i53 = -(-((i51 ^ 1569461410) | i52));
            int i54 = (i52 & i53) + (i53 | i52);
            int i55 = (-2096476160) & iIdentityHashCode2;
            int i56 = ((-2096476160) | iIdentityHashCode2) & (~i55);
            int i57 = ~((i56 & i55) | (i56 ^ i55));
            int i58 = (i57 & 1684079513) | (1684079513 ^ i57);
            int i59 = (i44 & (-1717781402)) | (1717781401 & iIdentityHashCode2);
            int i60 = iIdentityHashCode2 & (-1717781402);
            int i61 = ~((i60 & i59) | (i59 ^ i60));
            int i62 = ((~i61) & i58) | ((~i58) & i61);
            int i63 = i61 & i58;
            int i64 = ((i63 & i62) | (i62 ^ i63)) * (-69);
            int i65 = i54 & i64;
            if (i43 > (((i64 | i54) & (~i65)) + (i65 << 1)) - 953397248) {
                int i66 = 94 / 0;
            }
        } else {
            acc accVar2 = (acc) objArr[0];
            int i67 = f52382q0;
            int i68 = i67 & 59;
            int i69 = i68 + ((i67 ^ 59) | i68);
            f52383r0 = i69 % 128;
            int i70 = i69 % 2;
            y7 = accVar2.f52384p0.setY();
            int i71 = f52382q0;
            int i72 = i71 ^ 91;
            int i73 = (i71 & 91) << 1;
            int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
            f52383r0 = i74 % 128;
            if (i74 % 2 == 0) {
                throw null;
            }
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = f52383r0;
        int i11 = i10 & 91;
        int i12 = (i10 ^ 91) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52382q0 = i13 % 128;
        int i14 = i13 % 2;
        this.f52384p0.close();
        int i15 = f52383r0 + 43;
        f52382q0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    @JvmName(name = "delegate")
    @NotNull
    public final acp setX() {
        return (acp) setOnFocusChangeListener(new Object[]{this}, 741756126, -741756126, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public long setY(@NotNull abx abxVar, long j10) throws IOException {
        int i10 = f52383r0 + 79;
        f52382q0 = i10 % 128;
        int i11 = i10 % 2;
        acp acpVar = this.f52384p0;
        if (i11 == 0) {
            Intrinsics.checkNotNullParameter(abxVar, "");
            return acpVar.setY(abxVar, j10);
        }
        Intrinsics.checkNotNullParameter(abxVar, "");
        int i12 = 28 / 0;
        return acpVar.setY(abxVar, j10);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append(RootService.OPEN_BRACKET);
        sb2.append(this.f52384p0);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i10 = f52383r0;
        int i11 = i10 & 117;
        int i12 = (i10 | 117) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f52382q0 = i14 % 128;
        if (i14 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    @NotNull
    public final acq setY() {
        return (acq) setOnFocusChangeListener(new Object[]{this}, -200779586, 200779587, System.identityHashCode(this));
    }
}
