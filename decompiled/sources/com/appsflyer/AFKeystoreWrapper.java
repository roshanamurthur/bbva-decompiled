package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public class AFKeystoreWrapper {
    private Context valueOf;
    public KeyStore values;
    public final Object AFInAppEventParameterName = new Object();
    public String AFKeystoreWrapper = "";
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.valueOf = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            this.values = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e5);
        }
    }

    private static boolean AFInAppEventType(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventParameterName) {
            sb2.append(this.AFKeystoreWrapper);
            sb2.append(",KSAppsFlyerRICounter=");
            sb2.append(this.AFInAppEventType);
        }
        return sb2.toString();
    }

    public final String AFKeystoreWrapper() {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            str = this.AFKeystoreWrapper;
        }
        return str;
    }

    public final boolean valueOf() {
        boolean z10;
        synchronized (this.AFInAppEventParameterName) {
            try {
                KeyStore keyStore = this.values;
                z10 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement != null && AFInAppEventType(strNextElement)) {
                                String[] strArrSplit = strNextElement.split(",");
                                if (strArrSplit.length != 3) {
                                    break;
                                }
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(strNextElement));
                                z10 = true;
                                String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                                String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                                if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                    break;
                                    break;
                                }
                                this.AFKeystoreWrapper = strArrSplit2[1].trim();
                                this.AFInAppEventType = Integer.parseInt(strArrSplit3[1].trim());
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th2.getClass().getName());
                        AFLogger.afErrorLog(sb2.toString(), th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z10;
    }

    public final int AFInAppEventType() {
        int i10;
        synchronized (this.AFInAppEventParameterName) {
            i10 = this.AFInAppEventType;
        }
        return i10;
    }

    public final void valueOf(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFInAppEventParameterName) {
                try {
                    if (!this.values.containsAlias(str)) {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", KeyStoreProvider.ANDROID_KEYSTORE);
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    } else {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th3.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th3);
        }
    }
}
