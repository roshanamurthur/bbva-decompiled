package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceType;", "", "<init>", "()V", "Mobile", EmulatorApi.EMULATOR, "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DeviceType {

    /* JADX INFO: compiled from: DeviceType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceType$Emulator;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Emulator extends DeviceType {

        @NotNull
        public static final Emulator INSTANCE = new Emulator();

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Emulator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1710699176;
        }

        @NotNull
        public String toString() {
            return EmulatorApi.EMULATOR;
        }
    }

    /* JADX INFO: compiled from: DeviceType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceType$Mobile;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Mobile extends DeviceType {

        @NotNull
        public static final Mobile INSTANCE = new Mobile();

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mobile)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1246615797;
        }

        @NotNull
        public String toString() {
            return "Mobile";
        }
    }
}
