package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class RenderOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.r f38936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreserveAspectRatio f38937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SVG.b f38939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SVG.b f38941f;

    public RenderOptions() {
        this.f38936a = null;
        this.f38937b = null;
        this.f38938c = null;
        this.f38939d = null;
        this.f38940e = null;
        this.f38941f = null;
    }

    public static RenderOptions create() {
        return new RenderOptions();
    }

    public RenderOptions css(String str) {
        this.f38936a = new a(a.f.screen, a.u.RenderOptions).c(str);
        return this;
    }

    public boolean hasCss() {
        ArrayList arrayList;
        a.r rVar = this.f38936a;
        return (rVar == null || (arrayList = rVar.f39124a) == null || arrayList.size() <= 0) ? false : true;
    }

    public boolean hasPreserveAspectRatio() {
        return this.f38937b != null;
    }

    public boolean hasTarget() {
        return this.f38938c != null;
    }

    public boolean hasView() {
        return this.f38940e != null;
    }

    public boolean hasViewBox() {
        return this.f38939d != null;
    }

    public boolean hasViewPort() {
        return this.f38941f != null;
    }

    public RenderOptions preserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        this.f38937b = preserveAspectRatio;
        return this;
    }

    public RenderOptions target(String str) {
        this.f38938c = str;
        return this;
    }

    public RenderOptions view(String str) {
        this.f38940e = str;
        return this;
    }

    public RenderOptions viewBox(float f6, float f10, float f11, float f12) {
        this.f38939d = new SVG.b(f6, f10, f11, f12);
        return this;
    }

    public RenderOptions viewPort(float f6, float f10, float f11, float f12) {
        this.f38941f = new SVG.b(f6, f10, f11, f12);
        return this;
    }

    public RenderOptions(RenderOptions renderOptions) {
        this.f38936a = null;
        this.f38937b = null;
        this.f38938c = null;
        this.f38939d = null;
        this.f38940e = null;
        this.f38941f = null;
        if (renderOptions == null) {
            return;
        }
        this.f38936a = renderOptions.f38936a;
        this.f38937b = renderOptions.f38937b;
        this.f38939d = renderOptions.f38939d;
        this.f38940e = renderOptions.f38940e;
        this.f38941f = renderOptions.f38941f;
    }
}
