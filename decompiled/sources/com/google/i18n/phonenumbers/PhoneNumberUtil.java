package com.google.i18n.phonenumbers;

import ad.d;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.google.i18n.phonenumbers.internal.RegexBasedMatcher;
import com.google.i18n.phonenumbers.internal.RegexCache;
import com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider;
import com.google.i18n.phonenumbers.metadata.source.MetadataSource;
import com.google.i18n.phonenumbers.metadata.source.MetadataSourceImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class PhoneNumberUtil {
    public static final Pattern A;
    public static final Pattern B;
    public static final Pattern C;
    public static PhoneNumberUtil D = null;
    public static final String REGION_CODE_FOR_NON_GEO_ENTITY = "001";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f49232h = Logger.getLogger(PhoneNumberUtil.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<Integer, String> f49233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<Integer> f49234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<Integer> f49235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<Character, Character> f49236l;
    public static final Map<Character, Character> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map<Character, Character> f49237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map<Character, Character> f49238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f49239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f49240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f49241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f49242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f49243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f49244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f49245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f49246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f49247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f49248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f49249z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataSource f49250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, List<String>> f49251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MatcherApi f49252c = RegexBasedMatcher.create();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f49253d = new HashSet(35);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RegexCache f49254e = new RegexCache(100);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f49255f = new HashSet(320);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f49256g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Leniency {
        private static final /* synthetic */ Leniency[] $VALUES;
        public static final Leniency EXACT_GROUPING;
        public static final Leniency POSSIBLE;
        public static final Leniency STRICT_GROUPING;
        public static final Leniency VALID;

        public final enum a extends Leniency {
            public a() {
                super("POSSIBLE", 0);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                return phoneNumberUtil.isPossibleNumber(phoneNumber);
            }
        }

        public final enum b extends Leniency {
            public b() {
                super("VALID", 1);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.a.c(phoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return com.google.i18n.phonenumbers.a.e(phoneNumberUtil, phoneNumber);
                }
                return false;
            }
        }

        public final enum c extends Leniency {

            public class a implements com.google.i18n.phonenumbers.a.InterfaceC0220a {
                @Override // com.google.i18n.phonenumbers.a.InterfaceC0220a
                public final boolean a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb2, String[] strArr) {
                    int length;
                    Pattern pattern = com.google.i18n.phonenumbers.a.f49331y0;
                    if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
                        String string = Integer.toString(phoneNumber.getCountryCode());
                        length = string.length() + sb2.indexOf(string);
                    } else {
                        length = 0;
                    }
                    for (int i10 = 0; i10 < strArr.length; i10++) {
                        int iIndexOf = sb2.indexOf(strArr[i10], length);
                        if (iIndexOf < 0) {
                            return false;
                        }
                        length = iIndexOf + strArr[i10].length();
                        if (i10 == 0 && length < sb2.length() && phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) != null && Character.isDigit(sb2.charAt(length))) {
                            return sb2.substring(length - strArr[i10].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
                        }
                    }
                    return sb2.substring(length).contains(phoneNumber.getExtension());
                }
            }

            public c() {
                super("STRICT_GROUPING", 2);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                String string = charSequence.toString();
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.a.c(phoneNumber, string, phoneNumberUtil) && !com.google.i18n.phonenumbers.a.b(phoneNumber, string) && com.google.i18n.phonenumbers.a.e(phoneNumberUtil, phoneNumber)) {
                    return aVar.a(phoneNumber, charSequence, phoneNumberUtil, new a());
                }
                return false;
            }
        }

        public final enum d extends Leniency {

            public class a implements com.google.i18n.phonenumbers.a.InterfaceC0220a {
                @Override // com.google.i18n.phonenumbers.a.InterfaceC0220a
                public final boolean a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb2, String[] strArr) {
                    Pattern pattern = com.google.i18n.phonenumbers.a.f49331y0;
                    String[] strArrSplit = PhoneNumberUtil.A.split(sb2.toString());
                    int length = phoneNumber.hasExtension() ? strArrSplit.length - 2 : strArrSplit.length - 1;
                    if (strArrSplit.length == 1 || strArrSplit[length].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
                        return true;
                    }
                    int length2 = strArr.length - 1;
                    while (length2 > 0 && length >= 0) {
                        if (!strArrSplit[length].equals(strArr[length2])) {
                            return false;
                        }
                        length2--;
                        length--;
                    }
                    if (length >= 0 && strArrSplit[length].endsWith(strArr[0])) {
                        return true;
                    }
                    return false;
                }
            }

            public d() {
                super("EXACT_GROUPING", 3);
            }

            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar) {
                String string = charSequence.toString();
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.a.c(phoneNumber, string, phoneNumberUtil) && !com.google.i18n.phonenumbers.a.b(phoneNumber, string) && com.google.i18n.phonenumbers.a.e(phoneNumberUtil, phoneNumber)) {
                    return aVar.a(phoneNumber, charSequence, phoneNumberUtil, new a());
                }
                return false;
            }
        }

        static {
            a aVar = new a();
            POSSIBLE = aVar;
            b bVar = new b();
            VALID = bVar;
            c cVar = new c();
            STRICT_GROUPING = cVar;
            d dVar = new d();
            EXACT_GROUPING = dVar;
            $VALUES = new Leniency[]{aVar, bVar, cVar, dVar};
        }

        public Leniency() {
            throw null;
        }

        public static Leniency valueOf(String str) {
            return (Leniency) Enum.valueOf(Leniency.class, str);
        }

        public static Leniency[] values() {
            return (Leniency[]) $VALUES.clone();
        }

        public abstract boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.a aVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatchType {
        private static final /* synthetic */ MatchType[] $VALUES;
        public static final MatchType EXACT_MATCH;
        public static final MatchType NOT_A_NUMBER;
        public static final MatchType NO_MATCH;
        public static final MatchType NSN_MATCH;
        public static final MatchType SHORT_NSN_MATCH;

        static {
            MatchType matchType = new MatchType("NOT_A_NUMBER", 0);
            NOT_A_NUMBER = matchType;
            MatchType matchType2 = new MatchType("NO_MATCH", 1);
            NO_MATCH = matchType2;
            MatchType matchType3 = new MatchType("SHORT_NSN_MATCH", 2);
            SHORT_NSN_MATCH = matchType3;
            MatchType matchType4 = new MatchType("NSN_MATCH", 3);
            NSN_MATCH = matchType4;
            MatchType matchType5 = new MatchType("EXACT_MATCH", 4);
            EXACT_MATCH = matchType5;
            $VALUES = new MatchType[]{matchType, matchType2, matchType3, matchType4, matchType5};
        }

        public MatchType() {
            throw null;
        }

        public static MatchType valueOf(String str) {
            return (MatchType) Enum.valueOf(MatchType.class, str);
        }

        public static MatchType[] values() {
            return (MatchType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberFormat {
        private static final /* synthetic */ PhoneNumberFormat[] $VALUES;
        public static final PhoneNumberFormat E164;
        public static final PhoneNumberFormat INTERNATIONAL;
        public static final PhoneNumberFormat NATIONAL;
        public static final PhoneNumberFormat RFC3966;

        static {
            PhoneNumberFormat phoneNumberFormat = new PhoneNumberFormat("E164", 0);
            E164 = phoneNumberFormat;
            PhoneNumberFormat phoneNumberFormat2 = new PhoneNumberFormat("INTERNATIONAL", 1);
            INTERNATIONAL = phoneNumberFormat2;
            PhoneNumberFormat phoneNumberFormat3 = new PhoneNumberFormat("NATIONAL", 2);
            NATIONAL = phoneNumberFormat3;
            PhoneNumberFormat phoneNumberFormat4 = new PhoneNumberFormat("RFC3966", 3);
            RFC3966 = phoneNumberFormat4;
            $VALUES = new PhoneNumberFormat[]{phoneNumberFormat, phoneNumberFormat2, phoneNumberFormat3, phoneNumberFormat4};
        }

        public PhoneNumberFormat() {
            throw null;
        }

        public static PhoneNumberFormat valueOf(String str) {
            return (PhoneNumberFormat) Enum.valueOf(PhoneNumberFormat.class, str);
        }

        public static PhoneNumberFormat[] values() {
            return (PhoneNumberFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberType {
        private static final /* synthetic */ PhoneNumberType[] $VALUES;
        public static final PhoneNumberType FIXED_LINE;
        public static final PhoneNumberType FIXED_LINE_OR_MOBILE;
        public static final PhoneNumberType MOBILE;
        public static final PhoneNumberType PAGER;
        public static final PhoneNumberType PERSONAL_NUMBER;
        public static final PhoneNumberType PREMIUM_RATE;
        public static final PhoneNumberType SHARED_COST;
        public static final PhoneNumberType TOLL_FREE;
        public static final PhoneNumberType UAN;
        public static final PhoneNumberType UNKNOWN;
        public static final PhoneNumberType VOICEMAIL;
        public static final PhoneNumberType VOIP;

        static {
            PhoneNumberType phoneNumberType = new PhoneNumberType("FIXED_LINE", 0);
            FIXED_LINE = phoneNumberType;
            PhoneNumberType phoneNumberType2 = new PhoneNumberType("MOBILE", 1);
            MOBILE = phoneNumberType2;
            PhoneNumberType phoneNumberType3 = new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
            FIXED_LINE_OR_MOBILE = phoneNumberType3;
            PhoneNumberType phoneNumberType4 = new PhoneNumberType("TOLL_FREE", 3);
            TOLL_FREE = phoneNumberType4;
            PhoneNumberType phoneNumberType5 = new PhoneNumberType("PREMIUM_RATE", 4);
            PREMIUM_RATE = phoneNumberType5;
            PhoneNumberType phoneNumberType6 = new PhoneNumberType("SHARED_COST", 5);
            SHARED_COST = phoneNumberType6;
            PhoneNumberType phoneNumberType7 = new PhoneNumberType("VOIP", 6);
            VOIP = phoneNumberType7;
            PhoneNumberType phoneNumberType8 = new PhoneNumberType("PERSONAL_NUMBER", 7);
            PERSONAL_NUMBER = phoneNumberType8;
            PhoneNumberType phoneNumberType9 = new PhoneNumberType("PAGER", 8);
            PAGER = phoneNumberType9;
            PhoneNumberType phoneNumberType10 = new PhoneNumberType("UAN", 9);
            UAN = phoneNumberType10;
            PhoneNumberType phoneNumberType11 = new PhoneNumberType("VOICEMAIL", 10);
            VOICEMAIL = phoneNumberType11;
            PhoneNumberType phoneNumberType12 = new PhoneNumberType("UNKNOWN", 11);
            UNKNOWN = phoneNumberType12;
            $VALUES = new PhoneNumberType[]{phoneNumberType, phoneNumberType2, phoneNumberType3, phoneNumberType4, phoneNumberType5, phoneNumberType6, phoneNumberType7, phoneNumberType8, phoneNumberType9, phoneNumberType10, phoneNumberType11, phoneNumberType12};
        }

        public PhoneNumberType() {
            throw null;
        }

        public static PhoneNumberType valueOf(String str) {
            return (PhoneNumberType) Enum.valueOf(PhoneNumberType.class, str);
        }

        public static PhoneNumberType[] values() {
            return (PhoneNumberType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValidationResult {
        private static final /* synthetic */ ValidationResult[] $VALUES;
        public static final ValidationResult INVALID_COUNTRY_CODE;
        public static final ValidationResult INVALID_LENGTH;
        public static final ValidationResult IS_POSSIBLE;
        public static final ValidationResult IS_POSSIBLE_LOCAL_ONLY;
        public static final ValidationResult TOO_LONG;
        public static final ValidationResult TOO_SHORT;

        static {
            ValidationResult validationResult = new ValidationResult("IS_POSSIBLE", 0);
            IS_POSSIBLE = validationResult;
            ValidationResult validationResult2 = new ValidationResult("IS_POSSIBLE_LOCAL_ONLY", 1);
            IS_POSSIBLE_LOCAL_ONLY = validationResult2;
            ValidationResult validationResult3 = new ValidationResult("INVALID_COUNTRY_CODE", 2);
            INVALID_COUNTRY_CODE = validationResult3;
            ValidationResult validationResult4 = new ValidationResult("TOO_SHORT", 3);
            TOO_SHORT = validationResult4;
            ValidationResult validationResult5 = new ValidationResult("INVALID_LENGTH", 4);
            INVALID_LENGTH = validationResult5;
            ValidationResult validationResult6 = new ValidationResult("TOO_LONG", 5);
            TOO_LONG = validationResult6;
            $VALUES = new ValidationResult[]{validationResult, validationResult2, validationResult3, validationResult4, validationResult5, validationResult6};
        }

        public ValidationResult() {
            throw null;
        }

        public static ValidationResult valueOf(String str) {
            return (ValidationResult) Enum.valueOf(ValidationResult.class, str);
        }

        public static ValidationResult[] values() {
            return (ValidationResult[]) $VALUES.clone();
        }
    }

    public class a implements Iterable<PhoneNumberMatch> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f49257p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f49258q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Leniency f49259r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f49260s0;

        public a(CharSequence charSequence, String str, Leniency leniency, long j10) {
            this.f49257p0 = charSequence;
            this.f49258q0 = str;
            this.f49259r0 = leniency;
            this.f49260s0 = j10;
        }

        @Override // java.lang.Iterable
        public final Iterator<PhoneNumberMatch> iterator() {
            return new com.google.i18n.phonenumbers.a(PhoneNumberUtil.this, this.f49257p0, this.f49258q0, this.f49259r0, this.f49260s0);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f49263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f49264c;

        static {
            int[] iArr = new int[PhoneNumberType.values().length];
            f49264c = iArr;
            try {
                iArr[PhoneNumberType.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49264c[PhoneNumberType.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49264c[PhoneNumberType.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49264c[PhoneNumberType.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49264c[PhoneNumberType.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49264c[PhoneNumberType.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49264c[PhoneNumberType.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f49264c[PhoneNumberType.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f49264c[PhoneNumberType.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f49264c[PhoneNumberType.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f49264c[PhoneNumberType.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[PhoneNumberFormat.values().length];
            f49263b = iArr2;
            try {
                iArr2[PhoneNumberFormat.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f49263b[PhoneNumberFormat.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f49263b[PhoneNumberFormat.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f49263b[PhoneNumberFormat.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[Phonenumber.PhoneNumber.CountryCodeSource.values().length];
            f49262a = iArr3;
            try {
                iArr3[Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f49262a[Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f49262a[Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f49262a[Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        f49233i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f49234j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f49235k = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), '9');
        Map<Character, Character> mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f49237n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        Character chValueOf = Character.valueOf(MaskTextWatcher.WILDCARD);
        map5.put(chValueOf, chValueOf);
        f49236l = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        Iterator<Character> it = mapUnmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char cCharValue = it.next().charValue();
            map6.put(Character.valueOf(Character.toLowerCase(cCharValue)), Character.valueOf(cCharValue));
            map6.put(Character.valueOf(cCharValue), Character.valueOf(cCharValue));
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put(Character.valueOf(Typography.ndash), '-');
        map6.put(Character.valueOf(Typography.mdash), '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put(Character.valueOf(JsonPointer.SEPARATOR), Character.valueOf(JsonPointer.SEPARATOR));
        map6.put((char) 65295, Character.valueOf(JsonPointer.SEPARATOR));
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        f49238o = Collections.unmodifiableMap(map6);
        f49239p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map7 = m;
        sb2.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb2.toString();
        f49240q = Pattern.compile("[+＋]+");
        f49241r = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f49242s = Pattern.compile("(\\p{Nd})");
        f49243t = Pattern.compile("[+＋\\p{Nd}]");
        f49244u = Pattern.compile("[\\\\/] *x");
        f49245v = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f49246w = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strB = h0.b("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strC = c(true);
        f49247x = c(false);
        f49248y = Pattern.compile("(?:" + strC + ")$", 66);
        f49249z = Pattern.compile(strB + "(?:" + strC + ")?", 66);
        A = Pattern.compile("(\\D+)");
        B = Pattern.compile("(\\$\\d)");
        C = Pattern.compile("\\(?\\$1\\)?");
        D = null;
    }

    public PhoneNumberUtil(MetadataSourceImpl metadataSourceImpl, Map map) {
        this.f49250a = metadataSourceImpl;
        this.f49251b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f49256g.add(entry.getKey());
            } else {
                this.f49255f.addAll(list);
            }
        }
        if (this.f49255f.remove("001")) {
            f49232h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f49253d.addAll((Collection) map.get(1));
    }

    public static StringBuilder A(CharSequence charSequence, boolean z10) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            int iDigit = Character.digit(cCharAt, 10);
            if (iDigit != -1) {
                sb2.append(iDigit);
            } else if (z10) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    public static String B(CharSequence charSequence, Map<Character, Character> map, boolean z10) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Character ch2 = map.get(Character.valueOf(Character.toUpperCase(cCharAt)));
            if (ch2 != null) {
                sb2.append(ch2);
            } else if (!z10) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static void D(int i10, PhoneNumberFormat phoneNumberFormat, StringBuilder sb2) {
        int i11 = b.f49263b[phoneNumberFormat.ordinal()];
        if (i11 == 1) {
            sb2.insert(0, i10).insert(0, '+');
        } else if (i11 == 2) {
            sb2.insert(0, " ").insert(0, i10).insert(0, '+');
        } else {
            if (i11 != 3) {
                return;
            }
            sb2.insert(0, Constant.DASH_STRING).insert(0, i10).insert(0, '+').insert(0, "tel:");
        }
    }

    public static synchronized void E(PhoneNumberUtil phoneNumberUtil) {
        D = phoneNumberUtil;
    }

    public static ValidationResult F(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        Phonemetadata.PhoneNumberDesc phoneNumberDescO = o(phoneMetadata, phoneNumberType);
        List<Integer> possibleLengthList = phoneNumberDescO.getPossibleLengthList().isEmpty() ? phoneMetadata.getGeneralDesc().getPossibleLengthList() : phoneNumberDescO.getPossibleLengthList();
        List<Integer> possibleLengthLocalOnlyList = phoneNumberDescO.getPossibleLengthLocalOnlyList();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            if (!d(o(phoneMetadata, PhoneNumberType.FIXED_LINE))) {
                return F(charSequence, phoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata.PhoneNumberDesc phoneNumberDescO2 = o(phoneMetadata, PhoneNumberType.MOBILE);
            if (d(phoneNumberDescO2)) {
                ArrayList arrayList = new ArrayList(possibleLengthList);
                arrayList.addAll(phoneNumberDescO2.getPossibleLengthCount() == 0 ? phoneMetadata.getGeneralDesc().getPossibleLengthList() : phoneNumberDescO2.getPossibleLengthList());
                Collections.sort(arrayList);
                if (possibleLengthLocalOnlyList.isEmpty()) {
                    possibleLengthLocalOnlyList = phoneNumberDescO2.getPossibleLengthLocalOnlyList();
                } else {
                    ArrayList arrayList2 = new ArrayList(possibleLengthLocalOnlyList);
                    arrayList2.addAll(phoneNumberDescO2.getPossibleLengthLocalOnlyList());
                    Collections.sort(arrayList2);
                    possibleLengthLocalOnlyList = arrayList2;
                }
                possibleLengthList = arrayList;
            }
        }
        if (possibleLengthList.get(0).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = possibleLengthList.get(0).intValue();
        if (iIntValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (iIntValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (((Integer) androidx.emoji2.text.flatbuffer.a.b(possibleLengthList, 1)).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        return possibleLengthList.subList(1, possibleLengthList.size()).contains(Integer.valueOf(length)) ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
    }

    public static Phonenumber.PhoneNumber b(Phonenumber.PhoneNumber phoneNumber) {
        Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(phoneNumber.getNationalNumber());
        if (phoneNumber.getExtension().length() > 0) {
            phoneNumber2.setExtension(phoneNumber.getExtension());
        }
        if (phoneNumber.isItalianLeadingZero()) {
            phoneNumber2.setItalianLeadingZero(true);
            phoneNumber2.setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
        }
        return phoneNumber2;
    }

    public static String c(boolean z10) {
        String str = ";ext=" + e(20);
        String str2 = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + e(20) + "#?";
        String str3 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + e(9) + "#?";
        String str4 = "[- ]+" + e(6) + "#";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        String strF = d.f(sb2, "|", str4);
        if (!z10) {
            return strF;
        }
        return strF + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + e(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + e(9) + "#?");
    }

    public static String convertAlphaCharactersInNumber(CharSequence charSequence) {
        return B(charSequence, f49237n, false);
    }

    public static PhoneNumberUtil createInstance(MetadataLoader metadataLoader) {
        if (metadataLoader != null) {
            return new PhoneNumberUtil(new MetadataSourceImpl(DefaultMetadataDependenciesProvider.getInstance().getPhoneNumberMetadataFileNameProvider(), metadataLoader, DefaultMetadataDependenciesProvider.getInstance().getMetadataParser()), CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap());
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    public static boolean d(Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        return (phoneNumberDesc.getPossibleLengthCount() == 1 && phoneNumberDesc.getPossibleLength(0) == -1) ? false : true;
    }

    public static String e(int i10) {
        return androidx.camera.core.impl.utils.b.a("(\\p{Nd}{1,", i10, "})");
    }

    public static CharSequence g(CharSequence charSequence) {
        Matcher matcher = f49243t.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f49245v.matcher(charSequenceSubSequence);
        if (matcher2.find()) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f49244u.matcher(charSequenceSubSequence);
        return matcher3.find() ? charSequenceSubSequence.subSequence(0, matcher3.start()) : charSequenceSubSequence;
    }

    public static String getCountryMobileToken(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        Map<Integer, String> map = f49233i;
        return map.containsKey(numValueOf) ? map.get(Integer.valueOf(i10)) : "";
    }

    public static synchronized PhoneNumberUtil getInstance() {
        try {
            if (D == null) {
                E(createInstance(DefaultMetadataDependenciesProvider.getInstance().getMetadataLoader()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return D;
    }

    public static boolean j(String str) {
        return str.length() == 0 || C.matcher(str).matches();
    }

    public static String normalizeDiallableCharsOnly(CharSequence charSequence) {
        return B(charSequence, f49236l, true);
    }

    public static String normalizeDigitsOnly(CharSequence charSequence) {
        return A(charSequence, false).toString();
    }

    public static Phonemetadata.PhoneNumberDesc o(Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (b.f49264c[phoneNumberType.ordinal()]) {
            case 1:
                return phoneMetadata.getPremiumRate();
            case 2:
                return phoneMetadata.getTollFree();
            case 3:
                return phoneMetadata.getMobile();
            case 4:
            case 5:
                return phoneMetadata.getFixedLine();
            case 6:
                return phoneMetadata.getSharedCost();
            case 7:
                return phoneMetadata.getVoip();
            case 8:
                return phoneMetadata.getPersonalNumber();
            case 9:
                return phoneMetadata.getPager();
            case 10:
                return phoneMetadata.getUan();
            case 11:
                return phoneMetadata.getVoicemail();
            default:
                return phoneMetadata.getGeneralDesc();
        }
    }

    public static Set q(Phonemetadata.PhoneMetadata phoneMetadata) {
        TreeSet treeSet = new TreeSet();
        for (PhoneNumberType phoneNumberType : PhoneNumberType.values()) {
            if (phoneNumberType != PhoneNumberType.FIXED_LINE_OR_MOBILE && phoneNumberType != PhoneNumberType.UNKNOWN) {
                Phonemetadata.PhoneNumberDesc phoneNumberDescO = o(phoneMetadata, phoneNumberType);
                if (phoneNumberDescO.hasExampleNumber() || d(phoneNumberDescO) || phoneNumberDescO.hasNationalNumberPattern()) {
                    treeSet.add(phoneNumberType);
                }
            }
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public static boolean u(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f49249z.matcher(charSequence).matches();
    }

    public static void v(Phonenumber.PhoneNumber phoneNumber, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb2) {
        if (!phoneNumber.hasExtension() || phoneNumber.getExtension().length() <= 0) {
            return;
        }
        if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
            sb2.append(";ext=");
            sb2.append(phoneNumber.getExtension());
        } else if (phoneMetadata.hasPreferredExtnPrefix()) {
            sb2.append(phoneMetadata.getPreferredExtnPrefix());
            sb2.append(phoneNumber.getExtension());
        } else {
            sb2.append(" ext. ");
            sb2.append(phoneNumber.getExtension());
        }
    }

    public static String x(StringBuilder sb2) {
        Matcher matcher = f49248y.matcher(sb2);
        if (!matcher.find() || !u(sb2.substring(0, matcher.start()))) {
            return "";
        }
        int iGroupCount = matcher.groupCount();
        for (int i10 = 1; i10 <= iGroupCount; i10++) {
            if (matcher.group(i10) != null) {
                String strGroup = matcher.group(i10);
                sb2.delete(matcher.start(), sb2.length());
                return strGroup;
            }
        }
        return "";
    }

    public static void z(StringBuilder sb2) {
        if (f49246w.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), B(sb2, f49237n, true));
        } else {
            sb2.replace(0, sb2.length(), normalizeDigitsOnly(sb2));
        }
    }

    public final void C(CharSequence charSequence, String str, boolean z10, boolean z11, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        int iW;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf >= 0) {
            int i10 = iIndexOf + 15;
            if (i10 < string.length() - 1 && string.charAt(i10) == '+') {
                int iIndexOf2 = string.indexOf(59, i10);
                if (iIndexOf2 > 0) {
                    sb2.append(string.substring(i10, iIndexOf2));
                } else {
                    sb2.append(string.substring(i10));
                }
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb2.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            sb2.append(g(string));
        }
        int iIndexOf4 = sb2.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb2.delete(iIndexOf4, sb2.length());
        }
        if (!u(sb2)) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        Pattern pattern = f49240q;
        if (z11 && !t(str) && (sb2.length() == 0 || !pattern.matcher(sb2).lookingAt())) {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z10) {
            phoneNumber.setRawInput(string);
        }
        String strX = x(sb2);
        if (strX.length() > 0) {
            phoneNumber.setExtension(strX);
        }
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        StringBuilder sb3 = new StringBuilder();
        try {
            iW = w(sb2, phoneMetadataM, sb3, z10, phoneNumber);
        } catch (NumberParseException e5) {
            Matcher matcher = pattern.matcher(sb2);
            if (e5.getErrorType() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                throw new NumberParseException(e5.getErrorType(), e5.getMessage());
            }
            iW = w(sb2.substring(matcher.end()), phoneMetadataM, sb3, z10, phoneNumber);
            if (iW == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iW != 0) {
            String regionCodeForCountryCode = getRegionCodeForCountryCode(iW);
            if (!regionCodeForCountryCode.equals(str)) {
                phoneMetadataM = n(iW, regionCodeForCountryCode);
            }
        } else {
            z(sb2);
            sb3.append((CharSequence) sb2);
            if (str != null) {
                phoneNumber.setCountryCode(phoneMetadataM.getCountryCode());
            } else if (z10) {
                phoneNumber.clearCountryCodeSource();
            }
        }
        if (sb3.length() < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (phoneMetadataM != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            y(sb5, phoneMetadataM, sb4);
            ValidationResult validationResultF = F(sb5, phoneMetadataM, PhoneNumberType.UNKNOWN);
            if (validationResultF != ValidationResult.TOO_SHORT && validationResultF != ValidationResult.IS_POSSIBLE_LOCAL_ONLY && validationResultF != ValidationResult.INVALID_LENGTH) {
                if (z10 && sb4.length() > 0) {
                    phoneNumber.setPreferredDomesticCarrierCode(sb4.toString());
                }
                sb3 = sb5;
            }
        }
        int length = sb3.length();
        if (length < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            phoneNumber.setItalianLeadingZero(true);
            int i11 = 1;
            while (i11 < sb3.length() - 1 && sb3.charAt(i11) == '0') {
                i11++;
            }
            if (i11 != 1) {
                phoneNumber.setNumberOfLeadingZeros(i11);
            }
        }
        phoneNumber.setNationalNumber(Long.parseLong(sb3.toString()));
    }

    public final Phonemetadata.NumberFormat a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat numberFormat = (Phonemetadata.NumberFormat) it.next();
            int leadingDigitsPatternCount = numberFormat.getLeadingDigitsPatternCount();
            RegexCache regexCache = this.f49254e;
            if (leadingDigitsPatternCount == 0 || regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(leadingDigitsPatternCount - 1)).matcher(str).lookingAt()) {
                if (regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(str).matches()) {
                    return numberFormat;
                }
            }
        }
        return null;
    }

    public boolean canBeInternationallyDialled(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata phoneMetadataM = m(getRegionCodeForNumber(phoneNumber));
        if (phoneMetadataM == null) {
            return true;
        }
        return !s(getNationalSignificantNumber(phoneNumber), phoneMetadataM.getNoInternationalDialling());
    }

    public final int f(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i10 = 1; i10 <= 3 && i10 <= length; i10++) {
                int i11 = Integer.parseInt(sb2.substring(0, i10));
                if (this.f49251b.containsKey(Integer.valueOf(i11))) {
                    sb3.append(sb2.substring(i10));
                    return i11;
                }
            }
        }
        return 0;
    }

    public Iterable<PhoneNumberMatch> findNumbers(CharSequence charSequence, String str) {
        return findNumbers(charSequence, str, Leniency.VALID, Long.MAX_VALUE);
    }

    public String format(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.getNationalNumber() == 0 && phoneNumber.hasRawInput()) {
            String rawInput = phoneNumber.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb2 = new StringBuilder(20);
        format(phoneNumber, phoneNumberFormat, sb2);
        return sb2.toString();
    }

    public String formatByPattern(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, List<Phonemetadata.NumberFormat> list) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!r(countryCode)) {
            return nationalSignificantNumber;
        }
        Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb2 = new StringBuilder(20);
        Phonemetadata.NumberFormat numberFormatA = a(nationalSignificantNumber, list);
        if (numberFormatA == null) {
            sb2.append(nationalSignificantNumber);
        } else {
            Phonemetadata.NumberFormat.Builder builderNewBuilder = Phonemetadata.NumberFormat.newBuilder();
            builderNewBuilder.mergeFrom(numberFormatA);
            String nationalPrefixFormattingRule = numberFormatA.getNationalPrefixFormattingRule();
            if (nationalPrefixFormattingRule.length() > 0) {
                String nationalPrefix = phoneMetadataN.getNationalPrefix();
                if (nationalPrefix.length() > 0) {
                    builderNewBuilder.setNationalPrefixFormattingRule(nationalPrefixFormattingRule.replace("$NP", nationalPrefix).replace("$FG", "$1"));
                } else {
                    builderNewBuilder.clearNationalPrefixFormattingRule();
                }
            }
            sb2.append(i(nationalSignificantNumber, builderNewBuilder.build(), phoneNumberFormat, null));
        }
        v(phoneNumber, phoneMetadataN, phoneNumberFormat, sb2);
        D(countryCode, phoneNumberFormat, sb2);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    public String formatInOriginalFormat(Phonenumber.PhoneNumber phoneNumber, String str) {
        String outOfCountryCallingNumber;
        Phonemetadata.NumberFormat numberFormatA;
        String nationalPrefixFormattingRule;
        int iIndexOf;
        if (phoneNumber.hasRawInput()) {
            int countryCode = phoneNumber.getCountryCode();
            Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
            if (phoneMetadataN == null || a(getNationalSignificantNumber(phoneNumber), phoneMetadataN.getNumberFormatList()) == null) {
                return phoneNumber.getRawInput();
            }
        }
        if (!phoneNumber.hasCountryCodeSource()) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        int i10 = b.f49262a[phoneNumber.getCountryCodeSource().ordinal()];
        if (i10 == 1) {
            outOfCountryCallingNumber = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        } else if (i10 == 2) {
            outOfCountryCallingNumber = formatOutOfCountryCallingNumber(phoneNumber, str);
        } else if (i10 != 3) {
            String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
            String nddPrefixForRegion = getNddPrefixForRegion(regionCodeForCountryCode, true);
            outOfCountryCallingNumber = format(phoneNumber, PhoneNumberFormat.NATIONAL);
            if (nddPrefixForRegion != null && nddPrefixForRegion.length() != 0) {
                String strNormalizeDigitsOnly = normalizeDigitsOnly(phoneNumber.getRawInput());
                if (strNormalizeDigitsOnly.startsWith(nddPrefixForRegion)) {
                    try {
                        if (!isValidNumber(parse(strNormalizeDigitsOnly.substring(nddPrefixForRegion.length()), regionCodeForCountryCode))) {
                            numberFormatA = a(getNationalSignificantNumber(phoneNumber), m(regionCodeForCountryCode).getNumberFormatList());
                            if (numberFormatA != null && (iIndexOf = (nationalPrefixFormattingRule = numberFormatA.getNationalPrefixFormattingRule()).indexOf("$1")) > 0 && normalizeDigitsOnly(nationalPrefixFormattingRule.substring(0, iIndexOf)).length() != 0) {
                                Phonemetadata.NumberFormat.Builder builderNewBuilder = Phonemetadata.NumberFormat.newBuilder();
                                builderNewBuilder.mergeFrom(numberFormatA);
                                builderNewBuilder.clearNationalPrefixFormattingRule();
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(builderNewBuilder.build());
                                outOfCountryCallingNumber = formatByPattern(phoneNumber, PhoneNumberFormat.NATIONAL, arrayList);
                            }
                        }
                    } catch (NumberParseException unused) {
                    }
                } else {
                    numberFormatA = a(getNationalSignificantNumber(phoneNumber), m(regionCodeForCountryCode).getNumberFormatList());
                    if (numberFormatA != null) {
                        Phonemetadata.NumberFormat.Builder builderNewBuilder2 = Phonemetadata.NumberFormat.newBuilder();
                        builderNewBuilder2.mergeFrom(numberFormatA);
                        builderNewBuilder2.clearNationalPrefixFormattingRule();
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(builderNewBuilder2.build());
                        outOfCountryCallingNumber = formatByPattern(phoneNumber, PhoneNumberFormat.NATIONAL, arrayList2);
                    }
                }
            }
        } else {
            outOfCountryCallingNumber = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL).substring(1);
        }
        String rawInput = phoneNumber.getRawInput();
        return (outOfCountryCallingNumber == null || rawInput.length() <= 0 || normalizeDiallableCharsOnly(outOfCountryCallingNumber).equals(normalizeDiallableCharsOnly(rawInput))) ? outOfCountryCallingNumber : rawInput;
    }

    public String formatNationalNumberWithCarrierCode(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!r(countryCode)) {
            return nationalSignificantNumber;
        }
        Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb2 = new StringBuilder(20);
        PhoneNumberFormat phoneNumberFormat = PhoneNumberFormat.NATIONAL;
        sb2.append(h(nationalSignificantNumber, phoneMetadataN, phoneNumberFormat, charSequence));
        v(phoneNumber, phoneMetadataN, phoneNumberFormat, sb2);
        D(countryCode, phoneNumberFormat, sb2);
        return sb2.toString();
    }

    public String formatNationalNumberWithPreferredCarrierCode(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        if (phoneNumber.getPreferredDomesticCarrierCode().length() > 0) {
            charSequence = phoneNumber.getPreferredDomesticCarrierCode();
        }
        return formatNationalNumberWithCarrierCode(phoneNumber, charSequence);
    }

    public String formatNumberForMobileDialing(Phonenumber.PhoneNumber phoneNumber, String str, boolean z10) {
        String str2;
        int countryCode = phoneNumber.getCountryCode();
        String nationalNumberWithPreferredCarrierCode = "";
        if (!r(countryCode)) {
            return phoneNumber.hasRawInput() ? phoneNumber.getRawInput() : "";
        }
        Phonenumber.PhoneNumber phoneNumberClearExtension = new Phonenumber.PhoneNumber().mergeFrom(phoneNumber).clearExtension();
        String regionCodeForCountryCode = getRegionCodeForCountryCode(countryCode);
        PhoneNumberType numberType = getNumberType(phoneNumberClearExtension);
        PhoneNumberType phoneNumberType = PhoneNumberType.UNKNOWN;
        boolean z11 = numberType != phoneNumberType;
        if (str.equals(regionCodeForCountryCode)) {
            boolean z12 = numberType == PhoneNumberType.FIXED_LINE || numberType == PhoneNumberType.MOBILE || numberType == PhoneNumberType.FIXED_LINE_OR_MOBILE;
            if (!regionCodeForCountryCode.equals("BR") || !z12) {
                if (countryCode == 1) {
                    str2 = (!canBeInternationallyDialled(phoneNumberClearExtension) || F(getNationalSignificantNumber(phoneNumberClearExtension), m(str), phoneNumberType) == ValidationResult.TOO_SHORT) ? format(phoneNumberClearExtension, PhoneNumberFormat.NATIONAL) : format(phoneNumberClearExtension, PhoneNumberFormat.INTERNATIONAL);
                } else {
                    str2 = ((regionCodeForCountryCode.equals("001") || ((regionCodeForCountryCode.equals("MX") || regionCodeForCountryCode.equals("CL") || regionCodeForCountryCode.equals("UZ")) && z12)) && canBeInternationallyDialled(phoneNumberClearExtension)) ? format(phoneNumberClearExtension, PhoneNumberFormat.INTERNATIONAL) : format(phoneNumberClearExtension, PhoneNumberFormat.NATIONAL);
                }
                nationalNumberWithPreferredCarrierCode = str2;
            } else if (phoneNumberClearExtension.getPreferredDomesticCarrierCode().length() > 0) {
                nationalNumberWithPreferredCarrierCode = formatNationalNumberWithPreferredCarrierCode(phoneNumberClearExtension, "");
            }
        } else if (z11 && canBeInternationallyDialled(phoneNumberClearExtension)) {
            return z10 ? format(phoneNumberClearExtension, PhoneNumberFormat.INTERNATIONAL) : format(phoneNumberClearExtension, PhoneNumberFormat.E164);
        }
        return z10 ? nationalNumberWithPreferredCarrierCode : normalizeDiallableCharsOnly(nationalNumberWithPreferredCarrierCode);
    }

    public String formatOutOfCountryCallingNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!t(str)) {
            f49232h.log(Level.WARNING, h0.b("Trying to format number from invalid region ", str, ". International formatting applied."));
            return format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        }
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!r(countryCode)) {
            return nationalSignificantNumber;
        }
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                return countryCode + " " + format(phoneNumber, PhoneNumberFormat.NATIONAL);
            }
        } else if (countryCode == k(str)) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        String internationalPrefix = phoneMetadataM.getInternationalPrefix();
        if (phoneMetadataM.hasPreferredInternationalPrefix()) {
            internationalPrefix = phoneMetadataM.getPreferredInternationalPrefix();
        } else if (!f49239p.matcher(internationalPrefix).matches()) {
            internationalPrefix = "";
        }
        Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
        PhoneNumberFormat phoneNumberFormat = PhoneNumberFormat.INTERNATIONAL;
        StringBuilder sb2 = new StringBuilder(h(nationalSignificantNumber, phoneMetadataN, phoneNumberFormat, null));
        v(phoneNumber, phoneMetadataN, phoneNumberFormat, sb2);
        if (internationalPrefix.length() > 0) {
            sb2.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, internationalPrefix);
        } else {
            D(countryCode, phoneNumberFormat, sb2);
        }
        return sb2.toString();
    }

    public String formatOutOfCountryKeepingAlphaChars(Phonenumber.PhoneNumber phoneNumber, String str) {
        String internationalPrefix;
        int iIndexOf;
        String rawInput = phoneNumber.getRawInput();
        if (rawInput.length() == 0) {
            return formatOutOfCountryCallingNumber(phoneNumber, str);
        }
        int countryCode = phoneNumber.getCountryCode();
        if (!r(countryCode)) {
            return rawInput;
        }
        String strB = B(rawInput, f49238o, true);
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (nationalSignificantNumber.length() > 3 && (iIndexOf = strB.indexOf(nationalSignificantNumber.substring(0, 3))) != -1) {
            strB = strB.substring(iIndexOf);
        }
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                return countryCode + " " + strB;
            }
        } else if (phoneMetadataM != null && countryCode == k(str)) {
            Phonemetadata.NumberFormat numberFormatA = a(nationalSignificantNumber, phoneMetadataM.getNumberFormatList());
            if (numberFormatA == null) {
                return strB;
            }
            Phonemetadata.NumberFormat.Builder builderNewBuilder = Phonemetadata.NumberFormat.newBuilder();
            builderNewBuilder.mergeFrom(numberFormatA);
            builderNewBuilder.setPattern("(\\d+)(.*)");
            builderNewBuilder.setFormat("$1$2");
            return i(strB, builderNewBuilder.build(), PhoneNumberFormat.NATIONAL, null);
        }
        if (phoneMetadataM != null) {
            internationalPrefix = phoneMetadataM.getInternationalPrefix();
            if (!f49239p.matcher(internationalPrefix).matches()) {
                internationalPrefix = phoneMetadataM.getPreferredInternationalPrefix();
            }
        } else {
            internationalPrefix = "";
        }
        StringBuilder sb2 = new StringBuilder(strB);
        Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
        PhoneNumberFormat phoneNumberFormat = PhoneNumberFormat.INTERNATIONAL;
        v(phoneNumber, phoneMetadataN, phoneNumberFormat, sb2);
        if (internationalPrefix.length() > 0) {
            sb2.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, internationalPrefix);
        } else {
            if (!t(str)) {
                f49232h.log(Level.WARNING, h0.b("Trying to format number from invalid region ", str, ". International formatting applied."));
            }
            D(countryCode, phoneNumberFormat, sb2);
        }
        return sb2.toString();
    }

    public AsYouTypeFormatter getAsYouTypeFormatter(String str) {
        return new AsYouTypeFormatter(str);
    }

    public int getCountryCodeForRegion(String str) {
        if (t(str)) {
            return k(str);
        }
        Level level = Level.WARNING;
        StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        sb2.append(str);
        sb2.append(") provided.");
        f49232h.log(level, sb2.toString());
        return 0;
    }

    public Phonenumber.PhoneNumber getExampleNumber(String str) {
        return getExampleNumberForType(str, PhoneNumberType.FIXED_LINE);
    }

    public Phonenumber.PhoneNumber getExampleNumberForNonGeoEntity(int i10) {
        Phonemetadata.PhoneMetadata phoneMetadataL = l(i10);
        Logger logger = f49232h;
        if (phoneMetadataL == null) {
            logger.log(Level.WARNING, "Invalid or unknown country calling code provided: " + i10);
            return null;
        }
        for (Phonemetadata.PhoneNumberDesc phoneNumberDesc : Arrays.asList(phoneMetadataL.getMobile(), phoneMetadataL.getTollFree(), phoneMetadataL.getSharedCost(), phoneMetadataL.getVoip(), phoneMetadataL.getVoicemail(), phoneMetadataL.getUan(), phoneMetadataL.getPremiumRate())) {
            if (phoneNumberDesc != null) {
                try {
                    if (phoneNumberDesc.hasExampleNumber()) {
                        return parse("+" + i10 + phoneNumberDesc.getExampleNumber(), "ZZ");
                    }
                    continue;
                } catch (NumberParseException e5) {
                    logger.log(Level.SEVERE, e5.toString());
                }
            }
        }
        return null;
    }

    public Phonenumber.PhoneNumber getExampleNumberForType(String str, PhoneNumberType phoneNumberType) {
        boolean zT = t(str);
        Logger logger = f49232h;
        if (!zT) {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: " + str);
            return null;
        }
        Phonemetadata.PhoneNumberDesc phoneNumberDescO = o(m(str), phoneNumberType);
        try {
            if (phoneNumberDescO.hasExampleNumber()) {
                return parse(phoneNumberDescO.getExampleNumber(), str);
            }
        } catch (NumberParseException e5) {
            logger.log(Level.SEVERE, e5.toString());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getInvalidExampleNumber(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.t(r6)
            r1 = 0
            if (r0 != 0) goto L15
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Invalid or unknown region code provided: "
            java.lang.String r6 = androidx.camera.core.processing.f.d(r2, r6)
            java.util.logging.Logger r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.f49232h
            r2.log(r0, r6)
            return r1
        L15:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r0 = r5.m(r6)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r0 = o(r0, r2)
            boolean r2 = r0.hasExampleNumber()
            if (r2 != 0) goto L26
            return r1
        L26:
            java.lang.String r0 = r0.getExampleNumber()
            int r2 = r0.length()
            int r2 = r2 + (-1)
        L30:
            r3 = 2
            if (r2 < r3) goto L46
            r3 = 0
            java.lang.String r3 = r0.substring(r3, r2)
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r3 = r5.parse(r3, r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L43
            boolean r4 = r5.isValidNumber(r3)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L43
            if (r4 != 0) goto L43
            return r3
        L43:
            int r2 = r2 + (-1)
            goto L30
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.getInvalidExampleNumber(java.lang.String):com.google.i18n.phonenumbers.Phonenumber$PhoneNumber");
    }

    public int getLengthOfGeographicalAreaCode(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata phoneMetadataM = m(getRegionCodeForNumber(phoneNumber));
        if (phoneMetadataM == null) {
            return 0;
        }
        if (!phoneMetadataM.hasNationalPrefix() && !phoneNumber.isItalianLeadingZero()) {
            return 0;
        }
        PhoneNumberType numberType = getNumberType(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!(numberType == PhoneNumberType.MOBILE && f49234j.contains(Integer.valueOf(countryCode))) && isNumberGeographical(numberType, countryCode)) {
            return getLengthOfNationalDestinationCode(phoneNumber);
        }
        return 0;
    }

    public int getLengthOfNationalDestinationCode(Phonenumber.PhoneNumber phoneNumber) {
        Phonenumber.PhoneNumber phoneNumber2;
        if (phoneNumber.hasExtension()) {
            phoneNumber2 = new Phonenumber.PhoneNumber();
            phoneNumber2.mergeFrom(phoneNumber);
            phoneNumber2.clearExtension();
        } else {
            phoneNumber2 = phoneNumber;
        }
        String[] strArrSplit = A.split(format(phoneNumber2, PhoneNumberFormat.INTERNATIONAL));
        if (strArrSplit.length <= 3) {
            return 0;
        }
        if (getNumberType(phoneNumber) != PhoneNumberType.MOBILE || getCountryMobileToken(phoneNumber.getCountryCode()).equals("")) {
            return strArrSplit[2].length();
        }
        return strArrSplit[3].length() + strArrSplit[2].length();
    }

    public String getNationalSignificantNumber(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb2 = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero() && phoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(phoneNumber.getNationalNumber());
        return sb2.toString();
    }

    public String getNddPrefixForRegion(String str, boolean z10) {
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        if (phoneMetadataM != null) {
            String nationalPrefix = phoneMetadataM.getNationalPrefix();
            if (nationalPrefix.length() == 0) {
                return null;
            }
            return z10 ? nationalPrefix.replace("~", "") : nationalPrefix;
        }
        Level level = Level.WARNING;
        StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        sb2.append(str);
        sb2.append(") provided.");
        f49232h.log(level, sb2.toString());
        return null;
    }

    public PhoneNumberType getNumberType(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata phoneMetadataN = n(phoneNumber.getCountryCode(), getRegionCodeForNumber(phoneNumber));
        return phoneMetadataN == null ? PhoneNumberType.UNKNOWN : p(phoneMetadataN, getNationalSignificantNumber(phoneNumber));
    }

    public String getRegionCodeForCountryCode(int i10) {
        List<String> list = this.f49251b.get(Integer.valueOf(i10));
        return list == null ? "ZZ" : list.get(0);
    }

    public String getRegionCodeForNumber(Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        List<String> list = this.f49251b.get(Integer.valueOf(countryCode));
        if (list == null) {
            f49232h.log(Level.INFO, "Missing/invalid country_code (" + countryCode + ")");
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (String str : list) {
            Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
            if (phoneMetadataM.hasLeadingDigits()) {
                if (this.f49254e.getPatternForRegex(phoneMetadataM.getLeadingDigits()).matcher(nationalSignificantNumber).lookingAt()) {
                    return str;
                }
            } else if (p(phoneMetadataM, nationalSignificantNumber) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public List<String> getRegionCodesForCountryCode(int i10) {
        List<String> arrayList = this.f49251b.get(Integer.valueOf(i10));
        if (arrayList == null) {
            arrayList = new ArrayList<>(0);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Set<Integer> getSupportedCallingCodes() {
        return Collections.unmodifiableSet(this.f49251b.keySet());
    }

    public Set<Integer> getSupportedGlobalNetworkCallingCodes() {
        return Collections.unmodifiableSet(this.f49256g);
    }

    public Set<String> getSupportedRegions() {
        return Collections.unmodifiableSet(this.f49255f);
    }

    public Set<PhoneNumberType> getSupportedTypesForNonGeoEntity(int i10) {
        Phonemetadata.PhoneMetadata phoneMetadataL = l(i10);
        if (phoneMetadataL != null) {
            return q(phoneMetadataL);
        }
        f49232h.log(Level.WARNING, g0.c("Unknown country calling code for a non-geographical entity provided: ", i10));
        return Collections.unmodifiableSet(new TreeSet());
    }

    public Set<PhoneNumberType> getSupportedTypesForRegion(String str) {
        if (t(str)) {
            return q(m(str));
        }
        f49232h.log(Level.WARNING, f.d("Invalid or unknown region code provided: ", str));
        return Collections.unmodifiableSet(new TreeSet());
    }

    public final String h(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        Phonemetadata.NumberFormat numberFormatA = a(str, (phoneMetadata.getIntlNumberFormatList().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) ? phoneMetadata.getNumberFormatList() : phoneMetadata.getIntlNumberFormatList());
        return numberFormatA == null ? str : i(str, numberFormatA, phoneNumberFormat, charSequence);
    }

    public final String i(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        String strReplaceAll;
        String format = numberFormat.getFormat();
        Matcher matcher = this.f49254e.getPatternForRegex(numberFormat.getPattern()).matcher(str);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.NATIONAL;
        Pattern pattern = B;
        if (phoneNumberFormat != phoneNumberFormat2 || charSequence == null || charSequence.length() <= 0 || numberFormat.getDomesticCarrierCodeFormattingRule().length() <= 0) {
            String nationalPrefixFormattingRule = numberFormat.getNationalPrefixFormattingRule();
            strReplaceAll = (phoneNumberFormat != phoneNumberFormat2 || nationalPrefixFormattingRule == null || nationalPrefixFormattingRule.length() <= 0) ? matcher.replaceAll(format) : matcher.replaceAll(pattern.matcher(format).replaceFirst(nationalPrefixFormattingRule));
        } else {
            strReplaceAll = matcher.replaceAll(pattern.matcher(format).replaceFirst(numberFormat.getDomesticCarrierCodeFormattingRule().replace("$CC", charSequence)));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return strReplaceAll;
        }
        Matcher matcher2 = f49241r.matcher(strReplaceAll);
        if (matcher2.lookingAt()) {
            strReplaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(strReplaceAll).replaceAll(Constant.DASH_STRING);
    }

    public boolean isAlphaNumber(CharSequence charSequence) {
        if (!u(charSequence)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        x(sb2);
        return f49246w.matcher(sb2).matches();
    }

    public boolean isMobileNumberPortableRegion(String str) {
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        if (phoneMetadataM != null) {
            return phoneMetadataM.getMobileNumberPortableRegion();
        }
        f49232h.log(Level.WARNING, "Invalid or unknown region code provided: " + str);
        return false;
    }

    public boolean isNANPACountry(String str) {
        return this.f49253d.contains(str);
    }

    public boolean isNumberGeographical(Phonenumber.PhoneNumber phoneNumber) {
        return isNumberGeographical(getNumberType(phoneNumber), phoneNumber.getCountryCode());
    }

    public MatchType isNumberMatch(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        Phonenumber.PhoneNumber phoneNumberB = b(phoneNumber);
        Phonenumber.PhoneNumber phoneNumberB2 = b(phoneNumber2);
        if (phoneNumberB.hasExtension() && phoneNumberB2.hasExtension() && !phoneNumberB.getExtension().equals(phoneNumberB2.getExtension())) {
            return MatchType.NO_MATCH;
        }
        int countryCode = phoneNumberB.getCountryCode();
        int countryCode2 = phoneNumberB2.getCountryCode();
        if (countryCode == 0 || countryCode2 == 0) {
            phoneNumberB.setCountryCode(countryCode2);
            if (phoneNumberB.exactlySameAs(phoneNumberB2)) {
                return MatchType.NSN_MATCH;
            }
            String strValueOf = String.valueOf(phoneNumberB.getNationalNumber());
            String strValueOf2 = String.valueOf(phoneNumberB2.getNationalNumber());
            return (strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf)) ? MatchType.SHORT_NSN_MATCH : MatchType.NO_MATCH;
        }
        if (phoneNumberB.exactlySameAs(phoneNumberB2)) {
            return MatchType.EXACT_MATCH;
        }
        if (countryCode == countryCode2) {
            String strValueOf3 = String.valueOf(phoneNumberB.getNationalNumber());
            String strValueOf4 = String.valueOf(phoneNumberB2.getNationalNumber());
            if (strValueOf3.endsWith(strValueOf4) || strValueOf4.endsWith(strValueOf3)) {
                return MatchType.SHORT_NSN_MATCH;
            }
        }
        return MatchType.NO_MATCH;
    }

    public boolean isPossibleNumber(Phonenumber.PhoneNumber phoneNumber) {
        ValidationResult validationResultIsPossibleNumberWithReason = isPossibleNumberWithReason(phoneNumber);
        return validationResultIsPossibleNumberWithReason == ValidationResult.IS_POSSIBLE || validationResultIsPossibleNumberWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
    }

    public boolean isPossibleNumberForType(Phonenumber.PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        ValidationResult validationResultIsPossibleNumberForTypeWithReason = isPossibleNumberForTypeWithReason(phoneNumber, phoneNumberType);
        return validationResultIsPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE || validationResultIsPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
    }

    public ValidationResult isPossibleNumberForTypeWithReason(Phonenumber.PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        return !r(countryCode) ? ValidationResult.INVALID_COUNTRY_CODE : F(nationalSignificantNumber, n(countryCode, getRegionCodeForCountryCode(countryCode)), phoneNumberType);
    }

    public ValidationResult isPossibleNumberWithReason(Phonenumber.PhoneNumber phoneNumber) {
        return isPossibleNumberForTypeWithReason(phoneNumber, PhoneNumberType.UNKNOWN);
    }

    public boolean isValidNumber(Phonenumber.PhoneNumber phoneNumber) {
        return isValidNumberForRegion(phoneNumber, getRegionCodeForNumber(phoneNumber));
    }

    public boolean isValidNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        int countryCode = phoneNumber.getCountryCode();
        Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, str);
        if (phoneMetadataN != null) {
            return ("001".equals(str) || countryCode == k(str)) && p(phoneMetadataN, getNationalSignificantNumber(phoneNumber)) != PhoneNumberType.UNKNOWN;
        }
        return false;
    }

    public final int k(String str) {
        Phonemetadata.PhoneMetadata phoneMetadataM = m(str);
        if (phoneMetadataM != null) {
            return phoneMetadataM.getCountryCode();
        }
        throw new IllegalArgumentException(f.d("Invalid region code: ", str));
    }

    public final Phonemetadata.PhoneMetadata l(int i10) {
        if (!this.f49256g.contains(Integer.valueOf(i10))) {
            return null;
        }
        Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = this.f49250a.getMetadataForNonGeographicalRegion(i10);
        String strC = g0.c("Missing metadata for country code ", i10);
        if (metadataForNonGeographicalRegion != null) {
            return metadataForNonGeographicalRegion;
        }
        throw new MissingMetadataException(strC);
    }

    public final Phonemetadata.PhoneMetadata m(String str) {
        if (!t(str)) {
            return null;
        }
        Phonemetadata.PhoneMetadata metadataForRegion = this.f49250a.getMetadataForRegion(str);
        String strD = f.d("Missing metadata for region code ", str);
        if (metadataForRegion != null) {
            return metadataForRegion;
        }
        throw new MissingMetadataException(strD);
    }

    public final Phonemetadata.PhoneMetadata n(int i10, String str) {
        return "001".equals(str) ? l(i10) : m(str);
    }

    public final PhoneNumberType p(Phonemetadata.PhoneMetadata phoneMetadata, String str) {
        if (!s(str, phoneMetadata.getGeneralDesc())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (s(str, phoneMetadata.getPremiumRate())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (s(str, phoneMetadata.getTollFree())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (s(str, phoneMetadata.getSharedCost())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (s(str, phoneMetadata.getVoip())) {
            return PhoneNumberType.VOIP;
        }
        if (s(str, phoneMetadata.getPersonalNumber())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (s(str, phoneMetadata.getPager())) {
            return PhoneNumberType.PAGER;
        }
        if (s(str, phoneMetadata.getUan())) {
            return PhoneNumberType.UAN;
        }
        if (s(str, phoneMetadata.getVoicemail())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (!s(str, phoneMetadata.getFixedLine())) {
            return (phoneMetadata.getSameMobileAndFixedLinePattern() || !s(str, phoneMetadata.getMobile())) ? PhoneNumberType.UNKNOWN : PhoneNumberType.MOBILE;
        }
        if (phoneMetadata.getSameMobileAndFixedLinePattern()) {
            return PhoneNumberType.FIXED_LINE_OR_MOBILE;
        }
        return s(str, phoneMetadata.getMobile()) ? PhoneNumberType.FIXED_LINE_OR_MOBILE : PhoneNumberType.FIXED_LINE;
    }

    public Phonenumber.PhoneNumber parse(CharSequence charSequence, String str) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        parse(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public Phonenumber.PhoneNumber parseAndKeepRawInput(CharSequence charSequence, String str) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        parseAndKeepRawInput(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public final boolean r(int i10) {
        return this.f49251b.containsKey(Integer.valueOf(i10));
    }

    public final boolean s(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List<Integer> possibleLengthList = phoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(Integer.valueOf(length))) {
            return this.f49252c.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    public final boolean t(String str) {
        return str != null && this.f49255f.contains(str);
    }

    public boolean truncateTooLongNumber(Phonenumber.PhoneNumber phoneNumber) {
        if (isValidNumber(phoneNumber)) {
            return true;
        }
        Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
        phoneNumber2.mergeFrom(phoneNumber);
        long nationalNumber = phoneNumber.getNationalNumber();
        do {
            nationalNumber /= 10;
            phoneNumber2.setNationalNumber(nationalNumber);
            if (isPossibleNumberWithReason(phoneNumber2) == ValidationResult.TOO_SHORT || nationalNumber == 0) {
                return false;
            }
        } while (!isValidNumber(phoneNumber2));
        phoneNumber.setNationalNumber(nationalNumber);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    public final int w(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb2, boolean z10, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        Phonenumber.PhoneNumber.CountryCodeSource countryCodeSource;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb3 = new StringBuilder(charSequence);
        String internationalPrefix = phoneMetadata != null ? phoneMetadata.getInternationalPrefix() : "NonMatch";
        if (sb3.length() == 0) {
            countryCodeSource = Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = f49240q.matcher(sb3);
            if (matcher.lookingAt()) {
                sb3.delete(0, matcher.end());
                z(sb3);
                countryCodeSource = Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern patternForRegex = this.f49254e.getPatternForRegex(internationalPrefix);
                z(sb3);
                Matcher matcher2 = patternForRegex.matcher(sb3);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = f49242s.matcher(sb3.substring(iEnd));
                    if (matcher3.find() && normalizeDigitsOnly(matcher3.group(1)).equals("0")) {
                        countryCodeSource = Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
                    } else {
                        sb3.delete(0, iEnd);
                        countryCodeSource = Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
                    }
                } else {
                    countryCodeSource = Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
                }
            }
        }
        if (z10) {
            phoneNumber.setCountryCodeSource(countryCodeSource);
        }
        if (countryCodeSource != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (sb3.length() <= 2) {
                throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iF = f(sb3, sb2);
            if (iF == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            phoneNumber.setCountryCode(iF);
            return iF;
        }
        if (phoneMetadata != null) {
            int countryCode = phoneMetadata.getCountryCode();
            String strValueOf = String.valueOf(countryCode);
            String string = sb3.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb4 = new StringBuilder(string.substring(strValueOf.length()));
                Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                y(sb4, phoneMetadata, null);
                MatcherApi matcherApi = this.f49252c;
                if ((!matcherApi.matchNationalNumber(sb3, generalDesc, false) && matcherApi.matchNationalNumber(sb4, generalDesc, false)) || F(sb3, phoneMetadata, PhoneNumberType.UNKNOWN) == ValidationResult.TOO_LONG) {
                    sb2.append((CharSequence) sb4);
                    if (z10) {
                        phoneNumber.setCountryCodeSource(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    phoneNumber.setCountryCode(countryCode);
                    return countryCode;
                }
            }
        }
        phoneNumber.setCountryCode(0);
        return 0;
    }

    public final boolean y(StringBuilder sb2, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb3) {
        int length = sb2.length();
        String nationalPrefixForParsing = phoneMetadata.getNationalPrefixForParsing();
        if (length != 0 && nationalPrefixForParsing.length() != 0) {
            Matcher matcher = this.f49254e.getPatternForRegex(nationalPrefixForParsing).matcher(sb2);
            if (matcher.lookingAt()) {
                Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                MatcherApi matcherApi = this.f49252c;
                boolean zMatchNationalNumber = matcherApi.matchNationalNumber(sb2, generalDesc, false);
                int iGroupCount = matcher.groupCount();
                String nationalPrefixTransformRule = phoneMetadata.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule == null || nationalPrefixTransformRule.length() == 0 || matcher.group(iGroupCount) == null) {
                    if (zMatchNationalNumber && !matcherApi.matchNationalNumber(sb2.substring(matcher.end()), generalDesc, false)) {
                        return false;
                    }
                    if (sb3 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(sb2);
                sb4.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                if (zMatchNationalNumber && !matcherApi.matchNationalNumber(sb4.toString(), generalDesc, false)) {
                    return false;
                }
                if (sb3 != null && iGroupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
                return true;
            }
        }
        return false;
    }

    public Iterable<PhoneNumberMatch> findNumbers(CharSequence charSequence, String str, Leniency leniency, long j10) {
        return new a(charSequence, str, leniency, j10);
    }

    public boolean isNumberGeographical(PhoneNumberType phoneNumberType, int i10) {
        return phoneNumberType == PhoneNumberType.FIXED_LINE || phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE || (f49235k.contains(Integer.valueOf(i10)) && phoneNumberType == PhoneNumberType.MOBILE);
    }

    public boolean isPossibleNumber(CharSequence charSequence, String str) {
        try {
            return isPossibleNumber(parse(charSequence, str));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public void parse(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        C(charSequence, str, false, true, phoneNumber);
    }

    public void parseAndKeepRawInput(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        C(charSequence, str, true, true, phoneNumber);
    }

    public void format(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder sb2) {
        sb2.setLength(0);
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.E164;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb2.append(nationalSignificantNumber);
            D(countryCode, phoneNumberFormat2, sb2);
        } else {
            if (!r(countryCode)) {
                sb2.append(nationalSignificantNumber);
                return;
            }
            Phonemetadata.PhoneMetadata phoneMetadataN = n(countryCode, getRegionCodeForCountryCode(countryCode));
            sb2.append(h(nationalSignificantNumber, phoneMetadataN, phoneNumberFormat, null));
            v(phoneNumber, phoneMetadataN, phoneNumberFormat, sb2);
            D(countryCode, phoneNumberFormat, sb2);
        }
    }

    public Phonenumber.PhoneNumber getExampleNumberForType(PhoneNumberType phoneNumberType) {
        Iterator<String> it = getSupportedRegions().iterator();
        while (it.hasNext()) {
            Phonenumber.PhoneNumber exampleNumberForType = getExampleNumberForType(it.next(), phoneNumberType);
            if (exampleNumberForType != null) {
                return exampleNumberForType;
            }
        }
        Iterator<Integer> it2 = getSupportedGlobalNetworkCallingCodes().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            Phonemetadata.PhoneNumberDesc phoneNumberDescO = o(l(iIntValue), phoneNumberType);
            try {
                if (phoneNumberDescO.hasExampleNumber()) {
                    return parse("+" + iIntValue + phoneNumberDescO.getExampleNumber(), "ZZ");
                }
                continue;
            } catch (NumberParseException e5) {
                f49232h.log(Level.SEVERE, e5.toString());
            }
        }
        return null;
    }

    public MatchType isNumberMatch(CharSequence charSequence, CharSequence charSequence2) {
        try {
            return isNumberMatch(parse(charSequence, "ZZ"), charSequence2);
        } catch (NumberParseException e5) {
            if (e5.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    return isNumberMatch(parse(charSequence2, "ZZ"), charSequence);
                } catch (NumberParseException e7) {
                    if (e7.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
                            Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                            C(charSequence, null, false, false, phoneNumber);
                            C(charSequence2, null, false, false, phoneNumber2);
                            return isNumberMatch(phoneNumber, phoneNumber2);
                        } catch (NumberParseException unused) {
                            return MatchType.NOT_A_NUMBER;
                        }
                    }
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    public MatchType isNumberMatch(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        try {
            return isNumberMatch(phoneNumber, parse(charSequence, "ZZ"));
        } catch (NumberParseException e5) {
            if (e5.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
                try {
                    if (!regionCodeForCountryCode.equals("ZZ")) {
                        MatchType matchTypeIsNumberMatch = isNumberMatch(phoneNumber, parse(charSequence, regionCodeForCountryCode));
                        return matchTypeIsNumberMatch == MatchType.EXACT_MATCH ? MatchType.NSN_MATCH : matchTypeIsNumberMatch;
                    }
                    Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                    C(charSequence, null, false, false, phoneNumber2);
                    return isNumberMatch(phoneNumber, phoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }
}
