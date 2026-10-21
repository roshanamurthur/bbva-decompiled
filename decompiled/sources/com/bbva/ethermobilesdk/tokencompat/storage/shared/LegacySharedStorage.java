package com.bbva.ethermobilesdk.tokencompat.storage.shared;

import android.content.Context;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacySharedStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/shared/LegacySharedStorage;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "b", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "getStorage", "()Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "storage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class LegacySharedStorage implements LegacyStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f30664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SecureSharing storage;

    public LegacySharedStorage(@NotNull Context context) {
        Object objM5535constructorimpl;
        SecureSharing secureSharing;
        Throwable recoveredFromException;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30664a = context;
        SecureSharing secureSharing2 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            secureSharing = new SecureSharing(context);
            try {
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                th = th2;
                secureSharing2 = secureSharing;
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                secureSharing = secureSharing2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError("Failed to initialize SecureSharing. Attempting to reset", thM5538exceptionOrNullimpl);
            SecureSharing.INSTANCE.reset(this.f30664a);
        }
        if (secureSharing == null && (recoveredFromException = (secureSharing = new SecureSharing(this.f30664a)).getRecoveredFromException()) != null) {
            LoggerKt.logError("Recovered from error", recoveredFromException);
        }
        this.storage = secureSharing;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        this.storage.putValue(str, str2);
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.storage.removeKey(str);
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.storage.getValue(str);
    }

    @NotNull
    public final SecureSharing getStorage() {
        return this.storage;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object reset(@NotNull Continuation<? super Unit> continuation) {
        SecureSharing.INSTANCE.reset(this.f30664a);
        return Unit.INSTANCE;
    }
}
