package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Policy {

    @Expose
    public List<List<MatchCriteria>> accepted = null;

    @Expose
    public List<MatchCriteria> disallowed = null;

    public boolean isValid() {
        List<List<MatchCriteria>> list = this.accepted;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<List<MatchCriteria>> it = this.accepted.iterator();
        while (it.hasNext()) {
            Iterator<MatchCriteria> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (!it2.next().isValid()) {
                    return false;
                }
            }
        }
        List<MatchCriteria> list2 = this.disallowed;
        if (list2 == null || list2.isEmpty()) {
            return true;
        }
        Iterator<MatchCriteria> it3 = this.disallowed.iterator();
        while (it3.hasNext()) {
            if (!it3.next().isValid()) {
                return false;
            }
        }
        return true;
    }
}
