package com.bbva.ethermobilesdk.cipher.keystore.provider;

import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.PlatformCipherProvider;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyStoreProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b$\u0010\fJ#\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\r\u001a\u00020\nH\u0011¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider;", "Lcom/bbva/ethermobilesdk/cipher/PlatformCipherProvider;", "", "data", GoogleTapAndPay.KEY_ALIAS, "encrypt$cipher_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "encrypt", "decrypt$cipher_release", "decrypt", "", "reset$cipher_release", "()V", "reset", "", "getAliases$cipher_release", "()Ljava/util/List;", "getAliases", "", "contains$cipher_release", "(Ljava/lang/String;)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "delete$cipher_release", "(Ljava/lang/String;)V", "delete", "Ljava/security/KeyStore;", "a", "Ljava/security/KeyStore;", "getKeyStore$cipher_release", "()Ljava/security/KeyStore;", "setKeyStore$cipher_release", "(Ljava/security/KeyStore;)V", "keyStore", "isAvailable$cipher_release", "()Z", "isAvailable", "<init>", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKeyStoreProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyStoreProvider.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1#2:93\n1855#3,2:94\n*S KotlinDebug\n*F\n+ 1 KeyStoreProvider.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider\n*L\n54#1:94,2\n*E\n"})
public abstract class KeyStoreProvider implements PlatformCipherProvider {

    @NotNull
    public static final String AES256_SEPARATOR = "|";

    @NotNull
    public static final String ANDROID_KEYSTORE = "AndroidKeyStore";

    @NotNull
    public static final String DECRYPTION_ERROR_CODE = "FAILED_TO_DECRYPT";

    @NotNull
    public static final String DECRYPTION_ERROR_MESSAGE = "Failed to decrypt";

    @NotNull
    public static final String ENCRYPTION_ERROR_CODE = "FAILED_TO_ENCRYPT";

    @NotNull
    public static final String ENCRYPTION_ERROR_MESSAGE = "Failed to encrypt";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public KeyStore keyStore;

    public KeyStoreProvider() {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
            keyStore.load(null);
            this.keyStore = keyStore;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ String decrypt$cipher_release$default(KeyStoreProvider keyStoreProvider, String str, String str2, int i10, Object obj) throws KeyStoreException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrypt");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return keyStoreProvider.decrypt$cipher_release(str, str2);
    }

    public static /* synthetic */ String encrypt$cipher_release$default(KeyStoreProvider keyStoreProvider, String str, String str2, int i10, Object obj) throws KeyStoreException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encrypt");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return keyStoreProvider.encrypt$cipher_release(str, str2);
    }

    @VisibleForTesting(otherwise = 2)
    public final boolean contains$cipher_release(@NotNull String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyStore keyStore = this.keyStore;
        if (keyStore != null) {
            return keyStore.containsAlias(alias);
        }
        return false;
    }

    @NotNull
    public abstract String decrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreException;

    @VisibleForTesting(otherwise = 2)
    public final void delete$cipher_release(@NotNull String alias) throws KeyStoreException {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyStore keyStore = this.keyStore;
        if (keyStore != null) {
            keyStore.deleteEntry(alias);
        }
    }

    @NotNull
    public abstract String encrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreException;

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final List<String> getAliases$cipher_release() {
        Enumeration<String> enumerationAliases;
        KeyStore keyStore = this.keyStore;
        if (keyStore != null && (enumerationAliases = keyStore.aliases()) != null) {
            ArrayList list = Collections.list(enumerationAliases);
            Intrinsics.checkNotNullExpressionValue(list, "list(this)");
            if (list != null) {
                return list;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: getKeyStore$cipher_release, reason: from getter */
    public final KeyStore getKeyStore() {
        return this.keyStore;
    }

    public final boolean isAvailable$cipher_release() {
        return this.keyStore != null;
    }

    @VisibleForTesting(otherwise = 2)
    public void reset$cipher_release() throws KeyStoreException {
        Iterator<T> it = getAliases$cipher_release().iterator();
        while (it.hasNext()) {
            delete$cipher_release((String) it.next());
        }
    }

    public final void setKeyStore$cipher_release(@Nullable KeyStore keyStore) {
        this.keyStore = keyStore;
    }
}
