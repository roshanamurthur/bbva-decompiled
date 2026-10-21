package kotlin.collections.builders;

import androidx.appcompat.widget.g0;
import androidx.collection.g;
import bk.p;
import bk.q;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "map", "<init>", "(Ljava/util/Map;)V", "()V", "q0", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Map<?, ?> f79549p0;

    public SerializedMap(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f79549p0 = map;
    }

    private final Object readResolve() {
        return this.f79549p0;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException(g0.c("Unsupported flags value: ", b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(g.a("Illegal size value: ", i10, '.'));
        }
        Map mapCreateMapBuilder = p.createMapBuilder(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapCreateMapBuilder.put(input.readObject(), input.readObject());
        }
        this.f79549p0 = p.build(mapCreateMapBuilder);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.f79549p0.size());
        for (Map.Entry<?, ?> entry : this.f79549p0.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(q.emptyMap());
    }
}
