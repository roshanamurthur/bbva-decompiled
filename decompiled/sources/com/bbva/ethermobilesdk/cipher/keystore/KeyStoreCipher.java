package com.bbva.ethermobilesdk.cipher.keystore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProviderCompat;
import com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProviderFallback;
import com.bbva.ethermobilesdk.cipher.logger.CipherLoggerKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyStoreCipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/KeyStoreCipher;", "", "", "data", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "encrypt", "decrypt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class KeyStoreCipher {

    @NotNull
    public static final String AES_SEPARATOR = "|";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29326a;

    public KeyStoreCipher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29326a = context;
    }

    public static void c(String str, String str2, KeyStoreCipherException keyStoreCipherException) {
        CipherLoggerKt.logCipherError(EtherLogger.INSTANCE, keyStoreCipherException, KeyStoreCipher.class, CipherLoggerKt.getLoggerPayload(TuplesKt.to("cipher_operation", str), TuplesKt.to("cipher_provider_version", str2)));
    }

    public final CipherResult<String> a(String str, String str2) {
        try {
            return new CipherResult.Success(KeyStoreProvider.decrypt$cipher_release$default(b(str), str2, null, 2, null));
        } catch (KeyStoreCipherException e5) {
            c("decrypt", str, e5);
            return new CipherResult.Error(e5);
        }
    }

    @SuppressLint({"NewApi"})
    public final KeyStoreProvider b(String str) {
        if (Intrinsics.areEqual(str, AndroidKeyStoreProvider.KP_23)) {
            return new AndroidKeyStoreProvider(false, 1, null);
        }
        boolean zAreEqual = Intrinsics.areEqual(str, AndroidKeyStoreProviderCompat.KP_18);
        Context context = this.f29326a;
        return zAreEqual ? new AndroidKeyStoreProviderCompat(context) : new AndroidKeyStoreProviderFallback(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r2.equals(com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProvider.KP_23) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r2.equals(com.bbva.ethermobilesdk.cipher.keystore.provider.impl.AndroidKeyStoreProviderCompat.KP_18) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        return a(r2, ((java.lang.String) r8.get(1)) + "|" + ((java.lang.String) r8.get(2)));
     */
    @android.annotation.SuppressLint({"NewApi"})
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bbva.ethermobilesdk.cipher.model.CipherResult<java.lang.String> decrypt(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "|"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            java.util.List r8 = kotlin.text.StringsKt__StringsKt.split$default(r1, r2, r3, r4, r5, r6)
            r1 = 0
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = new java.lang.String
            byte[] r1 = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.base64ToByteArray(r1)
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            int r1 = r2.hashCode()
            r3 = 1658463634(0x62da2592, float:2.0120487E21)
            r4 = 1
            if (r1 == r3) goto L58
            r3 = 1658463660(0x62da25ac, float:2.0120524E21)
            if (r1 == r3) goto L4f
            r0 = 1658465319(0x62da2c27, float:2.0122859E21)
            if (r1 == r0) goto L3b
            goto L60
        L3b:
            java.lang.String r0 = "com.bbva.ethermobilesdk.cipher.keystore.kp_fb"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L44
            goto L60
        L44:
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            com.bbva.ethermobilesdk.cipher.model.CipherResult r8 = r7.a(r2, r8)
            goto L8f
        L4f:
            java.lang.String r1 = "com.bbva.ethermobilesdk.cipher.keystore.kp_23"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6c
            goto L60
        L58:
            java.lang.String r1 = "com.bbva.ethermobilesdk.cipher.keystore.kp_18"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6c
        L60:
            com.bbva.ethermobilesdk.cipher.model.CipherResult$Error r8 = new com.bbva.ethermobilesdk.cipher.model.CipherResult$Error
            com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException$Companion r0 = com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException.INSTANCE
            com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException r0 = r0.getTAG_NOT_FOUND_EXCEPTION()
            r8.<init>(r0)
            goto L8f
        L6c:
            java.lang.Object r1 = r8.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 2
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.bbva.ethermobilesdk.cipher.model.CipherResult r8 = r7.a(r2, r8)
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.cipher.keystore.KeyStoreCipher.decrypt(java.lang.String):com.bbva.ethermobilesdk.cipher.model.CipherResult");
    }

    @NotNull
    public final CipherResult<String> encrypt(@NotNull String data) {
        KeyStoreProvider androidKeyStoreProviderCompat;
        Intrinsics.checkNotNullParameter(data, "data");
        DefaultConstructorMarker defaultConstructorMarker = null;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                androidKeyStoreProviderCompat = new AndroidKeyStoreProvider(false, 1, defaultConstructorMarker);
            } else {
                androidKeyStoreProviderCompat = new AndroidKeyStoreProviderCompat(this.f29326a);
            }
            return new CipherResult.Success(KeyStoreProvider.encrypt$cipher_release$default(androidKeyStoreProviderCompat, data, null, 2, null));
        } catch (KeyStoreCipherException e5) {
            c("encrypt", Build.VERSION.SDK_INT >= 24 ? AndroidKeyStoreProvider.KP_23 : AndroidKeyStoreProviderCompat.KP_18, e5);
            try {
                return new CipherResult.Success(KeyStoreProvider.encrypt$cipher_release$default(b(AndroidKeyStoreProviderFallback.KP_FB), data, null, 2, null));
            } catch (KeyStoreCipherException e7) {
                c("encrypt", AndroidKeyStoreProviderFallback.KP_FB, e7);
                return new CipherResult.Error(e7);
            }
        }
    }

    /* JADX INFO: compiled from: KeyStoreCipher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/KeyStoreCipher$Companion;", "", "()V", "AES_SEPARATOR", "", "getAES_SEPARATOR$cipher_release$annotations", "OPERATION_DECRYPT", "OPERATION_ENCRYPT", "PARAM_CIPHER_OPERATION", "PARAM_CIPHER_PROVIDER_VERSION", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getAES_SEPARATOR$cipher_release$annotations() {
        }
    }
}
