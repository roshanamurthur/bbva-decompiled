package com.mastercard.mpsdk.mcbp.mcmlite;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.McmLiteImpl;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class McmLiteFactory {
    private static final /* synthetic */ McmLiteFactory[] $VALUES;
    public static final McmLiteFactory INSTANCE;

    static {
        McmLiteFactory mcmLiteFactory = new McmLiteFactory("INSTANCE", 0);
        INSTANCE = mcmLiteFactory;
        $VALUES = new McmLiteFactory[]{mcmLiteFactory};
    }

    public McmLiteFactory() {
        throw null;
    }

    public static McmLite buildV1PlusWithCustomCryptoLibrary(McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2) {
        return McmLiteImpl.buildMcmLiteForMcbp1Plus(null, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager, list, list2, true);
    }

    public static McmLite buildV1withCustomCryptoLibrary(McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager) {
        return McmLiteImpl.buildMcmLiteV1(null, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager);
    }

    public static McmLiteFactory valueOf(String str) {
        return (McmLiteFactory) Enum.valueOf(McmLiteFactory.class, str);
    }

    public static McmLiteFactory[] values() {
        return (McmLiteFactory[]) $VALUES.clone();
    }

    public static McmLite buildV1PlusWithCustomCryptoLibrary(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2) {
        return McmLiteImpl.buildMcmLiteForMcbp1Plus(mcmLiteCrypto, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager, list, list2, true);
    }

    public static McmLite buildV1withCustomCryptoLibrary(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager) {
        return McmLiteImpl.buildMcmLiteV1(mcmLiteCrypto, mcmLiteProfile, transactionCredentialsManager, cdCvmValidatorInformation, consentManager, adviceManager);
    }
}
