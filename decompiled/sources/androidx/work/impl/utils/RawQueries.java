package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class RawQueries {
    public static void a(int i10, @NonNull StringBuilder sb2) {
        if (i10 <= 0) {
            return;
        }
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(",");
            sb2.append("?");
        }
    }

    @NonNull
    public static SupportSQLiteQuery workQueryToRawQuery(@NonNull WorkQuery workQuery) {
        String str;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        String str2 = " AND";
        if (states.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList2 = new ArrayList(states.size());
            Iterator<WorkInfo.State> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(it.next())));
            }
            sb2.append(" WHERE state IN (");
            a(arrayList2.size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        List<UUID> ids = workQuery.getIds();
        if (!ids.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(ids.size());
            Iterator<UUID> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb2.append(str);
            sb2.append(" id IN (");
            a(ids.size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List<String> tags = workQuery.getTags();
        if (tags.isEmpty()) {
            str2 = str;
        } else {
            sb2.append(str);
            sb2.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(tags.size(), sb2);
            sb2.append("))");
            arrayList.addAll(tags);
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        if (!uniqueWorkNames.isEmpty()) {
            sb2.append(str2);
            sb2.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(uniqueWorkNames.size(), sb2);
            sb2.append("))");
            arrayList.addAll(uniqueWorkNames);
        }
        sb2.append(ReplenishLogic.ID_SEPARATOR);
        return new SimpleSQLiteQuery(sb2.toString(), arrayList.toArray());
    }
}
