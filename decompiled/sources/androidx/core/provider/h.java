package androidx.core.provider;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Consumer<i.a> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f20062p0;

    public h(String str) {
        this.f20062p0 = str;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(i.a aVar) {
        i.a aVar2 = aVar;
        synchronized (i.f20065c) {
            try {
                SimpleArrayMap<String, ArrayList<Consumer<i.a>>> simpleArrayMap = i.f20066d;
                ArrayList<Consumer<i.a>> arrayList = simpleArrayMap.get(this.f20062p0);
                if (arrayList == null) {
                    return;
                }
                simpleArrayMap.remove(this.f20062p0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
