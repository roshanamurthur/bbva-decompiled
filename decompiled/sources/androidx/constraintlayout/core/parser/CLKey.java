package androidx.constraintlayout.core.parser;

import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CLKey extends CLContainer {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final ArrayList<String> f18965s0;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f18965s0 = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add(TypedValues.TransitionType.NAME);
        arrayList.add("KeyFrames");
        arrayList.add(TypedValues.AttributesType.NAME);
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLKey(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(getName(), ((CLKey) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    public String getName() {
        return content();
    }

    public CLElement getValue() {
        if (this.f18962r0.size() > 0) {
            return this.f18962r0.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }

    public void set(CLElement cLElement) {
        if (this.f18962r0.size() > 0) {
            this.f18962r0.set(0, cLElement);
        } else {
            this.f18962r0.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        addIndent(sb2, i10);
        String strContent = content();
        if (this.f18962r0.size() <= 0) {
            return u.f(strContent, ": <> ");
        }
        sb2.append(strContent);
        sb2.append(": ");
        if (f18965s0.contains(strContent)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(this.f18962r0.get(0).toFormattedJSON(i10, i11 - 1));
        } else {
            String json = this.f18962r0.get(0).toJSON();
            if (json.length() + i10 < CLElement.sMaxLine) {
                sb2.append(json);
            } else {
                sb2.append(this.f18962r0.get(0).toFormattedJSON(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (this.f18962r0.size() <= 0) {
            return getDebugName() + content() + ": <> ";
        }
        return getDebugName() + content() + ": " + this.f18962r0.get(0).toJSON();
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }
}
