package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.util.Vector;

/* JADX INFO: loaded from: classes9.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vector f66060a = new Vector();

    public void a(g gVar) {
        this.f66060a.addElement(gVar);
    }

    public g a(int i10) {
        return (g) this.f66060a.elementAt(i10);
    }

    public int a() {
        return this.f66060a.size();
    }
}
