window.CellsBehaviors = window.CellsBehaviors || {};

window.CellsBehaviors.pageInAppCrmMixinMx = superClass => class extends superClass {

  static get properties() {
    return {
      _getInAppDataResolve: {
        type: Function
      },
      _getInAppDataReject: {
        type: Function
      },
      /**
      * assing type of
      * inAppCrmBasic or inAppCrmAdvanced
      */
      _inAppCrmPageShow: {
        type: String,
        value: ''
      },
      /**
      * flag profiling
      * for inAppCrm
      */
      inAppCrm: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Validate to show In App page
   */
  async _inAppCRMPageReady() {
    const show = await this.startInAppCrm();
    if (show && this.inAppCrm) {
      await this._checkInAppData();
    }
    return {
      ready: this._inAppCrmPageShow ? true : false,
      page: this._inAppCrmPageShow
    };
  }
  /**
   * Check local storage flag for inAppCrm to show inAppCrmBasic or inAppCrmAdvanced page
   */
  async startInAppCrm() {
    let inAppCrmShown = await this._getLocalStorageKeys([ 'inAppCrmFirst' ]);
    if (!inAppCrmShown?.inAppCrmFirst?.accessed) {
      this._setToLocalStorage('inAppCrmFirst', {accessed: true});
    }
    if (inAppCrmShown?.inAppCrmFirst?.accessed) {
      return true;
    }
    return false;
  }

  /**
   *  Check success status from service crm-informative-campaigns
   */
  async _checkInAppData() {
    let response = await this.__getInAppData().catch(err => null);
    const codeMessage = response?.[0].message?.messageType?.id || '';
    this._inAppCrmPageShow = {
      '0001': 'inAppCrmPage',
      '0002': 'inAppCrmAdvancedPage'
    } [codeMessage] || '';
  }

  getInAppDataResponse(value) {
    /* istanbul ignore else */
    if (this._getInAppDataResolve) {
      this._getInAppDataResolve(value);
      this.__getInAppDataClear();
    }
  }

  getInAppDataResponseError(e) {
    /* istanbul ignore else */
    if (this._getInAppDataReject) {
      this._getInAppDataReject(e);
      this.__getInAppDataClear();
    }
  }
  __getInAppData() {
    return new Promise((resolve, reject) => {

      setTimeout(() => {
        reject('timeout');
      }, 5000);

      this._getInAppDataResolve = resolve;
      this._getInAppDataReject = reject;
      this.__fireEvent('request-inapp-data');
    });
  }
  __getInAppDataClear() {
    this._getInAppDataResolve = null;
    this._getInAppDataReject = null;
  }

};