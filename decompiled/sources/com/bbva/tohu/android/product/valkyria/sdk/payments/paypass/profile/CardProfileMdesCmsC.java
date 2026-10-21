package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.CardRiskManagementData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MppLiteModule;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.Records;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class CardProfileMdesCmsC implements DigitizedCardProfile {

    @JSON(name = "digitizedCardId")
    private String digitizedCardId;

    @JSON(name = "maximumPinTry")
    private int maximumPinTry;

    @JSON(name = "mppLiteModule")
    private MppLiteModuleMdesCmsC mppLiteModule = null;

    @JSON(name = "businessLogicModule")
    private BusinessLogicModuleMdesCmsC businessLogicModule = null;

    @JSON(include = false)
    private byte[] iccKek = null;

    @JSON(include = false)
    private byte[] kekId = null;

    private CardProfileMdesCmsC() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlternateContactlessPaymentData buildAlternateContactlessPaymentData() {
        return new AlternateContactlessPaymentData() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.7
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData
            public byte[] getAid() {
                if (CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData() == null) {
                    return new byte[0];
                }
                String aid = CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData().getAid();
                return (aid == null || aid.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(aid);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData
            public byte[] getCiacDecline() {
                if (CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData() == null) {
                    return new byte[0];
                }
                String ciacDecline = CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData().getCiacDecline();
                return (ciacDecline == null || ciacDecline.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(ciacDecline);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData
            public byte[] getCvrMaskAnd() {
                if (CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData() == null) {
                    return new byte[0];
                }
                String cvrMaskAnd = CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData().getCvrMaskAnd();
                return (cvrMaskAnd == null || cvrMaskAnd.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(cvrMaskAnd);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData
            public byte[] getGpoResponse() {
                if (CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData() == null) {
                    return new byte[0];
                }
                String gpoResponse = CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData().getGpoResponse();
                return (gpoResponse == null || gpoResponse.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(gpoResponse);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.AlternateContactlessPaymentData
            public byte[] getPaymentFci() {
                if (CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData() == null) {
                    return new byte[0];
                }
                String paymentFci = CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAlternateContactlessPaymentData().getPaymentFci();
                return (paymentFci == null || paymentFci.length() == 0) ? new byte[0] : McmLiteUtils.byteArrayFromHexString(paymentFci);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BusinessLogicModule buildBusinessLogicModule() {
        final int cvmResetTimeout = this.businessLogicModule.getCvmResetTimeout();
        final int dualTapResetTimeout = this.businessLogicModule.getDualTapResetTimeout();
        final String applicationLifeCycleData = this.businessLogicModule.getApplicationLifeCycleData();
        final String cardLayoutDescription = this.businessLogicModule.getCardLayoutDescription();
        final String securityWord = this.businessLogicModule.getSecurityWord();
        final String[] cardholderValidators = this.businessLogicModule.getCardholderValidators();
        return new BusinessLogicModule() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.1
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public byte[] getApplicationLifeCycleData() {
                String str = applicationLifeCycleData;
                return str == null ? new byte[0] : McmLiteUtils.byteArrayFromHexString(str);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public byte[] getCardLayoutDescription() {
                String str = cardLayoutDescription;
                return str == null ? new byte[0] : McmLiteUtils.byteArrayFromHexString(str);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public String[] getCardholderValidators() {
                return cardholderValidators;
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public int getCvmResetTimeout() {
                return cvmResetTimeout;
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public int getDualTapResetTimeout() {
                return dualTapResetTimeout;
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public MagstripeCvmIssuerOptions getMagstripeCvmIssuerOptions() {
                return CardProfileMdesCmsC.this.buildMagstripeCvmIssuerOptions();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public MChipCvmIssuerOptions getMchipCvmIssuerOptions() {
                return CardProfileMdesCmsC.this.buildMChipCvmIssuerOptions();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.BusinessLogicModule
            public byte[] getSecurityWord() {
                String str = securityWord;
                return str == null ? new byte[0] : McmLiteUtils.byteArrayFromHexString(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CardRiskManagementData buildCardRiskManagementData() {
        return new CardRiskManagementData() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.10
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.CardRiskManagementData
            public byte[] getAdditionalCheckTable() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getCardRiskManagementData().getAdditionalCheckTable());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.CardRiskManagementData
            public byte[] getCrmCountryCode() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getCardRiskManagementData().getCrmCountryCode());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContactlessPaymentData buildContactlessPaymentData() {
        return new ContactlessPaymentData() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.6
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getAid() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getAid());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public AlternateContactlessPaymentData getAlternateContactlessPaymentData() {
                return CardProfileMdesCmsC.this.buildAlternateContactlessPaymentData();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getCdol1RelatedDataLength() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getCdol1RelatedDataLength());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getCiacDecline() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getCiacDecline());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getCiacDeclineOnPpms() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getCiacDeclineOnPpms());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getCvrMaskAnd() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getCvrMaskAnd());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getGpoResponse() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getGpoResponse());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents() {
                return CardProfileMdesCmsC.this.buildIccPrivateKeyCrtComponents();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getIssuerApplicationData() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIssuerApplicationData());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getPaymentFci() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getPaymentFci());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getPinIvCvc3Track2() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getPinIvCvc3Track2());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public byte[] getPpseFci() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getPpseFci());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.ContactlessPaymentData
            public Records[] getRecords() {
                return CardProfileMdesCmsC.this.buildRecords();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IccPrivateKeyCrtComponents buildIccPrivateKeyCrtComponents() {
        return new IccPrivateKeyCrtComponents() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.9
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents
            public byte[] getDp() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIccPrivateKeyCrtComponents().getDpValue());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents
            public byte[] getDq() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIccPrivateKeyCrtComponents().getDqValue());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents
            public byte[] getP() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIccPrivateKeyCrtComponents().getpValue());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents
            public byte[] getQ() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIccPrivateKeyCrtComponents().getqValue());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.IccPrivateKeyCrtComponents
            public byte[] getU() {
                return McmLiteUtils.byteArrayFromHexString(CardProfileMdesCmsC.this.mppLiteModule.getContactlessPaymentData().getIccPrivateKeyCrtComponents().getuValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MChipCvmIssuerOptions buildMChipCvmIssuerOptions() {
        return new MChipCvmIssuerOptions() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.2
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isAckAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getAckAlwaysRequiredIfCurrencyProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isAckAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getAckAutomaticallyResetByApplication() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isAckAutomaticallyResetByApplication();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getAckPreEntryAllowed() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isAckPreEntryAllowed();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isPinAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getPinAlwaysRequiredIfCurrencyProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isPinAlwaysRequiredIfCurrencyProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getPinAutomaticallyResetByApplication() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isPinAutomaticallyResetByApplication();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MChipCvmIssuerOptions
            public boolean getPinPreEntryAllowed() {
                return CardProfileMdesCmsC.this.businessLogicModule.getmChipCvmIssuerOptions().isPinPreEntryAllowed();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MagstripeCvmIssuerOptions buildMagstripeCvmIssuerOptions() {
        return new MagstripeCvmIssuerOptions() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.3
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isAckAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getAckAlwaysRequiredIfCurrencyProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isAckAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getAckAutomaticallyResetByApplication() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isAckAutomaticallyResetByApplication();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getAckPreEntryAllowed() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isAckPreEntryAllowed();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isPinAlwaysRequiredIfCurrencyNotProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getPinAlwaysRequiredIfCurrencyProvided() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isPinAlwaysRequiredIfCurrencyProvided();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getPinAutomaticallyResetByApplication() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isPinAutomaticallyResetByApplication();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MagstripeCvmIssuerOptions
            public boolean getPinPreEntryAllowed() {
                return CardProfileMdesCmsC.this.businessLogicModule.getMagstripeCvmIssuerOptions().isPinPreEntryAllowed();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MppLiteModule buildMppLiteModule() {
        return new MppLiteModule() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.4
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MppLiteModule
            public CardRiskManagementData getCardRiskManagementData() {
                return CardProfileMdesCmsC.this.buildCardRiskManagementData();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MppLiteModule
            public ContactlessPaymentData getContactlessPaymentData() {
                return CardProfileMdesCmsC.this.buildContactlessPaymentData();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.MppLiteModule
            public RemotePaymentData getRemotePaymentData() {
                return CardProfileMdesCmsC.this.buildRemotePaymentData();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Records[] buildRecords() {
        RecordsMdesCmsC[] records = this.mppLiteModule.getContactlessPaymentData().getRecords();
        Records[] recordsArr = new Records[records.length];
        int i10 = 0;
        for (final RecordsMdesCmsC recordsMdesCmsC : records) {
            recordsArr[i10] = new Records() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.8
                @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.Records
                public byte getRecordNumber() {
                    return (byte) recordsMdesCmsC.getRecordNumber();
                }

                @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.Records
                public byte[] getRecordValue() {
                    return McmLiteUtils.byteArrayFromHexString(recordsMdesCmsC.getRecordValue());
                }

                @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.Records
                public byte getSfi() {
                    return McmLiteUtils.byteArrayFromHexString(recordsMdesCmsC.getSfi())[0];
                }
            };
            i10++;
        }
        return recordsArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RemotePaymentData buildRemotePaymentData() {
        final RemotePaymentDataMdesCmsC remotePaymentData = this.mppLiteModule.getRemotePaymentData();
        if (remotePaymentData == null) {
            return null;
        }
        final String strPadPan = padPan(remotePaymentData.getPan());
        return new RemotePaymentData() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.5
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getAip() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getAip());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getApplicationExpiryDate() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getApplicationExpiryDate());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getCiacDecline() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getCiacDecline());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getCvrMaskAnd() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getCvrMaskAnd());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getIssuerApplicationData() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getIssuerApplicationData());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getPan() {
                return McmLiteUtils.byteArrayFromHexString(strPadPan);
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getPanSequenceNumber() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getPanSequenceNumber());
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.RemotePaymentData
            public byte[] getTrack2Equivalent() {
                return McmLiteUtils.byteArrayFromHexString(remotePaymentData.getTrack2Equivalent());
            }
        };
    }

    private String padPan(String str) {
        return str.length() % 2 != 0 ? str.concat("F") : str;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public BusinessLogicModule getBusinessLogicModule() {
        return buildBusinessLogicModule();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public byte[] getCardMetadata() {
        return null;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public byte[] getContent() {
        return new byte[0];
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public String getDigitizedCardId() {
        return this.digitizedCardId;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public int getMaximumPinTry() {
        return this.maximumPinTry;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public MppLiteModule getMppLiteModule() {
        return buildMppLiteModule();
    }

    public void setBusinessLogicModule(BusinessLogicModuleMdesCmsC businessLogicModuleMdesCmsC) {
        this.businessLogicModule = businessLogicModuleMdesCmsC;
    }

    public void setDigitizedCardId(String str) {
        this.digitizedCardId = str;
    }

    public void setIccKek(byte[] bArr) {
        this.iccKek = bArr;
    }

    public void setMaximumPinTry(int i10) {
        this.maximumPinTry = i10;
    }

    public void setMppLiteModule(MppLiteModuleMdesCmsC mppLiteModuleMdesCmsC) {
        this.mppLiteModule = mppLiteModuleMdesCmsC;
    }

    public DigitizedCardProfile toDigitizedCardProfile() {
        return new DigitizedCardProfile() { // from class: com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileMdesCmsC.11
            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public BusinessLogicModule getBusinessLogicModule() {
                return CardProfileMdesCmsC.this.buildBusinessLogicModule();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public byte[] getCardMetadata() {
                return new byte[0];
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public byte[] getContent() {
                return new byte[0];
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public String getDigitizedCardId() {
                return CardProfileMdesCmsC.this.digitizedCardId;
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public int getMaximumPinTry() {
                return CardProfileMdesCmsC.this.maximumPinTry;
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public MppLiteModule getMppLiteModule() {
                return CardProfileMdesCmsC.this.buildMppLiteModule();
            }

            @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
            public void wipe() {
            }
        };
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface.DigitizedCardProfile
    public void wipe() {
    }
}
