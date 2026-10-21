package androidx.databinding;

/* JADX INFO: compiled from: BaseObservableField.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends BaseObservable {

    /* JADX INFO: renamed from: androidx.databinding.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseObservableField.java */
    public class C0076a extends Observable.OnPropertyChangedCallback {
        public C0076a() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public final void onPropertyChanged(Observable observable, int i10) {
            a.this.notifyChange();
        }
    }

    public a() {
    }

    public a(Observable... observableArr) {
        if (observableArr == null || observableArr.length == 0) {
            return;
        }
        C0076a c0076a = new C0076a();
        for (Observable observable : observableArr) {
            observable.addOnPropertyChangedCallback(c0076a);
        }
    }
}
