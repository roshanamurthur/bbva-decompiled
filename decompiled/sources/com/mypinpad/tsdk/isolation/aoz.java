package com.mypinpad.tsdk.isolation;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes10.dex */
public interface aoz {
    CertificateFactory setDividerPadding(String str) throws CertificateException, NoSuchProviderException;

    Signature setY(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
