package androidx.constraintlayout.core.dsl;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HChain extends Chain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HAnchor f18618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HAnchor f18619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HAnchor f18620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HAnchor f18621e;

    public class HAnchor extends Chain.Anchor {
        public HAnchor(HChain hChain, Constraint.HSide hSide) {
            super(Constraint.Side.valueOf(hSide.name()));
        }
    }

    public HChain(String str) {
        super(str);
        this.f18618b = new HAnchor(this, Constraint.HSide.LEFT);
        this.f18619c = new HAnchor(this, Constraint.HSide.RIGHT);
        this.f18620d = new HAnchor(this, Constraint.HSide.START);
        this.f18621e = new HAnchor(this, Constraint.HSide.END);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
    }

    public HAnchor getEnd() {
        return this.f18621e;
    }

    public HAnchor getLeft() {
        return this.f18618b;
    }

    public HAnchor getRight() {
        return this.f18619c;
    }

    public HAnchor getStart() {
        return this.f18620d;
    }

    public void linkToEnd(Constraint.HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(Constraint.HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(Constraint.HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(Constraint.HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i10) {
        linkToEnd(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i10) {
        linkToLeft(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i10) {
        linkToRight(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i10) {
        linkToStart(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18621e;
        hAnchor2.f18578b = hAnchor;
        hAnchor2.f18579c = i10;
        hAnchor2.f18580d = i11;
        this.configMap.put("end", hAnchor2.toString());
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18618b;
        hAnchor2.f18578b = hAnchor;
        hAnchor2.f18579c = i10;
        hAnchor2.f18580d = i11;
        this.configMap.put(Parameters.DIRECTION.LEFT, hAnchor2.toString());
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18619c;
        hAnchor2.f18578b = hAnchor;
        hAnchor2.f18579c = i10;
        hAnchor2.f18580d = i11;
        this.configMap.put(Parameters.DIRECTION.RIGHT, hAnchor2.toString());
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18620d;
        hAnchor2.f18578b = hAnchor;
        hAnchor2.f18579c = i10;
        hAnchor2.f18580d = i11;
        this.configMap.put(EventDataKeys.Lifecycle.LIFECYCLE_START, hAnchor2.toString());
    }

    public HChain(String str, String str2) {
        super(str);
        this.f18618b = new HAnchor(this, Constraint.HSide.LEFT);
        this.f18619c = new HAnchor(this, Constraint.HSide.RIGHT);
        this.f18620d = new HAnchor(this, Constraint.HSide.START);
        this.f18621e = new HAnchor(this, Constraint.HSide.END);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
        Map<String, String> mapConvertConfigToMap = convertConfigToMap();
        this.configMap = mapConvertConfigToMap;
        if (mapConvertConfigToMap.containsKey(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE)) {
            Ref.addStringToReferences(this.configMap.get(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE), this.references);
        }
    }
}
