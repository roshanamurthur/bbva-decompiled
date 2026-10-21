package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {
    public static final String TAG = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19736b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19737c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f19738d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<ConstraintSet> f19739e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintsChangedListener f19740f = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f19742b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConstraintSet f19744d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f19743c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.f19741a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19741a);
                } else if (index == R.styleable.State_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19743c);
                    this.f19743c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if (PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f19744d = constraintSet;
                        constraintSet.clone(context, resourceId);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int a(float f6, float f10) {
            int i10 = 0;
            while (true) {
                ArrayList<b> arrayList = this.f19742b;
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
        public final float f19745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f19747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ConstraintSet f19750f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f19745a = Float.NaN;
            this.f19746b = Float.NaN;
            this.f19747c = Float.NaN;
            this.f19748d = Float.NaN;
            this.f19749e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19749e);
                    this.f19749e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if (PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f19750f = constraintSet;
                        constraintSet.clone(context, resourceId);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f19748d = typedArrayObtainStyledAttributes.getDimension(index, this.f19748d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f19746b = typedArrayObtainStyledAttributes.getDimension(index, this.f19746b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f19747c = typedArrayObtainStyledAttributes.getDimension(index, this.f19747c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f19745a = typedArrayObtainStyledAttributes.getDimension(index, this.f19745a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f6, float f10) {
            float f11 = this.f19745a;
            if (!Float.isNaN(f11) && f6 < f11) {
                return false;
            }
            float f12 = this.f19746b;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f19747c;
            if (!Float.isNaN(f13) && f6 > f13) {
                return false;
            }
            float f14 = this.f19748d;
            return Float.isNaN(f14) || f10 <= f14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i10) {
        a aVar = null;
        this.f19735a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        a aVar2 = new a(context, xml);
                        this.f19738d.put(aVar2.f19741a, aVar2);
                        aVar = aVar2;
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.f19742b.add(bVar);
                        }
                    } else if (b10 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                constraintSet.load(context, xmlResourceParser);
                this.f19739e.put(identifier, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i10, float f6, float f10) {
        int i11 = this.f19736b;
        if (i11 != i10) {
            return true;
        }
        SparseArray<a> sparseArray = this.f19738d;
        a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
        int i12 = this.f19737c;
        return (i12 == -1 || !aVarValueAt.f19742b.get(i12).a(f6, f10)) && this.f19737c != aVarValueAt.a(f6, f10);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.f19740f = constraintsChangedListener;
    }

    public void updateConstraints(int i10, float f6, float f10) {
        int iA;
        int i11 = this.f19736b;
        ConstraintLayout constraintLayout = this.f19735a;
        SparseArray<a> sparseArray = this.f19738d;
        if (i11 != i10) {
            this.f19736b = i10;
            a aVar = sparseArray.get(i10);
            int iA2 = aVar.a(f6, f10);
            ArrayList<b> arrayList = aVar.f19742b;
            ConstraintSet constraintSet = iA2 == -1 ? aVar.f19744d : arrayList.get(iA2).f19750f;
            int i12 = iA2 == -1 ? aVar.f19743c : arrayList.get(iA2).f19749e;
            if (constraintSet == null) {
                return;
            }
            this.f19737c = iA2;
            ConstraintsChangedListener constraintsChangedListener = this.f19740f;
            if (constraintsChangedListener != null) {
                constraintsChangedListener.preLayoutChange(i10, i12);
            }
            constraintSet.applyTo(constraintLayout);
            ConstraintsChangedListener constraintsChangedListener2 = this.f19740f;
            if (constraintsChangedListener2 != null) {
                constraintsChangedListener2.postLayoutChange(i10, i12);
                return;
            }
            return;
        }
        a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
        int i13 = this.f19737c;
        if ((i13 == -1 || !aVarValueAt.f19742b.get(i13).a(f6, f10)) && this.f19737c != (iA = aVarValueAt.a(f6, f10))) {
            ArrayList<b> arrayList2 = aVarValueAt.f19742b;
            ConstraintSet constraintSet2 = iA == -1 ? null : arrayList2.get(iA).f19750f;
            int i14 = iA == -1 ? aVarValueAt.f19743c : arrayList2.get(iA).f19749e;
            if (constraintSet2 == null) {
                return;
            }
            this.f19737c = iA;
            ConstraintsChangedListener constraintsChangedListener3 = this.f19740f;
            if (constraintsChangedListener3 != null) {
                constraintsChangedListener3.preLayoutChange(-1, i14);
            }
            constraintSet2.applyTo(constraintLayout);
            ConstraintsChangedListener constraintsChangedListener4 = this.f19740f;
            if (constraintsChangedListener4 != null) {
                constraintsChangedListener4.postLayoutChange(-1, i14);
            }
        }
    }
}
