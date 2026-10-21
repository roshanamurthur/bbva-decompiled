package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: KeylineStateList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f44236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f44237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f44238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f44239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f44240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f44241g;

    public c(@NonNull b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f44235a = bVar;
        this.f44236b = Collections.unmodifiableList(arrayList);
        this.f44237c = Collections.unmodifiableList(arrayList2);
        float f6 = ((b) androidx.appcompat.view.menu.b.b(arrayList, 1)).b().f44227a - bVar.b().f44227a;
        this.f44240f = f6;
        float f10 = bVar.d().f44227a - ((b) androidx.appcompat.view.menu.b.b(arrayList2, 1)).d().f44227a;
        this.f44241g = f10;
        this.f44238d = d(f6, arrayList, true);
        this.f44239e = d(f10, arrayList2, false);
    }

    public static float[] d(float f6, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = (b) arrayList.get(i11);
            b bVar2 = (b) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.b().f44227a - bVar.b().f44227a : bVar.d().f44227a - bVar2.d().f44227a) / f6);
            i10++;
        }
        return fArr;
    }

    public static float[] e(List<b> list, float f6, float[] fArr) {
        int size = list.size();
        float f10 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f11 = fArr[i10];
            if (f6 <= f11) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f10, f11, f6), i10 - 1, i10};
            }
            i10++;
            f10 = f11;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static b f(b bVar, int i10, int i11, float f6, int i12, int i13, float f10) {
        ArrayList arrayList = new ArrayList(bVar.f44215b);
        arrayList.add(i11, (b.C0197b) arrayList.remove(i10));
        b.a aVar = new b.a(bVar.f44214a, f10);
        float f11 = f6;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            b.C0197b c0197b = (b.C0197b) arrayList.get(i14);
            float f12 = c0197b.f44230d;
            aVar.b((f12 / 2.0f) + f11, c0197b.f44229c, f12, i14 >= i12 && i14 <= i13, c0197b.f44231e, c0197b.f44232f, 0.0f, 0.0f);
            f11 += c0197b.f44230d;
            i14++;
        }
        return aVar.d();
    }

    public static b g(b bVar, float f6, float f10, boolean z10, float f11) {
        int i10;
        List<b.C0197b> list = bVar.f44215b;
        ArrayList arrayList = new ArrayList(list);
        float f12 = bVar.f44214a;
        b.a aVar = new b.a(f12, f10);
        Iterator<b.C0197b> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().f44231e) {
                i11++;
            }
        }
        float size = f6 / (list.size() - i11);
        float f13 = z10 ? f6 : 0.0f;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            b.C0197b c0197b = (b.C0197b) arrayList.get(i12);
            if (c0197b.f44231e) {
                i10 = i12;
                aVar.b(c0197b.f44228b, c0197b.f44229c, c0197b.f44230d, false, true, c0197b.f44232f, 0.0f, 0.0f);
            } else {
                i10 = i12;
                boolean z11 = i10 >= bVar.f44216c && i10 <= bVar.f44217d;
                float f14 = c0197b.f44230d - size;
                float fB = CarouselStrategy.b(f14, f12, f11);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - c0197b.f44228b;
                aVar.b(f15, fB, f14, z11, false, c0197b.f44232f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i12 = i10 + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return (b) androidx.emoji2.text.flatbuffer.a.b(this.f44237c, 1);
    }

    public final b b(float f6, boolean z10, float f10, float f11) {
        float fLerp;
        List<b> list;
        float[] fArr;
        float f12 = this.f44240f;
        float f13 = f10 + f12;
        float f14 = this.f44241g;
        float f15 = f11 - f14;
        float f16 = c().a().f44233g;
        float f17 = a().c().f44234h;
        if (f12 == f16) {
            f13 += f16;
        }
        if (f14 == f17) {
            f15 -= f17;
        }
        if (f6 < f13) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f10, f13, f6);
            list = this.f44236b;
            fArr = this.f44238d;
        } else {
            if (f6 <= f15) {
                return this.f44235a;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f15, f11, f6);
            list = this.f44237c;
            fArr = this.f44239e;
        }
        if (z10) {
            float[] fArrE = e(list, fLerp, fArr);
            return fArrE[0] >= 0.5f ? list.get((int) fArrE[2]) : list.get((int) fArrE[1]);
        }
        float[] fArrE2 = e(list, fLerp, fArr);
        b bVar = list.get((int) fArrE2[1]);
        b bVar2 = list.get((int) fArrE2[2]);
        float f18 = fArrE2[0];
        if (bVar.f44214a != bVar2.f44214a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0197b> list2 = bVar.f44215b;
        int size = list2.size();
        List<b.C0197b> list3 = bVar2.f44215b;
        if (size != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b.C0197b c0197b = list2.get(i10);
            b.C0197b c0197b2 = list3.get(i10);
            arrayList.add(new b.C0197b(AnimationUtils.lerp(c0197b.f44227a, c0197b2.f44227a, f18), AnimationUtils.lerp(c0197b.f44228b, c0197b2.f44228b, f18), AnimationUtils.lerp(c0197b.f44229c, c0197b2.f44229c, f18), AnimationUtils.lerp(c0197b.f44230d, c0197b2.f44230d, f18), false, 0.0f, 0.0f, 0.0f));
        }
        return new b(bVar.f44214a, arrayList, AnimationUtils.lerp(bVar.f44216c, bVar2.f44216c, f18), AnimationUtils.lerp(bVar.f44217d, bVar2.f44217d, f18));
    }

    public final b c() {
        return (b) androidx.emoji2.text.flatbuffer.a.b(this.f44236b, 1);
    }
}
