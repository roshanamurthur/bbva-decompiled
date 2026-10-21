package com.veridas.permissions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionStatus.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/veridas/permissions/PermissionStatus;", "", "()V", "Granted", "NotGranted", "Lcom/veridas/permissions/PermissionStatus$Granted;", "Lcom/veridas/permissions/PermissionStatus$NotGranted;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PermissionStatus {

    /* JADX INFO: compiled from: PermissionStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/veridas/permissions/PermissionStatus$Granted;", "Lcom/veridas/permissions/PermissionStatus;", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Granted extends PermissionStatus {

        @NotNull
        public static final Granted INSTANCE = new Granted();

        public Granted() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PermissionStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/veridas/permissions/PermissionStatus$NotGranted;", "Lcom/veridas/permissions/PermissionStatus;", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotGranted extends PermissionStatus {

        @NotNull
        public static final NotGranted INSTANCE = new NotGranted();

        public NotGranted() {
            super(null);
        }
    }

    public PermissionStatus() {
    }

    public /* synthetic */ PermissionStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
