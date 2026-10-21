package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kg.a;
import kg.c;

/* JADX INFO: loaded from: classes10.dex */
public class GlobalLibraryVersionRegistrar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile GlobalLibraryVersionRegistrar f48737b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f48738a = new HashSet();

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = f48737b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = f48737b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        f48737b = globalLibraryVersionRegistrar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    public final Set<c> a() {
        Set<c> setUnmodifiableSet;
        synchronized (this.f48738a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f48738a);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f48738a) {
            this.f48738a.add(new a(str, str2));
        }
    }
}
