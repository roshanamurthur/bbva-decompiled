package wc;

import com.bumptech.glide.load.engine.prefill.PreFillType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PreFillQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<PreFillType, Integer> f94210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f94211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94213d;

    public b(HashMap map) {
        this.f94210a = map;
        this.f94211b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f94212c = num.intValue() + this.f94212c;
        }
    }
}
