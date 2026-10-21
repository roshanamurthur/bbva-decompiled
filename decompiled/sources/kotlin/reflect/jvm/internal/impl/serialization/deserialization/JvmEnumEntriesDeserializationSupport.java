package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumEntriesDeserializationSupport.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmEnumEntriesDeserializationSupport implements EnumEntriesDeserializationSupport {

    @NotNull
    public static final JvmEnumEntriesDeserializationSupport INSTANCE = new JvmEnumEntriesDeserializationSupport();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
    @NotNull
    public Boolean canSynthesizeEnumEntries() {
        return Boolean.TRUE;
    }
}
