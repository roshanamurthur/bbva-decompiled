package com.noknok.android.client.asm.authenticator;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyInfo;
import androidx.camera.core.processing.f;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NNL_KS_SFT_UAF' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class KsLabel {
    public static final KsLabel NNL_KS_FIDO2;
    public static final KsLabel NNL_KS_RSA_UAF;
    public static final KsLabel NNL_KS_SE_RSA_UAF;
    public static final KsLabel NNL_KS_SE_UAF;
    public static final KsLabel NNL_KS_SFT_RSA_UAF;
    public static final KsLabel NNL_KS_SFT_UAF;
    public static final KsLabel NNL_KS_UAF;
    public static final KsLabel NNL_KS_WATCH_UAF;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Boolean> f63136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ KsLabel[] f63137e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tabulator f63138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Descriptor f63139b;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.authenticator.KsLabel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63140a;

        static {
            int[] iArr = new int[KSUtils.Storage.values().length];
            f63140a = iArr;
            try {
                iArr[KSUtils.Storage.Software.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63140a[KSUtils.Storage.Hardware.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63140a[KSUtils.Storage.SecureElement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Descriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private KSUtils.Alg f63141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private KSUtils.Storage f63142b;

        private Descriptor() {
        }

        public /* synthetic */ Descriptor(int i10) {
            this();
        }
    }

    static {
        int i10 = 0;
        Descriptor descriptor = new Descriptor(i10);
        KSUtils.Alg alg = KSUtils.Alg.EC;
        descriptor.f63141a = alg;
        KSUtils.Storage storage = KSUtils.Storage.Software;
        descriptor.f63142b = storage;
        KsLabel ksLabel = new KsLabel("NNL_KS_SFT_UAF", 0, descriptor);
        NNL_KS_SFT_UAF = ksLabel;
        Descriptor descriptor2 = new Descriptor(i10);
        KSUtils.Alg alg2 = KSUtils.Alg.RSA;
        descriptor2.f63141a = alg2;
        descriptor2.f63142b = storage;
        KsLabel ksLabel2 = new KsLabel("NNL_KS_SFT_RSA_UAF", 1, descriptor2);
        NNL_KS_SFT_RSA_UAF = ksLabel2;
        Descriptor descriptor3 = new Descriptor(i10);
        descriptor3.f63141a = alg;
        KSUtils.Storage storage2 = KSUtils.Storage.Hardware;
        descriptor3.f63142b = storage2;
        KsLabel ksLabel3 = new KsLabel("NNL_KS_UAF", 2, descriptor3);
        NNL_KS_UAF = ksLabel3;
        Descriptor descriptor4 = new Descriptor(i10);
        descriptor4.f63141a = alg2;
        descriptor4.f63142b = storage2;
        KsLabel ksLabel4 = new KsLabel("NNL_KS_RSA_UAF", 3, descriptor4);
        NNL_KS_RSA_UAF = ksLabel4;
        Descriptor descriptor5 = new Descriptor(i10);
        descriptor5.f63141a = alg;
        KSUtils.Storage storage3 = KSUtils.Storage.SecureElement;
        descriptor5.f63142b = storage3;
        KsLabel ksLabel5 = new KsLabel("NNL_KS_SE_UAF", 4, descriptor5);
        NNL_KS_SE_UAF = ksLabel5;
        Descriptor descriptor6 = new Descriptor(i10);
        descriptor6.f63141a = alg2;
        descriptor6.f63142b = storage3;
        KsLabel ksLabel6 = new KsLabel("NNL_KS_SE_RSA_UAF", 5, descriptor6);
        NNL_KS_SE_RSA_UAF = ksLabel6;
        Descriptor descriptor7 = new Descriptor(i10);
        descriptor7.f63141a = alg;
        descriptor7.f63142b = storage2;
        KsLabel ksLabel7 = new KsLabel("NNL_KS_FIDO2", 6, descriptor7);
        NNL_KS_FIDO2 = ksLabel7;
        Descriptor descriptor8 = new Descriptor(i10);
        descriptor8.f63141a = alg;
        descriptor8.f63142b = storage;
        KsLabel ksLabel8 = new KsLabel("NNL_KS_WATCH_UAF", 7, descriptor8);
        NNL_KS_WATCH_UAF = ksLabel8;
        f63137e = new KsLabel[]{ksLabel, ksLabel2, ksLabel3, ksLabel4, ksLabel5, ksLabel6, ksLabel7, ksLabel8};
        f63135c = "KsLabel";
        f63136d = new HashMap();
    }

    private KsLabel(String str, int i10, Descriptor descriptor) {
        super(str, i10);
        this.f63138a = Tabulator.getInstance();
        this.f63139b = descriptor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    @SuppressLint({"WrongConstant"})
    private boolean a(Context context) {
        String keyAlg = getAlg().getKeyAlg();
        if (!f63136d.containsKey(keyAlg)) {
            String strGenerateKeyStoreKeyPair = KSUtils.generateKeyStoreKeyPair(context, this, KSUtils.AkMode.KS, null);
            boolean zIsInsideSecureHardware = false;
            if (strGenerateKeyStoreKeyPair != null) {
                try {
                    KeyStore keyStoreInstance = CryptoProviderHelper.getKeyStoreInstance();
                    keyStoreInstance.load(null);
                    PrivateKey privateKey = (PrivateKey) keyStoreInstance.getKey(strGenerateKeyStoreKeyPair, null);
                    if (!CryptoProviderHelper.isPasstroughEnabled()) {
                        zIsInsideSecureHardware = ((KeyInfo) CryptoProviderHelper.getKeyFactoryInstance(privateKey.getAlgorithm()).getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
                    }
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | InvalidKeySpecException e5) {
                    Logger.e(f63135c, "Could not retrieve temporary key from KeyStore", e5);
                }
                KSUtils.removeKey(strGenerateKeyStoreKeyPair);
            }
            f63136d.put(keyAlg, Boolean.valueOf(zIsInsideSecureHardware));
        }
        return ((Boolean) f63136d.get(keyAlg)).booleanValue();
    }

    public static KsLabel byName(String str) {
        for (KsLabel ksLabel : values()) {
            if (ksLabel.name().equals(str)) {
                return ksLabel;
            }
        }
        return null;
    }

    public static KsLabel valueOf(String str) {
        return (KsLabel) Enum.valueOf(KsLabel.class, str);
    }

    public static KsLabel[] values() {
        return (KsLabel[]) f63137e.clone();
    }

    public KSUtils.Alg getAlg() {
        return this.f63139b.f63141a;
    }

    public KSUtils.Storage getStorage() {
        return this.f63139b.f63142b;
    }

    @TargetApi(28)
    public boolean isSupported(Context context) {
        String str = f63135c;
        boolean zA = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (!sharedPreferences.contains("apiLevel") || sharedPreferences.getInt("algorithmVersion", -1) != 1) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.putInt("apiLevel", Build.VERSION.SDK_INT);
            editorEdit.putInt("algorithmVersion", 1);
            editorEdit.apply();
        }
        if (sharedPreferences.contains(name())) {
            return sharedPreferences.getBoolean(name(), false);
        }
        Tabulator tabulator = this.f63138a;
        StringBuilder sbE = f.e(str, ":Test support for ");
        sbE.append(name());
        tabulator.startTimer(sbE.toString());
        try {
            int i10 = AnonymousClass1.f63140a[this.f63139b.f63142b.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    zA = a(context);
                } else if (i10 == 3 && Build.VERSION.SDK_INT >= 28) {
                    try {
                        String strGenerateKeyStoreKeyPair = KSUtils.generateKeyStoreKeyPair(context, this, KSUtils.AkMode.KS, null);
                        if (strGenerateKeyStoreKeyPair != null) {
                            KSUtils.removeKey(strGenerateKeyStoreKeyPair);
                        }
                        zA = true;
                    } catch (ProviderException e5) {
                        if (a.a(e5)) {
                            Logger.w(f63135c, "StrongBox KeyMaster is not available", e5);
                        } else {
                            Logger.e(f63135c, "Problem during key generation", e5);
                        }
                    }
                }
            } else if (name().equals("NNL_KS_WATCH_UAF") || !a(context)) {
                zA = true;
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putBoolean(name(), zA);
            editorEdit2.apply();
            this.f63138a.endTimer(f63135c + ":Test support for " + name());
            return zA;
        } catch (Throwable th2) {
            this.f63138a.endTimer(f63135c + ":Test support for " + name());
            throw th2;
        }
    }
}
