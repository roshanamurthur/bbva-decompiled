package io.card.payment.i18n;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.PushConstants;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class I18nManager<E extends Enum<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f69795d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f69796a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SupportedLocale<E> f69797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<E> f69798c;

    static {
        HashMap map = new HashMap();
        f69795d = map;
        HashSet hashSet = new HashSet();
        map.put("zh_CN", "zh-Hans");
        map.put("zh_TW", "zh-Hant_TW");
        map.put("zh_HK", "zh-Hant");
        map.put("en_UK", "en_GB");
        map.put("en_IE", "en_GB");
        map.put("iw_IL", "he");
        map.put(SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO, "nb");
        hashSet.add("he");
        hashSet.add("ar");
    }

    public I18nManager(Class<E> cls, List<SupportedLocale<E>> list) {
        this.f69798c = cls;
        for (SupportedLocale<E> supportedLocale : list) {
            String name = supportedLocale.getName();
            if (name == null) {
                throw new RuntimeException("Null localeName");
            }
            LinkedHashMap linkedHashMap = this.f69796a;
            if (linkedHashMap.containsKey(name)) {
                throw new RuntimeException(h0.b("Locale ", name, " already added"));
            }
            linkedHashMap.put(name, supportedLocale);
            SupportedLocale supportedLocale2 = (SupportedLocale) linkedHashMap.get(name);
            ArrayList<String> arrayList = new ArrayList();
            for (E e5 : this.f69798c.getEnumConstants()) {
                String str = Constant.BRACKET_OPEN + name + "," + e5 + Constant.BRACKET_CLOSE;
                if (supportedLocale2.getAdaptedDisplay(e5, null) == null) {
                    arrayList.add("Missing " + str);
                }
            }
            for (String str2 : arrayList) {
            }
        }
        setLanguage(null);
    }

    public final SupportedLocale<E> a(String str) {
        String string;
        if (str == null || str.length() < 2) {
            return null;
        }
        HashMap map = f69795d;
        boolean zContainsKey = map.containsKey(str);
        LinkedHashMap linkedHashMap = this.f69796a;
        SupportedLocale<E> supportedLocale = zContainsKey ? (SupportedLocale) linkedHashMap.get((String) map.get(str)) : null;
        if (supportedLocale == null) {
            if (str.contains(PushConstants.GE_PARAMS_SEPARATOR)) {
                string = str;
            } else {
                StringBuilder sbE = f.e(str, PushConstants.GE_PARAMS_SEPARATOR);
                sbE.append(Locale.getDefault().getCountry());
                string = sbE.toString();
            }
            supportedLocale = (SupportedLocale) linkedHashMap.get(string);
        }
        if (supportedLocale == null) {
            supportedLocale = (SupportedLocale) linkedHashMap.get(str);
        }
        return supportedLocale == null ? (SupportedLocale) linkedHashMap.get(str.substring(0, 2)) : supportedLocale;
    }

    public SupportedLocale<E> getLocaleFromSpecifier(String str) {
        SupportedLocale<E> supportedLocaleA = str != null ? a(str) : null;
        if (supportedLocaleA == null) {
            supportedLocaleA = a(Locale.getDefault().toString());
        }
        return supportedLocaleA == null ? (SupportedLocale) this.f69796a.get("en") : supportedLocaleA;
    }

    public String getString(E e5) {
        return getString(e5, this.f69797b);
    }

    public void setLanguage(String str) {
        this.f69797b = null;
        SupportedLocale<E> localeFromSpecifier = getLocaleFromSpecifier(str);
        this.f69797b = localeFromSpecifier;
        localeFromSpecifier.getName();
    }

    public String getString(E e5, SupportedLocale<E> supportedLocale) {
        String upperCase = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        String adaptedDisplay = supportedLocale.getAdaptedDisplay(e5, upperCase);
        if (adaptedDisplay == null) {
            this.f69797b.getName();
            e5.toString();
            adaptedDisplay = ((SupportedLocale) this.f69796a.get("en")).getAdaptedDisplay(e5, upperCase);
        }
        if (adaptedDisplay != null) {
            return adaptedDisplay;
        }
        e5.toString();
        return e5.toString();
    }
}
