package com.google.firebase.components;

import b2.a;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new a(6);

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
