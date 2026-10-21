package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.google.i18n.phonenumbers.internal.RegexBasedMatcher;
import com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider;
import com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class ShortNumberInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f49324d = Logger.getLogger(ShortNumberInfo.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ShortNumberInfo f49325e = new ShortNumberInfo(RegexBasedMatcher.create(), DefaultMetadataDependenciesProvider.getInstance().getShortNumberMetadataSource());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f49326f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatcherApi f49327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, List<String>> f49328b = CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RegionMetadataSource f49329c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ShortNumberCost {
        private static final /* synthetic */ ShortNumberCost[] $VALUES;
        public static final ShortNumberCost PREMIUM_RATE;
        public static final ShortNumberCost STANDARD_RATE;
        public static final ShortNumberCost TOLL_FREE;
        public static final ShortNumberCost UNKNOWN_COST;

        static {
            ShortNumberCost shortNumberCost = new ShortNumberCost("TOLL_FREE", 0);
            TOLL_FREE = shortNumberCost;
            ShortNumberCost shortNumberCost2 = new ShortNumberCost("STANDARD_RATE", 1);
            STANDARD_RATE = shortNumberCost2;
            ShortNumberCost shortNumberCost3 = new ShortNumberCost("PREMIUM_RATE", 2);
            PREMIUM_RATE = shortNumberCost3;
            ShortNumberCost shortNumberCost4 = new ShortNumberCost("UNKNOWN_COST", 3);
            UNKNOWN_COST = shortNumberCost4;
            $VALUES = new ShortNumberCost[]{shortNumberCost, shortNumberCost2, shortNumberCost3, shortNumberCost4};
        }

        public ShortNumberCost() {
            throw null;
        }

        public static ShortNumberCost valueOf(String str) {
            return (ShortNumberCost) Enum.valueOf(ShortNumberCost.class, str);
        }

        public static ShortNumberCost[] values() {
            return (ShortNumberCost[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49330a;

        static {
            int[] iArr = new int[ShortNumberCost.values().length];
            f49330a = iArr;
            try {
                iArr[ShortNumberCost.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49330a[ShortNumberCost.UNKNOWN_COST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49330a[ShortNumberCost.STANDARD_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49330a[ShortNumberCost.TOLL_FREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f49326f = hashSet;
        hashSet.add("BR");
        hashSet.add("CL");
        hashSet.add("NI");
    }

    public ShortNumberInfo(MatcherApi matcherApi, RegionMetadataSource regionMetadataSource) {
        this.f49327a = matcherApi;
        this.f49329c = regionMetadataSource;
    }

    public static String a(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb2 = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero()) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(phoneNumber.getNationalNumber());
        return sb2.toString();
    }

    public static ShortNumberInfo getInstance() {
        return f49325e;
    }

    public final String b(Phonenumber.PhoneNumber phoneNumber, List<String> list) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        String strA = a(phoneNumber);
        for (String str : list) {
            Phonemetadata.PhoneMetadata phoneMetadataD = d(str);
            if (phoneMetadataD != null && f(strA, phoneMetadataD.getShortCode())) {
                return str;
            }
        }
        return null;
    }

    public final List<String> c(int i10) {
        List<String> arrayList = this.f49328b.get(Integer.valueOf(i10));
        if (arrayList == null) {
            arrayList = new ArrayList<>(0);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean connectsToEmergencyNumber(String str, String str2) {
        return e(str, str2, true);
    }

    public final Phonemetadata.PhoneMetadata d(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.f49329c.getMetadataForRegion(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean e(CharSequence charSequence, String str, boolean z10) {
        Phonemetadata.PhoneMetadata phoneMetadataD;
        CharSequence charSequenceG = PhoneNumberUtil.g(charSequence);
        boolean z11 = false;
        if (PhoneNumberUtil.f49240q.matcher(charSequenceG).lookingAt() || (phoneMetadataD = d(str)) == null || !phoneMetadataD.hasEmergency()) {
            return false;
        }
        String strNormalizeDigitsOnly = PhoneNumberUtil.normalizeDigitsOnly(charSequenceG);
        if (z10 && !f49326f.contains(str)) {
            z11 = true;
        }
        return this.f49327a.matchNationalNumber(strNormalizeDigitsOnly, phoneMetadataD.getEmergency(), z11);
    }

    public final boolean f(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.getPossibleLengthCount() <= 0 || phoneNumberDesc.getPossibleLengthList().contains(Integer.valueOf(str.length()))) {
            return this.f49327a.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    public ShortNumberCost getExpectedCost(Phonenumber.PhoneNumber phoneNumber) {
        List<String> listC = c(phoneNumber.getCountryCode());
        if (listC.size() == 0) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        if (listC.size() == 1) {
            return getExpectedCostForRegion(phoneNumber, listC.get(0));
        }
        ShortNumberCost shortNumberCost = ShortNumberCost.TOLL_FREE;
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            ShortNumberCost expectedCostForRegion = getExpectedCostForRegion(phoneNumber, it.next());
            int i10 = a.f49330a[expectedCostForRegion.ordinal()];
            if (i10 == 1) {
                return ShortNumberCost.PREMIUM_RATE;
            }
            if (i10 == 2) {
                shortNumberCost = ShortNumberCost.UNKNOWN_COST;
            } else if (i10 != 3) {
                if (i10 != 4) {
                    f49324d.log(Level.SEVERE, "Unrecognised cost for region: " + expectedCostForRegion);
                }
            } else if (shortNumberCost != ShortNumberCost.UNKNOWN_COST) {
                shortNumberCost = ShortNumberCost.STANDARD_RATE;
            }
        }
        return shortNumberCost;
    }

    public ShortNumberCost getExpectedCostForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!c(phoneNumber.getCountryCode()).contains(str)) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        Phonemetadata.PhoneMetadata phoneMetadataD = d(str);
        if (phoneMetadataD == null) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        String strA = a(phoneNumber);
        if (!phoneMetadataD.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(strA.length()))) {
            return ShortNumberCost.UNKNOWN_COST;
        }
        if (f(strA, phoneMetadataD.getPremiumRate())) {
            return ShortNumberCost.PREMIUM_RATE;
        }
        if (f(strA, phoneMetadataD.getStandardRate())) {
            return ShortNumberCost.STANDARD_RATE;
        }
        if (f(strA, phoneMetadataD.getTollFree())) {
            return ShortNumberCost.TOLL_FREE;
        }
        return isEmergencyNumber(strA, str) ? ShortNumberCost.TOLL_FREE : ShortNumberCost.UNKNOWN_COST;
    }

    public boolean isCarrierSpecific(Phonenumber.PhoneNumber phoneNumber) {
        String strB = b(phoneNumber, c(phoneNumber.getCountryCode()));
        String strA = a(phoneNumber);
        Phonemetadata.PhoneMetadata phoneMetadataD = d(strB);
        return phoneMetadataD != null && f(strA, phoneMetadataD.getCarrierSpecific());
    }

    public boolean isCarrierSpecificForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!c(phoneNumber.getCountryCode()).contains(str)) {
            return false;
        }
        String strA = a(phoneNumber);
        Phonemetadata.PhoneMetadata phoneMetadataD = d(str);
        return phoneMetadataD != null && f(strA, phoneMetadataD.getCarrierSpecific());
    }

    public boolean isEmergencyNumber(CharSequence charSequence, String str) {
        return e(charSequence, str, false);
    }

    public boolean isPossibleShortNumber(Phonenumber.PhoneNumber phoneNumber) {
        List<String> listC = c(phoneNumber.getCountryCode());
        int length = a(phoneNumber).length();
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            Phonemetadata.PhoneMetadata phoneMetadataD = d(it.next());
            if (phoneMetadataD != null && phoneMetadataD.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(length))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPossibleShortNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        Phonemetadata.PhoneMetadata phoneMetadataD;
        if (c(phoneNumber.getCountryCode()).contains(str) && (phoneMetadataD = d(str)) != null) {
            return phoneMetadataD.getGeneralDesc().getPossibleLengthList().contains(Integer.valueOf(a(phoneNumber).length()));
        }
        return false;
    }

    public boolean isSmsServiceForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        Phonemetadata.PhoneMetadata phoneMetadataD;
        return c(phoneNumber.getCountryCode()).contains(str) && (phoneMetadataD = d(str)) != null && f(a(phoneNumber), phoneMetadataD.getSmsServices());
    }

    public boolean isValidShortNumber(Phonenumber.PhoneNumber phoneNumber) {
        List<String> listC = c(phoneNumber.getCountryCode());
        String strB = b(phoneNumber, listC);
        if (listC.size() <= 1 || strB == null) {
            return isValidShortNumberForRegion(phoneNumber, strB);
        }
        return true;
    }

    public boolean isValidShortNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        Phonemetadata.PhoneMetadata phoneMetadataD;
        if (!c(phoneNumber.getCountryCode()).contains(str) || (phoneMetadataD = d(str)) == null) {
            return false;
        }
        String strA = a(phoneNumber);
        if (f(strA, phoneMetadataD.getGeneralDesc())) {
            return f(strA, phoneMetadataD.getShortCode());
        }
        return false;
    }
}
