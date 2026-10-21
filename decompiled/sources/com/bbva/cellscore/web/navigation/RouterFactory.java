package com.bbva.cellscore.web.navigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RouterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Route> f27192a;

    public RouterFactory(HashMap<String, Route> map) {
        HashMap<String, Route> map2 = new HashMap<>();
        this.f27192a = map2;
        map2.putAll(map);
    }

    public void add(@NonNull String str, @NonNull Route route) {
        this.f27192a.put(str, route);
    }

    @Nullable
    public Route get(@NonNull String str, String str2) {
        Route route = this.f27192a.get(str);
        return route == null ? this.f27192a.get(str2) : route;
    }
}
