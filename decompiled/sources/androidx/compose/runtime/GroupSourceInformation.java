package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR6\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010$j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "", "key", "", "sourceInformation", "dataOffset", "", "startGrouplessCall", "endGrouplessCall", "Landroidx/compose/runtime/SlotWriter;", "writer", "group", "reportGroup", "Landroidx/compose/runtime/SlotTable;", "table", "predecessor", "addGroupAfter", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroidx/compose/runtime/Anchor;", "anchor", "", "removeAnchor", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKey", "()I", "b", "Ljava/lang/String;", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "c", "getDataStartOffset", "dataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "e", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "f", "getDataEndOffset", "setDataEndOffset", "(I)V", "dataEndOffset", "<init>", "(ILjava/lang/String;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n1#2:4152\n831#3,8:4153\n821#3,7:4161\n93#4,2:4168\n33#4,4:4170\n95#4,2:4174\n38#4:4176\n97#4:4177\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n766#1:4153,8\n783#1:4161,7\n793#1:4168,2\n793#1:4170,4\n793#1:4174,2\n793#1:4176\n793#1:4177\n*E\n"})
public final class GroupSourceInformation {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String sourceInformation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int dataStartOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ArrayList<Object> groups;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int dataEndOffset;

    public GroupSourceInformation(int i10, @Nullable String str, int i11) {
        this.key = i10;
        this.sourceInformation = str;
        this.dataStartOffset = i11;
    }

    public final boolean a(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (Intrinsics.areEqual(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).a(anchor))) {
                return true;
            }
        }
        return false;
    }

    public final void addGroupAfter(@NotNull SlotWriter writer, int predecessor, int group) {
        Anchor anchorTryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i10 = 0;
        if (predecessor >= 0 && (anchorTryAnchor$runtime_release = writer.tryAnchor$runtime_release(predecessor)) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                if (!Intrinsics.areEqual(obj, anchorTryAnchor$runtime_release) && (!(obj instanceof GroupSourceInformation) || !((GroupSourceInformation) obj).a(anchorTryAnchor$runtime_release))) {
                    i10++;
                }
            }
            i10 = -1;
        }
        arrayList.add(i10, writer.anchor(group));
    }

    public final GroupSourceInformation b() {
        Object obj;
        GroupSourceInformation groupSourceInformationB;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                break;
            }
            size--;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (groupSourceInformationB = groupSourceInformation.b()) == null) ? this : groupSourceInformationB;
    }

    public final void close(int dataOffset) {
        this.closed = true;
        this.dataEndOffset = dataOffset;
    }

    public final void endGrouplessCall(int dataOffset) {
        b().close(dataOffset);
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @Nullable
    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final int getKey() {
        return this.key;
    }

    @Nullable
    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(@NotNull Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.areEqual(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(@NotNull SlotWriter writer, int group) {
        GroupSourceInformation groupSourceInformationB = b();
        Anchor anchor = writer.anchor(group);
        ArrayList<Object> arrayList = groupSourceInformationB.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        groupSourceInformationB.groups = arrayList;
        arrayList.add(anchor);
    }

    public final void setClosed(boolean z10) {
        this.closed = z10;
    }

    public final void setDataEndOffset(int i10) {
        this.dataEndOffset = i10;
    }

    public final void setGroups(@Nullable ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final void setSourceInformation(@Nullable String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int key, @NotNull String sourceInformation, int dataOffset) {
        GroupSourceInformation groupSourceInformationB = b();
        GroupSourceInformation groupSourceInformation = new GroupSourceInformation(key, sourceInformation, dataOffset);
        ArrayList<Object> arrayList = groupSourceInformationB.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        groupSourceInformationB.groups = arrayList;
        arrayList.add(groupSourceInformation);
    }

    public final void reportGroup(@NotNull SlotTable table, int group) {
        GroupSourceInformation groupSourceInformationB = b();
        Anchor anchor = table.anchor(group);
        ArrayList<Object> arrayList = groupSourceInformationB.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        groupSourceInformationB.groups = arrayList;
        arrayList.add(anchor);
    }
}
