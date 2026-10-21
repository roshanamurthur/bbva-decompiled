package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.RepositoryException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes8.dex */
public interface k {
    d a(PublicKey publicKey) throws RepositoryException;

    String a(String str) throws RepositoryException;

    void a(c cVar, boolean z10) throws RepositoryException;

    void a(d dVar) throws RepositoryException;

    void a(String str, String str2) throws RepositoryException;
}
