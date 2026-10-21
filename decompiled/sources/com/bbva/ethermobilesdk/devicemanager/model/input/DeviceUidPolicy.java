package com.bbva.ethermobilesdk.devicemanager.model.input;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceUidPolicy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy;", "", "<init>", "()V", "Default", "Short", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy$Default;", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy$Short;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceUidPolicy {

    /* JADX INFO: compiled from: DeviceUidPolicy.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy$Default;", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends DeviceUidPolicy {

        @NotNull
        public static final Default INSTANCE = new Default();

        public Default() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 74618393;
        }

        @NotNull
        public String toString() {
            return "Default";
        }
    }

    /* JADX INFO: compiled from: DeviceUidPolicy.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy$Short;", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUidPolicy;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Short extends DeviceUidPolicy {

        @NotNull
        public static final Short INSTANCE = new Short();

        public Short() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Short)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -893232556;
        }

        @NotNull
        public String toString() {
            return "Short";
        }
    }

    public DeviceUidPolicy() {
    }

    public /* synthetic */ DeviceUidPolicy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
