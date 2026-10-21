package com.google.crypto.tink;

import androidx.camera.core.processing.f;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class KmsClients {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<KmsClient> f46433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList<KmsClient> f46434b = new CopyOnWriteArrayList<>();

    public static void add(KmsClient kmsClient) {
        f46434b.add(kmsClient);
    }

    public static KmsClient get(String str) throws GeneralSecurityException {
        for (KmsClient kmsClient : f46434b) {
            if (kmsClient.doesSupport(str)) {
                return kmsClient;
            }
        }
        throw new GeneralSecurityException(f.d("No KMS client does support: ", str));
    }

    public static synchronized KmsClient getAutoLoaded(String str) throws GeneralSecurityException {
        KmsClient next;
        try {
            if (f46433a == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ServiceLoader.load(KmsClient.class).iterator();
                while (it.hasNext()) {
                    arrayList.add((KmsClient) it.next());
                }
                f46433a = Collections.unmodifiableList(arrayList);
            }
            Iterator<KmsClient> it2 = f46433a.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (next.doesSupport(str)) {
                }
            }
            throw new GeneralSecurityException("No KMS client does support: " + str);
        } catch (Throwable th2) {
            throw th2;
        }
        return next;
    }
}
