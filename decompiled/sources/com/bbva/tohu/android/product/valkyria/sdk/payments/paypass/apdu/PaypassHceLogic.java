package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.apdu;

import android.content.Context;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.PaymentInitException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.BroadcastManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.payments.ContactlessTransactionResponseLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.AdviceManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.ConsentManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.ContactlessTransactionListenerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.McmLiteCryptoVintegrisImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.McmLiteProfileVintegrisImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKeyVintegrisImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.TransactionCredentialsManagerVintegrisImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.CardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileDataMdesCmsC;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.McmLite;
import com.mastercard.mpsdk.mcbp.mcmlite.McmLiteFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public class PaypassHceLogic implements HceLogic {
    private static final String TAG = "PaypassHceLogic";
    private static McmLite mcmLite;
    private AdviceManager adviceManager;
    private AuthenticationManager authenticationManager;
    private BroadcastManager broadcastManager;
    private CardProfile cardProfile;
    private CdCvmValidatorInformation cdCvmValidatorInformation;
    private ContactlessTransactionResponseLogic contactlessTransactionResponseLogic;
    private DeviceInfo deviceInfo;
    private boolean supportsCdcvm;
    private ContactlessTransactionListenerDefaultImpl transactionListener;
    private CryptoKeyManager cryptoKeyManager = ManagerFactory.getCryptoKeyManager();
    private ConsentManager consentManager = new ConsentManagerDefaultImpl();
    private EncoderService encoderService = ServiceFactory.getEncoderService();

    public PaypassHceLogic(CdCvmValidatorInformation cdCvmValidatorInformation, boolean z10, UserSharedPreferencesManager userSharedPreferencesManager, Context context) {
        this.cdCvmValidatorInformation = cdCvmValidatorInformation;
        this.adviceManager = new AdviceManagerDefaultImpl(z10, cdCvmValidatorInformation, userSharedPreferencesManager);
        BroadcastManager broadcastManagerCreate = BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_PAYMENT_ACTION);
        this.broadcastManager = broadcastManagerCreate;
        this.contactlessTransactionResponseLogic = LogicFactory.getTransactionResponseLogic(broadcastManagerCreate, context);
        this.deviceInfo = ServiceFactory.getDeviceInfo();
        this.supportsCdcvm = z10;
        this.authenticationManager = ManagerFactory.getAuthenticationManager(context);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public String getPanAsHex() {
        if (this.cardProfile.getMppLiteModule() == null || this.cardProfile.getMppLiteModule().getRemotePaymentData() == null) {
            return null;
        }
        return this.cardProfile.getMppLiteModule().getRemotePaymentData().getPan();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public void init(byte[] bArr, Token token, Bullet bullet, Context context) throws TohuSdkException {
        this.transactionListener = new ContactlessTransactionListenerDefaultImpl(this.contactlessTransactionResponseLogic, this.encoderService, this.deviceInfo, this.authenticationManager);
        TransactionCredentialsManagerVintegrisImpl transactionCredentialsManagerVintegrisImpl = new TransactionCredentialsManagerVintegrisImpl(new SingleKeyVintegrisImpl(bullet));
        CardProfile cardProfileMapCardProfileDataMdesToPojo = CardProfileDataMdesCmsC.valueOf(new String(bArr)).mapCardProfileDataMdesToPojo();
        this.cardProfile = cardProfileMapCardProfileDataMdesToPojo;
        try {
            McmLiteProfileVintegrisImpl mcmLiteProfileVintegrisImpl = new McmLiteProfileVintegrisImpl(cardProfileMapCardProfileDataMdesToPojo);
            McmLiteCryptoVintegrisImpl mcmLiteCryptoVintegrisImpl = new McmLiteCryptoVintegrisImpl(this.cryptoKeyManager);
            LogTohu.d(TAG, "Supports CDCVM %b", Boolean.valueOf(this.supportsCdcvm));
            if (this.supportsCdcvm) {
                mcmLite = McmLiteFactory.buildV1PlusWithCustomCryptoLibrary(mcmLiteCryptoVintegrisImpl, mcmLiteProfileVintegrisImpl, transactionCredentialsManagerVintegrisImpl, this.cdCvmValidatorInformation, this.consentManager, this.adviceManager, null, null);
            } else {
                mcmLite = McmLiteFactory.buildV1withCustomCryptoLibrary(mcmLiteCryptoVintegrisImpl, mcmLiteProfileVintegrisImpl, transactionCredentialsManagerVintegrisImpl, this.cdCvmValidatorInformation, this.consentManager, this.adviceManager);
            }
            try {
                mcmLite.startContactLessPayment(this.transactionListener, new BusinessLogicTransactionInformation());
            } catch (McmLiteInvalidInput e5) {
                throw new PaymentInitException(e5);
            }
        } catch (GeneralSecurityException e7) {
            throw new PaymentInitException(e7);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public byte[] processApdu(byte[] bArr) {
        return mcmLite.processApdu(bArr);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic
    public byte[] responseApduOnDeactivate(int i10) {
        return null;
    }
}
