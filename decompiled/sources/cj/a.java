package cj;

import com.veridas.log.Logger;

/* JADX INFO: compiled from: AbstractLogger.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements Logger {
    @Override // com.veridas.log.Logger
    public void d(String str, String str2, Object... objArr) {
        d(str, String.format(str2, objArr));
    }

    @Override // com.veridas.log.Logger
    public void e(String str, String str2, Object... objArr) {
        e(str, String.format(str2, objArr));
    }

    @Override // com.veridas.log.Logger
    public void i(String str, String str2, Object... objArr) {
        i(str, String.format(str2, objArr));
    }

    @Override // com.veridas.log.Logger
    public void v(String str, String str2, Object... objArr) {
        v(str, String.format(str2, objArr));
    }

    @Override // com.veridas.log.Logger
    public void w(String str, String str2, Object... objArr) {
        w(str, String.format(str2, objArr));
    }

    @Override // com.veridas.log.Logger
    public void wtf(String str, String str2, Object... objArr) {
        wtf(str, String.format(str2, objArr));
    }
}
