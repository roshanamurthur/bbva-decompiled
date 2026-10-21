package com.bbva.androidtoolkit.plugin.permission;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Permission> f26537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Permission> f26538b;

    public PermissionReport() {
        this.f26537a = new ArrayList();
        this.f26538b = new ArrayList();
    }

    public boolean areAllGranted() {
        return this.f26538b.isEmpty();
    }

    public List<Permission> getDenied() {
        return this.f26538b;
    }

    public List<Permission> getGranted() {
        return this.f26537a;
    }

    public boolean hasPermanentlyDeniedAnyPermission() {
        Iterator<Permission> it = this.f26538b.iterator();
        while (it.hasNext()) {
            if (it.next().isPermanentlyDenied()) {
                return true;
            }
        }
        return false;
    }

    public PermissionReport(List<Permission> list, List<Permission> list2) {
        this.f26537a = list;
        this.f26538b = list2;
    }
}
