package androidx.constraintlayout.core.dsl;

import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends Helper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Constraint.Side f18573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Ref> f18575c;

    public Barrier(String str) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)));
        this.f18573a = null;
        this.f18574b = Integer.MIN_VALUE;
        this.f18575c = new ArrayList<>();
    }

    public Barrier addReference(Ref ref) {
        this.f18575c.add(ref);
        this.configMap.put(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, referencesToString());
        return this;
    }

    public Constraint.Side getDirection() {
        return this.f18573a;
    }

    public int getMargin() {
        return this.f18574b;
    }

    public String referencesToString() {
        ArrayList<Ref> arrayList = this.f18575c;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        Iterator<Ref> it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    public void setDirection(Constraint.Side side) {
        this.f18573a = side;
        this.configMap.put("direction", Helper.sideMap.get(side));
    }

    public void setMargin(int i10) {
        this.f18574b = i10;
        this.configMap.put("margin", String.valueOf(i10));
    }

    public Barrier addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }

    public Barrier(String str, String str2) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)), str2);
        this.f18573a = null;
        this.f18574b = Integer.MIN_VALUE;
        ArrayList<Ref> arrayList = new ArrayList<>();
        this.f18575c = arrayList;
        Map<String, String> mapConvertConfigToMap = convertConfigToMap();
        this.configMap = mapConvertConfigToMap;
        if (mapConvertConfigToMap.containsKey(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE)) {
            Ref.addStringToReferences(this.configMap.get(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE), arrayList);
        }
    }
}
