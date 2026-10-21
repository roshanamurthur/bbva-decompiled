package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Modality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;
    public static final Modality ABSTRACT;

    @NotNull
    public static final Companion Companion;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;

    /* JADX INFO: compiled from: Modality.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Modality convertFromFlags(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return Modality.SEALED;
            }
            if (z11) {
                return Modality.ABSTRACT;
            }
            return z12 ? Modality.OPEN : Modality.FINAL;
        }
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        FINAL = modality;
        Modality modality2 = new Modality("SEALED", 1);
        SEALED = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        OPEN = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        ABSTRACT = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        $VALUES = modalityArr;
        $ENTRIES = EnumEntriesKt.enumEntries(modalityArr);
        Companion = new Companion(null);
    }

    public Modality() {
        throw null;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }
}
