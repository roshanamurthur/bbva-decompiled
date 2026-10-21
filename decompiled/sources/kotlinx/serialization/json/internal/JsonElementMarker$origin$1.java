package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @NotNull
    public final Boolean invoke(@NotNull SerialDescriptor p4, int i10) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).readIfAbsent(p4, i10));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
        return invoke(serialDescriptor, num.intValue());
    }
}
