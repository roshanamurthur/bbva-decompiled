package com.bbva.sl.ar.core.libmcrypt;

import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;

/* JADX INFO: loaded from: classes8.dex */
public interface LibMCrypt {
    String decryptHostData(String str) throws LibMCryptException;

    HostData encryptHostData(String str, String str2) throws LibMCryptException;

    HostData encryptHostData(String str, String str2, String str3) throws LibMCryptException;

    KpubData generateKpub(String str) throws LibMCryptException;
}
