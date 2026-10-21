package com.bbva.component_devicemanager.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManager;", "", "()V", "DeviceType", "PasswordStrengthType", "StatusType", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceManager {

    @NotNull
    public static final DeviceManager INSTANCE = new DeviceManager();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DeviceManagerData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManager$DeviceType;", "", "WEB", "MOBILE", "TABLET", "OTHER", "EMULADOR", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final class DeviceType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeviceType[] $VALUES;
        public static final DeviceType EMULADOR;
        public static final DeviceType MOBILE;
        public static final DeviceType OTHER;
        public static final DeviceType TABLET;
        public static final DeviceType WEB;

        static {
            DeviceType deviceType = new DeviceType("WEB", 0);
            WEB = deviceType;
            DeviceType deviceType2 = new DeviceType("MOBILE", 1);
            MOBILE = deviceType2;
            DeviceType deviceType3 = new DeviceType("TABLET", 2);
            TABLET = deviceType3;
            DeviceType deviceType4 = new DeviceType("OTHER", 3);
            OTHER = deviceType4;
            DeviceType deviceType5 = new DeviceType("EMULADOR", 4);
            EMULADOR = deviceType5;
            DeviceType[] deviceTypeArr = {deviceType, deviceType2, deviceType3, deviceType4, deviceType5};
            $VALUES = deviceTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(deviceTypeArr);
        }

        public DeviceType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<DeviceType> getEntries() {
            return $ENTRIES;
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DeviceManagerData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManager$PasswordStrengthType;", "", "LOW", "MEDIUM", "HIGH", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final class PasswordStrengthType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PasswordStrengthType[] $VALUES;
        public static final PasswordStrengthType HIGH;
        public static final PasswordStrengthType LOW;
        public static final PasswordStrengthType MEDIUM;

        static {
            PasswordStrengthType passwordStrengthType = new PasswordStrengthType("LOW", 0);
            LOW = passwordStrengthType;
            PasswordStrengthType passwordStrengthType2 = new PasswordStrengthType("MEDIUM", 1);
            MEDIUM = passwordStrengthType2;
            PasswordStrengthType passwordStrengthType3 = new PasswordStrengthType("HIGH", 2);
            HIGH = passwordStrengthType3;
            PasswordStrengthType[] passwordStrengthTypeArr = {passwordStrengthType, passwordStrengthType2, passwordStrengthType3};
            $VALUES = passwordStrengthTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(passwordStrengthTypeArr);
        }

        public PasswordStrengthType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<PasswordStrengthType> getEntries() {
            return $ENTRIES;
        }

        public static PasswordStrengthType valueOf(String str) {
            return (PasswordStrengthType) Enum.valueOf(PasswordStrengthType.class, str);
        }

        public static PasswordStrengthType[] values() {
            return (PasswordStrengthType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DeviceManagerData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManager$StatusType;", "", "ACTIVE", "INACTIVE", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final class StatusType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusType[] $VALUES;
        public static final StatusType ACTIVE;
        public static final StatusType INACTIVE;

        static {
            StatusType statusType = new StatusType("ACTIVE", 0);
            ACTIVE = statusType;
            StatusType statusType2 = new StatusType("INACTIVE", 1);
            INACTIVE = statusType2;
            StatusType[] statusTypeArr = {statusType, statusType2};
            $VALUES = statusTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(statusTypeArr);
        }

        public StatusType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<StatusType> getEntries() {
            return $ENTRIES;
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) $VALUES.clone();
        }
    }
}
