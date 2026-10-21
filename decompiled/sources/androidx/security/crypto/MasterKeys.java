package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@Deprecated
public final class MasterKeys {

    @NonNull
    public static final KeyGenParameterSpec AES256_GCM_SPEC = new KeyGenParameterSpec.Builder(MasterKey.DEFAULT_MASTER_KEY_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23446a = new Object();

    @NonNull
    public static String getOrCreate(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{CodePackage.GCM})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (f23446a) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KeyStoreProvider.ANDROID_KEYSTORE);
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e5) {
                    throw new GeneralSecurityException(e5.getMessage(), e5);
                }
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }
}
