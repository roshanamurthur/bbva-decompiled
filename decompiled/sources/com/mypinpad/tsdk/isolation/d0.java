package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f55070a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55071b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55072c = 1;

    static {
        int i10 = f55071b;
        int i11 = i10 & 91;
        int i12 = -(-((i10 ^ 91) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55072c = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Boolean bool;
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = ((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13;
        if (i16 == 1) {
            Socket socket = (Socket) objArr[0];
            Intrinsics.checkNotNullParameter(socket, "");
            h0 h0Var = new h0(socket);
            OutputStream outputStream = socket.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "");
            aco y7 = h0Var.setY(new g0(outputStream, h0Var));
            int i17 = f55072c;
            int i18 = i17 & 77;
            int i19 = ((i17 ^ 77) | i18) << 1;
            int i20 = -((i17 | 77) & (~i18));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f55071b = i21 % 128;
            int i22 = i21 % 2;
            return y7;
        }
        if (i16 == 2) {
            int i23 = f55071b;
            int i24 = ((i23 ^ 42) + ((i23 & 42) << 1)) - 1;
            f55072c = i24 % 128;
            int i25 = i24 % 2;
            int i26 = i23 & 11;
            int i27 = -(-((i23 ^ 11) | i26));
            int i28 = (i26 & i27) + (i27 | i26);
            f55072c = i28 % 128;
            if (i28 % 2 != 0) {
                return f55070a;
            }
            throw null;
        }
        if (i16 != 3) {
            if (i16 != 4) {
                InputStream inputStream = (InputStream) objArr[0];
                Intrinsics.checkNotNullParameter(inputStream, "");
                f0 f0Var = new f0(inputStream, new acq());
                int i29 = f55072c + 29;
                f55071b = i29 % 128;
                if (i29 % 2 == 0) {
                    return f0Var;
                }
                throw null;
            }
            Socket socket2 = (Socket) objArr[0];
            Intrinsics.checkNotNullParameter(socket2, "");
            h0 h0Var2 = new h0(socket2);
            InputStream inputStream2 = socket2.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream2, "");
            acp y10 = h0Var2.setY(new f0(inputStream2, h0Var2));
            int i30 = f55071b + 79;
            f55072c = i30 % 128;
            int i31 = i30 % 2;
            return y10;
        }
        AssertionError assertionError = (AssertionError) objArr[0];
        int i32 = f55071b + 32;
        int i33 = (i32 ^ (-1)) + (i32 << 1);
        f55072c = i33 % 128;
        int i34 = i33 % 2;
        Intrinsics.checkNotNullParameter(assertionError, "");
        if (assertionError.getCause() != null) {
            int i35 = f55072c;
            int i36 = ((i35 ^ 85) | (i35 & 85)) << 1;
            int i37 = -(((~i35) & 85) | (i35 & (-86)));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f55071b = i38 % 128;
            if (i38 % 2 != 0) {
                assertionError.getMessage();
                throw null;
            }
            String message = assertionError.getMessage();
            if (message == null) {
                int i39 = f55071b;
                int i40 = i39 | 21;
                int i41 = ((i40 << 1) - (~(-((~(i39 & 21)) & i40)))) - 1;
                f55072c = i41 % 128;
                int i42 = i41 % 2;
            } else {
                boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
                int i43 = f55071b;
                int i44 = (i43 ^ 102) + ((i43 & 102) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                f55072c = i45 % 128;
                int i46 = i45 % 2;
                if (zContains$default) {
                    int i47 = (((i43 | 1) << 1) - (~(-(i43 ^ 1)))) - 1;
                    f55072c = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = i43 + 65;
                    f55072c = i49 % 128;
                    if (i49 % 2 == 0) {
                        throw null;
                    }
                    bool = Boolean.TRUE;
                }
            }
            int i50 = f55072c;
            int i51 = (i50 & (-88)) | ((~i50) & 87);
            int i52 = -(-((i50 & 87) << 1));
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            f55071b = i53 % 128;
            int i54 = i53 % 2;
            bool = Boolean.FALSE;
        } else {
            int i55 = f55072c;
            int i56 = (i55 & (-88)) | ((~i55) & 87);
            int i57 = -(-((i55 & 87) << 1));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            f55071b = i58 % 128;
            int i59 = i58 % 2;
            bool = Boolean.FALSE;
        }
        return bool;
    }
}
