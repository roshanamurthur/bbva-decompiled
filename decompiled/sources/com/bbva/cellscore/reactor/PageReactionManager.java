package com.bbva.cellscore.reactor;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.h0;
import com.bbva.cellscore.helper.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PageReactionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27038a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f27039b = new HashMap();

    public void add(@NonNull String str, @NonNull Supplier<PageReaction> supplier) {
        HashMap map = this.f27038a;
        if (map.containsKey(str)) {
            throw new RuntimeException(h0.b("A PageReaction with id:", str, " is already added"));
        }
        map.put(str, supplier);
    }

    public void addGlobal(@NonNull String str, @NonNull Supplier<GlobalReaction> supplier) {
        this.f27039b.put(str, supplier);
    }

    public boolean contains(String str) {
        return this.f27038a.containsKey(str);
    }

    public PageReaction get(String str) {
        Supplier supplier = (Supplier) this.f27038a.get(str);
        if (supplier == null) {
            return null;
        }
        return (PageReaction) supplier.get();
    }

    public Map<String, Supplier<GlobalReaction>> getGlobals() {
        return this.f27039b;
    }
}
