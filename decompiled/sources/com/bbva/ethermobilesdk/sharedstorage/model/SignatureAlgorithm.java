package com.bbva.ethermobilesdk.sharedstorage.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AppSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/SignatureAlgorithm;", "", "SHA1", "SHA256", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class SignatureAlgorithm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SignatureAlgorithm[] $VALUES;
    public static final SignatureAlgorithm SHA1;
    public static final SignatureAlgorithm SHA256;

    static {
        SignatureAlgorithm signatureAlgorithm = new SignatureAlgorithm("SHA1", 0);
        SHA1 = signatureAlgorithm;
        SignatureAlgorithm signatureAlgorithm2 = new SignatureAlgorithm("SHA256", 1);
        SHA256 = signatureAlgorithm2;
        SignatureAlgorithm[] signatureAlgorithmArr = {signatureAlgorithm, signatureAlgorithm2};
        $VALUES = signatureAlgorithmArr;
        $ENTRIES = EnumEntriesKt.enumEntries(signatureAlgorithmArr);
    }

    public SignatureAlgorithm() {
        throw null;
    }

    @NotNull
    public static EnumEntries<SignatureAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static SignatureAlgorithm valueOf(String str) {
        return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
    }

    public static SignatureAlgorithm[] values() {
        return (SignatureAlgorithm[]) $VALUES.clone();
    }
}
