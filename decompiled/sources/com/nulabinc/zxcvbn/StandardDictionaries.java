package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.io.ClasspathResource;
import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.DictionaryLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class StandardDictionaries {
    public static final String ENGLISH_WIKIPEDIA = "english_wikipedia";
    public static final DictionaryLoader ENGLISH_WIKIPEDIA_LOADER;
    public static final String FEMALE_NAMES = "female_names";
    public static final DictionaryLoader FEMALE_NAMES_LOADER;
    public static final String MALE_NAMES = "male_names";
    public static final DictionaryLoader MALE_NAMES_LOADER;
    public static final String PASSWORDS = "passwords";
    public static final DictionaryLoader PASSWORDS_LOADER;
    public static final String SURNAMES = "surnames";
    public static final DictionaryLoader SURNAMES_LOADER;
    public static final String US_TV_AND_FILM = "us_tv_and_film";
    public static final DictionaryLoader US_TV_AND_FILM_LOADER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DictionaryLoader[] f63638a;

    static {
        DictionaryLoader dictionaryLoader = new DictionaryLoader(US_TV_AND_FILM, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/us_tv_and_film.txt"));
        US_TV_AND_FILM_LOADER = dictionaryLoader;
        DictionaryLoader dictionaryLoader2 = new DictionaryLoader(ENGLISH_WIKIPEDIA, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/english_wikipedia.txt"));
        ENGLISH_WIKIPEDIA_LOADER = dictionaryLoader2;
        DictionaryLoader dictionaryLoader3 = new DictionaryLoader(PASSWORDS, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/passwords.txt"));
        PASSWORDS_LOADER = dictionaryLoader3;
        DictionaryLoader dictionaryLoader4 = new DictionaryLoader(SURNAMES, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/surnames.txt"));
        SURNAMES_LOADER = dictionaryLoader4;
        DictionaryLoader dictionaryLoader5 = new DictionaryLoader(MALE_NAMES, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/male_names.txt"));
        MALE_NAMES_LOADER = dictionaryLoader5;
        DictionaryLoader dictionaryLoader6 = new DictionaryLoader(FEMALE_NAMES, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/dictionaries/female_names.txt"));
        FEMALE_NAMES_LOADER = dictionaryLoader6;
        f63638a = new DictionaryLoader[]{dictionaryLoader, dictionaryLoader2, dictionaryLoader3, dictionaryLoader4, dictionaryLoader5, dictionaryLoader6};
    }

    public static List<Dictionary> loadAllDictionaries() throws IOException {
        ArrayList arrayList = new ArrayList();
        for (DictionaryLoader dictionaryLoader : f63638a) {
            arrayList.add(dictionaryLoader.load());
        }
        return arrayList;
    }
}
