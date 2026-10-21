package zc;

import androidx.annotation.NonNull;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: EmptyRequestManagerTreeNode.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements RequestManagerTreeNode {
    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    @NonNull
    public final Set<RequestManager> getDescendants() {
        return Collections.emptySet();
    }
}
