package androidx.compose.ui.autofill;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import bk.q;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidAutofillType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "getAndroidType", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class AndroidAutofillType_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap<AutofillType, String> f15426a = q.hashMapOf(TuplesKt.to(AutofillType.EmailAddress, "emailAddress"), TuplesKt.to(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), TuplesKt.to(AutofillType.Password, "password"), TuplesKt.to(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), TuplesKt.to(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), TuplesKt.to(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), TuplesKt.to(AutofillType.PostalCode, "postalCode"), TuplesKt.to(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), TuplesKt.to(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), TuplesKt.to(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), TuplesKt.to(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), TuplesKt.to(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), TuplesKt.to(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), TuplesKt.to(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), TuplesKt.to(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), TuplesKt.to(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), TuplesKt.to(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), TuplesKt.to(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), TuplesKt.to(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), TuplesKt.to(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), TuplesKt.to(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), TuplesKt.to(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), TuplesKt.to(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), TuplesKt.to(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), TuplesKt.to(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), TuplesKt.to(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), TuplesKt.to(AutofillType.PhoneNumber, "phoneNumber"), TuplesKt.to(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), TuplesKt.to(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), TuplesKt.to(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), TuplesKt.to(AutofillType.Gender, "gender"), TuplesKt.to(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), TuplesKt.to(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), TuplesKt.to(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), TuplesKt.to(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), TuplesKt.to(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));

    @NotNull
    public static final String getAndroidType(@NotNull AutofillType autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "<this>");
        String str = f15426a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
