package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.errors.TerminalException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/uq;", "", "", "p0", "", "p1", "", "p2", "", "setCompoundDrawableTintBlendMode", "(ZILjava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValidationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidationUtils.kt\ncom/mypinpad/tsdk/internal/utils/ValidationUtils\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,24:1\n7#2,8:25\n*S KotlinDebug\n*F\n+ 1 ValidationUtils.kt\ncom/mypinpad/tsdk/internal/utils/ValidationUtils\n*L\n21#1:25,8\n*E\n"})
public final class uq {

    @NotNull
    public static final uq INSTANCE = new uq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61403a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61404b = 1;

    static {
        int i10 = f61403a + 27;
        f61404b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 7 / 0;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i13 = f61404b;
        int i14 = (i13 & 115) + (i13 | 115);
        int i15 = i14 % 128;
        f61403a = i15;
        int i16 = i14 % 2;
        if (!zBooleanValue) {
            TerminalException terminalException = new TerminalException(iIntValue, str, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        int i17 = (i15 & (-12)) | ((~i15) & 11);
        int i18 = -(-((i15 & 11) << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f61404b = i19 % 128;
        if (i19 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void setCompoundDrawableTintBlendMode(boolean p4, int p10, @Nullable String p11) throws TerminalException {
        setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(p4), Integer.valueOf(p10), p11}, -68532531, 68532531, p10);
    }
}
