package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class StateSet {
    public static final String TAG = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19802b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19803c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f19804d = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f19806b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19807c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f19807c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.f19805a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19805a);
                } else if (index == R.styleable.State_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19807c);
                    this.f19807c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int a(float f6, float f10) {
            int i10 = 0;
            while (true) {
                ArrayList<b> arrayList = this.f19806b;
                if (i10 >= arrayList.size()) {
                    return -1;
                }
                if (arrayList.get(i10).a(f6, f10)) {
                    return i10;
                }
                i10++;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f19810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19812e;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f19808a = Float.NaN;
            this.f19809b = Float.NaN;
            this.f19810c = Float.NaN;
            this.f19811d = Float.NaN;
            this.f19812e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19812e);
                    this.f19812e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName);
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f19811d = typedArrayObtainStyledAttributes.getDimension(index, this.f19811d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f19809b = typedArrayObtainStyledAttributes.getDimension(index, this.f19809b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f19810c = typedArrayObtainStyledAttributes.getDimension(index, this.f19810c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f19808a = typedArrayObtainStyledAttributes.getDimension(index, this.f19808a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f6, float f10) {
            float f11 = this.f19808a;
            if (!Float.isNaN(f11) && f6 < f11) {
                return false;
            }
            float f12 = this.f19809b;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f19810c;
            if (!Float.isNaN(f13) && f6 > f13) {
                return false;
            }
            float f14 = this.f19811d;
            return Float.isNaN(f14) || f10 <= f14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public StateSet(Context context, XmlPullParser xmlPullParser) {
        this.f19801a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.StateSet_defaultState) {
                this.f19801a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19801a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        aVar = new a(context, xmlPullParser);
                        this.f19804d.put(aVar.f19805a, aVar);
                    } else if (b10 == 3) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.f19806b.add(bVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public int convertToConstraintSet(int i10, int i11, float f6, float f10) {
        a aVar = this.f19804d.get(i11);
        if (aVar == null) {
            return i11;
        }
        ArrayList<b> arrayList = aVar.f19806b;
        int i12 = aVar.f19807c;
        if (f6 == -1.0f || f10 == -1.0f) {
            if (i12 == i10) {
                return i10;
            }
            Iterator<b> it = arrayList.iterator();
            while (it.hasNext()) {
                if (i10 == it.next().f19812e) {
                    return i10;
                }
            }
            return i12;
        }
        b bVar = null;
        for (b bVar2 : arrayList) {
            if (bVar2.a(f6, f10)) {
                if (i10 == bVar2.f19812e) {
                    return i10;
                }
                bVar = bVar2;
            }
        }
        return bVar != null ? bVar.f19812e : i12;
    }

    public boolean needsToChange(int i10, float f6, float f10) {
        int i11 = this.f19802b;
        if (i11 != i10) {
            return true;
        }
        SparseArray<a> sparseArray = this.f19804d;
        a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
        int i12 = this.f19803c;
        return (i12 == -1 || !aVarValueAt.f19806b.get(i12).a(f6, f10)) && i12 != aVarValueAt.a(f6, f10);
    }

    public int stateGetConstraintID(int i10, int i11, int i12) {
        return updateConstraints(-1, i10, i11, i12);
    }

    public int updateConstraints(int i10, int i11, float f6, float f10) {
        int iA;
        SparseArray<a> sparseArray = this.f19804d;
        if (i10 != i11) {
            a aVar = sparseArray.get(i11);
            if (aVar == null) {
                return -1;
            }
            int iA2 = aVar.a(f6, f10);
            return iA2 == -1 ? aVar.f19807c : aVar.f19806b.get(iA2).f19812e;
        }
        a aVarValueAt = i11 == -1 ? sparseArray.valueAt(0) : sparseArray.get(this.f19802b);
        if (aVarValueAt == null) {
            return -1;
        }
        int i12 = this.f19803c;
        ArrayList<b> arrayList = aVarValueAt.f19806b;
        if ((i12 == -1 || !arrayList.get(i10).a(f6, f10)) && i10 != (iA = aVarValueAt.a(f6, f10))) {
            return iA == -1 ? aVarValueAt.f19807c : arrayList.get(iA).f19812e;
        }
        return i10;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
    }
}
