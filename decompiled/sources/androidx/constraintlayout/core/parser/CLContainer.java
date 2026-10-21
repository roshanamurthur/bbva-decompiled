package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CLContainer extends CLElement {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList<CLElement> f18962r0;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.f18962r0 = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.f18962r0.add(cLElement);
    }

    public void clear() {
        this.f18962r0.clear();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.f18962r0.equals(((CLContainer) obj).f18962r0);
        }
        return false;
    }

    public CLElement get(String str) throws CLParsingException {
        Iterator<CLElement> it = this.f18962r0.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException(h0.b("no element for key <", str, ">"), this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        StringBuilder sbD = ci.a.d("no array found for key <", str, ">, found [");
        sbD.append(cLElement.getStrClass());
        sbD.append("] : ");
        sbD.append(cLElement);
        throw new CLParsingException(sbD.toString(), this);
    }

    public CLArray getArrayOrCreate(String str) {
        CLArray arrayOrNull = getArrayOrNull(str);
        if (arrayOrNull != null) {
            return arrayOrNull;
        }
        CLArray cLArray = new CLArray(new char[0]);
        put(str, cLArray);
        return cLArray;
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        StringBuilder sbD = ci.a.d("no boolean found for key <", str, ">, found [");
        sbD.append(cLElement.getStrClass());
        sbD.append("] : ");
        sbD.append(cLElement);
        throw new CLParsingException(sbD.toString(), this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        StringBuilder sbD = ci.a.d("no float found for key <", str, ">, found [");
        sbD.append(cLElement.getStrClass());
        sbD.append("] : ");
        sbD.append(cLElement);
        throw new CLParsingException(sbD.toString(), this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        StringBuilder sbD = ci.a.d("no int found for key <", str, ">, found [");
        sbD.append(cLElement.getStrClass());
        sbD.append("] : ");
        sbD.append(cLElement);
        throw new CLParsingException(sbD.toString(), this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        StringBuilder sbD = ci.a.d("no object found for key <", str, ">, found [");
        sbD.append(cLElement.getStrClass());
        sbD.append("] : ");
        sbD.append(cLElement);
        throw new CLParsingException(sbD.toString(), this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        Iterator<CLElement> it = this.f18962r0.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        StringBuilder sbC = a.c("no string found for key <", str, ">, found [", cLElement != null ? cLElement.getStrClass() : null, "] : ");
        sbC.append(cLElement);
        throw new CLParsingException(sbC.toString(), this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        for (CLElement cLElement : this.f18962r0) {
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.f18962r0, Integer.valueOf(super.hashCode()));
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (CLElement cLElement : this.f18962r0) {
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        Iterator<CLElement> it = this.f18962r0.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.f18962r0.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f6) {
        put(str, new CLNumber(f6));
    }

    public void putString(String str, String str2) {
        CLString cLString = new CLString(str2.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str2.length() - 1);
        put(str, cLString);
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        for (CLElement cLElement : this.f18962r0) {
            if (((CLKey) cLElement).content().equals(str)) {
                arrayList.add(cLElement);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f18962r0.remove((CLElement) it.next());
        }
    }

    public int size() {
        return this.f18962r0.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (CLElement cLElement : this.f18962r0) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* JADX INFO: renamed from: clone */
    public CLContainer mo4633clone() {
        CLContainer cLContainer = (CLContainer) super.mo4633clone();
        ArrayList<CLElement> arrayList = new ArrayList<>(this.f18962r0.size());
        Iterator<CLElement> it = this.f18962r0.iterator();
        while (it.hasNext()) {
            CLElement cLElementMo4633clone = it.next().mo4633clone();
            cLElementMo4633clone.setContainer(cLContainer);
            arrayList.add(cLElementMo4633clone);
        }
        cLContainer.f18962r0 = arrayList;
        return cLContainer;
    }

    public String getStringOrNull(int i10) {
        CLElement orNull = getOrNull(i10);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public CLElement getOrNull(int i10) {
        if (i10 < 0 || i10 >= this.f18962r0.size()) {
            return null;
        }
        return this.f18962r0.get(i10);
    }

    public float getFloat(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException(g0.c("no float at index ", i10), this);
    }

    public int getInt(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException(g0.c("no int at index ", i10), this);
    }

    public CLArray getArray(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException(g0.c("no array at index ", i10), this);
    }

    public boolean getBoolean(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException(g0.c("no boolean at index ", i10), this);
    }

    public CLObject getObject(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException(g0.c("no object at index ", i10), this);
    }

    public CLElement get(int i10) throws CLParsingException {
        if (i10 >= 0 && i10 < this.f18962r0.size()) {
            return this.f18962r0.get(i10);
        }
        throw new CLParsingException(g0.c("no element at index ", i10), this);
    }

    public String getString(int i10) throws CLParsingException {
        CLElement cLElement = get(i10);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException(g0.c("no string at index ", i10), this);
    }
}
