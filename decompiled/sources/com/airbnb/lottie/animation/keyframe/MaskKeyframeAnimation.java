package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MaskKeyframeAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Mask> f25853c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f25853c = list;
        this.f25851a = new ArrayList(list.size());
        this.f25852b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f25851a.add(list.get(i10).getMaskPath().createAnimation());
            this.f25852b.add(list.get(i10).getOpacity().createAnimation());
        }
    }

    public List<BaseKeyframeAnimation<ShapeData, Path>> getMaskAnimations() {
        return this.f25851a;
    }

    public List<Mask> getMasks() {
        return this.f25853c;
    }

    public List<BaseKeyframeAnimation<Integer, Integer>> getOpacityAnimations() {
        return this.f25852b;
    }
}
