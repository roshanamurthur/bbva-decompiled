package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.compat.u;
import java.util.Calendar;
import java.util.UUID;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public class CreditCard implements Parcelable {
    public static final Parcelable.Creator<CreditCard> CREATOR = new Parcelable.Creator<CreditCard>() { // from class: io.card.payment.CreditCard.1
        @Override // android.os.Parcelable.Creator
        public final CreditCard createFromParcel(Parcel parcel) {
            return new CreditCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CreditCard[] newArray(int i10) {
            return new CreditCard[i10];
        }
    };
    public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
    private static final String TAG = "CreditCard";
    public String cardNumber;
    public String cardholderName;
    public String cvv;
    public int expiryMonth;
    public int expiryYear;
    boolean flipped;
    public String postalCode;
    String scanId;
    int[] xoff;
    int yoff;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardType getCardType() {
        return CardType.fromCardNumber(this.cardNumber);
    }

    public String getFormattedCardNumber() {
        return te.d.b(this.cardNumber, true, null);
    }

    public String getLastFourDigitsOfCardNumber() {
        String str = this.cardNumber;
        if (str == null) {
            return "";
        }
        int iMin = Math.min(4, str.length());
        String str2 = this.cardNumber;
        return str2.substring(str2.length() - iMin);
    }

    public String getRedactedCardNumber() {
        String str = this.cardNumber;
        String string = "";
        if (str == null) {
            return "";
        }
        if (str.length() > 4) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(String.format("%" + (this.cardNumber.length() - 4) + "s", "").replace(' ', Typography.bullet));
            string = sb2.toString();
        }
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(string);
        sbD.append(getLastFourDigitsOfCardNumber());
        return te.d.b(sbD.toString(), false, CardType.fromCardNumber(this.cardNumber));
    }

    public boolean isExpiryValid() {
        int i10 = this.expiryMonth;
        int i11 = this.expiryYear;
        if (i10 < 1 || 12 < i10) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i12 = calendar.get(1);
        int i13 = calendar.get(2) + 1;
        if (i11 < i12) {
            return false;
        }
        return (i11 != i12 || i10 >= i13) && i11 <= i12 + 15;
    }

    public String toString() {
        String string = "{" + getCardType() + ": " + getRedactedCardNumber();
        if (this.expiryMonth > 0 || this.expiryYear > 0) {
            StringBuilder sbE = androidx.camera.core.processing.f.e(string, "  expiry:");
            sbE.append(this.expiryMonth);
            sbE.append("/");
            sbE.append(this.expiryYear);
            string = sbE.toString();
        }
        if (this.postalCode != null) {
            StringBuilder sbE2 = androidx.camera.core.processing.f.e(string, "  postalCode:");
            sbE2.append(this.postalCode);
            string = sbE2.toString();
        }
        if (this.cardholderName != null) {
            StringBuilder sbE3 = androidx.camera.core.processing.f.e(string, "  cardholderName:");
            sbE3.append(this.cardholderName);
            string = sbE3.toString();
        }
        if (this.cvv != null) {
            StringBuilder sbE4 = androidx.camera.core.processing.f.e(string, "  cvvLength:");
            String str = this.cvv;
            sbE4.append(str != null ? str.length() : 0);
            string = sbE4.toString();
        }
        return u.f(string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.cardNumber);
        parcel.writeInt(this.expiryMonth);
        parcel.writeInt(this.expiryYear);
        parcel.writeString(this.cvv);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.cardholderName);
        parcel.writeString(this.scanId);
        parcel.writeInt(this.yoff);
        parcel.writeIntArray(this.xoff);
    }

    public CreditCard() {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.xoff = new int[16];
        this.scanId = UUID.randomUUID().toString();
    }

    public CreditCard(String str, int i10, int i11, String str2, String str3, String str4) {
        this.flipped = false;
        this.cardNumber = str;
        this.expiryMonth = i10;
        this.expiryYear = i11;
        this.cvv = str2;
        this.postalCode = str3;
        this.cardholderName = str4;
    }

    private CreditCard(Parcel parcel) {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.cardNumber = parcel.readString();
        this.expiryMonth = parcel.readInt();
        this.expiryYear = parcel.readInt();
        this.cvv = parcel.readString();
        this.postalCode = parcel.readString();
        this.cardholderName = parcel.readString();
        this.scanId = parcel.readString();
        this.yoff = parcel.readInt();
        this.xoff = parcel.createIntArray();
    }
}
