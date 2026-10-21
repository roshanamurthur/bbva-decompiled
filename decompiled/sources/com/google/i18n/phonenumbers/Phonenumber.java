package com.google.i18n.phonenumbers;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class Phonenumber {

    public static class PhoneNumber implements Serializable {
        public boolean E0;
        public boolean G0;
        public boolean I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f49315p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f49317r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f49319t0;
        public boolean v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f49322x0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f49316q0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f49318s0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public String f49320u0 = "";

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f49321w0 = false;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f49323y0 = 1;
        public String F0 = "";
        public String J0 = "";
        public CountryCodeSource H0 = CountryCodeSource.UNSPECIFIED;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class CountryCodeSource {
            private static final /* synthetic */ CountryCodeSource[] $VALUES;
            public static final CountryCodeSource FROM_DEFAULT_COUNTRY;
            public static final CountryCodeSource FROM_NUMBER_WITHOUT_PLUS_SIGN;
            public static final CountryCodeSource FROM_NUMBER_WITH_IDD;
            public static final CountryCodeSource FROM_NUMBER_WITH_PLUS_SIGN;
            public static final CountryCodeSource UNSPECIFIED;

            static {
                CountryCodeSource countryCodeSource = new CountryCodeSource("FROM_NUMBER_WITH_PLUS_SIGN", 0);
                FROM_NUMBER_WITH_PLUS_SIGN = countryCodeSource;
                CountryCodeSource countryCodeSource2 = new CountryCodeSource("FROM_NUMBER_WITH_IDD", 1);
                FROM_NUMBER_WITH_IDD = countryCodeSource2;
                CountryCodeSource countryCodeSource3 = new CountryCodeSource("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
                FROM_NUMBER_WITHOUT_PLUS_SIGN = countryCodeSource3;
                CountryCodeSource countryCodeSource4 = new CountryCodeSource("FROM_DEFAULT_COUNTRY", 3);
                FROM_DEFAULT_COUNTRY = countryCodeSource4;
                CountryCodeSource countryCodeSource5 = new CountryCodeSource("UNSPECIFIED", 4);
                UNSPECIFIED = countryCodeSource5;
                $VALUES = new CountryCodeSource[]{countryCodeSource, countryCodeSource2, countryCodeSource3, countryCodeSource4, countryCodeSource5};
            }

            public CountryCodeSource() {
                throw null;
            }

            public static CountryCodeSource valueOf(String str) {
                return (CountryCodeSource) Enum.valueOf(CountryCodeSource.class, str);
            }

            public static CountryCodeSource[] values() {
                return (CountryCodeSource[]) $VALUES.clone();
            }
        }

        public final PhoneNumber clear() {
            clearCountryCode();
            clearNationalNumber();
            clearExtension();
            clearItalianLeadingZero();
            clearNumberOfLeadingZeros();
            clearRawInput();
            clearCountryCodeSource();
            clearPreferredDomesticCarrierCode();
            return this;
        }

        public PhoneNumber clearCountryCode() {
            this.f49315p0 = false;
            this.f49316q0 = 0;
            return this;
        }

        public PhoneNumber clearCountryCodeSource() {
            this.G0 = false;
            this.H0 = CountryCodeSource.UNSPECIFIED;
            return this;
        }

        public PhoneNumber clearExtension() {
            this.f49319t0 = false;
            this.f49320u0 = "";
            return this;
        }

        public PhoneNumber clearItalianLeadingZero() {
            this.v0 = false;
            this.f49321w0 = false;
            return this;
        }

        public PhoneNumber clearNationalNumber() {
            this.f49317r0 = false;
            this.f49318s0 = 0L;
            return this;
        }

        public PhoneNumber clearNumberOfLeadingZeros() {
            this.f49322x0 = false;
            this.f49323y0 = 1;
            return this;
        }

        public PhoneNumber clearPreferredDomesticCarrierCode() {
            this.I0 = false;
            this.J0 = "";
            return this;
        }

        public PhoneNumber clearRawInput() {
            this.E0 = false;
            this.F0 = "";
            return this;
        }

        public boolean equals(Object obj) {
            return (obj instanceof PhoneNumber) && exactlySameAs((PhoneNumber) obj);
        }

        public boolean exactlySameAs(PhoneNumber phoneNumber) {
            if (phoneNumber == null) {
                return false;
            }
            if (this == phoneNumber) {
                return true;
            }
            return this.f49316q0 == phoneNumber.f49316q0 && this.f49318s0 == phoneNumber.f49318s0 && this.f49320u0.equals(phoneNumber.f49320u0) && this.f49321w0 == phoneNumber.f49321w0 && this.f49323y0 == phoneNumber.f49323y0 && this.F0.equals(phoneNumber.F0) && this.H0 == phoneNumber.H0 && this.J0.equals(phoneNumber.J0) && hasPreferredDomesticCarrierCode() == phoneNumber.hasPreferredDomesticCarrierCode();
        }

        public int getCountryCode() {
            return this.f49316q0;
        }

        public CountryCodeSource getCountryCodeSource() {
            return this.H0;
        }

        public String getExtension() {
            return this.f49320u0;
        }

        public long getNationalNumber() {
            return this.f49318s0;
        }

        public int getNumberOfLeadingZeros() {
            return this.f49323y0;
        }

        public String getPreferredDomesticCarrierCode() {
            return this.J0;
        }

        public String getRawInput() {
            return this.F0;
        }

        public boolean hasCountryCode() {
            return this.f49315p0;
        }

        public boolean hasCountryCodeSource() {
            return this.G0;
        }

        public boolean hasExtension() {
            return this.f49319t0;
        }

        public boolean hasItalianLeadingZero() {
            return this.v0;
        }

        public boolean hasNationalNumber() {
            return this.f49317r0;
        }

        public boolean hasNumberOfLeadingZeros() {
            return this.f49322x0;
        }

        public boolean hasPreferredDomesticCarrierCode() {
            return this.I0;
        }

        public boolean hasRawInput() {
            return this.E0;
        }

        public int hashCode() {
            return ((getPreferredDomesticCarrierCode().hashCode() + ((getCountryCodeSource().hashCode() + ((getRawInput().hashCode() + ((getNumberOfLeadingZeros() + ((((getExtension().hashCode() + ((Long.valueOf(getNationalNumber()).hashCode() + ((getCountryCode() + 2173) * 53)) * 53)) * 53) + (isItalianLeadingZero() ? 1231 : 1237)) * 53)) * 53)) * 53)) * 53)) * 53) + (hasPreferredDomesticCarrierCode() ? 1231 : 1237);
        }

        public boolean isItalianLeadingZero() {
            return this.f49321w0;
        }

        public PhoneNumber mergeFrom(PhoneNumber phoneNumber) {
            if (phoneNumber.hasCountryCode()) {
                setCountryCode(phoneNumber.getCountryCode());
            }
            if (phoneNumber.hasNationalNumber()) {
                setNationalNumber(phoneNumber.getNationalNumber());
            }
            if (phoneNumber.hasExtension()) {
                setExtension(phoneNumber.getExtension());
            }
            if (phoneNumber.hasItalianLeadingZero()) {
                setItalianLeadingZero(phoneNumber.isItalianLeadingZero());
            }
            if (phoneNumber.hasNumberOfLeadingZeros()) {
                setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
            }
            if (phoneNumber.hasRawInput()) {
                setRawInput(phoneNumber.getRawInput());
            }
            if (phoneNumber.hasCountryCodeSource()) {
                setCountryCodeSource(phoneNumber.getCountryCodeSource());
            }
            if (phoneNumber.hasPreferredDomesticCarrierCode()) {
                setPreferredDomesticCarrierCode(phoneNumber.getPreferredDomesticCarrierCode());
            }
            return this;
        }

        public PhoneNumber setCountryCode(int i10) {
            this.f49315p0 = true;
            this.f49316q0 = i10;
            return this;
        }

        public PhoneNumber setCountryCodeSource(CountryCodeSource countryCodeSource) {
            countryCodeSource.getClass();
            this.G0 = true;
            this.H0 = countryCodeSource;
            return this;
        }

        public PhoneNumber setExtension(String str) {
            str.getClass();
            this.f49319t0 = true;
            this.f49320u0 = str;
            return this;
        }

        public PhoneNumber setItalianLeadingZero(boolean z10) {
            this.v0 = true;
            this.f49321w0 = z10;
            return this;
        }

        public PhoneNumber setNationalNumber(long j10) {
            this.f49317r0 = true;
            this.f49318s0 = j10;
            return this;
        }

        public PhoneNumber setNumberOfLeadingZeros(int i10) {
            this.f49322x0 = true;
            this.f49323y0 = i10;
            return this;
        }

        public PhoneNumber setPreferredDomesticCarrierCode(String str) {
            str.getClass();
            this.I0 = true;
            this.J0 = str;
            return this;
        }

        public PhoneNumber setRawInput(String str) {
            str.getClass();
            this.E0 = true;
            this.F0 = str;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Country Code: ");
            sb2.append(this.f49316q0);
            sb2.append(" National Number: ");
            sb2.append(this.f49318s0);
            if (hasItalianLeadingZero() && isItalianLeadingZero()) {
                sb2.append(" Leading Zero(s): true");
            }
            if (hasNumberOfLeadingZeros()) {
                sb2.append(" Number of leading zeros: ");
                sb2.append(this.f49323y0);
            }
            if (hasExtension()) {
                sb2.append(" Extension: ");
                sb2.append(this.f49320u0);
            }
            if (hasCountryCodeSource()) {
                sb2.append(" Country Code Source: ");
                sb2.append(this.H0);
            }
            if (hasPreferredDomesticCarrierCode()) {
                sb2.append(" Preferred Domestic Carrier Code: ");
                sb2.append(this.J0);
            }
            return sb2.toString();
        }
    }
}
