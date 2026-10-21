package com.bbva.sl.ar.android.libkeymanagement.management;

import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface IManagement {
    Map<String, AuthenticationObject> load(Map<String, AuthenticationObject> map) throws KeyManagementException;

    boolean needsLoad() throws KeyManagementException;

    Map<String, AuthenticationObject> renew(Map<String, AuthenticationObject> map, boolean z10) throws KeyManagementException;
}
