package com.nulabinc.zxcvbn;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes11.dex */
public class Feedback {
    public static final String DATE_SUGGESTIONS_AVOID_DATES = "feedback.date.suggestions.avoidDates";
    public static final String DATE_WARNING_DATES = "feedback.date.warning.dates";
    public static final String DEFAULT_SUGGESTIONS_NO_NEED_SYMBOLS = "feedback.default.suggestions.noNeedSymbols";
    public static final String DEFAULT_SUGGESTIONS_USE_FEW_WORDS = "feedback.default.suggestions.useFewWords";
    public static final String DICTIONARY_SUGGESTIONS_ALL_UPPERCASE = "feedback.dictionary.suggestions.allUppercase";
    public static final String DICTIONARY_SUGGESTIONS_CAPITALIZATION = "feedback.dictionary.suggestions.capitalization";
    public static final String DICTIONARY_SUGGESTIONS_L33T = "feedback.dictionary.suggestions.l33t";
    public static final String DICTIONARY_SUGGESTIONS_REVERSED = "feedback.dictionary.suggestions.reversed";
    public static final String DICTIONARY_WARNING_ENGLISH_WIKIPEDIA_ITSELF = "feedback.dictionary.warning.englishWikipedia.itself";
    public static final String DICTIONARY_WARNING_ETC_NAMES_COMMON = "feedback.dictionary.warning.etc.namesCommon";
    public static final String DICTIONARY_WARNING_ETC_NAMES_THEMSELVES = "feedback.dictionary.warning.etc.namesThemselves";
    public static final String DICTIONARY_WARNING_PASSWORDS_SIMILAR = "feedback.dictionary.warning.passwords.similar";
    public static final String DICTIONARY_WARNING_PASSWORDS_TOP10 = "feedback.dictionary.warning.passwords.top10";
    public static final String DICTIONARY_WARNING_PASSWORDS_TOP100 = "feedback.dictionary.warning.passwords.top100";
    public static final String DICTIONARY_WARNING_PASSWORDS_VERY_COMMON = "feedback.dictionary.warning.passwords.veryCommon";
    public static final String EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD = "feedback.extra.suggestions.addAnotherWord";
    public static final String REGEX_SUGGESTIONS_AVOID_RECENT_YEARS = "feedback.regex.suggestions.avoidRecentYears";
    public static final String REGEX_WARNING_RECENT_YEARS = "feedback.regex.warning.recentYears";
    public static final String REPEAT_SUGGESTIONS_AVOID_REPEATED_WORDS = "feedback.repeat.suggestions.avoidRepeatedWords";
    public static final String REPEAT_WARNING_LIKE_AAA = "feedback.repeat.warning.likeAAA";
    public static final String REPEAT_WARNING_LIKE_ABCABCABC = "feedback.repeat.warning.likeABCABCABC";
    public static final String SEQUENCE_SUGGESTIONS_AVOID_SEQUENCES = "feedback.sequence.suggestions.avoidSequences";
    public static final String SEQUENCE_WARNING_LIKE_ABCOR6543 = "feedback.sequence.warning.likeABCor6543";
    public static final String SPATIAL_SUGGESTIONS_USE_LONGER_KEYBOARD_PATTERN = "feedback.spatial.suggestions.UseLongerKeyboardPattern";
    public static final String SPATIAL_WARNING_SHORT_KEYBOARD_PATTERNS = "feedback.spatial.warning.shortKeyboardPatterns";
    public static final String SPATIAL_WARNING_STRAIGHT_ROWS_OF_KEYS = "feedback.spatial.warning.straightRowsOfKeys";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ResourceBundle.Control f63627c = ResourceBundle.Control.getNoFallbackControl(ResourceBundle.Control.FORMAT_DEFAULT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f63629b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63630a;

        static {
            int[] iArr = new int[Pattern.values().length];
            f63630a = iArr;
            try {
                iArr[Pattern.Dictionary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63630a[Pattern.Spatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63630a[Pattern.Repeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63630a[Pattern.Sequence.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63630a[Pattern.Regex.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63630a[Pattern.Date.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b extends Feedback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<Locale, ResourceBundle> f63631d;

        public b(Map map, String str, String[] strArr) {
            super(str, strArr);
            this.f63631d = map;
        }

        @Override // com.nulabinc.zxcvbn.Feedback
        public final ResourceBundle resolveResourceBundle(Locale locale) {
            Map<Locale, ResourceBundle> map = this.f63631d;
            try {
                return map.containsKey(locale) ? map.get(locale) : ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale, Feedback.f63627c);
            } catch (UnsupportedOperationException unused) {
                return ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale);
            } catch (MissingResourceException unused2) {
                return ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale);
            }
        }
    }

    public static class c extends Feedback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ResourceBundle f63632d;

        @Override // com.nulabinc.zxcvbn.Feedback
        public final ResourceBundle resolveResourceBundle(Locale locale) {
            return this.f63632d;
        }
    }

    public Feedback(String str, String... strArr) {
        this.f63628a = str;
        this.f63629b = strArr;
    }

    public List<String> getSuggestions() {
        return getSuggestions(Locale.getDefault());
    }

    public String getWarning() {
        return getWarning(Locale.getDefault());
    }

    public Feedback replaceResourceBundle(Map<Locale, ResourceBundle> map) {
        return new b(map, this.f63628a, this.f63629b);
    }

    public ResourceBundle resolveResourceBundle(Locale locale) {
        try {
            return ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale, f63627c);
        } catch (UnsupportedOperationException unused) {
            return ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale);
        } catch (MissingResourceException unused2) {
            return ResourceBundle.getBundle("com/nulabinc/zxcvbn/messages", locale);
        }
    }

    public Feedback withResourceBundle(ResourceBundle resourceBundle) {
        c cVar = new c(this.f63628a, this.f63629b);
        cVar.f63632d = resourceBundle;
        return cVar;
    }

    public List<String> getSuggestions(Locale locale) {
        String[] strArr = this.f63629b;
        ArrayList arrayList = new ArrayList(strArr.length);
        ResourceBundle resourceBundleResolveResourceBundle = resolveResourceBundle(locale);
        for (String string : strArr) {
            if (resourceBundleResolveResourceBundle != null) {
                string = resourceBundleResolveResourceBundle.getString(string);
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    public String getWarning(Locale locale) {
        String str = this.f63628a;
        if (str == null) {
            return "";
        }
        ResourceBundle resourceBundleResolveResourceBundle = resolveResourceBundle(locale);
        return resourceBundleResolveResourceBundle != null ? resourceBundleResolveResourceBundle.getString(str) : str;
    }
}
