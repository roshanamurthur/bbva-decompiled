package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class OneTimeListener implements EventListener {
    private final Module.OneTimeListenerBlock logicBlock;
    private boolean isCalled = false;
    private boolean isCancelled = false;
    private final Object mutex = new Object();

    public OneTimeListener(Module.OneTimeListenerBlock oneTimeListenerBlock) {
        this.logicBlock = oneTimeListenerBlock;
    }

    public void cancel() {
        synchronized (this.mutex) {
            this.isCancelled = true;
        }
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public EventSource getEventSource() {
        return null;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public EventType getEventType() {
        return null;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        synchronized (this.mutex) {
            try {
                if (!this.isCancelled) {
                    this.logicBlock.call(event);
                }
                this.isCalled = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isCalled() {
        boolean z10;
        synchronized (this.mutex) {
            z10 = this.isCalled;
        }
        return z10;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void onUnregistered() {
    }
}
