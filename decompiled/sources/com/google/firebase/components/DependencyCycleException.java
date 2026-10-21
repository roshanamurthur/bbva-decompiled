package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Component<?>> f47676p0;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f47676p0 = list;
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.f47676p0;
    }
}
