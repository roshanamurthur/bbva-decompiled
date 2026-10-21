package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FontCharacter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ShapeGroup> f25954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f25955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f25956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25958e;

    public FontCharacter(List<ShapeGroup> list, char c10, double d2, double d3, String str, String str2) {
        this.f25954a = list;
        this.f25955b = c10;
        this.f25956c = d3;
        this.f25957d = str;
        this.f25958e = str2;
    }

    public static int hashFor(char c10, String str, String str2) {
        return str2.hashCode() + n1.c(str, c10 * 31, 31);
    }

    public List<ShapeGroup> getShapes() {
        return this.f25954a;
    }

    public double getWidth() {
        return this.f25956c;
    }

    public int hashCode() {
        return hashFor(this.f25955b, this.f25958e, this.f25957d);
    }
}
