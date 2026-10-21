package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Keys> f18662a = new ArrayList<>();

    public void add(Keys keys) {
        this.f18662a.add(keys);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<Keys> arrayList = this.f18662a;
        if (!arrayList.isEmpty()) {
            sb2.append("keyFrames:{\n");
            Iterator<Keys> it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
