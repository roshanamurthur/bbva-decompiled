package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import mx.openpay.library.domain.util.Constant;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PreferenceInflater.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f22454e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f22455f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f22456a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PreferenceManager f22458c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f22457b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f22459d = {Preference.class.getPackage().getName() + Constant.DOT_STRING, SwitchPreference.class.getPackage().getName() + Constant.DOT_STRING};

    public g(@NonNull Context context, PreferenceManager preferenceManager) {
        this.f22456a = context;
        this.f22458c = preferenceManager;
    }

    public final Preference a(@NonNull String str, @Nullable String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        HashMap<String, Constructor<?>> map = f22455f;
        Constructor<?> constructor = map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f22456a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e5 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e7) {
                                e5 = e7;
                            }
                        }
                        if (cls == null) {
                            if (e5 != null) {
                                throw e5;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f22454e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e10) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e11) {
                throw e11;
            }
        }
        Object[] objArr = this.f22457b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f22459d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e5) {
            throw e5;
        } catch (ClassNotFoundException e7) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e7);
            throw inflateException;
        } catch (Exception e10) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e10);
            throw inflateException2;
        }
    }

    @NonNull
    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, @Nullable PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f22457b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f22457b[0] = this.f22456a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e5) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e5.getMessage());
                            inflateException.initCause(e5);
                            throw inflateException;
                        }
                    } catch (InflateException e7) {
                        throw e7;
                    }
                } catch (XmlPullParserException e10) {
                    InflateException inflateException2 = new InflateException(e10.getMessage());
                    inflateException2.initCause(e10);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.onAttachedToHierarchy(this.f22458c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(@NonNull XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f22456a;
                if (zEquals) {
                    try {
                        preference.setIntent(Intent.parseIntent(context.getResources(), xmlResourceParser, attributeSet));
                    } catch (IOException e5) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e5);
                        throw xmlPullParserException;
                    }
                } else if (SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY.equals(name)) {
                    context.getResources().parseBundleExtra(SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, attributeSet, preference.getExtras());
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e7) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e7);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).addItemFromInflater(preferenceB);
                    d(xmlResourceParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
