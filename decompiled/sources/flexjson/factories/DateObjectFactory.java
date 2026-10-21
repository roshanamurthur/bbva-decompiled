package flexjson.factories;

import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DateObjectFactory implements ObjectFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f68515a;
    protected List<String> dateFormats;
    protected ThreadLocal<List<DateFormat>> dateFormatters;
    protected boolean fromDefaults;

    static {
        ArrayList arrayList = new ArrayList();
        f68515a = arrayList;
        arrayList.add("EEE MMM d hh:mm:ss a z yyyy");
        arrayList.add("EEE MMM d HH:mm:ss z yyyy");
        arrayList.add("MM/dd/yy hh:mm:ss a");
        arrayList.add("MM/dd/yy");
    }

    public DateObjectFactory() {
        this.fromDefaults = false;
        this.dateFormatters = new ThreadLocal<>();
        this.fromDefaults = true;
        this.dateFormats = new ArrayList(f68515a);
    }

    public static Date a(Class cls, Long l6) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            return (Date) cls.getConstructor(Long.TYPE).newInstance(l6);
        } catch (NoSuchMethodException unused) {
            Date date = (Date) cls.newInstance();
            date.setTime(l6.longValue());
            return date;
        }
    }

    public static void addDefaultFormat(String... strArr) {
        f68515a.addAll(Arrays.asList(strArr));
    }

    public DateObjectFactory add(String... strArr) {
        this.dateFormats.addAll(Arrays.asList(strArr));
        return this;
    }

    public List<DateFormat> getDateFormats() {
        if (this.dateFormatters.get() == null) {
            ArrayList arrayList = new ArrayList();
            if (this.fromDefaults) {
                arrayList.add(DateFormat.getDateTimeInstance());
                arrayList.add(DateFormat.getDateTimeInstance(1, 1));
                arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                arrayList.add(DateFormat.getDateTimeInstance(3, 3));
            }
            Iterator<String> it = this.dateFormats.iterator();
            while (it.hasNext()) {
                arrayList.add(new SimpleDateFormat(it.next()));
            }
            this.dateFormatters.set(arrayList);
        }
        return this.dateFormatters.get();
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        try {
            if (obj instanceof Number) {
                return a((Class) type, Long.valueOf(((Number) obj).longValue()));
            }
            Iterator<DateFormat> it = getDateFormats().iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(obj.toString());
                } catch (ParseException unused) {
                }
            }
            throw new JSONException(String.format("%s:  Parsing date %s was not recognized as a date format", objectBinder.getCurrentPath(), obj));
        } catch (IllegalAccessException e5) {
            throw new JSONException(String.format("%s:  Error encountered trying to instantiate %s", objectBinder.getCurrentPath(), ((Class) type).getName()), e5);
        } catch (InstantiationException e7) {
            throw new JSONException(String.format("%s:  Error encountered trying to instantiate %s.  Make sure there is a public constructor that accepts a single Long.", objectBinder.getCurrentPath(), ((Class) type).getName()), e7);
        } catch (InvocationTargetException e10) {
            throw new JSONException(String.format("%s:  Error encountered trying to instantiate %s.  Make sure there is a public constructor that accepts a single Long.", objectBinder.getCurrentPath(), ((Class) type).getName()), e10);
        }
    }

    public DateObjectFactory(List<String> list) {
        this.fromDefaults = false;
        this.dateFormatters = new ThreadLocal<>();
        this.dateFormats = list;
    }
}
