package com.veridas.camera.metrics;

import java.util.Iterator;
import java.util.LinkedList;
import vi.a;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultMeteringSessionCollection implements MeteringSessionCollection<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f66602a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList<a> f66603b = new LinkedList<>();

    public void addPictureMeasurement() {
        synchronized (this.f66602a) {
            try {
                Iterator<a> it = this.f66603b.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addPreviewMeasurement() {
        synchronized (this.f66602a) {
            try {
                Iterator<a> it = this.f66603b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSessionCollection
    public void destroy() {
        synchronized (this.f66602a) {
            try {
                Iterator<a> it = this.f66603b.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f66603b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void finishFocusMeasurement(boolean z10) {
        synchronized (this.f66602a) {
            try {
                Iterator<a> it = this.f66603b.iterator();
                while (it.hasNext()) {
                    it.next().c(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSessionCollection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f66602a) {
            zIsEmpty = this.f66603b.isEmpty();
        }
        return zIsEmpty;
    }

    public void startFocusMeasurement() {
        synchronized (this.f66602a) {
            try {
                Iterator<a> it = this.f66603b.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.veridas.camera.metrics.MeteringSessionCollection
    public a create() {
        a aVar;
        synchronized (this.f66602a) {
            aVar = new a(this);
            this.f66603b.push(aVar);
        }
        return aVar;
    }

    @Override // com.veridas.camera.metrics.MeteringSessionCollection
    public void remove(a aVar) {
        synchronized (this.f66602a) {
            this.f66603b.remove(aVar);
        }
    }
}
