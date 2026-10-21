package androidx.constraintlayout.core.dsl;

import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class VChain extends Chain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VAnchor f18707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VAnchor f18708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VAnchor f18709d;

    public class VAnchor extends Chain.Anchor {
        public VAnchor(VChain vChain, Constraint.VSide vSide) {
            super(Constraint.Side.valueOf(vSide.name()));
        }
    }

    public VChain(String str) {
        super(str);
        this.f18707b = new VAnchor(this, Constraint.VSide.TOP);
        this.f18708c = new VAnchor(this, Constraint.VSide.BOTTOM);
        this.f18709d = new VAnchor(this, Constraint.VSide.BASELINE);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.VERTICAL_CHAIN));
    }

    public VAnchor getBaseline() {
        return this.f18709d;
    }

    public VAnchor getBottom() {
        return this.f18708c;
    }

    public VAnchor getTop() {
        return this.f18707b;
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBottom(Constraint.VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToTop(Constraint.VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor, int i10) {
        linkToBaseline(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToBottom(Constraint.VAnchor vAnchor, int i10) {
        linkToBottom(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToTop(Constraint.VAnchor vAnchor, int i10) {
        linkToTop(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18709d;
        vAnchor2.f18578b = vAnchor;
        vAnchor2.f18579c = i10;
        vAnchor2.f18580d = i11;
        this.configMap.put("baseline", vAnchor2.toString());
    }

    public void linkToBottom(Constraint.VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18708c;
        vAnchor2.f18578b = vAnchor;
        vAnchor2.f18579c = i10;
        vAnchor2.f18580d = i11;
        this.configMap.put("bottom", vAnchor2.toString());
    }

    public void linkToTop(Constraint.VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18707b;
        vAnchor2.f18578b = vAnchor;
        vAnchor2.f18579c = i10;
        vAnchor2.f18580d = i11;
        this.configMap.put("top", vAnchor2.toString());
    }

    public VChain(String str, String str2) {
        super(str);
        this.f18707b = new VAnchor(this, Constraint.VSide.TOP);
        this.f18708c = new VAnchor(this, Constraint.VSide.BOTTOM);
        this.f18709d = new VAnchor(this, Constraint.VSide.BASELINE);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.VERTICAL_CHAIN));
        Map<String, String> mapConvertConfigToMap = convertConfigToMap();
        this.configMap = mapConvertConfigToMap;
        if (mapConvertConfigToMap.containsKey(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE)) {
            Ref.addStringToReferences(this.configMap.get(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE), this.references);
        }
    }
}
