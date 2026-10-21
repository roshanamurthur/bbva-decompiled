package com.mypinpad.tsdk.api.errors;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.nj;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/api/errors/TerminalException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getErrorCode", "()I", "errorCode", "", "q0", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "cause", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0})
public final class TerminalException extends Exception {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51665r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f51666s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int errorCode;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String description;

    public /* synthetic */ TerminalException(int i10, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : th2);
    }

    @JvmName(name = "getDescription")
    @Nullable
    public final String getDescription() {
        int i10 = f51666s0;
        int i11 = (i10 & (-28)) | ((~i10) & 27);
        int i12 = -(-((i10 & 27) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f51665r0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.description;
        }
        throw null;
    }

    @JvmName(name = "getErrorCode")
    public final int getErrorCode() {
        int i10 = f51665r0 + 59;
        int i11 = i10 % 128;
        f51666s0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 49;
        f51665r0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.errorCode;
        }
        throw null;
    }

    public TerminalException(int i10, @Nullable String str, @Nullable Throwable th2) {
        super(nj.setX(i10, str), th2);
        this.errorCode = i10;
        this.description = str;
    }
}
