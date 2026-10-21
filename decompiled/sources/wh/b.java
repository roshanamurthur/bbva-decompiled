package wh;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.Iso7816;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.SelectCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.cardprofile.ContactlessIncompatibleProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.state.InvalidState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ContactlessTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.Select;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.ContactlessLogImpl;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.DateUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteStateContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.TransactionOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;

/* JADX INFO: compiled from: ContactlessReadyState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements McmLiteState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteStateContext f94249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContactlessContext f94250b;

    /* JADX INFO: compiled from: ContactlessReadyState.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94251a;

        static {
            int[] iArr = new int[CommandApdu.Type.values().length];
            f94251a = iArr;
            try {
                iArr[CommandApdu.Type.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94251a[CommandApdu.Type.GET_PROCESSING_OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94251a[CommandApdu.Type.READ_RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94251a[CommandApdu.Type.GENERATE_AC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94251a[CommandApdu.Type.COMPUTE_CRYPTOGRAPHIC_CHECKSUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(McmLiteCrypto mcmLiteCrypto, McmLiteStateContext mcmLiteStateContext, ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) throws McmLiteInvalidInput {
        this.f94249a = mcmLiteStateContext;
        McmLiteProfile profile = mcmLiteStateContext.getProfile();
        if (profile.getContactlessPaymentData() == null) {
            throw new ContactlessIncompatibleProfile("The profile does not support contactless");
        }
        if (businessLogicTransactionInformation == null) {
            throw new McmLiteInvalidInput("Invalid input data");
        }
        int currencyCode = businessLogicTransactionInformation.getCurrencyCode();
        if (currencyCode < 0 || currencyCode > 999) {
            throw new McmLiteInvalidInput("Invalid input data");
        }
        long amount = businessLogicTransactionInformation.getAmount();
        if (amount < 0 || amount > BusinessLogicTransactionInformation.MAX_AMOUNT) {
            throw new McmLiteInvalidInput("Invalid input data");
        }
        if (contactlessTransactionListener == null) {
            throw new McmLiteInvalidInput("Invalid input data");
        }
        ContactlessContext contactlessContext = new ContactlessContext(mcmLiteCrypto, profile, mcmLiteStateContext.getTransactionCredentialsManager(), mcmLiteStateContext.getCdCvmValidatorInformation(), mcmLiteStateContext.getConsentManager(), mcmLiteStateContext.getAdviceManager(), mcmLiteStateContext.getAdditionalPdolList(), mcmLiteStateContext.getAdditionalUdolList(), mcmLiteStateContext.isMaskMchipInAipForUsTransactions(), contactlessTransactionListener, businessLogicTransactionInformation);
        this.f94250b = contactlessContext;
        contactlessContext.setContactlessNotSelectedState();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void cancelPayment() {
        ContactlessContext contactlessContext = this.f94250b;
        if (contactlessContext != null) {
            ContactlessTransactionContext transactionContext = contactlessContext.getTransactionContext();
            ContactlessTransactionListener transactionListener = contactlessContext.getTransactionListener();
            if (!contactlessContext.isNotificationRequested() && transactionListener != null) {
                if (transactionContext.getAtc() == null) {
                    transactionContext.setAtc(contactlessContext.getTransactionCredentialsManager().getRandomCredentials().getAtc());
                }
                if (transactionContext.getTrxDate() == null) {
                    transactionContext.setTrxDate(DateUtils.getTodayTransactionDate());
                }
                transactionListener.onContactlessTransactionAbort(ContactlessLogImpl.generic(transactionContext));
            }
            if (contactlessContext.getState() != null) {
                contactlessContext.getState().cancelPayment();
            }
        }
        McmLiteStateContext mcmLiteStateContext = this.f94249a;
        if (mcmLiteStateContext != null) {
            mcmLiteStateContext.setInitializedState();
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final TransactionOutput createRemoteCryptogram(CryptogramInput cryptogramInput) {
        throw new InvalidState("Invalid state createRemoteCryptogram");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void initialize(McmLiteProfile mcmLiteProfile) {
        throw new InvalidState("Invalid state (ContactlessReadyState) for initialize");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final byte[] processApdu(byte[] bArr) {
        ContactlessContext contactlessContext = this.f94250b;
        c state = contactlessContext.getState();
        try {
            int i10 = a.f94251a[CommandApdu.determineApduType(bArr).ordinal()];
            if (i10 == 1) {
                return new Select(new SelectCommandApdu(bArr), this.f94249a.getProfile(), contactlessContext).response();
            }
            if (i10 == 2) {
                return state.d(new GetProcessingOptionsCommandApdu(bArr, contactlessContext.getTransactionContext().getPdolList()));
            }
            if (i10 == 3) {
                return state.a(new ReadRecordCommandApdu(bArr));
            }
            if (i10 == 4) {
                try {
                    byte[] bArrC = state.c(new GenerateAcCommandApdu(bArr));
                    contactlessContext.requestListenerNotification();
                    return bArrC;
                } finally {
                    cancelPayment();
                }
            }
            if (i10 != 5) {
                return ResponseApduFactory.instructionCodeNotSupported();
            }
            try {
                byte[] bArrB = state.b(new ComputeCcCommandApdu(bArr, contactlessContext.getTransactionContext().getUdolList()));
                contactlessContext.requestListenerNotification();
                return bArrB;
            } finally {
                cancelPayment();
            }
        } catch (ContactlessLogicException e5) {
            return e5.getIso7816StatusWordApdu();
        } catch (RuntimeException unused) {
            return ResponseApduFactory.of(Iso7816.SW_UNKNOWN);
        }
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startContactLessPayment(ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) {
        throw new InvalidState("Invalid state for startContactLessPayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void startRemotePayment() {
        throw new InvalidState("Invalid state for startRemotePayment");
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.impl.state.McmLiteState
    public final void stop() {
        cancelPayment();
        McmLiteStateContext mcmLiteStateContext = this.f94249a;
        McmLiteProfile profile = mcmLiteStateContext.getProfile();
        if (profile != null) {
            profile.wipe();
        }
        mcmLiteStateContext.setStoppedState();
    }
}
