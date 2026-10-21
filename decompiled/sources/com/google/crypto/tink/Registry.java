package com.google.crypto.tink;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import bf.e;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46453a = Logger.getLogger(Registry.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<e> f46454b = new AtomicReference<>(new e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f46455c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f46456d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f46457e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f46458f = new ConcurrentHashMap();

    public interface a {
        KeyData a(ByteString byteString, InputStream inputStream) throws GeneralSecurityException;
    }

    public static synchronized <KeyProtoT extends MessageLite, KeyFormatProtoT extends MessageLite> void a(String str, Map<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> map, boolean z10) throws GeneralSecurityException {
        if (z10) {
            try {
                ConcurrentHashMap concurrentHashMap = f46456d;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (f46454b.get().f25200a.containsKey(str)) {
                for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!f46458f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + entry.getKey() + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (f46458f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + entry2.getKey());
                    }
                }
            }
        }
    }

    @Deprecated
    public static synchronized void addCatalogue(String str, Catalogue<?> catalogue) throws GeneralSecurityException {
        try {
            if (str == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentHashMap concurrentHashMap = f46457e;
            Locale locale = Locale.US;
            if (concurrentHashMap.containsKey(str.toLowerCase(locale))) {
                if (!catalogue.getClass().getName().equals(((Catalogue) concurrentHashMap.get(str.toLowerCase(locale))).getClass().getName())) {
                    f46453a.warning("Attempted overwrite of a catalogueName catalogue for name ".concat(str));
                    throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                }
            }
            concurrentHashMap.put(str.toLowerCase(locale), catalogue);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized Map<String, KeyTemplate> b() {
        return Collections.unmodifiableMap(f46458f);
    }

    public static <KeyFormatProtoT extends MessageLite> void c(String str, Map<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> map) {
        for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry : map.entrySet()) {
            f46458f.put(entry.getKey(), KeyTemplate.create(str, entry.getValue().keyFormat.toByteArray(), entry.getValue().outputPrefixType));
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentHashMap concurrentHashMap = f46457e;
        Locale locale = Locale.US;
        Catalogue<?> catalogue = (Catalogue) concurrentHashMap.get(str.toLowerCase(locale));
        if (catalogue != null) {
            return catalogue;
        }
        String strF = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strF = u.f(strF, "Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strF = u.f(strF, "Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strF = u.f(strF, "Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strF = u.f(strF, "Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strF = u.f(strF, "Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strF = u.f(strF, "Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strF = u.f(strF, "Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strF);
    }

    @Nullable
    public static Class<?> getInputPrimitive(Class<?> cls) {
        try {
            return MutablePrimitiveRegistry.globalInstance().getInputPrimitiveClass(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String str) throws GeneralSecurityException {
        return f46454b.get().b(null, str);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, MessageLite messageLite) throws GeneralSecurityException {
        return (P) f46454b.get().b(null, str).getPrimitive(messageLite);
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(str);
        if (keyManager instanceof PrivateKeyManager) {
            return ((PrivateKeyManager) keyManager).getPublicKeyData(byteString);
        }
        throw new GeneralSecurityException(h0.b("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static KeyManager<?> getUntypedKeyManager(String str) throws GeneralSecurityException {
        return f46454b.get().a(str).f();
    }

    public static synchronized List<String> keyTemplates() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(f46458f.keySet());
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!((Boolean) f46456d.get(keyTemplate.getTypeUrl())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKey(keyTemplate.getValue());
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newKeyData(keyTemplate.f46412a);
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, boolean z10) throws GeneralSecurityException {
        try {
            if (privateKeyTypeManager == null || keyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            AtomicReference<e> atomicReference = f46454b;
            e eVar = new e(atomicReference.get());
            eVar.c(privateKeyTypeManager, keyTypeManager);
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = keyTypeManager.getKeyType();
            a(keyType, z10 ? privateKeyTypeManager.keyFactory().keyFormats() : Collections.emptyMap(), z10);
            a(keyType2, Collections.emptyMap(), false);
            if (!atomicReference.get().f25200a.containsKey(keyType)) {
                f46455c.put(keyType, new com.google.crypto.tink.a(privateKeyTypeManager));
                if (z10) {
                    c(privateKeyTypeManager.getKeyType(), privateKeyTypeManager.keyFactory().keyFormats());
                }
            }
            ConcurrentHashMap concurrentHashMap = f46456d;
            concurrentHashMap.put(keyType, Boolean.valueOf(z10));
            concurrentHashMap.put(keyType2, Boolean.FALSE);
            atomicReference.set(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager) throws GeneralSecurityException {
        registerKeyManager((KeyManager) keyManager, true);
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(PrimitiveWrapper<B, P> primitiveWrapper) throws GeneralSecurityException {
        MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(primitiveWrapper);
    }

    public static synchronized void restrictToFipsIfEmpty() throws GeneralSecurityException {
        if (TinkFipsUtil.useOnlyFips()) {
            return;
        }
        if (!f46454b.get().f25200a.isEmpty()) {
            throw new GeneralSecurityException("Could not enable FIPS mode as Registry is not empty.");
        }
        TinkFipsUtil.setFipsRestricted();
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> cls) throws GeneralSecurityException {
        return (P) MutablePrimitiveRegistry.globalInstance().wrap(primitiveSet, cls);
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    public static <P> KeyManager<P> getKeyManager(String str, Class<P> cls) throws GeneralSecurityException {
        e eVar = f46454b.get();
        eVar.getClass();
        cls.getClass();
        return eVar.b(cls, str);
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (((Boolean) f46456d.get(keyTemplate.getTypeUrl())).booleanValue()) {
        } else {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKeyData(keyTemplate.getValue());
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager, boolean z10) throws GeneralSecurityException {
        try {
            if (keyManager != null) {
                AtomicReference<e> atomicReference = f46454b;
                e eVar = new e(atomicReference.get());
                eVar.d(keyManager);
                if (TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
                    String keyType = keyManager.getKeyType();
                    a(keyType, Collections.emptyMap(), z10);
                    f46456d.put(keyType, Boolean.valueOf(z10));
                    atomicReference.set(eVar);
                } else {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static <P> P getPrimitive(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        e eVar = f46454b.get();
        eVar.getClass();
        cls.getClass();
        return (P) eVar.b(cls, str).getPrimitive(messageLite);
    }

    public static synchronized MessageLite newKey(String str, MessageLite messageLite) throws GeneralSecurityException {
        KeyManager keyManager;
        keyManager = getKeyManager(str);
        if (((Boolean) f46456d.get(str)).booleanValue()) {
        } else {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
        }
        return keyManager.newKey(messageLite);
    }

    @Deprecated
    public static <P> P getPrimitive(String str, ByteString byteString) throws GeneralSecurityException {
        return (P) f46454b.get().b(null, str).getPrimitive(byteString);
    }

    public static <P> P getPrimitive(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        e eVar = f46454b.get();
        eVar.getClass();
        cls.getClass();
        return (P) eVar.b(cls, str).getPrimitive(byteString);
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(KeyTypeManager<KeyProtoT> keyTypeManager, boolean z10) throws GeneralSecurityException {
        try {
            if (keyTypeManager != null) {
                AtomicReference<e> atomicReference = f46454b;
                e eVar = new e(atomicReference.get());
                eVar.e(keyTypeManager);
                String keyType = keyTypeManager.getKeyType();
                a(keyType, z10 ? keyTypeManager.keyFactory().keyFormats() : Collections.emptyMap(), z10);
                if (!atomicReference.get().f25200a.containsKey(keyType)) {
                    f46455c.put(keyType, new com.google.crypto.tink.a(keyTypeManager));
                    if (z10) {
                        c(keyType, keyTypeManager.keyFactory().keyFormats());
                    }
                }
                f46456d.put(keyType, Boolean.valueOf(z10));
                atomicReference.set(eVar);
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public static <P> P getPrimitive(String str, byte[] bArr) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr));
    }

    public static <P> P getPrimitive(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr), cls);
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager) throws GeneralSecurityException {
        registerKeyManager(str, keyManager, true);
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager, boolean z10) throws GeneralSecurityException {
        try {
            if (keyManager != null) {
                if (str.equals(keyManager.getKeyType())) {
                    registerKeyManager(keyManager, z10);
                } else {
                    throw new GeneralSecurityException("Manager does not support key type " + str + Constant.DOT_STRING);
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
