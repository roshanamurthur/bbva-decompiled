package kotlin.collections.builders;

import androidx.collection.g;
import bk.d;
import bk.v;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "collection", "", LogKeysKt.TAG, "<init>", "(Ljava/util/Collection;I)V", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class SerializedCollection implements Externalizable {
    public static final int tagList = 0;
    public static final int tagSet = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Collection<?> f79546p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f79547q0;

    public SerializedCollection(@NotNull Collection<?> collection, int i10) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f79546p0 = collection;
        this.f79547q0 = i10;
    }

    private final Object readResolve() {
        return this.f79546p0;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws IOException {
        List listBuild;
        Intrinsics.checkNotNullParameter(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException(g.a("Unsupported flags value: ", b10, '.'));
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(g.a("Illegal size value: ", i11, '.'));
        }
        int i12 = 0;
        if (i10 == 0) {
            List listCreateListBuilder = d.createListBuilder(i11);
            while (i12 < i11) {
                listCreateListBuilder.add(input.readObject());
                i12++;
            }
            listBuild = d.build(listCreateListBuilder);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException(g.a("Unsupported collection type tag: ", i10, '.'));
            }
            Set setCreateSetBuilder = v.createSetBuilder(i11);
            while (i12 < i11) {
                setCreateSetBuilder.add(input.readObject());
                i12++;
            }
            listBuild = v.build(setCreateSetBuilder);
        }
        this.f79546p0 = listBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f79547q0);
        output.writeInt(this.f79546p0.size());
        Iterator<?> it = this.f79546p0.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.emptyList(), 0);
    }
}
