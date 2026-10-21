package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends abp {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f56119o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f56120p = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Socket f56121n;

    public h0(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        this.f56121n = socket;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v19, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.mypinpad.tsdk.i.h0] */
    public static /* synthetic */ SocketTimeoutException a(Object[] objArr, int i10, int i11, int i12) {
        SocketTimeoutException socketTimeoutException;
        int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        int i14 = 0;
        int i15 = 1;
        if (i13 != 1) {
            IOException iOException = (IOException) objArr[1];
            socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                int i16 = f56119o;
                int i17 = (i16 ^ 67) + ((i16 & 67) << 1);
                f56120p = i17 % 128;
                int i18 = i17 % 2;
                socketTimeoutException.initCause(iOException);
                int i19 = f56120p;
                int i20 = i19 & 71;
                int i21 = (i19 ^ 71) | i20;
                int i22 = (i20 & i21) + (i21 | i20);
                f56119o = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = f56119o;
            int i25 = i24 & 57;
            int i26 = i24 | 57;
            int i27 = (i25 & i26) + (i26 | i25);
            f56120p = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 37 / 0;
            }
        } else {
            h0 h0Var = (h0) objArr[0];
            int i29 = f56120p;
            int i30 = ((i29 ^ 1) | (i29 & 1)) << 1;
            int i31 = -(((~i29) & 1) | (i29 & (-2)));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f56119o = i32 % 128;
            socketTimeoutException = null;
            try {
                if (i32 % 2 != 0) {
                    h0Var.f56121n.close();
                    int i33 = 87 / 0;
                } else {
                    h0Var.f56121n.close();
                }
                int i34 = f56120p;
                i14 = i34 ^ 5;
                int i35 = -(-((i34 & 5) << 1));
                int i36 = (i14 & i35) + (i35 | i14);
                h0Var = i36 % 128;
                f56119o = h0Var;
                i15 = i36 % 2;
                if (i15 != 0) {
                    throw null;
                }
            } catch (AssertionError e5) {
                Object[] objArr2 = new Object[i15];
                objArr2[i14] = e5;
                if (!((Boolean) ach.setOnFocusChangeListener(objArr2, -1623690444, 1623690450, (int) System.currentTimeMillis())).booleanValue()) {
                    throw e5;
                }
                ((Logger) d0.a(new Object[i14], -1456603379, 1456603381, (int) System.currentTimeMillis())).log(Level.WARNING, Intrinsics.stringPlus("Failed to close timed out socket ", h0Var.f56121n), (Throwable) e5);
                int i37 = f56119o;
                int i38 = (i37 ^ 15) + ((i37 & 15) << i15);
                f56120p = i38 % 128;
                int i39 = i38 % 2;
            } catch (Exception e7) {
                ((Logger) d0.a(new Object[i14], -1456603379, 1456603381, (int) System.currentTimeMillis())).log(Level.WARNING, Intrinsics.stringPlus("Failed to close timed out socket ", h0Var.f56121n), (Throwable) e7);
            }
        }
        return socketTimeoutException;
    }

    @Override // com.mypinpad.tsdk.isolation.abp
    public final void setDividerPadding() {
        a(new Object[]{this}, 1699513789, -1699513788, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abp
    @NotNull
    public final IOException setOnFocusChangeListener(@Nullable IOException iOException) {
        return a(new Object[]{this, iOException}, -884566090, 884566090, System.identityHashCode(this));
    }
}
