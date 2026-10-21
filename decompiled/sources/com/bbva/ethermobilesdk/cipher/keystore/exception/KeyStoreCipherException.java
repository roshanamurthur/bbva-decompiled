package com.bbva.ethermobilesdk.cipher.keystore.exception;

import com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyStoreCipherException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \r2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\rB'\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/exception/KeyStoreCipherException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/bbva/ethermobilesdk/cipher/exception/EtherCipherErrorException;", "", "getErrorCode", "getErrorDescription", "", "cause", "errorCode", "errorDescription", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class KeyStoreCipherException extends Exception implements EtherCipherErrorException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final KeyStoreCipherException f29327r0 = new KeyStoreCipherException(null, "KEYSTORE_UNAVAILABLE", "Android Keystore is unavailable", 1, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final KeyStoreCipherException f29328s0 = new KeyStoreCipherException(null, "ENCRYPTION_TAG_NOT_FOUND", "Encryption tag not found", 1, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f29329p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f29330q0;

    /* JADX INFO: compiled from: KeyStoreCipherException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/exception/KeyStoreCipherException$Companion;", "", "()V", "NOT_AVAILABLE_EXCEPTION", "Lcom/bbva/ethermobilesdk/cipher/keystore/exception/KeyStoreCipherException;", "getNOT_AVAILABLE_EXCEPTION", "()Lcom/bbva/ethermobilesdk/cipher/keystore/exception/KeyStoreCipherException;", "TAG_NOT_FOUND_EXCEPTION", "getTAG_NOT_FOUND_EXCEPTION", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyStoreCipherException getNOT_AVAILABLE_EXCEPTION() {
            return KeyStoreCipherException.f29327r0;
        }

        @NotNull
        public final KeyStoreCipherException getTAG_NOT_FOUND_EXCEPTION() {
            return KeyStoreCipherException.f29328s0;
        }
    }

    public KeyStoreCipherException() {
        this(null, null, null, 7, null);
    }

    @Override // com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException
    @NotNull
    /* JADX INFO: renamed from: getErrorCode, reason: from getter */
    public String getF29329p0() {
        return this.f29329p0;
    }

    @Override // com.bbva.ethermobilesdk.cipher.exception.EtherCipherErrorException
    @NotNull
    /* JADX INFO: renamed from: getErrorDescription, reason: from getter */
    public String getF29330q0() {
        return this.f29330q0;
    }

    public /* synthetic */ KeyStoreCipherException(Throwable th2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2, (i10 & 2) != 0 ? "KEYSTORE_UNAVAILABLE" : str, (i10 & 4) != 0 ? "Android Keystore is unavailable" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyStoreCipherException(@Nullable Throwable th2, @NotNull String errorCode, @NotNull String errorDescription) {
        super(errorDescription, th2);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.f29329p0 = errorCode;
        this.f29330q0 = errorDescription;
    }
}
