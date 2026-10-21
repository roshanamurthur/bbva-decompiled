package ih;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BarcodeValue.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f69685a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f69685a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.toIntArray(arrayList);
    }

    public final void b(int i10) {
        HashMap map = this.f69685a;
        Integer num = (Integer) map.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        map.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
