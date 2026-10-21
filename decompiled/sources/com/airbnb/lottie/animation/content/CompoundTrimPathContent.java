package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CompoundTrimPathContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25694a = new ArrayList();

    public void apply(Path path) {
        ArrayList arrayList = this.f25694a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Utils.applyTrimPathIfNeeded(path, (TrimPathContent) arrayList.get(size));
        }
    }
}
