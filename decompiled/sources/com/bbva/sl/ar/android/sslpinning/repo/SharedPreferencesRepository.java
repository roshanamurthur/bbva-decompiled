package com.bbva.sl.ar.android.sslpinning.repo;

import android.content.SharedPreferences;
import com.bbva.proguarded.android.sslpinning.c;
import com.bbva.proguarded.android.sslpinning.d;
import com.bbva.proguarded.android.sslpinning.f;
import com.bbva.proguarded.android.sslpinning.k;
import com.bbva.proguarded.android.sslpinning.y;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.RepositoryException;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class SharedPreferencesRepository implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f36598a = Logger.getLogger(y.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f36599c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f36600b;

    @Override // com.bbva.proguarded.android.sslpinning.k
    public final synchronized d a(PublicKey publicKey) throws RepositoryException {
        synchronized (f36599c) {
            try {
                try {
                    if (!this.f36600b.contains("__PROTECTED_SITECATALOG__")) {
                        return null;
                    }
                    return d.a(f.b(this.f36600b.getString("__PROTECTED_SITECATALOG__", null)), publicKey);
                } catch (InitializationException e5) {
                    throw new RepositoryException("Error building catalog from stored data", e5);
                }
            } catch (UnsupportedEncodingException e7) {
                throw new RepositoryException("Error loading catalog from secure element", e7);
            }
        }
    }

    @Override // com.bbva.proguarded.android.sslpinning.k
    public final synchronized String a(String str) throws RepositoryException {
        synchronized (f36599c) {
            try {
                if (!this.f36600b.contains(str)) {
                    return null;
                }
                return f.b(this.f36600b.getString(str, null));
            } catch (UnsupportedEncodingException e5) {
                throw new RepositoryException("Error loading data from secure element", e5);
            }
        }
    }

    @Override // com.bbva.proguarded.android.sslpinning.k
    public final void a(c cVar, boolean z10) {
        f36598a.info("Initializing Shared Preferences...");
        SharedPreferences sharedPreferences = cVar.f36133d.getSharedPreferences("SSLPINNING_PREFS", 0);
        this.f36600b = sharedPreferences;
        if (z10) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    @Override // com.bbva.proguarded.android.sslpinning.k
    public final synchronized void a(d dVar) throws RepositoryException {
        synchronized (f36599c) {
            try {
                if (dVar == null) {
                    throw new RepositoryException(403, "Error saving catalog to secure element: null catalog");
                }
                String strA = f.a(dVar.f36143c);
                SharedPreferences.Editor editorEdit = this.f36600b.edit();
                editorEdit.putString("__PROTECTED_SITECATALOG__", strA);
                editorEdit.commit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bbva.proguarded.android.sslpinning.k
    public final synchronized void a(String str, String str2) throws RepositoryException {
        synchronized (f36599c) {
            try {
                if (str2 == null) {
                    throw new RepositoryException(403, "Error saving data to secure element: null value");
                }
                String strA = f.a(str2);
                SharedPreferences.Editor editorEdit = this.f36600b.edit();
                editorEdit.putString(str, strA);
                editorEdit.commit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
