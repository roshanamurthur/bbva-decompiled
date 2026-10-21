package com.veridas.lib.entities.resources.mrz;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MrzType.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/mrz/MrzType;", "", "Companion", "TYPE_1", "TYPE_2", "TYPE_3", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final class MrzType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MrzType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final MrzType TYPE_1;
    public static final MrzType TYPE_2;
    public static final MrzType TYPE_3;

    /* JADX INFO: compiled from: MrzType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/mrz/MrzType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/mrz/MrzType;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MrzType> serializer() {
            return (KSerializer) MrzType.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: MrzType.kt */
    public static final class a extends Lambda implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f67216p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return EnumsKt.createSimpleEnumSerializer("com.veridas.lib.entities.resources.mrz.MrzType", MrzType.values());
        }
    }

    static {
        MrzType mrzType = new MrzType("TYPE_1", 0);
        TYPE_1 = mrzType;
        MrzType mrzType2 = new MrzType("TYPE_2", 1);
        TYPE_2 = mrzType2;
        MrzType mrzType3 = new MrzType("TYPE_3", 2);
        TYPE_3 = mrzType3;
        MrzType[] mrzTypeArr = {mrzType, mrzType2, mrzType3};
        $VALUES = mrzTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(mrzTypeArr);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f67216p0);
    }

    public MrzType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<MrzType> getEntries() {
        return $ENTRIES;
    }

    public static MrzType valueOf(String str) {
        return (MrzType) Enum.valueOf(MrzType.class, str);
    }

    public static MrzType[] values() {
        return (MrzType[]) $VALUES.clone();
    }
}
