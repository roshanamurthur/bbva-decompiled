package com.bumptech.glide.manager;

import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {

    public class a implements RequestManagerTreeNode {
        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @NonNull
        public final Set<RequestManager> getDescendants() {
            return Collections.emptySet();
        }
    }

    @Nullable
    @Deprecated
    public RequestManager getRequestManager() {
        return null;
    }

    @NonNull
    @Deprecated
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return new a();
    }

    @Deprecated
    public void setRequestManager(@Nullable RequestManager requestManager) {
    }
}
