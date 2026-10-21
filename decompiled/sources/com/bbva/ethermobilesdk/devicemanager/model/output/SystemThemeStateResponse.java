package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SystemThemeStateResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "", "<init>", "()V", "Light", "Dark", "Undefined", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SystemThemeStateResponse {

    /* JADX INFO: compiled from: SystemThemeStateResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse$Dark;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dark extends SystemThemeStateResponse {

        @NotNull
        public static final Dark INSTANCE = new Dark();

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dark)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 56014401;
        }

        @NotNull
        public String toString() {
            return "Dark";
        }
    }

    /* JADX INFO: compiled from: SystemThemeStateResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse$Light;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Light extends SystemThemeStateResponse {

        @NotNull
        public static final Light INSTANCE = new Light();

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Light)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1744062379;
        }

        @NotNull
        public String toString() {
            return "Light";
        }
    }

    /* JADX INFO: compiled from: SystemThemeStateResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse$Undefined;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Undefined extends SystemThemeStateResponse {

        @NotNull
        public static final Undefined INSTANCE = new Undefined();

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Undefined)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -649387675;
        }

        @NotNull
        public String toString() {
            return "Undefined";
        }
    }
}
