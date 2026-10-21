package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityChooserModel extends DataSetObservable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f1088n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f1089o = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f1095f;
    public OnChooseActivityListener m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1090a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1091b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1092c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f1096g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1097h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1098i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1099j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1100k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1101l = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(this.weight) + Constant.BRACKET_CLOSE;
        }

        @Override // java.lang.Comparable
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j10, float f6) {
            this(ComponentName.unflattenFromString(str), j10, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public int hashCode() {
            ComponentName componentName = this.activity;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.time;
            return Float.floatToIntBits(this.weight) + ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }

        public String toString() {
            return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(this.weight) + Constant.BRACKET_CLOSE;
        }

        public HistoricalRecord(ComponentName componentName, long j10, float f6) {
            this.activity = componentName;
            this.time = j10;
            this.weight = f6;
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    public static final class a implements ActivitySorter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f1102a = new HashMap();

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public final void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            HashMap map = this.f1102a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ActivityResolveInfo activityResolveInfo = list.get(i10);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f6 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight = (historicalRecord.weight * f6) + activityResolveInfo2.weight;
                    f6 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public final class b extends AsyncTask<Object, Void, Void> {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x006d A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            ActivityChooserModel activityChooserModel = ActivityChooserModel.this;
            List list = (List) objArr[0];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = activityChooserModel.f1093d.openFileOutput((String) objArr[1], 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        HistoricalRecord historicalRecord = (HistoricalRecord) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, "historical-record");
                        xmlSerializerNewSerializer.attribute(null, ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, historicalRecord.activity.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(historicalRecord.time));
                        xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(historicalRecord.weight));
                        xmlSerializerNewSerializer.endTag(null, "historical-record");
                    }
                    xmlSerializerNewSerializer.endTag(null, "historical-records");
                    xmlSerializerNewSerializer.endDocument();
                } catch (IllegalArgumentException unused) {
                    Object obj = ActivityChooserModel.f1088n;
                } catch (IOException unused2) {
                    Object obj2 = ActivityChooserModel.f1088n;
                } catch (IllegalStateException unused3) {
                    Object obj3 = ActivityChooserModel.f1088n;
                } finally {
                    activityChooserModel.f1098i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused4) {
                        }
                    }
                }
            } catch (FileNotFoundException unused5) {
                Object obj4 = ActivityChooserModel.f1088n;
            }
            return null;
        }
    }

    public ActivityChooserModel(Context context, String str) {
        this.f1093d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1094e = str;
        } else {
            this.f1094e = str.concat(".xml");
        }
    }

    public static ActivityChooserModel d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f1088n) {
            try {
                HashMap map = f1089o;
                activityChooserModel = (ActivityChooserModel) map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return activityChooserModel;
    }

    public final void a(HistoricalRecord historicalRecord) {
        ArrayList arrayList = this.f1092c;
        if (arrayList.add(historicalRecord)) {
            this.f1100k = true;
            h();
            if (!this.f1099j) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.f1100k) {
                this.f1100k = false;
                String str = this.f1094e;
                if (!TextUtils.isEmpty(str)) {
                    new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(arrayList), str);
                }
            }
            i();
            notifyChanged();
        }
    }

    public final Intent b(int i10) {
        synchronized (this.f1090a) {
            try {
                if (this.f1095f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = ((ActivityResolveInfo) this.f1091b.get(i10)).resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f1095f);
                intent.setComponent(componentName);
                if (this.m != null) {
                    if (this.m.onChooseActivity(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    public final void c() throws IOException {
        boolean z10;
        boolean z11 = this.f1101l;
        boolean z12 = true;
        Context context = this.f1093d;
        if (!z11 || this.f1095f == null) {
            z10 = false;
        } else {
            this.f1101l = false;
            ArrayList arrayList = this.f1091b;
            arrayList.clear();
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(this.f1095f, 0);
            int size = listQueryIntentActivities.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new ActivityResolveInfo(listQueryIntentActivities.get(i10)));
            }
            z10 = true;
        }
        if (this.f1098i && this.f1100k) {
            String str = this.f1094e;
            if (TextUtils.isEmpty(str)) {
                z12 = false;
            } else {
                this.f1098i = false;
                this.f1099j = true;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                        }
                        if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        ArrayList arrayList2 = this.f1092c;
                        arrayList2.clear();
                        while (true) {
                            int next2 = xmlPullParserNewPullParser.next();
                            if (next2 == 1) {
                                if (fileInputStreamOpenFileInput == null) {
                                    break;
                                }
                                fileInputStreamOpenFileInput.close();
                                break;
                            } else if (next2 != 3 && next2 != 4) {
                                if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                arrayList2.add(new HistoricalRecord(xmlPullParserNewPullParser.getAttributeValue(null, ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                            }
                        }
                    } catch (IOException unused) {
                        if (fileInputStreamOpenFileInput != null) {
                            break;
                        }
                    } catch (XmlPullParserException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException | IOException unused4) {
                }
            }
        } else {
            z12 = false;
        }
        boolean z13 = z10 | z12;
        h();
        if (z13) {
            i();
            notifyChanged();
        }
    }

    public final ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f1090a) {
            c();
            resolveInfo = ((ActivityResolveInfo) this.f1091b.get(i10)).resolveInfo;
        }
        return resolveInfo;
    }

    public final int f() {
        int size;
        synchronized (this.f1090a) {
            c();
            size = this.f1091b.size();
        }
        return size;
    }

    public final ResolveInfo g() {
        synchronized (this.f1090a) {
            try {
                c();
                if (this.f1091b.isEmpty()) {
                    return null;
                }
                return ((ActivityResolveInfo) this.f1091b.get(0)).resolveInfo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f1092c;
        int size = arrayList.size() - this.f1097h;
        if (size <= 0) {
            return;
        }
        this.f1100k = true;
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    public final void i() {
        a aVar = this.f1096g;
        if (aVar == null || this.f1095f == null) {
            return;
        }
        ArrayList arrayList = this.f1091b;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f1092c;
        if (arrayList2.isEmpty()) {
            return;
        }
        aVar.sort(this.f1095f, arrayList, Collections.unmodifiableList(arrayList2));
    }
}
