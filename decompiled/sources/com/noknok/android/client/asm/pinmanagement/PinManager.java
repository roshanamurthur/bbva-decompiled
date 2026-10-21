package com.noknok.android.client.asm.pinmanagement;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.google.gson.Gson;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes11.dex */
public class PinManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PinDatabase f63287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f63288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IMatcher.IAntiHammeringCallback f63289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PinDatabase.PinConfig f63290d = null;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.pinmanagement.PinManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63291a;

        static {
            int[] iArr = new int[Algorithm.values().length];
            f63291a = iArr;
            try {
                iArr[Algorithm.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63291a[Algorithm.PBKDF2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Algorithm {
        SHA256,
        PBKDF2
    }

    public enum VerifyStatus {
        SUCCESS,
        FAILED,
        PIN_INVALID,
        PIN_ERASED,
        PIN_LOCKOUT
    }

    public PinManager(String str, Context context, IMatcher.IAntiHammeringCallback iAntiHammeringCallback) {
        this.f63287a = new PinDatabase(context, str);
        this.f63288b = context;
        this.f63289c = iAntiHammeringCallback;
    }

    private PinDatabase.PinData a(String str) {
        byte[] bArr;
        List<PinDatabase.PinData> usedPinsList;
        Logger.i("PinManager", "Create PIN data");
        SecretKey secretKeyGenerateKey = null;
        int iterationCount = 0;
        if (getPinConfig().nonReusableOldPINs <= 0 || (usedPinsList = this.f63287a.readUsedPinsList()) == null || usedPinsList.size() <= 0) {
            bArr = null;
        } else if (usedPinsList.get(0).getAlgorithm().equals(Algorithm.SHA256)) {
            bArr = new byte[16];
            System.arraycopy(usedPinsList.get(0).getData(), 0, bArr, 0, 16);
        } else {
            iterationCount = usedPinsList.get(0).getIterationCount();
            bArr = null;
        }
        byte[] bytes = str.getBytes(Charsets.utf8Charset);
        if (AppSDKConfig.getInstance(this.f63288b).get(AppSDKConfig.Key.pinSha256Only).getAsBoolean()) {
            return a(bytes, bArr);
        }
        Logger.i("PinManager", "Using PBKDF2");
        try {
            KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
            keyStoreInstance.load(null);
            secretKeyGenerateKey = (SecretKey) keyStoreInstance.getKey("NnlPinPbkdf2Key", null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e5) {
            Logger.e("PinManager", "Unable to get PBKDF2 key", e5);
        }
        if (secretKeyGenerateKey == null) {
            Logger.i("PinManager", "Generate a new PBKDF2 key.");
            try {
                KeyGenerator keyGeneratorInstance = CryptoProviderHelper.getKeyGeneratorInstance("HmacSHA256");
                keyGeneratorInstance.init(new KeyGenParameterSpec.Builder("NnlPinPbkdf2Key", 4).build());
                secretKeyGenerateKey = keyGeneratorInstance.generateKey();
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e7) {
                Logger.e("PinManager", "Unable to generate PBKDF2 key", e7);
            }
        }
        if (secretKeyGenerateKey != null) {
            try {
                return a(bytes, iterationCount, secretKeyGenerateKey);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e10) {
                Logger.e("PinManager", "Unable to calculate PBKDF2", e10);
            }
        }
        return a(bytes, bArr);
    }

    private byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private void c(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    public VerifyStatus changePin(String str, String str2) {
        if (str == null || str2 == null) {
            throw new InvalidParameterException("Invalid parameters, oldPIN or newPIN is null");
        }
        VerifyStatus verifyStatusVerify = verify(str);
        VerifyStatus verifyStatus = VerifyStatus.SUCCESS;
        if (!verifyStatusVerify.equals(verifyStatus)) {
            return verifyStatusVerify;
        }
        PinDatabase.PinData pinDataA = a(str2);
        this.f63287a.write(pinDataA);
        if (getPinConfig().nonReusableOldPINs > 0) {
            a(pinDataA);
        }
        return verifyStatus;
    }

    public void enroll(String str) {
        PinDatabase.PinData pinDataA = a(str);
        this.f63287a.write(pinDataA);
        if (getPinConfig().nonReusableOldPINs > 0) {
            a(pinDataA);
        }
    }

    public PinDatabase.PinConfig getPinConfig() {
        int i10;
        if (this.f63290d == null) {
            PinDatabase.PinConfig pinConfig = (PinDatabase.PinConfig) new Gson().fromJson(AppSDKConfig.getInstance(this.f63288b).get(AppSDKConfig.Key.pinConfig), PinDatabase.PinConfig.class);
            this.f63290d = pinConfig;
            int i11 = pinConfig.minLength;
            if (i11 < 4 || (i10 = pinConfig.maxLength) < i11 || pinConfig.maxFalseAttempts <= 1 || pinConfig.probationPeriod < 0 || pinConfig.lockoutPeriod < 0) {
                throw new IllegalArgumentException("The PIN options are invalid");
            }
            if (i11 != i10) {
                pinConfig.confirmationButton = true;
            }
            if (pinConfig.maxRepeatDigits == 0) {
                pinConfig.maxRepeatDigits = i10;
            }
            if (pinConfig.maxSequentialDigits == 0) {
                pinConfig.maxSequentialDigits = i10;
            }
            if (pinConfig.nonReusableOldPINs < 0) {
                pinConfig.nonReusableOldPINs = 0L;
            }
        }
        return this.f63290d;
    }

    public int getPinLength() {
        PinDatabase.PinData pinData = this.f63287a.read();
        if (pinData == null || pinData.pinLength == null) {
            return 0;
        }
        return pinData.getPinLength();
    }

    public boolean hasPinBeenUsed(String str) {
        List<PinDatabase.PinData> usedPinsList;
        long j10 = getPinConfig().nonReusableOldPINs;
        if (j10 != 0 && (usedPinsList = this.f63287a.readUsedPinsList()) != null && usedPinsList.size() != 0) {
            PinDatabase.PinData pinDataA = a(str);
            for (int i10 = 0; i10 < j10 && i10 < usedPinsList.size(); i10++) {
                if (usedPinsList.get(i10).data.equals(pinDataA.data)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEnrolled() {
        return this.f63287a.hasRegistrations();
    }

    public void remove() {
        this.f63287a.eraseDatabase();
    }

    public PinManager setAppId(String str) {
        this.f63287a.setAppId(str);
        return this;
    }

    public PinManager setCallerId(String str) {
        this.f63287a.setCallerId(str);
        return this;
    }

    public PinManager setGlobalEnrollment(boolean z10) {
        this.f63287a.setGlobalEnrollment(z10);
        return this;
    }

    public PinManager setKeyId(String str) {
        this.f63287a.setKeyId(str);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    public VerifyStatus verify(String str) {
        boolean zEquals;
        byte[] bytes = str.getBytes(Charsets.utf8Charset);
        PinDatabase.PinData pinData = this.f63287a.read();
        if (pinData == null) {
            Logger.e("PinManager", "Empty PIN Data");
            return VerifyStatus.FAILED;
        }
        byte[] data = pinData.getData();
        if (data == null) {
            Logger.e("PinManager", "Invalid PIN Data");
            return VerifyStatus.FAILED;
        }
        int i10 = AnonymousClass1.f63291a[pinData.getAlgorithm().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                Logger.e("PinManager", "Invalid algorithm");
            } else {
                Logger.i("PinManager", "Using PBKDF2 algorithm");
                try {
                    KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
                    keyStoreInstance.load(null);
                    zEquals = Arrays.equals(a(bytes, pinData.getIterationCount(), (SecretKey) keyStoreInstance.getKey("NnlPinPbkdf2Key", null)).getData(), data);
                } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException | UnrecoverableKeyException | CertificateException e5) {
                    Logger.e("PinManager", "Unable to calculate pbkdf2Hmac", e5);
                    return VerifyStatus.FAILED;
                }
            }
            if (this.f63289c.incrementFailedCount()) {
                return this.f63289c.getLockedState() == 0 ? VerifyStatus.PIN_ERASED : VerifyStatus.PIN_LOCKOUT;
            }
            return VerifyStatus.PIN_INVALID;
        }
        byte[] bArr = new byte[16];
        System.arraycopy(data, 0, bArr, 0, 16);
        int length = data.length - 16;
        byte[] bArr2 = new byte[length];
        System.arraycopy(data, 16, bArr2, 0, length);
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
            messageDigestInstance.update(b(bArr, bytes));
            zEquals = Arrays.equals(messageDigestInstance.digest(), bArr2);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e7) {
            Logger.e("PinManager", "Unable to calculate PIN Hash", e7);
            return VerifyStatus.FAILED;
        }
        if (zEquals) {
            this.f63289c.resetFailedCount();
            return VerifyStatus.SUCCESS;
        }
        if (this.f63289c.incrementFailedCount()) {
            if (this.f63289c.getLockedState() == 0) {
            }
        }
        return VerifyStatus.PIN_INVALID;
    }

    private void a(PinDatabase.PinData pinData) {
        List<PinDatabase.PinData> usedPinsList = this.f63287a.readUsedPinsList();
        usedPinsList.add(0, pinData);
        if (this.f63290d.nonReusableOldPINs < usedPinsList.size()) {
            usedPinsList.remove(usedPinsList.size() - 1);
        }
        this.f63287a.writeUsedPinsList(usedPinsList);
    }

    private PinDatabase.PinData a(byte[] bArr, int i10, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        Mac macInstance = CryptoProviderHelper.getMacInstance("HmacSHA256");
        macInstance.init(secretKey);
        byte[] bArrDoFinal = macInstance.doFinal(bArr);
        if (i10 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            do {
                c(bArrDoFinal, macInstance.doFinal(bArrDoFinal));
                i10++;
            } while (System.currentTimeMillis() - jCurrentTimeMillis < 100);
        } else {
            for (int i11 = 0; i11 < i10; i11++) {
                c(bArrDoFinal, macInstance.doFinal(bArrDoFinal));
            }
        }
        Logger.i("PinManager", i10 + " iterations has been done for hash calculation");
        if (bArrDoFinal == null) {
            return null;
        }
        PinDatabase.PinData pinData = new PinDatabase.PinData();
        pinData.setData(bArrDoFinal).setPinLength(bArr.length).setAlgorithm(Algorithm.PBKDF2).setIterationCount(i10);
        return pinData;
    }

    private PinDatabase.PinData a(byte[] bArr, byte[] bArr2) {
        Logger.i("PinManager", "Using SHA256");
        if (bArr2 == null) {
            bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
        }
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
            messageDigestInstance.update(b(bArr2, bArr));
            return new PinDatabase.PinData().setData(b(bArr2, messageDigestInstance.digest())).setPinLength(bArr.length);
        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
            throw new IllegalStateException("Unable to calculate PIN Hash", e5);
        }
    }
}
