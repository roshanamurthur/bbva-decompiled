package com.google.firebase.platforminfo;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kg.b;
import kg.c;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobalLibraryVersionRegistrar f48736b;

    public DefaultUserAgentPublisher(Set<c> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f48735a = a(set);
        this.f48736b = globalLibraryVersionRegistrar;
    }

    public static String a(Set<c> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<c> it = set.iterator();
        while (it.hasNext()) {
            c next = it.next();
            sb2.append(next.a());
            sb2.append(JsonPointer.SEPARATOR);
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf((Class<?>) c.class)).factory(new b()).build();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        Set setUnmodifiableSet;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.f48736b;
        synchronized (globalLibraryVersionRegistrar.f48738a) {
            setUnmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f48738a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f48735a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + a(globalLibraryVersionRegistrar.a());
    }
}
