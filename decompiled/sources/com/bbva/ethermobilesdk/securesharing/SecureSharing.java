package com.bbva.ethermobilesdk.securesharing;

import android.content.Context;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.storage.Storage;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureSharing.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0005R(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "", "", "key", "value", "", "putValue", "getValue", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "removeKey", "cleanAll", "", "<set-?>", "a", "Ljava/lang/Throwable;", "getRecoveredFromException", "()Ljava/lang/Throwable;", "recoveredFromException", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class SecureSharing {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f29939c = "ERR_CRYPTO_KEY_HAS_CHANGED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Exception f29940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Storage f29941b;

    /* JADX INFO: compiled from: SecureSharing.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/SecureSharing$Companion;", "", "()V", "SECSDK_ERR_MSG_CRYPTO_KEY_HAS_CHANGED", "", "getSECSDK_ERR_MSG_CRYPTO_KEY_HAS_CHANGED", "()Ljava/lang/String;", "reset", "", "context", "Landroid/content/Context;", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSECSDK_ERR_MSG_CRYPTO_KEY_HAS_CHANGED() {
            return SecureSharing.f29939c;
        }

        public final void reset(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            new Storage(context).reset(context);
        }
    }

    public SecureSharing(@NotNull Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            this.f29941b = new Storage(context);
        } catch (Exception e5) {
            this.f29940a = e5;
            ExceptionKt.throwError("Storage cannot be created", e5);
            throw new KotlinNothingValueException();
        }
    }

    public final void cleanAll() {
        this.f29941b.clean();
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f29941b.contains(key);
    }

    @Nullable
    public final Throwable getRecoveredFromException() {
        return this.f29940a;
    }

    @Nullable
    public final String getValue(@NotNull String key) {
        Object objM5535constructorimpl;
        String message;
        Storage storage = this.f29941b;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(storage.get(key));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null && (message = thM5538exceptionOrNullimpl.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) f29939c, false, 2, (Object) null)) {
            storage.remove(key);
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (String) objM5535constructorimpl;
    }

    public final void putValue(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29941b.put(key, value);
    }

    public final void removeKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f29941b.remove(key);
    }
}
