package com.bbva.localstorage.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SecureKeyOperation.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/localstorage/model/SecureKeyOperation;", "", "UNPROTECT", "PROTECT", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class SecureKeyOperation {
    private static final /* synthetic */ SecureKeyOperation[] $VALUES;
    public static final SecureKeyOperation PROTECT;
    public static final SecureKeyOperation UNPROTECT;

    static {
        SecureKeyOperation secureKeyOperation = new SecureKeyOperation("UNPROTECT", 0);
        UNPROTECT = secureKeyOperation;
        SecureKeyOperation secureKeyOperation2 = new SecureKeyOperation("PROTECT", 1);
        PROTECT = secureKeyOperation2;
        $VALUES = new SecureKeyOperation[]{secureKeyOperation, secureKeyOperation2};
    }

    public SecureKeyOperation() {
        throw null;
    }

    public static SecureKeyOperation valueOf(String str) {
        return (SecureKeyOperation) Enum.valueOf(SecureKeyOperation.class, str);
    }

    public static SecureKeyOperation[] values() {
        return (SecureKeyOperation[]) $VALUES.clone();
    }
}
