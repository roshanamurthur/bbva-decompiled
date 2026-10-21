package com.bbva.cellscore.helper;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

/* JADX INFO: loaded from: classes2.dex */
public class RxHelper {
    public static <T> T getSubjectBuffer(Subject<T> subject) {
        if (subject instanceof ReplaySubject) {
            return (T) ((ReplaySubject) subject).getValue();
        }
        if (subject instanceof BehaviorSubject) {
            return (T) ((BehaviorSubject) subject).getValue();
        }
        return null;
    }
}
