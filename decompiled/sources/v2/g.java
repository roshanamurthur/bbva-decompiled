package v2;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: EmojiExclusions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @NonNull
    @SuppressLint({"BanUncheckedReflection"})
    public static Set<int[]> a() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set<int[]> set = (Set) objInvoke;
            Iterator<int[]> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }
}
